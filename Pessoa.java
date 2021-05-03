import java.time.LocalDateTime;

public class Pessoa {
    private String nome;
    private String cpf;
    private LocalDateTime dataNasc;
    
    public Pessoa (String nome , String cpf , LocalDateTime dataNasc){
    setNome(nome);
    setCpf(cpf);
    setdataNasc(dataNasc);
    }
    
    public void imprimePessoa(){
    System.out.println("Nome : " + this.nome);
    System.out.println("Cpf : " + this.cpf);
    System.out.println("Data de Nascimento : " + this.dataNasc);
    }

    public void setNome(Sring nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }

    public void setdataNasc(LocalDateTime dataNasc){
        this.dataNasc = dataNasc;
    }

    public LocalDateTime getdataNasc(){
        return dataNasc;
    }


}