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

public class FseTransaction_FseTransactionBuilder_ledgerIndex_209124548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term565384;
     Object term565502;

    public FseTransaction_FseTransactionBuilder_ledgerIndex_209124548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term565464 = new Long(-1383665096049300821L);
        term565384 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction$FseTransactionBuilder"));
        Object term565385 = newInstance(Class.forName("java.util.Date"));
        Object term565387 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term565388 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term565390 = (int[]) newIntArray(6);
        setLongField(term565385, term565385.getClass(), "fastTime", 1674567149244L);
        setField(term565385, term565385.getClass(), "cdate", null);
        setField(term565384, term565384.getClass(), "transactionDate", term565385);
        setIntField(term565388, term565388.getClass(), "signum", 1);
        setIntElement(term565390, 0, 464);
        setIntElement(term565390, 1, -140169439);
        setIntElement(term565390, 2, 840596369);
        setIntElement(term565390, 3, -1506028241);
        setIntElement(term565390, 4, 980990691);
        setIntElement(term565390, 5, -275457977);
        setField(term565388, term565388.getClass(), "mag", term565390);
        setIntField(term565388, term565388.getClass(), "bitCountPlusOne", 0);
        setIntField(term565388, term565388.getClass(), "bitLengthPlusOne", 0);
        setIntField(term565388, term565388.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term565388, term565388.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term565387, term565387.getClass(), "intVal", term565388);
        setIntField(term565387, term565387.getClass(), "scale", 52);
        setIntField(term565387, term565387.getClass(), "precision", 0);
        setField(term565387, term565387.getClass(), "stringCache", null);
        setLongField(term565387, term565387.getClass(), "intCompact", -9223372036854775808L);
        setField(term565384, term565384.getClass(), "amount", term565387);
        setField(term565384, term565384.getClass(), "toAddress", "HryXzTbmTy");
        setField(term565384, term565384.getClass(), "fromAddress", "onBrOcbLBy");
        setField(term565384, term565384.getClass(), "currency", "bRCSiJmxoG");
        setField(term565384, term565384.getClass(), "issuerAddress", "gdETEfEDoV");
        setField(term565384, term565384.getClass(), "transactionType", "VxuAZfQUYL");
        setField(term565384, term565384.getClass(), "ledgerIndex", term565464);
        setField(term565384, term565384.getClass(), "transactionHash", "JxFppbOcNK");
        setField(term565384, term565384.getClass(), "resultCode", "VDRDLYjCJY");
        setField(term565384, term565384.getClass(), "reason", "FAhGbTievR");
        term565502 = new Long(3462550822198292676L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction$FseTransactionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term565502;
        callMethod(klass, "ledgerIndex", argTypes, term565384, args);
    }

};


