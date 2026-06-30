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

public class Position_setName_13499639078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108406;

    public Position_setName_13499639078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108406 = newInstance(Class.forName("ru.smartup.timetracker.entity.Position"));
        Object term108422 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term108425 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term108406, term108406.getClass(), "id", 1505480070);
        setField(term108406, term108406.getClass(), "name", "bVbexZPmwW");
        setFloatField(term108406, term108406.getClass(), "externalRate", 0.10338366F);
        setBooleanField(term108406, term108406.getClass(), "isArchived", false);
        setIntField(term108422, term108422.getClass(), "nanos", 166000000);
        setLongField(term108422, term108422.getClass(), "fastTime", 1653716959000L);
        setField(term108422, term108422.getClass(), "cdate", null);
        setField(term108406, term108406.getClass(), "createdDate", term108422);
        setIntField(term108425, term108425.getClass(), "nanos", 505000000);
        setLongField(term108425, term108425.getClass(), "fastTime", 1595797560000L);
        setField(term108425, term108425.getClass(), "cdate", null);
        setField(term108406, term108406.getClass(), "lastModifiedDate", term108425);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Position");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tvxYdqiyGc";
        callMethod(klass, "setName", argTypes, term108406, args);
    }

};


