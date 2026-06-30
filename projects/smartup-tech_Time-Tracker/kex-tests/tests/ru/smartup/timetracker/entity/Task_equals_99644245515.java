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

public class Task_equals_99644245515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100601;
     Object term100624;

    public Task_equals_99644245515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100601 = newInstance(Class.forName("ru.smartup.timetracker.entity.Task"));
        Object term100618 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term100621 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term100601, term100601.getClass(), "id", 1195529027276497124L);
        setField(term100601, term100601.getClass(), "name", "hPpFNeDBIb");
        setIntField(term100601, term100601.getClass(), "projectId", 273590437);
        setBooleanField(term100601, term100601.getClass(), "billable", false);
        setBooleanField(term100601, term100601.getClass(), "isArchived", true);
        setIntField(term100618, term100618.getClass(), "nanos", 99000000);
        setLongField(term100618, term100618.getClass(), "fastTime", 1750189467000L);
        setField(term100618, term100618.getClass(), "cdate", null);
        setField(term100601, term100601.getClass(), "createdDate", term100618);
        setIntField(term100621, term100621.getClass(), "nanos", 489000000);
        setLongField(term100621, term100621.getClass(), "fastTime", 1618606824000L);
        setField(term100621, term100621.getClass(), "cdate", null);
        setField(term100601, term100601.getClass(), "lastModifiedDate", term100621);
        term100624 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Task");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term100624;
        callMethod(klass, "equals", argTypes, term100601, args);
    }

};


