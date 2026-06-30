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

public class Card_equals_67492842810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2027;
     Object term2063;

    public Card_equals_67492842810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2029 = new Long(-8885298608300233488L);
        term2027 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term2043 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2044 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2048 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2053 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2054 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2058 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term2027, term2027.getClass(), "id", -8885298608300233488L);
        setField(term2027, term2027.getClass(), "extId", term2029);
        setField(term2027, term2027.getClass(), "luid", "TJmVBGfTML");
        setIntField(term2044, term2044.getClass(), "year", 2010);
        setShortField(term2044, term2044.getClass(), "month", (short) 1);
        setShortField(term2044, term2044.getClass(), "day", (short) 17);
        setField(term2043, term2043.getClass(), "date", term2044);
        setByteField(term2048, term2048.getClass(), "hour", (byte) 13);
        setByteField(term2048, term2048.getClass(), "minute", (byte) 5);
        setByteField(term2048, term2048.getClass(), "second", (byte) 51);
        setIntField(term2048, term2048.getClass(), "nano", 362260580);
        setField(term2043, term2043.getClass(), "time", term2048);
        setField(term2027, term2027.getClass(), "registerTime", term2043);
        setIntField(term2054, term2054.getClass(), "year", 2010);
        setShortField(term2054, term2054.getClass(), "month", (short) 9);
        setShortField(term2054, term2054.getClass(), "day", (short) 28);
        setField(term2053, term2053.getClass(), "date", term2054);
        setByteField(term2058, term2058.getClass(), "hour", (byte) 6);
        setByteField(term2058, term2058.getClass(), "minute", (byte) 4);
        setByteField(term2058, term2058.getClass(), "second", (byte) 54);
        setIntField(term2058, term2058.getClass(), "nano", 604713782);
        setField(term2053, term2053.getClass(), "time", term2058);
        setField(term2027, term2027.getClass(), "accessTime", term2053);
        term2063 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.general.model.Card");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2063;
        callMethod(klass, "equals", argTypes, term2027, args);
    }

};


