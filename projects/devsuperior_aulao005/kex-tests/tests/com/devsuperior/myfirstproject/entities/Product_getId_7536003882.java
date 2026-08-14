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

public class Product_getId_7536003882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315;

    public Product_getId_7536003882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term316 = new Long(-8885298608300233488L);
        Double term330 = new Double(0.3455959125047594);
        Long term333 = new Long(-4325723315152823407L);
        ArrayList term347 = new ArrayList();
        term315 = newInstance(Class.forName("com.devsuperior.myfirstproject.entities.Product"));
        Object term332 = newInstance(Class.forName("com.devsuperior.myfirstproject.entities.Category"));
        setField(term315, term315.getClass(), "id", term316);
        setField(term315, term315.getClass(), "name", "uuaPigETmJ");
        setField(term315, term315.getClass(), "price", term330);
        setField(term332, term332.getClass(), "id", term333);
        setField(term332, term332.getClass(), "name", "MxlszYVzRf");
        setField(term332, term332.getClass(), "products", term347);
        setField(term315, term315.getClass(), "category", term332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.devsuperior.myfirstproject.entities.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term315, args);
    }

};


