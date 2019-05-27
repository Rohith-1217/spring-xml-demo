package com.stackroute.awareinterface;

import org.springframework.beans.factory.BeanNameAware;

public class BeanNameAwareDemo implements BeanNameAware {
    @Override
    public void setBeanName(String s) {
        System.out.println("bean name = "+s);
    }
}