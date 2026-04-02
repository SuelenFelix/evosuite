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

public class Task_setName_196486307028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7216;

    public Task_setName_196486307028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7216 = newInstance(Class.forName("com.oreilly.quest.entities.Task"));
        setField(term7216, term7216.getClass(), "id", null);
        setField(term7216, term7216.getClass(), "name", null);
        setIntField(term7216, term7216.getClass(), "priority", 0);
        setField(term7216, term7216.getClass(), "startDate", null);
        setField(term7216, term7216.getClass(), "endDate", null);
        setBooleanField(term7216, term7216.getClass(), "completed", false);
        setField(term7216, term7216.getClass(), "quest", null);
        setField(term7216, term7216.getClass(), "createdDate", null);
        setField(term7216, term7216.getClass(), "modifiedDate", null);
        setField(term7216, term7216.getClass(), "duration", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setName", argTypes, term7216, args);
    }

};


