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

public class DropRecipientEnt_DropRecipientEntBuilder_ownedNftId_139002049827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48568;

    public DropRecipientEnt_DropRecipientEntBuilder_ownedNftId_139002049827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48568 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder"));
        setField(term48568, term48568.getClass(), "id", null);
        setField(term48568, term48568.getClass(), "address", null);
        setField(term48568, term48568.getClass(), "createDate", null);
        setField(term48568, term48568.getClass(), "updateDate", null);
        setField(term48568, term48568.getClass(), "status", null);
        setField(term48568, term48568.getClass(), "failReason", null);
        setField(term48568, term48568.getClass(), "code", null);
        setField(term48568, term48568.getClass(), "retryAttempt", null);
        setField(term48568, term48568.getClass(), "dropRequestId", null);
        setField(term48568, term48568.getClass(), "snapshotBalance", null);
        setField(term48568, term48568.getClass(), "payAmount", null);
        setField(term48568, term48568.getClass(), "ownedNftId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "ownedNftId", argTypes, term48568, args);
    }

};


