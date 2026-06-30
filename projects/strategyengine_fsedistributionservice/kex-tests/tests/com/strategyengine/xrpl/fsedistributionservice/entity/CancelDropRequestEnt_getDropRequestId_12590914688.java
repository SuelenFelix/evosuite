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

public class CancelDropRequestEnt_getDropRequestId_12590914688 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52;

    public CancelDropRequestEnt_getDropRequestId_12590914688() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term53 = new Long(-5476826692763582090L);
        Long term57 = new Long(-872011222785455006L);
        term52 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.CancelDropRequestEnt"));
        Object term55 = newInstance(Class.forName("java.util.Date"));
        setField(term52, term52.getClass(), "id", term53);
        setLongField(term55, term55.getClass(), "fastTime", 1495357463288L);
        setField(term55, term55.getClass(), "cdate", null);
        setField(term52, term52.getClass(), "createDate", term55);
        setField(term52, term52.getClass(), "dropRequestId", term57);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.CancelDropRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDropRequestId", argTypes, term52, args);
    }

};


