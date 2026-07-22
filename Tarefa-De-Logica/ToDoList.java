import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    static ArrayList<String> tarefas = new ArrayList<>();
    static ArrayList<Boolean> concluida = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== LISTA DE TAREFAS =====");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Marcar tarefa como concluída");
            System.out.println("4. Remover tarefa");
            System.out.println("5. Sair do programa");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {

                case 1:
                    System.out.print("Digite a nova tarefa: ");
                    String tarefa = scanner.nextLine();

                    tarefas.add(tarefa);
                    concluida.add(false);

                    System.out.println("Tarefa adicionada com sucesso!");
                    break;

                case 2:
                    System.out.println("\n===== TAREFAS =====");

                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa cadastrada.");
                    } else {
                        for (int i = 0; i < tarefas.size(); i++) {
                            String status = concluida.get(i) ? "[Concluída]" : "[Pendente]";
                            System.out.println((i + 1) + ". " + tarefas.get(i) + " " + status);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o número da tarefa concluída: ");
                    int numero = scanner.nextInt();

                    if (numero > 0 && numero <= tarefas.size()) {
                        concluida.set(numero - 1, true);
                        System.out.println("Tarefa marcada como concluída!");
                    } else {
                        System.out.println("Número de tarefa inválido.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o número da tarefa que deseja remover: ");
                    int remover = scanner.nextInt();

                    if (remover > 0 && remover <= tarefas.size()) {
                        tarefas.remove(remover - 1);
                        concluida.remove(remover - 1);

                        System.out.println("Tarefa removida com sucesso!");
                    } else {
                        System.out.println("Número de tarefa inválido.");
                    }
                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 5);

        scanner.close();
    }
}