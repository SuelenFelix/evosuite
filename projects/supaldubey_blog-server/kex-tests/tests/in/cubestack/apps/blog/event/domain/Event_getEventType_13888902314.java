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

public class Event_getEventType_13888902314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1065;

    public Event_getEventType_13888902314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1066 = new Long(4872422362414183754L);
        Class<? extends Object> term1106 = Class.forName((String) "in.cubestack.apps.blog.event.domain.EventType");
        Field term1105 = ((Class) term1106).getDeclaredField((String) "TAG_UPDATED");
        ((Field) term1105).setAccessible(true);
        Object enum3 = ((Field) term1105).get((Object) null);
        Long term1083 = new Long(6811161968424632369L);
        term1065 = newInstance(Class.forName("in.cubestack.apps.blog.event.domain.Event"));
        Object term1085 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1086 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1090 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1095 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1096 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1100 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1065, term1065.getClass(), "contentId", term1066);
        setField(term1065, term1065.getClass(), "eventType", enum3);
        setField(term1065, term1065.getClass(), "id", term1083);
        setIntField(term1086, term1086.getClass(), "year", 2022);
        setShortField(term1086, term1086.getClass(), "month", (short) 2);
        setShortField(term1086, term1086.getClass(), "day", (short) 26);
        setField(term1085, term1085.getClass(), "date", term1086);
        setByteField(term1090, term1090.getClass(), "hour", (byte) 11);
        setByteField(term1090, term1090.getClass(), "minute", (byte) 42);
        setByteField(term1090, term1090.getClass(), "second", (byte) 15);
        setIntField(term1090, term1090.getClass(), "nano", 377731937);
        setField(term1085, term1085.getClass(), "time", term1090);
        setField(term1065, term1065.getClass(), "createdAt", term1085);
        setIntField(term1096, term1096.getClass(), "year", 2026);
        setShortField(term1096, term1096.getClass(), "month", (short) 12);
        setShortField(term1096, term1096.getClass(), "day", (short) 14);
        setField(term1095, term1095.getClass(), "date", term1096);
        setByteField(term1100, term1100.getClass(), "hour", (byte) 16);
        setByteField(term1100, term1100.getClass(), "minute", (byte) 34);
        setByteField(term1100, term1100.getClass(), "second", (byte) 9);
        setIntField(term1100, term1100.getClass(), "nano", 518326996);
        setField(term1095, term1095.getClass(), "time", term1100);
        setField(term1065, term1065.getClass(), "updatedAt", term1095);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.event.domain.Event");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEventType", argTypes, term1065, args);
    }

};


