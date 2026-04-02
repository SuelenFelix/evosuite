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

public class ScammerAddressEnt_ScammerAddressEntBuilder_updateDate_18657384424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236168;
     Object term236199;

    public ScammerAddressEnt_ScammerAddressEntBuilder_updateDate_18657384424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term236169 = new Long(2712394591642260550L);
        term236168 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt$ScammerAddressEntBuilder"));
        Object term236183 = newInstance(Class.forName("java.util.Date"));
        Object term236185 = newInstance(Class.forName("java.util.Date"));
        setField(term236168, term236168.getClass(), "id", term236169);
        setField(term236168, term236168.getClass(), "address", "GAzZvzjuXP");
        setLongField(term236183, term236183.getClass(), "fastTime", 1706800444594L);
        setField(term236183, term236183.getClass(), "cdate", null);
        setField(term236168, term236168.getClass(), "createDate", term236183);
        setLongField(term236185, term236185.getClass(), "fastTime", 1828808168025L);
        setField(term236185, term236185.getClass(), "cdate", null);
        setField(term236168, term236168.getClass(), "updateDate", term236185);
        setField(term236168, term236168.getClass(), "type", "WoFrMqAUlT");
        term236199 = newInstance(Class.forName("java.util.Date"));
        setLongField(term236199, term236199.getClass(), "fastTime", 1453661949747L);
        setField(term236199, term236199.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt$ScammerAddressEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term236199;
        callMethod(klass, "updateDate", argTypes, term236168, args);
    }

};


