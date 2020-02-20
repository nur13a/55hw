package com.dao;

import com.model.User;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
public class UserDao {
    private static HashMap<Integer, User> users=new HashMap<>();
    static {
        User user1=new User(1,"user1","123",new java.util.Date());
        User user2=new User(2,"user1","123",new Date());
        users.put(1,user1);
        users.put(2,user2);

    }
    public List<User> getUsers_JSON(){

        return new ArrayList<User>(users.values());
    }
    public User getUserById(Integer id){
        return users.get(id);
    }
    public User updateById(int id,User user){
        users.put(user.getId(),user);
        return users.get(user.getId());
    }
//    private static final String url = "jdbc:postgresql://localhost:5432/";
//    private static final String user = "postgres";
//    private static final String password = "postgres";
//
//    @SneakyThrows
//    public static Connection connect() {
//        Class.forName("org.postgresql.Driver");
//        Connection conn = null;
//        try {
//            conn = DriverManager.getConnection(url, user, password);
//            System.out.println("Connected to the PostgreSQL server successfully");
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//        return conn;
//    }
//
//    public User getAllUsers() {
//        String Sql = "select * from users";
//        try (Connection conn = connect();
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery(Sql);) {
//            User u = new User();
//            u.setName(rs.getString("name"));
//            u.setPassword(rs.getString("password"));
//            u.setCreatedDate(rs.getDate("date_created"));
//            return u;
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    public User getUserById(int id) {
//        String Sql = "select * from users where id=? ";
//        try (Connection conn = connect();
//             PreparedStatement statement = conn.prepareStatement(Sql);) {
//            statement.setInt(1, id);
//            try (ResultSet rs = statement.executeQuery()) {
//                while (rs.next()) {
//                    User u = new User();
//                    u.setName(rs.getString("name"));
//                    u.setPassword(rs.getString("password"));
//                    u.setCreatedDate(rs.getDate("created_date"));
//                    return u;
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//    public boolean deleteUser(int id){
//        String SQL="delete from users where id=?";
//        try (Connection conn = connect();
//             PreparedStatement statement = conn.prepareStatement(SQL);) {
//            statement.setInt(1, id);
//                statement.executeUpdate();
//                return true;
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
//    public boolean updateUser(User u){
//        String SQL = "update users set name = ?, password = ? where id = ?";
//        try(Connection conn = connect();
//            PreparedStatement stmt = conn.prepareStatement(SQL)) {
//            stmt.setString(1, u.getName());
//            stmt.setString(2, u.getPassword());
//            stmt.setInt(3, u.getId());
//            stmt.executeUpdate();
//        }
//        catch (SQLException ex){
//            ex.printStackTrace();
//        }
//        return false;
//    }
//    public boolean addUser(User u){
//        String SQL = "insert into users (name, password,created_date) values (?,?,now())";
//        try (Connection connection = connect();
//             PreparedStatement statement = connection.prepareStatement(SQL);) {
//            statement.setString(1, u.getName());
//            statement.setString(2, u.getPassword());
//            statement.executeUpdate();
//            return true;
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
}
