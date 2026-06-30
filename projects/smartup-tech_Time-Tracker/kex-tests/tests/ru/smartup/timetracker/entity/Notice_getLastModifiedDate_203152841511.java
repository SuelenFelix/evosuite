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

public class Notice_getLastModifiedDate_203152841511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7232;

    public Notice_getLastModifiedDate_203152841511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7282 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term7281 = ((Class) term7282).getDeclaredField((String) "PROJECT_ROLE_GRANTED");
        ((Field) term7281).setAccessible(true);
        Object enum17 = ((Field) term7281).get((Object) null);
        term7232 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term7271 = newInstance(Class.forName("java.lang.Object"));
        Object term7275 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term7278 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term7232, term7232.getClass(), "id", 6967924379644551255L);
        setField(term7232, term7232.getClass(), "type", enum17);
        setIntField(term7232, term7232.getClass(), "employeeId", -1007160944);
        setField(term7232, term7232.getClass(), "text", "tbcdzjIfER");
        setField(term7232, term7232.getClass(), "data", term7271);
        setBooleanField(term7232, term7232.getClass(), "read", false);
        setBooleanField(term7232, term7232.getClass(), "deleted", false);
        setIntField(term7232, term7232.getClass(), "createdBy", 1135664017);
        setIntField(term7275, term7275.getClass(), "nanos", 825000000);
        setLongField(term7275, term7275.getClass(), "fastTime", 1668558429000L);
        setField(term7275, term7275.getClass(), "cdate", null);
        setField(term7232, term7232.getClass(), "createdDate", term7275);
        setIntField(term7278, term7278.getClass(), "nanos", 647000000);
        setLongField(term7278, term7278.getClass(), "fastTime", 1725111417000L);
        setField(term7278, term7278.getClass(), "cdate", null);
        setField(term7232, term7232.getClass(), "lastModifiedDate", term7278);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Notice");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastModifiedDate", argTypes, term7232, args);
    }

};


