<%-- 
    Document   : Account
    Created on : Oct 31, 2021, 11:52:28 PM
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
            <header class="header-wrapper">
                <div class="header no-border">
                    <div class="grid">
                        <div class="row">
                            <!-- Header with search -->
                            <div class="col l-6 m-5 c-12">
                                <div class="header-left">
                                    <a href="home" class="header__logo-account hide-on-mobile">

                                        <img src="./assets/img/logo2.png" alt="">
                                    </a>
                                </div>
                            </div>
                            <div class="col l-6 m-5 c-12">
                                <div class="header-right">
                                    <p>Tài khoản của tôi</p>
                                    <p>${sessionScope.customer.username}</p>
                                </div>

                            </div>

                        </div>
                    </div>

                </div>

            </header>



            <div class="app__content">
                <div class="grid wide">
                    <!-- ===============================Content============================== -->
                    <div class="account__content margin">

                        <div class="tabs1">
                            <a class="tab-item" href="bookingHistory">Lịch sử đặt chỗ</a>
                            <a class="tab-item active" href="Account.jsp">Cài đặt tài khoản</a>
                        </div>

                        <div class="account__content-history">

                        </div>
                        <div class="update__content">
                            <h1>Cập nhật tài khoản</h1>

                            <form action="editCustomer" method="post">
                                <table class="update__content-list">

                                    <td>
                                        <p>ID</p>
                                        <input readonly type="text" name="id" placeholder="id" value="${customer.customerID}">
                                        <p>Username</p>
                                        <input type="text" name="username" placeholder="username" value="${customer.username}">
                                        <p>Email</p>
                                        <input type="text" name="email" placeholder="Email" value="${customer.email}">
                                        </br>

                                        <p>Số điện thoại</p>
                                        <input type="text" name="phonenumber" placeholder="Số điện thoại" value="${customer.phoneNumber}">
                                    </td>
                                    <td style="padding-left: 58px">
                                        <p>Mật khẩu mới</p>
                                        <input type="password" name="password" placeholder="Miêu tả" value="${customer.password}">
                                        <p>Xác nhận mật khẩu mới</p>
                                        <input type="password" name="repassword" placeholder="Số người tối đa" value="${customer.password}">
                                        </br>
                                        </br>
                                        <input class="btn" type="reset" name="clear" value="Xóa">
                                        <input class="btn" type="submit" name="submit" value="Hoàn thành">
                                    </td>




                                </table>
                                <p class="alert-error">${message}</p>    
                            </form>


                        </div>


                    </div>

                </div>
            </div>

            <footer class="footer">
                <div class="grid wide">
                    <div class="row">
                        <div class="col l-2-4 m-6 c-12 s-text-center">
                            <div class="footer__logo">


                                <img src="./assets/img/logo2.png" alt="" class="">
                            </div>
                        </div>
                        <div class="col l-2-4 m-6 c-0 sm-mb-30">
                            <h3 class="footer__heading">TOP HOMESTAY ĐƯỢC YÊU THÍCH</h3>
                            <ul class="footer__list">
                                <li class="footer__item">
                                    <a href="" class="footer__link">Homestay Đà Lạt</a>
                                </li>
                                <li class="footer__item">
                                    <a href="" class="footer__link">Homestay Hà Nội</a>
                                </li>
                                <li class="footer__item">
                                    <a href="" class="footer__link">Homestay Đà Nẵng</a>
                                </li>
                                <li class="footer__item">
                                    <a href="" class="footer__link">Homestay Vũng Tàu</a>
                                </li>
                                <li class="footer__item">
                                    <a href="" class="footer__link">Homestay Hồ Chí Minh</a>
                                </li>
                                <li class="footer__item">
                                    <a href="" class="footer__link">Homestay Nha Trang</a>
                                </li>
                            </ul>
                        </div>
                        <div class="col l-2-4 m-4 c-0">
                            <h3 class="footer__heading">KHÔNG GIAN ƯA THÍCH</h3>
                            <ul class="footer__list">
                                <li class="footer__item">
                                    <a href="" class="footer__link">Căn hộ dịch vụ</a>
                                </li>
                                <li class="footer__item">
                                    <a href="" class="footer__link">Biệt thự</a>
                                </li>
                                <li class="footer__item">
                                    <a href="" class="footer__link">Nhà riêng</a>
                                </li>
                                <li class="footer__item">
                                    <a href="" class="footer__link">Studio</a>
                                </li>
                                <li class="footer__item">
                                    <a href="" class="footer__link">Travel Guide</a>
                                </li>
                            </ul>
                        </div>
                        <div class="col l-2-4 m-4 c-0">
                            <h3 class="footer__heading">VỀ CHÚNG TÔI</h3>
                            <ul class="footer__list">
                                <li class="footer__item">
                                    <a href="" class="footer__link">Điều khoản hoạt động</a>
                                </li>
                                <li class="footer__item">
                                    <a href="" class="footer__link">+84 947203147</a>
                                </li>
                                <li class="footer__item">
                                    <a href="" class="footer__link">ptien1305@gmail.com</a>
                                </li>
                            </ul>
                        </div>
                        <div class="col l-2-4 m-4 c-0">
                            <h3 class="footer__heading">TẢI ỨNG DỤNG TineBNB</h3>
                            <div class="row text-left">
                                <div class="col l-6 m-0 c-0">
                                    <img class="footer__qr-img" src="./assets/img/qr-code.png" alt="">
                                </div>
                                <div class="col l-6">
                                    <img class="footer__link-down" src="./assets/img/apple-store.svg" alt="">
                                    <img class="footer__link-down" src="./assets/img/google-play.svg" alt="">
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="footer__bottom">
                    <p class="footer__copyright">© 2021 TineBNB. Bản quyền thuộc về Phan Đình Tiến. Mọi hành vi sao chép đều là phạm pháp nếu không có sự cho phép bằng văn bản của chúng tôi.
                    </p>
                    <p class="footer__address mt-8">Đại học FPT, Hà Nội. Email: ptien1305@gmail.com, Số điện thoại: 0947203147.</p>
                </div>
            </footer>

            <div class="wrapper">
                <div class="ring">
                    <div class="coccoc-alo-phone coccoc-alo-green coccoc-alo-show">
                        <div class="coccoc-alo-ph-circle"></div>
                        <div class="coccoc-alo-ph-circle-fill"></div>
                        <div class="coccoc-alo-ph-img-circle"></div>
                    </div>
                </div>
            </div>

            <div class="modal-menu">
                <div class="modal-menu-container">
                    <div class="modal-menu__top">
                        <a href="">
                            <svg version="1.1" viewBox="0 0 244 50" class="modal-menu__logo-img svg-icon svg-fill">
                            <path pid="0"
                                  d="M25.093 0c13.781.06 24.94 11.317 24.882 25.106C49.917 38.894 38.663 50.058 24.88 50 11.1 49.942-.059 38.683.001 24.894.057 11.106 11.31-.058 25.092 0zm11.801 31.9L14.398 16.053c.241-.26.48-.518.74-.777 2.7-2.687 5.971-4.031 9.775-4.015 3.804.015 7.064 1.388 9.741 4.098.238.241.476.482.694.743l-5.951 4.133 2.381 1.688 5.153-3.576v.02L39.33 16.7c-.692-1.203-1.584-2.325-2.616-3.39-3.231-3.292-7.167-4.947-11.788-4.967-4.6-.019-8.53 1.603-11.809 4.867a17.806 17.806 0 00-2.682 3.408l1.429 1.004 23.429 16.51c-.24.26-.48.518-.74.777-2.7 2.687-5.971 4.011-9.775 3.996-3.803-.016-7.063-1.37-9.74-4.08-.258-.26-.496-.521-.734-.782l6.111-4.251-.139-.181-2.183-1.528-5.373 3.735v-.021l-2.377 1.65a17.824 17.824 0 002.654 3.43c3.253 3.291 7.169 4.946 11.769 4.965 4.62.021 8.549-1.602 11.83-4.866 1.06-1.075 1.96-2.21 2.682-3.406l-2.383-1.67zm45.839 2.652l-12.45-.05.096-21.789a.957.957 0 00-.965-.945l-.678-.003a.96.96 0 00-.974.939v.047c-.048.095-.05.236-.05.33l-.098 22.636a1.337 1.337 0 001.351 1.326l13.805.056a.958.958 0 00.973-.938l.003-.662a1.037 1.037 0 00-1.013-.946v-.001zm27.64-22.67l-.871-.003c-.563-.003-1.027.42-1.027.937l-.075 15.878c-.014 3.157-3.252 5.735-7.197 5.72-3.943-.014-7.158-2.618-7.144-5.775l.123-15.5.052-.282a.957.957 0 00-.201-.756 1.128 1.128 0 00-.767-.332l-.87-.004c-.513-.002-.924.326-1.028.75a.857.857 0 00-.156.47l-.073 15.69c-.02 4.616 4.47 8.402 9.95 8.424 5.48.022 10.004-3.73 10.025-8.3l.122-15.5.054-.282a.952.952 0 00-.203-.755c-.152-.189-.458-.379-.714-.38zm48.638 11.226c-3.275-1.249-6.696-2.496-6.688-4.393.01-2.42 2.721-4.401 6.05-4.387 3.331.014 6.025 2.017 6.014 4.436l-.002.38a.96.96 0 00.961.953l.675.003a.96.96 0 00.971-.945v-.38c.009-1.66-.709-3.276-2.006-4.515-1.635-1.618-4.092-2.532-6.65-2.494-4.873-.02-8.698 3.047-8.715 6.938.03 3.748 4.416 5.38 8.656 6.962 3.324 1.247 6.795 2.495 6.785 4.487-.01 2.372-3.155 4.399-6.775 4.385-3.668-.016-6.747-2.07-6.737-4.44l.001-.38a.961.961 0 00-.96-.954l-.676-.002a.96.96 0 00-.97.945v.38c-.018 3.843 4.215 6.991 9.38 7.012 5.163.022 9.423-3.092 9.44-6.934-.033-3.796-4.464-5.427-8.754-7.057zM193.66 11.84l-18.844-.076c-.547-.003-.996.42-.999.94l-.002.66c-.002.52.443.946.99.949l8.103.032-.095 21.802c-.003.52.443.947.99.949l.696.002c.546.003.996-.42 1-.94l.095-21.802 8.055.031c.547.003.996-.42.999-.94l.003-.66c.003-.52-.443-.946-.99-.947zm49.264.515c-.144-.33-.481-.52-.867-.52l-.87-.005a.963.963 0 00-.677.28l-.145.14-.147.142-6.609 9.677-6.72-9.734c-.048-.046-.096-.094-.096-.14l-.143-.143a.97.97 0 00-.675-.285l-.774-.003a1.021 1.021 0 00-.872.515 1.03 1.03 0 00.045.988l7.966 11.576-.049 11.307c.006.527.437.95.964.946l.675.002a.957.957 0 00.97-.937l.049-11.308 7.923-11.509c.194-.329.243-.705.052-.989zm-37.898 12.047l3.75-7.994 3.728 8.023-7.478-.03zm15.615 10.954v-.047l-10.5-22.733c-.15-.425-.549-.71-1.102-.807-.603-.049-1.156.231-1.41.703v.046l-10.705 22.697v.047l-.204.471c-.095.283-.06.595.097.849.188.258.483.416.802.428l.854.004c.453.001.806-.282.958-.657l.05-.141 4.314-9.277 9.95.04 4.28 9.31.049.14c.15.38.5.664.952.667l.854.002c.352.002.654-.139.806-.422.152-.281.254-.563.104-.847l-.149-.473zm-86.008-15.15l.817.003a.963.963 0 00.729-.347l4.755-6.218.412-.478a.763.763 0 00.095-.915c-.135-.306-.453-.482-.816-.483l-.863-.004a.929.929 0 00-.868.608l-4.983 6.522a.94.94 0 00-.096.915c.135.22.453.394.816.397h.002zm-6.998 8.45l-.819-.002a.96.96 0 00-.728.347l-4.755 6.207-.413.48a.77.77 0 00-.094.92c.135.309.452.485.816.488l.864.002a.91.91 0 00.82-.478l5.03-6.601a.949.949 0 00.095-.92 1.027 1.027 0 00-.816-.443zm8.019-.453l.148.14 5.55 7.248c.248.284.246.662.095.99-.15.332-.5.519-.9.517l-.896-.004a1.013 1.013 0 01-.697-.286l-.149-.14c-.03-.002-.042-.02-.059-.044a.212.212 0 00-.04-.052l-5.501-7.151a1.005 1.005 0 01-.15-.237l-11.694-15.39-.446-.521c-.248-.285-.246-.662-.096-.993.15-.33.501-.518.9-.516l.897.004a.99.99 0 01.845.428l.15.19 11.992 15.721s.05.048.05.096z">
                            </path>
                            </svg>
                        </a>
                        <div class="modal-menu__close">
                            <i class="modal-menu__close-icon ri-close-line"></i>
                        </div>
                    </div>


                    <ul class="modal-menu__list">
                        <li class="modal-menu__item">
                            <a href="https://travel.luxstay.com" class="modal-menu__link">Guide</a>
                        </li>
                        <li class="modal-menu__item">
                            <a href="https://travel.luxstay.com" class="modal-menu__link">Host</a>
                        </li>
                        <li class="modal-menu__item">
                            <a href="" class="modal-menu__link">Đăng ký</a>
                        </li>
                        <li class="modal-menu__item">
                            <a href="" class="modal-menu__link">Đăng nhập</a>
                        </li>
                        <li class="modal-menu__item">
                            <div class="modal-menu__btn js-modal-menu__btn">
                                <img src="./assets/img/vi.svg" alt="" class="modal-menu__icon">
                                <span>VND</span>
                                <i class="modal-menu__icon-down ri-arrow-down-s-fill"></i>
                            </div>

                            <div class="select-on-mobile-tablet js-select-on-mobile-tablet">
                                <ul class="select-list">
                                    <li class="language-item">
                                        <a href="">
                                            <img src="./assets/img/vi.svg" alt="" class="language-country">
                                            <span>Tiếng Việt</span>

                                        </a>
                                        <i class="select__icon-check ri-check-line"></i>
                                    </li>
                                    <li class="language-item">
                                        <a href="">
                                            <img src="./assets/img/en.svg" alt="" class="language-country">
                                            <span>England</span>

                                        </a>
                                    </li>

                                    <li class="language-item">
                                        <a href="">
                                            <b>vnd</b>
                                            <span>việt nam đồng</span>

                                        </a>
                                        <i class="select__icon-check ri-check-line"></i>
                                    </li>
                                    <li class="language-item">
                                        <a href="">
                                            <b>usd</b>
                                            <span>united states dollars</span>

                                        </a>
                                    </li>
                                </ul>
                            </div>
                        </li>


                    </ul>
                </div>
                <div class="menu__mask">

                </div>
            </div>

        </div>

        <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
        <script src="./assets/owl-carousel/owl.carousel.min.js"></script>
        <script src="./assets/js/main.js"></script>




    </body>

</html>
