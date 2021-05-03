import java.time.LocalDateTime;

public class Visitante extends Pessoa {
    private int numConvite;
    private String dataVisita;
    private boolean isVisitante;
    private boolean acessouClube;


    public Visitante(String nome , String cpf , LocalDateTime dataNasc ){
    super(nome, cpf, dataNasc);
    this.isVisitante = false;
    this.acessouClube = false;

    }
    
    public void comprarConvite(int numConvite , String dataVisita){
    this.numConvite = numConvite;
    this.dataVisita = dataVisita;
    this.isVisitante = true ;
    }
    
    public void imprimeVisitante(){
    if(isVisitante){
    System.out.println("Nome : " + this.nome);
    System.out.println("Cpf : " + this.cpf);
    System.out.println("Data de Nascimento : " + this.dataNasc);
    System.out.println("VISITANTE ");
    
    }
    }
    
    public int getNumConvite(){
    return this.numConvite;
    }
    
    public void setNumConvite(int numConvite){
    this.numConvite = numConvite;
    }
    
    public String getDatavisita(){
    return this.dataVisita;
    }
    
    public void setDatavisita(String dataVisita){
    this.dataVisita = dataVisita
    }

    public Boolean getisVisitante(){
        return this.isVisitante;
    }

    public void setisVisitante(boolean isVisitante){
        this.isVisitante = isVisitante;
    }

    public Boolean getacessouClube(){
        return this.acessouClube;
    }

    public void setacessouClube(boolean acessouClube){
        this.acessouClube = acessouClube;
    }
    }