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

public class DropRecipientEnt_DropRecipientEntBuilder_id_100141442016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48557;

    public DropRecipientEnt_DropRecipientEntBuilder_id_100141442016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48557 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder"));
        setField(term48557, term48557.getClass(), "id", null);
        setField(term48557, term48557.getClass(), "address", null);
        setField(term48557, term48557.getClass(), "createDate", null);
        setField(term48557, term48557.getClass(), "updateDate", null);
        setField(term48557, term48557.getClass(), "status", null);
        setField(term48557, term48557.getClass(), "failReason", null);
        setField(term48557, term48557.getClass(), "code", null);
        setField(term48557, term48557.getClass(), "retryAttempt", null);
        setField(term48557, term48557.getClass(), "dropRequestId", null);
        setField(term48557, term48557.getClass(), "snapshotBalance", null);
        setField(term48557, term48557.getClass(), "payAmount", null);
        setField(term48557, term48557.getClass(), "ownedNftId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt$DropRecipientEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "id", argTypes, term48557, args);
    }

};


