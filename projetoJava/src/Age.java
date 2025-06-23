import java.util.Scanner;
import java.time.Year;

public class Age {
    public static void age(String[] args)  {
        
        //Recebe nome e ano de nascimento, retorna valores e determina faixa etária.
        int currentYear = Year.now().getValue();
        Scanner scanner = new Scanner(System.in);
        System.out.println(">>>Cálculo de Idade<<<");
        
        System.out.println("> Insira seu nome: ");
        var name = scanner.nextLine();
        System.out.println("> Insira seu ano de nascimento: ");
        var birthYear = scanner.nextInt();

        //Calcula a idade subtraindo o ano atual e o ano de nascimento.
        var idade = currentYear - birthYear;
        // Operador ternário que determina faixa etária
        String ageGroup = (idade>=18) ? "Você atingiu a Maioridade!" : "Você está na Menor Idade!"; 
        System.out.printf("> Seu nome é %s e você tem %d anos; "+ ageGroup, name, idade);
    }
}
