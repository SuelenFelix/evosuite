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

public class DivaModule_getName_5425115192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29808;

    public DivaModule_getName_5425115192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29808 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule"));
        Object term29823 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29824 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29828 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29833 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29834 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29838 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term29808, term29808.getClass(), "id", -1793950607);
        setField(term29808, term29808.getClass(), "name", "VhnistEcCA");
        setIntField(term29808, term29808.getClass(), "price", 1091954101);
        setIntField(term29824, term29824.getClass(), "year", 2012);
        setShortField(term29824, term29824.getClass(), "month", (short) 4);
        setShortField(term29824, term29824.getClass(), "day", (short) 25);
        setField(term29823, term29823.getClass(), "date", term29824);
        setByteField(term29828, term29828.getClass(), "hour", (byte) 21);
        setByteField(term29828, term29828.getClass(), "minute", (byte) 14);
        setByteField(term29828, term29828.getClass(), "second", (byte) 15);
        setIntField(term29828, term29828.getClass(), "nano", 561700934);
        setField(term29823, term29823.getClass(), "time", term29828);
        setField(term29808, term29808.getClass(), "releaseDate", term29823);
        setIntField(term29834, term29834.getClass(), "year", 2011);
        setShortField(term29834, term29834.getClass(), "month", (short) 10);
        setShortField(term29834, term29834.getClass(), "day", (short) 25);
        setField(term29833, term29833.getClass(), "date", term29834);
        setByteField(term29838, term29838.getClass(), "hour", (byte) 10);
        setByteField(term29838, term29838.getClass(), "minute", (byte) 33);
        setByteField(term29838, term29838.getClass(), "second", (byte) 8);
        setIntField(term29838, term29838.getClass(), "nano", 268304014);
        setField(term29833, term29833.getClass(), "time", term29838);
        setField(term29808, term29808.getClass(), "endDate", term29833);
        setIntField(term29808, term29808.getClass(), "sortOrder", 1895143076);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term29808, args);
    }

};


