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

public class ScammerAddressEnt_getAddress_18783347047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239199;

    public ScammerAddressEnt_getAddress_18783347047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term239200 = new Long(7269420277013840543L);
        term239199 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt"));
        Object term239214 = newInstance(Class.forName("java.util.Date"));
        Object term239216 = newInstance(Class.forName("java.util.Date"));
        setField(term239199, term239199.getClass(), "id", term239200);
        setField(term239199, term239199.getClass(), "address", "otcpSHwkzG");
        setLongField(term239214, term239214.getClass(), "fastTime", 1279201774193L);
        setField(term239214, term239214.getClass(), "cdate", null);
        setField(term239199, term239199.getClass(), "createDate", term239214);
        setLongField(term239216, term239216.getClass(), "fastTime", 1559974899830L);
        setField(term239216, term239216.getClass(), "cdate", null);
        setField(term239199, term239199.getClass(), "updateDate", term239216);
        setField(term239199, term239199.getClass(), "type", "BixZhUjVme");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAddress", argTypes, term239199, args);
    }

};


