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

public class Task_toString_3699609038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100830;

    public Task_toString_3699609038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100830 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        setLongField(term100830, term100830.getClass(), "id", 0L);
        setField(term100830, term100830.getClass(), "name", null);
        setIntField(term100830, term100830.getClass(), "projectId", 0);
        setBooleanField(term100830, term100830.getClass(), "billable", false);
        setBooleanField(term100830, term100830.getClass(), "isArchived", false);
        setField(term100830, term100830.getClass(), "createdDate", null);
        setField(term100830, term100830.getClass(), "lastModifiedDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term100830, args);
    }

};


