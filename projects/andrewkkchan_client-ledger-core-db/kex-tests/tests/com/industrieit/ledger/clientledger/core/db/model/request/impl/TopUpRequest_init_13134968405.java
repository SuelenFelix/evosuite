package com.industrieit.ledger.clientledger.core.db.model.request.impl;

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
import static com.industrieit.ledger.clientledger.core.db.model.request.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TopUpRequest_init_13134968405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term397;

    public TopUpRequest_init_13134968405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term397 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term398 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term400 = (int[]) newIntArray(6);
        setIntField(term398, term398.getClass(), "signum", 1);
        setIntElement(term400, 0, 1954);
        setIntElement(term400, 1, -476668863);
        setIntElement(term400, 2, 661030673);
        setIntElement(term400, 3, 328061253);
        setIntElement(term400, 4, -431156338);
        setIntElement(term400, 5, 791621529);
        setField(term398, term398.getClass(), "mag", term400);
        setIntField(term398, term398.getClass(), "bitCountPlusOne", 0);
        setIntField(term398, term398.getClass(), "bitLengthPlusOne", 0);
        setIntField(term398, term398.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term398, term398.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term397, term397.getClass(), "intVal", term398);
        setIntField(term397, term397.getClass(), "scale", 52);
        setIntField(term397, term397.getClass(), "precision", 0);
        setField(term397, term397.getClass(), "stringCache", null);
        setLongField(term397, term397.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.industrieit.ledger.clientledger.core.db.model.request.impl.TopUpRequest");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[4];
        args[0] = "MxlszYVzRf";
        args[1] = "LQFpaHEwXR";
        args[2] = "oVcInYnLWB";
        args[3] = term397;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


