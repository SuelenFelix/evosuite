package icu.samnyan.aqua.sega.diva.model.gamedata;

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
import static icu.samnyan.aqua.sega.diva.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DivaCustomize_getPrice_8344031273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28894;

    public DivaCustomize_getPrice_8344031273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28894 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize"));
        Object term28909 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28910 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28914 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28919 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28920 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28924 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term28894, term28894.getClass(), "id", -1428063820);
        setField(term28894, term28894.getClass(), "name", "RVQbteztJx");
        setIntField(term28894, term28894.getClass(), "price", -1271375703);
        setIntField(term28910, term28910.getClass(), "year", 2012);
        setShortField(term28910, term28910.getClass(), "month", (short) 9);
        setShortField(term28910, term28910.getClass(), "day", (short) 11);
        setField(term28909, term28909.getClass(), "date", term28910);
        setByteField(term28914, term28914.getClass(), "hour", (byte) 22);
        setByteField(term28914, term28914.getClass(), "minute", (byte) 10);
        setByteField(term28914, term28914.getClass(), "second", (byte) 8);
        setIntField(term28914, term28914.getClass(), "nano", 380008862);
        setField(term28909, term28909.getClass(), "time", term28914);
        setField(term28894, term28894.getClass(), "releaseDate", term28909);
        setIntField(term28920, term28920.getClass(), "year", 2021);
        setShortField(term28920, term28920.getClass(), "month", (short) 9);
        setShortField(term28920, term28920.getClass(), "day", (short) 7);
        setField(term28919, term28919.getClass(), "date", term28920);
        setByteField(term28924, term28924.getClass(), "hour", (byte) 5);
        setByteField(term28924, term28924.getClass(), "minute", (byte) 25);
        setByteField(term28924, term28924.getClass(), "second", (byte) 7);
        setIntField(term28924, term28924.getClass(), "nano", 755924076);
        setField(term28919, term28919.getClass(), "time", term28924);
        setField(term28894, term28894.getClass(), "endDate", term28919);
        setIntField(term28894, term28894.getClass(), "sortOrder", 1136208236);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrice", argTypes, term28894, args);
    }

};


