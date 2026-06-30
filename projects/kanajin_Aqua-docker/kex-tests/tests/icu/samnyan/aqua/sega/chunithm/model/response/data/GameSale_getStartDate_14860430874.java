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

public class GameSale_getStartDate_14860430874 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101;

    public GameSale_getStartDate_14860430874() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSale"));
        Object term106 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term107 = newInstance(Class.forName("java.time.LocalDate"));
        Object term111 = newInstance(Class.forName("java.time.LocalTime"));
        Object term116 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term117 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term101, term101.getClass(), "orderId", -1685132342);
        setIntField(term101, term101.getClass(), "type", -1456670397);
        setIntField(term101, term101.getClass(), "id", 1622346318);
        setIntField(term101, term101.getClass(), "rate", 1048535127);
        setIntField(term107, term107.getClass(), "year", 2029);
        setShortField(term107, term107.getClass(), "month", (short) 8);
        setShortField(term107, term107.getClass(), "day", (short) 29);
        setField(term106, term106.getClass(), "date", term107);
        setByteField(term111, term111.getClass(), "hour", (byte) 15);
        setByteField(term111, term111.getClass(), "minute", (byte) 50);
        setByteField(term111, term111.getClass(), "second", (byte) 1);
        setIntField(term111, term111.getClass(), "nano", 277971904);
        setField(term106, term106.getClass(), "time", term111);
        setField(term101, term101.getClass(), "startDate", term106);
        setIntField(term117, term117.getClass(), "year", 2022);
        setShortField(term117, term117.getClass(), "month", (short) 11);
        setShortField(term117, term117.getClass(), "day", (short) 16);
        setField(term116, term116.getClass(), "date", term117);
        setByteField(term121, term121.getClass(), "hour", (byte) 15);
        setByteField(term121, term121.getClass(), "minute", (byte) 54);
        setByteField(term121, term121.getClass(), "second", (byte) 2);
        setIntField(term121, term121.getClass(), "nano", 733274103);
        setField(term116, term116.getClass(), "time", term121);
        setField(term101, term101.getClass(), "endDate", term116);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSale");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartDate", argTypes, term101, args);
    }

};


