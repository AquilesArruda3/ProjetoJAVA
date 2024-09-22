package App;

import EntidadesJava.MenuInicial;
import EntidadesJava.Pessoa;

public class App {
public static void main(String[] args) throws Exception {
    Pessoa usuario = new Pessoa("Aquiles");
    MenuInicial menu = new MenuInicial();
    menu.ChamarMenu();
}

}


