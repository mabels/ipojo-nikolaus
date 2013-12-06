package de.nextaudience.db.datasource.base;

import org.apache.felix.ipojo.annotations.Component;
import org.apache.felix.ipojo.annotations.Invalidate;
import org.apache.felix.ipojo.annotations.Modified;
import org.apache.felix.ipojo.annotations.Property;
import org.apache.felix.ipojo.annotations.Updated;
import org.apache.felix.ipojo.annotations.Validate;


@Component(name="nikolaus")
public class Service {
    
    @Property
    private String rudolf;
    
    @Validate
    public void start() {
        System.err.println("Start dem nikolaus sein hund "+rudolf);
    }
    
    
    @Modified
    public void modified() {
        System.err.println("Modify dem nikolaus sein hund "+rudolf);
    }
    
    @Invalidate
    public void delete() {
        System.err.println("Stop dem nikolaus sein hund "+rudolf);
    }

    
}
