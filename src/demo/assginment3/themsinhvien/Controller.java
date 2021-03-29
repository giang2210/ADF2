package demo.assginment3.themsinhvien;

import java.io.*;
import java.util.ArrayList;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import demo.assginment3.Main;

public class Controller {
    public TextField name;
    public  TextField age;
    public  TextField mark;
    public Text txtValidate;

    public void add(){
        try{
            FileInputStream fis = new FileInputStream("sinhvien.bin" );
            DataInputStream dis = new DataInputStream( fis);
            String txt = dis.readLine();
            ArrayList<String> arr = new ArrayList<>();
            while (txt != null){
                arr.add(txt);
                txt =dis.readLine();
            }
            FileOutputStream fos = new FileOutputStream("sinhvien.bin");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeBytes(age.getText()+"\n");
            dos.writeBytes(mark.getText()+"\n");
            for (String s : arr){
                dos.writeBytes(s+"\n");
            }
            name.setText("");
            age.setText("");
            mark.setText("");
            txtValidate.setText("them thanh cong");
            txtValidate.setDisable(false);

            Parent root = FXMLLoader.load(getClass().getResource("../danhsach/danhsachsv.fxml"));
            Main.mainStage.setScene(new Scene(root,600,400));
        }catch (IOException e){
            System.out.println("ERROR");
        }
    }
    public void back()throws  Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../home/menu.fxml"));
        Main.mainStage.setTitle("menu");
        Main.mainStage.setScene(new Scene(root,600,400));
    }
}
