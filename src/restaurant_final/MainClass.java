package restaurant_final;
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Desayuno desayuno = new Desayuno();

        for (byte i = 0; i<5; i++){
            System.out.println("Desayuno0"+(i+1)+": ");
            desayuno.desayunos[i] = input.nextLine();
        }

        for (byte j = 0; j<5; j++){
            System.out.println(desayuno.desayunos[j]);
        }
    }
}
