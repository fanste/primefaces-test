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
    
    private List<TestModel> _valueList;
    
    @PostConstruct  
    public void init() {
    	_valueList = new ArrayList<>();
    	_valueList.add(new TestModel("A"));
    	_valueList.add(new TestModel("B"));
    	_valueList.add(new TestModel("C"));
    }

    public List<TestModel> getValueList() {
        return _valueList;
    }  
    
    
    public void doPrint() {
    	for(TestModel model : _valueList) {
    		System.out.println(model.getLabel() + ": " + model.getDdValue());
    	}
    	
    	System.out.println("----------------------------------------");
    }
    
    
    public static class TestModel implements Serializable {
		private static final long serialVersionUID = -3762296213928479355L;
    	
		private String _label;
		
		private Integer _ddValue;
		
		public TestModel(String label) {
			_label = label;
		}
		
		public String getLabel() {
			return _label;
		}
		
		public Integer getDdValue() {
			return _ddValue;
		}
		
		public void setDdValue(Integer ddValue) {
			_ddValue = ddValue;
		}
    }
}
