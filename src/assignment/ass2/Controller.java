package assignment.ass2;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

import static javafx.scene.control.cell.TextFieldTableCell.*;

public class Controller implements  Initializable {
    public TextField txtName;
    public TextField txtAge;
    public TextField txtMark;
    public Button btnSort;
    public Text txtValidate;
    public TableView<Student> txtRs;
    public TableColumn<Student, String> tenSV;
    public TableColumn<Student, String> tuoiSV;
    public TableColumn<Student, String> diemSV;
    ObservableList<Student> ds = FXCollections.observableArrayList();
    static boolean sortType = false;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tenSV.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
        tuoiSV.setCellValueFactory(new PropertyValueFactory<Student, String>("age"));
        diemSV.setCellValueFactory(new PropertyValueFactory<Student, String>("mark"));
        editable();

    }

    public void input() {
        try {
            String n = txtName.getText();
            String a = txtAge.getText();
            String m = txtMark.getText();

            if (!n.isEmpty()) {
                Student s = new Student(n, a, m);
                ds.add(s);

                txtValidate.setText("");
                txtName.setText("");
                txtAge.setText("");
                txtMark.setText("");
                txtRs.setItems(ds);
            } else {
                txtValidate.setText("Vui lòng nhập tên, tuổi và điểm thi");
                txtValidate.setDisable(false);
            }
        } catch (Exception e) {
            txtValidate.setText("Vui lòng nhập tên, tuổi và điểm thi");
            txtValidate.setDisable(false);
        }
    }

    public void editable() {
        tenSV.setCellFactory(TextFieldTableCell.forTableColumn());
        tenSV.setOnEditCommit(e -> {
            e.getTableView().getItems().get(e.getTablePosition().getRow()).setName(e.getNewValue());
        });
        tuoiSV.setCellFactory(TextFieldTableCell.forTableColumn());
        tuoiSV.setOnEditCommit(e -> {
            e.getTableView().getItems().get(e.getTablePosition().getRow()).setAge(e.getNewValue());
        });
        diemSV.setCellFactory(TextFieldTableCell.forTableColumn());
        diemSV.setOnEditCommit(e -> {
            e.getTableView().getItems().get(e.getTablePosition().getRow()).setMark(e.getNewValue());
        });
        txtRs.setEditable(true);
    }
}
