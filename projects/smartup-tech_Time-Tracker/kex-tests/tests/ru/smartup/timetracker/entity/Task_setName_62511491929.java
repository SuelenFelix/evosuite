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

public class Task_setName_62511491929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100779;

    public Task_setName_62511491929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100779 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        setLongField(term100779, term100779.getClass(), "id", 0L);
        setField(term100779, term100779.getClass(), "name", null);
        setIntField(term100779, term100779.getClass(), "projectId", 0);
        setBooleanField(term100779, term100779.getClass(), "billable", false);
        setBooleanField(term100779, term100779.getClass(), "isArchived", false);
        setField(term100779, term100779.getClass(), "createdDate", null);
        setField(term100779, term100779.getClass(), "lastModifiedDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setName", argTypes, term100779, args);
    }

};


