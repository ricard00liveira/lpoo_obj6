package br.edu.ifsul.ctsi.lpoo_obj6.secretaria;

import br.edu.ifsul.ctsi.lpoo_obj6.paciente.Paciente;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class SecretariaController {
    private static final Scanner input = new Scanner(System.in);
    private static SecretariaService secretariaService;

    //Injeção de dependência (Não utilizou @Autowired porque o Springboot não injeta a dependência. Afinal, estamos adaptando um framework web para modo texto)
    public SecretariaController(SecretariaService secretariaServiceService) {
        SecretariaController.secretariaService = secretariaService;
    }
    public static void main(String[] args) {
    }
}
