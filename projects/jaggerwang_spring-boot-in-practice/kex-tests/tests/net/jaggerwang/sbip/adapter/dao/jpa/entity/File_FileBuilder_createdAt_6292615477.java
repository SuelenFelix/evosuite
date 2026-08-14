package net.jaggerwang.sbip.adapter.dao.jpa.entity;

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
import static net.jaggerwang.sbip.adapter.dao.jpa.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class File_FileBuilder_createdAt_6292615477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2187;
     Object term2272;

    public File_FileBuilder_createdAt_6292615477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2188 = new Long(-2585684163342970173L);
        Long term2190 = new Long(8059786003080744426L);
        Class<? extends Object> term2283 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term2282 = ((Class) term2283).getDeclaredField((String) "LOCAL");
        ((Field) term2282).setAccessible(true);
        Object enum6 = ((Field) term2282).get((Object) null);
        Long term2238 = new Long(-4365849114644724155L);
        term2187 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File$FileBuilder"));
        Object term2225 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term2252 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2253 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2257 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2262 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2263 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2267 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term2187, term2187.getClass(), "id", term2188);
        setField(term2187, term2187.getClass(), "userId", term2190);
        setField(term2187, term2187.getClass(), "region", enum6);
        setField(term2187, term2187.getClass(), "bucket", "IoAlmYsBwc");
        setField(term2187, term2187.getClass(), "path", "TEParAifyi");
        setField(term2225, term2225.getClass(), "name", "OWDIEULEFu");
        setField(term2225, term2225.getClass(), "size", term2238);
        setField(term2225, term2225.getClass(), "type", "dWRymuLBtr");
        setField(term2187, term2187.getClass(), "meta", term2225);
        setIntField(term2253, term2253.getClass(), "year", 2012);
        setShortField(term2253, term2253.getClass(), "month", (short) 9);
        setShortField(term2253, term2253.getClass(), "day", (short) 11);
        setField(term2252, term2252.getClass(), "date", term2253);
        setByteField(term2257, term2257.getClass(), "hour", (byte) 22);
        setByteField(term2257, term2257.getClass(), "minute", (byte) 10);
        setByteField(term2257, term2257.getClass(), "second", (byte) 8);
        setIntField(term2257, term2257.getClass(), "nano", 380008862);
        setField(term2252, term2252.getClass(), "time", term2257);
        setField(term2187, term2187.getClass(), "createdAt", term2252);
        setIntField(term2263, term2263.getClass(), "year", 2021);
        setShortField(term2263, term2263.getClass(), "month", (short) 9);
        setShortField(term2263, term2263.getClass(), "day", (short) 7);
        setField(term2262, term2262.getClass(), "date", term2263);
        setByteField(term2267, term2267.getClass(), "hour", (byte) 5);
        setByteField(term2267, term2267.getClass(), "minute", (byte) 25);
        setByteField(term2267, term2267.getClass(), "second", (byte) 7);
        setIntField(term2267, term2267.getClass(), "nano", 755924076);
        setField(term2262, term2262.getClass(), "time", term2267);
        setField(term2187, term2187.getClass(), "updatedAt", term2262);
        term2272 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2273 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2277 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term2273, term2273.getClass(), "year", 2012);
        setShortField(term2273, term2273.getClass(), "month", (short) 2);
        setShortField(term2273, term2273.getClass(), "day", (short) 19);
        setField(term2272, term2272.getClass(), "date", term2273);
        setByteField(term2277, term2277.getClass(), "hour", (byte) 8);
        setByteField(term2277, term2277.getClass(), "minute", (byte) 4);
        setByteField(term2277, term2277.getClass(), "second", (byte) 43);
        setIntField(term2277, term2277.getClass(), "nano", 114930008);
        setField(term2272, term2272.getClass(), "time", term2277);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File$FileBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term2272;
        callMethod(klass, "createdAt", argTypes, term2187, args);
    }

};


