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

public class Position_getLastModifiedDate_13382312486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108340;

    public Position_getLastModifiedDate_13382312486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108340 = newInstance(Class.forName("ru.smartup.timetracker.entity.Position"));
        Object term108356 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term108359 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term108340, term108340.getClass(), "id", 2128383340);
        setField(term108340, term108340.getClass(), "name", "lEcrFlxJXH");
        setFloatField(term108340, term108340.getClass(), "externalRate", 0.91971004F);
        setBooleanField(term108340, term108340.getClass(), "isArchived", true);
        setIntField(term108356, term108356.getClass(), "nanos", 4000000);
        setLongField(term108356, term108356.getClass(), "fastTime", 1269300025000L);
        setField(term108356, term108356.getClass(), "cdate", null);
        setField(term108340, term108340.getClass(), "createdDate", term108356);
        setIntField(term108359, term108359.getClass(), "nanos", 378000000);
        setLongField(term108359, term108359.getClass(), "fastTime", 1755596702000L);
        setField(term108359, term108359.getClass(), "cdate", null);
        setField(term108340, term108340.getClass(), "lastModifiedDate", term108359);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Position");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastModifiedDate", argTypes, term108340, args);
    }

};


