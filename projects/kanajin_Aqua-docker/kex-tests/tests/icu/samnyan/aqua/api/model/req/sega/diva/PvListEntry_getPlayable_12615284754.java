package icu.samnyan.aqua.api.model.req.sega.diva;

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
import static icu.samnyan.aqua.api.model.req.sega.diva.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PvListEntry_getPlayable_12615284754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185;

    public PvListEntry_getPlayable_12615284754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term189 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term190 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term191 = newInstance(Class.forName("java.time.LocalDate"));
        Object term195 = newInstance(Class.forName("java.time.LocalTime"));
        Object term200 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term201 = newInstance(Class.forName("java.time.LocalDate"));
        Object term205 = newInstance(Class.forName("java.time.LocalTime"));
        Object term210 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term211 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term212 = newInstance(Class.forName("java.time.LocalDate"));
        Object term216 = newInstance(Class.forName("java.time.LocalTime"));
        Object term221 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term222 = newInstance(Class.forName("java.time.LocalDate"));
        Object term226 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term185, term185.getClass(), "PVID", 1134449235);
        setIntField(term185, term185.getClass(), "Version", -883034806);
        setIntField(term185, term185.getClass(), "Edition", 1585847225);
        setIntField(term191, term191.getClass(), "year", 2015);
        setShortField(term191, term191.getClass(), "month", (short) 9);
        setShortField(term191, term191.getClass(), "day", (short) 16);
        setField(term190, term190.getClass(), "date", term191);
        setByteField(term195, term195.getClass(), "hour", (byte) 6);
        setByteField(term195, term195.getClass(), "minute", (byte) 19);
        setByteField(term195, term195.getClass(), "second", (byte) 42);
        setIntField(term195, term195.getClass(), "nano", 630084975);
        setField(term190, term190.getClass(), "time", term195);
        setField(term189, term189.getClass(), "Start", term190);
        setIntField(term201, term201.getClass(), "year", 2029);
        setShortField(term201, term201.getClass(), "month", (short) 6);
        setShortField(term201, term201.getClass(), "day", (short) 23);
        setField(term200, term200.getClass(), "date", term201);
        setByteField(term205, term205.getClass(), "hour", (byte) 21);
        setByteField(term205, term205.getClass(), "minute", (byte) 55);
        setByteField(term205, term205.getClass(), "second", (byte) 27);
        setIntField(term205, term205.getClass(), "nano", 66889274);
        setField(term200, term200.getClass(), "time", term205);
        setField(term189, term189.getClass(), "End", term200);
        setField(term185, term185.getClass(), "AdvDemo", term189);
        setIntField(term212, term212.getClass(), "year", 2017);
        setShortField(term212, term212.getClass(), "month", (short) 3);
        setShortField(term212, term212.getClass(), "day", (short) 5);
        setField(term211, term211.getClass(), "date", term212);
        setByteField(term216, term216.getClass(), "hour", (byte) 20);
        setByteField(term216, term216.getClass(), "minute", (byte) 34);
        setByteField(term216, term216.getClass(), "second", (byte) 55);
        setIntField(term216, term216.getClass(), "nano", 78024496);
        setField(term211, term211.getClass(), "time", term216);
        setField(term210, term210.getClass(), "Start", term211);
        setIntField(term222, term222.getClass(), "year", 2020);
        setShortField(term222, term222.getClass(), "month", (short) 7);
        setShortField(term222, term222.getClass(), "day", (short) 24);
        setField(term221, term221.getClass(), "date", term222);
        setByteField(term226, term226.getClass(), "hour", (byte) 0);
        setByteField(term226, term226.getClass(), "minute", (byte) 59);
        setByteField(term226, term226.getClass(), "second", (byte) 56);
        setIntField(term226, term226.getClass(), "nano", 320219201);
        setField(term221, term221.getClass(), "time", term226);
        setField(term210, term210.getClass(), "End", term221);
        setField(term185, term185.getClass(), "Playable", term210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayable", argTypes, term185, args);
    }

};


