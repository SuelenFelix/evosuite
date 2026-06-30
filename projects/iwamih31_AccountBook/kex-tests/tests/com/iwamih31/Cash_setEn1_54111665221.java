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

public class Cash_setEn1_54111665221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14316;
     Object term14341;

    public Cash_setEn1_54111665221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term14317 = new Integer(-916335264);
        Integer term14323 = new Integer(-919416536);
        Integer term14325 = new Integer(-43417861);
        Integer term14327 = new Integer(-1533843432);
        Integer term14329 = new Integer(-123338791);
        Integer term14331 = new Integer(-1467089634);
        Integer term14333 = new Integer(413548937);
        Integer term14335 = new Integer(1901317214);
        Integer term14337 = new Integer(1166710220);
        Integer term14339 = new Integer(-1070592289);
        term14316 = newInstance(Class.forName("com.iwamih31.Cash"));
        Object term14319 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term14316, term14316.getClass(), "id", term14317);
        setIntField(term14319, term14319.getClass(), "year", 2028);
        setShortField(term14319, term14319.getClass(), "month", (short) 9);
        setShortField(term14319, term14319.getClass(), "day", (short) 30);
        setField(term14316, term14316.getClass(), "date", term14319);
        setField(term14316, term14316.getClass(), "man1", term14323);
        setField(term14316, term14316.getClass(), "sen5", term14325);
        setField(term14316, term14316.getClass(), "sen1", term14327);
        setField(term14316, term14316.getClass(), "hyaku5", term14329);
        setField(term14316, term14316.getClass(), "hyaku1", term14331);
        setField(term14316, term14316.getClass(), "jyuu5", term14333);
        setField(term14316, term14316.getClass(), "jyuu1", term14335);
        setField(term14316, term14316.getClass(), "en5", term14337);
        setField(term14316, term14316.getClass(), "en1", term14339);
        term14341 = new Integer(-1464172784);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Cash");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term14341;
        callMethod(klass, "setEn1", argTypes, term14316, args);
    }

};


