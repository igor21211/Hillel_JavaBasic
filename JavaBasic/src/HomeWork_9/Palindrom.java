package HomeWork_9;

import java.util.Locale;

public class Palindrom {

    public static void chekPalindrom(String p) {
       String pal =  p.toLowerCase(Locale.ROOT) .replace(" ","");
        char[] a = pal.toCharArray();
        int index = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == a[index]){
                index++;
            }
        }
        if (index == a.length) {
            System.out.println("Its. palindroms");
        }else{
            System.out.println("Its. no palindroms");
        }
    }

    public static void main(String[] args) {
       String palindrom = "А роза упала на лапу азора";
       String palindrom2 = "Я иду с мечем судия";
       String notPalindrom = "привет я люблю java";
       chekPalindrom(palindrom);// пример с палиндроном
       chekPalindrom(palindrom2);//пример с палиндромом
        chekPalindrom(notPalindrom);//пример с не палиндромом

    }
}
