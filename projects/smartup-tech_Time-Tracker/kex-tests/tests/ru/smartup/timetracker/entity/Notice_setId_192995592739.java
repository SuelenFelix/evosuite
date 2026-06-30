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
import java.lang.Long;

public class Notice_setId_192995592739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13914;
     Object term13920;

    public Notice_setId_192995592739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13914 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        setLongField(term13914, term13914.getClass(), "id", 0L);
        setField(term13914, term13914.getClass(), "type", null);
        setIntField(term13914, term13914.getClass(), "employeeId", 0);
        setField(term13914, term13914.getClass(), "text", null);
        setField(term13914, term13914.getClass(), "data", null);
        setBooleanField(term13914, term13914.getClass(), "read", false);
        setBooleanField(term13914, term13914.getClass(), "deleted", false);
        setIntField(term13914, term13914.getClass(), "createdBy", 0);
        setField(term13914, term13914.getClass(), "createdDate", null);
        setField(term13914, term13914.getClass(), "lastModifiedDate", null);
        term13920 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Notice");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term13920;
        callMethod(klass, "setId", argTypes, term13914, args);
    }

};


