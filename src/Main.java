import java.io.File;

public class Main {

    public static void main(String[] args){
        String absolutePath = new File("").getAbsolutePath();
        String fileName = "/resources/QAP_sko56_04_n";
        SRFLP srflp = new SRFLP(absolutePath+fileName);

        /** Parametros*/
        int size = srflp.getProblemSize();
        double temperatura = 100000;
        double temperaturaMin = 0.2;
        double enfriamiento = 0.3;
        /** fin parametros*/


        SimulatedAnnealing simulatedAnnealing = new SimulatedAnnealing();

        System.out.println("Run 1");
        simulatedAnnealing.search(srflp,size,temperatura,temperaturaMin,enfriamiento,null);



    }
}
