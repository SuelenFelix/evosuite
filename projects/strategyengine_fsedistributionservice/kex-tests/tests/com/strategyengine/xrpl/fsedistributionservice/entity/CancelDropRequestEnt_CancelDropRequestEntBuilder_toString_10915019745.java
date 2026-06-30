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

public class CancelDropRequestEnt_CancelDropRequestEntBuilder_toString_10915019745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241830;

    public CancelDropRequestEnt_CancelDropRequestEntBuilder_toString_10915019745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term241831 = new Long(-4033544645261759750L);
        Long term241835 = new Long(593230449611047187L);
        term241830 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.CancelDropRequestEnt$CancelDropRequestEntBuilder"));
        Object term241833 = newInstance(Class.forName("java.util.Date"));
        setField(term241830, term241830.getClass(), "id", term241831);
        setLongField(term241833, term241833.getClass(), "fastTime", 1517221458723L);
        setField(term241833, term241833.getClass(), "cdate", null);
        setField(term241830, term241830.getClass(), "createDate", term241833);
        setField(term241830, term241830.getClass(), "dropRequestId", term241835);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.CancelDropRequestEnt$CancelDropRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term241830, args);
    }

};


