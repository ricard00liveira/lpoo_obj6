package br.edu.ifsul.ctsi.lpoo_obj6.agenda;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

@Entity
@Table(name = "agenda")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Agenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public LocalDateTime data;
    public String nomePcnt;

    @Override
    public String toString() {
        return "\nAgenda {" +
                "data=" + DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").format(data)+
                " }";
    }
}

