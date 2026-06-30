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

public class GameSale_getRate_8635616063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76;

    public GameSale_getRate_8635616063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSale"));
        Object term81 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82 = newInstance(Class.forName("java.time.LocalDate"));
        Object term86 = newInstance(Class.forName("java.time.LocalTime"));
        Object term91 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term92 = newInstance(Class.forName("java.time.LocalDate"));
        Object term96 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term76, term76.getClass(), "orderId", 1134449235);
        setIntField(term76, term76.getClass(), "type", -883034806);
        setIntField(term76, term76.getClass(), "id", 1585847225);
        setIntField(term76, term76.getClass(), "rate", 597278769);
        setIntField(term82, term82.getClass(), "year", 2025);
        setShortField(term82, term82.getClass(), "month", (short) 4);
        setShortField(term82, term82.getClass(), "day", (short) 24);
        setField(term81, term81.getClass(), "date", term82);
        setByteField(term86, term86.getClass(), "hour", (byte) 18);
        setByteField(term86, term86.getClass(), "minute", (byte) 11);
        setByteField(term86, term86.getClass(), "second", (byte) 40);
        setIntField(term86, term86.getClass(), "nano", 137454929);
        setField(term81, term81.getClass(), "time", term86);
        setField(term76, term76.getClass(), "startDate", term81);
        setIntField(term92, term92.getClass(), "year", 2024);
        setShortField(term92, term92.getClass(), "month", (short) 1);
        setShortField(term92, term92.getClass(), "day", (short) 24);
        setField(term91, term91.getClass(), "date", term92);
        setByteField(term96, term96.getClass(), "hour", (byte) 20);
        setByteField(term96, term96.getClass(), "minute", (byte) 28);
        setByteField(term96, term96.getClass(), "second", (byte) 39);
        setIntField(term96, term96.getClass(), "nano", 952728177);
        setField(term91, term91.getClass(), "time", term96);
        setField(term76, term76.getClass(), "endDate", term91);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSale");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRate", argTypes, term76, args);
    }

};


