package uk.ucl.group21.currentviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dashboard extends AppCompatActivity {

    private final static Logger LOGGER = Logger.getLogger(LoginScreen.class.getName());
    private static FileHandler fileTxt;


    public void setup() throws IOException {
        LOGGER.setLevel(Level.WARNING);
        LOGGER.setUseParentHandlers(false);
        fileTxt = new FileHandler("Dashboard_LOG.txt");
        LOGGER.addHandler(fileTxt);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try{
            setup();
        } catch (IOException ex) {
            LOGGER.log(Level.SEVERE, ex.getStackTrace().toString(), ex);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        LOGGER.log(Level.INFO, "Dashboard has been created");
    }
}
