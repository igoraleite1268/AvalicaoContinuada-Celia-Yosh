package bandtec.com.br.avalicaocontinuada1;

import bandtec.com.br.avalicaocontinuada1.Manga;

public class Shounen extends Manga {
    private Integer QtdVendido;
    private Double ValorPCat;

    public Shounen(String nome, String autor, Integer qtdVendido, Double valorPCat) {
        super(nome, autor);
        QtdVendido = qtdVendido;
        ValorPCat = valorPCat;
    }

    @Override
    public Double getCalcPreco() {
        return ValorPCat * QtdVendido;
    }


    @Override
    public String toString() {
        return "Shounem{" +
                "quantidade Vendido no mes " + QtdVendido +
                ", Valor por capitulo " + ValorPCat +
                ", capital gerado por mes " + getCalcPreco() +
                '}' + super.toString();
    }

    public Integer getQtdVendido() {
        return QtdVendido;
    }

    public Double getValorPCat() {
        return ValorPCat;
    }
}
