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

public class State_canEqual_10735203808 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term661;
     Object term715;

    public State_canEqual_10735203808() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term703 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term703, term703.getClass(), "id", -1347665717);
        setField(term703, term703.getClass(), "name", null);
        setField(term703, term703.getClass(), "country", null);
        Object term705 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term705, term705.getClass(), "id", -615654495);
        setField(term705, term705.getClass(), "name", null);
        setField(term705, term705.getClass(), "country", null);
        Object term707 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term707, term707.getClass(), "id", -268815336);
        setField(term707, term707.getClass(), "name", null);
        setField(term707, term707.getClass(), "country", null);
        Object term709 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term709, term709.getClass(), "id", -663691365);
        setField(term709, term709.getClass(), "name", null);
        setField(term709, term709.getClass(), "country", null);
        Object term711 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term711, term711.getClass(), "id", 0);
        setField(term711, term711.getClass(), "name", null);
        setField(term711, term711.getClass(), "country", null);
        ArrayList term701 = new ArrayList();
        ((ArrayList) term701).add(term703);
        ((ArrayList) term701).add(term705);
        ((ArrayList) term701).add(term705);
        ((ArrayList) term701).add(term707);
        ((ArrayList) term701).add(term709);
        ((ArrayList) term701).add(term709);
        ((ArrayList) term701).add(term703);
        ((ArrayList) term701).add(term711);
        term661 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term675 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term661, term661.getClass(), "id", -894662986);
        setField(term661, term661.getClass(), "name", "EeBVbzjcCI");
        setIntField(term675, term675.getClass(), "id", 304775596);
        setField(term675, term675.getClass(), "code", "UfQtPRyWRC");
        setField(term675, term675.getClass(), "name", "FPvxVzzSvD");
        setField(term675, term675.getClass(), "states", term701);
        setField(term661, term661.getClass(), "country", term675);
        term715 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.State");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term715;
        callMethod(klass, "canEqual", argTypes, term661, args);
    }

};


