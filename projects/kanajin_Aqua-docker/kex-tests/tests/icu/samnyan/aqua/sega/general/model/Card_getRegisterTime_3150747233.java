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

public class Card_getRegisterTime_3150747233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1659;

    public Card_getRegisterTime_3150747233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1661 = new Long(-8400487765614892086L);
        term1659 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term1675 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1676 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1680 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1685 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1686 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1690 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1659, term1659.getClass(), "id", -8400487765614892086L);
        setField(term1659, term1659.getClass(), "extId", term1661);
        setField(term1659, term1659.getClass(), "luid", "nHXjMycHlU");
        setIntField(term1676, term1676.getClass(), "year", 2014);
        setShortField(term1676, term1676.getClass(), "month", (short) 7);
        setShortField(term1676, term1676.getClass(), "day", (short) 13);
        setField(term1675, term1675.getClass(), "date", term1676);
        setByteField(term1680, term1680.getClass(), "hour", (byte) 21);
        setByteField(term1680, term1680.getClass(), "minute", (byte) 46);
        setByteField(term1680, term1680.getClass(), "second", (byte) 0);
        setIntField(term1680, term1680.getClass(), "nano", 887884128);
        setField(term1675, term1675.getClass(), "time", term1680);
        setField(term1659, term1659.getClass(), "registerTime", term1675);
        setIntField(term1686, term1686.getClass(), "year", 2023);
        setShortField(term1686, term1686.getClass(), "month", (short) 3);
        setShortField(term1686, term1686.getClass(), "day", (short) 7);
        setField(term1685, term1685.getClass(), "date", term1686);
        setByteField(term1690, term1690.getClass(), "hour", (byte) 21);
        setByteField(term1690, term1690.getClass(), "minute", (byte) 15);
        setByteField(term1690, term1690.getClass(), "second", (byte) 43);
        setIntField(term1690, term1690.getClass(), "nano", 639721472);
        setField(term1685, term1685.getClass(), "time", term1690);
        setField(term1659, term1659.getClass(), "accessTime", term1685);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.general.model.Card");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegisterTime", argTypes, term1659, args);
    }

};


