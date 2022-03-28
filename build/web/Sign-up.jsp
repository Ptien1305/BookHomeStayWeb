<%-- 
    Document   : Sign-up
    Created on : Oct 27, 2021, 3:26:01 PM
    Author     : LNV
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/remixicon@2.5.0/fonts/remixicon.css" rel="stylesheet">
        <link rel="stylesheet" href="./assets/fonts/fontawesome-free-5.15.4-web/fontawesome-free-5.15.4-web/css/all.min.css">
        <link rel="stylesheet" href="./assets/owl-carousel/owl.carousel.min.css">
        <link rel="stylesheet" href="./assets/owl-carousel/owl.theme.default.min.css">
        <link rel="stylesheet" href="./assets/css/grid.css">
        <link rel="stylesheet" href="./assets/css/base.css">
        <link rel="stylesheet" href="./assets/css/style.css">
        <link rel="stylesheet" href="./assets/css/responsive.css">
        <title>TineBNB</title>
    </head>

    <body>
        <div class="main">
            <jsp:include page="Header.jsp"/>

            <div class="container">
                <div class="grid">
                    <div class="container__header">
                        <div class="container__header-notice">
                            <h1>Đăng ký liền tay nhận ngay quà hot</h1>
                        </div>
                    </div>
                </div>
            </div>

            <div class="app__content">
                <div class="grid wide">
                    <!-- ===============================Content============================== -->
                    <div class="login__content">
                        <div class="row">
                            <div class="col c-8 login__content-description">
                                <div class="row">
                                    <div class="col c-6 login__content-about">
                                        <img src="./assets/img/coins@2x.png" alt="">
                                        <h3>Tích điểm nhanh chóng</h3>
                                        <p>
                                            Tích điểm đối với mỗi lượt đặt chỗ thành công. Quy đổi thành BNB Credit để du lịch nhiều hơn nữa.
                                        </p>
                                    </div>
                                    <div class="col c-6 login__content-about">
                                        <img src="./assets/img/top-sales@2x.png" alt="">
                                        <h3>Tích điểm nhanh chóng</h3>
                                        <p>
                                            Tích điểm đối với mỗi lượt đặt chỗ thành công. Quy đổi thành BNB Credit để du lịch nhiều hơn nữa.
                                        </p>
                                    </div>
                                    <div class="col c-6 login__content-about">
                                        <img src="./assets/img/wallet@2x.png" alt="">
                                        <h3>Tích điểm nhanh chóng</h3>
                                        <p>
                                            Tích điểm đối với mỗi lượt đặt chỗ thành công. Quy đổi thành BNB Credit để du lịch nhiều hơn nữa.
                                        </p>
                                    </div>
                                    <div class="col c-6 login__content-about">
                                        <img src="./assets/img/backpack@2x.png" alt="">
                                        <h3>Tích điểm nhanh chóng</h3>
                                        <p>
                                            Tích điểm đối với mỗi lượt đặt chỗ thành công. Quy đổi thành BNB Credit để du lịch nhiều hơn nữa.
                                        </p>
                                    </div>
                                </div>
                            </div>
                            <div class="col c-4 signup__content-form">
                                <form action="sign-up" method="post" >
                                    <div class="signup__form">
                                        <div class="signup__form-heading">
                                            <h2>Đăng ký thành viên</h2>
                                        </div>
                                        <div class="signup__form-lastname">
                                            <h3>Username</h3>
                                            <input name="username" type="" class="" placeholder="">
                                        </div>
                                        <div class="signup__form-email">
                                            <h3>Địa chỉ email</h3>
                                            <div class="email-flex">
                                                <input name="email" type="email" class="" placeholder="Địa chỉ email">
                                                <div><i class="far fa-envelope"></i></div>
                                            </div>
                                        </div>
                                        <div class="signup__form-phonenumber">
                                            <h3>Số điện thoại</h3>
                                            <input name="phonenumber" type="" class="" min="1">
                                        </div>
                                        <div class="signup__form-password">
                                            <div class="content-flex">
                                                <h3>Mật khẩu</h3>
                                            </div>

                                            <div class="password-flex">
                                                <input name="password" type="password" class="" placeholder="Mật khẩu">
                                                <div><img src="./assets/img/locked.svg" alt=""></div>
                                            </div>

                                        </div>
                                        <div class="signup__form-confirmpassword">
                                            <h3>Xác nhận mật khẩu mới</h3>
                                            <div class="password-flex">
                                                <input name="repassword" type="password" class="" placeholder="">
                                                <div><img src="./assets/img/locked.svg" alt=""></div>
                                            </div>
                                        </div>
                                        <p class="alert-error">${message}</p>
                                        <button type="submit" class="login__form-button">Đăng ký</button>
                                        <div class="login__form-notice">Bạn đã có tài khoản? <a href="sign-in">Đăng Nhập</a></div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>

                </div>
            </div>

            <jsp:include page="Footer.jsp"/>

            <div class="wrapper">
                <div class="ring">
                    <div class="coccoc-alo-phone coccoc-alo-green coccoc-alo-show">
                        <div class="coccoc-alo-ph-circle"></div>
                        <div class="coccoc-alo-ph-circle-fill"></div>
                        <div class="coccoc-alo-ph-img-circle"></div>
                    </div>
                </div>
            </div>

            <jsp:include page="Menu.jsp"/>

        </div>

        <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
        <script src="./assets/owl-carousel/owl.carousel.min.js"></script>
        <script src="./assets/js/main.js"></script>




    </body>

</html>