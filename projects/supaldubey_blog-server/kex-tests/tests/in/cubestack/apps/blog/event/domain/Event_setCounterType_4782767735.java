package in.cubestack.apps.blog.event.domain;

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
import static in.cubestack.apps.blog.event.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class Event_setCounterType_4782767735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1370;
     Object enum5;

    public Event_setCounterType_4782767735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1371 = new Long(-7237588299778557629L);
        Class<? extends Object> term1424 = Class.forName((String) "in.cubestack.apps.blog.event.domain.EventType");
        Field term1423 = ((Class) term1424).getDeclaredField((String) "TAG_VIEWED");
        ((Field) term1423).setAccessible(true);
        Object enum4 = ((Field) term1423).get((Object) null);
        Long term1387 = new Long(6967924379644551255L);
        term1370 = newInstance(Class.forName("in.cubestack.apps.blog.event.domain.Event"));
        Object term1389 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1390 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1394 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1399 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1400 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1404 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1370, term1370.getClass(), "contentId", term1371);
        setField(term1370, term1370.getClass(), "eventType", enum4);
        setField(term1370, term1370.getClass(), "id", term1387);
        setIntField(term1390, term1390.getClass(), "year", 2025);
        setShortField(term1390, term1390.getClass(), "month", (short) 4);
        setShortField(term1390, term1390.getClass(), "day", (short) 24);
        setField(term1389, term1389.getClass(), "date", term1390);
        setByteField(term1394, term1394.getClass(), "hour", (byte) 18);
        setByteField(term1394, term1394.getClass(), "minute", (byte) 11);
        setByteField(term1394, term1394.getClass(), "second", (byte) 40);
        setIntField(term1394, term1394.getClass(), "nano", 137454929);
        setField(term1389, term1389.getClass(), "time", term1394);
        setField(term1370, term1370.getClass(), "createdAt", term1389);
        setIntField(term1400, term1400.getClass(), "year", 2024);
        setShortField(term1400, term1400.getClass(), "month", (short) 1);
        setShortField(term1400, term1400.getClass(), "day", (short) 24);
        setField(term1399, term1399.getClass(), "date", term1400);
        setByteField(term1404, term1404.getClass(), "hour", (byte) 20);
        setByteField(term1404, term1404.getClass(), "minute", (byte) 28);
        setByteField(term1404, term1404.getClass(), "second", (byte) 39);
        setIntField(term1404, term1404.getClass(), "nano", 952728177);
        setField(term1399, term1399.getClass(), "time", term1404);
        setField(term1370, term1370.getClass(), "updatedAt", term1399);
        Class<? extends Object> term1686 = Class.forName((String) "in.cubestack.apps.blog.event.domain.EventType");
        Field term1685 = ((Class) term1686).getDeclaredField((String) "POST_LIKES");
        ((Field) term1685).setAccessible(true);
        enum5 = ((Field) term1685).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.event.domain.Event");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.event.domain.EventType");
        Object[] args = new Object[1];
        args[0] = enum5;
        callMethod(klass, "setCounterType", argTypes, term1370, args);
    }

};


