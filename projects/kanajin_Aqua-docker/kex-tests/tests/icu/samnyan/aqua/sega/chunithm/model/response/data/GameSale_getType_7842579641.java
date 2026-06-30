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

public class GameSale_getType_7842579641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26;

    public GameSale_getType_7842579641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSale"));
        Object term31 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term32 = newInstance(Class.forName("java.time.LocalDate"));
        Object term36 = newInstance(Class.forName("java.time.LocalTime"));
        Object term41 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term42 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term26, term26.getClass(), "orderId", -1922583790);
        setIntField(term26, term26.getClass(), "type", -616727354);
        setIntField(term26, term26.getClass(), "id", -1955890973);
        setIntField(term26, term26.getClass(), "rate", -2038273078);
        setIntField(term32, term32.getClass(), "year", 2015);
        setShortField(term32, term32.getClass(), "month", (short) 9);
        setShortField(term32, term32.getClass(), "day", (short) 19);
        setField(term31, term31.getClass(), "date", term32);
        setByteField(term36, term36.getClass(), "hour", (byte) 9);
        setByteField(term36, term36.getClass(), "minute", (byte) 4);
        setByteField(term36, term36.getClass(), "second", (byte) 10);
        setIntField(term36, term36.getClass(), "nano", 401765865);
        setField(term31, term31.getClass(), "time", term36);
        setField(term26, term26.getClass(), "startDate", term31);
        setIntField(term42, term42.getClass(), "year", 2015);
        setShortField(term42, term42.getClass(), "month", (short) 4);
        setShortField(term42, term42.getClass(), "day", (short) 14);
        setField(term41, term41.getClass(), "date", term42);
        setByteField(term46, term46.getClass(), "hour", (byte) 18);
        setByteField(term46, term46.getClass(), "minute", (byte) 24);
        setByteField(term46, term46.getClass(), "second", (byte) 32);
        setIntField(term46, term46.getClass(), "nano", 369233818);
        setField(term41, term41.getClass(), "time", term46);
        setField(term26, term26.getClass(), "endDate", term41);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSale");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term26, args);
    }

};


