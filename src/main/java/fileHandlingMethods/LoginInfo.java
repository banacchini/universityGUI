package fileHandlingMethods;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class LoginInfo {
    public static HashMap<String, String> getLoginInfo() throws IOException {
        HashMap<String, String> loginInfo = new HashMap<String, String>();

        BufferedReader reader = new BufferedReader(new FileReader("administratorzy.txt"));
        String line = reader.readLine();

        while (line != null){
            String[] user = line.split(",");
            loginInfo.put(user[0],user[1]);
            line = reader.readLine();
        }

        reader.close();

        return loginInfo;
    }
}
