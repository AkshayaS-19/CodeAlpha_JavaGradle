package codealpha_javagradle;

import com.google.common.base.Strings;

public class App {

    public String getGreeting() {
        return "Hello from CodeAlpha Gradle Project!";
    }

    public static void main(String[] args) {

        String name = "Akshu";

        if (!Strings.isNullOrEmpty(name)) {
            System.out.println("Welcome, " + name + "!");
        }

        System.out.println(new App().getGreeting());
    }
}
