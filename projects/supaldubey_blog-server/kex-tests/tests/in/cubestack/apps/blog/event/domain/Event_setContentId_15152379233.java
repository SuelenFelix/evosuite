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

public class Event_setContentId_15152379233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term762;
     Object term801;

    public Event_setContentId_15152379233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term763 = new Long(-8400487765614892086L);
        Class<? extends Object> term804 = Class.forName((String) "in.cubestack.apps.blog.event.domain.EventType");
        Field term803 = ((Class) term804).getDeclaredField((String) "POST_VIEWS");
        ((Field) term803).setAccessible(true);
        Object enum2 = ((Field) term803).get((Object) null);
        Long term779 = new Long(5270370404989704783L);
        term762 = newInstance(Class.forName("in.cubestack.apps.blog.event.domain.Event"));
        Object term781 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term782 = newInstance(Class.forName("java.time.LocalDate"));
        Object term786 = newInstance(Class.forName("java.time.LocalTime"));
        Object term791 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term792 = newInstance(Class.forName("java.time.LocalDate"));
        Object term796 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term762, term762.getClass(), "contentId", term763);
        setField(term762, term762.getClass(), "eventType", enum2);
        setField(term762, term762.getClass(), "id", term779);
        setIntField(term782, term782.getClass(), "year", 2015);
        setShortField(term782, term782.getClass(), "month", (short) 9);
        setShortField(term782, term782.getClass(), "day", (short) 19);
        setField(term781, term781.getClass(), "date", term782);
        setByteField(term786, term786.getClass(), "hour", (byte) 9);
        setByteField(term786, term786.getClass(), "minute", (byte) 4);
        setByteField(term786, term786.getClass(), "second", (byte) 10);
        setIntField(term786, term786.getClass(), "nano", 401765865);
        setField(term781, term781.getClass(), "time", term786);
        setField(term762, term762.getClass(), "createdAt", term781);
        setIntField(term792, term792.getClass(), "year", 2015);
        setShortField(term792, term792.getClass(), "month", (short) 4);
        setShortField(term792, term792.getClass(), "day", (short) 14);
        setField(term791, term791.getClass(), "date", term792);
        setByteField(term796, term796.getClass(), "hour", (byte) 18);
        setByteField(term796, term796.getClass(), "minute", (byte) 24);
        setByteField(term796, term796.getClass(), "second", (byte) 32);
        setIntField(term796, term796.getClass(), "nano", 369233818);
        setField(term791, term791.getClass(), "time", term796);
        setField(term762, term762.getClass(), "updatedAt", term791);
        term801 = new Long(7411271909051562686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.event.domain.Event");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term801;
        callMethod(klass, "setContentId", argTypes, term762, args);
    }

};


