package icu.samnyan.aqua.sega.chunithm.service;

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
import static icu.samnyan.aqua.sega.chunithm.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class UserDataService_getUserByCard_14453827353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term875;

    public UserDataService_getUserByCard_14453827353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term877 = new Long(-8257434502486459194L);
        term875 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term891 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term892 = newInstance(Class.forName("java.time.LocalDate"));
        Object term896 = newInstance(Class.forName("java.time.LocalTime"));
        Object term901 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term902 = newInstance(Class.forName("java.time.LocalDate"));
        Object term906 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term875, term875.getClass(), "id", -6573104506744284592L);
        setField(term875, term875.getClass(), "extId", term877);
        setField(term875, term875.getClass(), "luid", "dWRymuLBtr");
        setIntField(term892, term892.getClass(), "year", 2012);
        setShortField(term892, term892.getClass(), "month", (short) 9);
        setShortField(term892, term892.getClass(), "day", (short) 11);
        setField(term891, term891.getClass(), "date", term892);
        setByteField(term896, term896.getClass(), "hour", (byte) 22);
        setByteField(term896, term896.getClass(), "minute", (byte) 10);
        setByteField(term896, term896.getClass(), "second", (byte) 8);
        setIntField(term896, term896.getClass(), "nano", 380008862);
        setField(term891, term891.getClass(), "time", term896);
        setField(term875, term875.getClass(), "registerTime", term891);
        setIntField(term902, term902.getClass(), "year", 2021);
        setShortField(term902, term902.getClass(), "month", (short) 9);
        setShortField(term902, term902.getClass(), "day", (short) 7);
        setField(term901, term901.getClass(), "date", term902);
        setByteField(term906, term906.getClass(), "hour", (byte) 5);
        setByteField(term906, term906.getClass(), "minute", (byte) 25);
        setByteField(term906, term906.getClass(), "second", (byte) 7);
        setIntField(term906, term906.getClass(), "nano", 755924076);
        setField(term901, term901.getClass(), "time", term906);
        setField(term875, term875.getClass(), "accessTime", term901);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.service.UserDataService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.general.model.Card");
        Object[] args = new Object[1];
        args[0] = term875;
        callMethod(klass, "getUserByCard", argTypes, null, args);
    }

};


