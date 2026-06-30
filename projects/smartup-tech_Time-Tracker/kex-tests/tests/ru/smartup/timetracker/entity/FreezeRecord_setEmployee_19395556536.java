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

public class FreezeRecord_setEmployee_19395556536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63011;

    public FreezeRecord_setEmployee_19395556536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63011 = newInstance(Class.forName("ru.smartup.timetracker.entity.FreezeRecord"));
        setIntField(term63011, term63011.getClass(), "id", 0);
        setField(term63011, term63011.getClass(), "freezeDate", null);
        setField(term63011, term63011.getClass(), "employee", null);
        setField(term63011, term63011.getClass(), "status", null);
        setField(term63011, term63011.getClass(), "info", null);
        setField(term63011, term63011.getClass(), "createdDate", null);
        setField(term63011, term63011.getClass(), "lastModifiedDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.FreezeRecord");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.Employee");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEmployee", argTypes, term63011, args);
    }

};


