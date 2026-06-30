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

public class FseTransaction_setToAddress_80080657820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term603961;

    public FseTransaction_setToAddress_80080657820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term604041 = new Long(5604034478428783596L);
        term603961 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term603962 = newInstance(Class.forName("java.util.Date"));
        Object term603964 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term603965 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term603967 = (int[]) newIntArray(6);
        setLongField(term603962, term603962.getClass(), "fastTime", 1430756040133L);
        setField(term603962, term603962.getClass(), "cdate", null);
        setField(term603961, term603961.getClass(), "transactionDate", term603962);
        setIntField(term603965, term603965.getClass(), "signum", 1);
        setIntElement(term603967, 0, 6);
        setIntElement(term603967, 1, -857477228);
        setIntElement(term603967, 2, 2109217402);
        setIntElement(term603967, 3, 928336334);
        setIntElement(term603967, 4, -1942363945);
        setIntElement(term603967, 5, -1927325247);
        setField(term603965, term603965.getClass(), "mag", term603967);
        setIntField(term603965, term603965.getClass(), "bitCountPlusOne", 0);
        setIntField(term603965, term603965.getClass(), "bitLengthPlusOne", 0);
        setIntField(term603965, term603965.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term603965, term603965.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term603964, term603964.getClass(), "intVal", term603965);
        setIntField(term603964, term603964.getClass(), "scale", 49);
        setIntField(term603964, term603964.getClass(), "precision", 0);
        setField(term603964, term603964.getClass(), "stringCache", null);
        setLongField(term603964, term603964.getClass(), "intCompact", -9223372036854775808L);
        setField(term603961, term603961.getClass(), "amount", term603964);
        setField(term603961, term603961.getClass(), "toAddress", "YTuxwCMRBA");
        setField(term603961, term603961.getClass(), "fromAddress", "sETkaSuzDp");
        setField(term603961, term603961.getClass(), "currency", "lZBpPKYhfN");
        setField(term603961, term603961.getClass(), "issuerAddress", "QurcwJtnIZ");
        setField(term603961, term603961.getClass(), "transactionType", "hkknNIOuCb");
        setField(term603961, term603961.getClass(), "ledgerIndex", term604041);
        setField(term603961, term603961.getClass(), "transactionHash", "nDBGVJQKYa");
        setField(term603961, term603961.getClass(), "resultCode", "vibSudGWEW");
        setField(term603961, term603961.getClass(), "reason", "rZCRybHPmf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dWFHxHnzji";
        callMethod(klass, "setToAddress", argTypes, term603961, args);
    }

};


