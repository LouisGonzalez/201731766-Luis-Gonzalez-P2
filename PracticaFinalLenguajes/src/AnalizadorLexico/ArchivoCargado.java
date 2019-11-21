package AnalizadorLexico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author luisGonzalez
 */
public class ArchivoCargado {

    public void cargarArchivo(JFrame frame, JTextArea areaTexto) throws FileNotFoundException, IOException {
        String texto = "";
        JFileChooser file = new JFileChooser();
        file.showOpenDialog(frame);
        File rutaDeArchivo = file.getSelectedFile();
        if (rutaDeArchivo != null) {//
            areaTexto.setText("");
            FileReader archivos = new FileReader(file.getSelectedFile());
            BufferedReader lee = new BufferedReader(archivos);
            while ((texto = lee.readLine()) != null) {
                areaTexto.append(texto + "\n");
            }
            lee.close();
        }
    }

}
