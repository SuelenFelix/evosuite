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
import java.lang.Integer;

public class Position_setId_123665975224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108752;
     Object term108756;

    public Position_setId_123665975224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108752 = newInstance(Class.forName("ru.smartup.timetracker.entity.Position"));
        setIntField(term108752, term108752.getClass(), "id", 0);
        setField(term108752, term108752.getClass(), "name", null);
        setFloatField(term108752, term108752.getClass(), "externalRate", 0.0F);
        setBooleanField(term108752, term108752.getClass(), "isArchived", false);
        setField(term108752, term108752.getClass(), "createdDate", null);
        setField(term108752, term108752.getClass(), "lastModifiedDate", null);
        term108756 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Position");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term108756;
        callMethod(klass, "setId", argTypes, term108752, args);
    }

};


