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

public class Task_setEndDate_183434957134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7236;

    public Task_setEndDate_183434957134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7236 = newInstance(Class.forName("com.oreilly.quest.entities.Task"));
        setField(term7236, term7236.getClass(), "id", null);
        setField(term7236, term7236.getClass(), "name", null);
        setIntField(term7236, term7236.getClass(), "priority", 0);
        setField(term7236, term7236.getClass(), "startDate", null);
        setField(term7236, term7236.getClass(), "endDate", null);
        setBooleanField(term7236, term7236.getClass(), "completed", false);
        setField(term7236, term7236.getClass(), "quest", null);
        setField(term7236, term7236.getClass(), "createdDate", null);
        setField(term7236, term7236.getClass(), "modifiedDate", null);
        setField(term7236, term7236.getClass(), "duration", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEndDate", argTypes, term7236, args);
    }

};


