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
import java.lang.Integer;

public class Notice_setEmployeeId_118894683914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8827;
     Object term8873;

    public Notice_setEmployeeId_118894683914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8876 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term8875 = ((Class) term8876).getDeclaredField((String) "APPROVAL_REQUIRED");
        ((Field) term8875).setAccessible(true);
        Object enum21 = ((Field) term8875).get((Object) null);
        term8827 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term8863 = newInstance(Class.forName("java.lang.Object"));
        Object term8867 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term8870 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term8827, term8827.getClass(), "id", 2535595959091595249L);
        setField(term8827, term8827.getClass(), "type", enum21);
        setIntField(term8827, term8827.getClass(), "employeeId", -203030934);
        setField(term8827, term8827.getClass(), "text", "hNxWaHcfhY");
        setField(term8827, term8827.getClass(), "data", term8863);
        setBooleanField(term8827, term8827.getClass(), "read", true);
        setBooleanField(term8827, term8827.getClass(), "deleted", false);
        setIntField(term8827, term8827.getClass(), "createdBy", -1179120542);
        setIntField(term8867, term8867.getClass(), "nanos", 385000000);
        setLongField(term8867, term8867.getClass(), "fastTime", 1347389761000L);
        setField(term8867, term8867.getClass(), "cdate", null);
        setField(term8827, term8827.getClass(), "createdDate", term8867);
        setIntField(term8870, term8870.getClass(), "nanos", 899000000);
        setLongField(term8870, term8870.getClass(), "fastTime", 1502147353000L);
        setField(term8870, term8870.getClass(), "cdate", null);
        setField(term8827, term8827.getClass(), "lastModifiedDate", term8870);
        term8873 = new Integer(-73683645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Notice");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8873;
        callMethod(klass, "setEmployeeId", argTypes, term8827, args);
    }

};


