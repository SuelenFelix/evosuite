package com.fatihhernn.ecommerce.entities;

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
import static com.fatihhernn.ecommerce.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class State_getId_4573629821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public State_getId_4573629821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term43 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term43, term43.getClass(), "id", 1484323161);
        setField(term43, term43.getClass(), "name", null);
        setField(term43, term43.getClass(), "country", null);
        Object term45 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term45, term45.getClass(), "id", 1227103734);
        setField(term45, term45.getClass(), "name", null);
        setField(term45, term45.getClass(), "country", null);
        Object term47 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term47, term47.getClass(), "id", 0);
        setField(term47, term47.getClass(), "name", null);
        setField(term47, term47.getClass(), "country", null);
        Object term49 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term49, term49.getClass(), "id", 0);
        setField(term49, term49.getClass(), "name", null);
        setField(term49, term49.getClass(), "country", null);
        Object term51 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term51, term51.getClass(), "id", 0);
        setField(term51, term51.getClass(), "name", null);
        setField(term51, term51.getClass(), "country", null);
        ArrayList term41 = new ArrayList();
        ((ArrayList) term41).add(term43);
        ((ArrayList) term41).add(term45);
        ((ArrayList) term41).add(term47);
        ((ArrayList) term41).add(term49);
        ((ArrayList) term41).add(term51);
        term1 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term15 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term1, term1.getClass(), "id", 568599855);
        setField(term1, term1.getClass(), "name", "PAEBtnZtTD");
        setIntField(term15, term15.getClass(), "id", 1162663216);
        setField(term15, term15.getClass(), "code", "sjlJAEtRrb");
        setField(term15, term15.getClass(), "name", "MuLcgQHgqz");
        setField(term15, term15.getClass(), "states", term41);
        setField(term1, term1.getClass(), "country", term15);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.State");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};


