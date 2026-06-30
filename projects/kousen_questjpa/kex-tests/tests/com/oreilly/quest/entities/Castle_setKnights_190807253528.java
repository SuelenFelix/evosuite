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

public class Castle_setKnights_190807253528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9586;

    public Castle_setKnights_190807253528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9586 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term9586, term9586.getClass(), "id", null);
        setField(term9586, term9586.getClass(), "name", null);
        setField(term9586, term9586.getClass(), "city", null);
        setField(term9586, term9586.getClass(), "state", null);
        setDoubleField(term9586, term9586.getClass(), "latitude", 0.0);
        setDoubleField(term9586, term9586.getClass(), "longitude", 0.0);
        setField(term9586, term9586.getClass(), "knights", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Castle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setKnights", argTypes, term9586, args);
    }

};


