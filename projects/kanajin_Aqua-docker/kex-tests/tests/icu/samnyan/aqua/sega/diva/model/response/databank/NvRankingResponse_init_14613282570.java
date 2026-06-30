package icu.samnyan.aqua.sega.diva.model.response.databank;

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
import static icu.samnyan.aqua.sega.diva.model.response.databank.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NvRankingResponse_init_14613282570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26479;
     Object term26501;

    public NvRankingResponse_init_14613282570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26479 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26480 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26484 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term26480, term26480.getClass(), "year", 2020);
        setShortField(term26480, term26480.getClass(), "month", (short) 5);
        setShortField(term26480, term26480.getClass(), "day", (short) 12);
        setField(term26479, term26479.getClass(), "date", term26480);
        setByteField(term26484, term26484.getClass(), "hour", (byte) 0);
        setByteField(term26484, term26484.getClass(), "minute", (byte) 15);
        setByteField(term26484, term26484.getClass(), "second", (byte) 24);
        setIntField(term26484, term26484.getClass(), "nano", 250257744);
        setField(term26479, term26479.getClass(), "time", term26484);
        term26501 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26502 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26506 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term26502, term26502.getClass(), "year", 2013);
        setShortField(term26502, term26502.getClass(), "month", (short) 9);
        setShortField(term26502, term26502.getClass(), "day", (short) 19);
        setField(term26501, term26501.getClass(), "date", term26502);
        setByteField(term26506, term26506.getClass(), "hour", (byte) 12);
        setByteField(term26506, term26506.getClass(), "minute", (byte) 29);
        setByteField(term26506, term26506.getClass(), "second", (byte) 28);
        setIntField(term26506, term26506.getClass(), "nano", 244069764);
        setField(term26501, term26501.getClass(), "time", term26506);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.response.databank.NvRankingResponse");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.time.LocalDateTime");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[7];
        args[0] = "JKdZuLFRwC";
        args[1] = "hfhLLoWnRU";
        args[2] = "RpofnOPYha";
        args[3] = "CQYmAsjvPU";
        args[4] = term26479;
        args[5] = "NNkIIFpxiB";
        args[6] = term26501;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


