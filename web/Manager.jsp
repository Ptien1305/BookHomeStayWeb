<%-- 
    Document   : Manager
    Created on : Oct 27, 2021, 3:26:12 PM
    Author     : LNV
--%>


<%@page import="entity.Homestay"%>
<%@page import="java.util.ArrayList"%>
<%@page import="DAO.DAO"%>
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

            <div class="app__content">
                <div class="grid wide">
                    <!-- ===============================Content============================== -->
                    <div class="manager__content">
                        <a class="manager__content-btnadd manager-btn" href="Create.jsp">Thêm homestay</a>
                        <div class="roomtype">
                        <select name="roomtype">          
                                            <option name="roomtype" value="">Biệt thự</option>
                                            <option name="roomtype" value="">Căn hộ 1 phòng ngủ</option>
                                            <option name="roomtype" value="">Căn hộ 2 phòng ngủ</option>
                                            <option name="roomtype" value="">Chung cư mini</option>
                                    </select>
                            </div>
                        <form >
                            <table class="manager__content-list">

                                <tr>
                                    <td>ID</td>
                                    <td>Tên</td>
                                    <td>Địa điểm</td>
                                    <td>Ảnh</td>
                                    <td>Giá</td>
                                    <td>Miêu tả</td>
                                    <td>Số người tối đa</td>
                                    <td>Ngày thêm</td>
                                    <td>Cập nhật</td>
                                    <td>Xóa</td>
                                </tr>

                                <%  DAO dao = new DAO();
                                    ArrayList<Homestay> list = dao.getAllHomestay();
                                    if (request.getAttribute("listSearch") != null) {
                                        list = (ArrayList<Homestay>) request.getAttribute("listSearch");
                                    } else {
                                        list = dao.getAllHomestay();
                                    }
                                    int index = 0;
                                    int size = list.size(); 
                                    int curPage = 0;
                                    // so san phan tren 1 trang
                                    int pPerPage = 8; 
                                %>
                                <%
                                    try {
                                        curPage = Integer.parseInt(request.getParameter("page"));

                                    } catch (NumberFormatException e) {
                                        curPage = 0;
                                    }
                                    if (curPage == 0) {
                                        curPage = 1; 

                                    }
                                    index = (curPage - 1) * pPerPage; 
                                    int counter = 0;  

                                    while ((counter < pPerPage) && index < size) {
                                %>
                                <tr>
                                    <td><%=list.get(index).getId()%></td>
                                    <td><%=list.get(index).getName()%></td>
                                    <td><%=list.get(index).getLocationID()%></td>
                                    <td><img src="<%=list.get(index).getImg()%>" alt=""></td>
                                    <td><%=list.get(index).getPrice()%></td>
                                    <td><%=list.get(index).getDesciption()%></td>
                                    <td><%=list.get(index).getMaxPeople()%></td>
                                    <td><%=list.get(index).getAddDate()%></td>
                                    <td><a class="manager-btn" href="update?id=<%=list.get(index).getId()%>">Cập nhật</a></td>
                                    <td><a class="manager-btn" href="delete?id=<%=list.get(index).getId()%>" onclick="return confirm('Bạn có muốn xóa Homestay này không?')">Xóa </a></td>
                                </tr>
                                <%
                                    index++;
                                    counter++;
                                    if (counter >= pPerPage) {
                                        break;
                                    }
                                %>
                                <%
                                    }
                                %>
                            </table>

                        </form>

                        <div class="pagi">
                            <%
                                String afileName = "manager";
                                if (index == 0) {
                                    out.print("No Homestay");
                                } else {
                                    if (curPage == 1) {
                                        out.print("<button><a href=#> Previous </a></button>");
                                    } else {
                                        out.print("<button><a href=" + afileName + "?page=" + (curPage - 1) + ">Previous</a></button>");
                                    }
                                }
                                int indexpage = 1;
                                int numpage;
                                if (size % pPerPage == 0) {
                                    numpage = size / pPerPage;
                                } else {
                                    numpage = size / pPerPage + 1;
                                }
                                while (indexpage <= numpage) {
                                    out.print("<button style=" + "min-width:30px;" +"><a href=" + afileName + "?page=" + indexpage + ">" + indexpage + "</a></button>");
                                    indexpage++;
                                }
                                if (curPage == numpage) {
                                    out.print("<button ><a href=#> Next </a></button> ");
                                } else {
                                    out.print("<button><a href=" + afileName + "?page=" + (curPage + 1) + "> Next </a></button>");
                                }
                            %>

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
        <script>
            function doColor(var i) {
                document.getElementById();
            }
        </script>



    </body>

</html>
