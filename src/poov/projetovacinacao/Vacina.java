package poov.projetovacinacao;

public class Vacina {
    //private long serialVersionUID;
    private long codigo;
    private String nome;
    private String descricao;

    public Vacina() {
        this(0, "Lerdao", "Morreu");
    }

    public Vacina(int codigo, String nome, String descricao) {
        setCodigo(codigo);
        setNome(nome);
        setDescricao(descricao);
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Vacina [codigo=" + codigo + ", descricao=" + descricao + ", nome=" + nome + "]";
    } 

}
