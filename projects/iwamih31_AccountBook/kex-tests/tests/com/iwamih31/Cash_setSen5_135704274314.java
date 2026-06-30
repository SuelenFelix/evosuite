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

public class Cash_setSen5_135704274314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14127;
     Object term14152;

    public Cash_setSen5_135704274314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term14128 = new Integer(318591690);
        Integer term14134 = new Integer(-165587447);
        Integer term14136 = new Integer(-1347358701);
        Integer term14138 = new Integer(806595993);
        Integer term14140 = new Integer(548228925);
        Integer term14142 = new Integer(-749861210);
        Integer term14144 = new Integer(1694224101);
        Integer term14146 = new Integer(937859191);
        Integer term14148 = new Integer(-916584829);
        Integer term14150 = new Integer(-2131181468);
        term14127 = newInstance(Class.forName("com.iwamih31.Cash"));
        Object term14130 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term14127, term14127.getClass(), "id", term14128);
        setIntField(term14130, term14130.getClass(), "year", 2021);
        setShortField(term14130, term14130.getClass(), "month", (short) 9);
        setShortField(term14130, term14130.getClass(), "day", (short) 30);
        setField(term14127, term14127.getClass(), "date", term14130);
        setField(term14127, term14127.getClass(), "man1", term14134);
        setField(term14127, term14127.getClass(), "sen5", term14136);
        setField(term14127, term14127.getClass(), "sen1", term14138);
        setField(term14127, term14127.getClass(), "hyaku5", term14140);
        setField(term14127, term14127.getClass(), "hyaku1", term14142);
        setField(term14127, term14127.getClass(), "jyuu5", term14144);
        setField(term14127, term14127.getClass(), "jyuu1", term14146);
        setField(term14127, term14127.getClass(), "en5", term14148);
        setField(term14127, term14127.getClass(), "en1", term14150);
        term14152 = new Integer(282916351);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Cash");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term14152;
        callMethod(klass, "setSen5", argTypes, term14127, args);
    }

};


