package com.campusdual.classroom;

import java.io.*;

public class Exercise31 {

    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            InputStream is = Exercise31.class.getResourceAsStream("/lorem.txt");
            if(is == null){
                throw new Exception("No se encontró el archivo");
            }

//            br = new BufferedReader(new FileReader(new File("src/main/resources/lorem.txt")));
            br = new BufferedReader(new InputStreamReader(is));
            String linea = "";
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(br != null){
                    br.close();
                }
            } catch(Exception e2){
                e2.printStackTrace();
            }
        }
    }
}
