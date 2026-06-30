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

public class Position_getLastModifiedDate_133823124823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108748;

    public Position_getLastModifiedDate_133823124823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108748 = newInstance(Class.forName("ru.smartup.timetracker.entity.Position"));
        setIntField(term108748, term108748.getClass(), "id", 0);
        setField(term108748, term108748.getClass(), "name", null);
        setFloatField(term108748, term108748.getClass(), "externalRate", 0.0F);
        setBooleanField(term108748, term108748.getClass(), "isArchived", false);
        setField(term108748, term108748.getClass(), "createdDate", null);
        setField(term108748, term108748.getClass(), "lastModifiedDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Position");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastModifiedDate", argTypes, term108748, args);
    }

};


