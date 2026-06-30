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

public class ScammerAddress_ScammerAddressBuilder_updateDate_16500258464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term606181;
     Object term606212;

    public ScammerAddress_ScammerAddressBuilder_updateDate_16500258464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term606182 = new Long(1779727837594554817L);
        term606181 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress$ScammerAddressBuilder"));
        Object term606196 = newInstance(Class.forName("java.util.Date"));
        Object term606198 = newInstance(Class.forName("java.util.Date"));
        setField(term606181, term606181.getClass(), "id", term606182);
        setField(term606181, term606181.getClass(), "account", "ZRaaeHguys");
        setLongField(term606196, term606196.getClass(), "fastTime", 1594326107211L);
        setField(term606196, term606196.getClass(), "cdate", null);
        setField(term606181, term606181.getClass(), "createDate", term606196);
        setLongField(term606198, term606198.getClass(), "fastTime", 1386425573031L);
        setField(term606198, term606198.getClass(), "cdate", null);
        setField(term606181, term606181.getClass(), "updateDate", term606198);
        setField(term606181, term606181.getClass(), "type", "JyyGlEhItv");
        term606212 = newInstance(Class.forName("java.util.Date"));
        setLongField(term606212, term606212.getClass(), "fastTime", 1609904519067L);
        setField(term606212, term606212.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress$ScammerAddressBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term606212;
        callMethod(klass, "updateDate", argTypes, term606181, args);
    }

};


