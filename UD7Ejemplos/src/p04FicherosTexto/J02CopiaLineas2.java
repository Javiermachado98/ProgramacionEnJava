package p04FicherosTexto;

import java.io.*;

public class J02CopiaLineas2 {

    public static void main(String[] args) throws IOException {
        BufferedReader streamEntrada = null;

        try {
            streamEntrada = new BufferedReader(new FileReader("src" + File.separator + "files" + File.separator + "entrada2.txt"));
            String linea;
            while ((linea = streamEntrada.readLine()) != null){

                String [] caracteres = linea.split(" ");
                System.out.println(caracteres.length);
            }
        }catch (Exception e){
            System.out.println(e);
        }finally {
            if(streamEntrada != null){
                streamEntrada.close();
            }
        }
    }

}
