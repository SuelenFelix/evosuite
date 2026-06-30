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

public class Notice_getType_479423343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3968;

    public Notice_getType_479423343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4011 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term4010 = ((Class) term4011).getDeclaredField((String) "ADMIN_REMOVED");
        ((Field) term4010).setAccessible(true);
        Object enum9 = ((Field) term4010).get((Object) null);
        term3968 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term4000 = newInstance(Class.forName("java.lang.Object"));
        Object term4004 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term4007 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term3968, term3968.getClass(), "id", 6375119433582206027L);
        setField(term3968, term3968.getClass(), "type", enum9);
        setIntField(term3968, term3968.getClass(), "employeeId", 1227103734);
        setField(term3968, term3968.getClass(), "text", "RMFIsYGgne");
        setField(term3968, term3968.getClass(), "data", term4000);
        setBooleanField(term3968, term3968.getClass(), "read", false);
        setBooleanField(term3968, term3968.getClass(), "deleted", false);
        setIntField(term3968, term3968.getClass(), "createdBy", -1339778481);
        setIntField(term4004, term4004.getClass(), "nanos", 830000000);
        setLongField(term4004, term4004.getClass(), "fastTime", 1610929382000L);
        setField(term4004, term4004.getClass(), "cdate", null);
        setField(term3968, term3968.getClass(), "createdDate", term4004);
        setIntField(term4007, term4007.getClass(), "nanos", 837000000);
        setLongField(term4007, term4007.getClass(), "fastTime", 1606034835000L);
        setField(term4007, term4007.getClass(), "cdate", null);
        setField(term3968, term3968.getClass(), "lastModifiedDate", term4007);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Notice");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term3968, args);
    }

};


