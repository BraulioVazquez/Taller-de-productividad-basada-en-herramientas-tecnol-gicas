
package PAIM;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Graphics2D;
//archivos
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
//librerias ajenas a itext
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.Spring.height;
import static javax.swing.Spring.width;
import javax.swing.filechooser.FileNameExtensionFilter;
//import javax.swing.text.Document;
import sun.applet.Main;

public class pdf {
 
  private File ruta_destino=null;
    
    public pdf(){    
    }
    
    
    
    /* abre la ventana de dialogo GUARDAR*/
    public void Colocar_Destino(){
        
    }
     
