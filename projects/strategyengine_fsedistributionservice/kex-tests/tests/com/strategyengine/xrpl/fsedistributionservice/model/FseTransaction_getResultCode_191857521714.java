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

public class FseTransaction_getResultCode_191857521714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term602917;

    public FseTransaction_getResultCode_191857521714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term602997 = new Long(-8867721217716506903L);
        term602917 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term602918 = newInstance(Class.forName("java.util.Date"));
        Object term602920 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term602921 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term602923 = (int[]) newIntArray(6);
        setLongField(term602918, term602918.getClass(), "fastTime", 1311412885920L);
        setField(term602918, term602918.getClass(), "cdate", null);
        setField(term602917, term602917.getClass(), "transactionDate", term602918);
        setIntField(term602921, term602921.getClass(), "signum", 1);
        setIntElement(term602923, 0, 32302);
        setIntElement(term602923, 1, -400947181);
        setIntElement(term602923, 2, -146760881);
        setIntElement(term602923, 3, -1034511670);
        setIntElement(term602923, 4, -200924143);
        setIntElement(term602923, 5, -435552457);
        setField(term602921, term602921.getClass(), "mag", term602923);
        setIntField(term602921, term602921.getClass(), "bitCountPlusOne", 0);
        setIntField(term602921, term602921.getClass(), "bitLengthPlusOne", 0);
        setIntField(term602921, term602921.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term602921, term602921.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term602920, term602920.getClass(), "intVal", term602921);
        setIntField(term602920, term602920.getClass(), "scale", 53);
        setIntField(term602920, term602920.getClass(), "precision", 0);
        setField(term602920, term602920.getClass(), "stringCache", null);
        setLongField(term602920, term602920.getClass(), "intCompact", -9223372036854775808L);
        setField(term602917, term602917.getClass(), "amount", term602920);
        setField(term602917, term602917.getClass(), "toAddress", "blJZUhevsA");
        setField(term602917, term602917.getClass(), "fromAddress", "nbJzmGdHpB");
        setField(term602917, term602917.getClass(), "currency", "HxihxzuKfN");
        setField(term602917, term602917.getClass(), "issuerAddress", "kenKdxPVfm");
        setField(term602917, term602917.getClass(), "transactionType", "fnztsFUlSX");
        setField(term602917, term602917.getClass(), "ledgerIndex", term602997);
        setField(term602917, term602917.getClass(), "transactionHash", "eqAUffwade");
        setField(term602917, term602917.getClass(), "resultCode", "NnRkGusQSv");
        setField(term602917, term602917.getClass(), "reason", "psNOiLjLdY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResultCode", argTypes, term602917, args);
    }

};


