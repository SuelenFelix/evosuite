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

public class Task_hashCode_204222220938 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7250;

    public Task_hashCode_204222220938() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7250 = newInstance(Class.forName("com.oreilly.quest.entities.Task"));
        setField(term7250, term7250.getClass(), "id", null);
        setField(term7250, term7250.getClass(), "name", null);
        setIntField(term7250, term7250.getClass(), "priority", 0);
        setField(term7250, term7250.getClass(), "startDate", null);
        setField(term7250, term7250.getClass(), "endDate", null);
        setBooleanField(term7250, term7250.getClass(), "completed", false);
        setField(term7250, term7250.getClass(), "quest", null);
        setField(term7250, term7250.getClass(), "createdDate", null);
        setField(term7250, term7250.getClass(), "modifiedDate", null);
        setField(term7250, term7250.getClass(), "duration", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.oreilly.quest.entities.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term7250, args);
    }

};


