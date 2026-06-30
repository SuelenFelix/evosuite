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
import java.lang.Boolean;

public class Position_setArchived_144549311910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108494;
     Object term108516;

    public Position_setArchived_144549311910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108494 = newInstance(Class.forName("ru.smartup.timetracker.entity.Position"));
        Object term108510 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term108513 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term108494, term108494.getClass(), "id", -31751777);
        setField(term108494, term108494.getClass(), "name", "HvxahUfZcJ");
        setFloatField(term108494, term108494.getClass(), "externalRate", 0.791695F);
        setBooleanField(term108494, term108494.getClass(), "isArchived", false);
        setIntField(term108510, term108510.getClass(), "nanos", 747000000);
        setLongField(term108510, term108510.getClass(), "fastTime", 1586978762000L);
        setField(term108510, term108510.getClass(), "cdate", null);
        setField(term108494, term108494.getClass(), "createdDate", term108510);
        setIntField(term108513, term108513.getClass(), "nanos", 422000000);
        setLongField(term108513, term108513.getClass(), "fastTime", 1696341439000L);
        setField(term108513, term108513.getClass(), "cdate", null);
        setField(term108494, term108494.getClass(), "lastModifiedDate", term108513);
        term108516 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Position");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term108516;
        callMethod(klass, "setArchived", argTypes, term108494, args);
    }

};


