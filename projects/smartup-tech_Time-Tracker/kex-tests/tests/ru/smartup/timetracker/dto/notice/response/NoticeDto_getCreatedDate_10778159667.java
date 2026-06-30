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

public class NoticeDto_getCreatedDate_10778159667 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2789;

    public NoticeDto_getCreatedDate_10778159667() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2828 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term2827 = ((Class) term2828).getDeclaredField((String) "FREEZE_SUCCESS");
        ((Field) term2827).setAccessible(true);
        Object enum6 = ((Field) term2827).get((Object) null);
        term2789 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto"));
        Object term2821 = newInstance(Class.forName("java.lang.Object"));
        Object term2824 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term2789, term2789.getClass(), "id", 4872422362414183754L);
        setField(term2789, term2789.getClass(), "type", enum6);
        setField(term2789, term2789.getClass(), "text", "SzjVpOQTyS");
        setField(term2789, term2789.getClass(), "data", term2821);
        setBooleanField(term2789, term2789.getClass(), "read", true);
        setIntField(term2789, term2789.getClass(), "createdBy", -1179120542);
        setIntField(term2824, term2824.getClass(), "nanos", 389000000);
        setLongField(term2824, term2824.getClass(), "fastTime", 1429013051000L);
        setField(term2824, term2824.getClass(), "cdate", null);
        setField(term2789, term2789.getClass(), "createdDate", term2824);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreatedDate", argTypes, term2789, args);
    }

};


