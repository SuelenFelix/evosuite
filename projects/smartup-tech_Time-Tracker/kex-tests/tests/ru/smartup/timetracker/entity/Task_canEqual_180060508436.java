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

public class Task_canEqual_180060508436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100820;

    public Task_canEqual_180060508436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100820 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        setLongField(term100820, term100820.getClass(), "id", 0L);
        setField(term100820, term100820.getClass(), "name", null);
        setIntField(term100820, term100820.getClass(), "projectId", 0);
        setBooleanField(term100820, term100820.getClass(), "billable", false);
        setBooleanField(term100820, term100820.getClass(), "isArchived", false);
        setField(term100820, term100820.getClass(), "createdDate", null);
        setField(term100820, term100820.getClass(), "lastModifiedDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term100820, args);
    }

};


