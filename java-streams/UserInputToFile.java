// 3. Read User Input from Console

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


class UserInputToFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Name: ");
        String name = reader.readLine();
        System.out.print("Enter Age: ");
        String age = reader.readLine();
        System.out.print("Enter Favorite Language: ");
        String language = reader.readLine();
        try (FileWriter fw = new FileWriter("user_data.txt")) {
            fw.write("Name: " + name + "\nAge: " + age + "\nLanguage: " + language);
            System.out.println("Data saved.");
        }
    }
}