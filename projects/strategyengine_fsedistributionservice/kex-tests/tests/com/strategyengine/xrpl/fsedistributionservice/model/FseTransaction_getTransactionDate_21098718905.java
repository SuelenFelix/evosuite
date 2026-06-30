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

public class FseTransaction_getTransactionDate_21098718905 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term601081;

    public FseTransaction_getTransactionDate_21098718905() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term601161 = new Long(-8478725267603949004L);
        term601081 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term601082 = newInstance(Class.forName("java.util.Date"));
        Object term601084 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term601085 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term601087 = (int[]) newIntArray(6);
        setLongField(term601082, term601082.getClass(), "fastTime", 1715112477343L);
        setField(term601082, term601082.getClass(), "cdate", null);
        setField(term601081, term601081.getClass(), "transactionDate", term601082);
        setIntField(term601085, term601085.getClass(), "signum", 1);
        setIntElement(term601087, 0, 50937);
        setIntElement(term601087, 1, -1815840123);
        setIntElement(term601087, 2, -373108466);
        setIntElement(term601087, 3, -1576190009);
        setIntElement(term601087, 4, 1402501184);
        setIntElement(term601087, 5, -1641648957);
        setField(term601085, term601085.getClass(), "mag", term601087);
        setIntField(term601085, term601085.getClass(), "bitCountPlusOne", 0);
        setIntField(term601085, term601085.getClass(), "bitLengthPlusOne", 0);
        setIntField(term601085, term601085.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term601085, term601085.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term601084, term601084.getClass(), "intVal", term601085);
        setIntField(term601084, term601084.getClass(), "scale", 53);
        setIntField(term601084, term601084.getClass(), "precision", 0);
        setField(term601084, term601084.getClass(), "stringCache", null);
        setLongField(term601084, term601084.getClass(), "intCompact", -9223372036854775808L);
        setField(term601081, term601081.getClass(), "amount", term601084);
        setField(term601081, term601081.getClass(), "toAddress", "bToiDutxBd");
        setField(term601081, term601081.getClass(), "fromAddress", "iIhNOWZSiI");
        setField(term601081, term601081.getClass(), "currency", "NQIBkRnfjL");
        setField(term601081, term601081.getClass(), "issuerAddress", "roYYoUvuve");
        setField(term601081, term601081.getClass(), "transactionType", "saBbwEJwaU");
        setField(term601081, term601081.getClass(), "ledgerIndex", term601161);
        setField(term601081, term601081.getClass(), "transactionHash", "deyNBzGoAl");
        setField(term601081, term601081.getClass(), "resultCode", "FBbQyFgPdH");
        setField(term601081, term601081.getClass(), "reason", "AjdUNyCugb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTransactionDate", argTypes, term601081, args);
    }

};


