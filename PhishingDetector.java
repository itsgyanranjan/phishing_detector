import java.util.Scanner;

public class PhishingDetector {

    
    public static boolean containsIPAddress(String url) {
        return url.matches(".*\\d+\\.\\d+\\.\\d+\\.\\d+.*");
    }

    
    public static boolean hasHttps(String url) {
        return url.toLowerCase().contains("https");
    }

   
    public static boolean isPhishing(String url) {
        boolean hasIP = containsIPAddress(url);
        boolean hasHttps = hasHttps(url);
        int length = url.length();


        if (hasIP && !hasHttps) {
            return true;
        }
        if (length > 75) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("🔐 Phishing URL Detector");
        System.out.print("Enter the URL to check: ");
        String url = sc.nextLine();

        if (isPhishing(url)) {
            System.out.println("🚨 Warning: This URL may be a PHISHING website!");
        } else {
            System.out.println("✅ Safe: This URL looks legitimate.");
        }

        sc.close();
    }
}
