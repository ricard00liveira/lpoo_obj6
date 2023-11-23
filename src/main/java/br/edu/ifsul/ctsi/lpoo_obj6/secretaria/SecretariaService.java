package br.edu.ifsul.ctsi.lpoo_obj6.secretaria;

import br.edu.ifsul.ctsi.lpoo_obj6.paciente.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class SecretariaService {
    @Autowired
    private SecretariaRepository rep;
}