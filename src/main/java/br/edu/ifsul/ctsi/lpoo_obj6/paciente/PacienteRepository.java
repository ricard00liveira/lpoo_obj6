package br.edu.ifsul.ctsi.lpoo_obj6.paciente;

import br.edu.ifsul.ctsi.lpoo_obj6.secretaria.Secretaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PacienteRepository extends JpaRepository<Paciente,Long> {
    @Query(value = "select p from Paciente p where p.nomePcnte like ?1")
    List<Paciente> findPacienteByNomePcnte(String nomePcnte);
}
