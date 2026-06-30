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
import java.lang.String;
import java.lang.Integer;

public class DropRecipientEnt_setAddress_156357097821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33378;

    public DropRecipientEnt_setAddress_156357097821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term33379 = new Long(-2338103433822116635L);
        Class<? extends Object> term33494 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term33493 = ((Class) term33494).getDeclaredField((String) "QUEUED");
        ((Field) term33493).setAccessible(true);
        Object enum65 = ((Field) term33493).get((Object) null);
        Integer term33431 = new Integer(1048535127);
        Long term33433 = new Long(-1885698929232124806L);
        term33378 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term33393 = newInstance(Class.forName("java.util.Date"));
        Object term33395 = newInstance(Class.forName("java.util.Date"));
        setField(term33378, term33378.getClass(), "id", term33379);
        setField(term33378, term33378.getClass(), "address", "aSkmSwTnEw");
        setLongField(term33393, term33393.getClass(), "fastTime", 1476970157231L);
        setField(term33393, term33393.getClass(), "cdate", null);
        setField(term33378, term33378.getClass(), "createDate", term33393);
        setLongField(term33395, term33395.getClass(), "fastTime", 1386180897453L);
        setField(term33395, term33395.getClass(), "cdate", null);
        setField(term33378, term33378.getClass(), "updateDate", term33395);
        setField(term33378, term33378.getClass(), "status", enum65);
        setField(term33378, term33378.getClass(), "failReason", "xvkbvaEGYd");
        setField(term33378, term33378.getClass(), "code", "HBGNxdNURv");
        setField(term33378, term33378.getClass(), "retryAttempt", term33431);
        setField(term33378, term33378.getClass(), "dropRequestId", term33433);
        setField(term33378, term33378.getClass(), "snapshotBalance", "mfCpTPPQQm");
        setField(term33378, term33378.getClass(), "payAmount", "OcJCIDNIXA");
        setField(term33378, term33378.getClass(), "ownedNftId", "XfRABIFVEp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MHGKyEnwKc";
        callMethod(klass, "setAddress", argTypes, term33378, args);
    }

};


