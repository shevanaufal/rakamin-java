package firstProgram;

import java.util.Scanner;

public class percabangan {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String password = prompt("Enter password :");
        String validPassword = "Password";

        //Jika benar maka selamat datang
        //Jika salah maka error message
        if(password.equals(validPassword)){
            System.out.println("Selamat datang!");
        } else {
            System.out.println("Maaf, password salah, silahkan coba lagi");
        }
        System.out.println("Terima kasih sudah menggunakan aplikasi kami");
    }

    private static String prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}
