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

public class Card_getAccessTime_1978657624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1705;

    public Card_getAccessTime_1978657624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1707 = new Long(5270370404989704783L);
        term1705 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term1721 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1722 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1726 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1731 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1732 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1736 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1705, term1705.getClass(), "id", 5270370404989704783L);
        setField(term1705, term1705.getClass(), "extId", term1707);
        setField(term1705, term1705.getClass(), "luid", "ieCtQFdkii");
        setIntField(term1722, term1722.getClass(), "year", 2015);
        setShortField(term1722, term1722.getClass(), "month", (short) 3);
        setShortField(term1722, term1722.getClass(), "day", (short) 10);
        setField(term1721, term1721.getClass(), "date", term1722);
        setByteField(term1726, term1726.getClass(), "hour", (byte) 23);
        setByteField(term1726, term1726.getClass(), "minute", (byte) 34);
        setByteField(term1726, term1726.getClass(), "second", (byte) 44);
        setIntField(term1726, term1726.getClass(), "nano", 587322824);
        setField(term1721, term1721.getClass(), "time", term1726);
        setField(term1705, term1705.getClass(), "registerTime", term1721);
        setIntField(term1732, term1732.getClass(), "year", 2027);
        setShortField(term1732, term1732.getClass(), "month", (short) 8);
        setShortField(term1732, term1732.getClass(), "day", (short) 26);
        setField(term1731, term1731.getClass(), "date", term1732);
        setByteField(term1736, term1736.getClass(), "hour", (byte) 5);
        setByteField(term1736, term1736.getClass(), "minute", (byte) 11);
        setByteField(term1736, term1736.getClass(), "second", (byte) 9);
        setIntField(term1736, term1736.getClass(), "nano", 219245092);
        setField(term1731, term1731.getClass(), "time", term1736);
        setField(term1705, term1705.getClass(), "accessTime", term1731);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.general.model.Card");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccessTime", argTypes, term1705, args);
    }

};


