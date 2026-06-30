package icu.samnyan.aqua.sega.general.model;

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
import static icu.samnyan.aqua.sega.general.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class Card_getLuid_14899267572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1613;

    public Card_getLuid_14899267572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1615 = new Long(-8257434502486459194L);
        term1613 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term1629 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1630 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1634 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1639 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1640 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1644 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1613, term1613.getClass(), "id", -8257434502486459194L);
        setField(term1613, term1613.getClass(), "extId", term1615);
        setField(term1613, term1613.getClass(), "luid", "ytSBIKXogI");
        setIntField(term1630, term1630.getClass(), "year", 2017);
        setShortField(term1630, term1630.getClass(), "month", (short) 3);
        setShortField(term1630, term1630.getClass(), "day", (short) 5);
        setField(term1629, term1629.getClass(), "date", term1630);
        setByteField(term1634, term1634.getClass(), "hour", (byte) 20);
        setByteField(term1634, term1634.getClass(), "minute", (byte) 34);
        setByteField(term1634, term1634.getClass(), "second", (byte) 55);
        setIntField(term1634, term1634.getClass(), "nano", 78024496);
        setField(term1629, term1629.getClass(), "time", term1634);
        setField(term1613, term1613.getClass(), "registerTime", term1629);
        setIntField(term1640, term1640.getClass(), "year", 2020);
        setShortField(term1640, term1640.getClass(), "month", (short) 7);
        setShortField(term1640, term1640.getClass(), "day", (short) 24);
        setField(term1639, term1639.getClass(), "date", term1640);
        setByteField(term1644, term1644.getClass(), "hour", (byte) 0);
        setByteField(term1644, term1644.getClass(), "minute", (byte) 59);
        setByteField(term1644, term1644.getClass(), "second", (byte) 56);
        setIntField(term1644, term1644.getClass(), "nano", 320219201);
        setField(term1639, term1639.getClass(), "time", term1644);
        setField(term1613, term1613.getClass(), "accessTime", term1639);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.general.model.Card");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLuid", argTypes, term1613, args);
    }

};


