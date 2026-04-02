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

public class FseTransaction_getCurrency_3613077229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term601897;

    public FseTransaction_getCurrency_3613077229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term601977 = new Long(4680638415078495388L);
        term601897 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term601898 = newInstance(Class.forName("java.util.Date"));
        Object term601900 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term601901 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term601903 = (int[]) newIntArray(6);
        setLongField(term601898, term601898.getClass(), "fastTime", 1336538131239L);
        setField(term601898, term601898.getClass(), "cdate", null);
        setField(term601897, term601897.getClass(), "transactionDate", term601898);
        setIntField(term601901, term601901.getClass(), "signum", 1);
        setIntElement(term601903, 0, 68094);
        setIntElement(term601903, 1, 1582556812);
        setIntElement(term601903, 2, 1054127349);
        setIntElement(term601903, 3, -1714203082);
        setIntElement(term601903, 4, 339228949);
        setIntElement(term601903, 5, 825064867);
        setField(term601901, term601901.getClass(), "mag", term601903);
        setIntField(term601901, term601901.getClass(), "bitCountPlusOne", 0);
        setIntField(term601901, term601901.getClass(), "bitLengthPlusOne", 0);
        setIntField(term601901, term601901.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term601901, term601901.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term601900, term601900.getClass(), "intVal", term601901);
        setIntField(term601900, term601900.getClass(), "scale", 53);
        setIntField(term601900, term601900.getClass(), "precision", 0);
        setField(term601900, term601900.getClass(), "stringCache", null);
        setLongField(term601900, term601900.getClass(), "intCompact", -9223372036854775808L);
        setField(term601897, term601897.getClass(), "amount", term601900);
        setField(term601897, term601897.getClass(), "toAddress", "RNWAfuYVdn");
        setField(term601897, term601897.getClass(), "fromAddress", "hZuxPbhKHd");
        setField(term601897, term601897.getClass(), "currency", "owuVENinAF");
        setField(term601897, term601897.getClass(), "issuerAddress", "wrEbOqtEzd");
        setField(term601897, term601897.getClass(), "transactionType", "wnmgduZOMm");
        setField(term601897, term601897.getClass(), "ledgerIndex", term601977);
        setField(term601897, term601897.getClass(), "transactionHash", "CunxEcVQZW");
        setField(term601897, term601897.getClass(), "resultCode", "SNbQDPikGp");
        setField(term601897, term601897.getClass(), "reason", "dCxylRMRqf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrency", argTypes, term601897, args);
    }

};


