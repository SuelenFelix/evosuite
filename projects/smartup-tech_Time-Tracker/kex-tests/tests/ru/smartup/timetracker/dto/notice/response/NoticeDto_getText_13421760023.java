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

public class NoticeDto_getText_13421760023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1185;

    public NoticeDto_getText_13421760023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1219 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term1218 = ((Class) term1219).getDeclaredField((String) "UN_FREEZE");
        ((Field) term1218).setAccessible(true);
        Object enum2 = ((Field) term1218).get((Object) null);
        term1185 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto"));
        Object term1212 = newInstance(Class.forName("java.lang.Object"));
        Object term1215 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term1185, term1185.getClass(), "id", -8257434502486459194L);
        setField(term1185, term1185.getClass(), "type", enum2);
        setField(term1185, term1185.getClass(), "text", "MuLcgQHgqz");
        setField(term1185, term1185.getClass(), "data", term1212);
        setBooleanField(term1185, term1185.getClass(), "read", false);
        setIntField(term1185, term1185.getClass(), "createdBy", 865208305);
        setIntField(term1215, term1215.getClass(), "nanos", 830000000);
        setLongField(term1215, term1215.getClass(), "fastTime", 1610929382000L);
        setField(term1215, term1215.getClass(), "cdate", null);
        setField(term1185, term1185.getClass(), "createdDate", term1215);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getText", argTypes, term1185, args);
    }

};


