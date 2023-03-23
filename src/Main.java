public class Main {
    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercício calculadora:");
        Calculadora.soma(5, 8);
        Calculadora.subtracao(17, 4);
        Calculadora.multiplicacao(9, 5);
        Calculadora.divisao(18, 3);

        //Mensagem
        System.out.println("\nExercício mensagem:");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(23);

        //Empréstimo
        System.out.println("\nExercício empréstimo:");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

        //Quadrilátero
        System.out.println("\nExercício quadrilátero:");
        Quadrilatero.area(4);
        Quadrilatero.area(4.5, 2);
        Quadrilatero.area(4, 2, 3);
        Quadrilatero.area(5f, 10f);

        //Retornos
        System.out.println("\nExercício retornos:");

        double areaQuadrado = QuadrilateroRetorno.area(4);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = QuadrilateroRetorno.area(4.5, 2);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = QuadrilateroRetorno.area(4, 2, 3);
        System.out.println("Área do trapézio: " + areaTrapezio);
    }
}
