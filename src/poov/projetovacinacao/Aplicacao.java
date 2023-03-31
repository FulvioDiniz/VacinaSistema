package poov.projetovacinacao;

import java.sql.Date;

public class Aplicacao {
    //private long serialVersionUID;
    private long codigo;
    private Date dataAplicacao;
    private Pessoa pessoa;
    private Lote lote;
    
    public Aplicacao() {
        this(0, new Date(0), new Pessoa(), new Lote());
    }

    public Aplicacao(long codigo, Date dataAplicacao, Pessoa pessoa, Lote lote) {
        setCodigo(codigo);
        setDataAplicacao(dataAplicacao);
        setPessoa(pessoa);
        setLote(lote);
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public Date getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(Date dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    @Override
    public String toString() {
        return "Aplicacao{" + "codigo=" + codigo + ", dataAplicacao=" + dataAplicacao + ", pessoa=" + pessoa + ", lote=" + lote + '}';
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (this.codigo ^ (this.codigo >>> 32));
        hash = 97 * hash + (this.dataAplicacao != null ? this.dataAplicacao.hashCode() : 0);
        hash = 97 * hash + (this.pessoa != null ? this.pessoa.hashCode() : 0);
        hash = 97 * hash + (this.lote != null ? this.lote.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aplicacao other = (Aplicacao) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.dataAplicacao != other.dataAplicacao && (this.dataAplicacao == null || !this.dataAplicacao.equals(other.dataAplicacao))) {
            return false;
        }
        if (this.pessoa != other.pessoa && (this.pessoa == null || !this.pessoa.equals(other.pessoa))) {
            return false;
        }
        if (this.lote != other.lote && (this.lote == null || !this.lote.equals(other.lote))) {
            return false;
        }
        return true;
    }

}
