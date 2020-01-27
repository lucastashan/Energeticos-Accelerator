import java.io.*;

public class Main {
    public static void main(String[] args){
        double totalDeImpostos = 0;
        double total = 0;
        double totalFinal = 0;
        double descontoFinal = 0;
        double ICMS, IPI, PIS, COFINS;
        try{
            FileReader arqR = new FileReader("/home/optimus/Desktop/energeticos/src/entrada.txt");
            BufferedReader readArq = new BufferedReader(arqR);

            FileWriter arqW = new FileWriter("nota_fiscal.txt");
            PrintWriter writeArq = new PrintWriter(arqW);

            String line = readArq.readLine();
            while (line != null) {
                String[] arr = line.split(";");
                String supermercardo = arr[0];
                int quantidade = Integer.parseInt(arr[1].substring(1));
                double desconto = desconto(quantidade);
                double valor = quantidade * 4.5;

                ICMS = valor * 0.18;
                IPI = valor * 0.04;
                PIS = valor * 0.0186;
                COFINS = valor * 0.0854;
                double impostos = ICMS + IPI + PIS + COFINS;
                total = valor + impostos - desconto;

                writeArq.println("Cliente:"+ supermercardo);
                writeArq.printf("ICMS: R$%.2f; IPI: R$%.2f; PIS: R$%.2f; COFINS: R$%.2f; TOTAL(COM DESCONTO): R$%.2f;\n",ICMS,IPI,PIS,COFINS,total);
                writeArq.println();

                totalDeImpostos += impostos;
                totalFinal += (total-impostos);
                descontoFinal += desconto;

                line = readArq.readLine();
            }
            writeArq.printf("Total impostos: R$%.2f\n",totalDeImpostos);
            writeArq.printf("Total mercadorias: R$%.2f\n",totalFinal);
            writeArq.printf("Total desconto: R$%.2f\n",descontoFinal);
            writeArq.printf("Total geral: R$%.2f\n",totalDeImpostos+totalFinal-descontoFinal);

            arqW.close();
            arqR.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static double desconto(int quantidade){
        int x = quantidade / 50;
        double y = quantidade * 4.5 * 0.01;
        return y * x;
    }
}
