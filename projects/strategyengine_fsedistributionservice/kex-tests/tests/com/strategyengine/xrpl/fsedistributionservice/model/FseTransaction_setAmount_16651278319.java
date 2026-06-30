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

public class FseTransaction_setAmount_16651278319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term603734;
     Object term603852;

    public FseTransaction_setAmount_16651278319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term603814 = new Long(-2306787824604312942L);
        term603734 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term603735 = newInstance(Class.forName("java.util.Date"));
        Object term603737 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term603738 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term603740 = (int[]) newIntArray(6);
        setLongField(term603735, term603735.getClass(), "fastTime", 1382262202227L);
        setField(term603735, term603735.getClass(), "cdate", null);
        setField(term603734, term603734.getClass(), "transactionDate", term603735);
        setIntField(term603738, term603738.getClass(), "signum", 1);
        setIntElement(term603740, 0, 8196);
        setIntElement(term603740, 1, -1575620227);
        setIntElement(term603740, 2, -1711282889);
        setIntElement(term603740, 3, -792027477);
        setIntElement(term603740, 4, 270735829);
        setIntElement(term603740, 5, 119080225);
        setField(term603738, term603738.getClass(), "mag", term603740);
        setIntField(term603738, term603738.getClass(), "bitCountPlusOne", 0);
        setIntField(term603738, term603738.getClass(), "bitLengthPlusOne", 0);
        setIntField(term603738, term603738.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term603738, term603738.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term603737, term603737.getClass(), "intVal", term603738);
        setIntField(term603737, term603737.getClass(), "scale", 53);
        setIntField(term603737, term603737.getClass(), "precision", 0);
        setField(term603737, term603737.getClass(), "stringCache", null);
        setLongField(term603737, term603737.getClass(), "intCompact", -9223372036854775808L);
        setField(term603734, term603734.getClass(), "amount", term603737);
        setField(term603734, term603734.getClass(), "toAddress", "lkrEjOUbOb");
        setField(term603734, term603734.getClass(), "fromAddress", "cxeaGVfqIZ");
        setField(term603734, term603734.getClass(), "currency", "PduAQEEVJs");
        setField(term603734, term603734.getClass(), "issuerAddress", "DEzXMDcBeO");
        setField(term603734, term603734.getClass(), "transactionType", "omCAhxkVhc");
        setField(term603734, term603734.getClass(), "ledgerIndex", term603814);
        setField(term603734, term603734.getClass(), "transactionHash", "BYmfYmCPCO");
        setField(term603734, term603734.getClass(), "resultCode", "czTcTFSZaH");
        setField(term603734, term603734.getClass(), "reason", "xoGaXvlJPi");
        term603852 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term603853 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term603855 = (int[]) newIntArray(6);
        setIntField(term603853, term603853.getClass(), "signum", 1);
        setIntElement(term603855, 0, 3117);
        setIntElement(term603855, 1, 122305338);
        setIntElement(term603855, 2, -976773634);
        setIntElement(term603855, 3, -178049013);
        setIntElement(term603855, 4, -1406421509);
        setIntElement(term603855, 5, -1537670203);
        setField(term603853, term603853.getClass(), "mag", term603855);
        setIntField(term603853, term603853.getClass(), "bitCountPlusOne", 0);
        setIntField(term603853, term603853.getClass(), "bitLengthPlusOne", 0);
        setIntField(term603853, term603853.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term603853, term603853.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term603852, term603852.getClass(), "intVal", term603853);
        setIntField(term603852, term603852.getClass(), "scale", 52);
        setIntField(term603852, term603852.getClass(), "precision", 0);
        setField(term603852, term603852.getClass(), "stringCache", null);
        setLongField(term603852, term603852.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term603852;
        callMethod(klass, "setAmount", argTypes, term603734, args);
    }

};


