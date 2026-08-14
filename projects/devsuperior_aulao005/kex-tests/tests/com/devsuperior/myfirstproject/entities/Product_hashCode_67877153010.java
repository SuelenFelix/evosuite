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

public class Product_hashCode_67877153010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term818;

    public Product_hashCode_67877153010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term819 = new Long(2120084523938730454L);
        Double term833 = new Double(0.8474802076607362);
        Long term836 = new Long(6855071767938501807L);
        ArrayList term850 = new ArrayList();
        term818 = newInstance(Class.forName("com.devsuperior.myfirstproject.entities.Product"));
        Object term835 = newInstance(Class.forName("com.devsuperior.myfirstproject.entities.Category"));
        setField(term818, term818.getClass(), "id", term819);
        setField(term818, term818.getClass(), "name", "TEParAifyi");
        setField(term818, term818.getClass(), "price", term833);
        setField(term835, term835.getClass(), "id", term836);
        setField(term835, term835.getClass(), "name", "OWDIEULEFu");
        setField(term835, term835.getClass(), "products", term850);
        setField(term818, term818.getClass(), "category", term835);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.devsuperior.myfirstproject.entities.Product");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term818, args);
    }

};


