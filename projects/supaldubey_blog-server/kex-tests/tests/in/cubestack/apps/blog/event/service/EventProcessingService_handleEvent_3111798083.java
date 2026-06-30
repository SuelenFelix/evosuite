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

public class EventProcessingService_handleEvent_3111798083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term491;
     Object term495;

    public EventProcessingService_handleEvent_3111798083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term491 = newInstance(Class.forName("in.cubestack.apps.blog.event.service.EventProcessingService"));
        Object term492 = newInstance(Class.forName("in.cubestack.apps.blog.event.service.AnalyticsGeneratorService"));
        Object term493 = newInstance(Class.forName("in.cubestack.apps.blog.event.service.CacheManagementService"));
        Object term494 = newInstance(Class.forName("in.cubestack.apps.blog.event.service.CacheInvalidationService"));
        setField(term492, term492.getClass(), "postService", null);
        setField(term491, term491.getClass(), "analyticsGeneratorService", term492);
        setField(term493, term493.getClass(), "cacheInvalidationService", term494);
        setField(term491, term491.getClass(), "cacheManagementService", term493);
        setField(term491, term491.getClass(), "executorService", null);
        Long term496 = new Long(-8257434502486459194L);
        Class<? extends Object> term536 = Class.forName((String) "in.cubestack.apps.blog.event.domain.EventType");
        Field term535 = ((Class) term536).getDeclaredField((String) "TAG_CREATED");
        ((Field) term535).setAccessible(true);
        Object enum1 = ((Field) term535).get((Object) null);
        Long term513 = new Long(-8400487765614892086L);
        term495 = newInstance(Class.forName("in.cubestack.apps.blog.event.domain.Event"));
        Object term515 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term516 = newInstance(Class.forName("java.time.LocalDate"));
        Object term520 = newInstance(Class.forName("java.time.LocalTime"));
        Object term525 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term526 = newInstance(Class.forName("java.time.LocalDate"));
        Object term530 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term495, term495.getClass(), "contentId", term496);
        setField(term495, term495.getClass(), "eventType", enum1);
        setField(term495, term495.getClass(), "id", term513);
        setIntField(term516, term516.getClass(), "year", 2015);
        setShortField(term516, term516.getClass(), "month", (short) 9);
        setShortField(term516, term516.getClass(), "day", (short) 19);
        setField(term515, term515.getClass(), "date", term516);
        setByteField(term520, term520.getClass(), "hour", (byte) 9);
        setByteField(term520, term520.getClass(), "minute", (byte) 4);
        setByteField(term520, term520.getClass(), "second", (byte) 10);
        setIntField(term520, term520.getClass(), "nano", 401765865);
        setField(term515, term515.getClass(), "time", term520);
        setField(term495, term495.getClass(), "createdAt", term515);
        setIntField(term526, term526.getClass(), "year", 2015);
        setShortField(term526, term526.getClass(), "month", (short) 4);
        setShortField(term526, term526.getClass(), "day", (short) 14);
        setField(term525, term525.getClass(), "date", term526);
        setByteField(term530, term530.getClass(), "hour", (byte) 18);
        setByteField(term530, term530.getClass(), "minute", (byte) 24);
        setByteField(term530, term530.getClass(), "second", (byte) 32);
        setIntField(term530, term530.getClass(), "nano", 369233818);
        setField(term525, term525.getClass(), "time", term530);
        setField(term495, term495.getClass(), "updatedAt", term525);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.event.service.EventProcessingService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.event.domain.Event");
        Object[] args = new Object[1];
        args[0] = term495;
        callMethod(klass, "handleEvent", argTypes, term491, args);
    }

};


