package project01.EconomyInsight;
// Resultado final da operação
public class Bloco03 {
    public static void main(String[] args){
        double Economia = Bloco02.SalarioFinal - GerenciadorFinanceiro.SomaDespesas;
        System.out.println("Ola! Com base nas informações inseridas obtivemos os sequintes resultados:");
        System.out.println("Despesas Totais: R$"+GerenciadorFinanceiro.SomaDespesas);
        System.out.println("Salário Final(Com os descontos): R$"+Bloco02.SalarioFinal);
        System.out.println("Sobou R$"+Economia+" livre para aproveitar");
    }
}
