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

public class Notice_setData_59269027716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9689;
     Object term9732;

    public Notice_setData_59269027716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9734 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term9733 = ((Class) term9734).getDeclaredField((String) "PASSWORD_RESET");
        ((Field) term9733).setAccessible(true);
        Object enum23 = ((Field) term9733).get((Object) null);
        term9689 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term9722 = newInstance(Class.forName("java.lang.Object"));
        Object term9726 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term9729 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term9689, term9689.getClass(), "id", -872011222785455006L);
        setField(term9689, term9689.getClass(), "type", enum23);
        setIntField(term9689, term9689.getClass(), "employeeId", -1087774327);
        setField(term9689, term9689.getClass(), "text", "eZFUvlxvGV");
        setField(term9689, term9689.getClass(), "data", term9722);
        setBooleanField(term9689, term9689.getClass(), "read", true);
        setBooleanField(term9689, term9689.getClass(), "deleted", true);
        setIntField(term9689, term9689.getClass(), "createdBy", -1530420153);
        setIntField(term9726, term9726.getClass(), "nanos", 573000000);
        setLongField(term9726, term9726.getClass(), "fastTime", 1329629467000L);
        setField(term9726, term9726.getClass(), "cdate", null);
        setField(term9689, term9689.getClass(), "createdDate", term9726);
        setIntField(term9729, term9729.getClass(), "nanos", 718000000);
        setLongField(term9729, term9729.getClass(), "fastTime", 1334842304000L);
        setField(term9729, term9729.getClass(), "cdate", null);
        setField(term9689, term9689.getClass(), "lastModifiedDate", term9729);
        term9732 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Notice");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term9732;
        callMethod(klass, "setData", argTypes, term9689, args);
    }

};


