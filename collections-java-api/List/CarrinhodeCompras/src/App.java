import carrinho.CarrinhoDeCompras;

public class App {
    public static void main(String[] args) throws Exception {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Arroz", 25.00, 2);
        carrinhoDeCompras.adicionarItem("Fejão", 12.00, 1);
        carrinhoDeCompras.adicionarItem("Açucar", 4.00, 3);
        carrinhoDeCompras.adicionarItem("Café", 14.00, 3);

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Café");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal(0));
    }
}
