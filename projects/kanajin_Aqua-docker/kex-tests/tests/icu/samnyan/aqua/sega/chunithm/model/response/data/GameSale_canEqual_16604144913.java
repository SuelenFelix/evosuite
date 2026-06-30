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

public class GameSale_canEqual_16604144913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355;
     Object term380;

    public GameSale_canEqual_16604144913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term355 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSale"));
        Object term360 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term361 = newInstance(Class.forName("java.time.LocalDate"));
        Object term365 = newInstance(Class.forName("java.time.LocalTime"));
        Object term370 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term371 = newInstance(Class.forName("java.time.LocalDate"));
        Object term375 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term355, term355.getClass(), "orderId", 458147407);
        setIntField(term355, term355.getClass(), "type", -184153539);
        setIntField(term355, term355.getClass(), "id", 493620644);
        setIntField(term355, term355.getClass(), "rate", 1328271830);
        setIntField(term361, term361.getClass(), "year", 2021);
        setShortField(term361, term361.getClass(), "month", (short) 8);
        setShortField(term361, term361.getClass(), "day", (short) 12);
        setField(term360, term360.getClass(), "date", term361);
        setByteField(term365, term365.getClass(), "hour", (byte) 2);
        setByteField(term365, term365.getClass(), "minute", (byte) 17);
        setByteField(term365, term365.getClass(), "second", (byte) 51);
        setIntField(term365, term365.getClass(), "nano", 207375141);
        setField(term360, term360.getClass(), "time", term365);
        setField(term355, term355.getClass(), "startDate", term360);
        setIntField(term371, term371.getClass(), "year", 2025);
        setShortField(term371, term371.getClass(), "month", (short) 11);
        setShortField(term371, term371.getClass(), "day", (short) 3);
        setField(term370, term370.getClass(), "date", term371);
        setByteField(term375, term375.getClass(), "hour", (byte) 21);
        setByteField(term375, term375.getClass(), "minute", (byte) 24);
        setByteField(term375, term375.getClass(), "second", (byte) 23);
        setIntField(term375, term375.getClass(), "nano", 210986721);
        setField(term370, term370.getClass(), "time", term375);
        setField(term355, term355.getClass(), "endDate", term370);
        term380 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSale");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term380;
        callMethod(klass, "canEqual", argTypes, term355, args);
    }

};


