
import java.sql.Timestamp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class JogoMemoriaCtrl {
    public static final int FACIL = 1;
    public static final int INTERMEDIARIO = 2;
    public static final int DIFICIL = 3;
    public static final int MAX_PECAS_PARTIDA = 18;
    public static final int MAX_PECAS_DISPONIVEIS = 20;
    
    private boolean jogoiniciado;
    private Timestamp iniciojogo;
    private int limitetempo;
    private int TabRecords[][] = {  {0,0,0},
                                    {0,0,0},
                                    {0,0,0} }; 
    private int pontuacaoAtual;
    private int nivelAtual;
    private int acertos;
    private int [] pecasPartida = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};//vetor de peças sorteadas para a patida atual
    private int [] pecasDisponiveis;//vetor de todas as peças disponiveis para o jogo 
    private int qtdPecasNivel;
    
    
    public void JogoMemoriaCtrl(){
        
    }
    public int tempoConsumido(){
        return 0;
        
    }
    public void iniciarJogo( int nivel){
        
    }
    public void sortearPecasJogo(){
        
    }
        
}