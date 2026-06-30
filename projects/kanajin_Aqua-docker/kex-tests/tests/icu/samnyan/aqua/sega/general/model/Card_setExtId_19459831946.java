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

public class Card_setExtId_19459831946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1799;
     Object term1835;

    public Card_setExtId_19459831946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1801 = new Long(4872422362414183754L);
        term1799 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term1815 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1816 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1820 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1825 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1826 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1830 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1799, term1799.getClass(), "id", 6811161968424632369L);
        setField(term1799, term1799.getClass(), "extId", term1801);
        setField(term1799, term1799.getClass(), "luid", "hoicvmsovO");
        setIntField(term1816, term1816.getClass(), "year", 2028);
        setShortField(term1816, term1816.getClass(), "month", (short) 10);
        setShortField(term1816, term1816.getClass(), "day", (short) 1);
        setField(term1815, term1815.getClass(), "date", term1816);
        setByteField(term1820, term1820.getClass(), "hour", (byte) 17);
        setByteField(term1820, term1820.getClass(), "minute", (byte) 29);
        setByteField(term1820, term1820.getClass(), "second", (byte) 30);
        setIntField(term1820, term1820.getClass(), "nano", 845472306);
        setField(term1815, term1815.getClass(), "time", term1820);
        setField(term1799, term1799.getClass(), "registerTime", term1815);
        setIntField(term1826, term1826.getClass(), "year", 2027);
        setShortField(term1826, term1826.getClass(), "month", (short) 2);
        setShortField(term1826, term1826.getClass(), "day", (short) 19);
        setField(term1825, term1825.getClass(), "date", term1826);
        setByteField(term1830, term1830.getClass(), "hour", (byte) 17);
        setByteField(term1830, term1830.getClass(), "minute", (byte) 37);
        setByteField(term1830, term1830.getClass(), "second", (byte) 27);
        setIntField(term1830, term1830.getClass(), "nano", 920380537);
        setField(term1825, term1825.getClass(), "time", term1830);
        setField(term1799, term1799.getClass(), "accessTime", term1825);
        term1835 = new Long(6811161968424632369L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.general.model.Card");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term1835;
        callMethod(klass, "setExtId", argTypes, term1799, args);
    }

};


