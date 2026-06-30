package in.cubestack.apps.blog.event.service;

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
import static in.cubestack.apps.blog.event.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class AnalyticsGeneratorService_ingestPostEvent_13420830903 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1726;
     Object term1727;

    public AnalyticsGeneratorService_ingestPostEvent_13420830903() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1726 = newInstance(Class.forName("in.cubestack.apps.blog.event.service.AnalyticsGeneratorService"));
        setField(term1726, term1726.getClass(), "postService", null);
        Long term1728 = new Long(-2813493605142626659L);
        Class<? extends Object> term1767 = Class.forName((String) "in.cubestack.apps.blog.event.domain.EventType");
        Field term1766 = ((Class) term1767).getDeclaredField((String) "POST_LIKES");
        ((Field) term1766).setAccessible(true);
        Object enum5 = ((Field) term1766).get((Object) null);
        Long term1744 = new Long(-8885298608300233488L);
        term1727 = newInstance(Class.forName("in.cubestack.apps.blog.event.domain.Event"));
        Object term1746 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1747 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1751 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1756 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1757 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1761 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1727, term1727.getClass(), "contentId", term1728);
        setField(term1727, term1727.getClass(), "eventType", enum5);
        setField(term1727, term1727.getClass(), "id", term1744);
        setIntField(term1747, term1747.getClass(), "year", 2019);
        setShortField(term1747, term1747.getClass(), "month", (short) 2);
        setShortField(term1747, term1747.getClass(), "day", (short) 21);
        setField(term1746, term1746.getClass(), "date", term1747);
        setByteField(term1751, term1751.getClass(), "hour", (byte) 5);
        setByteField(term1751, term1751.getClass(), "minute", (byte) 41);
        setByteField(term1751, term1751.getClass(), "second", (byte) 11);
        setIntField(term1751, term1751.getClass(), "nano", 859829782);
        setField(term1746, term1746.getClass(), "time", term1751);
        setField(term1727, term1727.getClass(), "createdAt", term1746);
        setIntField(term1757, term1757.getClass(), "year", 2018);
        setShortField(term1757, term1757.getClass(), "month", (short) 9);
        setShortField(term1757, term1757.getClass(), "day", (short) 28);
        setField(term1756, term1756.getClass(), "date", term1757);
        setByteField(term1761, term1761.getClass(), "hour", (byte) 3);
        setByteField(term1761, term1761.getClass(), "minute", (byte) 37);
        setByteField(term1761, term1761.getClass(), "second", (byte) 46);
        setIntField(term1761, term1761.getClass(), "nano", 763326845);
        setField(term1756, term1756.getClass(), "time", term1761);
        setField(term1727, term1727.getClass(), "updatedAt", term1756);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.event.service.AnalyticsGeneratorService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.event.domain.Event");
        Object[] args = new Object[1];
        args[0] = term1727;
        callMethod(klass, "ingestPostEvent", argTypes, term1726, args);
    }

};


