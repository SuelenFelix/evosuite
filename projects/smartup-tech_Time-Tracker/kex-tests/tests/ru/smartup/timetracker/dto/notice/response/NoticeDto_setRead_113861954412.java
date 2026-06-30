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
import java.lang.Boolean;

public class NoticeDto_setRead_113861954412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5212;
     Object term5249;

    public NoticeDto_setRead_113861954412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5252 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term5251 = ((Class) term5252).getDeclaredField((String) "FREEZE_CANCEL");
        ((Field) term5251).setAccessible(true);
        Object enum12 = ((Field) term5251).get((Object) null);
        term5212 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto"));
        Object term5243 = newInstance(Class.forName("java.lang.Object"));
        Object term5246 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term5212, term5212.getClass(), "id", -4325723315152823407L);
        setField(term5212, term5212.getClass(), "type", enum12);
        setField(term5212, term5212.getClass(), "text", "MxlszYVzRf");
        setField(term5212, term5212.getClass(), "data", term5243);
        setBooleanField(term5212, term5212.getClass(), "read", true);
        setIntField(term5212, term5212.getClass(), "createdBy", -1530420153);
        setIntField(term5246, term5246.getClass(), "nanos", 30000000);
        setLongField(term5246, term5246.getClass(), "fastTime", 1589447121000L);
        setField(term5246, term5246.getClass(), "cdate", null);
        setField(term5212, term5212.getClass(), "createdDate", term5246);
        term5249 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term5249;
        callMethod(klass, "setRead", argTypes, term5212, args);
    }

};


