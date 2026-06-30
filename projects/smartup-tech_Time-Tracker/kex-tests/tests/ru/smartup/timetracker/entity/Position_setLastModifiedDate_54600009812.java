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

public class Position_setLastModifiedDate_54600009812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108563;
     Object term108585;

    public Position_setLastModifiedDate_54600009812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108563 = newInstance(Class.forName("ru.smartup.timetracker.entity.Position"));
        Object term108579 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term108582 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term108563, term108563.getClass(), "id", -1777140369);
        setField(term108563, term108563.getClass(), "name", "XiNoscmYhd");
        setFloatField(term108563, term108563.getClass(), "externalRate", 0.6862221F);
        setBooleanField(term108563, term108563.getClass(), "isArchived", false);
        setIntField(term108579, term108579.getClass(), "nanos", 745000000);
        setLongField(term108579, term108579.getClass(), "fastTime", 1767102849000L);
        setField(term108579, term108579.getClass(), "cdate", null);
        setField(term108563, term108563.getClass(), "createdDate", term108579);
        setIntField(term108582, term108582.getClass(), "nanos", 372000000);
        setLongField(term108582, term108582.getClass(), "fastTime", 1450449388000L);
        setField(term108582, term108582.getClass(), "cdate", null);
        setField(term108563, term108563.getClass(), "lastModifiedDate", term108582);
        term108585 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term108585, term108585.getClass(), "nanos", 176000000);
        setLongField(term108585, term108585.getClass(), "fastTime", 1659463960000L);
        setField(term108585, term108585.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Position");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term108585;
        callMethod(klass, "setLastModifiedDate", argTypes, term108563, args);
    }

};


