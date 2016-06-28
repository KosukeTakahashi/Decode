import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String userInput = "";
        String temp;

        System.out.print("Input the ciphers split by \':\'---");

        try {
            userInput = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if ((!userInput.equals("")) && (!userInput.equals("exit"))) {
            temp = Decry(userInput.split(":"));
            System.out.println("result : " + temp);
        } else if (userInput.equals("exit")) {
            System.exit(0);
        }

        System.out.println("Enter \'exit\' to exit.");

        main(args);
    }

    public static String Decry(String[] src) {
        StringBuilder sb = new StringBuilder();
        int temp;

        for (String res : src) {
            temp = Integer.valueOf(res, 16);
            sb.append((char)temp);
        }

        return new String(sb);
    }
}
