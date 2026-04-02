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

public class Event_getContentId_15483176772 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term457;

    public Event_getContentId_15483176772() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term458 = new Long(6375119433582206027L);
        Class<? extends Object> term498 = Class.forName((String) "in.cubestack.apps.blog.event.domain.EventType");
        Field term497 = ((Class) term498).getDeclaredField((String) "TAG_CREATED");
        ((Field) term497).setAccessible(true);
        Object enum1 = ((Field) term497).get((Object) null);
        Long term475 = new Long(-8257434502486459194L);
        term457 = newInstance(Class.forName("in.cubestack.apps.blog.event.domain.Event"));
        Object term477 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term478 = newInstance(Class.forName("java.time.LocalDate"));
        Object term482 = newInstance(Class.forName("java.time.LocalTime"));
        Object term487 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term488 = newInstance(Class.forName("java.time.LocalDate"));
        Object term492 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term457, term457.getClass(), "contentId", term458);
        setField(term457, term457.getClass(), "eventType", enum1);
        setField(term457, term457.getClass(), "id", term475);
        setIntField(term478, term478.getClass(), "year", 2012);
        setShortField(term478, term478.getClass(), "month", (short) 8);
        setShortField(term478, term478.getClass(), "day", (short) 25);
        setField(term477, term477.getClass(), "date", term478);
        setByteField(term482, term482.getClass(), "hour", (byte) 5);
        setByteField(term482, term482.getClass(), "minute", (byte) 20);
        setByteField(term482, term482.getClass(), "second", (byte) 50);
        setIntField(term482, term482.getClass(), "nano", 345595912);
        setField(term477, term477.getClass(), "time", term482);
        setField(term457, term457.getClass(), "createdAt", term477);
        setIntField(term488, term488.getClass(), "year", 2021);
        setShortField(term488, term488.getClass(), "month", (short) 1);
        setShortField(term488, term488.getClass(), "day", (short) 18);
        setField(term487, term487.getClass(), "date", term488);
        setByteField(term492, term492.getClass(), "hour", (byte) 13);
        setByteField(term492, term492.getClass(), "minute", (byte) 38);
        setByteField(term492, term492.getClass(), "second", (byte) 26);
        setIntField(term492, term492.getClass(), "nano", 544608644);
        setField(term487, term487.getClass(), "time", term492);
        setField(term457, term457.getClass(), "updatedAt", term487);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.event.domain.Event");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContentId", argTypes, term457, args);
    }

};


