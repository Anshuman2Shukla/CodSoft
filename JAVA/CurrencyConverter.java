import java.util.Scanner;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.json.JSONObject;

public class CurrencyConverter {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base currency:");
        String baseCurrency = scanner.nextLine();

        System.out.println("Enter the target currency:");
        String targetCurrency = scanner.nextLine();

        System.out.println("Enter the amount:");
        double amount = scanner.nextDouble();

        double exchangeRate = getExchangeRate(baseCurrency, targetCurrency);

        double convertedAmount = amount * exchangeRate;

        System.out.println("Converted Amount in " + targetCurrency + " is: " + convertedAmount);
    }

    public static double getExchangeRate(String baseCurrency, String targetCurrency) throws Exception {
        // Replace with your actual API endpoint
        String apiEndpoint = "http://api.example.com/exchangeRate?base=" + baseCurrency + "&target=" + targetCurrency;

        URL url = new URL(apiEndpoint);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder result = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
        rd.close();

        JSONObject json = new JSONObject(result.toString());

        return json.getDouble("rate");
    }
}
