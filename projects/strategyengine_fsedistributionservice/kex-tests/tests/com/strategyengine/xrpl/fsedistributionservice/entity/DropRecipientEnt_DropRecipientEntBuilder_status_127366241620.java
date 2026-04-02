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

public class DropRecipientEnt_DropRecipientEntBuilder_status_127366241620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48561;

    public DropRecipientEnt_DropRecipientEntBuilder_status_127366241620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48561 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder"));
        setField(term48561, term48561.getClass(), "id", null);
        setField(term48561, term48561.getClass(), "address", null);
        setField(term48561, term48561.getClass(), "createDate", null);
        setField(term48561, term48561.getClass(), "updateDate", null);
        setField(term48561, term48561.getClass(), "status", null);
        setField(term48561, term48561.getClass(), "failReason", null);
        setField(term48561, term48561.getClass(), "code", null);
        setField(term48561, term48561.getClass(), "retryAttempt", null);
        setField(term48561, term48561.getClass(), "dropRequestId", null);
        setField(term48561, term48561.getClass(), "snapshotBalance", null);
        setField(term48561, term48561.getClass(), "payAmount", null);
        setField(term48561, term48561.getClass(), "ownedNftId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "status", argTypes, term48561, args);
    }

};


