import models.Account;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;


@WebServlet(urlPatterns = {"/"})
public class Product extends HttpServlet {
    ArrayList<Account> list = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        list.add(new Account("1", "admin", "admin", "admin@gmail.com"));
        list.add(new Account("2", "admin1", "admin", "admin1@gmail.com"));
        list.add(new Account("3", "admin2", "admin", "admin2@gmail.com"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        RequestDispatcher requestDispatcher;
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                resp.sendRedirect("SignUp.jsp");
                break;
            case "delete":
                int indexDelete = Integer.parseInt(req.getParameter("index"));
                list.remove(indexDelete);
                req.setAttribute("listAccount", list);
                requestDispatcher = req.getRequestDispatcher("/ManageAccount.jsp");
                requestDispatcher.forward(req, resp);
                break;
            case "edit":
                int indexEdit = Integer.parseInt(req.getParameter("index"));
                Account account = list.get(indexEdit);
                req.setAttribute("list", account);
                requestDispatcher = req.getRequestDispatcher("editAccount.jsp");
                requestDispatcher.forward(req, resp);
                break;
            default:
                req.setAttribute("listAccount", list);
                requestDispatcher = req.getRequestDispatcher("/login.jsp");
                requestDispatcher.forward(req, resp);

        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        check đăng nhập
        String action = req.getParameter("action");
        RequestDispatcher requestDispatcher;
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "edit":
                String index = req.getParameter("index");
                String id1 = req.getParameter("id");
                String use1 = req.getParameter("use");
                String passWord1 = req.getParameter("passWord");
                String gmail1 = req.getParameter("gmail");
                list.set(Integer.parseInt(index), new Account(id1, use1, passWord1, gmail1));
                req.setAttribute("listAccount", list);
                requestDispatcher = req.getRequestDispatcher("/ManageAccount.jsp");
                requestDispatcher.forward(req, resp);
                break;
            case "create":
                String id = req.getParameter("id");
                String use = req.getParameter("use");
                String passWord = req.getParameter("passWord");
                String gmail = req.getParameter("gmail");
                list.add(new Account(id, use, passWord, gmail));
                req.setAttribute("listAccount", list);
                requestDispatcher = req.getRequestDispatcher("/ManageAccount.jsp");
                requestDispatcher.forward(req, resp);
                break;
            case "login":
                boolean check = false;
                String user = req.getParameter("use");
                String password2 = req.getParameter("passWord");
//                duyệt mảng keierm tra giá trị của use và pass
                for (Account account : list) {
                    if (account.getUse().equals(user) && account.getPassWord().equals(password2)) {
                        check = true;
                        break;
                    }
                }
//                đúng thì vào quản lý tài khoản sai vào login
                if (check) {
                    req.setAttribute("listAccount", list);
                    requestDispatcher = req.getRequestDispatcher("/ManageAccount.jsp");
                    requestDispatcher.forward(req, resp);
                } else {
                    resp.sendRedirect("/");
                }
                break;
        }
    }
}

