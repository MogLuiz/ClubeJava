import java.util.ArrayList;


public class Clube {

ArrayList<Visitante> lista = new ArrayList();
ArrayList<Socio> list = new ArrayList();

private String dataAcesso;

public void acessarClube(String dataAcesso){
if(Socio && Socio.acessoPermitido){
Socio.dataAcesso = dataAcesso;
}

if(Visitante && Visitante.dataVisita == dataAcesso){
Visitante.acessarClube = true ;
lista.add(Visitante);
}

}

public static void imprimeDiaVisita(ArrayList<Visitante> lista){
for (Visitante item: lista){
System.out.println(Visitante);
}

}

public void acessoSocioValido(){
Socio.setAcessoPermitido(true);
}

public void acessoSocioIvbalido(){
Socio.setAcessoPermitido(false);
}
}
