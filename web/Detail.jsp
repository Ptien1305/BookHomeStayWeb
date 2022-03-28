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
                                    <h3>Tóm tắt về ${homestay.name}</h3>
                                    <p>· Vị trí rất đẹp và thuận tiện</p>
                                    <p>· Môi trường ngoài trời yên tĩnh</p>
                                    <p>· Bạn hoàn toàn có thể trải nghiệm những dịch vụ cao cấp tại đây Về không gian</p>
                                    <p>· Căn hộ được thiết kế với nhiều lựa chọn bố trí hợp lý và được trang bị theo tiêu chuẩn cao cấp 4 sao với ban công riêng và cảnh quan đẹp</p>
                                    <p>· Có nhiều dịch vụ tại chỗ khác nhau như giặt ủi, dịch vụ vệ sinh, Wi-Fi miễn phí tốc độ cao, an ninh 24/7</p>
                                    <p>· Dịch vụ khách hàng đặc biệt được cung cấp</p>
                                </div>

                                <div class="content-description--convenient">
                                    <h3>Tiện nghi chỗ ở</h3>
                                    <span>Giới thiệu về các tiện nghi và dịch vụ tại nơi lưu trú</span>
                                    <div class="row">
                                        <div class="col c-3 convenient "><i class="fas fa-wifi"></i> Wifi </div>
                                        <div class="col c-3 convenient "><i class="fas fa-tv"></i> TV </div>

                                        <div class="col c-3 convenient "><i class="fas fa-biking"></i> Thuê xe </div>

                                        <div class="col c-3 convenient "><i class="fas fa-wind"></i> ĐIều hòa </div>

                                        <div class="col c-3 convenient "><i class="fas fa-bath"></i> Bồn tắm </div>

                                        <div class="col c-3 convenient "><i class="fas fa-hdd"></i> Internet </div>

                                        <div class="col c-3 convenient "><i class="fab fa-playstation"></i> PlayStation-4 </div>

                                        <div class="col c-3 convenient "><i class="fas fa-first-aid"></i> Hộp thuốc sơ cứu </div>

                                    </div>
                                </div>
                                <div class="content-description--rule">
                                    <h3>Lưu ý đặc biệt</h3>
                                    <div class="rule">
                                        <p>- Không hút thuốc trong căn hộ</p>
                                        <p>- Không sử dụng chất kích thích</p>
                                        <p>- Không mở tiệc trong căn hộ</p>
                                        <p>- Không mang theo vật nuôi</p>
                                        <p>- Vui lòng giữ im lặng sau 22h</p>
                                        <p>- Vui lòng tắt các thiết bị khi bạn ra khỏi phòng</p>
                                    </div>
                                </div>


                            </div>

                            <div class="col c-3 detail__content-booking">
                                <form action="bookingHistory" method="post">
                                    <div class="booking">
                                        <div class="booking-price">
                                            <h3>${homestay.price}₫/đêm</h3>
                                        </div>
                                        <input name="homestayID" type="hidden" value="${homestay.id}">
                                        <input name="homestayName" type="hidden" value="${homestay.name}">
                                        <input required name="check_in" type="date" class="booking-date" placeholder="dd//mm/yyyy">
                                        <br>
                                        <input required name="check_out" type="date" class="booking-date" placeholder="dd//mm/yyyy">
                                        <br>
                                        <input name="" type="text" class="booking-quantity" placeholder="1 khách">
                                        <br>
                                        <button type="submit" class="booking-book">Đặt ngay</button>
                                    </div>
                                </form>
                                <div class="support">
                                    <div class="support-content">
                                        <h3>Tư vấn từ TineBNB</h3>
                                        <p>Vui lòng cung cấp số điện thoại để được nhận tư vấn cho chuyến đi của bạn</p>
                                    </div>
                                    <input type="text" class="customer-name" placeholder="Tên khách hàng">
                                    <br>
                                    <input type="text" class="customer-phone" placeholder="Số điện thoại">
                                    <br>
                                    <button class="send-support">Nhận tư vấn miễn phí</button>
                                </div>
                            </div>
                        </div>
                    </div>



                    <!-- ===============================BEGIN SUGGEST============================== -->
                    <div class="content-section">
                        <div class="lux-stay-suggest">
                            <h3 class="content__heading mb-16">Chỗ ở tương tự</h3>


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