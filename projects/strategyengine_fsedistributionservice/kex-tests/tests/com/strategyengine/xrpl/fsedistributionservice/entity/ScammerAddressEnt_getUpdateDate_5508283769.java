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

public class ScammerAddressEnt_getUpdateDate_5508283769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239301;

    public ScammerAddressEnt_getUpdateDate_5508283769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term239302 = new Long(5305896099727663023L);
        term239301 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt"));
        Object term239316 = newInstance(Class.forName("java.util.Date"));
        Object term239318 = newInstance(Class.forName("java.util.Date"));
        setField(term239301, term239301.getClass(), "id", term239302);
        setField(term239301, term239301.getClass(), "address", "xVwossmLda");
        setLongField(term239316, term239316.getClass(), "fastTime", 1450460188372L);
        setField(term239316, term239316.getClass(), "cdate", null);
        setField(term239301, term239301.getClass(), "createDate", term239316);
        setLongField(term239318, term239318.getClass(), "fastTime", 1659474760176L);
        setField(term239318, term239318.getClass(), "cdate", null);
        setField(term239301, term239301.getClass(), "updateDate", term239318);
        setField(term239301, term239301.getClass(), "type", "EvSQeALexj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdateDate", argTypes, term239301, args);
    }

};


