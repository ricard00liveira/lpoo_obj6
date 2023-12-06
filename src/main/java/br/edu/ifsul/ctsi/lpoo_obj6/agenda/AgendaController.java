package br.edu.ifsul.ctsi.lpoo_obj6.agenda;

import org.springframework.stereotype.Controller;

import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

@Controller
public class AgendaController {
    private static final Scanner input = new Scanner(System.in);
    private static AgendaService agendaService;

    public AgendaController(AgendaService agendaService) {AgendaController.agendaService = agendaService;}
    public static void main(String[] args) {
        int opcao;
        do {
            System.out.print("\n-------  MENU AGENDA -------");
            System.out.print(
                    """
                                
                            1. Inserir horário
                            2. Alterar horário
                            3. Excluir horário
                            4. Visualizar horários

                            Opção (Zero p/sair):\s""");
            opcao = input.nextInt();
            input.nextLine();
            switch (opcao) {
                case 1 -> inserir();
              //  case 2 -> alterar();
              //  case 3 -> excluir();
                case 4 -> visualizar();
                default -> {
                    if (opcao != 0) System.out.println("Opção inválida.");
                }
            }
        } while (opcao != 0);
    }
    public static void inserir() {
        Agenda agenda = new Agenda();
        System.out.println("\n++++++ Cadastro de novo horário ++++++");
        System.out.print("Informe a data... \n");
        System.out.print("Digite o DIA: \n");
        int dia = Integer.parseInt(input.nextLine());
        System.out.print("Digite o MÊS: \n");
        int mes = Integer.parseInt(input.nextLine());
        System.out.print("Digite o ANO: \n");
        int ano = Integer.parseInt(input.nextLine());
        System.out.print("Digite as horas (HH): \n");
        int hh = Integer.parseInt(input.nextLine());
        System.out.print("Digite os minutos (MM): \n");
        int mm = Integer.parseInt(input.nextLine());
        Calendar calendar = Calendar.getInstance();
        calendar.set(ano,mes-1,dia,hh,mm,0);
        agenda.setData(calendar);
        System.out.println("Horário cadastrado com sucesso:" + agendaService.insert(agenda));
    }

    public static void visualizar() {
        System.out.println("\n++++++ Visualizar horários ++++++");
        List<Agenda> resultado = agendaService.getHorarios();
        System.out.println("\nLista dos horários cadastrados:\n");
        if(resultado.isEmpty()) {
            System.out.println("Nenhum horário cadastrado.");
        } else {
            System.out.println(resultado);
        }
    }
}
