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

public class PvListEntry_toString_75458980713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term649;

    public PvListEntry_toString_75458980713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term649 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term653 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term654 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term655 = newInstance(Class.forName("java.time.LocalDate"));
        Object term659 = newInstance(Class.forName("java.time.LocalTime"));
        Object term664 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term665 = newInstance(Class.forName("java.time.LocalDate"));
        Object term669 = newInstance(Class.forName("java.time.LocalTime"));
        Object term674 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term675 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term676 = newInstance(Class.forName("java.time.LocalDate"));
        Object term680 = newInstance(Class.forName("java.time.LocalTime"));
        Object term685 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term686 = newInstance(Class.forName("java.time.LocalDate"));
        Object term690 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term649, term649.getClass(), "PVID", -602026508);
        setIntField(term649, term649.getClass(), "Version", -157887805);
        setIntField(term649, term649.getClass(), "Edition", 1876565163);
        setIntField(term655, term655.getClass(), "year", 2022);
        setShortField(term655, term655.getClass(), "month", (short) 6);
        setShortField(term655, term655.getClass(), "day", (short) 20);
        setField(term654, term654.getClass(), "date", term655);
        setByteField(term659, term659.getClass(), "hour", (byte) 7);
        setByteField(term659, term659.getClass(), "minute", (byte) 57);
        setByteField(term659, term659.getClass(), "second", (byte) 37);
        setIntField(term659, term659.getClass(), "nano", 90374877);
        setField(term654, term654.getClass(), "time", term659);
        setField(term653, term653.getClass(), "Start", term654);
        setIntField(term665, term665.getClass(), "year", 2023);
        setShortField(term665, term665.getClass(), "month", (short) 2);
        setShortField(term665, term665.getClass(), "day", (short) 16);
        setField(term664, term664.getClass(), "date", term665);
        setByteField(term669, term669.getClass(), "hour", (byte) 3);
        setByteField(term669, term669.getClass(), "minute", (byte) 18);
        setByteField(term669, term669.getClass(), "second", (byte) 56);
        setIntField(term669, term669.getClass(), "nano", 733017887);
        setField(term664, term664.getClass(), "time", term669);
        setField(term653, term653.getClass(), "End", term664);
        setField(term649, term649.getClass(), "AdvDemo", term653);
        setIntField(term676, term676.getClass(), "year", 2025);
        setShortField(term676, term676.getClass(), "month", (short) 3);
        setShortField(term676, term676.getClass(), "day", (short) 28);
        setField(term675, term675.getClass(), "date", term676);
        setByteField(term680, term680.getClass(), "hour", (byte) 19);
        setByteField(term680, term680.getClass(), "minute", (byte) 56);
        setByteField(term680, term680.getClass(), "second", (byte) 52);
        setIntField(term680, term680.getClass(), "nano", 738558930);
        setField(term675, term675.getClass(), "time", term680);
        setField(term674, term674.getClass(), "Start", term675);
        setIntField(term686, term686.getClass(), "year", 2024);
        setShortField(term686, term686.getClass(), "month", (short) 2);
        setShortField(term686, term686.getClass(), "day", (short) 29);
        setField(term685, term685.getClass(), "date", term686);
        setByteField(term690, term690.getClass(), "hour", (byte) 17);
        setByteField(term690, term690.getClass(), "minute", (byte) 54);
        setByteField(term690, term690.getClass(), "second", (byte) 21);
        setIntField(term690, term690.getClass(), "nano", 605973408);
        setField(term685, term685.getClass(), "time", term690);
        setField(term674, term674.getClass(), "End", term685);
        setField(term649, term649.getClass(), "Playable", term674);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term649, args);
    }

};


