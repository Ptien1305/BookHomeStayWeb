<%-- 
    Document   : Detail
    Created on : Oct 27, 2021, 3:25:13 PM
    Author     : LNV
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

            <div class="slider">
                <div class="grid">
                    <div class="owl-carousel owl-theme">

                        <c:forEach items="${image}" var="o">
                            <a href="">
                                <div class="tour__item">
                                    <img class="homestay__detail-img" src="${o.name}" alt="">

                                </div>
                            </a>
                        </c:forEach>
                        <c:if test="${image.size() == 0}">
                            <a href="">
                                <div class="tour__item">
                                    <img class="homestay__detail-img" src="${homestay.img}" alt="">

                                </div>
                            </a>
                        </c:if>
                    </div>
                </div>
            </div>

            <div class="app__content">
                <div class="grid wide">
                    <!-- ===============================Content============================== -->
                    <div class="detail__content">
                        <div class="row">
                            <div class="col c-8 detail__content-description">

                                <div class="content-description--name">
                                    <h2>${homestay.name}</h2>
                                </div>

                                <div class="content-desciption--about">
                                    <h3>T??m t???t v??? ${homestay.name}</h3>
                                    <p>?? V??? tr?? r???t ?????p v?? thu???n ti???n</p>
                                    <p>?? M??i tr?????ng ngo??i tr???i y??n t??nh</p>
                                    <p>?? B???n ho??n to??n c?? th??? tr???i nghi???m nh???ng d???ch v??? cao c???p t???i ????y V??? kh??ng gian</p>
                                    <p>?? C??n h??? ???????c thi???t k??? v???i nhi???u l???a ch???n b??? tr?? h???p l?? v?? ???????c trang b??? theo ti??u chu???n cao c???p 4 sao v???i ban c??ng ri??ng v?? c???nh quan ?????p</p>
                                    <p>?? C?? nhi???u d???ch v??? t???i ch??? kh??c nhau nh?? gi???t ???i, d???ch v??? v??? sinh, Wi-Fi mi???n ph?? t???c ????? cao, an ninh 24/7</p>
                                    <p>?? D???ch v??? kh??ch h??ng ?????c bi???t ???????c cung c???p</p>
                                </div>

                                <div class="content-description--convenient">
                                    <h3>Ti???n nghi ch??? ???</h3>
                                    <span>Gi???i thi???u v??? c??c ti???n nghi v?? d???ch v??? t???i n??i l??u tr??</span>
                                    <div class="row">
                                        <div class="col c-3 convenient "><i class="fas fa-wifi"></i> Wifi </div>
                                        <div class="col c-3 convenient "><i class="fas fa-tv"></i> TV </div>

                                        <div class="col c-3 convenient "><i class="fas fa-biking"></i> Thu?? xe </div>

                                        <div class="col c-3 convenient "><i class="fas fa-wind"></i> ??I???u h??a </div>

                                        <div class="col c-3 convenient "><i class="fas fa-bath"></i> B???n t???m </div>

                                        <div class="col c-3 convenient "><i class="fas fa-hdd"></i> Internet </div>

                                        <div class="col c-3 convenient "><i class="fab fa-playstation"></i> PlayStation-4 </div>

                                        <div class="col c-3 convenient "><i class="fas fa-first-aid"></i> H???p thu???c s?? c???u </div>

                                    </div>
                                </div>
                                <div class="content-description--rule">
                                    <h3>L??u ?? ?????c bi???t</h3>
                                    <div class="rule">
                                        <p>- Kh??ng h??t thu???c trong c??n h???</p>
                                        <p>- Kh??ng s??? d???ng ch???t k??ch th??ch</p>
                                        <p>- Kh??ng m??? ti???c trong c??n h???</p>
                                        <p>- Kh??ng mang theo v???t nu??i</p>
                                        <p>- Vui l??ng gi??? im l???ng sau 22h</p>
                                        <p>- Vui l??ng t???t c??c thi???t b??? khi b???n ra kh???i ph??ng</p>
                                    </div>
                                </div>


                            </div>

                            <div class="col c-3 detail__content-booking">
                                <form action="bookingHistory" method="post">
                                    <div class="booking">
                                        <div class="booking-price">
                                            <h3>${homestay.price}???/????m</h3>
                                        </div>
                                        <input name="homestayID" type="hidden" value="${homestay.id}">
                                        <input name="homestayName" type="hidden" value="${homestay.name}">
                                        <input required name="check_in" type="date" class="booking-date" placeholder="dd//mm/yyyy">
                                        <br>
                                        <input required name="check_out" type="date" class="booking-date" placeholder="dd//mm/yyyy">
                                        <br>
                                        <input name="" type="text" class="booking-quantity" placeholder="1 kh??ch">
                                        <br>
                                        <button type="submit" class="booking-book">?????t ngay</button>
                                    </div>
                                </form>
                                <div class="support">
                                    <div class="support-content">
                                        <h3>T?? v???n t??? TineBNB</h3>
                                        <p>Vui l??ng cung c???p s??? ??i???n tho???i ????? ???????c nh???n t?? v???n cho chuy???n ??i c???a b???n</p>
                                    </div>
                                    <input type="text" class="customer-name" placeholder="T??n kh??ch h??ng">
                                    <br>
                                    <input type="text" class="customer-phone" placeholder="S??? ??i???n tho???i">
                                    <br>
                                    <button class="send-support">Nh???n t?? v???n mi???n ph??</button>
                                </div>
                            </div>
                        </div>
                    </div>



                    <!-- ===============================BEGIN SUGGEST============================== -->
                    <div class="content-section">
                        <div class="lux-stay-suggest">
                            <h3 class="content__heading mb-16">Ch??? ??? t????ng t???</h3>


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