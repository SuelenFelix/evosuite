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

public class Notice_hashCode_57930760124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13028;

    public Notice_hashCode_57930760124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13071 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term13070 = ((Class) term13071).getDeclaredField((String) "FREEZE_CANCEL");
        ((Field) term13070).setAccessible(true);
        Object enum31 = ((Field) term13070).get((Object) null);
        term13028 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term13060 = newInstance(Class.forName("java.lang.Object"));
        Object term13064 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term13067 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term13028, term13028.getClass(), "id", -4365849114644724155L);
        setField(term13028, term13028.getClass(), "type", enum31);
        setIntField(term13028, term13028.getClass(), "employeeId", -1786399638);
        setField(term13028, term13028.getClass(), "text", "dWRymuLBtr");
        setField(term13028, term13028.getClass(), "data", term13060);
        setBooleanField(term13028, term13028.getClass(), "read", true);
        setBooleanField(term13028, term13028.getClass(), "deleted", true);
        setIntField(term13028, term13028.getClass(), "createdBy", 2055867847);
        setIntField(term13064, term13064.getClass(), "nanos", 549000000);
        setLongField(term13064, term13064.getClass(), "fastTime", 1819180838000L);
        setField(term13064, term13064.getClass(), "cdate", null);
        setField(term13028, term13028.getClass(), "createdDate", term13064);
        setIntField(term13067, term13067.getClass(), "nanos", 698000000);
        setLongField(term13067, term13067.getClass(), "fastTime", 1400680978000L);
        setField(term13067, term13067.getClass(), "cdate", null);
        setField(term13028, term13028.getClass(), "lastModifiedDate", term13067);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Notice");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term13028, args);
    }

};


