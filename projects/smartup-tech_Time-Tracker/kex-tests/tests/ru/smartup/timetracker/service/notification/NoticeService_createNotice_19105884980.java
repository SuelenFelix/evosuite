package ru.smartup.timetracker.service.notification;

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
import static ru.smartup.timetracker.service.notification.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class NoticeService_createNotice_19105884980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7918;

    public NoticeService_createNotice_19105884980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7968 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term7967 = ((Class) term7968).getDeclaredField((String) "PROJECT_ROLE_GRANTED");
        ((Field) term7967).setAccessible(true);
        Object enum15 = ((Field) term7967).get((Object) null);
        term7918 = newInstance(Class.forName("ru.smartup.timetracker.entity.Notice"));
        Object term7957 = newInstance(Class.forName("java.lang.Object"));
        Object term7961 = newInstance(Class.forName("java.sql.Timestamp"));
        Object term7964 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term7918, term7918.getClass(), "id", -2813493605142626659L);
        setField(term7918, term7918.getClass(), "type", enum15);
        setIntField(term7918, term7918.getClass(), "employeeId", -2015854073);
        setField(term7918, term7918.getClass(), "text", "xtftXXMbem");
        setField(term7918, term7918.getClass(), "data", term7957);
        setBooleanField(term7918, term7918.getClass(), "read", true);
        setBooleanField(term7918, term7918.getClass(), "deleted", false);
        setIntField(term7918, term7918.getClass(), "createdBy", 538259104);
        setIntField(term7961, term7961.getClass(), "nanos", 999000000);
        setLongField(term7961, term7961.getClass(), "fastTime", 1689418010000L);
        setField(term7961, term7961.getClass(), "cdate", null);
        setField(term7918, term7918.getClass(), "createdDate", term7961);
        setIntField(term7964, term7964.getClass(), "nanos", 79000000);
        setLongField(term7964, term7964.getClass(), "fastTime", 1570703521000L);
        setField(term7964, term7964.getClass(), "cdate", null);
        setField(term7918, term7918.getClass(), "lastModifiedDate", term7964);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.service.notification.NoticeService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("ru.smartup.timetracker.entity.Notice");
        Object[] args = new Object[1];
        args[0] = term7918;
        callMethod(klass, "createNotice", argTypes, null, args);
    }

};


