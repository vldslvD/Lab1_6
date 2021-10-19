
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=2; i<=num; i++){
            int counter = 0;
            for(int j=2; j<i; j++){
                if(i % j != 0){
                    counter++;
                }
                else{
                    counter = -1;
                    break;
                }

            }
            if(counter != -1){
                nums.add(i);
            }

        }
        System.out.println(nums);
        int max = 0;
        String b_am_one = "";
        int biggest = 0;
        for (int temp:nums) {
            String str_temp = Integer.toBinaryString(temp);
            //System.out.println(str_temp);
            char[] chars = str_temp.toCharArray();
            int count_of_one = 0;
            for (char symbol: chars) {
                if(symbol == '1'){
                    count_of_one++;
                }
            }
            if(count_of_one >= max){
                max = count_of_one;
                b_am_one = str_temp;
                biggest = temp;
            }
        }
        System.out.println(b_am_one + " = " + biggest);

    }
}
