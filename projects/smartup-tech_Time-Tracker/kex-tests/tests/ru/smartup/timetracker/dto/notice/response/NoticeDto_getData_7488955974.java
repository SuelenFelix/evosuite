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

public class NoticeDto_getData_7488955974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1567;

    public NoticeDto_getData_7488955974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1605 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term1604 = ((Class) term1605).getDeclaredField((String) "ADMIN_REMOVED");
        ((Field) term1604).setAccessible(true);
        Object enum3 = ((Field) term1604).get((Object) null);
        term1567 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto"));
        Object term1598 = newInstance(Class.forName("java.lang.Object"));
        Object term1601 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term1567, term1567.getClass(), "id", -8400487765614892086L);
        setField(term1567, term1567.getClass(), "type", enum3);
        setField(term1567, term1567.getClass(), "text", "xxtlPwDYFs");
        setField(term1567, term1567.getClass(), "data", term1598);
        setBooleanField(term1567, term1567.getClass(), "read", false);
        setIntField(term1567, term1567.getClass(), "createdBy", -1275173084);
        setIntField(term1601, term1601.getClass(), "nanos", 837000000);
        setLongField(term1601, term1601.getClass(), "fastTime", 1606034835000L);
        setField(term1601, term1601.getClass(), "cdate", null);
        setField(term1567, term1567.getClass(), "createdDate", term1601);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getData", argTypes, term1567, args);
    }

};


