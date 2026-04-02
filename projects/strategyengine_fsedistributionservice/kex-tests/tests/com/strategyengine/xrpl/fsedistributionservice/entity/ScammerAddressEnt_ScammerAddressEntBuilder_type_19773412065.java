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

public class ScammerAddressEnt_ScammerAddressEntBuilder_type_19773412065 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236221;

    public ScammerAddressEnt_ScammerAddressEntBuilder_type_19773412065() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term236222 = new Long(-1211273460223868511L);
        term236221 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt$ScammerAddressEntBuilder"));
        Object term236236 = newInstance(Class.forName("java.util.Date"));
        Object term236238 = newInstance(Class.forName("java.util.Date"));
        setField(term236221, term236221.getClass(), "id", term236222);
        setField(term236221, term236221.getClass(), "address", "RtHOddPkOW");
        setLongField(term236236, term236236.getClass(), "fastTime", 1805280824945L);
        setField(term236236, term236236.getClass(), "cdate", null);
        setField(term236221, term236221.getClass(), "createDate", term236236);
        setLongField(term236238, term236238.getClass(), "fastTime", 1454416371166L);
        setField(term236238, term236238.getClass(), "cdate", null);
        setField(term236221, term236221.getClass(), "updateDate", term236238);
        setField(term236221, term236221.getClass(), "type", "LAaHVAeRPU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt$ScammerAddressEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BLPwYfxwnm";
        callMethod(klass, "type", argTypes, term236221, args);
    }

};


