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

public class Product_setId_11836421463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term371;
     Object term407;

    public Product_setId_11836421463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term372 = new Long(2535595959091595249L);
        Double term386 = new Double(0.5523635872663106);
        Long term389 = new Long(-5476826692763582090L);
        ArrayList term403 = new ArrayList();
        term371 = newInstance(Class.forName("com.devsuperior.myfirstproject.entities.Product"));
        Object term388 = newInstance(Class.forName("com.devsuperior.myfirstproject.entities.Category"));
        setField(term371, term371.getClass(), "id", term372);
        setField(term371, term371.getClass(), "name", "LQFpaHEwXR");
        setField(term371, term371.getClass(), "price", term386);
        setField(term388, term388.getClass(), "id", term389);
        setField(term388, term388.getClass(), "name", "oVcInYnLWB");
        setField(term388, term388.getClass(), "products", term403);
        setField(term371, term371.getClass(), "category", term388);
        term407 = new Long(-872011222785455006L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.devsuperior.myfirstproject.entities.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term407;
        callMethod(klass, "setId", argTypes, term371, args);
    }

};


