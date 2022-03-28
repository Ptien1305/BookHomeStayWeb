<%-- 
    Document   : Header
    Created on : Oct 18, 2021, 10:10:38 PM
    Author     : LNV
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<header class="header-wrapper">
    <div class="header">
        <div class="grid">
            <div class="row">
                <!-- Header with search -->
                <div class="col l-5 m-5 c-12">
                    <div class="header-left">
                        <a href="home" class="header__logo hide-on-mobile">
                            <!-- <svg version="1.1" viewBox="0 0 50 50" class="svg-icon svg-fill" style="width: 50px; height: 50px;">
                                <path pid="0"
                                    d="M25.093 0c13.781.06 24.94 11.317 24.882 25.106C49.917 38.894 38.663 50.058 24.88 50 11.1 49.942-.059 38.683.001 24.894.057 11.106 11.31-.058 25.092 0zm11.801 31.9L14.398 16.053c.241-.26.48-.518.74-.777 2.7-2.687 5.971-4.031 9.775-4.015 3.804.015 7.064 1.388 9.741 4.098.238.241.476.482.694.743l-5.951 4.133 2.381 1.688 5.153-3.576v.02L39.33 16.7c-.692-1.203-1.584-2.325-2.616-3.39-3.231-3.292-7.167-4.947-11.788-4.967-4.6-.019-8.53 1.603-11.809 4.867a17.806 17.806 0 00-2.682 3.408l1.429 1.004 23.429 16.51c-.24.26-.48.518-.74.777-2.7 2.687-5.971 4.011-9.775 3.996-3.803-.016-7.063-1.37-9.74-4.08-.258-.26-.496-.521-.734-.782l6.111-4.251-.139-.181-2.183-1.528-5.373 3.735v-.021l-2.377 1.65a17.824 17.824 0 002.654 3.43c3.253 3.291 7.169 4.946 11.769 4.965 4.62.021 8.549-1.602 11.83-4.866 1.06-1.075 1.96-2.21 2.682-3.406l-2.383-1.67z">
                                </path>
                            </svg> -->
                            <img src="./assets/img/logo.png" alt="">
                        </a>
                        <form action="search" method="post">
                            <div class="search__wrapper">
                                <div class="search__box">
                                    <div class="search__location search__box--separate">
                                        <div class="search__location-icon">
                                            <i class="ri-search-line"></i>
                                        </div>
                                        <input value="${txtSearch}" name="txt" type="text" class="search__location-input" placeholder="Tìm kiếm">
                                    </div>
                                    <div class="search__date search__box--separate hide-on-mobile">
                                        <svg version="1.1" viewBox="0 0 14 16" class="mr--12 svg-icon svg-fill" style="width: 14px; height: 16px;">
                                        <path pid="0"
                                              d="M9 2V1a1 1 0 112 0v1a3 3 0 013 3v8a3 3 0 01-3 3H3a3 3 0 01-3-3V5a3 3 0 013-3V1a1 1 0 112 0v1h4zM2 7v6a1 1 0 001 1h8a1 1 0 001-1V7H2z"
                                              fill="#666" fill-rule="evenodd"></path>
                                        </svg>
                                        <span class="search__date-text">Ngày</span>
                                    </div>
                                    <div class="search__guest hide-on-mobile">
                                        <svg version="1.1" viewBox="0 0 16 16" class="mr--12 svg-icon svg-fill" style="width: 14px; height: 14px;">
                                        <path pid="0"
                                              d="M8 8a4 4 0 110-8 4 4 0 010 8zm0 1c4.926 0 7.59 1.966 7.995 5.898A1.002 1.002 0 0114.994 16H1.006a1.003 1.003 0 01-1-1.102C.408 10.966 3.073 9 8 9z"
                                              fill="#666" fill-rule="evenodd"></path>
                                        </svg>
                                        <span class="search__guest-text">Số Khách</span>
                                    </div>
                                </div>
                                <button type="submit" class="search__btn hide-on-mobile">
                                    <i class="search__btn-icon ri-search-line"></i>
                                </button>
                            </div>
                        </form>
                    </div>
                </div>
                <div class="menu-on-tablet-mobile">
                    <div class="menu-btn">
                        <i class="menu-icon ri-menu-line"></i>
                    </div>
                </div>
                <div class="col l-5 l-o-2 hide-on-tablet-mobile hide-low-pc">
                    <ul class="menu">
                        <c:if test="${sessionScope.customer == null}">
                            <li class="menu__item">
                                <a href="sign-up" class="menu__link">Đăng ký</a>
                            </li>
                            <li class="menu__item">
                                <a href="sign-in" class="menu__link">Đăng nhập</a>
                            </li>
                        </c:if>
                        <c:if test="${sessionScope.customer.isAdmin}">
                            <li class="menu__item">
                                <a href="manager" class="menu__link">Quản lí Homestay</a>
                            </li>
                            <li class="menu__item">
                                <a href="locationManager" class="menu__link">Quản lí địa điểm</a>
                            </li>
                            <li class="menu__item">
                                <a href="customerManager" class="menu__link">Quản lí người dùng</a>
                            </li>
                        </c:if>
                        <c:if test="${sessionScope.customer != null}">
                            <li class="menu__item">
                                <a href="" class="menu__link">
                                    <div class="menu__btn">
                                        <img src="./assets/img/backpack@2x.png" alt="" class="menu__icon">                                   
                                        <span>${sessionScope.customer.username}</span>
                                        <i class="menu__icon-down ri-arrow-down-s-fill"></i>
                                    </div>
                                </a>

                                <div class="menu__account-select">
                                    <ul class="menu__account-list">
                                        <li class="menu__account-link">
                                            <a href="updateCustomer?id=${sessionScope.customer.customerID}"><i style="padding-right: 8px;" class="fas fa-cog"></i>Cài đặt tài khoản</a>
                                        </li>
                                        <li class="menu__account-link">
                                            <a href="bookingHistory"><i style="padding-right: 8px;" class="far fa-calendar"></i> Đặt chỗ của tôi</a>
                                        </li>
                                        <li class="menu__account-link">
                                            <a href="logout"><i style="padding-right: 8px;" class="fas fa-sign-out-alt"></i>Đăng xuất</a>
                                        </li>
                                    </ul>
                                </div>

                            </li>
                        </c:if>                           

                        <li class="menu__item">
                            <a href="" class="menu__link">
                                <div class="menu__btn">
                                    <img src="./assets/img/vi.svg" alt="" class="menu__icon">
                                    <span>VND</span>
                                    <i class="menu__icon-down ri-arrow-down-s-fill"></i>
                                </div>
                            </a>
                            <div class="menu-select">
                                <div class="select-language">
                                    <ul class="language-list">
                                        <li class="language-item">
                                            <img src="./assets/img/vi.svg" alt="" class="language-country">
                                            <span>Tiếng Việt</span>
                                            <i class="select__icon-check ri-check-line"></i>
                                        </li>
                                        <li class="language-item">
                                            <img src="./assets/img/en.svg" alt="" class="language-country">
                                            <span>England</span>
                                        </li>

                                    </ul>
                                </div>

                                <div class="select-unit">
                                    <ul class="language-list">
                                        <li class="language-item">
                                            <b>vnd</b>
                                            <span>việt nam đồng</span>
                                            <i class="select__icon-check ri-check-line"></i>
                                        </li>
                                        <li class="language-item">
                                            <b>usd</b>
                                            <span>united states dollars</span>

                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</header>

