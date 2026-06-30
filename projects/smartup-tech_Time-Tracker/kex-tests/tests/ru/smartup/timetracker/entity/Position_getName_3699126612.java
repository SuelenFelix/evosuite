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

public class Position_getName_3699126612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108212;

    public Position_getName_3699126612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108212 = newInstance(Class.forName("ru.smartup.timetracker.entity.Position"));
        Object term108228 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term108231 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term108212, term108212.getClass(), "id", -314165467);
        setField(term108212, term108212.getClass(), "name", "UbZGBpQZQW");
        setFloatField(term108212, term108212.getClass(), "externalRate", 0.8704517F);
        setBooleanField(term108212, term108212.getClass(), "isArchived", true);
        setIntField(term108228, term108228.getClass(), "nanos", 260000000);
        setLongField(term108228, term108228.getClass(), "fastTime", 1400570110000L);
        setField(term108228, term108228.getClass(), "cdate", null);
        setField(term108212, term108212.getClass(), "createdDate", term108228);
        setIntField(term108231, term108231.getClass(), "nanos", 512000000);
        setLongField(term108231, term108231.getClass(), "fastTime", 1508632195000L);
        setField(term108231, term108231.getClass(), "cdate", null);
        setField(term108212, term108212.getClass(), "lastModifiedDate", term108231);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Position");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term108212, args);
    }

};


