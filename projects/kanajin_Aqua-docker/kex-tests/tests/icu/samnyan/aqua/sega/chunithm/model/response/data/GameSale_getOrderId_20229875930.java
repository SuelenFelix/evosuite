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

public class GameSale_getOrderId_20229875930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public GameSale_getOrderId_20229875930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSale"));
        Object term6 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7 = newInstance(Class.forName("java.time.LocalDate"));
        Object term11 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term17 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term1, term1.getClass(), "orderId", 568599855);
        setIntField(term1, term1.getClass(), "type", 1162663216);
        setIntField(term1, term1.getClass(), "id", 1484323161);
        setIntField(term1, term1.getClass(), "rate", 391863371);
        setIntField(term7, term7.getClass(), "year", 2012);
        setShortField(term7, term7.getClass(), "month", (short) 8);
        setShortField(term7, term7.getClass(), "day", (short) 25);
        setField(term6, term6.getClass(), "date", term7);
        setByteField(term11, term11.getClass(), "hour", (byte) 5);
        setByteField(term11, term11.getClass(), "minute", (byte) 20);
        setByteField(term11, term11.getClass(), "second", (byte) 50);
        setIntField(term11, term11.getClass(), "nano", 345595912);
        setField(term6, term6.getClass(), "time", term11);
        setField(term1, term1.getClass(), "startDate", term6);
        setIntField(term17, term17.getClass(), "year", 2021);
        setShortField(term17, term17.getClass(), "month", (short) 1);
        setShortField(term17, term17.getClass(), "day", (short) 18);
        setField(term16, term16.getClass(), "date", term17);
        setByteField(term21, term21.getClass(), "hour", (byte) 13);
        setByteField(term21, term21.getClass(), "minute", (byte) 38);
        setByteField(term21, term21.getClass(), "second", (byte) 26);
        setIntField(term21, term21.getClass(), "nano", 544608644);
        setField(term16, term16.getClass(), "time", term21);
        setField(term1, term1.getClass(), "endDate", term16);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSale");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrderId", argTypes, term1, args);
    }

};


