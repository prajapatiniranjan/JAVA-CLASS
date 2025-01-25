import java.util.Random;

public class CoinToss {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int toss1 = rand.nextInt(2); 
        int toss2 = rand.nextInt(2);
        int toss3 = rand.nextInt(2); 
        
        int headsCount = toss1 + toss2 + toss3;
        
        String result = (headsCount == 2) ? "Message: 2 heads came!" : "NO(Udaas nahi hote)";
        
        System.out.println(result);
    }
}
