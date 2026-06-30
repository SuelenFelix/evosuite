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

public class FseTransaction_getLedgerIndex_91214446112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term602509;

    public FseTransaction_getLedgerIndex_91214446112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term602589 = new Long(4947168794582157385L);
        term602509 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term602510 = newInstance(Class.forName("java.util.Date"));
        Object term602512 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term602513 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term602515 = (int[]) newIntArray(6);
        setLongField(term602510, term602510.getClass(), "fastTime", 1615303713114L);
        setField(term602510, term602510.getClass(), "cdate", null);
        setField(term602509, term602509.getClass(), "transactionDate", term602510);
        setIntField(term602513, term602513.getClass(), "signum", 1);
        setIntElement(term602515, 0, 3406);
        setIntElement(term602515, 1, -2039765528);
        setIntElement(term602515, 2, 72903607);
        setIntElement(term602515, 3, -1665615165);
        setIntElement(term602515, 4, -65057046);
        setIntElement(term602515, 5, 357264263);
        setField(term602513, term602513.getClass(), "mag", term602515);
        setIntField(term602513, term602513.getClass(), "bitCountPlusOne", 0);
        setIntField(term602513, term602513.getClass(), "bitLengthPlusOne", 0);
        setIntField(term602513, term602513.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term602513, term602513.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term602512, term602512.getClass(), "intVal", term602513);
        setIntField(term602512, term602512.getClass(), "scale", 53);
        setIntField(term602512, term602512.getClass(), "precision", 0);
        setField(term602512, term602512.getClass(), "stringCache", null);
        setLongField(term602512, term602512.getClass(), "intCompact", -9223372036854775808L);
        setField(term602509, term602509.getClass(), "amount", term602512);
        setField(term602509, term602509.getClass(), "toAddress", "NeglvhHDjr");
        setField(term602509, term602509.getClass(), "fromAddress", "TTDVDdOeqI");
        setField(term602509, term602509.getClass(), "currency", "jDyYjDgeRm");
        setField(term602509, term602509.getClass(), "issuerAddress", "DlaIwKXfcE");
        setField(term602509, term602509.getClass(), "transactionType", "XqyZdgkVGJ");
        setField(term602509, term602509.getClass(), "ledgerIndex", term602589);
        setField(term602509, term602509.getClass(), "transactionHash", "lDHOULUQIk");
        setField(term602509, term602509.getClass(), "resultCode", "NXdDKYbdXI");
        setField(term602509, term602509.getClass(), "reason", "pxtuUGpEnU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLedgerIndex", argTypes, term602509, args);
    }

};


