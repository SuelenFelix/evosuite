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

public class Task_setArchived_72064413132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100798;
     Object term100803;

    public Task_setArchived_72064413132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100798 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        setLongField(term100798, term100798.getClass(), "id", 0L);
        setField(term100798, term100798.getClass(), "name", null);
        setIntField(term100798, term100798.getClass(), "projectId", 0);
        setBooleanField(term100798, term100798.getClass(), "billable", false);
        setBooleanField(term100798, term100798.getClass(), "isArchived", false);
        setField(term100798, term100798.getClass(), "createdDate", null);
        setField(term100798, term100798.getClass(), "lastModifiedDate", null);
        term100803 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term100803;
        callMethod(klass, "setArchived", argTypes, term100798, args);
    }

};


