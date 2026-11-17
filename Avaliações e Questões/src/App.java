public class App {
    public static void main(String[] args) throws Exception {
         Avaliacao prova1 = new Avaliacao ("Prova 1");

         String q1 = "faca um algoritmo que faça uma classe de cachorro e sua raça";
         String q2 = "carlos possui 10 batatas e perdeu 5 batatas quantas batatas faltam?";

         prova1.adicionarQuestao (q1, 3);
         prova1.adicionarQuestao (q2, 1);

         prova1.exibirQuestoes();

         System.out.format ("--- pontuação total: %.2f ---\n", prova1.pontuacaoTotal());

         prova1.removerQuestao(q2);
        
         prova1.exibirQuestoes();
        
         System.out.format ("--- pontuação total: %.2f ---", prova1.pontuacaoTotal());
       
      



    }
}
