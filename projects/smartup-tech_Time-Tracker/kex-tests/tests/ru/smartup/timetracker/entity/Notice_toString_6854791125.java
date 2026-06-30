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

public class Notice_toString_6854791125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13431;

    public Notice_toString_6854791125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13478 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term13477 = ((Class) term13478).getDeclaredField((String) "APPROVAL_REQUIRED");
        ((Field) term13477).setAccessible(true);
        Object enum32 = ((Field) term13477).get((Object) null);
        term13431 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term13467 = newInstance(Class.forName("java.lang.Object"));
        Object term13471 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term13474 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term13431, term13431.getClass(), "id", 2486810210675247493L);
        setField(term13431, term13431.getClass(), "type", enum32);
        setIntField(term13431, term13431.getClass(), "employeeId", -1048298087);
        setField(term13431, term13431.getClass(), "text", "AijpHYOFuy");
        setField(term13431, term13431.getClass(), "data", term13467);
        setBooleanField(term13431, term13431.getClass(), "read", false);
        setBooleanField(term13431, term13431.getClass(), "deleted", true);
        setIntField(term13431, term13431.getClass(), "createdBy", 292681826);
        setIntField(term13471, term13471.getClass(), "nanos", 811000000);
        setLongField(term13471, term13471.getClass(), "fastTime", 1741433763000L);
        setField(term13471, term13471.getClass(), "cdate", null);
        setField(term13431, term13431.getClass(), "createdDate", term13471);
        setIntField(term13474, term13474.getClass(), "nanos", 322000000);
        setLongField(term13474, term13474.getClass(), "fastTime", 1761983901000L);
        setField(term13474, term13474.getClass(), "cdate", null);
        setField(term13431, term13431.getClass(), "lastModifiedDate", term13474);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Notice");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term13431, args);
    }

};


