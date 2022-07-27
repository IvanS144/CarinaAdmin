module com.example.mdp.carinaadmin {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.mdp.carinaadmin to javafx.fxml;
    exports com.example.mdp.carinaadmin;
}