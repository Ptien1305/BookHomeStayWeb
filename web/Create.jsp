<%-- 
    Document   : Create
    Created on : Oct 27, 2021, 3:26:23 PM
    Author     : LNV
--%>

<%@page import="java.text.SimpleDateFormat"%>
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

            <div class="app__content">
                <div class="grid wide">
                    <!-- ===============================Content============================== -->
                    <div class="update__content">
                        <h1>Thêm Homestay</h1>

                        <form action="add" method="post">
                            <table class="update__content-list">
                                <%
                                    SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
                                    if (request.getAttribute("error") != null) {
                                        String re = request.getAttribute("error").toString();
                                %>
                                <%
                                    }
                                %>
                                <td>
                                    <p>ID</p>
                                    <input type="text" required name="id" placeholder="id" >
                                    <p>Địa điểm</p>
                                    <input type="text" required name="locationID" placeholder="Địa điểm" >
                                    <p>Tên Homestay</p>
                                    <input type="text" required name="name" placeholder="Tên Homestay" >
                                    <p>Giá</p>
                                    <input type="text" required name="price" placeholder="Giá" >
                                    </br>
                                    <p>Miêu tả</p>
                                    <input type="text" required name="desciption" placeholder="Miêu tả" >
                                </td>
                                <td style="padding-left: 58px">
                                    <p>Số người tối đa</p>
                                    <input type="text" required name="maxPeople" placeholder="Số người tối đa" >
                                    <p>Ảnh</p>
                                    <input type="text" required name="img">
                                    <p>Ngày thêm</p>
                                    <input value="<%=date.format(new java.util.Date())%>" readonly type="text" name="addDate" placeholder="adddate">
                                    </br>
                                    </br>
                                    <input class="btn" type="reset" name="clear" value="Xóa">
                                    <input class="btn" type="submit" name="submit" value="Hoàn thành" onclick="return confirm('Xác nhận thêm Homestay?')">
                                </td>
                            </table>

                        </form>
                        <p class="alert-error">${message}</p>  

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
