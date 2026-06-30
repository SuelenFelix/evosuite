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

public class ScammerAddress_ScammerAddressBuilder_build_12184102926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term606307;

    public ScammerAddress_ScammerAddressBuilder_build_12184102926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term606308 = new Long(-4609129422862658333L);
        term606307 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress$ScammerAddressBuilder"));
        Object term606322 = newInstance(Class.forName("java.util.Date"));
        Object term606324 = newInstance(Class.forName("java.util.Date"));
        setField(term606307, term606307.getClass(), "id", term606308);
        setField(term606307, term606307.getClass(), "account", "GQZmnRhLyF");
        setLongField(term606322, term606322.getClass(), "fastTime", 1282031768031L);
        setField(term606322, term606322.getClass(), "cdate", null);
        setField(term606307, term606307.getClass(), "createDate", term606322);
        setLongField(term606324, term606324.getClass(), "fastTime", 1279061588140L);
        setField(term606324, term606324.getClass(), "cdate", null);
        setField(term606307, term606307.getClass(), "updateDate", term606324);
        setField(term606307, term606307.getClass(), "type", "CIJyIgGonf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress$ScammerAddressBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term606307, args);
    }

};


