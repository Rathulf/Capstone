import java.io.*;

public class FileHandler {
    public static void SaveFile(Entity pet) {
        try{
            FileWriter fr = new FileWriter("Pet.txt");
            fr.write(pet.getName() + "\n");
            fr.write(pet.getHappiness() + "\n");
            fr.write(pet.getHunger() + "\n");
            fr.write(pet.getEnergy() + "\n");
            fr.close();
        } catch (Exception e) {
            System.out.println("File not Saved");
        }
    }
    public static Pet LoadFile(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("Pet.txt"));
            String name = br.readLine();
            int happiness = Integer.parseInt(br.readLine());
            int hunger = Integer.parseInt(br.readLine());
            int energy = Integer.parseInt(br.readLine());
            br.close();

            Pet loadedPet = new Pet(name);
            loadedPet.setHappiness(happiness);
            loadedPet.setHunger(hunger);
            loadedPet.setEnergy(energy);
            return loadedPet;

        } catch (FileNotFoundException e) {
            System.out.println("Failed to load file");
        } catch (IOException e) {
            System.out.println("Failed to read file");
        }
        return null;
    }
}
