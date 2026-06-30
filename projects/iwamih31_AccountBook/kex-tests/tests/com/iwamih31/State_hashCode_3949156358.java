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

public class State_hashCode_3949156358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term668;

    public State_hashCode_3949156358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term669 = new Integer(-1339778481);
        term668 = newInstance(Class.forName("com.iwamih31.State"));
        Object term683 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term668, term668.getClass(), "id", term669);
        setField(term668, term668.getClass(), "name", "vrQLuWIDJX");
        setIntField(term683, term683.getClass(), "year", 2017);
        setShortField(term683, term683.getClass(), "month", (short) 7);
        setShortField(term683, term683.getClass(), "day", (short) 22);
        setField(term668, term668.getClass(), "date", term683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.State");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term668, args);
    }

};


