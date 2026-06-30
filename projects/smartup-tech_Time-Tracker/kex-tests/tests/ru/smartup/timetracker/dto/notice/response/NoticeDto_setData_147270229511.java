package ru.smartup.timetracker.dto.notice.response;

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
import static ru.smartup.timetracker.dto.notice.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class NoticeDto_setData_147270229511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4785;
     Object term4829;

    public NoticeDto_setData_147270229511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4831 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term4830 = ((Class) term4831).getDeclaredField((String) "PROJECT_ROLE_GRANTED");
        ((Field) term4830).setAccessible(true);
        Object enum11 = ((Field) term4830).get((Object) null);
        term4785 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto"));
        Object term4823 = newInstance(Class.forName("java.lang.Object"));
        Object term4826 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term4785, term4785.getClass(), "id", -8885298608300233488L);
        setField(term4785, term4785.getClass(), "type", enum11);
        setField(term4785, term4785.getClass(), "text", "uuaPigETmJ");
        setField(term4785, term4785.getClass(), "data", term4823);
        setBooleanField(term4785, term4785.getClass(), "read", false);
        setIntField(term4785, term4785.getClass(), "createdBy", -1087774327);
        setIntField(term4826, term4826.getClass(), "nanos", 25000000);
        setLongField(term4826, term4826.getClass(), "fastTime", 1797192828000L);
        setField(term4826, term4826.getClass(), "cdate", null);
        setField(term4785, term4785.getClass(), "createdDate", term4826);
        term4829 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4829;
        callMethod(klass, "setData", argTypes, term4785, args);
    }

};


