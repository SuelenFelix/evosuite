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
import java.lang.Object;
import java.lang.Long;
import java.lang.String;

public class EventProcessingService_process_6070344352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8;
     Object term12;

    public EventProcessingService_process_6070344352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8 = newInstance(Class.forName("in.cubestack.apps.blog.event.service.EventProcessingService"));
        Object term9 = newInstance(Class.forName("in.cubestack.apps.blog.event.service.AnalyticsGeneratorService"));
        Object term10 = newInstance(Class.forName("in.cubestack.apps.blog.event.service.CacheManagementService"));
        Object term11 = newInstance(Class.forName("in.cubestack.apps.blog.event.service.CacheInvalidationService"));
        setField(term9, term9.getClass(), "postService", null);
        setField(term8, term8.getClass(), "analyticsGeneratorService", term9);
        setField(term10, term10.getClass(), "cacheInvalidationService", term11);
        setField(term8, term8.getClass(), "cacheManagementService", term10);
        setField(term8, term8.getClass(), "executorService", null);
        Long term13 = new Long(2442117782898005296L);
        Class<? extends Object> term230 = Class.forName((String) "in.cubestack.apps.blog.event.domain.EventType");
        Field term229 = ((Class) term230).getDeclaredField((String) "TAG_VIEWED");
        ((Field) term229).setAccessible(true);
        Object enum0 = ((Field) term229).get((Object) null);
        Long term29 = new Long(6375119433582206027L);
        term12 = newInstance(Class.forName("in.cubestack.apps.blog.event.domain.Event"));
        Object term31 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36 = newInstance(Class.forName("java.time.LocalTime"));
        Object term41 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term42 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12, term12.getClass(), "contentId", term13);
        setField(term12, term12.getClass(), "eventType", enum0);
        setField(term12, term12.getClass(), "id", term29);
        setIntField(term32, term32.getClass(), "year", 2012);
        setShortField(term32, term32.getClass(), "month", (short) 8);
        setShortField(term32, term32.getClass(), "day", (short) 25);
        setField(term31, term31.getClass(), "date", term32);
        setByteField(term36, term36.getClass(), "hour", (byte) 5);
        setByteField(term36, term36.getClass(), "minute", (byte) 20);
        setByteField(term36, term36.getClass(), "second", (byte) 50);
        setIntField(term36, term36.getClass(), "nano", 345595912);
        setField(term31, term31.getClass(), "time", term36);
        setField(term12, term12.getClass(), "createdAt", term31);
        setIntField(term42, term42.getClass(), "year", 2021);
        setShortField(term42, term42.getClass(), "month", (short) 1);
        setShortField(term42, term42.getClass(), "day", (short) 18);
        setField(term41, term41.getClass(), "date", term42);
        setByteField(term46, term46.getClass(), "hour", (byte) 13);
        setByteField(term46, term46.getClass(), "minute", (byte) 38);
        setByteField(term46, term46.getClass(), "second", (byte) 26);
        setIntField(term46, term46.getClass(), "nano", 544608644);
        setField(term41, term41.getClass(), "time", term46);
        setField(term12, term12.getClass(), "updatedAt", term41);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.event.service.EventProcessingService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.event.domain.Event");
        Object[] args = new Object[1];
        args[0] = term12;
        callMethod(klass, "process", argTypes, term8, args);
    }

};


