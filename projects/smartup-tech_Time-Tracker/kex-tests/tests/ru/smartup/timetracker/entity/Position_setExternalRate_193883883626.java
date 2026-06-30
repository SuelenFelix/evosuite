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
import java.lang.Float;

public class Position_setExternalRate_193883883626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108762;
     Object term108766;

    public Position_setExternalRate_193883883626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108762 = newInstance(Class.forName("ru.smartup.timetracker.entity.Position"));
        setIntField(term108762, term108762.getClass(), "id", 0);
        setField(term108762, term108762.getClass(), "name", null);
        setFloatField(term108762, term108762.getClass(), "externalRate", 0.0F);
        setBooleanField(term108762, term108762.getClass(), "isArchived", false);
        setField(term108762, term108762.getClass(), "createdDate", null);
        setField(term108762, term108762.getClass(), "lastModifiedDate", null);
        term108766 = new Float(0.0F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Position");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term108766;
        callMethod(klass, "setExternalRate", argTypes, term108762, args);
    }

};


