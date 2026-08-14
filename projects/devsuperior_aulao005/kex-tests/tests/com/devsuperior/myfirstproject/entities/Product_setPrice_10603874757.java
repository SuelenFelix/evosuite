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

public class Product_setPrice_10603874757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term619;
     Object term655;

    public Product_setPrice_10603874757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term620 = new Long(8059786003080744426L);
        Double term634 = new Double(0.2641345529914265);
        Long term637 = new Long(-4365849114644724155L);
        ArrayList term651 = new ArrayList();
        term619 = newInstance(Class.forName("com.devsuperior.myfirstproject.entities.Product"));
        Object term636 = newInstance(Class.forName("com.devsuperior.myfirstproject.entities.Category"));
        setField(term619, term619.getClass(), "id", term620);
        setField(term619, term619.getClass(), "name", "xOEqzGAmDU");
        setField(term619, term619.getClass(), "price", term634);
        setField(term636, term636.getClass(), "id", term637);
        setField(term636, term636.getClass(), "name", "eZFUvlxvGV");
        setField(term636, term636.getClass(), "products", term651);
        setField(term619, term619.getClass(), "category", term636);
        term655 = new Double(0.36923381893433327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.devsuperior.myfirstproject.entities.Product");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term655;
        callMethod(klass, "setPrice", argTypes, term619, args);
    }

};


