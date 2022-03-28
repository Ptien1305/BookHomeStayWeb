<%-- 
    Document   : Sign-in
    Created on : Oct 27, 2021, 3:25:51 PM
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
                            <div class="col c-4 login__content-form">
                                <form action="sign-in" method="post">
                                    <div class="login__form">
                                        <div class="login__form-heading">
                                            <h2>Đăng nhập</h2>
                                            <h3>Đăng nhập để trải nghiệm</h3>
                                        </div>
                                        <div class="login__form-email">
                                            <input value="${email}" name="email" type="email" class="" placeholder="Địa chỉ email">
                                            <div><i class="far fa-envelope"></i></div>
                                        </div>
                                        <div class="login__form-password">
                                            <input value="${password}" name="password" type="password" class="" placeholder="Mật khẩu">
                                            <div><img src="./assets/img/locked.svg" alt=""></div>
                                        </div>
                                        <p class="alert-error">${message}</p>
                                        <div class="login__form-remmeber">
                                            <input name="remember" value="1" type="checkbox" name="" id="">
                                            <p>Lưu mật khẩu</p>
                                        </div>
                                        <button type="submit" class="login__form-button">Đăng nhập</button>
                                        <div class="login__form-notice">Bạn chưa có tài khoản? <a href="sign-up">Đăng ký</a></div>
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
