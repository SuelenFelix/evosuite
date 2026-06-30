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
import java.lang.Integer;

public class NoticeDto_setCreatedBy_29250558713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5612;
     Object term5650;

    public NoticeDto_setCreatedBy_29250558713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5653 = Class.forName((String) "ru.smartup.timetracker.entity.field.enumerated.NoticeTypeEnum");
        Field term5652 = ((Class) term5653).getDeclaredField((String) "PROJECT_UPDATE");
        ((Field) term5652).setAccessible(true);
        Object enum13 = ((Field) term5652).get((Object) null);
        term5612 = newInstance(Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto"));
        Object term5644 = newInstance(Class.forName("java.lang.Object"));
        Object term5647 = newInstance(Class.forName("java.sql.Timestamp"));
        setLongField(term5612, term5612.getClass(), "id", 2535595959091595249L);
        setField(term5612, term5612.getClass(), "type", enum13);
        setField(term5612, term5612.getClass(), "text", "LQFpaHEwXR");
        setField(term5612, term5612.getClass(), "data", term5644);
        setBooleanField(term5612, term5612.getClass(), "read", true);
        setIntField(term5612, term5612.getClass(), "createdBy", -469968304);
        setIntField(term5647, term5647.getClass(), "nanos", 80000000);
        setLongField(term5647, term5647.getClass(), "fastTime", 1745452162000L);
        setField(term5647, term5647.getClass(), "cdate", null);
        setField(term5612, term5612.getClass(), "createdDate", term5647);
        term5650 = new Integer(-1145578966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("ru.smartup.timetracker.dto.notice.response.NoticeDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5650;
        callMethod(klass, "setCreatedBy", argTypes, term5612, args);
    }

};


