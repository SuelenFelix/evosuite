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

public class Plan_getUserid_5517227052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31715;

    public Plan_getUserid_5517227052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term31716 = new Integer(-1371869594);
        Integer term31718 = new Integer(-2095575670);
        Integer term31764 = new Integer(1225272962);
        term31715 = newInstance(Class.forName("com.iwamih31.Plan"));
        Object term31720 = newInstance(Class.forName("java.time.LocalDate"));
        Object term31724 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term31715, term31715.getClass(), "id", term31716);
        setField(term31715, term31715.getClass(), "user_id", term31718);
        setIntField(term31720, term31720.getClass(), "year", 2025);
        setShortField(term31720, term31720.getClass(), "month", (short) 3);
        setShortField(term31720, term31720.getClass(), "day", (short) 8);
        setField(term31715, term31715.getClass(), "start_date", term31720);
        setIntField(term31724, term31724.getClass(), "year", 2025);
        setShortField(term31724, term31724.getClass(), "month", (short) 11);
        setShortField(term31724, term31724.getClass(), "day", (short) 1);
        setField(term31715, term31715.getClass(), "last_date", term31724);
        setField(term31715, term31715.getClass(), "day_of_week", "MFIdGVLoDo");
        setField(term31715, term31715.getClass(), "subject", "kbxgTcnXyU");
        setField(term31715, term31715.getClass(), "start_time", "lnJvDbbuwo");
        setField(term31715, term31715.getClass(), "minutes", term31764);
        setField(term31715, term31715.getClass(), "items", "KExnWkKGvF");
        setField(term31715, term31715.getClass(), "note", "luGUNfvmKk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Plan");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser_id", argTypes, term31715, args);
    }

};


