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

public class BurnTransactionEnt_setLedgerIndex_213196712318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235313;
     Object term235370;

    public BurnTransactionEnt_setLedgerIndex_213196712318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term235314 = new Long(-1325109462577461208L);
        Long term235328 = new Long(-7181112149072926893L);
        term235313 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt"));
        Object term235330 = newInstance(Class.forName("java.util.Date"));
        Object term235332 = newInstance(Class.forName("java.util.Date"));
        setField(term235313, term235313.getClass(), "id", term235314);
        setField(term235313, term235313.getClass(), "transactionHash", "PhtNZAacut");
        setField(term235313, term235313.getClass(), "ledgerIndex", term235328);
        setLongField(term235330, term235330.getClass(), "fastTime", 1860782974131L);
        setField(term235330, term235330.getClass(), "cdate", null);
        setField(term235313, term235313.getClass(), "createDate", term235330);
        setLongField(term235332, term235332.getClass(), "fastTime", 1890078921064L);
        setField(term235332, term235332.getClass(), "cdate", null);
        setField(term235313, term235313.getClass(), "txDate", term235332);
        setField(term235313, term235313.getClass(), "toAddress", "xbPAqsSBBS");
        setField(term235313, term235313.getClass(), "fromAddress", "ivxMfASKCB");
        setField(term235313, term235313.getClass(), "amount", "JbksMMXXzT");
        term235370 = new Long(-5850316381591949820L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term235370;
        callMethod(klass, "setLedgerIndex", argTypes, term235313, args);
    }

};


