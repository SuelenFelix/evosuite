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
import java.lang.Boolean;

public class Task_setCompleted_4421811536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7242;
     Object term7245;

    public Task_setCompleted_4421811536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7242 = newInstance(Class.forName("com.oreilly.quest.entities.Task"));
        setField(term7242, term7242.getClass(), "id", null);
        setField(term7242, term7242.getClass(), "name", null);
        setIntField(term7242, term7242.getClass(), "priority", 0);
        setField(term7242, term7242.getClass(), "startDate", null);
        setField(term7242, term7242.getClass(), "endDate", null);
        setBooleanField(term7242, term7242.getClass(), "completed", false);
        setField(term7242, term7242.getClass(), "quest", null);
        setField(term7242, term7242.getClass(), "createdDate", null);
        setField(term7242, term7242.getClass(), "modifiedDate", null);
        setField(term7242, term7242.getClass(), "duration", null);
        term7245 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term7245;
        callMethod(klass, "setCompleted", argTypes, term7242, args);
    }

};


