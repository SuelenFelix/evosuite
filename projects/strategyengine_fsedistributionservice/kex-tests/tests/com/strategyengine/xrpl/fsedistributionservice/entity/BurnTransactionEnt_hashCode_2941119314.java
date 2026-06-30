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

public class BurnTransactionEnt_hashCode_2941119314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234029;

    public BurnTransactionEnt_hashCode_2941119314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term234030 = new Long(5160033404788124731L);
        Long term234044 = new Long(5071015720043054072L);
        term234029 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt"));
        Object term234046 = newInstance(Class.forName("java.util.Date"));
        Object term234048 = newInstance(Class.forName("java.util.Date"));
        setField(term234029, term234029.getClass(), "id", term234030);
        setField(term234029, term234029.getClass(), "transactionHash", "QcfydYbOGP");
        setField(term234029, term234029.getClass(), "ledgerIndex", term234044);
        setLongField(term234046, term234046.getClass(), "fastTime", 1750063240794L);
        setField(term234046, term234046.getClass(), "cdate", null);
        setField(term234029, term234029.getClass(), "createDate", term234046);
        setLongField(term234048, term234048.getClass(), "fastTime", 1274280634176L);
        setField(term234048, term234048.getClass(), "cdate", null);
        setField(term234029, term234029.getClass(), "txDate", term234048);
        setField(term234029, term234029.getClass(), "toAddress", "FdMzwKizAk");
        setField(term234029, term234029.getClass(), "fromAddress", "jjwHVTqCkP");
        setField(term234029, term234029.getClass(), "amount", "uUAkxSFPyL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.BurnTransactionEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term234029, args);
    }

};


