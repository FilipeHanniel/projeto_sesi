package paralelo;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Bank {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Account account = new Account(10, "Filipe")

        System.out.println(account.getCode());
        System.out.println(account.getHolder());
        System.out.println(account.getBalance());
        sc.close();

    }
    
}
