package br.edu.ifsul.ctsi.lpoo_obj6.secretaria;

import br.edu.ifsul.ctsi.lpoo_obj6.consulta.Consulta;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "secretarias")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Secretaria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer rg;
    @OneToMany(mappedBy = "secretaria")
    private List<Consulta> consultas;
}
