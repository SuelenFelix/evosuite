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

public class DropRecipientEnt_setPayAmount_17377343062 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40331;

    public DropRecipientEnt_setPayAmount_17377343062() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40331 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        setField(term40331, term40331.getClass(), "id", null);
        setField(term40331, term40331.getClass(), "address", null);
        setField(term40331, term40331.getClass(), "createDate", null);
        setField(term40331, term40331.getClass(), "updateDate", null);
        setField(term40331, term40331.getClass(), "status", null);
        setField(term40331, term40331.getClass(), "failReason", null);
        setField(term40331, term40331.getClass(), "code", null);
        setField(term40331, term40331.getClass(), "retryAttempt", null);
        setField(term40331, term40331.getClass(), "dropRequestId", null);
        setField(term40331, term40331.getClass(), "snapshotBalance", null);
        setField(term40331, term40331.getClass(), "payAmount", null);
        setField(term40331, term40331.getClass(), "ownedNftId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPayAmount", argTypes, term40331, args);
    }

};


