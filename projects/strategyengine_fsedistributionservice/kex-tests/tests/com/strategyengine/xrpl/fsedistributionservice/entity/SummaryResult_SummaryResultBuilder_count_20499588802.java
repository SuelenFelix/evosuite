package com.strategyengine.xrpl.fsedistributionservice.entity;

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
import static com.strategyengine.xrpl.fsedistributionservice.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class SummaryResult_SummaryResultBuilder_count_20499588802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236410;
     Object term236415;

    public SummaryResult_SummaryResultBuilder_count_20499588802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term236411 = new Long(3288572082902580031L);
        Long term236413 = new Long(-8698230272673009418L);
        term236410 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.SummaryResult$SummaryResultBuilder"));
        setField(term236410, term236410.getClass(), "id", term236411);
        setField(term236410, term236410.getClass(), "count", term236413);
        term236415 = new Long(-8792567429538693571L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.SummaryResult$SummaryResultBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term236415;
        callMethod(klass, "count", argTypes, term236410, args);
    }

};


