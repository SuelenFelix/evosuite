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

public class GameSale_hashCode_141889075314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term381;

    public GameSale_hashCode_141889075314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term381 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSale"));
        Object term386 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term387 = newInstance(Class.forName("java.time.LocalDate"));
        Object term391 = newInstance(Class.forName("java.time.LocalTime"));
        Object term396 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term397 = newInstance(Class.forName("java.time.LocalDate"));
        Object term401 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term381, term381.getClass(), "orderId", 1596070772);
        setIntField(term381, term381.getClass(), "type", 97029295);
        setIntField(term381, term381.getClass(), "id", -1371869594);
        setIntField(term381, term381.getClass(), "rate", -2095575670);
        setIntField(term387, term387.getClass(), "year", 2016);
        setShortField(term387, term387.getClass(), "month", (short) 6);
        setShortField(term387, term387.getClass(), "day", (short) 15);
        setField(term386, term386.getClass(), "date", term387);
        setByteField(term391, term391.getClass(), "hour", (byte) 21);
        setByteField(term391, term391.getClass(), "minute", (byte) 23);
        setByteField(term391, term391.getClass(), "second", (byte) 23);
        setIntField(term391, term391.getClass(), "nano", 433372070);
        setField(term386, term386.getClass(), "time", term391);
        setField(term381, term381.getClass(), "startDate", term386);
        setIntField(term397, term397.getClass(), "year", 2012);
        setShortField(term397, term397.getClass(), "month", (short) 8);
        setShortField(term397, term397.getClass(), "day", (short) 25);
        setField(term396, term396.getClass(), "date", term397);
        setByteField(term401, term401.getClass(), "hour", (byte) 19);
        setByteField(term401, term401.getClass(), "minute", (byte) 49);
        setByteField(term401, term401.getClass(), "second", (byte) 8);
        setIntField(term401, term401.getClass(), "nano", 912685024);
        setField(term396, term396.getClass(), "time", term401);
        setField(term381, term381.getClass(), "endDate", term396);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSale");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term381, args);
    }

};


