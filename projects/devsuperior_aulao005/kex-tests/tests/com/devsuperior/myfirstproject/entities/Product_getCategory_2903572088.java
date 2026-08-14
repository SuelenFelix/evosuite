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

public class Product_getCategory_2903572088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term677;

    public Product_getCategory_2903572088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term678 = new Long(2486810210675247493L);
        Double term692 = new Double(0.6076495596892013);
        Long term695 = new Long(7009926388951271268L);
        ArrayList term709 = new ArrayList();
        term677 = newInstance(Class.forName("com.devsuperior.myfirstproject.entities.Product"));
        Object term694 = newInstance(Class.forName("com.devsuperior.myfirstproject.entities.Category"));
        setField(term677, term677.getClass(), "id", term678);
        setField(term677, term677.getClass(), "name", "BYqFIqCKAV");
        setField(term677, term677.getClass(), "price", term692);
        setField(term694, term694.getClass(), "id", term695);
        setField(term694, term694.getClass(), "name", "vrQLuWIDJX");
        setField(term694, term694.getClass(), "products", term709);
        setField(term677, term677.getClass(), "category", term694);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.devsuperior.myfirstproject.entities.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategory", argTypes, term677, args);
    }

};


