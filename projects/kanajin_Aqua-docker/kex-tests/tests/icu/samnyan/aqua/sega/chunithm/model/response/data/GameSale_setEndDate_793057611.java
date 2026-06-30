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

public class GameSale_setEndDate_793057611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294;
     Object term319;

    public GameSale_setEndDate_793057611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term294 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSale"));
        Object term299 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term300 = newInstance(Class.forName("java.time.LocalDate"));
        Object term304 = newInstance(Class.forName("java.time.LocalTime"));
        Object term309 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term310 = newInstance(Class.forName("java.time.LocalDate"));
        Object term314 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term294, term294.getClass(), "orderId", 579005622);
        setIntField(term294, term294.getClass(), "type", -14890619);
        setIntField(term294, term294.getClass(), "id", 1632125673);
        setIntField(term294, term294.getClass(), "rate", 454281060);
        setIntField(term300, term300.getClass(), "year", 2027);
        setShortField(term300, term300.getClass(), "month", (short) 8);
        setShortField(term300, term300.getClass(), "day", (short) 26);
        setField(term299, term299.getClass(), "date", term300);
        setByteField(term304, term304.getClass(), "hour", (byte) 5);
        setByteField(term304, term304.getClass(), "minute", (byte) 11);
        setByteField(term304, term304.getClass(), "second", (byte) 9);
        setIntField(term304, term304.getClass(), "nano", 219245092);
        setField(term299, term299.getClass(), "time", term304);
        setField(term294, term294.getClass(), "startDate", term299);
        setIntField(term310, term310.getClass(), "year", 2025);
        setShortField(term310, term310.getClass(), "month", (short) 3);
        setShortField(term310, term310.getClass(), "day", (short) 9);
        setField(term309, term309.getClass(), "date", term310);
        setByteField(term314, term314.getClass(), "hour", (byte) 5);
        setByteField(term314, term314.getClass(), "minute", (byte) 49);
        setByteField(term314, term314.getClass(), "second", (byte) 12);
        setIntField(term314, term314.getClass(), "nano", 791695028);
        setField(term309, term309.getClass(), "time", term314);
        setField(term294, term294.getClass(), "endDate", term309);
        term319 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term320 = newInstance(Class.forName("java.time.LocalDate"));
        Object term324 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term320, term320.getClass(), "year", 2023);
        setShortField(term320, term320.getClass(), "month", (short) 9);
        setShortField(term320, term320.getClass(), "day", (short) 23);
        setField(term319, term319.getClass(), "date", term320);
        setByteField(term324, term324.getClass(), "hour", (byte) 12);
        setByteField(term324, term324.getClass(), "minute", (byte) 55);
        setByteField(term324, term324.getClass(), "second", (byte) 58);
        setIntField(term324, term324.getClass(), "nano", 159178396);
        setField(term319, term319.getClass(), "time", term324);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSale");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term319;
        callMethod(klass, "setEndDate", argTypes, term294, args);
    }

};


