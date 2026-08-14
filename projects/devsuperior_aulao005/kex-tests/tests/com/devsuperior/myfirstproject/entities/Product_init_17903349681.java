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
import java.util.ArrayList;

public class Product_init_17903349681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260;
     Object term274;
     Object term276;

    public Product_init_17903349681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term260 = new Long(6967924379644551255L);
        term274 = new Double(0.13238746331190498);
        Long term277 = new Long(-2813493605142626659L);
        ArrayList term291 = new ArrayList();
        term276 = newInstance(Class.forName("com.devsuperior.myfirstproject.entities.Category"));
        setField(term276, term276.getClass(), "id", term277);
        setField(term276, term276.getClass(), "name", "NRdvgJlhkX");
        setField(term276, term276.getClass(), "products", term291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.devsuperior.myfirstproject.entities.Product");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Double");
        argTypes[3] = Class.forName("com.devsuperior.myfirstproject.entities.Category");
        Object[] args = new Object[4];
        args[0] = term260;
        args[1] = "RMFIsYGgne";
        args[2] = term274;
        args[3] = term276;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


