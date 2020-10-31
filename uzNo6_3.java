public class uzNo6_3 {
    public static void main(String[]args) {
        int numX = 8;
        int numY = 4;
        int numZ = 5;

        boolean logicalValue1 = numX != numY && numY > numZ;
        System.out.println("logicalValue1:" + logicalValue1);

        boolean logicalValue2 = numX != numY || numY > numZ;
        System.out.println("logicalValue2:" + logicalValue2);
        
        boolean logicalValue3 = numX != numY ^ numY > numZ;
        System.out.println("logicalValue3:" + logicalValue3);

         boolean logicalValue４ = !logicalValue3;
        System.out.println("logicalValue4:" + logicalValue４);

        
    }
}
