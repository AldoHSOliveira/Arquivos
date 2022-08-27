package Calculadora;

public class CalculadoraTest {

    public static void main(String[] args) {

        Soma calc = new Soma();
      
        
        int soma = calc.somar(3, 7);
        System.out.println("Resultado soma " + soma);

        soma = calc.somar(3, 0);
        System.out.println("Resultado soma" + soma);

        soma = calc.somar(0, 0);
        System.out.println("Resultado soma " + soma);

        soma = calc.somar(3, -1);
        System.out.println("Resultado soma " + soma);
        
         Subtracao calculando = new Subtracao();
        
          int subtrair = calculando.sub(4, 3);
          System.out.println("Resultado Subtracao " + subtrair);
          
          subtrair = calculando.sub(3, 0);
          System.out.println("Resultado Subtracao " + subtrair);
          
          subtrair = calculando.sub(0, 0);
          System.out.println("Resultado Subtracao " + subtrair);
          
          
          subtrair = calculando.sub(3, -1);
          System.out.println("Resultado Subtracao " + subtrair);
          
          Dividir calcular = new Dividir();
          
          float divisao = calcular.div(21,3);
          System.out.println("Resultado divisao " + divisao);
          
          divisao = calcular.div(21,0);
          System.out.println("Resultado divisao " + divisao);
          
          divisao = calcular.div(0,3);
          System.out.println("Resultado divisao " + divisao);
          
          divisao = calcular.div(0,0);
          System.out.println("Resultado divisao " + divisao);
          
          divisao = calcular.div(10,-2);
          System.out.println("Resultado divisao " + divisao);
          
          
          
          
          
          

    }
}
