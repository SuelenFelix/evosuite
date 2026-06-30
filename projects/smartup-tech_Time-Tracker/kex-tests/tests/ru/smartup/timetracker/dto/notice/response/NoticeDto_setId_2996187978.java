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
import java.lang.Long;

public class NoticeDto_setId_2996187978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3191;
     Object term3229;

    public NoticeDto_setId_2996187978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3232 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term3231 = ((Class) term3232).getDeclaredField((String) "FREEZE_SUCCESS");
        ((Field) term3231).setAccessible(true);
        Object enum7 = ((Field) term3231).get((Object) null);
        term3191 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto"));
        Object term3223 = newInstance(Class.forName("java.lang.Object"));
        Object term3226 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term3191, term3191.getClass(), "id", 6811161968424632369L);
        setField(term3191, term3191.getClass(), "type", enum7);
        setField(term3191, term3191.getClass(), "text", "MjGYSRKTNF");
        setField(term3191, term3191.getClass(), "data", term3223);
        setBooleanField(term3191, term3191.getClass(), "read", true);
        setIntField(term3191, term3191.getClass(), "createdBy", -73683645);
        setIntField(term3226, term3226.getClass(), "nanos", 288000000);
        setLongField(term3226, term3226.getClass(), "fastTime", 1495346663000L);
        setField(term3226, term3226.getClass(), "cdate", null);
        setField(term3191, term3191.getClass(), "createdDate", term3226);
        term3229 = new Long(-7237588299778557629L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term3229;
        callMethod(klass, "setId", argTypes, term3191, args);
    }

};


