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

public class GameSale_toString_192965044315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406;

    public GameSale_toString_192965044315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term406 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSale"));
        Object term411 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term412 = newInstance(Class.forName("java.time.LocalDate"));
        Object term416 = newInstance(Class.forName("java.time.LocalTime"));
        Object term421 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term422 = newInstance(Class.forName("java.time.LocalDate"));
        Object term426 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term406, term406.getClass(), "orderId", 1225272962);
        setIntField(term406, term406.getClass(), "type", 1324040357);
        setIntField(term406, term406.getClass(), "id", -1588772968);
        setIntField(term406, term406.getClass(), "rate", -93135961);
        setIntField(term412, term412.getClass(), "year", 2012);
        setShortField(term412, term412.getClass(), "month", (short) 3);
        setShortField(term412, term412.getClass(), "day", (short) 27);
        setField(term411, term411.getClass(), "date", term412);
        setByteField(term416, term416.getClass(), "hour", (byte) 17);
        setByteField(term416, term416.getClass(), "minute", (byte) 49);
        setByteField(term416, term416.getClass(), "second", (byte) 24);
        setIntField(term416, term416.getClass(), "nano", 530647398);
        setField(term411, term411.getClass(), "time", term416);
        setField(term406, term406.getClass(), "startDate", term411);
        setIntField(term422, term422.getClass(), "year", 2010);
        setShortField(term422, term422.getClass(), "month", (short) 6);
        setShortField(term422, term422.getClass(), "day", (short) 14);
        setField(term421, term421.getClass(), "date", term422);
        setByteField(term426, term426.getClass(), "hour", (byte) 6);
        setByteField(term426, term426.getClass(), "minute", (byte) 22);
        setByteField(term426, term426.getClass(), "second", (byte) 20);
        setIntField(term426, term426.getClass(), "nano", 25133051);
        setField(term421, term421.getClass(), "time", term426);
        setField(term406, term406.getClass(), "endDate", term421);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSale");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term406, args);
    }

};


