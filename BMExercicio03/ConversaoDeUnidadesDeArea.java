public class ConversaoDeUnidadesDeArea {
  public static double conversaoAtual_MqPq;
  public static double conversaoAtual_PqCq;
  public static double conversaoAtual_MiQ_A;
  public static double conversaoAtual_A_Pq;

  public static double Mq_Pq(double metrosQuadrados) {
    double pesQuadrados = metrosQuadrados * 10.76;
    conversaoAtual_MqPq = pesQuadrados;
    return pesQuadrados;
  }

  public static double Pq_Cq(double pesQuadrados) {
    double centsQuadrados = pesQuadrados * 929;
    conversaoAtual_PqCq = centsQuadrados;
    return centsQuadrados;
  }

  public static double MiQ_A(double milhasQuadradas) {
    double acres = milhasQuadradas * 640;
    conversaoAtual_MiQ_A = acres;
    return acres;
  }

  public static double A_Pq(double acres) {
    double pesQuadrados = acres * 43560;
    conversaoAtual_A_Pq = pesQuadrados;
    return pesQuadrados;
  }
}