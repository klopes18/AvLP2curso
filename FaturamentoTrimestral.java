public class FaturamentoTrimestral {
    public static void main(String[] args) {
        // faturamento
        double janeiro = 15000.0;
        double fevereiro = 17000.0;
        double marco = 23000.0;

        //  total trimestre
        double totalTrimestre = janeiro + fevereiro + marco;

        // Calcula a média mensal
        double mediaMensal = totalTrimestre / 3;

        //  resultados
        System.out.println("Faturamento total do trimestre: R$" + totalTrimestre);
        System.out.println("Média mensal de faturamento: R$" + mediaMensal);
    }
}