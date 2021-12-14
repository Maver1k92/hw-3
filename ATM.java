import java.util.*;
public class ATM {
    public int countBanknotes(int sum) {
        int [] banknotes = new int []{500, 200, 100, 50, 20, 10 , 5, 2, 1};
        int result = 0;
        int index = 0;
        while(sum != 0){
            if(sum - banknotes[index] >=0){
            sum = sum - banknotes[index];
            result = result +1;
            if (sum < banknotes[index]){
                index =index +1;
            }
                }else{
            index = index +1;}
        }
        return result;
            }




    public static void main(String[] args) {
        ATM bank = new ATM();

        //Should be 16 - 5 + 4 + 7
        System.out.println(bank.countBanknotes(5376));
    }
}

