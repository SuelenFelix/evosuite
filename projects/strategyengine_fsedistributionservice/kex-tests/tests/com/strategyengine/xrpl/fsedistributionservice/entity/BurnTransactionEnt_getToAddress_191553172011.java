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

public class BurnTransactionEnt_getToAddress_191553172011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234708;

    public BurnTransactionEnt_getToAddress_191553172011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term234709 = new Long(4947643967691976731L);
        Long term234723 = new Long(4548576710115075073L);
        term234708 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt"));
        Object term234725 = newInstance(Class.forName("java.util.Date"));
        Object term234727 = newInstance(Class.forName("java.util.Date"));
        setField(term234708, term234708.getClass(), "id", term234709);
        setField(term234708, term234708.getClass(), "transactionHash", "kXJaxapFer");
        setField(term234708, term234708.getClass(), "ledgerIndex", term234723);
        setLongField(term234725, term234725.getClass(), "fastTime", 1751923285063L);
        setField(term234725, term234725.getClass(), "cdate", null);
        setField(term234708, term234708.getClass(), "createDate", term234725);
        setLongField(term234727, term234727.getClass(), "fastTime", 1480645242306L);
        setField(term234727, term234727.getClass(), "cdate", null);
        setField(term234708, term234708.getClass(), "txDate", term234727);
        setField(term234708, term234708.getClass(), "toAddress", "OEeAVwVwuj");
        setField(term234708, term234708.getClass(), "fromAddress", "WEgFuDZsxi");
        setField(term234708, term234708.getClass(), "amount", "kvcaSGNTHd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getToAddress", argTypes, term234708, args);
    }

};


