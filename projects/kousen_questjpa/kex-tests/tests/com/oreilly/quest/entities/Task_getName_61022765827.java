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

public class Task_getName_61022765827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7213;

    public Task_getName_61022765827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7213 = newInstance(Class.forName("com.oreilly.quest.entities.Task"));
        setField(term7213, term7213.getClass(), "id", null);
        setField(term7213, term7213.getClass(), "name", null);
        setIntField(term7213, term7213.getClass(), "priority", 0);
        setField(term7213, term7213.getClass(), "startDate", null);
        setField(term7213, term7213.getClass(), "endDate", null);
        setBooleanField(term7213, term7213.getClass(), "completed", false);
        setField(term7213, term7213.getClass(), "quest", null);
        setField(term7213, term7213.getClass(), "createdDate", null);
        setField(term7213, term7213.getClass(), "modifiedDate", null);
        setField(term7213, term7213.getClass(), "duration", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term7213, args);
    }

};


