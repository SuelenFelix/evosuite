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

public class Position_getId_9945707101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108180;

    public Position_getId_9945707101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108180 = newInstance(Class.forName("ru.smartup.timetracker.entity.Position"));
        Object term108196 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term108199 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term108180, term108180.getClass(), "id", 109078154);
        setField(term108180, term108180.getClass(), "name", "mrqGHotaef");
        setFloatField(term108180, term108180.getClass(), "externalRate", 0.25937343F);
        setBooleanField(term108180, term108180.getClass(), "isArchived", true);
        setIntField(term108196, term108196.getClass(), "nanos", 510000000);
        setLongField(term108196, term108196.getClass(), "fastTime", 1599022758000L);
        setField(term108196, term108196.getClass(), "cdate", null);
        setField(term108180, term108180.getClass(), "createdDate", term108196);
        setIntField(term108199, term108199.getClass(), "nanos", 662000000);
        setLongField(term108199, term108199.getClass(), "fastTime", 1364443003000L);
        setField(term108199, term108199.getClass(), "cdate", null);
        setField(term108180, term108180.getClass(), "lastModifiedDate", term108199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Position");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term108180, args);
    }

};


