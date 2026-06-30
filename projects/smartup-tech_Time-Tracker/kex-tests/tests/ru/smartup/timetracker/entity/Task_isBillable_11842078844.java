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
import java.lang.Object;

public class Task_isBillable_11842078844 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100202;

    public Task_isBillable_11842078844() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100202 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term100219 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term100222 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term100202, term100202.getClass(), "id", 138235087558060686L);
        setField(term100202, term100202.getClass(), "name", "QgHhxMyKvr");
        setIntField(term100202, term100202.getClass(), "projectId", 1213549815);
        setBooleanField(term100202, term100202.getClass(), "billable", true);
        setBooleanField(term100202, term100202.getClass(), "isArchived", false);
        setIntField(term100219, term100219.getClass(), "nanos", 88000000);
        setLongField(term100219, term100219.getClass(), "fastTime", 1576837373000L);
        setField(term100219, term100219.getClass(), "cdate", null);
        setField(term100202, term100202.getClass(), "createdDate", term100219);
        setIntField(term100222, term100222.getClass(), "nanos", 258000000);
        setLongField(term100222, term100222.getClass(), "fastTime", 1629825363000L);
        setField(term100222, term100222.getClass(), "cdate", null);
        setField(term100202, term100202.getClass(), "lastModifiedDate", term100222);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBillable", argTypes, term100202, args);
    }

};


