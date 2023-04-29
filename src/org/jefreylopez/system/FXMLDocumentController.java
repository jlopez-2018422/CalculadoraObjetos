 /*
    Nombre: Jefrey Eduardo López Ampérez
    Código Técnico: IN5AM
    Carné:2018422
    Fecha de creación: 16-03-2022
    Fecha de modificaciones: 2-04-2022
 */

package org.jefreylopez.system;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {
    // DECLARACIÓN
    double dato1, dato2,dato3 ,result = 0.0, suma = 0, resta = 0;
    int op, cont = 0;
    
    // BOTONES
    @FXML private Button btnMasMenos;
    @FXML private Button btnCero;  
    @FXML private Button btnPunto;  
    @FXML private Button btnIgual;
    @FXML private Button btnUno;   
    @FXML private Button btnDos; 
    @FXML private Button btnTres;
    @FXML private Button btnMas; 
    @FXML private Button btnCuatro; 
    @FXML private Button btnCinco;
    @FXML private Button btnSeis;
    @FXML private Button btnMenos;
    @FXML private Button btnSiete;
    @FXML private Button btnOcho;
    @FXML private Button btnNueve;
    @FXML private Button btnMulti;
    @FXML private Button btnUnoPor;
    @FXML private Button btnCuadrado;
    @FXML private Button btnRaiz;
    @FXML private Button btnDivi;
    @FXML private Button btnPorcentaje;
    @FXML private Button btnCE;
    @FXML private Button btnC;

    @FXML private TextField txtPantalla;
    
    // NÚMEROS 
    @FXML
    private void handleButtonAction(ActionEvent event) { 
        if (event.getSource() == btnCero)
            txtPantalla.setText(txtPantalla.getText()+"0");
        else if (event.getSource() == btnUno)
            txtPantalla.setText(txtPantalla.getText()+"1");
        else if (event.getSource() == btnDos)
            txtPantalla.setText(txtPantalla.getText()+"2");
        else if (event.getSource() == btnTres)
            txtPantalla.setText(txtPantalla.getText()+"3");
        else if (event.getSource() == btnCuatro)
            txtPantalla.setText(txtPantalla.getText()+"4");
        else if (event.getSource() == btnCinco)
            txtPantalla.setText(txtPantalla.getText()+"5");
        else if (event.getSource() == btnSeis)
            txtPantalla.setText(txtPantalla.getText()+"6");
        else if (event.getSource() == btnSiete)
            txtPantalla.setText(txtPantalla.getText()+"7");
        else if (event.getSource() == btnOcho)
            txtPantalla.setText(txtPantalla.getText()+"8");
        else if (event.getSource() == btnNueve)
            txtPantalla.setText(txtPantalla.getText()+"9");
        
        // CE    
        else if (event.getSource ()== btnCE)
            txtPantalla.clear();
        
        // C
        else if (event.getSource ()== btnC){
            dato1 = 0;
            dato2 = 0;
            dato3 = 0;
            suma = 0;
            resta = 0;
            cont = 0;
            result = 0;
            txtPantalla.clear();
            btnPunto.setDisable(false);
         
        // CUADRADO    
        }else if (event.getSource () == btnCuadrado){
            dato1 = Double.parseDouble(txtPantalla.getText());
             txtPantalla.clear();
            result = (dato1*dato1);
            txtPantalla.setText(String.valueOf(result)); 
          
        // MAS MENOS +/- 
        }else if (event.getSource() == btnMasMenos){
            dato1 = Double.parseDouble(txtPantalla.getText());
            result = (dato1*-1);
            txtPantalla.setText(String.valueOf(result));
        
        // SUMA +    
        }else if (event.getSource() == btnMas){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            suma = suma + dato1;
            op = 1; 
            btnPunto.setDisable(false);
        
        // RESTA -
        }else if (event.getSource() == btnMenos){
            while(cont==0){
                dato1 = Double.parseDouble(txtPantalla.getText());
                txtPantalla.clear();
                op = 2;
                resta = dato1;
                btnPunto.setDisable(false);
                cont=1;
            }
            while(cont==1){
                dato3 = Double.parseDouble(txtPantalla.getText());
                txtPantalla.clear();
                op = 2;
                resta = resta - dato3;
                btnPunto.setDisable(false);
            }
            
        // MULTIPLICACIÓN *               
        }else if (event.getSource() == btnMulti){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op = 3; 
            btnPunto.setDisable(false);
        
        // DIVISION /
        }else if (event.getSource() == btnDivi){
            dato1 = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            op = 4;
            btnPunto.setDisable(false);
         
        // IGUAL =       
        }if (event.getSource() == btnIgual){
             dato2 = Double.parseDouble(txtPantalla.getText());
             btnPunto.setDisable(false);
             
           switch(op){
                    // SUMA + 
                    case 1 : 
                        result = suma + dato2;
                        txtPantalla.setText(String.valueOf(result));
                    break;
                    // RESTA -
                    case  2:
                        result = resta - dato2;
                        txtPantalla.setText(String.valueOf(result));
                    break;
                    // MULTIPLICACIÓN *
                    case 3 :
                         result = (dato1*dato2);
                         txtPantalla.setText(String.valueOf(result));
                    break;
                    // DIVISION /
                    case 4: 
                         result = (dato1/dato2);
                         txtPantalla.setText(String.valueOf(result));
                    break;
                    
                    
            }
         
        // RAIZ    
        }else if (event.getSource() == btnRaiz){ 
            dato1 = Double.parseDouble(txtPantalla.getText()); 
            txtPantalla.clear();
            result = Math.sqrt(dato1);
            txtPantalla.setText(String.valueOf(result));
        
        // UNO X 1/x    
        }else if (event.getSource()== btnUnoPor){
            dato1 = Double.parseDouble(txtPantalla.getText());
            result = (1/dato1);
            txtPantalla.setText(String.valueOf(result));
        
        // PORCENTAJE 
        }else if (event.getSource() == btnPorcentaje){
            double valPantalla, valPorciento;
            valPantalla = Double.parseDouble(txtPantalla.getText());
            txtPantalla.clear();
            valPorciento = dato1 * valPantalla/100;
            txtPantalla.setText(String.valueOf(valPorciento));
        
        // PUNTO 
        }else if (event.getSource() == btnPunto){
            if(txtPantalla.getText().length() == 0){
                txtPantalla.setText("0.");
                btnPunto.setDisable(true);
            }else{
                txtPantalla.setText(txtPantalla.getText()+".");
                btnPunto.setDisable(true);
            }
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
    
}