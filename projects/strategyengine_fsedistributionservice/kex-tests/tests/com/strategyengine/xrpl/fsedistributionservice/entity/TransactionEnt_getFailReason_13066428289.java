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

public class TransactionEnt_getFailReason_13066428289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2378;

    public TransactionEnt_getFailReason_13066428289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term2379 = new Long(5510783420697225605L);
        Long term2419 = new Long(6005241913654469005L);
        Long term2421 = new Long(-1983291584002806658L);
        term2378 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt"));
        Object term2393 = newInstance(Class.forName("java.util.Date"));
        setField(term2378, term2378.getClass(), "id", term2379);
        setField(term2378, term2378.getClass(), "hash", "YRHGsAkhxb");
        setLongField(term2393, term2393.getClass(), "fastTime", 1691868468367L);
        setField(term2393, term2393.getClass(), "cdate", null);
        setField(term2378, term2378.getClass(), "createDate", term2393);
        setField(term2378, term2378.getClass(), "failReason", "ffYhPOzlUs");
        setField(term2378, term2378.getClass(), "code", "MLqYREekMl");
        setField(term2378, term2378.getClass(), "dropRecipientId", term2419);
        setField(term2378, term2378.getClass(), "dropRequestId", term2421);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFailReason", argTypes, term2378, args);
    }

};


