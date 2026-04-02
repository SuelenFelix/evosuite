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

public class Task_setId_174787447126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7210;

    public Task_setId_174787447126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7210 = newInstance(Class.forName("com.oreilly.quest.entities.Task"));
        setField(term7210, term7210.getClass(), "id", null);
        setField(term7210, term7210.getClass(), "name", null);
        setIntField(term7210, term7210.getClass(), "priority", 0);
        setField(term7210, term7210.getClass(), "startDate", null);
        setField(term7210, term7210.getClass(), "endDate", null);
        setBooleanField(term7210, term7210.getClass(), "completed", false);
        setField(term7210, term7210.getClass(), "quest", null);
        setField(term7210, term7210.getClass(), "createdDate", null);
        setField(term7210, term7210.getClass(), "modifiedDate", null);
        setField(term7210, term7210.getClass(), "duration", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setId", argTypes, term7210, args);
    }

};


