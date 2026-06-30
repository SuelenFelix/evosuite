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

public class ScammerAddress_ScammerAddressBuilder_toString_14626341867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term606358;

    public ScammerAddress_ScammerAddressBuilder_toString_14626341867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term606359 = new Long(4606742231634944447L);
        term606358 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress$ScammerAddressBuilder"));
        Object term606373 = newInstance(Class.forName("java.util.Date"));
        Object term606375 = newInstance(Class.forName("java.util.Date"));
        setField(term606358, term606358.getClass(), "id", term606359);
        setField(term606358, term606358.getClass(), "account", "uhIWNRNIgh");
        setLongField(term606373, term606373.getClass(), "fastTime", 1335614411591L);
        setField(term606373, term606373.getClass(), "cdate", null);
        setField(term606358, term606358.getClass(), "createDate", term606373);
        setLongField(term606375, term606375.getClass(), "fastTime", 1761341359702L);
        setField(term606375, term606375.getClass(), "cdate", null);
        setField(term606358, term606358.getClass(), "updateDate", term606375);
        setField(term606358, term606358.getClass(), "type", "wFXoQDJRmN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress$ScammerAddressBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term606358, args);
    }

};


