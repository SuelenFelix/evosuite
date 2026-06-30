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

public class TransactionEnt_getCreateDate_1384032358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2303;

    public TransactionEnt_getCreateDate_1384032358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2304 = new Long(9013624480170062917L);
        Long term2344 = new Long(7862575738391801707L);
        Long term2346 = new Long(50358265865610362L);
        term2303 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt"));
        Object term2318 = newInstance(Class.forName("java.util.Date"));
        setField(term2303, term2303.getClass(), "id", term2304);
        setField(term2303, term2303.getClass(), "hash", "UoYtihxVaS");
        setLongField(term2318, term2318.getClass(), "fastTime", 1496859828764L);
        setField(term2318, term2318.getClass(), "cdate", null);
        setField(term2303, term2303.getClass(), "createDate", term2318);
        setField(term2303, term2303.getClass(), "failReason", "JDswTTCZHV");
        setField(term2303, term2303.getClass(), "code", "onpbIeEKoi");
        setField(term2303, term2303.getClass(), "dropRecipientId", term2344);
        setField(term2303, term2303.getClass(), "dropRequestId", term2346);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreateDate", argTypes, term2303, args);
    }

};


