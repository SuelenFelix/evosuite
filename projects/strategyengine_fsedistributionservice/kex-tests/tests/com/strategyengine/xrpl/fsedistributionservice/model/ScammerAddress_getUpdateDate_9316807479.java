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

public class ScammerAddress_getUpdateDate_9316807479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term567227;

    public ScammerAddress_getUpdateDate_9316807479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term567228 = new Long(-8015150842907349869L);
        term567227 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress"));
        Object term567242 = newInstance(Class.forName("java.util.Date"));
        Object term567244 = newInstance(Class.forName("java.util.Date"));
        setField(term567227, term567227.getClass(), "id", term567228);
        setField(term567227, term567227.getClass(), "account", "mNIKTByuKp");
        setLongField(term567242, term567242.getClass(), "fastTime", 1420847220125L);
        setField(term567242, term567242.getClass(), "cdate", null);
        setField(term567227, term567227.getClass(), "createDate", term567242);
        setLongField(term567244, term567244.getClass(), "fastTime", 1623719972237L);
        setField(term567244, term567244.getClass(), "cdate", null);
        setField(term567227, term567227.getClass(), "updateDate", term567244);
        setField(term567227, term567227.getClass(), "type", "YFhbGDashN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdateDate", argTypes, term567227, args);
    }

};


