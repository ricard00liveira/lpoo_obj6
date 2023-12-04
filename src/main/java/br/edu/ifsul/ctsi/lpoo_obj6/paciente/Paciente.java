package br.edu.ifsul.ctsi.lpoo_obj6.paciente;


import br.edu.ifsul.ctsi.lpoo_obj6.consulta.Consulta;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;


@Entity
@Table(name = "pacientes")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public String nomePcnte;
    private Integer senha;
    private String usuario;
    @OneToMany(mappedBy = "paciente")
    private List<Consulta> consultas;

    @Override
    public String toString() {
        return "Paciente\n{" +
                "id=" + id +
                ", nomePcnte='" + nomePcnte + '\'' +
                ", senha=" + senha +
                ", usuario='" + usuario + '\'' +
                "}\n";
    }
}
