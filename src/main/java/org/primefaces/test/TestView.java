package org.primefaces.test;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuModel;

@Named
@ViewScoped
public class TestView implements Serializable {
    private MenuModel model;
    
    @PostConstruct
    public void __init() {
    	model = new DefaultMenuModel();

        DefaultMenuItem item1 = DefaultMenuItem.builder()
                .value("Item 1")
                .command("#{testView.doItemAction}")
                .build();

        DefaultMenuItem item2 = DefaultMenuItem.builder()
                .value("Item 2")
                .command("#{testView.doItemAction}")
                .build();
 

        model.getElements().add(item1);
        model.getElements().add(item2);
    }
    
    public MenuModel getModel() {
    	return model;
    }
    
	public void doButtonAction() {
		System.out.println("ButtonAction");
	}
	
	public void doItemAction() {
		System.out.println("ItemAction");
	}
}
