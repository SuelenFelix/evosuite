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

public class FseTransaction_setFromAddress_127535644521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term604187;

    public FseTransaction_setFromAddress_127535644521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term604267 = new Long(2830531040991289470L);
        term604187 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term604188 = newInstance(Class.forName("java.util.Date"));
        Object term604190 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term604191 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term604193 = (int[]) newIntArray(6);
        setLongField(term604188, term604188.getClass(), "fastTime", 1654150843905L);
        setField(term604188, term604188.getClass(), "cdate", null);
        setField(term604187, term604187.getClass(), "transactionDate", term604188);
        setIntField(term604191, term604191.getClass(), "signum", 1);
        setIntElement(term604193, 0, 26970);
        setIntElement(term604193, 1, 239139121);
        setIntElement(term604193, 2, -1315571115);
        setIntElement(term604193, 3, -1818010793);
        setIntElement(term604193, 4, -2087556840);
        setIntElement(term604193, 5, 129078839);
        setField(term604191, term604191.getClass(), "mag", term604193);
        setIntField(term604191, term604191.getClass(), "bitCountPlusOne", 0);
        setIntField(term604191, term604191.getClass(), "bitLengthPlusOne", 0);
        setIntField(term604191, term604191.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term604191, term604191.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term604190, term604190.getClass(), "intVal", term604191);
        setIntField(term604190, term604190.getClass(), "scale", 53);
        setIntField(term604190, term604190.getClass(), "precision", 0);
        setField(term604190, term604190.getClass(), "stringCache", null);
        setLongField(term604190, term604190.getClass(), "intCompact", -9223372036854775808L);
        setField(term604187, term604187.getClass(), "amount", term604190);
        setField(term604187, term604187.getClass(), "toAddress", "onRbsuWQtT");
        setField(term604187, term604187.getClass(), "fromAddress", "quIfJIsZRI");
        setField(term604187, term604187.getClass(), "currency", "haGlFmKzph");
        setField(term604187, term604187.getClass(), "issuerAddress", "FNvjIZLJdX");
        setField(term604187, term604187.getClass(), "transactionType", "gkKANBoKRQ");
        setField(term604187, term604187.getClass(), "ledgerIndex", term604267);
        setField(term604187, term604187.getClass(), "transactionHash", "nwIfxSYLbH");
        setField(term604187, term604187.getClass(), "resultCode", "VlbJRuEAoY");
        setField(term604187, term604187.getClass(), "reason", "FwbSKnEQVR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SUIyTSOfNO";
        callMethod(klass, "setFromAddress", argTypes, term604187, args);
    }

};


