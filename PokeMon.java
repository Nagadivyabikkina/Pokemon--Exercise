import java.util.Scanner;

public class PokeMon
{
    static float PikachuCost = 6.0f;
    static float SquirtleCost = 5.0f;
    static float CharmanderCost = 5.0f;
    public static float amountAfterDiscount(float totalAmount, int toyCnt)
    {
        if(toyCnt==3)
        {
            return totalAmount*0.8f;
        }
        else if(toyCnt==2)
        {
            return totalAmount*0.9f;
        }
        return totalAmount;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Pikachu's purchased:");
        int pikachuCnt = sc.nextInt();
        System.out.print("Enter number of Squirtle's purchased:");
        int SquirtleCnt = sc.nextInt();
        System.out.print("Enter number of Charmander's purchased :");
        int CharmanderCnt = sc.nextInt();
        float totalAmount = 0.0f;
        while (pikachuCnt>0||SquirtleCnt>0||CharmanderCnt>0)
        {
            float transactionCost = 0.0f;
            int toyCnt = 0;
            if(pikachuCnt>0)
            {
                toyCnt++;
                transactionCost+=PikachuCost;
                pikachuCnt--;
            }
            if(SquirtleCnt>0)
            {
                toyCnt++;
                transactionCost+=SquirtleCost;
                SquirtleCnt--;
            }
            if(CharmanderCnt>0)
            {
                toyCnt++;
                transactionCost+=CharmanderCost;
                CharmanderCnt--;
            }
            totalAmount += amountAfterDiscount(transactionCost, toyCnt);
        }
        String amountString =  String.format("%.2f", totalAmount);
        System.out.println("total number of toys purchased from store are:"+amountString);
    }
}

