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

public class Notice_getText_8873987225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4778;

    public Notice_getText_8873987225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4827 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term4826 = ((Class) term4827).getDeclaredField((String) "PROJECT_ROLE_CHANGE");
        ((Field) term4826).setAccessible(true);
        Object enum11 = ((Field) term4826).get((Object) null);
        term4778 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term4816 = newInstance(Class.forName("java.lang.Object"));
        Object term4820 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term4823 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term4778, term4778.getClass(), "id", -8400487765614892086L);
        setField(term4778, term4778.getClass(), "type", enum11);
        setIntField(term4778, term4778.getClass(), "employeeId", 1134449235);
        setField(term4778, term4778.getClass(), "text", "uuaPigETmJ");
        setField(term4778, term4778.getClass(), "data", term4816);
        setBooleanField(term4778, term4778.getClass(), "read", true);
        setBooleanField(term4778, term4778.getClass(), "deleted", true);
        setIntField(term4778, term4778.getClass(), "createdBy", -883034806);
        setIntField(term4820, term4820.getClass(), "nanos", 389000000);
        setLongField(term4820, term4820.getClass(), "fastTime", 1429013051000L);
        setField(term4820, term4820.getClass(), "cdate", null);
        setField(term4778, term4778.getClass(), "createdDate", term4820);
        setIntField(term4823, term4823.getClass(), "nanos", 288000000);
        setLongField(term4823, term4823.getClass(), "fastTime", 1495346663000L);
        setField(term4823, term4823.getClass(), "cdate", null);
        setField(term4778, term4778.getClass(), "lastModifiedDate", term4823);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Notice");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getText", argTypes, term4778, args);
    }

};


