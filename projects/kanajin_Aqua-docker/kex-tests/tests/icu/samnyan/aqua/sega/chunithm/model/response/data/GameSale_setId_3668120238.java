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
import java.lang.Integer;

public class GameSale_setId_3668120238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205;
     Object term230;

    public GameSale_setId_3668120238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term205 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSale"));
        Object term210 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term211 = newInstance(Class.forName("java.time.LocalDate"));
        Object term215 = newInstance(Class.forName("java.time.LocalTime"));
        Object term220 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term221 = newInstance(Class.forName("java.time.LocalDate"));
        Object term225 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term205, term205.getClass(), "orderId", 1193880199);
        setIntField(term205, term205.getClass(), "type", -1087774327);
        setIntField(term205, term205.getClass(), "id", -1530420153);
        setIntField(term205, term205.getClass(), "rate", -469968304);
        setIntField(term211, term211.getClass(), "year", 2015);
        setShortField(term211, term211.getClass(), "month", (short) 9);
        setShortField(term211, term211.getClass(), "day", (short) 16);
        setField(term210, term210.getClass(), "date", term211);
        setByteField(term215, term215.getClass(), "hour", (byte) 6);
        setByteField(term215, term215.getClass(), "minute", (byte) 19);
        setByteField(term215, term215.getClass(), "second", (byte) 42);
        setIntField(term215, term215.getClass(), "nano", 630084975);
        setField(term210, term210.getClass(), "time", term215);
        setField(term205, term205.getClass(), "startDate", term210);
        setIntField(term221, term221.getClass(), "year", 2029);
        setShortField(term221, term221.getClass(), "month", (short) 6);
        setShortField(term221, term221.getClass(), "day", (short) 23);
        setField(term220, term220.getClass(), "date", term221);
        setByteField(term225, term225.getClass(), "hour", (byte) 21);
        setByteField(term225, term225.getClass(), "minute", (byte) 55);
        setByteField(term225, term225.getClass(), "second", (byte) 27);
        setIntField(term225, term225.getClass(), "nano", 66889274);
        setField(term220, term220.getClass(), "time", term225);
        setField(term205, term205.getClass(), "endDate", term220);
        term230 = new Integer(-1145578966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSale");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term230;
        callMethod(klass, "setId", argTypes, term205, args);
    }

};


