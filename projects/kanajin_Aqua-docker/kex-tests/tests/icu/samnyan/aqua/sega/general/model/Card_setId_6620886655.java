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

public class Card_setId_6620886655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1751;
     Object term1787;

    public Card_setId_6620886655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1753 = new Long(7411271909051562686L);
        term1751 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term1767 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1768 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1772 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1777 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1778 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1782 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1751, term1751.getClass(), "id", 7411271909051562686L);
        setField(term1751, term1751.getClass(), "extId", term1753);
        setField(term1751, term1751.getClass(), "luid", "dEnhdmILtU");
        setIntField(term1768, term1768.getClass(), "year", 2025);
        setShortField(term1768, term1768.getClass(), "month", (short) 3);
        setShortField(term1768, term1768.getClass(), "day", (short) 9);
        setField(term1767, term1767.getClass(), "date", term1768);
        setByteField(term1772, term1772.getClass(), "hour", (byte) 5);
        setByteField(term1772, term1772.getClass(), "minute", (byte) 49);
        setByteField(term1772, term1772.getClass(), "second", (byte) 12);
        setIntField(term1772, term1772.getClass(), "nano", 791695028);
        setField(term1767, term1767.getClass(), "time", term1772);
        setField(term1751, term1751.getClass(), "registerTime", term1767);
        setIntField(term1778, term1778.getClass(), "year", 2023);
        setShortField(term1778, term1778.getClass(), "month", (short) 9);
        setShortField(term1778, term1778.getClass(), "day", (short) 23);
        setField(term1777, term1777.getClass(), "date", term1778);
        setByteField(term1782, term1782.getClass(), "hour", (byte) 12);
        setByteField(term1782, term1782.getClass(), "minute", (byte) 55);
        setByteField(term1782, term1782.getClass(), "second", (byte) 58);
        setIntField(term1782, term1782.getClass(), "nano", 159178396);
        setField(term1777, term1777.getClass(), "time", term1782);
        setField(term1751, term1751.getClass(), "accessTime", term1777);
        term1787 = new Long(4872422362414183754L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.general.model.Card");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1787;
        callMethod(klass, "setId", argTypes, term1751, args);
    }

};


