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

public class DatePair_getStart_20967430450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term811;

    public DatePair_getStart_20967430450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term811 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term812 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term813 = newInstance(Class.forName("java.time.LocalDate"));
        Object term817 = newInstance(Class.forName("java.time.LocalTime"));
        Object term822 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term823 = newInstance(Class.forName("java.time.LocalDate"));
        Object term827 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term813, term813.getClass(), "year", 2028);
        setShortField(term813, term813.getClass(), "month", (short) 1);
        setShortField(term813, term813.getClass(), "day", (short) 18);
        setField(term812, term812.getClass(), "date", term813);
        setByteField(term817, term817.getClass(), "hour", (byte) 12);
        setByteField(term817, term817.getClass(), "minute", (byte) 4);
        setByteField(term817, term817.getClass(), "second", (byte) 39);
        setIntField(term817, term817.getClass(), "nano", 651287093);
        setField(term812, term812.getClass(), "time", term817);
        setField(term811, term811.getClass(), "Start", term812);
        setIntField(term823, term823.getClass(), "year", 2027);
        setShortField(term823, term823.getClass(), "month", (short) 7);
        setShortField(term823, term823.getClass(), "day", (short) 23);
        setField(term822, term822.getClass(), "date", term823);
        setByteField(term827, term827.getClass(), "hour", (byte) 12);
        setByteField(term827, term827.getClass(), "minute", (byte) 6);
        setByteField(term827, term827.getClass(), "second", (byte) 19);
        setIntField(term827, term827.getClass(), "nano", 8025683);
        setField(term822, term822.getClass(), "time", term827);
        setField(term811, term811.getClass(), "End", term822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStart", argTypes, term811, args);
    }

};


