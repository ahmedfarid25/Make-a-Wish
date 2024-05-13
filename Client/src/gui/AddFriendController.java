package gui;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import server.Server;
import gui.Person;
import java.util.Arrays;
import org.json.simple.JSONObject;
//import utilities.Client;

public class AddFriendController implements Initializable {

    @FXML
    private TableView<Person> tableAddFriend;
    @FXML
    private TableColumn<Person, String> usernameField;
    @FXML
    private TableColumn<Person, String> emailField;
    @FXML
    private Button buttonAddFriend;
    @FXML
    private TextField friendSearch;
    @FXML
    private Button buttonSearch;

    private ObservableList<Person> personList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Initialize your table columns
         
        usernameField.setCellValueFactory(cellData -> cellData.getValue().usernameProperty());
        emailField.setCellValueFactory(cellData -> cellData.getValue().emailProperty());

        // Set the table's data source to the observable list
        tableAddFriend.setItems(personList);
        
         
    
    }
    @FXML
    public void buttonAddFriend(ActionEvent event) {
        Person selectedPerson = tableAddFriend.getSelectionModel().getSelectedItem();
        if (selectedPerson != null) {
            // Convert the Person object to JSON
            String jsonPerson = convertPersonToJson(selectedPerson);

            // Send the JSON data to the server
            String jsonResponse = Server.getInstance().addFriend(jsonPerson);

            // Process the server's response if needed
            System.out.println("Add Friend Response: " + jsonResponse);
        } else {
            System.out.println("Please select a person from the table.");
        }
    }

    @FXML
  public void buttonSearch(ActionEvent event) {
    String searchQuery = friendSearch.getText();
    
    // Create a JSONObject and put the searchQuery in it
    JSONObject jsonQuery = new JSONObject();
    jsonQuery.put("username", "mahmoud");  // Replace "your_username" with the actual username
    jsonQuery.put("searchQuery", searchQuery);

    // Send the JSON data to the server
    int searchStatus = Server.getInstance().handleSearchFriend(jsonQuery);

    // Process the server's response
    handleSearchStatus(searchStatus);
}
    
    
    private void handleSearchStatus(int searchStatus) {
    if (searchStatus == 1) {
        System.out.println("Search operation successful.");
        // Handle the successful search operation in your UI or application logic.
    } else {
        System.out.println("Search operation failed.");
        // Handle the failure of the search operation in your UI or application logic.
    }
}

    // Helper method to convert a Person object to JSON
    private String convertPersonToJson(Person person) {
        // Use a JSON library (e.g., Jackson, Gson) to convert the Person object to JSON
        // Placeholder code (requires a JSON library):
        return "{\"username\":\"" + person.getUsername() + "\",\"email\":\"" + person.getEmail() + "\"}";
    }

    // Helper method to convert a search query to JSON
    private String convertSearchQueryToJson(String query) {
        // Convert the search query to a JSON string
        // Placeholder code:
        return "{\"query\":\"" + query + "\"}";
    }

    // Helper method to handle the server's search response
    private void handleSearchResponse(String jsonResponse) {
        // Use a JSON library to parse the server's response
        // Update the observable list with the search results
        // This depends on the structure of your JSON response
        // Placeholder code:
        List<Person> searchResults = convertJsonToSearchResults(jsonResponse);
        personList.setAll(searchResults);
    }

    // Placeholder method for converting JSON to search results
    private List<Person> convertJsonToSearchResults(String jsonResponse) {
        // Use a JSON library to parse the JSON response
        // Create and return a list of Person objects
        // Placeholder code (requires a JSON library):
        return Arrays.asList(new Person("User1", "user1@example.com"),
                             new Person("User2", "user2@example.com"));
    }

}
