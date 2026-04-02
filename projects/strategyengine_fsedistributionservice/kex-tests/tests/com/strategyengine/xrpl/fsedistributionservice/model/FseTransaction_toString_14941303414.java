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

public class FseTransaction_toString_14941303414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term600877;

    public FseTransaction_toString_14941303414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term600957 = new Long(8852560867977898159L);
        term600877 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term600878 = newInstance(Class.forName("java.util.Date"));
        Object term600880 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term600881 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term600883 = (int[]) newIntArray(6);
        setLongField(term600878, term600878.getClass(), "fastTime", 1564061035015L);
        setField(term600878, term600878.getClass(), "cdate", null);
        setField(term600877, term600877.getClass(), "transactionDate", term600878);
        setIntField(term600881, term600881.getClass(), "signum", 1);
        setIntElement(term600883, 0, 62356);
        setIntElement(term600883, 1, 2041643177);
        setIntElement(term600883, 2, 735331030);
        setIntElement(term600883, 3, -1004974059);
        setIntElement(term600883, 4, 1212393552);
        setIntElement(term600883, 5, 84177243);
        setField(term600881, term600881.getClass(), "mag", term600883);
        setIntField(term600881, term600881.getClass(), "bitCountPlusOne", 0);
        setIntField(term600881, term600881.getClass(), "bitLengthPlusOne", 0);
        setIntField(term600881, term600881.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term600881, term600881.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term600880, term600880.getClass(), "intVal", term600881);
        setIntField(term600880, term600880.getClass(), "scale", 53);
        setIntField(term600880, term600880.getClass(), "precision", 0);
        setField(term600880, term600880.getClass(), "stringCache", null);
        setLongField(term600880, term600880.getClass(), "intCompact", -9223372036854775808L);
        setField(term600877, term600877.getClass(), "amount", term600880);
        setField(term600877, term600877.getClass(), "toAddress", "zhTrQcOfmZ");
        setField(term600877, term600877.getClass(), "fromAddress", "QPQvZYsKyp");
        setField(term600877, term600877.getClass(), "currency", "DcKnNHFkHB");
        setField(term600877, term600877.getClass(), "issuerAddress", "ItJTfGujtZ");
        setField(term600877, term600877.getClass(), "transactionType", "qkPcNUMMFU");
        setField(term600877, term600877.getClass(), "ledgerIndex", term600957);
        setField(term600877, term600877.getClass(), "transactionHash", "ZXmgWZeTRn");
        setField(term600877, term600877.getClass(), "resultCode", "GoLHmDBAJB");
        setField(term600877, term600877.getClass(), "reason", "AZqmZETlNN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term600877, args);
    }

};


