import com.mysql.jdbc.Driver;

import java.sql.*;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private final Connection connection;


    public MySQLAdsDao(Config config) {
        System.out.println(config.getUrl());
        try {
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    config.getUrl(), config.getUser(), config.getPassword());
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to database", e);
        }
    }

    @Override
    public List<Ad> all() {
        try {
            String sql = "SELECT * FROM ads";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            return Ad.fromResultSet(rs);
        } catch (SQLException e) {
            throw new RuntimeException("Something went wrong getting all the ads.", e);
        }

    }

    @Override
    public Long insert(Ad ad) {
        try {
            String sql = String.format(
                    "INSERT INTO ads (user_id, title, description) VALUES (%d, '%s', '%s')",
                    ad.getUserId(), ad.getTitle(), ad.getDescription()
            );
            Statement stmt = connection.createStatement();
            int colsAffected = stmt.executeUpdate(sql);
            return (long) colsAffected;

        } catch (SQLException e) {
            throw new RuntimeException("Something went wrong inserting the ad.", e);
        }
    }


    public static void main(String[] args) {
    }
}
