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

public class Product_getName_19736783374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term429;

    public Product_getName_19736783374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term430 = new Long(-316468845751588286L);
        Double term444 = new Double(0.544608645520025);
        Long term447 = new Long(5127676408959197577L);
        ArrayList term461 = new ArrayList();
        term429 = newInstance(Class.forName("com.devsuperior.myfirstproject.entities.Product"));
        Object term446 = newInstance(Class.forName("com.devsuperior.myfirstproject.entities.Category"));
        setField(term429, term429.getClass(), "id", term430);
        setField(term429, term429.getClass(), "name", "aJlieCFVtF");
        setField(term429, term429.getClass(), "price", term444);
        setField(term446, term446.getClass(), "id", term447);
        setField(term446, term446.getClass(), "name", "ZiaGIbnzTs");
        setField(term446, term446.getClass(), "products", term461);
        setField(term429, term429.getClass(), "category", term446);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.devsuperior.myfirstproject.entities.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term429, args);
    }

};


