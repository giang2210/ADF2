package demo.assginment3.home;

import demo.assginment3.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Menu {
    public void danhSachSV() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../danhsach/danhsachsv.fxml"));
        Main.mainStage.setTitle("Danh Sách Sinh Viên");
        Main.mainStage.setScene(new Scene(root, 600, 400));
    }

    public void capNhatSV() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../themsinhvien/themsv.fxml"));
        Main.mainStage.setTitle("Thêm Sinh Viên");
        Main.mainStage.setScene(new Scene(root, 600, 400));
        ;
    }

    public void suaTTSV() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../suasinhvien/suasv.fxml"));
        Main.mainStage.setTitle("Thêm Sinh Viên");
        Main.mainStage.setScene(new Scene(root, 600, 400));
    }
}
