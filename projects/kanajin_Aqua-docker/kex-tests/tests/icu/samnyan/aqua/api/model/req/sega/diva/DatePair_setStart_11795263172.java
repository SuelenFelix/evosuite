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

public class DatePair_setStart_11795263172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term853;
     Object term874;

    public DatePair_setStart_11795263172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term853 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term854 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term855 = newInstance(Class.forName("java.time.LocalDate"));
        Object term859 = newInstance(Class.forName("java.time.LocalTime"));
        Object term864 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term865 = newInstance(Class.forName("java.time.LocalDate"));
        Object term869 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term855, term855.getClass(), "year", 2028);
        setShortField(term855, term855.getClass(), "month", (short) 4);
        setShortField(term855, term855.getClass(), "day", (short) 1);
        setField(term854, term854.getClass(), "date", term855);
        setByteField(term859, term859.getClass(), "hour", (byte) 16);
        setByteField(term859, term859.getClass(), "minute", (byte) 22);
        setByteField(term859, term859.getClass(), "second", (byte) 32);
        setIntField(term859, term859.getClass(), "nano", 406353763);
        setField(term854, term854.getClass(), "time", term859);
        setField(term853, term853.getClass(), "Start", term854);
        setIntField(term865, term865.getClass(), "year", 2019);
        setShortField(term865, term865.getClass(), "month", (short) 7);
        setShortField(term865, term865.getClass(), "day", (short) 19);
        setField(term864, term864.getClass(), "date", term865);
        setByteField(term869, term869.getClass(), "hour", (byte) 10);
        setByteField(term869, term869.getClass(), "minute", (byte) 54);
        setByteField(term869, term869.getClass(), "second", (byte) 55);
        setIntField(term869, term869.getClass(), "nano", 244650454);
        setField(term864, term864.getClass(), "time", term869);
        setField(term853, term853.getClass(), "End", term864);
        term874 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term875 = newInstance(Class.forName("java.time.LocalDate"));
        Object term879 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term875, term875.getClass(), "year", 2022);
        setShortField(term875, term875.getClass(), "month", (short) 4);
        setShortField(term875, term875.getClass(), "day", (short) 15);
        setField(term874, term874.getClass(), "date", term875);
        setByteField(term879, term879.getClass(), "hour", (byte) 20);
        setByteField(term879, term879.getClass(), "minute", (byte) 58);
        setByteField(term879, term879.getClass(), "second", (byte) 46);
        setIntField(term879, term879.getClass(), "nano", 435562727);
        setField(term874, term874.getClass(), "time", term879);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term874;
        callMethod(klass, "setStart", argTypes, term853, args);
    }

};


