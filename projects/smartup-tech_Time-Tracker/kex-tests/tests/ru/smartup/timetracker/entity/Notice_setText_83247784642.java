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

public class Notice_setText_83247784642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13936;

    public Notice_setText_83247784642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13936 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        setLongField(term13936, term13936.getClass(), "id", 0L);
        setField(term13936, term13936.getClass(), "type", null);
        setIntField(term13936, term13936.getClass(), "employeeId", 0);
        setField(term13936, term13936.getClass(), "text", null);
        setField(term13936, term13936.getClass(), "data", null);
        setBooleanField(term13936, term13936.getClass(), "read", false);
        setBooleanField(term13936, term13936.getClass(), "deleted", false);
        setIntField(term13936, term13936.getClass(), "createdBy", 0);
        setField(term13936, term13936.getClass(), "createdDate", null);
        setField(term13936, term13936.getClass(), "lastModifiedDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Notice");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setText", argTypes, term13936, args);
    }

};


