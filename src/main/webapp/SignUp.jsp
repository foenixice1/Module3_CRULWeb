<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="author" content="Kodinger">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>My Login Page &mdash; Bootstrap 4 Login Page Snippet</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="css/my-login.css">
</head>
<body class="my-login-page">
<section class="h-100">
    <div class="container h-100">
        <div class="row justify-content-md-center h-100">
            <div class="card-wrapper">
                <div class="brand">
                    <img src="https://i.pinimg.com/280x280_RS/8c/c7/cf/8cc7cf8460083733c6e80bcdc42aeeff.jpg" alt="bootstrap 4 login page">
                </div>
                <div class="card fat">
                    <div class="card-body">
                        <h4 class="card-title">Register</h4>
                        <form action="/?action=create" method="post" class="my-login-validation" novalidate="">
                            <div class="form-group">
                                <label for="name">ID</label>
                                <input id="id" type="text" class="form-control" name="id" required autofocus>
                                <div class="invalid-feedback">
                                    What's your name?
                                </div>

                            <div class="form-group">
                                <label for="name">User</label>
                                <input id="name" type="text" class="form-control" name="use" required autofocus>
                                <div class="invalid-feedback">
                                    What's your name?
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="email">E-Mail Address</label>
                                <input id="email" type="email" class="form-control" name="gmail" required>
                                <div class="invalid-feedback">
                                    Your email is invalid
                                </div>
                            </div>

                            <div class="form-group">
                                <label for="password">Password</label>
                                <input id="password" type="password" class="form-control" name="passWord" required data-eye>
                                <div class="invalid-feedback">
                                    Password is required
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="custom-checkbox custom-control">
                                    <input type="checkbox" name="agree" id="agree" class="custom-control-input" required="">
                                    <label for="agree" class="custom-control-label">I agree to the <a href="https://www.youtube.com/watch?v=AJc9Eymi9J0">Terms and Conditions</a></label>
                                    <div class="invalid-feedback">
                                        You must agree with our Terms and Conditions
                                    </div>
                                </div>
                            </div>

                            <div class="form-group m-0">
                                <button type="submit" class="btn btn-primary btn-block">
                                    Register
                                </button>
                            </div>
                            <div class="mt-4 text-center">
                                Already have an account? <a href="login.jsp">Login</a>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
</body>
</html>