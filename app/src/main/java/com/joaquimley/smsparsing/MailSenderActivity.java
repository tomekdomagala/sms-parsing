package com.joaquimley.smsparsing;

import android.app.Activity;
import android.util.Log;

public class MailSenderActivity extends Activity {


    public void sendEmail(String smsBody) {

        try {
            GMailSender sender = new GMailSender("utest481@gmail.com", "patientportal2018");
            sender.sendMail("MyGovID verification code",
                    smsBody,
                    "utest481@gmail.com",
                    "utest481@gmail.com");
        } catch (Exception e) {
            Log.e("SendMail", e.getMessage(), e);
        }

    }
}
