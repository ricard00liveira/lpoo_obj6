package br.edu.ifsul.ctsi.lpoo_obj6.agenda;

import br.edu.ifsul.ctsi.lpoo_obj6.paciente.Paciente;
import br.edu.ifsul.ctsi.lpoo_obj6.secretaria.Secretaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface AgendaRepository extends JpaRepository<Agenda,Long> {
    @Query(value = "select a from Agenda a where a.data = ?1")
    List<Agenda> findByData(LocalDate data);

    List<Agenda> findByDataContaining(LocalDate data);
}
