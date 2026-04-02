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

public class FseTransaction_getTransactionHash_34647840513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term602713;

    public FseTransaction_getTransactionHash_34647840513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term602793 = new Long(-9079056015194933995L);
        term602713 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term602714 = newInstance(Class.forName("java.util.Date"));
        Object term602716 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term602717 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term602719 = (int[]) newIntArray(6);
        setLongField(term602714, term602714.getClass(), "fastTime", 1799693179757L);
        setField(term602714, term602714.getClass(), "cdate", null);
        setField(term602713, term602713.getClass(), "transactionDate", term602714);
        setIntField(term602717, term602717.getClass(), "signum", 1);
        setIntElement(term602719, 0, 60308);
        setIntElement(term602719, 1, 1612930070);
        setIntElement(term602719, 2, 197675276);
        setIntElement(term602719, 3, 1877795153);
        setIntElement(term602719, 4, -595415770);
        setIntElement(term602719, 5, -244171379);
        setField(term602717, term602717.getClass(), "mag", term602719);
        setIntField(term602717, term602717.getClass(), "bitCountPlusOne", 0);
        setIntField(term602717, term602717.getClass(), "bitLengthPlusOne", 0);
        setIntField(term602717, term602717.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term602717, term602717.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term602716, term602716.getClass(), "intVal", term602717);
        setIntField(term602716, term602716.getClass(), "scale", 53);
        setIntField(term602716, term602716.getClass(), "precision", 0);
        setField(term602716, term602716.getClass(), "stringCache", null);
        setLongField(term602716, term602716.getClass(), "intCompact", -9223372036854775808L);
        setField(term602713, term602713.getClass(), "amount", term602716);
        setField(term602713, term602713.getClass(), "toAddress", "uRwndqhyZT");
        setField(term602713, term602713.getClass(), "fromAddress", "ZyhPGeQowD");
        setField(term602713, term602713.getClass(), "currency", "YBDATxOjKA");
        setField(term602713, term602713.getClass(), "issuerAddress", "HMHWwIqMRa");
        setField(term602713, term602713.getClass(), "transactionType", "oYEupxjTZn");
        setField(term602713, term602713.getClass(), "ledgerIndex", term602793);
        setField(term602713, term602713.getClass(), "transactionHash", "vnBZyaIYnL");
        setField(term602713, term602713.getClass(), "resultCode", "lVKHMYsoNI");
        setField(term602713, term602713.getClass(), "reason", "MPUPYPQuHB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTransactionHash", argTypes, term602713, args);
    }

};


