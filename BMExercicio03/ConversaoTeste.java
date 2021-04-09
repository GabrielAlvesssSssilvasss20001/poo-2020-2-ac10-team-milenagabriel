public class ConversaoTeste {
  public static void main(String[] args) {
    System.out.println(ConversaoDeUnidadesDeArea.Mq_Pq(1));
    System.out.println(ConversaoDeUnidadesDeArea.Pq_Cq(1));
    System.out.println(ConversaoDeUnidadesDeArea.MiQ_A(1));
    System.out.println(ConversaoDeUnidadesDeArea.A_Pq(1));

    System.out.println(ConversaoDeUnidadesDeArea.conversaoAtual_MqPq);
    System.out.println(ConversaoDeUnidadesDeArea.conversaoAtual_PqCq);
    System.out.println(ConversaoDeUnidadesDeArea.conversaoAtual_MiQ_A);
    System.out.println(ConversaoDeUnidadesDeArea.conversaoAtual_A_Pq);
  }
}