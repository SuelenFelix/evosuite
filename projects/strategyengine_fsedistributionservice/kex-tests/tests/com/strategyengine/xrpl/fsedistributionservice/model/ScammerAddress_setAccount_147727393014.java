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

public class ScammerAddress_setAccount_147727393014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term567432;

    public ScammerAddress_setAccount_147727393014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term567433 = new Long(-1155047331993508760L);
        term567432 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress"));
        Object term567447 = newInstance(Class.forName("java.util.Date"));
        Object term567449 = newInstance(Class.forName("java.util.Date"));
        setField(term567432, term567432.getClass(), "id", term567433);
        setField(term567432, term567432.getClass(), "account", "WqNyoizhju");
        setLongField(term567447, term567447.getClass(), "fastTime", 1451725922050L);
        setField(term567447, term567447.getClass(), "cdate", null);
        setField(term567432, term567432.getClass(), "createDate", term567447);
        setLongField(term567449, term567449.getClass(), "fastTime", 1306542006440L);
        setField(term567449, term567449.getClass(), "cdate", null);
        setField(term567432, term567432.getClass(), "updateDate", term567449);
        setField(term567432, term567432.getClass(), "type", "SyBEMBeZJe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UpFaZAcdPU";
        callMethod(klass, "setAccount", argTypes, term567432, args);
    }

};


