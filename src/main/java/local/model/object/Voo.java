package local.model.object;

import java.util.Date;

public class Voo {

    Date data;
    int horario;
    double preco;
    
    //falta adicionar o avião, bagagemList e passageiroList

    @Override
    public String toString() {
        return String.format("Data: " + data + "\nHorario: " + horario + "Preço: R$" + preco);
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
