<%-- 
    Document   : home
    Created on : Oct 5, 2021, 9:11:42 PM
    Author     : LNV
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.Hashtable"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.ArrayList"%>
<%@page import="entity.Location"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="https://cdn.jsdelivr.net/npm/remixicon@2.5.0/fonts/remixicon.css" rel="stylesheet">
        <link rel="stylesheet" href="./assets/owl-carousel/owl.carousel.min.css">
        <link rel="stylesheet" href="./assets/owl-carousel/owl.theme.default.min.css">
        <link rel="stylesheet" href="./assets/css/grid.css">
        <link rel="stylesheet" href="./assets/css/base.css">
        <link rel="stylesheet" href="./assets/css/style.css">
        <link rel="stylesheet" href="./assets/css/responsive.css">
        <title>TineBNB</title>
    </head>
    <%
        Hashtable<Location, String> locations = (Hashtable<Location, String>) request.getAttribute("location");
    %>
    <body>
        <div class="main">
            <jsp:include page="Header.jsp"/>

            <div class="slider">
                <div class="grid wide">
                    <div class="owl-carousel owl-theme">
                        <a href="#" class="item">
                            <img src="assets/img/banner_4.jpg" alt="">
                        </a>
                        <a href="#" class="item">
                            <img src="assets/img/banner_3.jpg" alt="">
                        </a>
                        <a href="#" class="item">
                            <img src="assets/img/banner_5.jpg" alt="">
                        </a>
                        <a href="#" class="item">
                            <img src="assets/img/banner_6.jpg" alt="">
                        </a>
                    </div>
                </div>
            </div>

            <div class="app__content">
                <div class="grid wide">
                    <!-- ===============================WELCOM============================== -->
                    <div class="content-section">
                        <c:if test="${sessionScope.customer == null}">
                            <div class="lux-stay-welcome">
                                <h3 class="content__heading mb-16">Chào mừng đến với TineBNB !</h3>
                                <p class="content__sub mb-8">Đặt chỗ ở, homestay, cho thuê xe, trải nghiệm và nhiều hơn nữa trên TineBNB
                                </p>
                                <p class="content__sub"> <a href="sign-in">Đăng nhập</a> hoặc <a href="sign-up">Đăng ký</a> để trải nghiệm !
                                </p>
                            </div>
                        </c:if>
                        <c:if test="${sessionScope.customer != null}">
                            <div class="lux-stay-welcome">
                                <h3 class="content__heading mb-16">Chào mừng đến với TineBNB, ${sessionScope.customer.username} !</h3>
                                <p class="content__sub mb-8">Đặt chỗ ở, homestay, cho thuê xe, trải nghiệm và nhiều hơn nữa trên TineBNB
                                </p>
                            </div>
                        </c:if>
                    </div>
                    <!-- ===============================TOUR SLIDER============================== -->
                    <div class="content-section">
                        <div class="lux-stay-tour">
                            <h3 class="content__heading mb-16">Địa điểm nổi bật</h3>
                            <p class="content__sub mb-20">Cùng TineBNB bắt đầu chuyến hành trình chinh phục thế giới của bạn
                            </p>
                        </div>
                        <div class="tour">
                            <div class="owl-carousel owl-theme">

                                <% Set<Location> setOfLocations = locations.keySet();
                                    for (Location location : setOfLocations) {
                                %>
                                <a href="location?lid=<%=location.getId()%>">
                                    <div class="tour__item">
                                        <img class="tour__img" src="<%=location.getImage()%>" alt="">
                                        <div class="tour__info">
                                            <h4 class="tour__name"><%=location.getName()%></h4>
                                            <p class="tour__quantity"><%=locations.get(location)%> <span>chỗ ở</span></p>
                                        </div>
                                    </div>
                                </a>
                                <% }%>
                            </div>
                        </div>
                    </div>

                    <!-- ===============================OFFER============================== -->
                    <div class="content-section">
                        <div class="lux-stay-offer">
                            <h3 class="content__heading mb-16">Ưu đãi độc quyền</h3>
                            <p class="content__sub mb-20">
                                Chỉ có tại TineBNB, hấp dẫn và hữu hạn, book ngay!
                                <a class="offer-more hide-on-mobile" href="">Xem thêm</a>
                            </p>
                            <div class="row hide-on-tablet-mobile">
                                <div class="col l-4 m-6 c-0">
                                    <a href="">
                                        <img src="./assets/img/offer1.jpg" alt="" class="offer__img">
                                    </a>
                                </div>
                                <div class="col l-4 m-6 c-0">
                                    <a href="">
                                        <img src="./assets/img/offer2.jpg" alt="" class="offer__img">
                                    </a>
                                </div>
                                <div class="col l-4 m-6 c-0">
                                    <a href="">
                                        <img src="./assets/img/offer3.jpg" alt="" class="offer__img">
                                    </a>
                                </div>
                            </div>

                            <div class="row">
                                <div class="list-offer-on-tablet-mobile">
                                    <div class="col l-4 m-6 c-11">
                                        <a href="">
                                            <img src="./assets/img/offer1.jpg" alt="" class="offer__img">
                                        </a>
                                    </div>
                                    <div class="col l-4 m-6 c-11">
                                        <a href="">
                                            <img src="./assets/img/offer2.jpg" alt="" class="offer__img">
                                        </a>
                                    </div>
                                    <div class="col l-4 m-6 c-11">
                                        <a href="">
                                            <img src="./assets/img/offer3.jpg" alt="" class="offer__img">
                                        </a>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                    <!-- ===============================BEGIN SUGGEST============================== -->
                    <div class="content-section">
                        <div class="lux-stay-suggest">
                            <h3 class="content__heading mb-16">Gợi ý từ TineBNB</h3>
                            <p class="content__sub mb-20">
                                Những địa điểm thường đến mà TineBNB gợi ý dành cho bạn
                            </p>

                            <div class="suggest">
                                <div class="owl-carousel owl-theme">

                                    <c:forEach items="${homestaytop}" var="o">
                                        <a href="homestay?hid=${o.id}">
                                            <div class="suggest__item">
                                                <img class="suggest__img" src="${o.img}" alt="">
                                                <div class="suggest__info">
                                                    <p class="suggest__heading">${o.name}</p>
                                                    <p class="suggest__desc">${o.desciption}</p>
                                                </div>
                                            </div>
                                        </a>
                                    </c:forEach>

                                </div>
                            </div>
                        </div>
                    </div>
                    <!-- ===============================END SUGGEST============================== -->

                    <!-- ===============================BEGIN DOWNLOAD============================== -->

                    <div class="content-section">
                        <div class="lux-stay-download">
                            <div class="row">
                                <div class="col l-6">
                                    <div class="lux-stay-logo">

                                        <img src="./assets/img/logo2.png" class="mb--18 mb--18 logo2" alt="">
                                        <h2 class="download__heading">TÌM KIẾM CHỖ Ở GIÁ TỐT NHẤT</h2>
                                        <p class="download__desc">TineBNB hiện là nền tảng đặt phòng trực tuyến #1 Việt Nam. Đồng hành cùng chúng tôi, bạn có những chuyến đi mang đầy trải nghiệm. Với TineBNB, việc đặt chỗ ở, biệt thự nghỉ dưỡng, khách sạn, nhà riêng, chung cư... trở
                                            nên nhanh chóng, thuận tiện và dễ dàng.</p>
                                    </div>
                                    <div class="download__list">
                                        <div class="row sm-mb-30">
                                            <div class="col l-4 m-0 c-0">
                                                <div class="download__qr-code">
                                                    <img class="qr-code__img" src="./assets/img/qr-code.png" alt="" class="qr__img">
                                                </div>
                                            </div>
                                            <div class="col l-4 m-o-1 m-5 c-12">
                                                <a href="" class="download__link mt-20">
                                                    <img src="./assets/img/apple-store.svg" alt="">
                                                </a>
                                                <a href="" class="download__link mt-24">
                                                    <img src="./assets/img/google-play.svg" alt="">
                                                </a>
                                            </div>

                                        </div>

                                    </div>
                                </div>
                                <div class="col l-6">
                                    <img class="app-img" src="./assets/img/app.png" alt="" class="">
                                </div>
                            </div>

                        </div>
                    </div>
                    <!-- ===============================END DOWNLOAD============================== -->


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
