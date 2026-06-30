package com.strategyengine.xrpl.fsedistributionservice.model;

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
import static com.strategyengine.xrpl.fsedistributionservice.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class FseTransaction_setTransactionHash_167004864526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term605297;

    public FseTransaction_setTransactionHash_167004864526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term605377 = new Long(-6455995631591797782L);
        term605297 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term605298 = newInstance(Class.forName("java.util.Date"));
        Object term605300 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term605301 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term605303 = (int[]) newIntArray(6);
        setLongField(term605298, term605298.getClass(), "fastTime", 1819162928193L);
        setField(term605298, term605298.getClass(), "cdate", null);
        setField(term605297, term605297.getClass(), "transactionDate", term605298);
        setIntField(term605301, term605301.getClass(), "signum", 1);
        setIntElement(term605303, 0, 47441);
        setIntElement(term605303, 1, 185044978);
        setIntElement(term605303, 2, -758117999);
        setIntElement(term605303, 3, 417555899);
        setIntElement(term605303, 4, 172225796);
        setIntElement(term605303, 5, -2097383247);
        setField(term605301, term605301.getClass(), "mag", term605303);
        setIntField(term605301, term605301.getClass(), "bitCountPlusOne", 0);
        setIntField(term605301, term605301.getClass(), "bitLengthPlusOne", 0);
        setIntField(term605301, term605301.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term605301, term605301.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term605300, term605300.getClass(), "intVal", term605301);
        setIntField(term605300, term605300.getClass(), "scale", 53);
        setIntField(term605300, term605300.getClass(), "precision", 0);
        setField(term605300, term605300.getClass(), "stringCache", null);
        setLongField(term605300, term605300.getClass(), "intCompact", -9223372036854775808L);
        setField(term605297, term605297.getClass(), "amount", term605300);
        setField(term605297, term605297.getClass(), "toAddress", "gMrywiVyIr");
        setField(term605297, term605297.getClass(), "fromAddress", "iyZjIacLsw");
        setField(term605297, term605297.getClass(), "currency", "vYkgboKVHZ");
        setField(term605297, term605297.getClass(), "issuerAddress", "IaGDRvnqIb");
        setField(term605297, term605297.getClass(), "transactionType", "yBxHnUtIkQ");
        setField(term605297, term605297.getClass(), "ledgerIndex", term605377);
        setField(term605297, term605297.getClass(), "transactionHash", "qzQdYSDBmc");
        setField(term605297, term605297.getClass(), "resultCode", "lDCuOPQJTx");
        setField(term605297, term605297.getClass(), "reason", "WrdCxtewLX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pVqgMvBetn";
        callMethod(klass, "setTransactionHash", argTypes, term605297, args);
    }

};


