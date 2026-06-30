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

public class NoticeDto_isRead_19496097345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1965;

    public NoticeDto_isRead_19496097345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2004 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term2003 = ((Class) term2004).getDeclaredField((String) "FREEZE_SUCCESS");
        ((Field) term2003).setAccessible(true);
        Object enum4 = ((Field) term2003).get((Object) null);
        term1965 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto"));
        Object term1997 = newInstance(Class.forName("java.lang.Object"));
        Object term2000 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term1965, term1965.getClass(), "id", 5270370404989704783L);
        setField(term1965, term1965.getClass(), "type", enum4);
        setField(term1965, term1965.getClass(), "text", "jJCZpVmanW");
        setField(term1965, term1965.getClass(), "data", term1997);
        setBooleanField(term1965, term1965.getClass(), "read", true);
        setIntField(term1965, term1965.getClass(), "createdBy", -244121226);
        setIntField(term2000, term2000.getClass(), "nanos", 302000000);
        setLongField(term2000, term2000.getClass(), "fastTime", 1442628765000L);
        setField(term2000, term2000.getClass(), "cdate", null);
        setField(term1965, term1965.getClass(), "createdDate", term2000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isRead", argTypes, term1965, args);
    }

};


