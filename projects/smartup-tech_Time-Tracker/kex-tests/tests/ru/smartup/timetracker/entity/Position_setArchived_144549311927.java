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
import java.lang.Boolean;

public class Position_setArchived_144549311927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108768;
     Object term108772;

    public Position_setArchived_144549311927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108768 = newInstance(Class.forName("ru.smartup.timetracker.entity.Position"));
        setIntField(term108768, term108768.getClass(), "id", 0);
        setField(term108768, term108768.getClass(), "name", null);
        setFloatField(term108768, term108768.getClass(), "externalRate", 0.0F);
        setBooleanField(term108768, term108768.getClass(), "isArchived", false);
        setField(term108768, term108768.getClass(), "createdDate", null);
        setField(term108768, term108768.getClass(), "lastModifiedDate", null);
        term108772 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Position");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term108772;
        callMethod(klass, "setArchived", argTypes, term108768, args);
    }

};


