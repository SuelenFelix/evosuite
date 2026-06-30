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

public class FseTransaction_equals_5346839761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term600263;
     Object term600381;

    public FseTransaction_equals_5346839761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term600343 = new Long(9035414347228692356L);
        term600263 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term600264 = newInstance(Class.forName("java.util.Date"));
        Object term600266 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term600267 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term600269 = (int[]) newIntArray(6);
        setLongField(term600264, term600264.getClass(), "fastTime", 1838842273908L);
        setField(term600264, term600264.getClass(), "cdate", null);
        setField(term600263, term600263.getClass(), "transactionDate", term600264);
        setIntField(term600267, term600267.getClass(), "signum", 1);
        setIntElement(term600269, 0, 68172);
        setIntElement(term600269, 1, 1972370865);
        setIntElement(term600269, 2, 1879087400);
        setIntElement(term600269, 3, -1902948873);
        setIntElement(term600269, 4, -1631074479);
        setIntElement(term600269, 5, 1265088013);
        setField(term600267, term600267.getClass(), "mag", term600269);
        setIntField(term600267, term600267.getClass(), "bitCountPlusOne", 0);
        setIntField(term600267, term600267.getClass(), "bitLengthPlusOne", 0);
        setIntField(term600267, term600267.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term600267, term600267.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term600266, term600266.getClass(), "intVal", term600267);
        setIntField(term600266, term600266.getClass(), "scale", 53);
        setIntField(term600266, term600266.getClass(), "precision", 0);
        setField(term600266, term600266.getClass(), "stringCache", null);
        setLongField(term600266, term600266.getClass(), "intCompact", -9223372036854775808L);
        setField(term600263, term600263.getClass(), "amount", term600266);
        setField(term600263, term600263.getClass(), "toAddress", "YJjLEIFIXz");
        setField(term600263, term600263.getClass(), "fromAddress", "EUOVVchCuH");
        setField(term600263, term600263.getClass(), "currency", "YBEjtwoXAa");
        setField(term600263, term600263.getClass(), "issuerAddress", "hcUrfXxUyU");
        setField(term600263, term600263.getClass(), "transactionType", "EbtBgsMrVm");
        setField(term600263, term600263.getClass(), "ledgerIndex", term600343);
        setField(term600263, term600263.getClass(), "transactionHash", "ReSzglHqbI");
        setField(term600263, term600263.getClass(), "resultCode", "CfqOwyPntO");
        setField(term600263, term600263.getClass(), "reason", "aGJpzsREQk");
        term600381 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term600381;
        callMethod(klass, "equals", argTypes, term600263, args);
    }

};


