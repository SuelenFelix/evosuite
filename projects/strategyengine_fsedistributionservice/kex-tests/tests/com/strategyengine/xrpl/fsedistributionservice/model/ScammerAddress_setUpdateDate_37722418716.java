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

public class ScammerAddress_setUpdateDate_37722418716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term567558;
     Object term567589;

    public ScammerAddress_setUpdateDate_37722418716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term567559 = new Long(-2622219131724744003L);
        term567558 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress"));
        Object term567573 = newInstance(Class.forName("java.util.Date"));
        Object term567575 = newInstance(Class.forName("java.util.Date"));
        setField(term567558, term567558.getClass(), "id", term567559);
        setField(term567558, term567558.getClass(), "account", "bScsAMGfKs");
        setLongField(term567573, term567573.getClass(), "fastTime", 1379171463933L);
        setField(term567573, term567573.getClass(), "cdate", null);
        setField(term567558, term567558.getClass(), "createDate", term567573);
        setLongField(term567575, term567575.getClass(), "fastTime", 1394153798976L);
        setField(term567575, term567575.getClass(), "cdate", null);
        setField(term567558, term567558.getClass(), "updateDate", term567575);
        setField(term567558, term567558.getClass(), "type", "GSFfACqjye");
        term567589 = newInstance(Class.forName("java.util.Date"));
        setLongField(term567589, term567589.getClass(), "fastTime", 1573860100671L);
        setField(term567589, term567589.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term567589;
        callMethod(klass, "setUpdateDate", argTypes, term567558, args);
    }

};


