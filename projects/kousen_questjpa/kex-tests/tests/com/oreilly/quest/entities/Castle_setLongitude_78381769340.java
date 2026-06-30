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

public class Castle_setLongitude_78381769340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9624;
     Object term9627;

    public Castle_setLongitude_78381769340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9624 = newInstance(Class.forName("com.oreilly.quest.entities.Castle"));
        setField(term9624, term9624.getClass(), "id", null);
        setField(term9624, term9624.getClass(), "name", null);
        setField(term9624, term9624.getClass(), "city", null);
        setField(term9624, term9624.getClass(), "state", null);
        setDoubleField(term9624, term9624.getClass(), "latitude", 0.0);
        setDoubleField(term9624, term9624.getClass(), "longitude", 0.0);
        setField(term9624, term9624.getClass(), "knights", null);
        term9627 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Castle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term9627;
        callMethod(klass, "setLongitude", argTypes, term9624, args);
    }

};


