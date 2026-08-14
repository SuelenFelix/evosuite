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

public class Plan_getItems_7960605079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32590;

    public Plan_getItems_7960605079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term32591 = new Integer(1240914516);
        Integer term32593 = new Integer(-1465035361);
        Integer term32639 = new Integer(1090617576);
        term32590 = newInstance(Class.forName("com.iwamih31.Plan"));
        Object term32595 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32599 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term32590, term32590.getClass(), "id", term32591);
        setField(term32590, term32590.getClass(), "user_id", term32593);
        setIntField(term32595, term32595.getClass(), "year", 2012);
        setShortField(term32595, term32595.getClass(), "month", (short) 8);
        setShortField(term32595, term32595.getClass(), "day", (short) 25);
        setField(term32590, term32590.getClass(), "start_date", term32595);
        setIntField(term32599, term32599.getClass(), "year", 2028);
        setShortField(term32599, term32599.getClass(), "month", (short) 4);
        setShortField(term32599, term32599.getClass(), "day", (short) 3);
        setField(term32590, term32590.getClass(), "last_date", term32599);
        setField(term32590, term32590.getClass(), "day_of_week", "PDYPOQncAB");
        setField(term32590, term32590.getClass(), "subject", "cHqLMqZSmc");
        setField(term32590, term32590.getClass(), "start_time", "hkWmAkXSOW");
        setField(term32590, term32590.getClass(), "minutes", term32639);
        setField(term32590, term32590.getClass(), "items", "DwQmZEKeOp");
        setField(term32590, term32590.getClass(), "note", "DbxrFiyttv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Plan");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getItems", argTypes, term32590, args);
    }

};


