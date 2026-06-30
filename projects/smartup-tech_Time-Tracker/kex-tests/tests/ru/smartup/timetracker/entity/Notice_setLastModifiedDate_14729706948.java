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

public class Notice_setLastModifiedDate_14729706948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13978;

    public Notice_setLastModifiedDate_14729706948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13978 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        setLongField(term13978, term13978.getClass(), "id", 0L);
        setField(term13978, term13978.getClass(), "type", null);
        setIntField(term13978, term13978.getClass(), "employeeId", 0);
        setField(term13978, term13978.getClass(), "text", null);
        setField(term13978, term13978.getClass(), "data", null);
        setBooleanField(term13978, term13978.getClass(), "read", false);
        setBooleanField(term13978, term13978.getClass(), "deleted", false);
        setIntField(term13978, term13978.getClass(), "createdBy", 0);
        setField(term13978, term13978.getClass(), "createdDate", null);
        setField(term13978, term13978.getClass(), "lastModifiedDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Notice");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastModifiedDate", argTypes, term13978, args);
    }

};


