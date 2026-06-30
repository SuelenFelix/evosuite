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

public class GameSale_setType_9952477867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178;
     Object term203;

    public GameSale_setType_9952477867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSale"));
        Object term183 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term184 = newInstance(Class.forName("java.time.LocalDate"));
        Object term188 = newInstance(Class.forName("java.time.LocalTime"));
        Object term193 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term194 = newInstance(Class.forName("java.time.LocalDate"));
        Object term198 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term178, term178.getClass(), "orderId", -244121226);
        setIntField(term178, term178.getClass(), "type", -203030934);
        setIntField(term178, term178.getClass(), "id", -1179120542);
        setIntField(term178, term178.getClass(), "rate", -73683645);
        setIntField(term184, term184.getClass(), "year", 2012);
        setShortField(term184, term184.getClass(), "month", (short) 2);
        setShortField(term184, term184.getClass(), "day", (short) 19);
        setField(term183, term183.getClass(), "date", term184);
        setByteField(term188, term188.getClass(), "hour", (byte) 8);
        setByteField(term188, term188.getClass(), "minute", (byte) 4);
        setByteField(term188, term188.getClass(), "second", (byte) 43);
        setIntField(term188, term188.getClass(), "nano", 114930008);
        setField(term183, term183.getClass(), "time", term188);
        setField(term178, term178.getClass(), "startDate", term183);
        setIntField(term194, term194.getClass(), "year", 2017);
        setShortField(term194, term194.getClass(), "month", (short) 6);
        setShortField(term194, term194.getClass(), "day", (short) 8);
        setField(term193, term193.getClass(), "date", term194);
        setByteField(term198, term198.getClass(), "hour", (byte) 0);
        setByteField(term198, term198.getClass(), "minute", (byte) 18);
        setByteField(term198, term198.getClass(), "second", (byte) 55);
        setIntField(term198, term198.getClass(), "nano", 680586717);
        setField(term193, term193.getClass(), "time", term198);
        setField(term178, term178.getClass(), "endDate", term193);
        term203 = new Integer(-226514366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSale");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term203;
        callMethod(klass, "setType", argTypes, term178, args);
    }

};


