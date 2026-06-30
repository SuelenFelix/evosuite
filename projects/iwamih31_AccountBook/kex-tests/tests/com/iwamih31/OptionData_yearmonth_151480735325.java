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

public class OptionData_yearmonth_151480735325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39495;
     Object term39496;
     Object term39498;

    public OptionData_yearmonth_151480735325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39495 = newInstance(Class.forName("com.iwamih31.OptionData"));
        term39496 = new Integer(0);
        term39498 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.OptionData");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term39496;
        args[1] = term39498;
        callMethod(klass, "year_month", argTypes, term39495, args);
    }

};


