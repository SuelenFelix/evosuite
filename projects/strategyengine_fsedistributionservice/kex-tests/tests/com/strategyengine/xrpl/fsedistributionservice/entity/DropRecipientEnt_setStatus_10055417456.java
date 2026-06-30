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

public class DropRecipientEnt_setStatus_10055417456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40325;

    public DropRecipientEnt_setStatus_10055417456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40325 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        setField(term40325, term40325.getClass(), "id", null);
        setField(term40325, term40325.getClass(), "address", null);
        setField(term40325, term40325.getClass(), "createDate", null);
        setField(term40325, term40325.getClass(), "updateDate", null);
        setField(term40325, term40325.getClass(), "status", null);
        setField(term40325, term40325.getClass(), "failReason", null);
        setField(term40325, term40325.getClass(), "code", null);
        setField(term40325, term40325.getClass(), "retryAttempt", null);
        setField(term40325, term40325.getClass(), "dropRequestId", null);
        setField(term40325, term40325.getClass(), "snapshotBalance", null);
        setField(term40325, term40325.getClass(), "payAmount", null);
        setField(term40325, term40325.getClass(), "ownedNftId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setStatus", argTypes, term40325, args);
    }

};


