package br.edu.ifsul.ctsi.lpoo_obj6;

import br.edu.ifsul.ctsi.lpoo_obj6.consulta.ConsultaController;
import br.edu.ifsul.ctsi.lpoo_obj6.paciente.PacienteController;
import br.edu.ifsul.ctsi.lpoo_obj6.secretaria.SecretariaController;

import java.util.Scanner;

public class ClinicaController {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao;
        do {
            System.out.print("\n-------  CLINÍCA DENTISTA -------\n");
            System.out.print("\nSelecione sua opção: \n");
            System.out.print(
                    """
                        1. Paciente
                        2. Secretária
                        3. Consultas
                        Opção (Zero p/sair):\s""");
            opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
                case 1 -> PacienteController.main(null);
                case 2 -> SecretariaController.main(null);
                case 3 -> ConsultaController.main(null);
                default -> {
                    if (opcao != 0) System.out.println("Opção inválida.");
                }
            }
        } while(opcao != 0) ;
        System.out.println("\n\n#FIM DA APLICAÇÃO!#");
        input.close();
    }
}
