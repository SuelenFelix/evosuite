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

public class Card_getExtId_13926370921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1567;

    public Card_getExtId_13926370921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1569 = new Long(6375119433582206027L);
        term1567 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term1583 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1584 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1588 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1593 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1594 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1598 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1567, term1567.getClass(), "id", 6375119433582206027L);
        setField(term1567, term1567.getClass(), "extId", term1569);
        setField(term1567, term1567.getClass(), "luid", "MLqYREekMl");
        setIntField(term1584, term1584.getClass(), "year", 2015);
        setShortField(term1584, term1584.getClass(), "month", (short) 9);
        setShortField(term1584, term1584.getClass(), "day", (short) 16);
        setField(term1583, term1583.getClass(), "date", term1584);
        setByteField(term1588, term1588.getClass(), "hour", (byte) 6);
        setByteField(term1588, term1588.getClass(), "minute", (byte) 19);
        setByteField(term1588, term1588.getClass(), "second", (byte) 42);
        setIntField(term1588, term1588.getClass(), "nano", 630084975);
        setField(term1583, term1583.getClass(), "time", term1588);
        setField(term1567, term1567.getClass(), "registerTime", term1583);
        setIntField(term1594, term1594.getClass(), "year", 2029);
        setShortField(term1594, term1594.getClass(), "month", (short) 6);
        setShortField(term1594, term1594.getClass(), "day", (short) 23);
        setField(term1593, term1593.getClass(), "date", term1594);
        setByteField(term1598, term1598.getClass(), "hour", (byte) 21);
        setByteField(term1598, term1598.getClass(), "minute", (byte) 55);
        setByteField(term1598, term1598.getClass(), "second", (byte) 27);
        setIntField(term1598, term1598.getClass(), "nano", 66889274);
        setField(term1593, term1593.getClass(), "time", term1598);
        setField(term1567, term1567.getClass(), "accessTime", term1593);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.general.model.Card");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExtId", argTypes, term1567, args);
    }

};


