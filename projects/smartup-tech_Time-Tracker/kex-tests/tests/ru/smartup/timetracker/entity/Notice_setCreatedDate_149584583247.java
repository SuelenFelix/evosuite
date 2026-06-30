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

public class Notice_setCreatedDate_149584583247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13972;

    public Notice_setCreatedDate_149584583247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13972 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        setLongField(term13972, term13972.getClass(), "id", 0L);
        setField(term13972, term13972.getClass(), "type", null);
        setIntField(term13972, term13972.getClass(), "employeeId", 0);
        setField(term13972, term13972.getClass(), "text", null);
        setField(term13972, term13972.getClass(), "data", null);
        setBooleanField(term13972, term13972.getClass(), "read", false);
        setBooleanField(term13972, term13972.getClass(), "deleted", false);
        setIntField(term13972, term13972.getClass(), "createdBy", 0);
        setField(term13972, term13972.getClass(), "createdDate", null);
        setField(term13972, term13972.getClass(), "lastModifiedDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Notice");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCreatedDate", argTypes, term13972, args);
    }

};


