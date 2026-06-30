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

public class Notice_getData_14806791276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5205;

    public Notice_getData_14806791276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5249 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term5248 = ((Class) term5249).getDeclaredField((String) "FREEZE_SUCCESS");
        ((Field) term5248).setAccessible(true);
        Object enum12 = ((Field) term5248).get((Object) null);
        term5205 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term5238 = newInstance(Class.forName("java.lang.Object"));
        Object term5242 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term5245 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term5205, term5205.getClass(), "id", 5270370404989704783L);
        setField(term5205, term5205.getClass(), "type", enum12);
        setIntField(term5205, term5205.getClass(), "employeeId", 1585847225);
        setField(term5205, term5205.getClass(), "text", "MxlszYVzRf");
        setField(term5205, term5205.getClass(), "data", term5238);
        setBooleanField(term5205, term5205.getClass(), "read", false);
        setBooleanField(term5205, term5205.getClass(), "deleted", true);
        setIntField(term5205, term5205.getClass(), "createdBy", 597278769);
        setIntField(term5242, term5242.getClass(), "nanos", 896000000);
        setLongField(term5242, term5242.getClass(), "fastTime", 1645823234000L);
        setField(term5242, term5242.getClass(), "cdate", null);
        setField(term5205, term5205.getClass(), "createdDate", term5242);
        setIntField(term5245, term5245.getClass(), "nanos", 23000000);
        setLongField(term5245, term5245.getClass(), "fastTime", 1500710268000L);
        setField(term5245, term5245.getClass(), "cdate", null);
        setField(term5205, term5205.getClass(), "lastModifiedDate", term5245);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Notice");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getData", argTypes, term5205, args);
    }

};


