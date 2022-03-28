/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import entity.Booking;
import entity.Customer;
import entity.Homestay;
import entity.Image;
import model.DBContext;
import entity.Location;
import entity.totalPrice;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.locations;

/**
 *
 * @author LNV
 */
public class DAO {

    Connection connection = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public Hashtable<Location, String> getAllLocations() {
        Hashtable<Location, String> hashtable = new Hashtable<Location, String>();
        String query = "select l.locationID, l.name, l.img, COUNT(homestayID)\n"
                + "from Location l left outer join Homestay s\n"
                + "on l.locationID = s.locationID\n"
                + "group by l.locationID, l.name, l.img";
        try {
            connection = new DBContext().getConnection(); //kết nối với sql
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                hashtable.put(new Location(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3)),
                        rs.getString(4));

            }
        } catch (Exception ex) {
            Logger.getLogger(Location.class.getName()).log(Level.SEVERE, null, ex);

        }

        return hashtable;
    }

    public ArrayList<locations> locations() {
        ArrayList<locations> list = new ArrayList<>();
        String query = "select l.locationID, l.name, l.img, COUNT(homestayID) as totalHomestay\n"
                + "                from Location l left outer join Homestay s\n"
                + "                on l.locationID = s.locationID\n"
                + "                group by l.locationID, l.name, l.img";
        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new locations(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
            }
        } catch (Exception e) {
            Logger.getLogger(Location.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }

    public locations getLocationByID(String id) {
        String query = "select l.locationID, l.name, l.img, COUNT(homestayID) as totalHomestay\n"
                + "                from Location l left outer join Homestay s\n"
                + "                on l.locationID = s.locationID\n"
                + "                group by l.locationID, l.name, l.img\n"
                + "                having l.locationID = ?";
        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new locations(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            }
        } catch (Exception e) {
            Logger.getLogger(Homestay.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    public locations checkLocationExist(String id) {
        String query = "select l.locationID, l.name, l.img, COUNT(homestayID) as totalHomestay\n"
                + "                from Location l left outer join Homestay s\n"
                + "                on l.locationID = s.locationID\n"
                + "                group by l.locationID, l.name, l.img\n"
                + "                having l.locationID = ?";
        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new locations(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            }
        } catch (Exception e) {
            Logger.getLogger(Homestay.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    public void updateLocation(String id, String name, String image) {
        String query = "Update Location\n"
                + "set [name] =?,\n"
                + "	img =?\n"
                + "where locationID =?";
        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, image);
            ps.setString(3, id);
            ps.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(locations.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void deleteLocation(String id) {
        String query = "exec deleteLocation @locationID = ?";
        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(locations.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void insertLocation(String id, String name, String image) {
        String query = "insert into Location\n"
                + "values(?, ?, ?)";
        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, id);
            ps.setString(2, name);
            ps.setString(3, image);
            ps.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(locations.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public ArrayList<Homestay> getAllHomestay() {
        ArrayList<Homestay> list = new ArrayList<>();
        String query = "select *\n"
                + "from Homestay\n";
        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Homestay(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getBoolean(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getDate(10)));
            }
        } catch (Exception e) {
            Logger.getLogger(Homestay.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }

    public List<Homestay> getHomestayByLocation(String lid) {
        List<Homestay> list = new ArrayList<>();
        String query = "select *\n"
                + "from Homestay\n"
                + "where locationID = ?";
        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, lid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Homestay(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getBoolean(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getDate(10)));
            }
        } catch (Exception e) {
            Logger.getLogger(Homestay.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }

    public Homestay getHomestayByID(String hid) {
        String query = "select *\n"
                + "from Homestay\n"
                + "where homestayID = ?";
        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, hid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Homestay(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getBoolean(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getDate(10));
            }
        } catch (Exception e) {
            Logger.getLogger(Homestay.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    public List<Image> getImageByHomestayID(String mid) {
        List<Image> list = new ArrayList<>();
        String query = "select *\n"
                + "from img\n"
                + "where homestayID = ?";
        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, mid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Image(rs.getInt(1), rs.getInt(2), rs.getString(3)));
            }
        } catch (Exception e) {
            Logger.getLogger(Image.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }

    public List<Homestay> getTop5Homestay() {
        List<Homestay> list = new ArrayList<>();
        String query = "select top(5)*\n"
                + "from Homestay\n";
        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Homestay(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getBoolean(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getDate(10)));
            }
        } catch (Exception e) {
            Logger.getLogger(Homestay.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }

    public List<Homestay> searchHomestayByName(String txtSearch) {
        List<Homestay> list = new ArrayList<>();
        String query = "select *\n"
                + "from Homestay\n"
                + "where name like ?";
        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, "%" + txtSearch + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Homestay(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getBoolean(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getDate(10)));
            }
        } catch (Exception e) {
            Logger.getLogger(Homestay.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }

    public void deleteHomestay(String id) {
        String query = "EXEC [delete_homestay] @homestayID = ?";

        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Homestay.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void insertHomestay(String id, String locationID, String name, String price, String desciption, String maxPeople, String img, String addDate) {
        String query = "insert into Homestay\n"
                + "values(?, ?, ?, ?, ?, 0, ?, ?, NUll, ?)";

        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, id);
            ps.setString(2, locationID);
            ps.setString(3, name);
            ps.setString(4, price);
            ps.setString(5, desciption);
            ps.setString(6, maxPeople);
            ps.setString(7, img);
            ps.setString(8, addDate);
            ps.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Homestay.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void updatetHomestay(String id, String locationID, String name, String price, String desciption, String maxPeople, String img, String addDate) {
        String query = "UPDATE Homestay   \n"
                + "SET    [locationID] = ?\n"
                + "      ,[name] = ?\n"
                + "      ,[price] = ?\n"
                + "      ,[description] = ?\n"
                + "      ,[isReserved] = 0\n"
                + "      ,[maxPeople] = ?\n"
                + "      ,[img] = ?\n"
                + "      ,[content] = NULL\n"
                + "      ,[adddate] = ?\n"
                + "WHERE [homestayID] = ?";

        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, locationID);
            ps.setString(2, name);
            ps.setString(3, price);
            ps.setString(4, desciption);
            ps.setString(5, maxPeople);
            ps.setString(6, img);
            ps.setString(7, addDate);
            ps.setString(8, id);
            ps.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Homestay.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public Homestay deHomestayExist(String id) {
        String query = "Select * from Homestay where homestayID = ?";
        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Homestay(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getBoolean(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getDate(10));
            }
        } catch (Exception e) {
            Logger.getLogger(Homestay.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    public Customer getCustomer(String email, String password) {
        String query = "select * \n"
                + "from Customer\n"
                + "where email = ?\n"
                + "and [password] = ?";
        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getBoolean(6));
            }
        } catch (Exception e) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, e);
        }

        return null;
    }
    
        public ArrayList<Customer> getAllCustomer() {
        ArrayList<Customer> list = new ArrayList<>();
        String query = "select *\n"
                + "from Customer\n"
                + "where isAdmin = 'False'";
        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getBoolean(6)));
            }
        } catch (Exception e) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }


    public Customer getCustomerByID(String id) {
        String query = "select *\n"
                + "from Customer\n"
                + "where customerID = ?";
        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getBoolean(6));
            }
        } catch (Exception e) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }

    public Customer checkCustomerExist(String email) {
        String query = "select * \n"
                + "from Customer\n"
                + "where email = ?\n";

        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, email);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getBoolean(6));
//                return new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString());
            }
        } catch (Exception e) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, e);
        }

        return null;
    }

    public void insertCustomer(String username, String password, String phonenumber, String email) {
        String query = "insert into Customer\n"
                + "values (?, ?, ?, ?, 0)";
        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, phonenumber);
            ps.setString(4, email);
            ps.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public void updatetCustomer(String id, String username, String password, String phoneNumber, String email) {
        String query = "Update Customer\n"
                + "set username = ?, [password] = ?, phonenumber = ?, email = ?\n"
                + "where customerID = ?";

        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, phoneNumber);
            ps.setString(4, email);
            ps.setString(5, id);
            ps.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Homestay.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void deleteCustomer(String id) {
        String query = "exec deletecustomer @customerID = ?";
        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public Customer getAdmin(String email, String password) {
        String query = "select * \n"
                + "from Admin\n"
                + "where email = ?\n"
                + "and [password] = ?";
        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getBoolean(6));
            }
        } catch (Exception e) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, e);
        }

        return null;
    }

    public int addToBooking(int customerID, String homestayID, String price, String check_in, String check_out) {
        String query = "exec savetobooking\n"
                + "	@customerID = ?,\n"
                + "	@homestayID =?,\n"
                + "	@price = ?,\n"
                + "	@check_in = ?,\n"
                + "	@check_out = ?";
        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            ps.setInt(1, customerID);
            ps.setString(2, homestayID);
            ps.setString(3, price);
            ps.setString(4, check_in);
            ps.setString(5, check_out);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, e);
        }
        return -1;
    }

//      public void updateBooking( int bookingID) {
//        String query = "exec updatebooking @bookingID = ?";
//        try {
//            connection = new DBContext().getConnection();
//            ps = connection.prepareStatement(query);
//            ps.setInt(1, bookingID);
//            ps.executeUpdate();
//        } catch (Exception e) {
//            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, e);
//        }
//    }
    public List<totalPrice> getAllBookings(int customerID) {
        List<totalPrice> list = new ArrayList<>();
        String query = "Select Booking.*, name\n"
                + "from Booking inner join Homestay\n"
                + "on Booking.homestayID = Homestay.homestayID\n"
                + "where customerID = ?";
        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            ps.setInt(1, customerID);
            rs = ps.executeQuery();
            while (rs.next()) {
                Booking booking = new Booking();
                booking.setBookingID(rs.getInt("bookingID"));
                booking.setCustomerID(rs.getInt("customerID"));
                booking.setHomestayID(rs.getInt("homestayID"));
                booking.setPrice(rs.getInt("price"));
                booking.setCheck_in(rs.getDate("check_in"));
                booking.setCheck_out(rs.getDate("check_out"));

                totalPrice total = new totalPrice();
                total.setBooking(booking);
                total.setTotalPrice(rs.getInt("totalPrice"));
                total.setHomestayName(rs.getString("name"));
                list.add(total);
            }
        } catch (Exception e) {
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, e);
        }
        return list;
    }

    public void updateStatusForHomestay(String id) {
        String query = "Update Homestay\n"
                + "set isReserved = 'True'\n"
                + "where homestayID = ?";

        try {
            connection = new DBContext().getConnection();
            ps = connection.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {

        }
    }

//    kiểm tra
    public static void main(String[] args) {
        DAO dao = new DAO();
        for (int i = 3; i < 32; i++) {
            System.out.println("=Function"+i+"!C7");
        }
    }
}
