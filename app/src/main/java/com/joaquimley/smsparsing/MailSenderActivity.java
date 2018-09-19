package com.joaquimley.smsparsing;

import android.app.Activity;
import android.util.Log;

public class MailSenderActivity extends Activity {


    public void sendEmail() {

        try {
            GMailSender sender = new GMailSender("utest481@gmail.com", "patientportal2018");
            sender.sendMail("This is Subject",
                    "This is Body",
                    "utest481@gmail.com",
                    "tomek.domagala@gmail.com");
        } catch (Exception e) {
            Log.e("SendMail", e.getMessage(), e);
        }

    }
}
