
public class lab1 {
  public static void main(String[] args){
    Short[] c = new Short [8];
    for(Short i = 21, j = 0; i >= 7; i--, i--, j++){
      c[j] = i;
    }

    float[] x = new float [14];
    for(int i = 0; i < 14; i++){
      x[i] = ((float)Math.random() * 9 - 2);
    }
    Double[][] array = new Double[8][14];
    for(int i = 0; i < 8; i++){
      for(int j = 0; j < 14; j++){
        switch(c[i]){
          case(11):
            array[i][j] = Math.pow((Math.pow((Math.asin((x[j] + 2.5) / 9)), Math.atan((x[j] + 2.5) / 9))), 
            (Math.log(Math.pow(Math.PI / 2 * (Math.abs(x[j] + 1)), x[j])) - 1) / Math.pow(Math.cos(x[j]), 1/3));
            break;
          case(7 | 9 | 13 | 15):
            array[i][j] = Math.pow((Math.pow(Math.pow(2 / x[j], 3), Math.log(Math.abs(x[j])) / 12)),(0.25/(Math.atan(Math.pow((x[j] + 2.5) / 9, 2)) - Math.PI)));
            break;
          default:
            array[i][j] = Math.atan(Math.pow(Math.E, Math.pow((-Math.abs(Math.pow(Math.E, Math.cos(x[j])))), 1/3)));
          }
      }
    }
    for(int i = 0; i < 8; i++){
      for(int j = 0; j < 14; j++){
        System.out.printf("%.2f", array[i][j]);
        System.out.print(" ");
      }
      System.out.println();
    }
    
}}
