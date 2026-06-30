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

public class FseTransaction_setIssuerAddress_11989575623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term604639;

    public FseTransaction_setIssuerAddress_11989575623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term604719 = new Long(8547681246636788948L);
        term604639 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term604640 = newInstance(Class.forName("java.util.Date"));
        Object term604642 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term604643 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term604645 = (int[]) newIntArray(6);
        setLongField(term604640, term604640.getClass(), "fastTime", 1279565030296L);
        setField(term604640, term604640.getClass(), "cdate", null);
        setField(term604639, term604639.getClass(), "transactionDate", term604640);
        setIntField(term604643, term604643.getClass(), "signum", 1);
        setIntElement(term604645, 0, 1971);
        setIntElement(term604645, 1, -2015756966);
        setIntElement(term604645, 2, -144061670);
        setIntElement(term604645, 3, -881962765);
        setIntElement(term604645, 4, -808498079);
        setIntElement(term604645, 5, -892912511);
        setField(term604643, term604643.getClass(), "mag", term604645);
        setIntField(term604643, term604643.getClass(), "bitCountPlusOne", 0);
        setIntField(term604643, term604643.getClass(), "bitLengthPlusOne", 0);
        setIntField(term604643, term604643.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term604643, term604643.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term604642, term604642.getClass(), "intVal", term604643);
        setIntField(term604642, term604642.getClass(), "scale", 52);
        setIntField(term604642, term604642.getClass(), "precision", 0);
        setField(term604642, term604642.getClass(), "stringCache", null);
        setLongField(term604642, term604642.getClass(), "intCompact", -9223372036854775808L);
        setField(term604639, term604639.getClass(), "amount", term604642);
        setField(term604639, term604639.getClass(), "toAddress", "oBbrOFbyjc");
        setField(term604639, term604639.getClass(), "fromAddress", "VRZXwrWoco");
        setField(term604639, term604639.getClass(), "currency", "RrxbbTEHjO");
        setField(term604639, term604639.getClass(), "issuerAddress", "AszeYDlmYY");
        setField(term604639, term604639.getClass(), "transactionType", "DujdUzFIMa");
        setField(term604639, term604639.getClass(), "ledgerIndex", term604719);
        setField(term604639, term604639.getClass(), "transactionHash", "NOySWCkmik");
        setField(term604639, term604639.getClass(), "resultCode", "DNMHqWALqA");
        setField(term604639, term604639.getClass(), "reason", "xlwLAxfWId");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ksdQQJdyNW";
        callMethod(klass, "setIssuerAddress", argTypes, term604639, args);
    }

};


