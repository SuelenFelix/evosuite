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

public class NoticeDto_setText_123291472610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4369;

    public NoticeDto_setText_123291472610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4418 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term4417 = ((Class) term4418).getDeclaredField((String) "FREEZE_ERROR");
        ((Field) term4417).setAccessible(true);
        Object enum10 = ((Field) term4417).get((Object) null);
        term4369 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto"));
        Object term4399 = newInstance(Class.forName("java.lang.Object"));
        Object term4402 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term4369, term4369.getClass(), "id", -2813493605142626659L);
        setField(term4369, term4369.getClass(), "type", enum10);
        setField(term4369, term4369.getClass(), "text", "RMFIsYGgne");
        setField(term4369, term4369.getClass(), "data", term4399);
        setBooleanField(term4369, term4369.getClass(), "read", true);
        setIntField(term4369, term4369.getClass(), "createdBy", 1193880199);
        setIntField(term4402, term4402.getClass(), "nanos", 23000000);
        setLongField(term4402, term4402.getClass(), "fastTime", 1500710268000L);
        setField(term4402, term4402.getClass(), "cdate", null);
        setField(term4369, term4369.getClass(), "createdDate", term4402);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NRdvgJlhkX";
        callMethod(klass, "setText", argTypes, term4369, args);
    }

};


