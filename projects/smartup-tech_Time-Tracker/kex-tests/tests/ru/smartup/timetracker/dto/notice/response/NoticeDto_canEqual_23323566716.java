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

public class NoticeDto_canEqual_23323566716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6816;
     Object term6857;

    public NoticeDto_canEqual_23323566716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6859 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term6858 = ((Class) term6859).getDeclaredField((String) "PASSWORD_RECOVERY");
        ((Field) term6858).setAccessible(true);
        Object enum16 = ((Field) term6858).get((Object) null);
        term6816 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto"));
        Object term6851 = newInstance(Class.forName("java.lang.Object"));
        Object term6854 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term6816, term6816.getClass(), "id", -316468845751588286L);
        setField(term6816, term6816.getClass(), "type", enum16);
        setField(term6816, term6816.getClass(), "text", "ZiaGIbnzTs");
        setField(term6816, term6816.getClass(), "data", term6851);
        setBooleanField(term6816, term6816.getClass(), "read", true);
        setIntField(term6816, term6816.getClass(), "createdBy", 767834723);
        setIntField(term6854, term6854.getClass(), "nanos", 364000000);
        setLongField(term6854, term6854.getClass(), "fastTime", 1882628084000L);
        setField(term6854, term6854.getClass(), "cdate", null);
        setField(term6816, term6816.getClass(), "createdDate", term6854);
        term6857 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term6857;
        callMethod(klass, "canEqual", argTypes, term6816, args);
    }

};


