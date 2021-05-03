import java.time.LocalDateTime;

public class Socio extends Pessoa{
    private int numSocio;
    private LocalDateTime dataNasc;
    private boolean acessoPermitido;
    
    public Socio(String nome , String cpf , LocalDateTime dataNasc , int numSocio){
    super(nome, cpf, dataNasc);
    setNumSocio(numSocio);
    }
    
    public int getNumSocio(){
    return this.numSocio;
    }
    
    public void setNumSocio(int numSocio){
    this.numSocio = numSocio;
    }
    
    public LocalDateTime getDataAcesso(){
    return this.dataAcesso;
    }
    
    public void setDataAcesso(LocalDateTime aAcesso){
    this.dataAcesso = dataAcesso;
    }
    
    public boolean getAcessoPermitido(){
    return this.acessoPermitido;
    }
    
    public void setAcessoPermitido(boolean acessoPermitido){
    this.acessoPermitido = acessoPermitido;
    }
    
    
    }