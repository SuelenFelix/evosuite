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

public class Card_setLuid_10851639717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1847;

    public Card_setLuid_10851639717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1849 = new Long(-7237588299778557629L);
        term1847 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term1863 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1864 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1868 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1873 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1874 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1878 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1847, term1847.getClass(), "id", -7237588299778557629L);
        setField(term1847, term1847.getClass(), "extId", term1849);
        setField(term1847, term1847.getClass(), "luid", "eqJfYWRaEL");
        setIntField(term1864, term1864.getClass(), "year", 2021);
        setShortField(term1864, term1864.getClass(), "month", (short) 8);
        setShortField(term1864, term1864.getClass(), "day", (short) 12);
        setField(term1863, term1863.getClass(), "date", term1864);
        setByteField(term1868, term1868.getClass(), "hour", (byte) 2);
        setByteField(term1868, term1868.getClass(), "minute", (byte) 17);
        setByteField(term1868, term1868.getClass(), "second", (byte) 51);
        setIntField(term1868, term1868.getClass(), "nano", 207375141);
        setField(term1863, term1863.getClass(), "time", term1868);
        setField(term1847, term1847.getClass(), "registerTime", term1863);
        setIntField(term1874, term1874.getClass(), "year", 2025);
        setShortField(term1874, term1874.getClass(), "month", (short) 11);
        setShortField(term1874, term1874.getClass(), "day", (short) 3);
        setField(term1873, term1873.getClass(), "date", term1874);
        setByteField(term1878, term1878.getClass(), "hour", (byte) 21);
        setByteField(term1878, term1878.getClass(), "minute", (byte) 24);
        setByteField(term1878, term1878.getClass(), "second", (byte) 23);
        setIntField(term1878, term1878.getClass(), "nano", 210986721);
        setField(term1873, term1873.getClass(), "time", term1878);
        setField(term1847, term1847.getClass(), "accessTime", term1873);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.general.model.Card");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fhkbdRViHi";
        callMethod(klass, "setLuid", argTypes, term1847, args);
    }

};


