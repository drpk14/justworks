/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller.users;

import controller.oferts.*;
import Entities.Ofert;
import Entities.User;
import controller.MainBusinessmanController; 
import controller.MainWorkerController;
import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXPasswordField;
import io.github.palexdev.materialfx.controls.MFXTextField; 
import java.net.URL; 
import java.util.ResourceBundle;  
import java.util.regex.Pattern; 
import javafx.event.ActionEvent;
import javafx.fxml.FXML; 
import javafx.fxml.Initializable; 
import javax.swing.JOptionPane;
import util.ValidadorDNI;
import view.JustWorkApp;
import static util.Messages.*;

/**
 * FXML Controller class
 *
 * 
 * 
 * 
 * 
 * @author David
 */
public class UserModifierController implements Initializable {

    @FXML
    private MFXTextField nameTextField; 
    @FXML
    private MFXButton confirmActionButton;   
    @FXML
    private MFXTextField dniTextField;
    @FXML
    private MFXTextField surnameTextField;
    @FXML
    private MFXTextField emailTextField;
    @FXML
    private MFXTextField userTextField;
    @FXML
    private MFXPasswordField passwordTextField;
    
    private User modifyUser;
     
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initializeData(); 
         
    }
    
    private void initializeData(){ 
            
        JustWorkApp.sendMessage(CL_USER_DETAILS);     
        String[] processedInput = JustWorkApp.recieveMessage().split(":");
        if(processedInput[0].equals(S_USER_DETAILS)){ 
            confirmActionButton.setText("Modify");
            for(int i= 1;i<processedInput.length;i=i+8){
                modifyUser = new User(processedInput[i],processedInput[i+1],processedInput[i+2],processedInput[i+3],processedInput[i+4],processedInput[i+5]);

                nameTextField.setText(modifyUser.getName());  
                dniTextField.setText(modifyUser.getDni());
                surnameTextField.setText(modifyUser.getSurname());
                emailTextField.setText(modifyUser.getEmail());
                userTextField.setText(modifyUser.getUser());
                passwordTextField.setText(modifyUser.getPassword());
            }
            
        }else{
            confirmActionButton.setText("Add");
        }   
    } 

    @FXML
    private void exitWindow(ActionEvent event) { 
        if(MainBusinessmanController.getInstance() != null){
            MainBusinessmanController.getInstance().setMainPane("/view/users/UserViewer.fxml","My Profile > Edit Profile"); 
        }else if(MainWorkerController.getInstance() != null){
            MainWorkerController.getInstance().setMainPane("/view/users/UserViewer.fxml","My Profile > Edit Profile"); 
        }
    }

    @FXML
    private void confirmAction(ActionEvent event) {
        if(confirmActionButton.getText().equals("Modify")){
            System.out.println("Check input true");
            if(checkUserInput() == true){
                if(!nameTextField.getText().equals(modifyUser.getName()) ||
                !dniTextField.getText().equals(modifyUser.getDni()) ||
                !surnameTextField.getText().equals(modifyUser.getSurname()) ||
                !emailTextField.getText().equals(modifyUser.getEmail()) ||
                !userTextField.getText().equals(modifyUser.getUser())){ 
                
                     
                    JustWorkApp.sendMessage(CL_MODIFY_USER+":"
                            +dniTextField.getText()+":"
                            +nameTextField.getText()+":"
                            +surnameTextField.getText()+":"
                            +emailTextField.getText()+":"
                            +userTextField.getText()+":"
                            +passwordTextField.getText()); 
                    
                    String[] processedInput = JustWorkApp.recieveMessage().split(":");
                    if(processedInput[1].equals("C")){
                        this.exitWindow(null);
                    } else if(processedInput[1].equals("I")){
                        JOptionPane.showMessageDialog(null, processedInput[2]);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "You must modify at least one textfield");
                }
            }
        } 
    }
 
    
    private boolean checkUserInput(){
    
        if(nameTextField.getText().contains(":") || nameTextField.getText().length() <= 0){
            JOptionPane.showMessageDialog(null, "The text fields can't  contain : or can't be empty");
            return false;
        }else if(dniTextField.getText().contains(":")){
            JOptionPane.showMessageDialog(null, "The text fields can't  contain : or can't be empty");
            return false;
        }else if(surnameTextField.getText().contains(":")|| surnameTextField.getText().length() <= 0){
            JOptionPane.showMessageDialog(null, "The text fields can't  contain : or can't be empty");
            return false;
        }else if(emailTextField.getText().contains(":")){
            JOptionPane.showMessageDialog(null, "The text fields can't  contain : or can't be empty");
            return false;
        }else if(userTextField.getText().contains(":")|| userTextField.getText().length() <= 0){
            JOptionPane.showMessageDialog(null, "The text fields can't  contain : or can't be empty");
            return false;
        }else if(passwordTextField.getText().contains(":")|| passwordTextField.getText().length() <= 0){
            JOptionPane.showMessageDialog(null, "The text fields can't  contain : or can't be empty");
            return false;
        }else if((!new ValidadorDNI(dniTextField.getText()).validar())){
            JOptionPane.showMessageDialog(null, "DNI has not a correct format");
            return false;
        }else if(emailTextField.getText().contains(":")|| emailTextField.getText().length() <= 0){
            JOptionPane.showMessageDialog(null, "The text fields can't  contain : or can't be empty");
            return false;
        } else{
            return true;
        }
             
    }
  
}
