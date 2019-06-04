package Diukova.Main;

import Diukova.Controller.Controller;
import Diukova.Model.Celsius;
import Diukova.Model.Model;
import Diukova.View.View;

public class Main {
    public static void main(String[] args) {
        Model model = new Celsius();
        View view = new View();

        Controller controller = new Controller(model, view);
        controller.initView();
    }
}
