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

public class Task_getId_211705106725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7207;

    public Task_getId_211705106725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7207 = newInstance(Class.forName("com.oreilly.quest.entities.Task"));
        setField(term7207, term7207.getClass(), "id", null);
        setField(term7207, term7207.getClass(), "name", null);
        setIntField(term7207, term7207.getClass(), "priority", 0);
        setField(term7207, term7207.getClass(), "startDate", null);
        setField(term7207, term7207.getClass(), "endDate", null);
        setBooleanField(term7207, term7207.getClass(), "completed", false);
        setField(term7207, term7207.getClass(), "quest", null);
        setField(term7207, term7207.getClass(), "createdDate", null);
        setField(term7207, term7207.getClass(), "modifiedDate", null);
        setField(term7207, term7207.getClass(), "duration", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term7207, args);
    }

};


