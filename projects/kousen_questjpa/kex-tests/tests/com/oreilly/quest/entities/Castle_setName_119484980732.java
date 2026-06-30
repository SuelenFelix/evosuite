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

public class Castle_setName_119484980732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9598;

    public Castle_setName_119484980732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9598 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term9598, term9598.getClass(), "id", null);
        setField(term9598, term9598.getClass(), "name", null);
        setField(term9598, term9598.getClass(), "city", null);
        setField(term9598, term9598.getClass(), "state", null);
        setDoubleField(term9598, term9598.getClass(), "latitude", 0.0);
        setDoubleField(term9598, term9598.getClass(), "longitude", 0.0);
        setField(term9598, term9598.getClass(), "knights", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Castle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setName", argTypes, term9598, args);
    }

};


