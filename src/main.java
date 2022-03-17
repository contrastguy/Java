import java.io.PrintStream;

public class Computador{
    //Atributos da classe 
    public int ano;
    public String processador;
    public int memoria;

    //Construtor
    public Computador(int ano , String processador, int memoria){
        this.ano= ano;
        this.processador = processador;
        this.memoria = memoria;
    }

    //métodos da classe 
    public void ligar(){
        System.out.println("Máquina Ligada!");
    }

    public void desligar(){
        System.out.println("Máquina desligada!");
    }
   

    public class Celular extends Computador{
        //Atributos da classe 
        public boolean ligaçao;
        

        //Construtor
        public Celular(int ano , String processador, int memoria){  //Parâmetros para herdar o que tem no construtor da clsse-mãe
            super(ano, processador , memoria);
            this.ligaçao = ligaçao;
        }

        //Métodos
        public void  iniciarLigaçao(){
            System.out.println("Iniciando ligação!");
        }

        public boolean getligaçao(){
            return this.ligaçao;
        }

        public  setligaçao(boolean ligaçao){
            this.ligaçao= ligaçao;
        }

    }

    public class Desktop extends Computador{
        //Atributos da classe
        public String placaDeVideo;

        //Construtor
        public Desktop(int ano, String processador , int memoria){
            super(ano, processador, memoria );
            this.placaDeVideo = placaDeVideo;
        
        }

        //Métodos da classe 
        public void iniciarPlacaVideo(){
            System.out.println("Placa de Vídeo ligada!");
        }

        public String getModelo(){
            return this.placaDeVideo;
        }


        public setModelo(String modelo){
            this.placaDeVideo = modelo;
        }
    }

    public static void main(String[]args){

        
    }

    


}   

