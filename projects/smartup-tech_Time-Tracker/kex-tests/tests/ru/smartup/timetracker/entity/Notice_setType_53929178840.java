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

public class Notice_setType_53929178840 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13922;

    public Notice_setType_53929178840() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13922 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        setLongField(term13922, term13922.getClass(), "id", 0L);
        setField(term13922, term13922.getClass(), "type", null);
        setIntField(term13922, term13922.getClass(), "employeeId", 0);
        setField(term13922, term13922.getClass(), "text", null);
        setField(term13922, term13922.getClass(), "data", null);
        setBooleanField(term13922, term13922.getClass(), "read", false);
        setBooleanField(term13922, term13922.getClass(), "deleted", false);
        setIntField(term13922, term13922.getClass(), "createdBy", 0);
        setField(term13922, term13922.getClass(), "createdDate", null);
        setField(term13922, term13922.getClass(), "lastModifiedDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Notice");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setType", argTypes, term13922, args);
    }

};


