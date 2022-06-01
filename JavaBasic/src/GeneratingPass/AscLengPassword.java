package GeneratingPass;

import java.util.Scanner;

public class AscLengPassword extends GeneratePassword {

    public static void askPassword(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите со скольки символов должен состоять пароль? ");
        setPasswordLength(scanner.nextInt());
        System.out.println("Ваш пароль: " + getPassword());

    }
}
