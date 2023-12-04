package br.edu.ifsul.ctsi.lpoo_obj6.paciente;

import org.springframework.stereotype.Controller;

import java.util.List;
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
                            2. Visualizar pacientes
                            3. Excluir paciente

                            Opção (Zero p/sair):\s""");
            opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
                case 1 -> inserir();
                case 2 -> visualizar();
                case 3 -> excluir();
                default -> {
                    if (opcao != 0) System.out.println("Opção inválida.");
                }
            }
        } while (opcao != 0);
    }

    public static void inserir() {
        Paciente pac = new Paciente();
        System.out.println("\n++++++ Cadastro de novo Paciente ++++++");
        System.out.print("Digite o nome do paciente: ");
        pac.setNomePcnte(input.nextLine());
        pac.setSenha(123);
        pac.setUsuario(pac.getNomePcnte());
        System.out.println("Paciente cadastrado com sucesso:" + pacienteService.insert(pac));
    }

    public static void visualizar() {
        System.out.println("\n++++++ Visualizar pacientes ++++++");
        List<Paciente> resultado = pacienteService.getPacientes();
        System.out.println("\nLista dos pacientes cadastrados:\n");
        System.out.println(resultado);
    }
    public static void excluir(){
        System.out.println("\n++++++ Excluir paciente ++++++");
        Paciente pac;
        int opcao = 0;
        do {
            System.out.print("\nDigite o código do paciente (Zero p/sair): ");
            long codigo = input.nextLong();
            input.nextLine();
            if (codigo == 0) {
                opcao = 0;
            } else if(codigo > 0){
                pac = pacienteService.getPacienteById(codigo);
                if (pac == null) {
                    System.out.println("Código inválido.");
                } else {
                    System.out.println(pac);
                    System.out.print("Excluir este paciente? (1-sim/0-não) ");
                    if (input.nextInt() == 1) {
                        pacienteService.delete(pac.getId());
                        System.out.println("Paciente excluído com sucesso:\n" + pac);
                    }

                }
            } else {
                System.out.println("Digite um código válido!!!");
            }
        } while (opcao != 0);
    }
}


