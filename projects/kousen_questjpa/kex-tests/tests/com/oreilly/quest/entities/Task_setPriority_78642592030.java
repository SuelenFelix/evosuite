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
import java.lang.Integer;

public class Task_setPriority_78642592030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7222;
     Object term7225;

    public Task_setPriority_78642592030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7222 = newInstance(Class.forName("com.oreilly.quest.entities.Task"));
        setField(term7222, term7222.getClass(), "id", null);
        setField(term7222, term7222.getClass(), "name", null);
        setIntField(term7222, term7222.getClass(), "priority", 0);
        setField(term7222, term7222.getClass(), "startDate", null);
        setField(term7222, term7222.getClass(), "endDate", null);
        setBooleanField(term7222, term7222.getClass(), "completed", false);
        setField(term7222, term7222.getClass(), "quest", null);
        setField(term7222, term7222.getClass(), "createdDate", null);
        setField(term7222, term7222.getClass(), "modifiedDate", null);
        setField(term7222, term7222.getClass(), "duration", null);
        term7225 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7225;
        callMethod(klass, "setPriority", argTypes, term7222, args);
    }

};


