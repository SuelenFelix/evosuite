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

public class CancelDropRequestEnt_CancelDropRequestEntBuilder_dropRequestId_3662330043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241814;
     Object term241821;

    public CancelDropRequestEnt_CancelDropRequestEntBuilder_dropRequestId_3662330043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term241815 = new Long(6371581018571997173L);
        Long term241819 = new Long(6604328992663797314L);
        term241814 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.CancelDropRequestEnt$CancelDropRequestEntBuilder"));
        Object term241817 = newInstance(Class.forName("java.util.Date"));
        setField(term241814, term241814.getClass(), "id", term241815);
        setLongField(term241817, term241817.getClass(), "fastTime", 1429040909981L);
        setField(term241817, term241817.getClass(), "cdate", null);
        setField(term241814, term241814.getClass(), "createDate", term241817);
        setField(term241814, term241814.getClass(), "dropRequestId", term241819);
        term241821 = new Long(-5133307284441518726L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.CancelDropRequestEnt$CancelDropRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term241821;
        callMethod(klass, "dropRequestId", argTypes, term241814, args);
    }

};


