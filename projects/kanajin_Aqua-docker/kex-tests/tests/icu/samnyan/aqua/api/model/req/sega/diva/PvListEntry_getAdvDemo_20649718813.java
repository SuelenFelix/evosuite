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

public class PvListEntry_getAdvDemo_20649718813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139;

    public PvListEntry_getAdvDemo_20649718813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term143 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term144 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term145 = newInstance(Class.forName("java.time.LocalDate"));
        Object term149 = newInstance(Class.forName("java.time.LocalTime"));
        Object term154 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term155 = newInstance(Class.forName("java.time.LocalDate"));
        Object term159 = newInstance(Class.forName("java.time.LocalTime"));
        Object term164 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term165 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term166 = newInstance(Class.forName("java.time.LocalDate"));
        Object term170 = newInstance(Class.forName("java.time.LocalTime"));
        Object term175 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term176 = newInstance(Class.forName("java.time.LocalDate"));
        Object term180 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term139, term139.getClass(), "PVID", -1339778481);
        setIntField(term139, term139.getClass(), "Version", 1725571209);
        setIntField(term139, term139.getClass(), "Edition", -522618178);
        setIntField(term145, term145.getClass(), "year", 2012);
        setShortField(term145, term145.getClass(), "month", (short) 9);
        setShortField(term145, term145.getClass(), "day", (short) 11);
        setField(term144, term144.getClass(), "date", term145);
        setByteField(term149, term149.getClass(), "hour", (byte) 22);
        setByteField(term149, term149.getClass(), "minute", (byte) 10);
        setByteField(term149, term149.getClass(), "second", (byte) 8);
        setIntField(term149, term149.getClass(), "nano", 380008862);
        setField(term144, term144.getClass(), "time", term149);
        setField(term143, term143.getClass(), "Start", term144);
        setIntField(term155, term155.getClass(), "year", 2021);
        setShortField(term155, term155.getClass(), "month", (short) 9);
        setShortField(term155, term155.getClass(), "day", (short) 7);
        setField(term154, term154.getClass(), "date", term155);
        setByteField(term159, term159.getClass(), "hour", (byte) 5);
        setByteField(term159, term159.getClass(), "minute", (byte) 25);
        setByteField(term159, term159.getClass(), "second", (byte) 7);
        setIntField(term159, term159.getClass(), "nano", 755924076);
        setField(term154, term154.getClass(), "time", term159);
        setField(term143, term143.getClass(), "End", term154);
        setField(term139, term139.getClass(), "AdvDemo", term143);
        setIntField(term166, term166.getClass(), "year", 2012);
        setShortField(term166, term166.getClass(), "month", (short) 2);
        setShortField(term166, term166.getClass(), "day", (short) 19);
        setField(term165, term165.getClass(), "date", term166);
        setByteField(term170, term170.getClass(), "hour", (byte) 8);
        setByteField(term170, term170.getClass(), "minute", (byte) 4);
        setByteField(term170, term170.getClass(), "second", (byte) 43);
        setIntField(term170, term170.getClass(), "nano", 114930008);
        setField(term165, term165.getClass(), "time", term170);
        setField(term164, term164.getClass(), "Start", term165);
        setIntField(term176, term176.getClass(), "year", 2017);
        setShortField(term176, term176.getClass(), "month", (short) 6);
        setShortField(term176, term176.getClass(), "day", (short) 8);
        setField(term175, term175.getClass(), "date", term176);
        setByteField(term180, term180.getClass(), "hour", (byte) 0);
        setByteField(term180, term180.getClass(), "minute", (byte) 18);
        setByteField(term180, term180.getClass(), "second", (byte) 55);
        setIntField(term180, term180.getClass(), "nano", 680586717);
        setField(term175, term175.getClass(), "time", term180);
        setField(term164, term164.getClass(), "End", term175);
        setField(term139, term139.getClass(), "Playable", term164);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAdvDemo", argTypes, term139, args);
    }

};


