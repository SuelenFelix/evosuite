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

public class Task_getLastModifiedDate_206308023627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100767;

    public Task_getLastModifiedDate_206308023627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100767 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        setLongField(term100767, term100767.getClass(), "id", 0L);
        setField(term100767, term100767.getClass(), "name", null);
        setIntField(term100767, term100767.getClass(), "projectId", 0);
        setBooleanField(term100767, term100767.getClass(), "billable", false);
        setBooleanField(term100767, term100767.getClass(), "isArchived", false);
        setField(term100767, term100767.getClass(), "createdDate", null);
        setField(term100767, term100767.getClass(), "lastModifiedDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastModifiedDate", argTypes, term100767, args);
    }

};


