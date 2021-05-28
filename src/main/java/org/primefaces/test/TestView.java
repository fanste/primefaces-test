package org.primefaces.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class TestView implements Serializable {
    
	private static final long serialVersionUID = 1L;

    private List<String> dataList;

    @PostConstruct
    public void initialize() {
    	dataList = new ArrayList<>();
        dataList.add("A");
        dataList.add("B");
        dataList.add("C");
        dataList.add("D");
        dataList.add("E");
    }
    
    public List<String> getDataList() {
          return dataList;
    }
}
