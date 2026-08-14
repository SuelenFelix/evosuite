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

public class Plan_setUserid_4153381912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32967;
     Object term33042;

    public Plan_setUserid_4153381912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term32968 = new Integer(-344842608);
        Integer term32970 = new Integer(941650513);
        Integer term33016 = new Integer(444029505);
        term32967 = newInstance(Class.forName("com.iwamih31.Plan"));
        Object term32972 = newInstance(Class.forName("java.time.LocalDate"));
        Object term32976 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term32967, term32967.getClass(), "id", term32968);
        setField(term32967, term32967.getClass(), "user_id", term32970);
        setIntField(term32972, term32972.getClass(), "year", 2010);
        setShortField(term32972, term32972.getClass(), "month", (short) 5);
        setShortField(term32972, term32972.getClass(), "day", (short) 2);
        setField(term32967, term32967.getClass(), "start_date", term32972);
        setIntField(term32976, term32976.getClass(), "year", 2020);
        setShortField(term32976, term32976.getClass(), "month", (short) 8);
        setShortField(term32976, term32976.getClass(), "day", (short) 13);
        setField(term32967, term32967.getClass(), "last_date", term32976);
        setField(term32967, term32967.getClass(), "day_of_week", "GlxnEJvYeC");
        setField(term32967, term32967.getClass(), "subject", "SLdOGaqmNv");
        setField(term32967, term32967.getClass(), "start_time", "QZfhwDBzyR");
        setField(term32967, term32967.getClass(), "minutes", term33016);
        setField(term32967, term32967.getClass(), "items", "HvnMmAOZev");
        setField(term32967, term32967.getClass(), "note", "JTPAQsfRtT");
        term33042 = new Integer(-1034506028);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Plan");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term33042;
        callMethod(klass, "setUser_id", argTypes, term32967, args);
    }

};


