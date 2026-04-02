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

public class FseTransaction_getFromAddress_13784072618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term601693;

    public FseTransaction_getFromAddress_13784072618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term601773 = new Long(-5513509665682251667L);
        term601693 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term601694 = newInstance(Class.forName("java.util.Date"));
        Object term601696 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term601697 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term601699 = (int[]) newIntArray(6);
        setLongField(term601694, term601694.getClass(), "fastTime", 1614705498755L);
        setField(term601694, term601694.getClass(), "cdate", null);
        setField(term601693, term601693.getClass(), "transactionDate", term601694);
        setIntField(term601697, term601697.getClass(), "signum", 1);
        setIntElement(term601699, 0, 23176);
        setIntElement(term601699, 1, 32116993);
        setIntElement(term601699, 2, 1699907037);
        setIntElement(term601699, 3, -1393933159);
        setIntElement(term601699, 4, 1385767550);
        setIntElement(term601699, 5, 109532417);
        setField(term601697, term601697.getClass(), "mag", term601699);
        setIntField(term601697, term601697.getClass(), "bitCountPlusOne", 0);
        setIntField(term601697, term601697.getClass(), "bitLengthPlusOne", 0);
        setIntField(term601697, term601697.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term601697, term601697.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term601696, term601696.getClass(), "intVal", term601697);
        setIntField(term601696, term601696.getClass(), "scale", 53);
        setIntField(term601696, term601696.getClass(), "precision", 0);
        setField(term601696, term601696.getClass(), "stringCache", null);
        setLongField(term601696, term601696.getClass(), "intCompact", -9223372036854775808L);
        setField(term601693, term601693.getClass(), "amount", term601696);
        setField(term601693, term601693.getClass(), "toAddress", "WGrgiaSQnl");
        setField(term601693, term601693.getClass(), "fromAddress", "FdPORhHvkS");
        setField(term601693, term601693.getClass(), "currency", "HheeaUYjPr");
        setField(term601693, term601693.getClass(), "issuerAddress", "nyKmTaUwFt");
        setField(term601693, term601693.getClass(), "transactionType", "rzqaoonvCb");
        setField(term601693, term601693.getClass(), "ledgerIndex", term601773);
        setField(term601693, term601693.getClass(), "transactionHash", "DHAcIlnUmH");
        setField(term601693, term601693.getClass(), "resultCode", "PXpuIQuvxu");
        setField(term601693, term601693.getClass(), "reason", "RGuievXeWF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFromAddress", argTypes, term601693, args);
    }

};


