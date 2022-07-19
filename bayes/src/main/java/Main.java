import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Set;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    static ArrayList<Set<String>> listBagOfNonSpam = new ArrayList<>();
    static ArrayList<Set<String>> listBagOfSpam = new ArrayList<>();

    // tinh xac xuat P(xi=x|nhan=nonspam)
    public static double pNonSpam(String x) {
        double k = 0;
        for (var item : listBagOfNonSpam) {
            if (item.contains(x)) {
                k++;
            }
        }
        return (k + 1) / (listBagOfNonSpam.size() + 1);
    }

    public static void main(String[] args) {
        logger.info("htv");
    }
}
