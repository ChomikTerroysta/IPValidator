import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mian {


    public static void main(String[] args) {

        Pattern ipAddresRegex = Pattern.compile("(([0-1]\\d\\d)|([2][0-4]\\d)|([2][5][0-5])|(\\d\\d)|(\\d))\\.(([0-1]\\d\\d)|([2][0-4]\\d)|([2][5][0-5])|(\\d\\d)|(\\d))\\.(([0-1]\\d\\d)|([2][0-4]\\d)|([2][5][0-5])|(\\d\\d)|(\\d))\\.(([0-1]\\d\\d)|([2][0-4]\\d)|([2][5][0-5])|(\\d\\d)|(\\d))");

        Scanner sr = new Scanner(System.in);
        System.out.println("Podaj adres IP: ");
       String ipAddres = sr.nextLine();

       Matcher matcher = ipAddresRegex.matcher(ipAddres);
       boolean ipAddesValidator = matcher.matches();

       if (ipAddesValidator){
           System.out.println("Adres jest poprawny. ");
       } else {
           System.err.println("błędny adres");


    }
}}
