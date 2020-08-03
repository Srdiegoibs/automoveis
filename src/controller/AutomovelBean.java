package controller;

import entities.Automovel;
import javax.faces.bean.ManagedBean;


@ManagedBean
public class AutomovelBean {
    private Automovel automovel = new Automovel();

    // getter e setter
    public void salva() {
        System.out.println("Marca: " + automovel.getMarca());
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }
}