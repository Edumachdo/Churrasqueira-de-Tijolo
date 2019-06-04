package Estacionamento;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aluno
 */
public class Impressao {

    public void Recibo(String placa, int numeroVaga, Calendar dataHoraEntrada, Calendar dataHoraSaida) throws IOException {
        String nomeArquivo = "Recibo_" + numeroVaga + ".txt";
        FileWriter f = new FileWriter(nomeArquivo);
        if (dataHoraSaida == null) {
            f.write(" *** Recibo de entrada ***");
        } else {
            f.write(" *** Recibo de saida ***");
        }
        f.write("-----------------------------");
        f.write("  Placa: " + placa);
        f.write("   Vaga: " + numeroVaga);
        f.write("Entrada: " + dataHoraEntrada.toString());
        if (dataHoraSaida != null) {
            f.write(" Saida: " + dataHoraSaida.toString());
            //timespan ts
            //ts = DateTime.Parse(dataHoraSaida.ToString()) - dataHoraEntrada;
            int minuto = 0;//=ts.minutes;
            // decimal.TryParse(ConfigurationManager.AppSettings["ValorMinuto"].ToString(), out valorMinuto);
            int valorMinuto = 0;//tipo decimal 
            int valorPagar = minuto * valorMinuto;//tipo decimal
            f.write("-----------------------------");
            f.write("Total de minutos: " + minuto);
            f.write(" Valor do minuto: " + valorMinuto);
            f.write("   Valor a pagar: " + valorPagar);
        }
    }
}
