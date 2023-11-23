package br.edu.ifsul.ctsi.lpoo_obj6.agenda;

import br.edu.ifsul.ctsi.lpoo_obj6.secretaria.Secretaria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaRepository extends JpaRepository<Agenda,Long> {
}
