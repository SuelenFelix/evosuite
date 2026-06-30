package com.iwamih31;

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
import static com.iwamih31.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Cash_getDate_1354018661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13794;

    public Cash_getDate_1354018661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term13795 = new Integer(-2027534003);
        Integer term13801 = new Integer(1063420942);
        Integer term13803 = new Integer(1375330971);
        Integer term13805 = new Integer(-478195677);
        Integer term13807 = new Integer(972867650);
        Integer term13809 = new Integer(1655935355);
        Integer term13811 = new Integer(-481533957);
        Integer term13813 = new Integer(1240914516);
        Integer term13815 = new Integer(-1465035361);
        Integer term13817 = new Integer(1090617576);
        term13794 = newInstance(Class.forName("com.iwamih31.Cash"));
        Object term13797 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term13794, term13794.getClass(), "id", term13795);
        setIntField(term13797, term13797.getClass(), "year", 2023);
        setShortField(term13797, term13797.getClass(), "month", (short) 8);
        setShortField(term13797, term13797.getClass(), "day", (short) 12);
        setField(term13794, term13794.getClass(), "date", term13797);
        setField(term13794, term13794.getClass(), "man1", term13801);
        setField(term13794, term13794.getClass(), "sen5", term13803);
        setField(term13794, term13794.getClass(), "sen1", term13805);
        setField(term13794, term13794.getClass(), "hyaku5", term13807);
        setField(term13794, term13794.getClass(), "hyaku1", term13809);
        setField(term13794, term13794.getClass(), "jyuu5", term13811);
        setField(term13794, term13794.getClass(), "jyuu1", term13813);
        setField(term13794, term13794.getClass(), "en5", term13815);
        setField(term13794, term13794.getClass(), "en1", term13817);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Cash");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDate", argTypes, term13794, args);
    }

};


