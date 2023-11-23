package br.edu.ifsul.ctsi.lpoo_obj6.paciente;

import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class PacienteController {
    private static final Scanner input = new Scanner(System.in);
    private static PacienteService pacienteService;

    public PacienteController(PacienteService pacienteService) {
        PacienteController.pacienteService = pacienteService;
    }
    public static void main(String[] args) {
        int opcao;
        do {
            System.out.print("\n\"-------  MENU PACIENTE -------\"");
            System.out.print(
                    """
    
                        1. Cadastrar paciente

                        Opção (Zero p/sair):\s""");
            opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
                case 1 -> inserir();

                default -> {
                    if (opcao != 0) System.out.println("Opção inválida.");
                }
            }
        } while (opcao != 0);
    }
    public static void inserir() {
        Paciente pac = new Paciente();
        System.out.println("\n++++++ Cadastro de novo Produto ++++++");
        System.out.print("Digite o nome do produto: ");
        pac.setNomePcnte(input.nextLine());
        System.out.println("Produto salvo com sucesso:" + pacienteService.insert(pac));
    }
}


