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

public class Plan_getStartdate_9875840813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31840;

    public Plan_getStartdate_9875840813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term31841 = new Integer(1324040357);
        Integer term31843 = new Integer(-1588772968);
        Integer term31889 = new Integer(-93135961);
        term31840 = newInstance(Class.forName("com.iwamih31.Plan"));
        Object term31845 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31849 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term31840, term31840.getClass(), "id", term31841);
        setField(term31840, term31840.getClass(), "user_id", term31843);
        setIntField(term31845, term31845.getClass(), "year", 2023);
        setShortField(term31845, term31845.getClass(), "month", (short) 9);
        setShortField(term31845, term31845.getClass(), "day", (short) 22);
        setField(term31840, term31840.getClass(), "start_date", term31845);
        setIntField(term31849, term31849.getClass(), "year", 2013);
        setShortField(term31849, term31849.getClass(), "month", (short) 3);
        setShortField(term31849, term31849.getClass(), "day", (short) 8);
        setField(term31840, term31840.getClass(), "last_date", term31849);
        setField(term31840, term31840.getClass(), "day_of_week", "oOUHomyJff");
        setField(term31840, term31840.getClass(), "subject", "KnnoLMOuur");
        setField(term31840, term31840.getClass(), "start_time", "buRpVghIvt");
        setField(term31840, term31840.getClass(), "minutes", term31889);
        setField(term31840, term31840.getClass(), "items", "oTGxFdiaIW");
        setField(term31840, term31840.getClass(), "note", "jlyFvaZlmv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Plan");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStart_date", argTypes, term31840, args);
    }

};


