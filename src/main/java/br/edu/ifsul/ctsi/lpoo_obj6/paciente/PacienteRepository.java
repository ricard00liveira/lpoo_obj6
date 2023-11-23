package br.edu.ifsul.ctsi.lpoo_obj6.paciente;

import br.edu.ifsul.ctsi.lpoo_obj6.secretaria.Secretaria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente,Long> {
}
