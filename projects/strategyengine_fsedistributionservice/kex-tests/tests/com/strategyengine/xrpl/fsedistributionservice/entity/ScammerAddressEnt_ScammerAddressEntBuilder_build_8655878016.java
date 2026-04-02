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

public class ScammerAddressEnt_ScammerAddressEntBuilder_build_8655878016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236294;

    public ScammerAddressEnt_ScammerAddressEntBuilder_build_8655878016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term236295 = new Long(-8172564209423941839L);
        term236294 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt$ScammerAddressEntBuilder"));
        Object term236309 = newInstance(Class.forName("java.util.Date"));
        Object term236311 = newInstance(Class.forName("java.util.Date"));
        setField(term236294, term236294.getClass(), "id", term236295);
        setField(term236294, term236294.getClass(), "address", "zItHVuBBzy");
        setLongField(term236309, term236309.getClass(), "fastTime", 1888010631363L);
        setField(term236309, term236309.getClass(), "cdate", null);
        setField(term236294, term236294.getClass(), "createDate", term236309);
        setLongField(term236311, term236311.getClass(), "fastTime", 1575752725415L);
        setField(term236311, term236311.getClass(), "cdate", null);
        setField(term236294, term236294.getClass(), "updateDate", term236311);
        setField(term236294, term236294.getClass(), "type", "pQcdIREjlp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt$ScammerAddressEntBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term236294, args);
    }

};


