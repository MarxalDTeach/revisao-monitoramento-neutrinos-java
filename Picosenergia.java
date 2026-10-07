import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Double energia[] = new Double[10];
        double quant = 0;
        double picos = 0;
        double portapico = 0;
        double total = 0;
        double maior = 0;
        int i = 0;

        System.out.println("insira as energias em TeV");
        Scanner scanner = new Scanner(System.in);
        while (i < 10) {

            System.out.println("insira a " + (i + 1) + "º energia registrada:");
            quant = scanner.nextDouble();
            if (quant >= 0) {
                System.out.println("energia " + (i + 1) + " = " + quant + " TeV");
                energia[i] = quant;
                total = total + energia[i];
                
                if (energia[i] > 100) {
                    picos++;
                }
                if (maior < energia[i]) {
                    maior = energia[i];
                    portapico = i + 1;

                }
                i++;
            } else {
                System.out.println("valor invalido, insira um valor positivo");
            }

        }

        System.out.println("media de energia: " + total / 10);
        System.out.println("picos de energia: " + picos);
        System.out.println("maior energia registrada: " + maior + " (porta: " + portapico + ")");
    }
}
