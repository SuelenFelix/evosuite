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

public class FreezeRecord_successful_119821205424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62981;
     Object term62983;

    public FreezeRecord_successful_119821205424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62981 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        setIntField(term62981, term62981.getClass(), "id", 0);
        setField(term62981, term62981.getClass(), "freezeDate", null);
        setField(term62981, term62981.getClass(), "employee", null);
        setField(term62981, term62981.getClass(), "status", null);
        setField(term62981, term62981.getClass(), "info", null);
        setField(term62981, term62981.getClass(), "createdDate", null);
        setField(term62981, term62981.getClass(), "lastModifiedDate", null);
        term62983 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term62983;
        callMethod(klass, "successful", argTypes, term62981, args);
    }

};


