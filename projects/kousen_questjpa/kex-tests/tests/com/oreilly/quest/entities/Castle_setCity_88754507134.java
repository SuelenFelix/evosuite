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

public class Castle_setCity_88754507134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9604;

    public Castle_setCity_88754507134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9604 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term9604, term9604.getClass(), "id", null);
        setField(term9604, term9604.getClass(), "name", null);
        setField(term9604, term9604.getClass(), "city", null);
        setField(term9604, term9604.getClass(), "state", null);
        setDoubleField(term9604, term9604.getClass(), "latitude", 0.0);
        setDoubleField(term9604, term9604.getClass(), "longitude", 0.0);
        setField(term9604, term9604.getClass(), "knights", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Castle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCity", argTypes, term9604, args);
    }

};


