package br.edu.ifsul.ctsi.lpoo_obj6.consulta;

import br.edu.ifsul.ctsi.lpoo_obj6.agenda.Agenda;
import br.edu.ifsul.ctsi.lpoo_obj6.paciente.Paciente;
import br.edu.ifsul.ctsi.lpoo_obj6.secretaria.Secretaria;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;

@Entity
@Table(name = "consultas")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public Calendar data;
    public String nomePcnte;
    public String nomeDents;

    @ManyToOne
    private Paciente paciente;
    @ManyToOne
    private Secretaria secretaria;
    @OneToOne
    private Agenda agenda;

}
