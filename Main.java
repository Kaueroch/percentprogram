import java.util.Scanner;

/*************************************************************************
 * 3) Faça um programa para pagamento de comissão de vendedores de peças,
 *		levando-se em consideração que sua comissão será de 5% do total da venda
 *		e que você tem os seguintes dados:
 * 		- Identificação do vendedor
 * 		- Código da peça
 * 		- Preço unitário da peça
 * 		- Quantidade vendida

 *************************************************************************/
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      int idvendedor;
      int codigopeca;
      float preçounitário;
      double percomissao = 0.05;
        System.out.println("Qual a sua identificação?");
        idvendedor = scan.nextInt();
        System.out.println("Qual o codigo da peça?");
        codigopeca  = scan.nextInt();
        System.out.println("Qual o preço unitário da peça??");
         preçounitário  = scan.nextFloat();
         System.out.println("Qual a quantidade vendida?");
         int quant = scan.nextInt();
         double Comissao = (preçounitário * quant) * percomissao;
         System.out.println("Sua porcentagem de Comissao por venda é: " + Comissao);
    }
}