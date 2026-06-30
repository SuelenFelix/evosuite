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

public class FseTransaction_getToAddress_6380491387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term601489;

    public FseTransaction_getToAddress_6380491387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term601569 = new Long(-6284173466459484010L);
        term601489 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term601490 = newInstance(Class.forName("java.util.Date"));
        Object term601492 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term601493 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term601495 = (int[]) newIntArray(6);
        setLongField(term601490, term601490.getClass(), "fastTime", 1453488231320L);
        setField(term601490, term601490.getClass(), "cdate", null);
        setField(term601489, term601489.getClass(), "transactionDate", term601490);
        setIntField(term601493, term601493.getClass(), "signum", 1);
        setIntElement(term601495, 0, 342);
        setIntElement(term601495, 1, -768025899);
        setIntElement(term601495, 2, 824876281);
        setIntElement(term601495, 3, 610928061);
        setIntElement(term601495, 4, -1202175838);
        setIntElement(term601495, 5, 1643470491);
        setField(term601493, term601493.getClass(), "mag", term601495);
        setIntField(term601493, term601493.getClass(), "bitCountPlusOne", 0);
        setIntField(term601493, term601493.getClass(), "bitLengthPlusOne", 0);
        setIntField(term601493, term601493.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term601493, term601493.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term601492, term601492.getClass(), "intVal", term601493);
        setIntField(term601492, term601492.getClass(), "scale", 51);
        setIntField(term601492, term601492.getClass(), "precision", 0);
        setField(term601492, term601492.getClass(), "stringCache", null);
        setLongField(term601492, term601492.getClass(), "intCompact", -9223372036854775808L);
        setField(term601489, term601489.getClass(), "amount", term601492);
        setField(term601489, term601489.getClass(), "toAddress", "cniOQvwvCr");
        setField(term601489, term601489.getClass(), "fromAddress", "KxinsOQMeG");
        setField(term601489, term601489.getClass(), "currency", "mbuEVrmMpD");
        setField(term601489, term601489.getClass(), "issuerAddress", "gQGlISxORX");
        setField(term601489, term601489.getClass(), "transactionType", "IhgSPsiEAp");
        setField(term601489, term601489.getClass(), "ledgerIndex", term601569);
        setField(term601489, term601489.getClass(), "transactionHash", "VIiDjdCWsX");
        setField(term601489, term601489.getClass(), "resultCode", "HUpXsvCasn");
        setField(term601489, term601489.getClass(), "reason", "gxKFHEvCMQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getToAddress", argTypes, term601489, args);
    }

};


