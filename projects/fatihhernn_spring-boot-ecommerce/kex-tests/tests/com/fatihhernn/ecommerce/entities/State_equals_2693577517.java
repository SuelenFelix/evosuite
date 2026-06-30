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

public class State_equals_2693577517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term576;
     Object term630;

    public State_equals_2693577517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term618 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term618, term618.getClass(), "id", 1114000454);
        setField(term618, term618.getClass(), "name", null);
        setField(term618, term618.getClass(), "country", null);
        Object term620 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term620, term620.getClass(), "id", 0);
        setField(term620, term620.getClass(), "name", null);
        setField(term620, term620.getClass(), "country", null);
        Object term622 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term622, term622.getClass(), "id", -505439934);
        setField(term622, term622.getClass(), "name", null);
        setField(term622, term622.getClass(), "country", null);
        Object term624 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term624, term624.getClass(), "id", 941650513);
        setField(term624, term624.getClass(), "name", null);
        setField(term624, term624.getClass(), "country", null);
        Object term626 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        setIntField(term626, term626.getClass(), "id", 0);
        setField(term626, term626.getClass(), "name", null);
        setField(term626, term626.getClass(), "country", null);
        ArrayList term616 = new ArrayList();
        ((ArrayList) term616).add(term618);
        ((ArrayList) term616).add(term620);
        ((ArrayList) term616).add(term620);
        ((ArrayList) term616).add(term622);
        ((ArrayList) term616).add(term624);
        ((ArrayList) term616).add(term624);
        ((ArrayList) term616).add(term618);
        ((ArrayList) term616).add(term626);
        term576 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.State"));
        Object term590 = newInstance(Class.forName("com.fatihhernn.ecommerce.entities.Country"));
        setIntField(term576, term576.getClass(), "id", -1547384488);
        setField(term576, term576.getClass(), "name", "mLUZFTfjle");
        setIntField(term590, term590.getClass(), "id", 1442160736);
        setField(term590, term590.getClass(), "code", "xIeFjkHkOe");
        setField(term590, term590.getClass(), "name", "SdCKLMIYnX");
        setField(term590, term590.getClass(), "states", term616);
        setField(term576, term576.getClass(), "country", term590);
        term630 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fatihhernn.ecommerce.entities.State");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term630;
        callMethod(klass, "equals", argTypes, term576, args);
    }

};


