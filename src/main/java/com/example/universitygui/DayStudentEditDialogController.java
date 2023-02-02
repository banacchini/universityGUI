package com.example.universitygui;

import People.Course;
import People.DayStudent;
import People.Person;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import myException.AttendenceOverOneException;

import java.io.IOException;

import static stageMethods.WindowCloser.closeWindow;

public class DayStudentEditDialogController {

    private DayStudent st;
    @FXML
    private Label alertLabel;
    @FXML
    private TextField ageField;

    @FXML
    private Label ageLabel;

    @FXML
    private TextField attendanceField;

    @FXML
    private Label attendanceLabel;

    @FXML
    private ListView<Course> coursesView;

    @FXML
    private TextField indexField;

    @FXML
    private Label indexLabel;

    @FXML
    private TextField nameField;

    @FXML
    private Label nameLabel;

    @FXML
    private Button okBtn;

    @FXML
    private TextField peselField;

    @FXML
    private Label peselLabel;

    @FXML
    private TextField semesterField;

    @FXML
    private Label semesterLabel;

    @FXML
    private TextField sexField;

    @FXML
    private Label sexLabel;

    @FXML
    private TextField surnameField;

    @FXML
    private Label surnameLabel;

    @FXML
    void addCourseBtnClicked(MouseEvent event) throws IOException {
//      Przesylamy informacje o obecnym studencie do Kontrolera odpowiedzialnego za dodawanie kursow
        FXMLLoader loader = new FXMLLoader(getClass().getResource("StudentAddCoursesDataDialog.fxml"));
        Parent root = loader.load();
        StudentAddCoursesDataDialogController controller2 = loader.getController();
        controller2.setSt(st);

//      Pokazujemy okno odpowiedzialne za dodawanie kursow
        Stage stage = new Stage();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();

    }

    @FXML
    void ageEditBtnClicked(MouseEvent event) {
        int age;

        try{
            age = Integer.parseInt(ageField.getText());
            st.setAge(age);
            ageLabel.setText(ageField.getText());
            removeAlert();

        }
        catch (Exception e) {
            ageField.setStyle("-fx-text-fill: red");
            alert();

        }
    }

    @FXML
    void attendanceEditBtnClicked(MouseEvent event) {
        float attendance;

        try{
            attendance = Float.parseFloat(attendanceField.getText());

//            Moj wlasny wyjatek, jesli podana frekwencja jest wieksza niz 1 to ustawiamy ja na 1
// _____________________________________________________________________________________________________________________
            try{
                if (attendance>1){
                    throw new AttendenceOverOneException("frekwencja nie moze byc wieksza niz 1!");
                }
            } catch (AttendenceOverOneException e){
                attendance = 1;
            }
// _____________________________________________________________________________________________________________________

            st.setAttendance(attendance);
            attendanceLabel.setText(attendance*100+"%");
            removeAlert();

        }catch (Exception e){
            attendanceField.setStyle("-fx-text-fill: red");
            alert();
        }
    }

    @FXML
    void deleteCourseBtnClicked(MouseEvent event) {
            Course course = coursesView.getSelectionModel().getSelectedItem();
            if (course != null){
                st.deleteCourse(course);
            }
            updateCoursesView();
    }

    @FXML
    void indexEditBtnClicked(MouseEvent event) {
            int index;

            try{
                index = Integer.parseInt(indexField.getText());
                st.setIndex(index);
                indexLabel.setText(String.valueOf(indexField.getText()));
                removeAlert();
            } catch (Exception e){
                indexField.setStyle("-fx-text-fill: red");
                alert();
            }
    }

    @FXML
    void nameEditBtnClicked(MouseEvent event) {
            String name = nameField.getText();
            st.setName(name);
            nameLabel.setText(name);
            removeAlert();
    }

    @FXML
    void okBtnClicked(MouseEvent event) {
        closeWindow(okBtn);
    }

    @FXML
    void peselEditBtnClicked(MouseEvent event) {
        String pesel = peselField.getText();
        st.setPESEL(pesel);
        peselLabel.setText(pesel);
        removeAlert();
    }

    @FXML
    void refreshBtnClicked(MouseEvent event){
        updateCoursesView();
    }
    @FXML
    void semesterEditBtnClicked(MouseEvent event) {
        int semester;
        try{
            semester = Integer.parseInt(semesterField.getText());
            st.setSemester(semester);
            semesterLabel.setText(semesterField.getText());
            removeAlert();
        } catch (Exception e){
            semesterField.setStyle("-fx-text-fill: red");
            alert();
        }
    }

    @FXML
    void sexEditBtnClicked(MouseEvent event) {
        String sex = sexField.getText();
        st.setSex(sex);
        sexLabel.setText(sex);
        removeAlert();
    }

    @FXML
    void surnameEditBtnClicked(MouseEvent event) {
        String surname = surnameField.getText();
        st.setSurname(surname);
        surnameLabel.setText(surname);
        removeAlert();
    }

    public void setStudent(Person p){

        if(p instanceof DayStudent) {
            st = (DayStudent) p;

//        Przypisujemy labelom informacje wejsciowe o Studencie Dziennym
            nameLabel.setText(st.getName());
            surnameLabel.setText(st.getSurname());
            peselLabel.setText(st.getPESEL());
            ageLabel.setText(String.valueOf(st.getAge()));
            sexLabel.setText(st.getSex());
            indexLabel.setText(String.valueOf(st.getIndex()));
            semesterLabel.setText(String.valueOf(st.getSemester()));
            attendanceLabel.setText(st.getAttendance() * 100 + "%");

//        Wyswietlamy poczatkowa liste kursow studenta
            coursesView.getItems().setAll(st.getCoursesList());
        }
    }

    public void updateCoursesView(){
        coursesView.getItems().setAll(st.getCoursesList());
    }

    public void alert(){
        alertLabel.setText("Sprawdz poprawnosc danych!");
    }

    public void removeAlert(){
        alertLabel.setText("");
    }

}
