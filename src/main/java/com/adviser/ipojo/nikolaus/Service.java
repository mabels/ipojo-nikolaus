package com.adviser.ipojo.nikolaus;

import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Invalidate;
import org.apache.felix.ipojo.annotations.Modified;
import org.apache.felix.ipojo.annotations.Property;
import org.apache.felix.ipojo.annotations.Updated;
import org.apache.felix.ipojo.annotations.Validate;


@Component(name="Nikolaus")
public class Service {
    
    @Property
    private String rudolf;
    
    @Validate
    public void start() {
        System.err.println("Start dem nikolaus sein hund "+rudolf);
    }
    
    @Updated
    public void updated() {
        System.err.println("Updated dem nikolaus sein hund "+rudolf);
    }
    
    @Invalidate
    public void delete() {
        System.err.println("Stop dem nikolaus sein hund "+rudolf);
    }
}
