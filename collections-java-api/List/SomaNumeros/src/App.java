public class App {
    public static void main(String[] args) throws Exception {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(6);

        System.out.println("resutado da soma: " + somaNumeros.calcularSoma());

        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());

        System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());

        somaNumeros.exibirNumeros();

    }
}
