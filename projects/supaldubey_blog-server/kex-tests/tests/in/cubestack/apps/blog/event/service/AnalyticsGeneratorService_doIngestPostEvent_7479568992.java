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

public class AnalyticsGeneratorService_doIngestPostEvent_7479568992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1424;
     Object term1425;

    public AnalyticsGeneratorService_doIngestPostEvent_7479568992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1424 = newInstance(Class.forName("in.cubestack.apps.blog.event.service.AnalyticsGeneratorService"));
        setField(term1424, term1424.getClass(), "postService", null);
        Long term1426 = new Long(-7237588299778557629L);
        Class<? extends Object> term1465 = Class.forName((String) "in.cubestack.apps.blog.event.domain.EventType");
        Field term1464 = ((Class) term1465).getDeclaredField((String) "TAG_VIEWED");
        ((Field) term1464).setAccessible(true);
        Object enum4 = ((Field) term1464).get((Object) null);
        Long term1442 = new Long(6967924379644551255L);
        term1425 = newInstance(Class.forName("in.cubestack.apps.blog.event.domain.Event"));
        Object term1444 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1445 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1449 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1454 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1455 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1459 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term1425, term1425.getClass(), "contentId", term1426);
        setField(term1425, term1425.getClass(), "eventType", enum4);
        setField(term1425, term1425.getClass(), "id", term1442);
        setIntField(term1445, term1445.getClass(), "year", 2029);
        setShortField(term1445, term1445.getClass(), "month", (short) 8);
        setShortField(term1445, term1445.getClass(), "day", (short) 29);
        setField(term1444, term1444.getClass(), "date", term1445);
        setByteField(term1449, term1449.getClass(), "hour", (byte) 15);
        setByteField(term1449, term1449.getClass(), "minute", (byte) 50);
        setByteField(term1449, term1449.getClass(), "second", (byte) 1);
        setIntField(term1449, term1449.getClass(), "nano", 277971904);
        setField(term1444, term1444.getClass(), "time", term1449);
        setField(term1425, term1425.getClass(), "createdAt", term1444);
        setIntField(term1455, term1455.getClass(), "year", 2022);
        setShortField(term1455, term1455.getClass(), "month", (short) 11);
        setShortField(term1455, term1455.getClass(), "day", (short) 16);
        setField(term1454, term1454.getClass(), "date", term1455);
        setByteField(term1459, term1459.getClass(), "hour", (byte) 15);
        setByteField(term1459, term1459.getClass(), "minute", (byte) 54);
        setByteField(term1459, term1459.getClass(), "second", (byte) 2);
        setIntField(term1459, term1459.getClass(), "nano", 733274103);
        setField(term1454, term1454.getClass(), "time", term1459);
        setField(term1425, term1425.getClass(), "updatedAt", term1454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.event.service.AnalyticsGeneratorService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.event.domain.Event");
        Object[] args = new Object[1];
        args[0] = term1425;
        callMethod(klass, "doIngestPostEvent", argTypes, term1424, args);
    }

};


