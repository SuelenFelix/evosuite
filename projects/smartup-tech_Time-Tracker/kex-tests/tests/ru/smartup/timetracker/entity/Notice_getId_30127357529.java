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

public class Notice_getId_30127357529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13854;

    public Notice_getId_30127357529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13854 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        setLongField(term13854, term13854.getClass(), "id", 0L);
        setField(term13854, term13854.getClass(), "type", null);
        setIntField(term13854, term13854.getClass(), "employeeId", 0);
        setField(term13854, term13854.getClass(), "text", null);
        setField(term13854, term13854.getClass(), "data", null);
        setBooleanField(term13854, term13854.getClass(), "read", false);
        setBooleanField(term13854, term13854.getClass(), "deleted", false);
        setIntField(term13854, term13854.getClass(), "createdBy", 0);
        setField(term13854, term13854.getClass(), "createdDate", null);
        setField(term13854, term13854.getClass(), "lastModifiedDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Notice");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term13854, args);
    }

};


