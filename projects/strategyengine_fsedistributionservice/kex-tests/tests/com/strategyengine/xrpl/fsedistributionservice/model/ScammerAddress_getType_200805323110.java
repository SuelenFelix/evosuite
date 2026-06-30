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

public class ScammerAddress_getType_200805323110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term567278;

    public ScammerAddress_getType_200805323110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term567279 = new Long(9132190239280924497L);
        term567278 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress"));
        Object term567293 = newInstance(Class.forName("java.util.Date"));
        Object term567295 = newInstance(Class.forName("java.util.Date"));
        setField(term567278, term567278.getClass(), "id", term567279);
        setField(term567278, term567278.getClass(), "account", "bXRtHEJyHj");
        setLongField(term567293, term567293.getClass(), "fastTime", 1382497179218L);
        setField(term567293, term567293.getClass(), "cdate", null);
        setField(term567278, term567278.getClass(), "createDate", term567293);
        setLongField(term567295, term567295.getClass(), "fastTime", 1657618106530L);
        setField(term567295, term567295.getClass(), "cdate", null);
        setField(term567278, term567278.getClass(), "updateDate", term567295);
        setField(term567278, term567278.getClass(), "type", "zNvZiItfOR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term567278, args);
    }

};


