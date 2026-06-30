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

public class FreezeRecord_setId_46653603934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63005;
     Object term63007;

    public FreezeRecord_setId_46653603934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63005 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        setIntField(term63005, term63005.getClass(), "id", 0);
        setField(term63005, term63005.getClass(), "freezeDate", null);
        setField(term63005, term63005.getClass(), "employee", null);
        setField(term63005, term63005.getClass(), "status", null);
        setField(term63005, term63005.getClass(), "info", null);
        setField(term63005, term63005.getClass(), "createdDate", null);
        setField(term63005, term63005.getClass(), "lastModifiedDate", null);
        term63007 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term63007;
        callMethod(klass, "setId", argTypes, term63005, args);
    }

};


