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

public class Notice_setCreatedDate_149584583220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11336;
     Object term11386;

    public Notice_setCreatedDate_149584583220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11390 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term11389 = ((Class) term11390).getDeclaredField((String) "REGISTER_NEW_EMPLOYEE");
        ((Field) term11389).setAccessible(true);
        Object enum27 = ((Field) term11389).get((Object) null);
        term11336 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term11376 = newInstance(Class.forName("java.lang.Object"));
        Object term11380 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term11383 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term11336, term11336.getClass(), "id", -4920224193275732920L);
        setField(term11336, term11336.getClass(), "type", enum27);
        setIntField(term11336, term11336.getClass(), "employeeId", 1876565163);
        setField(term11336, term11336.getClass(), "text", "OclPbYPkcH");
        setField(term11336, term11336.getClass(), "data", term11376);
        setBooleanField(term11336, term11336.getClass(), "read", true);
        setBooleanField(term11336, term11336.getClass(), "deleted", false);
        setIntField(term11336, term11336.getClass(), "createdBy", -817164822);
        setIntField(term11380, term11380.getClass(), "nanos", 101000000);
        setLongField(term11380, term11380.getClass(), "fastTime", 1488715102000L);
        setField(term11380, term11380.getClass(), "cdate", null);
        setField(term11336, term11336.getClass(), "createdDate", term11380);
        setIntField(term11383, term11383.getClass(), "nanos", 361000000);
        setLongField(term11383, term11383.getClass(), "fastTime", 1311549317000L);
        setField(term11383, term11383.getClass(), "cdate", null);
        setField(term11336, term11336.getClass(), "lastModifiedDate", term11383);
        term11386 = newInstance(Class.forName("java.sql.Timestamp"));
        setIntField(term11386, term11386.getClass(), "nanos", 842000000);
        setLongField(term11386, term11386.getClass(), "fastTime", 1595506783000L);
        setField(term11386, term11386.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Notice");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.sql.Timestamp");
        Object[] args = new Object[1];
        args[0] = term11386;
        callMethod(klass, "setCreatedDate", argTypes, term11336, args);
    }

};


