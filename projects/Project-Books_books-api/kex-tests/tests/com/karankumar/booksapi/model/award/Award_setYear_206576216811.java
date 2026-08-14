package com.karankumar.booksapi.model.award;

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
import static com.karankumar.booksapi.model.award.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Integer;

public class Award_setYear_206576216811 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5037;
     Object term5095;

    public Award_setYear_206576216811() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5038 = new Long(-2170847986967241072L);
        Class<? extends Object> term5098 = Class.forName((String) "com.karankumar.booksapi.model.award.AwardName");
        Field term5097 = ((Class) term5098).getDeclaredField((String) "PORTICO_PRIZE");
        ((Field) term5097).setAccessible(true);
        Object enum12 = ((Field) term5097).get((Object) null);
        HashMap term5090 = new HashMap();
        Set<Object> term5378 =  ((Map) term5090).keySet();
        HashSet term5089 = new HashSet((Collection<? extends Object>) term5378);
        term5037 = newInstance(Class.forName("com.karankumar.booksapi.model.award.Award"));
        setField(term5037, term5037.getClass(), "id", term5038);
        setField(term5037, term5037.getClass(), "awardName", enum12);
        setField(term5037, term5037.getClass(), "category", "jUbSRrkrYZ");
        setIntField(term5037, term5037.getClass(), "year", -522618178);
        setField(term5037, term5037.getClass(), "books", term5089);
        term5095 = new Integer(1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.karankumar.booksapi.model.award.Award");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5095;
        callMethod(klass, "setYear", argTypes, term5037, args);
    }

};


