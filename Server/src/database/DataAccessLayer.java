package database;
import org.apache.derby.jdbc.ClientDriver;
import java.sql.*;
import oracle.jdbc.OracleDriver;
import utilities.*;
import java.sql.SQLException;
import gui.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;



public class DataAccessLayer {
  
      public static void connect() throws SQLException{
        DriverManager.registerDriver(new ClientDriver());
        Connection con = DriverManager.getConnection(
                "jdbc:derby://localhost:1527/WishBook", 
                "root", "root");
    }
      
      private static Connection getConnection() throws SQLException {
        DriverManager.registerDriver(new ClientDriver());
        return DriverManager.getConnection(
                "jdbc:derby://localhost:1527/WishBook",
                "root", "root");
    }
      
      private static void closeResources(AutoCloseable... resources) {
        for (AutoCloseable resource : resources) {
            try {
                if (resource != null) {
                    resource.close();
                }
            } catch (Exception e) {
                e.printStackTrace();  // Handle the exception according to your needs
            }
        }
    }
      
    public static int addUser(Client client) throws SQLException{
        int results;
        DriverManager.registerDriver(new ClientDriver());
        Connection con = DriverManager.getConnection(
                "jdbc:derby://localhost:1527/WishBook", 
                "root", "root");

        PreparedStatement stmt = con.prepareStatement(
                "insert into users values(?, ?, ?, ?, ?)");
        //TODO: Check if the username is already there
        stmt.setString(1, client.getUsername());
        stmt.setString(2, client.getPassword());
        stmt.setString(3, client.getEmail());
        stmt.setString(4, client.getPhone());
        stmt.setLong(5, client.getBalance());
        results = stmt.executeUpdate();         
        return results;
    }
    
  public static int addFriend(String sender_Username, String receiver_Username) throws SQLException {
        int results;
        Connection con = null;
        PreparedStatement stmt = null;

        try {
            con = getConnection();
            stmt = con.prepareStatement("INSERT INTO friends_request (sender_username, receiver_username) VALUES (?, ?)");
            stmt.setString(1, sender_Username);
            stmt.setString(2, receiver_Username);
            results = stmt.executeUpdate();
        } finally {
            closeResources(stmt, con);
        }

        return results;
    }

  
    public static ObservableList<Person> searchFriends(String username, String searchQuery) throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            con = getConnection();
            ObservableList<Person> searchResults = FXCollections.observableArrayList();

            // Customize this SQL query based on your database schema and search logic
            String sql = "SELECT * FROM users WHERE username LIKE ? AND username <> ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, "%" + searchQuery + "%");
            stmt.setString(2, username);

            rs = stmt.executeQuery();

            while (rs.next()) {
                String resultUsername = rs.getString("username");
                String resultEmail = rs.getString("email");

                Person person = new Person(resultUsername, resultEmail);
                searchResults.add(person);
            }

            return searchResults;
        } finally {
            closeResources(con, stmt, rs);
        }
    }

    
    
    

    
    

}

    
    
  
