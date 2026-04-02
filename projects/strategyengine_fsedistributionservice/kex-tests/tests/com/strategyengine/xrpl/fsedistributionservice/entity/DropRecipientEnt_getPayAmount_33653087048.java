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

public class DropRecipientEnt_getPayAmount_33653087048 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40319;

    public DropRecipientEnt_getPayAmount_33653087048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40319 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        setField(term40319, term40319.getClass(), "id", null);
        setField(term40319, term40319.getClass(), "address", null);
        setField(term40319, term40319.getClass(), "createDate", null);
        setField(term40319, term40319.getClass(), "updateDate", null);
        setField(term40319, term40319.getClass(), "status", null);
        setField(term40319, term40319.getClass(), "failReason", null);
        setField(term40319, term40319.getClass(), "code", null);
        setField(term40319, term40319.getClass(), "retryAttempt", null);
        setField(term40319, term40319.getClass(), "dropRequestId", null);
        setField(term40319, term40319.getClass(), "snapshotBalance", null);
        setField(term40319, term40319.getClass(), "payAmount", null);
        setField(term40319, term40319.getClass(), "ownedNftId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPayAmount", argTypes, term40319, args);
    }

};


