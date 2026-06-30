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

public class Task_getCreatedDate_95602478526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100762;

    public Task_getCreatedDate_95602478526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100762 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        setLongField(term100762, term100762.getClass(), "id", 0L);
        setField(term100762, term100762.getClass(), "name", null);
        setIntField(term100762, term100762.getClass(), "projectId", 0);
        setBooleanField(term100762, term100762.getClass(), "billable", false);
        setBooleanField(term100762, term100762.getClass(), "isArchived", false);
        setField(term100762, term100762.getClass(), "createdDate", null);
        setField(term100762, term100762.getClass(), "lastModifiedDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedDate", argTypes, term100762, args);
    }

};


