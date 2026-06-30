package com.oreilly.quest.entities;

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
import static com.oreilly.quest.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class Castle_setLatitude_189483638038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9616;
     Object term9619;

    public Castle_setLatitude_189483638038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9616 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term9616, term9616.getClass(), "id", null);
        setField(term9616, term9616.getClass(), "name", null);
        setField(term9616, term9616.getClass(), "city", null);
        setField(term9616, term9616.getClass(), "state", null);
        setDoubleField(term9616, term9616.getClass(), "latitude", 0.0);
        setDoubleField(term9616, term9616.getClass(), "longitude", 0.0);
        setField(term9616, term9616.getClass(), "knights", null);
        term9619 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Castle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term9619;
        callMethod(klass, "setLatitude", argTypes, term9616, args);
    }

};


