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

public class Notice_setCreatedBy_177288698546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13964;
     Object term13970;

    public Notice_setCreatedBy_177288698546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13964 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        setLongField(term13964, term13964.getClass(), "id", 0L);
        setField(term13964, term13964.getClass(), "type", null);
        setIntField(term13964, term13964.getClass(), "employeeId", 0);
        setField(term13964, term13964.getClass(), "text", null);
        setField(term13964, term13964.getClass(), "data", null);
        setBooleanField(term13964, term13964.getClass(), "read", false);
        setBooleanField(term13964, term13964.getClass(), "deleted", false);
        setIntField(term13964, term13964.getClass(), "createdBy", 0);
        setField(term13964, term13964.getClass(), "createdDate", null);
        setField(term13964, term13964.getClass(), "lastModifiedDate", null);
        term13970 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Notice");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term13970;
        callMethod(klass, "setCreatedBy", argTypes, term13964, args);
    }

};


