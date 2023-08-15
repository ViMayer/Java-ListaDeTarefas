import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Tarefa> taskList = new ArrayList<>();
        while (true) {
            System.out.println("\n---------------| Tarefas |---------------");
            System.out.println("  1. Adicionar");
            System.out.println("  2. Remover");
            System.out.println("  3. Mostrar todas");
            System.out.println("  4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcao) {
                case 1:
                    System.out.print("Nome de sua tarefa: ");
                    String title = scanner.nextLine();
                    System.out.print("Descrição desta tarefa: ");
                    String description = scanner.nextLine();
                    taskList.add(new Tarefa(title, description));
                    break;
                case 2:
                    if (taskList.isEmpty()) {
                        System.out.println("Não temos tarefas para serem removidas.");
                    } else {
                        System.out.print("Digite o número da tarefa que quer remover: ");
                        int index = scanner.nextInt();
                        if (index >= 0 && index < taskList.size()) {
                            taskList.remove(index);
                        } else {
                            System.out.println("Ops! Parece que este número é inválido, por favor tente novamente.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("\n---------------| Tarefas |---------------");
                    System.out.println("\n===> Minhas Tarefas:");
                    if (taskList.size() >= 1) {

                        for (int i = 0; i < taskList.size(); i++) {
                            System.out.println(i + ". " + taskList.get(i));
                        }
                    } else {
                        System.out.println("  Nenhuma tarefa encontrada! :(");
                    }
                    break;
                case 4:
                    System.out.println("Obrigado pela preferência! :)");
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Escolha inválida, por favor tente novamente.");
            }
        }
    }
}
