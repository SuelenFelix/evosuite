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

public class File_setUpdatedAt_145025007619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20467;
     Object term20552;

    public File_setUpdatedAt_145025007619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term20468 = new Long(8847748922379375307L);
        Long term20470 = new Long(1350676497718116574L);
        Class<? extends Object> term20563 = Class.forName((String) "net.jaggerwang.sbip.entity.FileBO$Region");
        Field term20562 = ((Class) term20563).getDeclaredField((String) "LOCAL");
        ((Field) term20562).setAccessible(true);
        Object enum53 = ((Field) term20562).get((Object) null);
        Long term20518 = new Long(-4477377284889705897L);
        term20467 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File"));
        Object term20505 = newInstance(Class.forName("net.jaggerwang.sbip.entity.FileBO$Meta"));
        Object term20532 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20533 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20537 = newInstance(Class.forName("java.time.LocalTime"));
        Object term20542 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20543 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20547 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term20467, term20467.getClass(), "id", term20468);
        setField(term20467, term20467.getClass(), "userId", term20470);
        setField(term20467, term20467.getClass(), "region", enum53);
        setField(term20467, term20467.getClass(), "bucket", "vGiuZVPJNH");
        setField(term20467, term20467.getClass(), "path", "tlzpzIjMib");
        setField(term20505, term20505.getClass(), "name", "AZdLeSugwv");
        setField(term20505, term20505.getClass(), "size", term20518);
        setField(term20505, term20505.getClass(), "type", "RMsXuyzKJV");
        setField(term20467, term20467.getClass(), "meta", term20505);
        setIntField(term20533, term20533.getClass(), "year", 2011);
        setShortField(term20533, term20533.getClass(), "month", (short) 8);
        setShortField(term20533, term20533.getClass(), "day", (short) 29);
        setField(term20532, term20532.getClass(), "date", term20533);
        setByteField(term20537, term20537.getClass(), "hour", (byte) 10);
        setByteField(term20537, term20537.getClass(), "minute", (byte) 15);
        setByteField(term20537, term20537.getClass(), "second", (byte) 18);
        setIntField(term20537, term20537.getClass(), "nano", 171360352);
        setField(term20532, term20532.getClass(), "time", term20537);
        setField(term20467, term20467.getClass(), "createdAt", term20532);
        setIntField(term20543, term20543.getClass(), "year", 2019);
        setShortField(term20543, term20543.getClass(), "month", (short) 5);
        setShortField(term20543, term20543.getClass(), "day", (short) 16);
        setField(term20542, term20542.getClass(), "date", term20543);
        setByteField(term20547, term20547.getClass(), "hour", (byte) 3);
        setByteField(term20547, term20547.getClass(), "minute", (byte) 12);
        setByteField(term20547, term20547.getClass(), "second", (byte) 27);
        setIntField(term20547, term20547.getClass(), "nano", 775737832);
        setField(term20542, term20542.getClass(), "time", term20547);
        setField(term20467, term20467.getClass(), "updatedAt", term20542);
        term20552 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term20553 = newInstance(Class.forName("java.time.LocalDate"));
        Object term20557 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term20553, term20553.getClass(), "year", 2016);
        setShortField(term20553, term20553.getClass(), "month", (short) 12);
        setShortField(term20553, term20553.getClass(), "day", (short) 2);
        setField(term20552, term20552.getClass(), "date", term20553);
        setByteField(term20557, term20557.getClass(), "hour", (byte) 7);
        setByteField(term20557, term20557.getClass(), "minute", (byte) 38);
        setByteField(term20557, term20557.getClass(), "second", (byte) 49);
        setIntField(term20557, term20557.getClass(), "nano", 415044053);
        setField(term20552, term20552.getClass(), "time", term20557);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.File");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term20552;
        callMethod(klass, "setUpdatedAt", argTypes, term20467, args);
    }

};


