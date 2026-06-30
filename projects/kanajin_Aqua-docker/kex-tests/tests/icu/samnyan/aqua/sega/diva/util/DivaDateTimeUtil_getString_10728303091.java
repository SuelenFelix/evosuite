package icu.samnyan.aqua.sega.diva.util;

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
import static icu.samnyan.aqua.sega.diva.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DivaDateTimeUtil_getString_10728303091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2695;

    public DivaDateTimeUtil_getString_10728303091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2695 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2696 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2700 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term2696, term2696.getClass(), "year", 2012);
        setShortField(term2696, term2696.getClass(), "month", (short) 8);
        setShortField(term2696, term2696.getClass(), "day", (short) 25);
        setField(term2695, term2695.getClass(), "date", term2696);
        setByteField(term2700, term2700.getClass(), "hour", (byte) 5);
        setByteField(term2700, term2700.getClass(), "minute", (byte) 20);
        setByteField(term2700, term2700.getClass(), "second", (byte) 50);
        setIntField(term2700, term2700.getClass(), "nano", 345595912);
        setField(term2695, term2695.getClass(), "time", term2700);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.util.DivaDateTimeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term2695;
        callMethod(klass, "getString", argTypes, null, args);
    }

};


