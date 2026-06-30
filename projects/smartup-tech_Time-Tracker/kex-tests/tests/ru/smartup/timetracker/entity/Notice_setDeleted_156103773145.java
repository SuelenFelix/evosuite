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
import java.lang.Boolean;

public class Notice_setDeleted_156103773145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13956;
     Object term13962;

    public Notice_setDeleted_156103773145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13956 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        setLongField(term13956, term13956.getClass(), "id", 0L);
        setField(term13956, term13956.getClass(), "type", null);
        setIntField(term13956, term13956.getClass(), "employeeId", 0);
        setField(term13956, term13956.getClass(), "text", null);
        setField(term13956, term13956.getClass(), "data", null);
        setBooleanField(term13956, term13956.getClass(), "read", false);
        setBooleanField(term13956, term13956.getClass(), "deleted", false);
        setIntField(term13956, term13956.getClass(), "createdBy", 0);
        setField(term13956, term13956.getClass(), "createdDate", null);
        setField(term13956, term13956.getClass(), "lastModifiedDate", null);
        term13962 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Notice");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term13962;
        callMethod(klass, "setDeleted", argTypes, term13956, args);
    }

};


