package string;

public class EqualsIgnoreCaseExample {


    public static void main(String[] args) {

        String str = "javaTpoint";
        String str1 = "javatpoint";
        String str2 = "JavaTPoint.com";
        String str3 = "javaTpoint";
        String str4 = "javaPoint";

        Boolean status = str.equalsIgnoreCase(str1);
        System.out.println("srt and srt1 are equals = "+status);

        Boolean status1 = str.equalsIgnoreCase(str2);
        System.out.println("srt and srt2 are equals = "+status1);

        Boolean status2 = str.equalsIgnoreCase(str3);
        System.out.println("srt and srt3 are equals = "+status2);

        Boolean status3 = str.equalsIgnoreCase(str4);
        System.out.println("srt and srt4 are equals = "+status3);


    }
}
