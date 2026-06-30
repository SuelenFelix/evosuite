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

public class Notice_getEmployeeId_2745670614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4371;

    public Notice_getEmployeeId_2745670614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4415 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term4414 = ((Class) term4415).getDeclaredField((String) "FREEZE_SUCCESS");
        ((Field) term4414).setAccessible(true);
        Object enum10 = ((Field) term4414).get((Object) null);
        term4371 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term4404 = newInstance(Class.forName("java.lang.Object"));
        Object term4408 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term4411 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term4371, term4371.getClass(), "id", -8257434502486459194L);
        setField(term4371, term4371.getClass(), "type", enum10);
        setIntField(term4371, term4371.getClass(), "employeeId", 1725571209);
        setField(term4371, term4371.getClass(), "text", "NRdvgJlhkX");
        setField(term4371, term4371.getClass(), "data", term4404);
        setBooleanField(term4371, term4371.getClass(), "read", true);
        setBooleanField(term4371, term4371.getClass(), "deleted", true);
        setIntField(term4371, term4371.getClass(), "createdBy", -522618178);
        setIntField(term4408, term4408.getClass(), "nanos", 302000000);
        setLongField(term4408, term4408.getClass(), "fastTime", 1442628765000L);
        setField(term4408, term4408.getClass(), "cdate", null);
        setField(term4371, term4371.getClass(), "createdDate", term4408);
        setIntField(term4411, term4411.getClass(), "nanos", 18000000);
        setLongField(term4411, term4411.getClass(), "fastTime", 1515879330000L);
        setField(term4411, term4411.getClass(), "cdate", null);
        setField(term4371, term4371.getClass(), "lastModifiedDate", term4411);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Notice");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmployeeId", argTypes, term4371, args);
    }

};


