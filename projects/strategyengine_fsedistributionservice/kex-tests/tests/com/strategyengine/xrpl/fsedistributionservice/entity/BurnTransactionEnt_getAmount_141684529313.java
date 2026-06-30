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

public class BurnTransactionEnt_getAmount_141684529313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234902;

    public BurnTransactionEnt_getAmount_141684529313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term234903 = new Long(6462632207326555041L);
        Long term234917 = new Long(-3188913050877092148L);
        term234902 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt"));
        Object term234919 = newInstance(Class.forName("java.util.Date"));
        Object term234921 = newInstance(Class.forName("java.util.Date"));
        setField(term234902, term234902.getClass(), "id", term234903);
        setField(term234902, term234902.getClass(), "transactionHash", "fzHVMNSLii");
        setField(term234902, term234902.getClass(), "ledgerIndex", term234917);
        setLongField(term234919, term234919.getClass(), "fastTime", 1436734067345L);
        setField(term234919, term234919.getClass(), "cdate", null);
        setField(term234902, term234902.getClass(), "createDate", term234919);
        setLongField(term234921, term234921.getClass(), "fastTime", 1576848173088L);
        setField(term234921, term234921.getClass(), "cdate", null);
        setField(term234902, term234902.getClass(), "txDate", term234921);
        setField(term234902, term234902.getClass(), "toAddress", "TxymnVINZF");
        setField(term234902, term234902.getClass(), "fromAddress", "fkBfmixBEh");
        setField(term234902, term234902.getClass(), "amount", "SWbairdDKL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAmount", argTypes, term234902, args);
    }

};


