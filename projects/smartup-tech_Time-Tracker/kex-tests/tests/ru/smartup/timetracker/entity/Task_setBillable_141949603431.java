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
import java.lang.Boolean;

public class Task_setBillable_141949603431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100791;
     Object term100796;

    public Task_setBillable_141949603431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100791 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        setLongField(term100791, term100791.getClass(), "id", 0L);
        setField(term100791, term100791.getClass(), "name", null);
        setIntField(term100791, term100791.getClass(), "projectId", 0);
        setBooleanField(term100791, term100791.getClass(), "billable", false);
        setBooleanField(term100791, term100791.getClass(), "isArchived", false);
        setField(term100791, term100791.getClass(), "createdDate", null);
        setField(term100791, term100791.getClass(), "lastModifiedDate", null);
        term100796 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term100796;
        callMethod(klass, "setBillable", argTypes, term100791, args);
    }

};


