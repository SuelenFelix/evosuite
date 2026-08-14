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

public class Product_equals_23008485511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term874;
     Object term910;

    public Product_equals_23008485511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term875 = new Long(-5892135042702373494L);
        Double term889 = new Double(0.5183269973490326);
        Long term892 = new Long(5262507301787091109L);
        ArrayList term906 = new ArrayList();
        term874 = newInstance(Class.forName("com.devsuperior.myfirstproject.entities.Product"));
        Object term891 = newInstance(Class.forName("com.devsuperior.myfirstproject.entities.Category"));
        setField(term874, term874.getClass(), "id", term875);
        setField(term874, term874.getClass(), "name", "dWRymuLBtr");
        setField(term874, term874.getClass(), "price", term889);
        setField(term891, term891.getClass(), "id", term892);
        setField(term891, term891.getClass(), "name", "AijpHYOFuy");
        setField(term891, term891.getClass(), "products", term906);
        setField(term874, term874.getClass(), "category", term891);
        term910 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.devsuperior.myfirstproject.entities.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term910;
        callMethod(klass, "equals", argTypes, term874, args);
    }

};


