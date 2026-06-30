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

public class DatePair_getEnd_6145779821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term832;

    public DatePair_getEnd_6145779821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term832 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term833 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term834 = newInstance(Class.forName("java.time.LocalDate"));
        Object term838 = newInstance(Class.forName("java.time.LocalTime"));
        Object term843 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term844 = newInstance(Class.forName("java.time.LocalDate"));
        Object term848 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term834, term834.getClass(), "year", 2018);
        setShortField(term834, term834.getClass(), "month", (short) 2);
        setShortField(term834, term834.getClass(), "day", (short) 14);
        setField(term833, term833.getClass(), "date", term834);
        setByteField(term838, term838.getClass(), "hour", (byte) 2);
        setByteField(term838, term838.getClass(), "minute", (byte) 40);
        setByteField(term838, term838.getClass(), "second", (byte) 48);
        setIntField(term838, term838.getClass(), "nano", 371006728);
        setField(term833, term833.getClass(), "time", term838);
        setField(term832, term832.getClass(), "Start", term833);
        setIntField(term844, term844.getClass(), "year", 2025);
        setShortField(term844, term844.getClass(), "month", (short) 8);
        setShortField(term844, term844.getClass(), "day", (short) 22);
        setField(term843, term843.getClass(), "date", term844);
        setByteField(term848, term848.getClass(), "hour", (byte) 6);
        setByteField(term848, term848.getClass(), "minute", (byte) 48);
        setByteField(term848, term848.getClass(), "second", (byte) 49);
        setIntField(term848, term848.getClass(), "nano", 46400229);
        setField(term843, term843.getClass(), "time", term848);
        setField(term832, term832.getClass(), "End", term843);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEnd", argTypes, term832, args);
    }

};


