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

public class DropRecipientEnt_getId_59384284438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40309;

    public DropRecipientEnt_getId_59384284438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40309 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        setField(term40309, term40309.getClass(), "id", null);
        setField(term40309, term40309.getClass(), "address", null);
        setField(term40309, term40309.getClass(), "createDate", null);
        setField(term40309, term40309.getClass(), "updateDate", null);
        setField(term40309, term40309.getClass(), "status", null);
        setField(term40309, term40309.getClass(), "failReason", null);
        setField(term40309, term40309.getClass(), "code", null);
        setField(term40309, term40309.getClass(), "retryAttempt", null);
        setField(term40309, term40309.getClass(), "dropRequestId", null);
        setField(term40309, term40309.getClass(), "snapshotBalance", null);
        setField(term40309, term40309.getClass(), "payAmount", null);
        setField(term40309, term40309.getClass(), "ownedNftId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term40309, args);
    }

};


