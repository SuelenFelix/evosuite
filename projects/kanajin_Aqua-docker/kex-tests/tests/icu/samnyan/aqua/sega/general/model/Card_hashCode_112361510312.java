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

public class Card_hashCode_112361510312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2121;

    public Card_hashCode_112361510312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2123 = new Long(2535595959091595249L);
        term2121 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term2137 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2138 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2142 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2147 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2148 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2152 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term2121, term2121.getClass(), "id", 2535595959091595249L);
        setField(term2121, term2121.getClass(), "extId", term2123);
        setField(term2121, term2121.getClass(), "luid", "bLPjGVBhlX");
        setIntField(term2138, term2138.getClass(), "year", 2015);
        setShortField(term2138, term2138.getClass(), "month", (short) 12);
        setShortField(term2138, term2138.getClass(), "day", (short) 23);
        setField(term2137, term2137.getClass(), "date", term2138);
        setByteField(term2142, term2142.getClass(), "hour", (byte) 14);
        setByteField(term2142, term2142.getClass(), "minute", (byte) 17);
        setByteField(term2142, term2142.getClass(), "second", (byte) 50);
        setIntField(term2142, term2142.getClass(), "nano", 325544804);
        setField(term2137, term2137.getClass(), "time", term2142);
        setField(term2121, term2121.getClass(), "registerTime", term2137);
        setIntField(term2148, term2148.getClass(), "year", 2027);
        setShortField(term2148, term2148.getClass(), "month", (short) 11);
        setShortField(term2148, term2148.getClass(), "day", (short) 8);
        setField(term2147, term2147.getClass(), "date", term2148);
        setByteField(term2152, term2152.getClass(), "hour", (byte) 11);
        setByteField(term2152, term2152.getClass(), "minute", (byte) 59);
        setByteField(term2152, term2152.getClass(), "second", (byte) 14);
        setIntField(term2152, term2152.getClass(), "nano", 322375591);
        setField(term2147, term2147.getClass(), "time", term2152);
        setField(term2121, term2121.getClass(), "accessTime", term2147);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.general.model.Card");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term2121, args);
    }

};


