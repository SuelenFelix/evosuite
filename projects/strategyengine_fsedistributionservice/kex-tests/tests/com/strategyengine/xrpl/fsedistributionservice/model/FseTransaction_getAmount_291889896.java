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

public class FseTransaction_getAmount_291889896 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term601285;

    public FseTransaction_getAmount_291889896() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term601365 = new Long(7338947505433756976L);
        term601285 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term601286 = newInstance(Class.forName("java.util.Date"));
        Object term601288 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term601289 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term601291 = (int[]) newIntArray(6);
        setLongField(term601286, term601286.getClass(), "fastTime", 1837963638815L);
        setField(term601286, term601286.getClass(), "cdate", null);
        setField(term601285, term601285.getClass(), "transactionDate", term601286);
        setIntField(term601289, term601289.getClass(), "signum", 1);
        setIntElement(term601291, 0, 2561);
        setIntElement(term601291, 1, -1208621976);
        setIntElement(term601291, 2, -1315808614);
        setIntElement(term601291, 3, 1070209648);
        setIntElement(term601291, 4, 1447165623);
        setIntElement(term601291, 5, -1089810355);
        setField(term601289, term601289.getClass(), "mag", term601291);
        setIntField(term601289, term601289.getClass(), "bitCountPlusOne", 0);
        setIntField(term601289, term601289.getClass(), "bitLengthPlusOne", 0);
        setIntField(term601289, term601289.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term601289, term601289.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term601288, term601288.getClass(), "intVal", term601289);
        setIntField(term601288, term601288.getClass(), "scale", 52);
        setIntField(term601288, term601288.getClass(), "precision", 0);
        setField(term601288, term601288.getClass(), "stringCache", null);
        setLongField(term601288, term601288.getClass(), "intCompact", -9223372036854775808L);
        setField(term601285, term601285.getClass(), "amount", term601288);
        setField(term601285, term601285.getClass(), "toAddress", "dKDzzuLoLW");
        setField(term601285, term601285.getClass(), "fromAddress", "EPVoKzYjsa");
        setField(term601285, term601285.getClass(), "currency", "exwRDMTrUH");
        setField(term601285, term601285.getClass(), "issuerAddress", "THLGPyhTxM");
        setField(term601285, term601285.getClass(), "transactionType", "XdUkazWzCb");
        setField(term601285, term601285.getClass(), "ledgerIndex", term601365);
        setField(term601285, term601285.getClass(), "transactionHash", "pqVRGoWaeR");
        setField(term601285, term601285.getClass(), "resultCode", "JqdeuiBTPA");
        setField(term601285, term601285.getClass(), "reason", "tDOAjYoXYW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAmount", argTypes, term601285, args);
    }

};


