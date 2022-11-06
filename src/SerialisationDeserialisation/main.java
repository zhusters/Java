package SerialisationDeserialisation;

import java.io.*;

public class main {
    public static void main(String[] args) {
        File f = new File ("C:\\Users\\Alexandr\\BSUIR\\Java\\testzhigul.txt");
        Car zhigul  = new Car(100,"lastocka");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))){
            // сериализация
            oos.writeObject(zhigul);


            // десериализация
          Car сar = (Car)ois.readObject();
            System.out.println(сar);
        }catch (IOException e){
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
