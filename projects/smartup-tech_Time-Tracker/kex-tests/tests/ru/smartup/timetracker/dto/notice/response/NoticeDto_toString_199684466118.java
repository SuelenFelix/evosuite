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

public class NoticeDto_toString_199684466118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7633;

    public NoticeDto_toString_199684466118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7670 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term7669 = ((Class) term7670).getDeclaredField((String) "FREEZE_ERROR");
        ((Field) term7669).setAccessible(true);
        Object enum18 = ((Field) term7669).get((Object) null);
        term7633 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto"));
        Object term7663 = newInstance(Class.forName("java.lang.Object"));
        Object term7666 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term7633, term7633.getClass(), "id", -6573104506744284592L);
        setField(term7633, term7633.getClass(), "type", enum18);
        setField(term7633, term7633.getClass(), "text", "HyxfbSQYBe");
        setField(term7633, term7633.getClass(), "data", term7663);
        setBooleanField(term7633, term7633.getClass(), "read", false);
        setIntField(term7633, term7633.getClass(), "createdBy", -157887805);
        setIntField(term7666, term7666.getClass(), "nanos", 825000000);
        setLongField(term7666, term7666.getClass(), "fastTime", 1668558429000L);
        setField(term7666, term7666.getClass(), "cdate", null);
        setField(term7633, term7633.getClass(), "createdDate", term7666);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term7633, args);
    }

};


