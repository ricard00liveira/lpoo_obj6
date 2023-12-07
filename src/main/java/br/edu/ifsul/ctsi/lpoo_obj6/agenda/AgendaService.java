package br.edu.ifsul.ctsi.lpoo_obj6.agenda;

import br.edu.ifsul.ctsi.lpoo_obj6.paciente.Paciente;
import br.edu.ifsul.ctsi.lpoo_obj6.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.time.LocalDate;
import java.util.List;

@Service
public class AgendaService {
    @Autowired
    private AgendaRepository rep;

    public Agenda insert(Agenda agenda) {
        Assert.isNull(agenda.getId(), "Erro! Não foi possível cadastrar.");
        return rep.save(agenda);
    }
    public List<Agenda> getHorarios() {
        return rep.findAll();
    }
    public List<Agenda> getAgendaByData(LocalDate data){
        return rep.findByDataContaining(data);
    }
}
