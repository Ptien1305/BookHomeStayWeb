<%-- 
    Document   : Manager
    Created on : Oct 27, 2021, 3:26:12 PM
    Author     : LNV
--%>


<%@page import="entity.Customer"%>
<%@page import="model.locations"%>
<%@page import="entity.Location"%>
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
                        <a class="manager__content-btnadd manager-btn" href="sign-up">Thêm tài khoản mới</a>
                        <form >
                            <table class="manager__content-list">

                                <tr>
                                    <td style="height: 70px">ID</td>
                                    <td style="height: 70px">Username</td>
                                    <td style="height: 70px">PhoneNumber</td>
                                    <td style="height: 70px">Email</td>
                                    <td style="height: 70px">Password</td>
                                    <td style="height: 70px">Cập nhật</td>
                                    <td style="height: 70px">Xóa</td>
                                </tr>

                                <%  DAO dao = new DAO();
                                    ArrayList<Customer> list = dao.getAllCustomer();
                                    if (request.getAttribute("listSearch") != null) {
                                        list = (ArrayList<Customer>) request.getAttribute("listSearch");
                                    } else {
                                        list = dao.getAllCustomer();
                                    }
                                    int index = 0;
                                    int size = list.size();
                                    // dang o trang nao
                                    int curPage = 0;
                                    // so san phan tren 1 trang
                                    int pPerPage = 4;
                                %>
                                <%
                                    try {
                                        curPage = Integer.parseInt(request.getParameter("page"));

                                    } catch (NumberFormatException e) {
                                        curPage = 0;
                                    }
                                    if (curPage == 0) {
                                        // so trang danh tu 1
                                        curPage = 1;

                                    }
                                    index = (curPage - 1) * pPerPage; // lat trang de ve phan tu dau
                                    int counter = 0;  // torng 1 trang 0 

                                    while ((counter < pPerPage) && index < size) {
                                %>
                                <tr>
                                    <td style="height: 70px"><%=list.get(index).getCustomerID()%></td>
                                    <td style="height: 70px"><%=list.get(index).getUsername()%></td>
                                    <td style="height: 70px"><%=list.get(index).getPhoneNumber()%></td>
                                    <td style="height: 70px"><%=list.get(index).getEmail()%></td>
                                    <td style="height: 70px"><input type="password" readonly value="<%=list.get(index).getPassword()%>"</td>
                                    <td style="height: 70px"><a class="manager-btn" href="updateCustomer?id=<%=list.get(index).getCustomerID()%>">Cập nhật</a></td>
                                    <td style="height: 70px"><a class="manager-btn" href="deleteLocation?id=<%=list.get(index).getCustomerID()%>" onclick="return confirm('Bạn có muốn xóa tài khoản này không?')">Xóa </a></td>
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
                                String afileName = "customerManager";
                                if (index == 0) {
                                    out.print("No Location");
                                } else {
                                    if (curPage == 1) {
                                        out.print("<button><a href=#> Previous </a></button>");
                                    } else {
                                        out.print("<button><a href=" + afileName + "?page=" + (curPage - 1) + " onclick='doColor(this)' onblur='removeColor(this)'>Previous</a></button>");
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
                                    out.print("<button style=" + "min-width:30px;" + "><a href=" + afileName + "?page=" + indexpage + ">" + indexpage + "</a></button>");
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
