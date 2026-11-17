/*implemente a classe Avaliacao com os atributos:
• titulo;
• uma coleção de questões.
A classe Avaliacao deverá permitir:
• Adicionar uma questão a partir de seu enunciado e sua pontuação.
• Remover uma questão.
• Exibir as questões cadastradas.
• Calcular a pontuação total.*/

import java.util.ArrayList;


public class Avaliacao {
   private  String titulo;
    private ArrayList <Questao> questoes;

    public Avaliacao (String titulo){

        this.titulo = titulo;
        this.questoes = new ArrayList<>();
    }


 
    public void adicionarQuestao (String enuciado, float pontuacao) {
        Questao q = new Questao (enuciado,pontuacao);
        questoes.add(q);
    }
    
    public void removerQuestao (String enunciado)  {

        for (int i = 0; i<questoes.size(); i++){
            if (questoes.get(i).getEnuciado().equals(enunciado)){
                questoes.remove(i);
            }
        }
    }

    public void exibirQuestoes (){

        System.out.println ("==== Exibindo Questões ==== ");

     for (int i=0; i<questoes.size(); i++){

       Questao q = questoes.get(i);
       System.out.format ("%s - %.2f \n ",q.getEnuciado(), q.getPontuacao());
    }
}
     
   public  float pontuacaoTotal (){
    float total = 0 ;

    for (int i = 0; i<questoes.size(); i++) {
      total+= questoes.get(i).getPontuacao();
    }
    return total;


     }

    
}
