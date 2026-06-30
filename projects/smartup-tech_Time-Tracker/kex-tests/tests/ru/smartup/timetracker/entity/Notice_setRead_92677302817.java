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
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;

public class Notice_setRead_92677302817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10097;
     Object term10138;

    public Notice_setRead_92677302817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10141 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term10140 = ((Class) term10141).getDeclaredField((String) "FREEZE_ERROR");
        ((Field) term10140).setAccessible(true);
        Object enum24 = ((Field) term10140).get((Object) null);
        term10097 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term10128 = newInstance(Class.forName("java.lang.Object"));
        Object term10132 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term10135 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term10097, term10097.getClass(), "id", -316468845751588286L);
        setField(term10097, term10097.getClass(), "type", enum24);
        setIntField(term10097, term10097.getClass(), "employeeId", -469968304);
        setField(term10097, term10097.getClass(), "text", "BYqFIqCKAV");
        setField(term10097, term10097.getClass(), "data", term10128);
        setBooleanField(term10097, term10097.getClass(), "read", true);
        setBooleanField(term10097, term10097.getClass(), "deleted", true);
        setIntField(term10097, term10097.getClass(), "createdBy", -1145578966);
        setIntField(term10132, term10132.getClass(), "nanos", 764000000);
        setLongField(term10132, term10132.getClass(), "fastTime", 1496849028000L);
        setField(term10132, term10132.getClass(), "cdate", null);
        setField(term10097, term10097.getClass(), "createdDate", term10132);
        setIntField(term10135, term10135.getClass(), "nanos", 367000000);
        setLongField(term10135, term10135.getClass(), "fastTime", 1691857668000L);
        setField(term10135, term10135.getClass(), "cdate", null);
        setField(term10097, term10097.getClass(), "lastModifiedDate", term10135);
        term10138 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Notice");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term10138;
        callMethod(klass, "setRead", argTypes, term10097, args);
    }

};


