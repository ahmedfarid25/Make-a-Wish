
package gui;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
    private final StringProperty username;
    private final StringProperty email;

    public Person(String username, String email) {
        this.username = new SimpleStringProperty(username);
        this.email = new SimpleStringProperty(email);
    }

    public String getUsername() {
        return username.get();
    }

    public StringProperty usernameProperty() {
        return username;
    }

    public String getEmail() {
        return email.get();
    }

    public StringProperty emailProperty() {
        return email;
    }
}
