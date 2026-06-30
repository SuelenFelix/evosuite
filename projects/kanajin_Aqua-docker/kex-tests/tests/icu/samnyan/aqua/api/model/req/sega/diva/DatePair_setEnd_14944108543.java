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

public class DatePair_setEnd_14944108543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term884;
     Object term905;

    public DatePair_setEnd_14944108543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term884 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term885 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term886 = newInstance(Class.forName("java.time.LocalDate"));
        Object term890 = newInstance(Class.forName("java.time.LocalTime"));
        Object term895 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term896 = newInstance(Class.forName("java.time.LocalDate"));
        Object term900 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term886, term886.getClass(), "year", 2026);
        setShortField(term886, term886.getClass(), "month", (short) 10);
        setShortField(term886, term886.getClass(), "day", (short) 31);
        setField(term885, term885.getClass(), "date", term886);
        setByteField(term890, term890.getClass(), "hour", (byte) 17);
        setByteField(term890, term890.getClass(), "minute", (byte) 6);
        setByteField(term890, term890.getClass(), "second", (byte) 30);
        setIntField(term890, term890.getClass(), "nano", 785931660);
        setField(term885, term885.getClass(), "time", term890);
        setField(term884, term884.getClass(), "Start", term885);
        setIntField(term896, term896.getClass(), "year", 2022);
        setShortField(term896, term896.getClass(), "month", (short) 11);
        setShortField(term896, term896.getClass(), "day", (short) 10);
        setField(term895, term895.getClass(), "date", term896);
        setByteField(term900, term900.getClass(), "hour", (byte) 20);
        setByteField(term900, term900.getClass(), "minute", (byte) 8);
        setByteField(term900, term900.getClass(), "second", (byte) 35);
        setIntField(term900, term900.getClass(), "nano", 658416570);
        setField(term895, term895.getClass(), "time", term900);
        setField(term884, term884.getClass(), "End", term895);
        term905 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term906 = newInstance(Class.forName("java.time.LocalDate"));
        Object term910 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term906, term906.getClass(), "year", 2018);
        setShortField(term906, term906.getClass(), "month", (short) 11);
        setShortField(term906, term906.getClass(), "day", (short) 9);
        setField(term905, term905.getClass(), "date", term906);
        setByteField(term910, term910.getClass(), "hour", (byte) 6);
        setByteField(term910, term910.getClass(), "minute", (byte) 8);
        setByteField(term910, term910.getClass(), "second", (byte) 32);
        setIntField(term910, term910.getClass(), "nano", 750733310);
        setField(term905, term905.getClass(), "time", term910);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term905;
        callMethod(klass, "setEnd", argTypes, term884, args);
    }

};


