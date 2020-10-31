public class uzNo6_2 {
    public static void main (String[]args){
    int numX = 8;
    int numY = 8;
    int numZ = 7;
    char chNumY = 'あ';
    char chNumX = 'あ';

    boolean logicalValue1 = numX == numY ;
    System.out.println("logicalValue1:" + logicalValue1);

    boolean logicalValue2 = numX != numY ;
    System.out.println("logicalValue1:" + logicalValue2);

    boolean logicalValue3 = numX > numZ ;
    System.out.println("logicalValue1:" + logicalValue3);

    boolean logicalValue4 = numZ >= numY ;
    System.out.println("logicalValue1:" + logicalValue4);

    boolean logicalValue5 = numY <= numZ ;
    System.out.println("logicalValue1:" + logicalValue5);

    boolean logicalValue6 = chNumY == chNumX ;
    System.out.println("logicalValue1:" + logicalValue6);

    boolean logicalValue8 = logicalValue1 == logicalValue2;
    System.out.println("logicalValue1:" + logicalValue8);




    }
}
