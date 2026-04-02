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

public class CacheManagementService_manageCache_17991621091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term814;
     Object term816;

    public CacheManagementService_manageCache_17991621091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term814 = newInstance(Class.forName("in.cubestack.apps.blog.event.service.CacheManagementService"));
        Object term815 = newInstance(Class.forName("in.cubestack.apps.blog.event.service.CacheInvalidationService"));
        setField(term814, term814.getClass(), "cacheInvalidationService", term815);
        Long term817 = new Long(5270370404989704783L);
        Class<? extends Object> term856 = Class.forName((String) "in.cubestack.apps.blog.event.domain.EventType");
        Field term855 = ((Class) term856).getDeclaredField((String) "POST_VIEWS");
        ((Field) term855).setAccessible(true);
        Object enum2 = ((Field) term855).get((Object) null);
        Long term833 = new Long(7411271909051562686L);
        term816 = newInstance(Class.forName("in.cubestack.apps.blog.event.domain.Event"));
        Object term835 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term836 = newInstance(Class.forName("java.time.LocalDate"));
        Object term840 = newInstance(Class.forName("java.time.LocalTime"));
        Object term845 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term846 = newInstance(Class.forName("java.time.LocalDate"));
        Object term850 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term816, term816.getClass(), "contentId", term817);
        setField(term816, term816.getClass(), "eventType", enum2);
        setField(term816, term816.getClass(), "id", term833);
        setIntField(term836, term836.getClass(), "year", 2022);
        setShortField(term836, term836.getClass(), "month", (short) 2);
        setShortField(term836, term836.getClass(), "day", (short) 26);
        setField(term835, term835.getClass(), "date", term836);
        setByteField(term840, term840.getClass(), "hour", (byte) 11);
        setByteField(term840, term840.getClass(), "minute", (byte) 42);
        setByteField(term840, term840.getClass(), "second", (byte) 15);
        setIntField(term840, term840.getClass(), "nano", 377731937);
        setField(term835, term835.getClass(), "time", term840);
        setField(term816, term816.getClass(), "createdAt", term835);
        setIntField(term846, term846.getClass(), "year", 2026);
        setShortField(term846, term846.getClass(), "month", (short) 12);
        setShortField(term846, term846.getClass(), "day", (short) 14);
        setField(term845, term845.getClass(), "date", term846);
        setByteField(term850, term850.getClass(), "hour", (byte) 16);
        setByteField(term850, term850.getClass(), "minute", (byte) 34);
        setByteField(term850, term850.getClass(), "second", (byte) 9);
        setIntField(term850, term850.getClass(), "nano", 518326996);
        setField(term845, term845.getClass(), "time", term850);
        setField(term816, term816.getClass(), "updatedAt", term845);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.event.service.CacheManagementService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.event.domain.Event");
        Object[] args = new Object[1];
        args[0] = term816;
        callMethod(klass, "manageCache", argTypes, term814, args);
    }

};


