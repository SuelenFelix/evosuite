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

public class FseTransaction_setCurrency_194765016222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term604413;

    public FseTransaction_setCurrency_194765016222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term604493 = new Long(-5227262300045722571L);
        term604413 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction"));
        Object term604414 = newInstance(Class.forName("java.util.Date"));
        Object term604416 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term604417 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term604419 = (int[]) newIntArray(6);
        setLongField(term604414, term604414.getClass(), "fastTime", 1636932341774L);
        setField(term604414, term604414.getClass(), "cdate", null);
        setField(term604413, term604413.getClass(), "transactionDate", term604414);
        setIntField(term604417, term604417.getClass(), "signum", 1);
        setIntElement(term604419, 0, 36839);
        setIntElement(term604419, 1, -454266170);
        setIntElement(term604419, 2, 613359153);
        setIntElement(term604419, 3, 1125997141);
        setIntElement(term604419, 4, 1170150218);
        setIntElement(term604419, 5, -412857283);
        setField(term604417, term604417.getClass(), "mag", term604419);
        setIntField(term604417, term604417.getClass(), "bitCountPlusOne", 0);
        setIntField(term604417, term604417.getClass(), "bitLengthPlusOne", 0);
        setIntField(term604417, term604417.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term604417, term604417.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term604416, term604416.getClass(), "intVal", term604417);
        setIntField(term604416, term604416.getClass(), "scale", 53);
        setIntField(term604416, term604416.getClass(), "precision", 0);
        setField(term604416, term604416.getClass(), "stringCache", null);
        setLongField(term604416, term604416.getClass(), "intCompact", -9223372036854775808L);
        setField(term604413, term604413.getClass(), "amount", term604416);
        setField(term604413, term604413.getClass(), "toAddress", "dXdjApLAzK");
        setField(term604413, term604413.getClass(), "fromAddress", "SoglrUcgGE");
        setField(term604413, term604413.getClass(), "currency", "rWtaQaTGlL");
        setField(term604413, term604413.getClass(), "issuerAddress", "cHAyWxkpYO");
        setField(term604413, term604413.getClass(), "transactionType", "neHaYsveYy");
        setField(term604413, term604413.getClass(), "ledgerIndex", term604493);
        setField(term604413, term604413.getClass(), "transactionHash", "jwOOWlBKWZ");
        setField(term604413, term604413.getClass(), "resultCode", "LFabroENXN");
        setField(term604413, term604413.getClass(), "reason", "xTtWtlUDcE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTransaction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "zaYpmvkBFb";
        callMethod(klass, "setCurrency", argTypes, term604413, args);
    }

};


