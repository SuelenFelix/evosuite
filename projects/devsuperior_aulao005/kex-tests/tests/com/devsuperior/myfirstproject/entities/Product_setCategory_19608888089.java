package com.devsuperior.myfirstproject.entities;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.devsuperior.myfirstproject.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Double;
import java.lang.Object;
import java.util.ArrayList;

public class Product_setCategory_19608888089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term733;
     Object term769;

    public Product_setCategory_19608888089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term734 = new Long(-7672528020740371001L);
        Double term748 = new Double(0.37773193782763337);
        Long term751 = new Long(-4502405999831680926L);
        ArrayList term765 = new ArrayList();
        term733 = newInstance(Class.forName("com.devsuperior.myfirstproject.entities.Product"));
        Object term750 = newInstance(Class.forName("com.devsuperior.myfirstproject.entities.Category"));
        setField(term733, term733.getClass(), "id", term734);
        setField(term733, term733.getClass(), "name", "flxyYxBRtu");
        setField(term733, term733.getClass(), "price", term748);
        setField(term750, term750.getClass(), "id", term751);
        setField(term750, term750.getClass(), "name", "OclPbYPkcH");
        setField(term750, term750.getClass(), "products", term765);
        setField(term733, term733.getClass(), "category", term750);
        Long term770 = new Long(1967728129628047933L);
        ArrayList term784 = new ArrayList();
        term769 = newInstance(Class.forName("com.devsuperior.myfirstproject.entities.Category"));
        setField(term769, term769.getClass(), "id", term770);
        setField(term769, term769.getClass(), "name", "IoAlmYsBwc");
        setField(term769, term769.getClass(), "products", term784);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.devsuperior.myfirstproject.entities.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.devsuperior.myfirstproject.entities.Category");
        Object[] args = new Object[1];
        args[0] = term769;
        callMethod(klass, "setCategory", argTypes, term733, args);
    }

};


