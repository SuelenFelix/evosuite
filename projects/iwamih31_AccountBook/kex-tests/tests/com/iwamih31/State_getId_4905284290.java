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

public class State_getId_4905284290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406;

    public State_getId_4905284290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term407 = new Integer(568599855);
        term406 = newInstance(Class.forName("com.iwamih31.State"));
        Object term421 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term406, term406.getClass(), "id", term407);
        setField(term406, term406.getClass(), "name", "ZiaGIbnzTs");
        setIntField(term421, term421.getClass(), "year", 2012);
        setShortField(term421, term421.getClass(), "month", (short) 8);
        setShortField(term421, term421.getClass(), "day", (short) 25);
        setField(term406, term406.getClass(), "date", term421);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.State");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term406, args);
    }

};


