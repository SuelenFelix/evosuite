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

public class Product_setName_6014123915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term485;

    public Product_setName_6014123915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term486 = new Long(-6573104506744284592L);
        Double term500 = new Double(0.28570734989730284);
        Long term503 = new Long(-4920224193275732920L);
        ArrayList term517 = new ArrayList();
        term485 = newInstance(Class.forName("com.devsuperior.myfirstproject.entities.Product"));
        Object term502 = newInstance(Class.forName("com.devsuperior.myfirstproject.entities.Category"));
        setField(term485, term485.getClass(), "id", term486);
        setField(term485, term485.getClass(), "name", "tbcdzjIfER");
        setField(term485, term485.getClass(), "price", term500);
        setField(term502, term502.getClass(), "id", term503);
        setField(term502, term502.getClass(), "name", "HyxfbSQYBe");
        setField(term502, term502.getClass(), "products", term517);
        setField(term485, term485.getClass(), "category", term502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.devsuperior.myfirstproject.entities.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pCTimMblYc";
        callMethod(klass, "setName", argTypes, term485, args);
    }

};


