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

public class DivaDateTimeUtil_format_19689677652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2705;

    public DivaDateTimeUtil_format_19689677652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2705 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2706 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2710 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term2706, term2706.getClass(), "year", 2021);
        setShortField(term2706, term2706.getClass(), "month", (short) 1);
        setShortField(term2706, term2706.getClass(), "day", (short) 18);
        setField(term2705, term2705.getClass(), "date", term2706);
        setByteField(term2710, term2710.getClass(), "hour", (byte) 13);
        setByteField(term2710, term2710.getClass(), "minute", (byte) 38);
        setByteField(term2710, term2710.getClass(), "second", (byte) 26);
        setIntField(term2710, term2710.getClass(), "nano", 544608644);
        setField(term2705, term2705.getClass(), "time", term2710);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.util.DivaDateTimeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term2705;
        callMethod(klass, "format", argTypes, null, args);
    }

};


