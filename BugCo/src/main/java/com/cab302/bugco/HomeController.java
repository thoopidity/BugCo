package com.cab302.bugco;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HomeController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextArea terminalArea;
    @FXML
    private TextArea leaderboardArea;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    private void initialize() {
        terminalArea.setText(String.join("\n",
                "C:\\USER\\ADMIN> INITIALISING TERMINAL...",
                "C:\\USER\\ADMIN> LOADING SECURITY PROTOCOLS...",
                "C:\\USER\\ADMIN> SYSTEM READY",
                "",
                "! RESTRICTED ACCESS TERMINAL !",
                "PLEASE ENTER YOUR OPERATIVE DESIGNATION TO BEGIN HACKING CHALLENGES.",
                "",
                "C:\\USER\\ADMIN> "
        ));

        leaderboardArea.setText(String.join("\n",
                "C:\\USER\\ADMIN> INITIALISING LEADERBOARD..",
                "",
                "! EASY CHALLENGE !",
                " > 1ST  NORMAN",
                " > 2ND  BEEBOP123",
                " > 3RD  MR.RUFUS",
                "",
                "! HARD CHALLENGE !",
                " > 1ST  NORMAN",
                " > 2ND  MR.RUFUS",
                " > 3RD  BEEBOP123"
        ));
    }
    private void onLogin() {
        // appendTerminal("Attempting login for: " + codename());
    }
    private void onRegister() {
        // appendTerminal("Registering new operative: " + codename());
    }
    private void onGameInfo() {
        // appendTerminal("Opening game brief: Identify bugs, patch systems, climb the leaderboard.");
    }
    private void onStart() {
        // appendTerminal("Initialising hacking protocols... stand by.");
        // TODO: route to game scene
    }
    private String codename() {
        // var s = usernameField.getText();
        // return (s == null || s.isBlank()) ? "<unknown>" : s.trim();
        return "";
    }

    private void appendTerminal(String line) {
        terminalArea.appendText("\n" + line);
    }
}