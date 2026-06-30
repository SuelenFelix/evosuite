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

public class BurnTransactionEnt_getFromAddress_10092467912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234805;

    public BurnTransactionEnt_getFromAddress_10092467912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term234806 = new Long(-1486519351300660432L);
        Long term234820 = new Long(4777103307547199454L);
        term234805 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt"));
        Object term234822 = newInstance(Class.forName("java.util.Date"));
        Object term234824 = newInstance(Class.forName("java.util.Date"));
        setField(term234805, term234805.getClass(), "id", term234806);
        setField(term234805, term234805.getClass(), "transactionHash", "opXkGeBDoI");
        setField(term234805, term234805.getClass(), "ledgerIndex", term234820);
        setLongField(term234822, term234822.getClass(), "fastTime", 1524270684608L);
        setField(term234822, term234822.getClass(), "cdate", null);
        setField(term234805, term234805.getClass(), "createDate", term234822);
        setLongField(term234824, term234824.getClass(), "fastTime", 1863611649337L);
        setField(term234824, term234824.getClass(), "cdate", null);
        setField(term234805, term234805.getClass(), "txDate", term234824);
        setField(term234805, term234805.getClass(), "toAddress", "UHxidCtatV");
        setField(term234805, term234805.getClass(), "fromAddress", "LRzADDSjVT");
        setField(term234805, term234805.getClass(), "amount", "lpFCMaAYxj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFromAddress", argTypes, term234805, args);
    }

};


