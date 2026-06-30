package icu.samnyan.aqua.sega.general.model;

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
import static icu.samnyan.aqua.sega.general.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Card_init_32557194314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2213;
     Object term2215;
     Object term2229;
     Object term2239;

    public Card_init_32557194314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2213 = new Long(-872011222785455006L);
        term2215 = new Long(-872011222785455006L);
        term2229 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2230 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2234 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term2230, term2230.getClass(), "year", 2020);
        setShortField(term2230, term2230.getClass(), "month", (short) 5);
        setShortField(term2230, term2230.getClass(), "day", (short) 18);
        setField(term2229, term2229.getClass(), "date", term2230);
        setByteField(term2234, term2234.getClass(), "hour", (byte) 5);
        setByteField(term2234, term2234.getClass(), "minute", (byte) 46);
        setByteField(term2234, term2234.getClass(), "second", (byte) 13);
        setIntField(term2234, term2234.getClass(), "nano", 45893173);
        setField(term2229, term2229.getClass(), "time", term2234);
        term2239 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2240 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2244 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term2240, term2240.getClass(), "year", 2017);
        setShortField(term2240, term2240.getClass(), "month", (short) 4);
        setShortField(term2240, term2240.getClass(), "day", (short) 3);
        setField(term2239, term2239.getClass(), "date", term2240);
        setByteField(term2244, term2244.getClass(), "hour", (byte) 6);
        setByteField(term2244, term2244.getClass(), "minute", (byte) 51);
        setByteField(term2244, term2244.getClass(), "second", (byte) 10);
        setIntField(term2244, term2244.getClass(), "nano", 316377166);
        setField(term2239, term2239.getClass(), "time", term2244);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.general.model.Card");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("java.lang.Long");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.time.LocalDateTime");
        argTypes[4] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[5];
        args[0] = term2213;
        args[1] = term2215;
        args[2] = "IgRJUzaCwW";
        args[3] = term2229;
        args[4] = term2239;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


