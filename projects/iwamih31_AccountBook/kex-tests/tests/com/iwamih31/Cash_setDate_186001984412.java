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

public class Cash_setDate_186001984412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14071;
     Object term14096;

    public Cash_setDate_186001984412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term14072 = new Integer(-1896376975);
        Integer term14078 = new Integer(729658803);
        Integer term14080 = new Integer(114754804);
        Integer term14082 = new Integer(1687361082);
        Integer term14084 = new Integer(584893196);
        Integer term14086 = new Integer(497269071);
        Integer term14088 = new Integer(-1899301124);
        Integer term14090 = new Integer(-1882480155);
        Integer term14092 = new Integer(-1410220680);
        Integer term14094 = new Integer(389427431);
        term14071 = newInstance(Class.forName("com.iwamih31.Cash"));
        Object term14074 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term14071, term14071.getClass(), "id", term14072);
        setIntField(term14074, term14074.getClass(), "year", 2023);
        setShortField(term14074, term14074.getClass(), "month", (short) 3);
        setShortField(term14074, term14074.getClass(), "day", (short) 7);
        setField(term14071, term14071.getClass(), "date", term14074);
        setField(term14071, term14071.getClass(), "man1", term14078);
        setField(term14071, term14071.getClass(), "sen5", term14080);
        setField(term14071, term14071.getClass(), "sen1", term14082);
        setField(term14071, term14071.getClass(), "hyaku5", term14084);
        setField(term14071, term14071.getClass(), "hyaku1", term14086);
        setField(term14071, term14071.getClass(), "jyuu5", term14088);
        setField(term14071, term14071.getClass(), "jyuu1", term14090);
        setField(term14071, term14071.getClass(), "en5", term14092);
        setField(term14071, term14071.getClass(), "en1", term14094);
        term14096 = newInstance(Class.forName("java.time.LocalDate"));
        setIntField(term14096, term14096.getClass(), "year", 2022);
        setShortField(term14096, term14096.getClass(), "month", (short) 10);
        setShortField(term14096, term14096.getClass(), "day", (short) 18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Cash");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDate");
        Object[] args = new Object[1];
        args[0] = term14096;
        callMethod(klass, "setDate", argTypes, term14071, args);
    }

};


