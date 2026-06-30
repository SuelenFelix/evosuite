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
import java.lang.Long;

public class Notice_setId_192995592712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7663;
     Object term7705;

    public Notice_setId_192995592712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7708 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term7707 = ((Class) term7708).getDeclaredField((String) "FREEZE_CANCEL");
        ((Field) term7707).setAccessible(true);
        Object enum18 = ((Field) term7707).get((Object) null);
        term7663 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term7695 = newInstance(Class.forName("java.lang.Object"));
        Object term7699 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term7702 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term7663, term7663.getClass(), "id", -2813493605142626659L);
        setField(term7663, term7663.getClass(), "type", enum18);
        setIntField(term7663, term7663.getClass(), "employeeId", 590364439);
        setField(term7663, term7663.getClass(), "text", "HyxfbSQYBe");
        setField(term7663, term7663.getClass(), "data", term7695);
        setBooleanField(term7663, term7663.getClass(), "read", true);
        setBooleanField(term7663, term7663.getClass(), "deleted", true);
        setIntField(term7663, term7663.getClass(), "createdBy", 865208305);
        setIntField(term7699, term7699.getClass(), "nanos", 689000000);
        setLongField(term7699, term7699.getClass(), "fastTime", 1550688194000L);
        setField(term7699, term7699.getClass(), "cdate", null);
        setField(term7663, term7663.getClass(), "createdDate", term7699);
        setIntField(term7702, term7702.getClass(), "nanos", 131000000);
        setLongField(term7702, term7702.getClass(), "fastTime", 1804987287000L);
        setField(term7702, term7702.getClass(), "cdate", null);
        setField(term7663, term7663.getClass(), "lastModifiedDate", term7702);
        term7705 = new Long(-8885298608300233488L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Notice");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term7705;
        callMethod(klass, "setId", argTypes, term7663, args);
    }

};


