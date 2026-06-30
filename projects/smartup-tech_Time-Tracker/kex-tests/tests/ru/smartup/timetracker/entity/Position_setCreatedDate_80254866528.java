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

public class Position_setCreatedDate_80254866528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108774;

    public Position_setCreatedDate_80254866528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108774 = newInstance(Class.forName("ru.smartup.timetracker.entity.Position"));
        setIntField(term108774, term108774.getClass(), "id", 0);
        setField(term108774, term108774.getClass(), "name", null);
        setFloatField(term108774, term108774.getClass(), "externalRate", 0.0F);
        setBooleanField(term108774, term108774.getClass(), "isArchived", false);
        setField(term108774, term108774.getClass(), "createdDate", null);
        setField(term108774, term108774.getClass(), "lastModifiedDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Position");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCreatedDate", argTypes, term108774, args);
    }

};


