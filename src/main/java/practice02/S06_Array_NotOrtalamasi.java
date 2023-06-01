package practice02;

public class S06_Array_NotOrtalamasi {
    public static void main(String[] args) {
        /*
        Bir öğrenci sınıfının notlarını içeren bir array verildiğinde,
        bu notların ortalamasını hesaplayan bir program yazın.
        {84, 91, 76, 85, 98}
    */

        int not[] = {84, 91, 76, 85, 98};
        int sum = 0;

        for (int w: not){
            sum += w;
        }
        double avg = sum/not.length;
        System.out.println(avg);
    }
}
