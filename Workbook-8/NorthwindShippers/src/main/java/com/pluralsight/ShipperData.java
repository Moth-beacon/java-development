package com.pluralsight;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ShipperData {
    private final String url = "jdbc:mysql://localhost:3306/northwind";
    private final String user = "root";
    private final String password = "P@ssw0rd";


    public Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public int addShipper(Shipper shipper) {
        String sql = "INSERT INTO shippers (CompanyName, Phone) VALUES (?, ?)";
        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, shipper.getCompanyName());
            stmt.setString(2, shipper.getPhone());
            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public List<Shipper> getAllShippers() {
        List<Shipper> shippers = new ArrayList<>();
        String sql = "SELECT * FROM shippers";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                shippers.add(new Shipper(
                        rs.getInt("ShipperID"),
                        rs.getString("CompanyName"),
                        rs.getString("Phone")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return shippers;
    }

    public void updatePhone(int id, String phone) {
        String sql = "UPDATE shippers SET Phone = ? WHERE ShipperID = ?";
        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, phone);
            stmt.setInt(2, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteShipper(int id) {
        String sql = "DELETE FROM shippers WHERE ShipperID = ?";
        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
