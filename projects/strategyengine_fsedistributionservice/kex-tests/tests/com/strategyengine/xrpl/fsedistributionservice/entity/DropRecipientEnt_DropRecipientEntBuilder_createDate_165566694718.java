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

public class DropRecipientEnt_DropRecipientEntBuilder_createDate_165566694718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48559;

    public DropRecipientEnt_DropRecipientEntBuilder_createDate_165566694718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48559 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder"));
        setField(term48559, term48559.getClass(), "id", null);
        setField(term48559, term48559.getClass(), "address", null);
        setField(term48559, term48559.getClass(), "createDate", null);
        setField(term48559, term48559.getClass(), "updateDate", null);
        setField(term48559, term48559.getClass(), "status", null);
        setField(term48559, term48559.getClass(), "failReason", null);
        setField(term48559, term48559.getClass(), "code", null);
        setField(term48559, term48559.getClass(), "retryAttempt", null);
        setField(term48559, term48559.getClass(), "dropRequestId", null);
        setField(term48559, term48559.getClass(), "snapshotBalance", null);
        setField(term48559, term48559.getClass(), "payAmount", null);
        setField(term48559, term48559.getClass(), "ownedNftId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createDate", argTypes, term48559, args);
    }

};


