package JavaCore1;

public class Num_6 {
    public static void main(String[] args) {
        int [] num = {10,7,11,17,6};
        int max = num [0];
        int min =num [0];
        for (int i =0; i != num.length; i++){
            if (num[i] > max){
                max = num[i];
            }
            if (num[i]< min){
                min = num[i];
            }
            }
        System.out.println("Самое большое значение ряда " +max+ " Самое маленькое значене ряда " +min);

        }
    }

