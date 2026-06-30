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

public class NoticeDto_getCreatedBy_14756033636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2367;

    public NoticeDto_getCreatedBy_14756033636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2411 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term2410 = ((Class) term2411).getDeclaredField((String) "PROJECT_ROLE_CHANGE");
        ((Field) term2410).setAccessible(true);
        Object enum5 = ((Field) term2410).get((Object) null);
        term2367 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto"));
        Object term2404 = newInstance(Class.forName("java.lang.Object"));
        Object term2407 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term2367, term2367.getClass(), "id", 7411271909051562686L);
        setField(term2367, term2367.getClass(), "type", enum5);
        setField(term2367, term2367.getClass(), "text", "EGtDIRbSSb");
        setField(term2367, term2367.getClass(), "data", term2404);
        setBooleanField(term2367, term2367.getClass(), "read", true);
        setIntField(term2367, term2367.getClass(), "createdBy", -203030934);
        setIntField(term2407, term2407.getClass(), "nanos", 18000000);
        setLongField(term2407, term2407.getClass(), "fastTime", 1515879330000L);
        setField(term2407, term2407.getClass(), "cdate", null);
        setField(term2367, term2367.getClass(), "createdDate", term2407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedBy", argTypes, term2367, args);
    }

};


