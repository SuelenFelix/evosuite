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

public class Quest_removeTask_27438463120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11170;

    public Quest_removeTask_27438463120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11170 = newInstance(Class.forName("com.oreilly.quest.entities.Quest"));
        setField(term11170, term11170.getClass(), "id", null);
        setField(term11170, term11170.getClass(), "name", null);
        setLongField(term11170, term11170.getClass(), "version", 0L);
        setField(term11170, term11170.getClass(), "tasks", null);
        setField(term11170, term11170.getClass(), "knights", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Quest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.oreilly.quest.entities.Task");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "removeTask", argTypes, term11170, args);
    }

};


