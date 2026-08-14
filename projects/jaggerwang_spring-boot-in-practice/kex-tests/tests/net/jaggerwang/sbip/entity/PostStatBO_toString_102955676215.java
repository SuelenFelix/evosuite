package net.jaggerwang.sbip.entity;

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
import static net.jaggerwang.sbip.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class PostStatBO_toString_102955676215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24843;

    public PostStatBO_toString_102955676215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24844 = new Long(4892304277320345810L);
        Long term24846 = new Long(-3271370917942710167L);
        Long term24848 = new Long(0L);
        term24843 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostStatBO"));
        Object term24850 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24851 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24855 = newInstance(Class.forName("java.time.LocalTime"));
        Object term24860 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24861 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24865 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term24843, term24843.getClass(), "id", term24844);
        setField(term24843, term24843.getClass(), "postId", term24846);
        setField(term24843, term24843.getClass(), "likeCount", term24848);
        setIntField(term24851, term24851.getClass(), "year", 2010);
        setShortField(term24851, term24851.getClass(), "month", (short) 5);
        setShortField(term24851, term24851.getClass(), "day", (short) 19);
        setField(term24850, term24850.getClass(), "date", term24851);
        setByteField(term24855, term24855.getClass(), "hour", (byte) 12);
        setByteField(term24855, term24855.getClass(), "minute", (byte) 17);
        setByteField(term24855, term24855.getClass(), "second", (byte) 52);
        setIntField(term24855, term24855.getClass(), "nano", 273610077);
        setField(term24850, term24850.getClass(), "time", term24855);
        setField(term24843, term24843.getClass(), "createdAt", term24850);
        setIntField(term24861, term24861.getClass(), "year", 2017);
        setShortField(term24861, term24861.getClass(), "month", (short) 4);
        setShortField(term24861, term24861.getClass(), "day", (short) 5);
        setField(term24860, term24860.getClass(), "date", term24861);
        setByteField(term24865, term24865.getClass(), "hour", (byte) 15);
        setByteField(term24865, term24865.getClass(), "minute", (byte) 9);
        setByteField(term24865, term24865.getClass(), "second", (byte) 36);
        setIntField(term24865, term24865.getClass(), "nano", 504876449);
        setField(term24860, term24860.getClass(), "time", term24865);
        setField(term24843, term24843.getClass(), "updatedAt", term24860);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostStatBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term24843, args);
    }

};


