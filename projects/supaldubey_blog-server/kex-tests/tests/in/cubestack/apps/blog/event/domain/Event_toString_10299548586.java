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

public class Event_toString_10299548586 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1947;

    public Event_toString_10299548586() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1948 = new Long(-2813493605142626659L);
        Class<? extends Object> term1988 = Class.forName((String) "in.cubestack.apps.blog.event.domain.EventType");
        Field term1987 = ((Class) term1988).getDeclaredField((String) "TAG_CREATED");
        ((Field) term1987).setAccessible(true);
        Object enum6 = ((Field) term1987).get((Object) null);
        Long term1965 = new Long(-8885298608300233488L);
        term1947 = newInstance(Class.forName("in.cubestack.apps.blog.event.domain.Event"));
        Object term1967 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1968 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1972 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1977 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1978 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1982 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1947, term1947.getClass(), "contentId", term1948);
        setField(term1947, term1947.getClass(), "eventType", enum6);
        setField(term1947, term1947.getClass(), "id", term1965);
        setIntField(term1968, term1968.getClass(), "year", 2029);
        setShortField(term1968, term1968.getClass(), "month", (short) 8);
        setShortField(term1968, term1968.getClass(), "day", (short) 29);
        setField(term1967, term1967.getClass(), "date", term1968);
        setByteField(term1972, term1972.getClass(), "hour", (byte) 15);
        setByteField(term1972, term1972.getClass(), "minute", (byte) 50);
        setByteField(term1972, term1972.getClass(), "second", (byte) 1);
        setIntField(term1972, term1972.getClass(), "nano", 277971904);
        setField(term1967, term1967.getClass(), "time", term1972);
        setField(term1947, term1947.getClass(), "createdAt", term1967);
        setIntField(term1978, term1978.getClass(), "year", 2022);
        setShortField(term1978, term1978.getClass(), "month", (short) 11);
        setShortField(term1978, term1978.getClass(), "day", (short) 16);
        setField(term1977, term1977.getClass(), "date", term1978);
        setByteField(term1982, term1982.getClass(), "hour", (byte) 15);
        setByteField(term1982, term1982.getClass(), "minute", (byte) 54);
        setByteField(term1982, term1982.getClass(), "second", (byte) 2);
        setIntField(term1982, term1982.getClass(), "nano", 733274103);
        setField(term1977, term1977.getClass(), "time", term1982);
        setField(term1947, term1947.getClass(), "updatedAt", term1977);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.event.domain.Event");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1947, args);
    }

};


