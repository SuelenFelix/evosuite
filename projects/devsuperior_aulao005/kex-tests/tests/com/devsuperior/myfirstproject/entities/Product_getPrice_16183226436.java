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

public class Product_getPrice_16183226436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term563;

    public Product_getPrice_16183226436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term564 = new Long(8428634514691209827L);
        Double term578 = new Double(0.40176586625454525);
        Long term581 = new Long(-2585684163342970173L);
        ArrayList term595 = new ArrayList();
        term563 = newInstance(Class.forName("com.devsuperior.myfirstproject.entities.Product"));
        Object term580 = newInstance(Class.forName("com.devsuperior.myfirstproject.entities.Category"));
        setField(term563, term563.getClass(), "id", term564);
        setField(term563, term563.getClass(), "name", "hNxWaHcfhY");
        setField(term563, term563.getClass(), "price", term578);
        setField(term580, term580.getClass(), "id", term581);
        setField(term580, term580.getClass(), "name", "RkybSrpybU");
        setField(term580, term580.getClass(), "products", term595);
        setField(term563, term563.getClass(), "category", term580);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.devsuperior.myfirstproject.entities.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrice", argTypes, term563, args);
    }

};


