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
import java.lang.Object;

public class ScammerAddressEnt_equals_88863732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238942;
     Object term238973;

    public ScammerAddressEnt_equals_88863732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term238943 = new Long(-7755863896540616668L);
        term238942 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt"));
        Object term238957 = newInstance(Class.forName("java.util.Date"));
        Object term238959 = newInstance(Class.forName("java.util.Date"));
        setField(term238942, term238942.getClass(), "id", term238943);
        setField(term238942, term238942.getClass(), "address", "urBahuOkUQ");
        setLongField(term238957, term238957.getClass(), "fastTime", 1269310825004L);
        setField(term238957, term238957.getClass(), "cdate", null);
        setField(term238942, term238942.getClass(), "createDate", term238957);
        setLongField(term238959, term238959.getClass(), "fastTime", 1755607502378L);
        setField(term238959, term238959.getClass(), "cdate", null);
        setField(term238942, term238942.getClass(), "updateDate", term238959);
        setField(term238942, term238942.getClass(), "type", "zHcZrTMdOT");
        term238973 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term238973;
        callMethod(klass, "equals", argTypes, term238942, args);
    }

};


