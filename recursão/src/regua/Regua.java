package regua;

public class Regua{
	
 public static void main(String[] args){
		    drawRuler(2,5);
		  }
  //desenha uma marca sem rótulo
  public static void drawOneTick(int tickLenght){
	  drawOneTick(tickLenght,-1);  
  }

  //desenha uma marca
  public static void drawOneTick(int tickLenght, int tickLabel){
    for(int i=0; i<tickLenght;i++) System.out.print("-");
    if(tickLabel >=0) System.out.print(" "+ tickLabel);
    System.out.print("\n");
  }

  public static void drawTick(int tickLenght){
    // desenha marcas de certo comprimento
    if(tickLenght >0){
      drawTick(tickLenght-1);
      drawOneTick(tickLenght);
      drawTick(tickLenght-1);
    
    }
  }

  public static void drawRuler(int nIncher, int majorLenght){
    drawOneTick(majorLenght,0);
    for(int i=1; i<= nIncher;i++){
      drawTick(majorLenght -1);
      drawOneTick(majorLenght,i);
    }
  }

 
}
