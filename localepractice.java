import java.util.Arrays;
import java.util.Locale;

public class localepractice {
    public static void main(String[] args) {
        Locale[] availableLocale= Locale.getAvailableLocales();
        Locale l=new Locale("EN","India");
        System.out.println("Country"+l.getCountry());

    }
}
