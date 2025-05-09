import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

public class Game extends JFrame{
    private JPanel pnlMain;
    private JTextField tfName;
    private JProgressBar pbHappybar;
    private JProgressBar pbHungerbar;
    private JProgressBar pbEnergyBar;
    private JButton feedButton;
    private JButton playButton;
    private JButton restButton;
    private JButton Name;
    private JTextArea taDialog;
    private JButton btnSave;
    private JButton btnLoad;
    private Entity pet;

    public Game(){

        Name.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setName();
            }
        });
        btnSave.addActionListener(e -> {
            FileHandler.SaveFile(pet);
            taDialog.setText("File has been Saved");
        });
        btnLoad.addActionListener(e -> {
            pet = FileHandler.LoadFile();
            if(pet != null){
                tfName.setText(pet.getName());
                taDialog.setText("Pet has been loaded");
                update();
            }else{
                taDialog.setText("Failed to load Pet");
            }
        });

        playButton.addActionListener(e -> {
            pet.play();
            taDialog.setText(pet.getMessage());
            update();
        });
        feedButton.addActionListener( e ->  {
            pet.feed();
            taDialog.setText(pet.getMessage());
            update();
        });

        restButton.addActionListener(e -> {
            pet.sleep();
            taDialog.setText(pet.getMessage());
            update();
        });

    }

    public void update(){
        pbHappybar.setValue(pet.getHappiness());
        pbHappybar.setString("Happiness " + pet.getHappiness());
        pbHappybar.setStringPainted(true);

        pbHungerbar.setValue(pet.getHunger());
        pbHungerbar.setString("Hunger " + pet.getHunger());
        pbHungerbar.setStringPainted(true);

        pbEnergyBar.setValue(pet.getEnergy());
        pbEnergyBar.setString("Energy " + pet.getEnergy());
        pbEnergyBar.setStringPainted(true);
    }

    public void setName() {
        String name = tfName.getText();
        requestFocus();
        if(!name.isEmpty()){
            pet = new Pet(name);
            taDialog.setText("Your pets name is " + name );
            update();
        }else {
            taDialog.setText("Enter a valid name");
        }
    }

    public static void main(String[] args) {
        Game gui = new Game();
        gui.setContentPane(gui.pnlMain);
        gui.setSize(390, 220);
        gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gui.setVisible(true);
    }

}
