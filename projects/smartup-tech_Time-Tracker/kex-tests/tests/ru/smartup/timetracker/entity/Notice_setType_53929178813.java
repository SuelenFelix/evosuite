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

public class Notice_setType_53929178813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8068;
     Object enum20;

    public Notice_setType_53929178813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8125 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term8124 = ((Class) term8125).getDeclaredField((String) "PROJECT_UPDATE");
        ((Field) term8124).setAccessible(true);
        Object enum19 = ((Field) term8124).get((Object) null);
        term8068 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term8101 = newInstance(Class.forName("java.lang.Object"));
        Object term8105 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term8108 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term8068, term8068.getClass(), "id", -4325723315152823407L);
        setField(term8068, term8068.getClass(), "type", enum19);
        setIntField(term8068, term8068.getClass(), "employeeId", -1275173084);
        setField(term8068, term8068.getClass(), "text", "pCTimMblYc");
        setField(term8068, term8068.getClass(), "data", term8101);
        setBooleanField(term8068, term8068.getClass(), "read", true);
        setBooleanField(term8068, term8068.getClass(), "deleted", true);
        setIntField(term8068, term8068.getClass(), "createdBy", -244121226);
        setIntField(term8105, term8105.getClass(), "nanos", 394000000);
        setLongField(term8105, term8105.getClass(), "fastTime", 1538068116000L);
        setField(term8105, term8105.getClass(), "cdate", null);
        setField(term8068, term8068.getClass(), "createdDate", term8105);
        setIntField(term8108, term8108.getClass(), "nanos", 937000000);
        setLongField(term8108, term8108.getClass(), "fastTime", 1744079265000L);
        setField(term8108, term8108.getClass(), "cdate", null);
        setField(term8068, term8068.getClass(), "lastModifiedDate", term8108);
        Class<? extends Object> term8489 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term8488 = ((Class) term8489).getDeclaredField((String) "UN_FREEZE");
        ((Field) term8488).setAccessible(true);
        enum20 = ((Field) term8488).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Notice");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Object[] args = new Object[1];
        args[0] = enum20;
        callMethod(klass, "setType", argTypes, term8068, args);
    }

};


