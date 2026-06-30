package ru.smartup.timetracker.entity;

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
import static ru.smartup.timetracker.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Task_setProjectId_129157272130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100784;
     Object term100789;

    public Task_setProjectId_129157272130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100784 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        setLongField(term100784, term100784.getClass(), "id", 0L);
        setField(term100784, term100784.getClass(), "name", null);
        setIntField(term100784, term100784.getClass(), "projectId", 0);
        setBooleanField(term100784, term100784.getClass(), "billable", false);
        setBooleanField(term100784, term100784.getClass(), "isArchived", false);
        setField(term100784, term100784.getClass(), "createdDate", null);
        setField(term100784, term100784.getClass(), "lastModifiedDate", null);
        term100789 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term100789;
        callMethod(klass, "setProjectId", argTypes, term100784, args);
    }

};


