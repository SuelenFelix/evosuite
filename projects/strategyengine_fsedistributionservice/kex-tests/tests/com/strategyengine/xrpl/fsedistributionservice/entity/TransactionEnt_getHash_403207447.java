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

public class TransactionEnt_getHash_403207447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2228;

    public TransactionEnt_getHash_403207447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2229 = new Long(682356318767179819L);
        Long term2269 = new Long(-7291743527973326814L);
        Long term2271 = new Long(-5963439350418910964L);
        term2228 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt"));
        Object term2243 = newInstance(Class.forName("java.util.Date"));
        setField(term2228, term2228.getClass(), "id", term2229);
        setField(term2228, term2228.getClass(), "hash", "jDtqGUpnZN");
        setLongField(term2243, term2243.getClass(), "fastTime", 1334853104718L);
        setField(term2243, term2243.getClass(), "cdate", null);
        setField(term2228, term2228.getClass(), "createDate", term2243);
        setField(term2228, term2228.getClass(), "failReason", "nGKItKLYNC");
        setField(term2228, term2228.getClass(), "code", "UiUYnPrcCi");
        setField(term2228, term2228.getClass(), "dropRecipientId", term2269);
        setField(term2228, term2228.getClass(), "dropRequestId", term2271);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHash", argTypes, term2228, args);
    }

};


