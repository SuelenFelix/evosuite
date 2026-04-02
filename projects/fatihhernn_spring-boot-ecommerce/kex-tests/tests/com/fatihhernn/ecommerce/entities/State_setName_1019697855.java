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

public class State_setName_1019697855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331;

    public State_setName_1019697855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term373 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term373, term373.getClass(), "id", -14890619);
        setField(term373, term373.getClass(), "name", null);
        setField(term373, term373.getClass(), "country", null);
        Object term375 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term375, term375.getClass(), "id", 0);
        setField(term375, term375.getClass(), "name", null);
        setField(term375, term375.getClass(), "country", null);
        Object term377 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term377, term377.getClass(), "id", 2055867847);
        setField(term377, term377.getClass(), "name", null);
        setField(term377, term377.getClass(), "country", null);
        ArrayList term371 = new ArrayList();
        ((ArrayList) term371).add(term373);
        ((ArrayList) term371).add(term375);
        ((ArrayList) term371).add(term377);
        term331 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term345 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term331, term331.getClass(), "id", -1968847291);
        setField(term331, term331.getClass(), "name", "bLPjGVBhlX");
        setIntField(term345, term345.getClass(), "id", 579005622);
        setField(term345, term345.getClass(), "code", "whBvTVIIlC");
        setField(term345, term345.getClass(), "name", "IgRJUzaCwW");
        setField(term345, term345.getClass(), "states", term371);
        setField(term331, term331.getClass(), "country", term345);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.State");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TimdotUuNC";
        callMethod(klass, "setName", argTypes, term331, args);
    }

};


