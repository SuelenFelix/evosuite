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

public class BurnTransactionEnt_getId_2192830736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234223;

    public BurnTransactionEnt_getId_2192830736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term234224 = new Long(-590890905395927244L);
        Long term234238 = new Long(6978548804004471804L);
        term234223 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt"));
        Object term234240 = newInstance(Class.forName("java.util.Date"));
        Object term234242 = newInstance(Class.forName("java.util.Date"));
        setField(term234223, term234223.getClass(), "id", term234224);
        setField(term234223, term234223.getClass(), "transactionHash", "ggcJNlLcZb");
        setField(term234223, term234223.getClass(), "ledgerIndex", term234238);
        setLongField(term234240, term234240.getClass(), "fastTime", 1580968581414L);
        setField(term234240, term234240.getClass(), "cdate", null);
        setField(term234223, term234223.getClass(), "createDate", term234240);
        setLongField(term234242, term234242.getClass(), "fastTime", 1380268859738L);
        setField(term234242, term234242.getClass(), "cdate", null);
        setField(term234223, term234223.getClass(), "txDate", term234242);
        setField(term234223, term234223.getClass(), "toAddress", "EzhvjUZCQP");
        setField(term234223, term234223.getClass(), "fromAddress", "FTHebphiPR");
        setField(term234223, term234223.getClass(), "amount", "OQjMPmyJQz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term234223, args);
    }

};


