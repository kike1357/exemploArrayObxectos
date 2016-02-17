package exemploarrayobxectos;

import javax.swing.JOptionPane;

/**
 *
 * @author epastorizalorenzo
 */
public class Equipo {
    Xogador[]xogadores = new Xogador[3];
    private Object JOptionpane;
public String pedirNome(){
       return JOptionPane.showInputDialog("nome :");   
        }
public int pedirDorsal(){
        return Integer.parseInt(JOptionPane.showInputDialog("dorsal :"));
        }    
public void crearArray(){
        for(int i=0; i<xogadores.length;i++){
           xogadores[i]= new Xogador(pedirNome(),pedirDorsal());
        }
}  
//visualizamos mediante un for each
public void visualizar(){
    for(Xogador xog:xogadores)
        JOptionPane.showMessageDialog(null, xog);
    
    //tamén se pode facer así:
    for(int i=0; i<xogadores.length;i++)
        System.out.println(xogadores[i]);
    
}
}
