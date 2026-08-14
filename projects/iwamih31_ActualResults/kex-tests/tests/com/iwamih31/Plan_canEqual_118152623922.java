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

public class Plan_canEqual_118152623922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34340;
     Object term34415;

    public Plan_canEqual_118152623922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term34341 = new Integer(53410913);
        Integer term34343 = new Integer(-375014958);
        Integer term34389 = new Integer(1107176718);
        term34340 = newInstance(Class.forName("com.iwamih31.Plan"));
        Object term34345 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34349 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term34340, term34340.getClass(), "id", term34341);
        setField(term34340, term34340.getClass(), "user_id", term34343);
        setIntField(term34345, term34345.getClass(), "year", 2017);
        setShortField(term34345, term34345.getClass(), "month", (short) 4);
        setShortField(term34345, term34345.getClass(), "day", (short) 2);
        setField(term34340, term34340.getClass(), "start_date", term34345);
        setIntField(term34349, term34349.getClass(), "year", 2016);
        setShortField(term34349, term34349.getClass(), "month", (short) 4);
        setShortField(term34349, term34349.getClass(), "day", (short) 30);
        setField(term34340, term34340.getClass(), "last_date", term34349);
        setField(term34340, term34340.getClass(), "day_of_week", "ljNOgdPWrL");
        setField(term34340, term34340.getClass(), "subject", "oBlIZiyRMS");
        setField(term34340, term34340.getClass(), "start_time", "QUYAkhtCNh");
        setField(term34340, term34340.getClass(), "minutes", term34389);
        setField(term34340, term34340.getClass(), "items", "kOaAQOLyqd");
        setField(term34340, term34340.getClass(), "note", "ICBWiKaeHC");
        term34415 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Plan");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term34415;
        callMethod(klass, "canEqual", argTypes, term34340, args);
    }

};


