package br.edu.ifsul.ctsi.lpoo_obj6.agenda;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    public Calendar data;
    public String nomePcnt;

    @Override
    public String toString() {
        return "\nAgenda { " +
                "Data=" + data.get(Calendar.DAY_OF_MONTH) + "/" +
                data.get(Calendar.MONTH) + "/" + data.get(Calendar.YEAR) + " -> Hora: " +
                data.get(Calendar.HOUR_OF_DAY) + ":" + data.get(Calendar.MINUTE) + " }";
    }
}

