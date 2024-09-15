import model.Cena;

public class Item {
    private Integer idItem;
    private String nome;
    private String descricaoPositiva;
    private String descricaoNegativa;
    private String comandoCorreto;
    private Cena CenaAtual;
    private Cena CenaDestino;


    ///////////////////////////////////


    public Integer getIdItem() {
        return idItem;
    }

    public void setIdItem(Integer idItem) {
        this.idItem = idItem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricaoPositiva() {
        return descricaoPositiva;
    }

    public void setDescricaoPositiva(String descricaoPositiva) {
        this.descricaoPositiva = descricaoPositiva;
    }

    public String getDescricaoNegativa() {
        return descricaoNegativa;
    }

    public void setDescricaoNegativa(String descricaoNegativa) {
        this.descricaoNegativa = descricaoNegativa;
    }

    public String getComandoCorreto() {
        return comandoCorreto;
    }

    public void setComandoCorreto(String comandoCorreto) {
        this.comandoCorreto = comandoCorreto;
    }

    public Cena getCenaAtual() {
        return CenaAtual;
    }

    public void setCenaAtual(Cena cenaAtual) {
        CenaAtual = cenaAtual;
    }

    public Cena getCenaDestino() {
        return CenaDestino;
    }

    public void setCenaDestino(Cena cenaDestino) {
        CenaDestino = cenaDestino;
    }


    ///////////////////////////////////


    @Override
    public String toString() {
        return "Item{" +
                "idItem=" + idItem +
                ", nome='" + nome + '\'' +
                ", descricaoPositiva='" + descricaoPositiva + '\'' +
                ", descricaoNegativa='" + descricaoNegativa + '\'' +
                ", comandoCorreto='" + comandoCorreto + '\'' +
                ", CenaAtual=" + CenaAtual +
                ", CenaDestino=" + CenaDestino +
                '}';
    }
}
