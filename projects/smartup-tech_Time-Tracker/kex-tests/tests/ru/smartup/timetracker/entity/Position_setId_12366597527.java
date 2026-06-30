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
import java.lang.Integer;

public class Position_setId_12366597527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108372;
     Object term108394;

    public Position_setId_12366597527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108372 = newInstance(Class.forName("ru.smartup.timetracker.entity.Position"));
        Object term108388 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term108391 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term108372, term108372.getClass(), "id", 1238598518);
        setField(term108372, term108372.getClass(), "name", "VNdDwXMYxR");
        setFloatField(term108372, term108372.getClass(), "externalRate", 0.21924508F);
        setBooleanField(term108372, term108372.getClass(), "isArchived", false);
        setIntField(term108388, term108388.getClass(), "nanos", 263000000);
        setLongField(term108388, term108388.getClass(), "fastTime", 1438853613000L);
        setField(term108388, term108388.getClass(), "cdate", null);
        setField(term108372, term108372.getClass(), "createdDate", term108388);
        setIntField(term108391, term108391.getClass(), "nanos", 311000000);
        setLongField(term108391, term108391.getClass(), "fastTime", 1435807876000L);
        setField(term108391, term108391.getClass(), "cdate", null);
        setField(term108372, term108372.getClass(), "lastModifiedDate", term108391);
        term108394 = new Integer(-558146961);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Position");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term108394;
        callMethod(klass, "setId", argTypes, term108372, args);
    }

};


