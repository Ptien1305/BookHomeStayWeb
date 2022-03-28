<%-- 
    Document   : Homestay.jsp
    Created on : Oct 10, 2021, 8:22:06 PM
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
    <title>Homestay</title>
</head>

<body>
    <div class="main">
        <jsp:include page="Header.jsp"/>



        <div class="app__content">
            <div class="grid wide">
                <!-- ===============================WELCOM============================== -->

                <!-- ===============================TOUR SLIDER============================== -->
                <div class="content-section">

                    <div class="notice">
                        <p>Trước khi đặt phòng, hãy kiểm tra những địa điểm bị hạn chế du lịch trong thời gian này. Sức khỏe và sự an toàn của cộng đồng luôn được đặt hàng đầu. Vì vậy, vui lòng làm theo chỉ thị của chính phủ bởi điều đó thực sự cần thiết.
                            Chúc quý khách có 1 khoảng thơi gian nghỉ dưỡng vui vẻ.
                        </p>
                    </div>
                    <div class="homestay__selection">
                        <div class="row">
                            <div class="col c-9">
                                <c:forEach items="${homestay}" var="o">
                                <div class="numberHomestay">
                                    <h2 style="font-size: 2.2rem;">${homestay.size()} homestay</h2>
                                </div>
                                </c:forEach>
                            </div>
                            
                            <div class="col c-3">
                                <div class="select-input">
                                    <span class="select-input__label">
                                        Sắp xếp:
                                    </span>
                                    <i class="select-input__icon fas fa-angle-down"></i>

                                    <!-- List option -->
                                    <ul class="select-input__list">
                                        <li class="select-input__item">
                                            <a href="asc" class="select-input__link">
                                                Giá tăng dần
                                            </a>

                                        </li>
                                        <li class="select-input__item">
                                            <a href="" class="select-input__link">
                                                Giá giảm dần
                                            </a>

                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="homestay">
                        <div class="row">
                            <c:forEach items="${homestay}" var="o">
                                <div class="col c-3">
                                    <a class="homestay__item" href="homestay?hid=${o.id}">
                                        <img class="homestay__img" src="${o.img}" alt="">
                                        <div class="homestay__info">
                                            <!-- thêm thẻ div vào từng span -->
                                            <div class="homestay__info-description">
                                                <span>${o.desciption}</span>
                                            </div>
                                            <div class="homestay__info-name">
                                                <span><i class="fas fa-bolt"></i></span>
                                                <span>${o.name}</span>

                                            </div>
                                            <div class="homestay__info-price">
                                                <span>${o.price}₫/đêm</span>
                                            </div>

                                        </div>
                                    </a>
                                </div>
                            </c:forEach>
                            
                           

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