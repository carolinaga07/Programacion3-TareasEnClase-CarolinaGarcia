package controller;

import java.lang.classfile.Label;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class PrincipalController {

    @FXML
    private TextField txtCantidad;

    @FXML
    private Label lblMensaje;

    @FXML
    private Label lblResultado;


    @FXML
    public void ConvertircantidadDolar(KeyEvent event) throws Exception{
       
        String cantidad = txtCantidad.getText();

        if(cantidad.isEmpty()){
            lblMensaje.setText("Debe ingresar una cantidad..");
        }

        double dinero = Double.parseDouble(cantidad);

        double DineroConvertido = dinero/59.00;

        lblResultado.setText("RD$ " +dinero+ "equivale a " + DineroConvertido);




    }
    
}
