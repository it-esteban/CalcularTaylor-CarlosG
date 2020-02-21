package control;

import taylor.Taylor;

/**
 * @author Carlos Esteban González Castillo
 */


public class Control implements ActionListener{
    private Main view;
    private Taylor taylor;
   

    public Controlador(Main view,Taylor taylor){
        this.view = view;
        this.taylor = taylor;
        
    }
}
