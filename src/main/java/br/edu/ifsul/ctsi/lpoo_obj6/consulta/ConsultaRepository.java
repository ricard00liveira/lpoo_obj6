package br.edu.ifsul.ctsi.lpoo_obj6.consulta;

import br.edu.ifsul.ctsi.lpoo_obj6.secretaria.Secretaria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultaRepository extends JpaRepository<Consulta,Long> {
}
