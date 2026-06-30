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

public class Card_setAccessTime_21411352029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1971;
     Object term2007;

    public Card_setAccessTime_21411352029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1973 = new Long(-2813493605142626659L);
        term1971 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term1987 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1988 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1992 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1997 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1998 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2002 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1971, term1971.getClass(), "id", -2813493605142626659L);
        setField(term1971, term1971.getClass(), "extId", term1973);
        setField(term1971, term1971.getClass(), "luid", "kBdSllIBVz");
        setIntField(term1988, term1988.getClass(), "year", 2010);
        setShortField(term1988, term1988.getClass(), "month", (short) 6);
        setShortField(term1988, term1988.getClass(), "day", (short) 14);
        setField(term1987, term1987.getClass(), "date", term1988);
        setByteField(term1992, term1992.getClass(), "hour", (byte) 6);
        setByteField(term1992, term1992.getClass(), "minute", (byte) 22);
        setByteField(term1992, term1992.getClass(), "second", (byte) 20);
        setIntField(term1992, term1992.getClass(), "nano", 25133051);
        setField(term1987, term1987.getClass(), "time", term1992);
        setField(term1971, term1971.getClass(), "registerTime", term1987);
        setIntField(term1998, term1998.getClass(), "year", 2010);
        setShortField(term1998, term1998.getClass(), "month", (short) 5);
        setShortField(term1998, term1998.getClass(), "day", (short) 2);
        setField(term1997, term1997.getClass(), "date", term1998);
        setByteField(term2002, term2002.getClass(), "hour", (byte) 2);
        setByteField(term2002, term2002.getClass(), "minute", (byte) 22);
        setByteField(term2002, term2002.getClass(), "second", (byte) 33);
        setIntField(term2002, term2002.getClass(), "nano", 530835039);
        setField(term1997, term1997.getClass(), "time", term2002);
        setField(term1971, term1971.getClass(), "accessTime", term1997);
        term2007 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2008 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2012 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term2008, term2008.getClass(), "year", 2024);
        setShortField(term2008, term2008.getClass(), "month", (short) 4);
        setShortField(term2008, term2008.getClass(), "day", (short) 24);
        setField(term2007, term2007.getClass(), "date", term2008);
        setByteField(term2012, term2012.getClass(), "hour", (byte) 7);
        setByteField(term2012, term2012.getClass(), "minute", (byte) 2);
        setByteField(term2012, term2012.getClass(), "second", (byte) 51);
        setIntField(term2012, term2012.getClass(), "nano", 635502964);
        setField(term2007, term2007.getClass(), "time", term2012);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.general.model.Card");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term2007;
        callMethod(klass, "setAccessTime", argTypes, term1971, args);
    }

};


