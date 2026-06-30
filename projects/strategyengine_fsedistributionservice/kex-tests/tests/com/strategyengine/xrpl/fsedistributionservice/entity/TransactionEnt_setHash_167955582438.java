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

public class TransactionEnt_setHash_167955582438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3365;

    public TransactionEnt_setHash_167955582438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3365 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt"));
        setField(term3365, term3365.getClass(), "id", null);
        setField(term3365, term3365.getClass(), "hash", null);
        setField(term3365, term3365.getClass(), "createDate", null);
        setField(term3365, term3365.getClass(), "failReason", null);
        setField(term3365, term3365.getClass(), "code", null);
        setField(term3365, term3365.getClass(), "dropRecipientId", null);
        setField(term3365, term3365.getClass(), "dropRequestId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setHash", argTypes, term3365, args);
    }

};


