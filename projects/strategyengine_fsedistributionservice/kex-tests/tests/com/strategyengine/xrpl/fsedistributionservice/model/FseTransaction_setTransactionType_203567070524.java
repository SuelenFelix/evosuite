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

public class FseTransaction_setTransactionType_203567070524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term604865;

    public FseTransaction_setTransactionType_203567070524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term604945 = new Long(-2070418897756378076L);
        term604865 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term604866 = newInstance(Class.forName("java.util.Date"));
        Object term604868 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term604869 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term604871 = (int[]) newIntArray(6);
        setLongField(term604866, term604866.getClass(), "fastTime", 1665274271628L);
        setField(term604866, term604866.getClass(), "cdate", null);
        setField(term604865, term604865.getClass(), "transactionDate", term604866);
        setIntField(term604869, term604869.getClass(), "signum", 1);
        setIntElement(term604871, 0, 4257);
        setIntElement(term604871, 1, 303455479);
        setIntElement(term604871, 2, 1050110107);
        setIntElement(term604871, 3, 1024647694);
        setIntElement(term604871, 4, -1092558135);
        setIntElement(term604871, 5, -4798539);
        setField(term604869, term604869.getClass(), "mag", term604871);
        setIntField(term604869, term604869.getClass(), "bitCountPlusOne", 0);
        setIntField(term604869, term604869.getClass(), "bitLengthPlusOne", 0);
        setIntField(term604869, term604869.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term604869, term604869.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term604868, term604868.getClass(), "intVal", term604869);
        setIntField(term604868, term604868.getClass(), "scale", 52);
        setIntField(term604868, term604868.getClass(), "precision", 0);
        setField(term604868, term604868.getClass(), "stringCache", null);
        setLongField(term604868, term604868.getClass(), "intCompact", -9223372036854775808L);
        setField(term604865, term604865.getClass(), "amount", term604868);
        setField(term604865, term604865.getClass(), "toAddress", "OMmpfwVAqq");
        setField(term604865, term604865.getClass(), "fromAddress", "epjWinvtVU");
        setField(term604865, term604865.getClass(), "currency", "UjaiuciVbk");
        setField(term604865, term604865.getClass(), "issuerAddress", "RWHiRCpYTv");
        setField(term604865, term604865.getClass(), "transactionType", "bkkYKGVZSl");
        setField(term604865, term604865.getClass(), "ledgerIndex", term604945);
        setField(term604865, term604865.getClass(), "transactionHash", "zxSymDvdRR");
        setField(term604865, term604865.getClass(), "resultCode", "vLzflhmVIO");
        setField(term604865, term604865.getClass(), "reason", "iclAYiudke");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "cCwSyZEBIb";
        callMethod(klass, "setTransactionType", argTypes, term604865, args);
    }

};


