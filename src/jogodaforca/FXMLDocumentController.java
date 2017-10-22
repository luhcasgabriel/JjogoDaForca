// João Marcelo 2017101231
//Lucas Gabriel 2017102346

package jogodaforca;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;


public class FXMLDocumentController implements Initializable {
    
    String palavras  [] = null;
    String palavras1 [] =  {"f", "o", "c", "a"};
    String palavras2 [] =  {"m", "a", "ç", "a"};
    String palavras3 [] =  {"m", "e", "s", "a"};
    String palavras4 [] =  {"b", "o", "t", "a"};
    
    Random rand = new Random();
    
    @FXML
    private TextField digite;
    
    String letras;
    int tentativas = 0, ganhar = 0;
    
    @FXML
    private Label WinLose;
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Label label3;
    @FXML
    private Label label4;
    @FXML
    private Label dica;
    @FXML
    private Button verificar;
    @FXML
    private ImageView forca;
    @FXML
    private ImageView cabeca;
    @FXML
    private ImageView bunda;
    @FXML
    private ImageView mao;
    @FXML
    private ImageView pe;
    @FXML
    private ImageView marioInicial;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        int r = rand.nextInt(4);
        
        if(r == 0){
            palavras = palavras1;
            dica.setText("Dica: Animal");
        }
        if(r == 1){
            palavras = palavras2;
            dica.setText("Dica: Fruta");
        }
        if(r == 2){
            palavras = palavras3;
            dica.setText("Dica: Objeto");
        }
        if(r == 3){
            palavras = palavras4;
            dica.setText("Dica: Vestimenta");
        }
        
    }    

    @FXML
    private void clique(ActionEvent event) {  
        letras = digite.getText();
        digite.clear();
        
            if (palavras[0].equals(letras)) {   
                label1.setText(palavras[0]);
                WinLose.setText("Palavra correta");
                ganhar++;
            }
            if (palavras[1].equals(letras)) {   
                label2.setText(palavras[1]);
                WinLose.setText("Palavra correta");
                ganhar++;
            }
            if (palavras[2].equals(letras)) {   
                label3.setText(palavras[2]);
                WinLose.setText("Palavra correta");
                ganhar++;
            }
            if (palavras[3].equals(letras)) {   
                label4.setText(palavras[3]);
                WinLose.setText("Palavra correta");
                ganhar++;
            } // Comandos para preencher a label caso a letra esteja certa
            
            if (ganhar == 4){ //Se ganhar
                Alert alertaWin = new Alert (Alert.AlertType.INFORMATION);
                alertaWin.setTitle("Jogo da forca");
                alertaWin.setHeaderText("Você ganhou!!!!");
                alertaWin.setContentText("Você acertou 4 vezes");
                alertaWin.showAndWait();
                System.exit(0);
            }
            
            
            if(!palavras[0].equals(letras) && !palavras[1].equals(letras) &&
               !palavras[2].equals(letras) && !palavras[3].equals(letras)){
                
                tentativas++;
                forca.setVisible(true);
                marioInicial.setVisible(false);

            
            if(tentativas == 2){
                cabeca.setVisible(true);

            }
            if(tentativas == 3){
                bunda.setVisible(true);

            }
            if(tentativas == 4){
                mao.setVisible(true);

            }
            if(tentativas == 5){
                pe.setVisible(true);
                
                Alert alertaLose = new Alert (Alert.AlertType.INFORMATION);
                alertaLose.setTitle("Jogo da forca");
                alertaLose.setHeaderText("Você perdeu");
                alertaLose.setContentText("Você errou 5 vezes");
                alertaLose.showAndWait();
                System.exit(0);
            }
            }
            

    }
    
    // COLOCAR VARIAVEL STRING PARA NÃO REPITIR

    @FXML
    private void clique(MouseEvent event) {
    }
    }
    

