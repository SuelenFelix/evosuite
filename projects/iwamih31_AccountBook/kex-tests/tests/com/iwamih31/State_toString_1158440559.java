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

public class State_toString_1158440559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term697;

    public State_toString_1158440559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term698 = new Integer(1725571209);
        term697 = newInstance(Class.forName("com.iwamih31.State"));
        Object term712 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term697, term697.getClass(), "id", term698);
        setField(term697, term697.getClass(), "name", "flxyYxBRtu");
        setIntField(term712, term712.getClass(), "year", 2026);
        setShortField(term712, term712.getClass(), "month", (short) 12);
        setShortField(term712, term712.getClass(), "day", (short) 13);
        setField(term697, term697.getClass(), "date", term712);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.State");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term697, args);
    }

};


