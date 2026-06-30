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

public class FseTransaction_getReason_204404923915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term603121;

    public FseTransaction_getReason_204404923915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term603201 = new Long(-1244148850479968082L);
        term603121 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term603122 = newInstance(Class.forName("java.util.Date"));
        Object term603124 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term603125 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term603127 = (int[]) newIntArray(6);
        setLongField(term603122, term603122.getClass(), "fastTime", 1533214819117L);
        setField(term603122, term603122.getClass(), "cdate", null);
        setField(term603121, term603121.getClass(), "transactionDate", term603122);
        setIntField(term603125, term603125.getClass(), "signum", 1);
        setIntElement(term603127, 0, 5734);
        setIntElement(term603127, 1, -1573091234);
        setIntElement(term603127, 2, 1411420036);
        setIntElement(term603127, 3, -1240625785);
        setIntElement(term603127, 4, 813819022);
        setIntElement(term603127, 5, -1393598211);
        setField(term603125, term603125.getClass(), "mag", term603127);
        setIntField(term603125, term603125.getClass(), "bitCountPlusOne", 0);
        setIntField(term603125, term603125.getClass(), "bitLengthPlusOne", 0);
        setIntField(term603125, term603125.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term603125, term603125.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term603124, term603124.getClass(), "intVal", term603125);
        setIntField(term603124, term603124.getClass(), "scale", 52);
        setIntField(term603124, term603124.getClass(), "precision", 0);
        setField(term603124, term603124.getClass(), "stringCache", null);
        setLongField(term603124, term603124.getClass(), "intCompact", -9223372036854775808L);
        setField(term603121, term603121.getClass(), "amount", term603124);
        setField(term603121, term603121.getClass(), "toAddress", "LMXTwgTyDv");
        setField(term603121, term603121.getClass(), "fromAddress", "OvMjignBZh");
        setField(term603121, term603121.getClass(), "currency", "XKohfOxQpG");
        setField(term603121, term603121.getClass(), "issuerAddress", "vaEqtdWGqW");
        setField(term603121, term603121.getClass(), "transactionType", "cSMVydOyqb");
        setField(term603121, term603121.getClass(), "ledgerIndex", term603201);
        setField(term603121, term603121.getClass(), "transactionHash", "MkvQrFcRTd");
        setField(term603121, term603121.getClass(), "resultCode", "QCnYapvzyp");
        setField(term603121, term603121.getClass(), "reason", "rvxLjNrfDV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getReason", argTypes, term603121, args);
    }

};


