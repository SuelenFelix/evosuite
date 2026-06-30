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

public class BurnTransactionEnt_toString_2166477595 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234126;

    public BurnTransactionEnt_toString_2166477595() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term234127 = new Long(-7006877527579112761L);
        Long term234141 = new Long(-8699693633047465617L);
        term234126 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt"));
        Object term234143 = newInstance(Class.forName("java.util.Date"));
        Object term234145 = newInstance(Class.forName("java.util.Date"));
        setField(term234126, term234126.getClass(), "id", term234127);
        setField(term234126, term234126.getClass(), "transactionHash", "XfzbAdTaCO");
        setField(term234126, term234126.getClass(), "ledgerIndex", term234141);
        setLongField(term234143, term234143.getClass(), "fastTime", 1435004347844L);
        setField(term234143, term234143.getClass(), "cdate", null);
        setField(term234126, term234126.getClass(), "createDate", term234143);
        setLongField(term234145, term234145.getClass(), "fastTime", 1491384418542L);
        setField(term234145, term234145.getClass(), "cdate", null);
        setField(term234126, term234126.getClass(), "txDate", term234145);
        setField(term234126, term234126.getClass(), "toAddress", "rDcGfVDmsE");
        setField(term234126, term234126.getClass(), "fromAddress", "agspBqCjgG");
        setField(term234126, term234126.getClass(), "amount", "HMJaeNiTNW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term234126, args);
    }

};


