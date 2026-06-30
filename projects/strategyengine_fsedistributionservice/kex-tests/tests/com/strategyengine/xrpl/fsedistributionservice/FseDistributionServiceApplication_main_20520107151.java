package com.strategyengine.xrpl.fsedistributionservice;

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
import static com.strategyengine.xrpl.fsedistributionservice.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FseDistributionServiceApplication_main_20520107151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term580645;

    public FseDistributionServiceApplication_main_20520107151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term580645 = (Object[]) newArray("java.lang.String", 7);
        setElement(term580645, 0, "PJgWnydUjb");
        setElement(term580645, 1, "JLLHHjJqxd");
        setElement(term580645, 2, "xLCbBvSbQG");
        setElement(term580645, 3, "ydVPRdqSbz");
        setElement(term580645, 4, "YyjhpSwPgx");
        setElement(term580645, 5, "qqGFEzKRQJ");
        setElement(term580645, 6, "EnqmBVdibE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.FseDistributionServiceApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term580645;
        callMethod(klass, "main", argTypes, null, args);
    }

};


