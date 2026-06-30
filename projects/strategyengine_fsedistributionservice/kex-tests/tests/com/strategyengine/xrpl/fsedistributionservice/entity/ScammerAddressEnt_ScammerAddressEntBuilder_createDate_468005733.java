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

public class ScammerAddressEnt_ScammerAddressEntBuilder_createDate_468005733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236115;
     Object term236146;

    public ScammerAddressEnt_ScammerAddressEntBuilder_createDate_468005733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term236116 = new Long(3968143267572761057L);
        term236115 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt$ScammerAddressEntBuilder"));
        Object term236130 = newInstance(Class.forName("java.util.Date"));
        Object term236132 = newInstance(Class.forName("java.util.Date"));
        setField(term236115, term236115.getClass(), "id", term236116);
        setField(term236115, term236115.getClass(), "address", "VDnsNuhEvG");
        setLongField(term236130, term236130.getClass(), "fastTime", 1618617624489L);
        setField(term236130, term236130.getClass(), "cdate", null);
        setField(term236115, term236115.getClass(), "createDate", term236130);
        setLongField(term236132, term236132.getClass(), "fastTime", 1420614441250L);
        setField(term236132, term236132.getClass(), "cdate", null);
        setField(term236115, term236115.getClass(), "updateDate", term236132);
        setField(term236115, term236115.getClass(), "type", "DMrfMwXyYT");
        term236146 = newInstance(Class.forName("java.util.Date"));
        setLongField(term236146, term236146.getClass(), "fastTime", 1651825803504L);
        setField(term236146, term236146.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt$ScammerAddressEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term236146;
        callMethod(klass, "createDate", argTypes, term236115, args);
    }

};


