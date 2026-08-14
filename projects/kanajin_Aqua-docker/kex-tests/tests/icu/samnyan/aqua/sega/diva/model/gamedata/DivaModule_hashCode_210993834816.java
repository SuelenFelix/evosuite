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

public class DivaModule_hashCode_210993834816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2207586;

    public DivaModule_hashCode_210993834816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2207586 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule"));
        Object term2207601 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2207602 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2207606 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2207611 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2207612 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2207616 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term2207586, term2207586.getClass(), "id", -402611177);
        setField(term2207586, term2207586.getClass(), "name", "RjdGDoLRge");
        setIntField(term2207586, term2207586.getClass(), "price", -775804306);
        setIntField(term2207602, term2207602.getClass(), "year", 2011);
        setShortField(term2207602, term2207602.getClass(), "month", (short) 9);
        setShortField(term2207602, term2207602.getClass(), "day", (short) 20);
        setField(term2207601, term2207601.getClass(), "date", term2207602);
        setByteField(term2207606, term2207606.getClass(), "hour", (byte) 22);
        setByteField(term2207606, term2207606.getClass(), "minute", (byte) 33);
        setByteField(term2207606, term2207606.getClass(), "second", (byte) 48);
        setIntField(term2207606, term2207606.getClass(), "nano", 781175997);
        setField(term2207601, term2207601.getClass(), "time", term2207606);
        setField(term2207586, term2207586.getClass(), "releaseDate", term2207601);
        setIntField(term2207612, term2207612.getClass(), "year", 2026);
        setShortField(term2207612, term2207612.getClass(), "month", (short) 9);
        setShortField(term2207612, term2207612.getClass(), "day", (short) 26);
        setField(term2207611, term2207611.getClass(), "date", term2207612);
        setByteField(term2207616, term2207616.getClass(), "hour", (byte) 8);
        setByteField(term2207616, term2207616.getClass(), "minute", (byte) 9);
        setByteField(term2207616, term2207616.getClass(), "second", (byte) 26);
        setIntField(term2207616, term2207616.getClass(), "nano", 874986977);
        setField(term2207611, term2207611.getClass(), "time", term2207616);
        setField(term2207586, term2207586.getClass(), "endDate", term2207611);
        setIntField(term2207586, term2207586.getClass(), "sortOrder", 1137797074);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2207586, args);
    }

};


