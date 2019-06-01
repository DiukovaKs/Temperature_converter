package Diukova.Main;

import Diukova.Controller.Controller;
import Diukova.Model.Temperatures;
import Diukova.View.View;

public class Main {
    public static void main(String[] args) {
        Temperatures model = new Temperatures();
        View view = new View();

        Controller controller = new Controller(model, view);
        controller.initView();
    }
}
