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
        int ano = data.get(Calendar.YEAR);
        int mes = data.get(Calendar.MONTH) + 1;
        int dia = data.get(Calendar.DAY_OF_MONTH);
        int hora = data.get(Calendar.HOUR_OF_DAY);
        int minuto = data.get(Calendar.MINUTE);

        return String.format("\nAgenda { Data=%02d/%02d/%d -> Hora: %02d:%02d }", dia, mes, ano, hora, minuto,nomePcnt);
    }
}

