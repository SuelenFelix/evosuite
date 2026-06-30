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

public class State_getName_18218463532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85;

    public State_getName_18218463532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term127 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term127, term127.getClass(), "id", 1585847225);
        setField(term127, term127.getClass(), "name", null);
        setField(term127, term127.getClass(), "country", null);
        Object term129 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term129, term129.getClass(), "id", 0);
        setField(term129, term129.getClass(), "name", null);
        setField(term129, term129.getClass(), "country", null);
        ArrayList term125 = new ArrayList();
        ((ArrayList) term125).add(term127);
        ((ArrayList) term125).add(term129);
        term85 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term99 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term85, term85.getClass(), "id", 1134449235);
        setField(term85, term85.getClass(), "name", "HyxfbSQYBe");
        setIntField(term99, term99.getClass(), "id", -883034806);
        setField(term99, term99.getClass(), "code", "pCTimMblYc");
        setField(term99, term99.getClass(), "name", "hNxWaHcfhY");
        setField(term99, term99.getClass(), "states", term125);
        setField(term85, term85.getClass(), "country", term99);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.State");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term85, args);
    }

};


