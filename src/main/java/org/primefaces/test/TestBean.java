package org.primefaces.test;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@ViewScoped
@Named
public class TestBean implements Serializable {
	private static final long serialVersionUID = 6196546356425125102L;
	
	private Integer _selectedTest;

    public Integer getSelectedTest() {
        return _selectedTest;
    }
    public void setSelectedTest(Integer selectedTest) {
        _selectedTest = selectedTest;
    }
}
