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

public class Notice_setText_83247784615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9248;

    public Notice_setText_83247784615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9307 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term9306 = ((Class) term9307).getDeclaredField((String) "PASSWORD_RECOVERY");
        ((Field) term9306).setAccessible(true);
        Object enum22 = ((Field) term9306).get((Object) null);
        term9248 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term9284 = newInstance(Class.forName("java.lang.Object"));
        Object term9288 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term9291 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term9248, term9248.getClass(), "id", -5476826692763582090L);
        setField(term9248, term9248.getClass(), "type", enum22);
        setIntField(term9248, term9248.getClass(), "employeeId", -226514366);
        setField(term9248, term9248.getClass(), "text", "RkybSrpybU");
        setField(term9248, term9248.getClass(), "data", term9284);
        setBooleanField(term9248, term9248.getClass(), "read", false);
        setBooleanField(term9248, term9248.getClass(), "deleted", false);
        setIntField(term9248, term9248.getClass(), "createdBy", 1193880199);
        setIntField(term9288, term9288.getClass(), "nanos", 759000000);
        setLongField(term9288, term9288.getClass(), "fastTime", 1630941844000L);
        setField(term9288, term9288.getClass(), "cdate", null);
        setField(term9248, term9248.getClass(), "createdDate", term9288);
        setIntField(term9291, term9291.getClass(), "nanos", 956000000);
        setLongField(term9291, term9291.getClass(), "fastTime", 1739406992000L);
        setField(term9291, term9291.getClass(), "cdate", null);
        setField(term9248, term9248.getClass(), "lastModifiedDate", term9291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Notice");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xOEqzGAmDU";
        callMethod(klass, "setText", argTypes, term9248, args);
    }

};


