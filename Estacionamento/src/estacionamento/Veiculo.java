/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;


/**
 *
 * @author edu_g
 */
public class Veiculo {
        public String Placa;
        public String Descricao;
        public String ClienteNome;

    @Override
    public String toString() {
        return "Veiculo{" + "Placa=" + Placa + ", Descricao=" + Descricao + ", ClienteNome=" + ClienteNome + ", ClienteTelefone=" + ClienteTelefone + ", EstacionadoNaVaga=" + EstacionadoNaVaga + '}';
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public String getClienteNome() {
        return ClienteNome;
    }

    public void setClienteNome(String ClienteNome) {
        this.ClienteNome = ClienteNome;
    }

    public String getClienteTelefone() {
        return ClienteTelefone;
    }

    public void setClienteTelefone(String ClienteTelefone) {
        this.ClienteTelefone = ClienteTelefone;
    }

    public int getEstacionadoNaVaga() {
        return EstacionadoNaVaga;
    }

    public void setEstacionadoNaVaga(int EstacionadoNaVaga) {
        this.EstacionadoNaVaga = EstacionadoNaVaga;
    }
        public String ClienteTelefone;
        public int EstacionadoNaVaga;
}




   
