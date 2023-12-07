package br.edu.ifsul.ctsi.lpoo_obj6.paciente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {
    @Autowired
    private PacienteRepository rep;

    public Paciente insert(Paciente paciente) {
        Assert.isNull(paciente.getId(), "Erro! Não foi possível cadastrar.");
        return rep.save(paciente);
    }
    public List<Paciente> getPacientes() {
        return rep.findAll();
    }
    public void delete(Long id) {
        rep.deleteById(id);
    }

    public Paciente getPacienteById(Long id) {
        Optional<Paciente> optional = rep.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    public Paciente update(Paciente paciente) {
        Assert.notNull(paciente.getId(),"Não foi possível atualizar o registro");

        Optional<Paciente> optional = rep.findById(paciente.getId());
        if(optional.isPresent()) {
            Paciente db = optional.get();
            db.setNomePcnte(paciente.getNomePcnte());
            db.setUsuario(paciente.getUsuario());
            db.setSenha(paciente.getSenha());
            rep.save(db);

            return db;
        } else {
            return null;
        }
    }

    public List<Paciente> buscarNome(String s) {
        return rep.findPacienteByNomePcnte(s+"%");
    }
}
