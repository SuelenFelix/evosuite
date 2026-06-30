package com.strategyengine.xrpl.fsedistributionservice.model;

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
import static com.strategyengine.xrpl.fsedistributionservice.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class ScammerAddress_getAccount_6657929067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term567125;

    public ScammerAddress_getAccount_6657929067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term567126 = new Long(-3551818295265883412L);
        term567125 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress"));
        Object term567140 = newInstance(Class.forName("java.util.Date"));
        Object term567142 = newInstance(Class.forName("java.util.Date"));
        setField(term567125, term567125.getClass(), "id", term567126);
        setField(term567125, term567125.getClass(), "account", "iIbCprkKgM");
        setLongField(term567140, term567140.getClass(), "fastTime", 1504160441580L);
        setField(term567140, term567140.getClass(), "cdate", null);
        setField(term567125, term567125.getClass(), "createDate", term567140);
        setLongField(term567142, term567142.getClass(), "fastTime", 1532580830546L);
        setField(term567142, term567142.getClass(), "cdate", null);
        setField(term567125, term567125.getClass(), "updateDate", term567142);
        setField(term567125, term567125.getClass(), "type", "KZwBpKcAut");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccount", argTypes, term567125, args);
    }

};


