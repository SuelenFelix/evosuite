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

public class Position_getExternalRate_3668640663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108244;

    public Position_getExternalRate_3668640663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108244 = newInstance(Class.forName("ru.smartup.timetracker.entity.Position"));
        Object term108260 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term108263 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term108244, term108244.getClass(), "id", 963694071);
        setField(term108244, term108244.getClass(), "name", "SvGTualQPa");
        setFloatField(term108244, term108244.getClass(), "externalRate", 0.5873228F);
        setBooleanField(term108244, term108244.getClass(), "isArchived", true);
        setIntField(term108260, term108260.getClass(), "nanos", 805000000);
        setLongField(term108260, term108260.getClass(), "fastTime", 1858916641000L);
        setField(term108260, term108260.getClass(), "cdate", null);
        setField(term108244, term108244.getClass(), "createdDate", term108260);
        setIntField(term108263, term108263.getClass(), "nanos", 437000000);
        setLongField(term108263, term108263.getClass(), "fastTime", 1720870238000L);
        setField(term108263, term108263.getClass(), "cdate", null);
        setField(term108244, term108244.getClass(), "lastModifiedDate", term108263);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Position");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExternalRate", argTypes, term108244, args);
    }

};


