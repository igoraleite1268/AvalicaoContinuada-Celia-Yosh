package bandtec.com.br.avalicaocontinuada1;

import bandtec.com.br.avalicaocontinuada1.Manga;

public class Weebton extends Manga {

    private Integer QtdPagina;
    private Double valorPPagina;

    public Weebton(String nome, String autor, Integer qtdPagina, Double valorPPagina) {
        super(nome, autor);
        QtdPagina = qtdPagina;
        this.valorPPagina = valorPPagina;
    }

    @Override
    public Double getCalcPreco() {
        return valorPPagina * QtdPagina;
    }

    @Override
    public String toString() {
        return "weebton{" +
                "Quantidade de Paginas " + QtdPagina +
                ", valor Por Pagina " + valorPPagina +
                ", valor da weebton " + getCalcPreco() +
                '}' + super.toString();
    }

    public Integer getQtdPagina() {
        return QtdPagina;
    }

    public Double getValorPPagina() {
        return valorPPagina;
    }
}
