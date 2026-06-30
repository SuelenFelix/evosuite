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

public class State_getCountry_5669867563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163;

    public State_getCountry_5669867563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term205 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term205, term205.getClass(), "id", -1007160944);
        setField(term205, term205.getClass(), "name", null);
        setField(term205, term205.getClass(), "country", null);
        Object term207 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term207, term207.getClass(), "id", 0);
        setField(term207, term207.getClass(), "name", null);
        setField(term207, term207.getClass(), "country", null);
        Object term209 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term209, term209.getClass(), "id", 1193880199);
        setField(term209, term209.getClass(), "name", null);
        setField(term209, term209.getClass(), "country", null);
        ArrayList term203 = new ArrayList();
        ((ArrayList) term203).add(term205);
        ((ArrayList) term203).add(term205);
        ((ArrayList) term203).add(term205);
        ((ArrayList) term203).add(term207);
        ((ArrayList) term203).add(term209);
        term163 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term177 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term163, term163.getClass(), "id", -2068769794);
        setField(term163, term163.getClass(), "name", "SbAoxhfrkn");
        setIntField(term177, term177.getClass(), "id", -117576464);
        setField(term177, term177.getClass(), "code", "kuTXqwMtDB");
        setField(term177, term177.getClass(), "name", "Ghbwtircqb");
        setField(term177, term177.getClass(), "states", term203);
        setField(term163, term163.getClass(), "country", term177);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.State");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCountry", argTypes, term163, args);
    }

};


