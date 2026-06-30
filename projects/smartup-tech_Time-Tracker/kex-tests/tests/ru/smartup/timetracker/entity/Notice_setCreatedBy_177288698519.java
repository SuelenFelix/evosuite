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

public class Notice_setCreatedBy_177288698519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10907;
     Object term10955;

    public Notice_setCreatedBy_177288698519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10958 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term10957 = ((Class) term10958).getDeclaredField((String) "PROJECT_ROLE_CHANGE");
        ((Field) term10957).setAccessible(true);
        Object enum26 = ((Field) term10957).get((Object) null);
        term10907 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term10945 = newInstance(Class.forName("java.lang.Object"));
        Object term10949 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term10952 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term10907, term10907.getClass(), "id", -6573104506744284592L);
        setField(term10907, term10907.getClass(), "type", enum26);
        setIntField(term10907, term10907.getClass(), "employeeId", 767834723);
        setField(term10907, term10907.getClass(), "text", "flxyYxBRtu");
        setField(term10907, term10907.getClass(), "data", term10945);
        setBooleanField(term10907, term10907.getClass(), "read", true);
        setBooleanField(term10907, term10907.getClass(), "deleted", true);
        setIntField(term10907, term10907.getClass(), "createdBy", -602026508);
        setIntField(term10949, term10949.getClass(), "nanos", 559000000);
        setLongField(term10949, term10949.getClass(), "fastTime", 1876862000000L);
        setField(term10949, term10949.getClass(), "cdate", null);
        setField(term10907, term10907.getClass(), "createdDate", term10949);
        setIntField(term10952, term10952.getClass(), "nanos", 366000000);
        setLongField(term10952, term10952.getClass(), "fastTime", 1304521299000L);
        setField(term10952, term10952.getClass(), "cdate", null);
        setField(term10907, term10907.getClass(), "lastModifiedDate", term10952);
        term10955 = new Integer(-157887805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.entity.Notice");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term10955;
        callMethod(klass, "setCreatedBy", argTypes, term10907, args);
    }

};


