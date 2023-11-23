package br.edu.ifsul.ctsi.lpoo_obj6.paciente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepository rep;

    public Paciente insert(Paciente paciente) {
        Assert.isNull(paciente.getId(), "Erro! Não foi possível cadastrar.");
        return rep.save(paciente);
    }
}
