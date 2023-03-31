package poov.projetovacinacao;
import java.util.Date;

public class Pessoa {
    //private long serialVersionUID;
    private String nome;
    private String cpf;
    private long codigo;
    private Date dataNascimento;
    private String profissoa;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, long codigo, Date dataNascimento, String profissoa) {
        this.nome = nome;
        this.cpf = cpf;
        this.codigo = codigo;
        this.dataNascimento = dataNascimento;
        this.profissoa = profissoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getProfissoa() {
        return profissoa;
    }

    public void setProfissoa(String profissoa) {
        this.profissoa = profissoa;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cpf=" + cpf + ", codigo=" + codigo + ", dataNascimento=" + dataNascimento + ", profissoa=" + profissoa + '}';
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if(this.codigo != other.codigo){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (this.codigo ^ (this.codigo >>> 32));
        return hash;
    }


    
}
