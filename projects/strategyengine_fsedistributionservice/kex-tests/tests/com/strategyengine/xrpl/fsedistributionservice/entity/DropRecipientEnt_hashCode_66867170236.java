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

public class DropRecipientEnt_hashCode_66867170236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40307;

    public DropRecipientEnt_hashCode_66867170236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40307 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        setField(term40307, term40307.getClass(), "id", null);
        setField(term40307, term40307.getClass(), "address", null);
        setField(term40307, term40307.getClass(), "createDate", null);
        setField(term40307, term40307.getClass(), "updateDate", null);
        setField(term40307, term40307.getClass(), "status", null);
        setField(term40307, term40307.getClass(), "failReason", null);
        setField(term40307, term40307.getClass(), "code", null);
        setField(term40307, term40307.getClass(), "retryAttempt", null);
        setField(term40307, term40307.getClass(), "dropRequestId", null);
        setField(term40307, term40307.getClass(), "snapshotBalance", null);
        setField(term40307, term40307.getClass(), "payAmount", null);
        setField(term40307, term40307.getClass(), "ownedNftId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term40307, args);
    }

};


