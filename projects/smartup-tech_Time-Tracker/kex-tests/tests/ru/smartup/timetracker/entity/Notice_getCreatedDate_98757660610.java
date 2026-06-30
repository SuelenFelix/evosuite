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

public class Notice_getCreatedDate_98757660610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6833;

    public Notice_getCreatedDate_98757660610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6875 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term6874 = ((Class) term6875).getDeclaredField((String) "FREEZE_ERROR");
        ((Field) term6874).setAccessible(true);
        Object enum16 = ((Field) term6874).get((Object) null);
        term6833 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term6864 = newInstance(Class.forName("java.lang.Object"));
        Object term6868 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term6871 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term6833, term6833.getClass(), "id", -7237588299778557629L);
        setField(term6833, term6833.getClass(), "type", enum16);
        setIntField(term6833, term6833.getClass(), "employeeId", -2068769794);
        setField(term6833, term6833.getClass(), "text", "ZiaGIbnzTs");
        setField(term6833, term6833.getClass(), "data", term6864);
        setBooleanField(term6833, term6833.getClass(), "read", true);
        setBooleanField(term6833, term6833.getClass(), "deleted", true);
        setIntField(term6833, term6833.getClass(), "createdBy", -117576464);
        setIntField(term6868, term6868.getClass(), "nanos", 364000000);
        setLongField(term6868, term6868.getClass(), "fastTime", 1882628084000L);
        setField(term6868, term6868.getClass(), "cdate", null);
        setField(term6833, term6833.getClass(), "createdDate", term6868);
        setIntField(term6871, term6871.getClass(), "nanos", 580000000);
        setLongField(term6871, term6871.getClass(), "fastTime", 1437746523000L);
        setField(term6871, term6871.getClass(), "cdate", null);
        setField(term6833, term6833.getClass(), "lastModifiedDate", term6871);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Notice");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedDate", argTypes, term6833, args);
    }

};


