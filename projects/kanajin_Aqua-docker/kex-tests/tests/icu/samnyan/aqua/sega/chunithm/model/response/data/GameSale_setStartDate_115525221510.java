package icu.samnyan.aqua.sega.chunithm.model.response.data;

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
import static icu.samnyan.aqua.sega.chunithm.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GameSale_setStartDate_115525221510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259;
     Object term284;

    public GameSale_setStartDate_115525221510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term259 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSale"));
        Object term264 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term265 = newInstance(Class.forName("java.time.LocalDate"));
        Object term269 = newInstance(Class.forName("java.time.LocalTime"));
        Object term274 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term275 = newInstance(Class.forName("java.time.LocalDate"));
        Object term279 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term259, term259.getClass(), "orderId", 1876565163);
        setIntField(term259, term259.getClass(), "type", -817164822);
        setIntField(term259, term259.getClass(), "id", -1016503459);
        setIntField(term259, term259.getClass(), "rate", -1968847291);
        setIntField(term265, term265.getClass(), "year", 2014);
        setShortField(term265, term265.getClass(), "month", (short) 7);
        setShortField(term265, term265.getClass(), "day", (short) 13);
        setField(term264, term264.getClass(), "date", term265);
        setByteField(term269, term269.getClass(), "hour", (byte) 21);
        setByteField(term269, term269.getClass(), "minute", (byte) 46);
        setByteField(term269, term269.getClass(), "second", (byte) 0);
        setIntField(term269, term269.getClass(), "nano", 887884128);
        setField(term264, term264.getClass(), "time", term269);
        setField(term259, term259.getClass(), "startDate", term264);
        setIntField(term275, term275.getClass(), "year", 2023);
        setShortField(term275, term275.getClass(), "month", (short) 3);
        setShortField(term275, term275.getClass(), "day", (short) 7);
        setField(term274, term274.getClass(), "date", term275);
        setByteField(term279, term279.getClass(), "hour", (byte) 21);
        setByteField(term279, term279.getClass(), "minute", (byte) 15);
        setByteField(term279, term279.getClass(), "second", (byte) 43);
        setIntField(term279, term279.getClass(), "nano", 639721472);
        setField(term274, term274.getClass(), "time", term279);
        setField(term259, term259.getClass(), "endDate", term274);
        term284 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term285 = newInstance(Class.forName("java.time.LocalDate"));
        Object term289 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term285, term285.getClass(), "year", 2015);
        setShortField(term285, term285.getClass(), "month", (short) 3);
        setShortField(term285, term285.getClass(), "day", (short) 10);
        setField(term284, term284.getClass(), "date", term285);
        setByteField(term289, term289.getClass(), "hour", (byte) 23);
        setByteField(term289, term289.getClass(), "minute", (byte) 34);
        setByteField(term289, term289.getClass(), "second", (byte) 44);
        setIntField(term289, term289.getClass(), "nano", 587322824);
        setField(term284, term284.getClass(), "time", term289);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSale");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term284;
        callMethod(klass, "setStartDate", argTypes, term259, args);
    }

};


