package com.wisely.propertyeditor;

import java.beans.PropertyEditorSupport;

public class DemoPropertyEditor extends PropertyEditorSupport{

    @Override
    public String getAsText() {
        DemoBean2 bean2 =(DemoBean2) getValue();
        return bean2.getClass().getName() + "," + bean2.getName() 
                                     + "," + bean2.getAddress();
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        String[] parts = text.split("-");
        try{
            DemoBean2 bean2 = new DemoBean2();
            bean2.setName(parts[0]);
            bean2.setAddress(parts[1]);
            setValue(bean2);
        }catch(Exception e){
            throw new IllegalArgumentException(e);
        }

    }

}