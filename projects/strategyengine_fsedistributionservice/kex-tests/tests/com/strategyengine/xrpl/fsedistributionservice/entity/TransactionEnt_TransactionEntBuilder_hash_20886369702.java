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
import java.lang.Long;
import java.lang.Object;

public class TransactionEnt_TransactionEntBuilder_hash_20886369702 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1095;

    public TransactionEnt_TransactionEntBuilder_hash_20886369702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1096 = new Long(6855071767938501807L);
        Long term1136 = new Long(-5892135042702373494L);
        Long term1138 = new Long(5262507301787091109L);
        term1095 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt$TransactionEntBuilder"));
        Object term1110 = newInstance(Class.forName("java.util.Date"));
        setField(term1095, term1095.getClass(), "id", term1096);
        setField(term1095, term1095.getClass(), "hash", "jJCZpVmanW");
        setLongField(term1110, term1110.getClass(), "fastTime", 1706078172457L);
        setField(term1110, term1110.getClass(), "cdate", null);
        setField(term1095, term1095.getClass(), "createDate", term1110);
        setField(term1095, term1095.getClass(), "failReason", "EGtDIRbSSb");
        setField(term1095, term1095.getClass(), "code", "SzjVpOQTyS");
        setField(term1095, term1095.getClass(), "dropRecipientId", term1136);
        setField(term1095, term1095.getClass(), "dropRequestId", term1138);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.TransactionEnt$TransactionEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MjGYSRKTNF";
        callMethod(klass, "hash", argTypes, term1095, args);
    }

};


