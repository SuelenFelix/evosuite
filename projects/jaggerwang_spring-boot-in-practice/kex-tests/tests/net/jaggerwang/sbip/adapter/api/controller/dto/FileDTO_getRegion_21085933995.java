package net.jaggerwang.sbip.adapter.api.controller.dto;

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
import static net.jaggerwang.sbip.adapter.api.controller.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;

public class FileDTO_getRegion_21085933995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19130;

    public FileDTO_getRegion_21085933995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term19131 = new Long(-1571034605670661708L);
        Long term19133 = new Long(-7983954942068142191L);
        Class<? extends Object> term19239 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term19238 = ((Class) term19239).getDeclaredField((String) "LOCAL");
        ((Field) term19238).setAccessible(true);
        Object enum34 = ((Field) term19238).get((Object) null);
        Long term19181 = new Long(2274723545906746965L);
        HashMap term19227 = new HashMap();
        term19130 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO"));
        Object term19168 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term19195 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19196 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19200 = newInstance(Class.forName("java.time.LocalTime"));
        Object term19205 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19206 = newInstance(Class.forName("java.time.LocalDate"));
        Object term19210 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term19130, term19130.getClass(), "id", term19131);
        setField(term19130, term19130.getClass(), "userId", term19133);
        setField(term19130, term19130.getClass(), "region", enum34);
        setField(term19130, term19130.getClass(), "bucket", "jiUSjqwSIQ");
        setField(term19130, term19130.getClass(), "path", "MgLCedQfoj");
        setField(term19168, term19168.getClass(), "name", "zgKiINdgNu");
        setField(term19168, term19168.getClass(), "size", term19181);
        setField(term19168, term19168.getClass(), "type", "zLMTXDQHYH");
        setField(term19130, term19130.getClass(), "meta", term19168);
        setIntField(term19196, term19196.getClass(), "year", 2028);
        setShortField(term19196, term19196.getClass(), "month", (short) 12);
        setShortField(term19196, term19196.getClass(), "day", (short) 2);
        setField(term19195, term19195.getClass(), "date", term19196);
        setByteField(term19200, term19200.getClass(), "hour", (byte) 18);
        setByteField(term19200, term19200.getClass(), "minute", (byte) 6);
        setByteField(term19200, term19200.getClass(), "second", (byte) 45);
        setIntField(term19200, term19200.getClass(), "nano", 967474945);
        setField(term19195, term19195.getClass(), "time", term19200);
        setField(term19130, term19130.getClass(), "createdAt", term19195);
        setIntField(term19206, term19206.getClass(), "year", 2018);
        setShortField(term19206, term19206.getClass(), "month", (short) 11);
        setShortField(term19206, term19206.getClass(), "day", (short) 11);
        setField(term19205, term19205.getClass(), "date", term19206);
        setByteField(term19210, term19210.getClass(), "hour", (byte) 11);
        setByteField(term19210, term19210.getClass(), "minute", (byte) 30);
        setByteField(term19210, term19210.getClass(), "second", (byte) 33);
        setIntField(term19210, term19210.getClass(), "nano", 101261443);
        setField(term19205, term19205.getClass(), "time", term19210);
        setField(term19130, term19130.getClass(), "updatedAt", term19205);
        setField(term19130, term19130.getClass(), "url", "PqywFWJlpE");
        setField(term19130, term19130.getClass(), "thumbs", term19227);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.api.controller.dto.FileDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegion", argTypes, term19130, args);
    }

};


