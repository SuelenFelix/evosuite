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

public class FreezeRecord_unfreeze_183279159625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62985;
     Object term62987;

    public FreezeRecord_unfreeze_183279159625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62985 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        setIntField(term62985, term62985.getClass(), "id", 0);
        setField(term62985, term62985.getClass(), "freezeDate", null);
        setField(term62985, term62985.getClass(), "employee", null);
        setField(term62985, term62985.getClass(), "status", null);
        setField(term62985, term62985.getClass(), "info", null);
        setField(term62985, term62985.getClass(), "createdDate", null);
        setField(term62985, term62985.getClass(), "lastModifiedDate", null);
        term62987 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term62987;
        callMethod(klass, "unfreeze", argTypes, term62985, args);
    }

};


