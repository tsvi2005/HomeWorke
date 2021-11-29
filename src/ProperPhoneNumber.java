import java.util.Scanner;
//Ex3
public class ProperPhoneNumber {
    public static String checkPhoneNumber(String str) {
        String str1 = "";
        if ((str.length() == 10) || str.length() == 11)
        {
            if (str.charAt(0) == '0' && str.charAt(1) == '5')
            {
                if (str.charAt(4) == '-')
                {
                    str1 = str1+str;
                } else if (str.charAt(4) - str.charAt(4) == 0)
                {
                    for (int i=0;i<str.length();i++)
                    {
                        if(i==3){
                            str1 = str1 + "-";

                        }
                        str1 = str1 +str.charAt(i);
                    }
                }
            }
        }
        else if (str.length() == 12) {
            if (str.charAt(0) == '9' && str.charAt(1) == '7' && str.charAt(2) == '2')
            {
                str1 = str1 + "0";
                for (int i=3;i<str.length();i++)
                {
                    if(i==5){
                        str1 = str1 + "-";
                    }
                    str1 = str1 +str.charAt(i);
                }
            } else {
                str1 = "";
            }
        }
        else{
            if (str.length() > 12 || str.length() < 10) {
                str1 = "";
            }
        }
        return str1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your phone");
        String s = scanner.nextLine();
        System.out.println(checkPhoneNumber(s));
    }
}