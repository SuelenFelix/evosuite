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
import java.util.ArrayList;
import java.lang.Boolean;
import java.util.LinkedList;

public class FseAccount_setTrustLines_2650194815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term339737;
     Object term339790;

    public FseAccount_setTrustLines_2650194815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term339769 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339769, term339769.getClass(), "classicAddress", "");
        setField(term339769, term339769.getClass(), "currency", "");
        setField(term339769, term339769.getClass(), "balance", "");
        setField(term339769, term339769.getClass(), "limit", "");
        ArrayList term339767 = new ArrayList();
        ((ArrayList) term339767).add(term339769);
        Boolean term339788 = new Boolean(true);
        term339737 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount"));
        Object term339750 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term339751 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term339753 = (int[]) newIntArray(6);
        setField(term339737, term339737.getClass(), "classicAddress", "UWmJYgkKXW");
        setIntField(term339751, term339751.getClass(), "signum", 1);
        setIntElement(term339753, 0, 62201);
        setIntElement(term339753, 1, -1131869595);
        setIntElement(term339753, 2, -1502899506);
        setIntElement(term339753, 3, 766384748);
        setIntElement(term339753, 4, -140846360);
        setIntElement(term339753, 5, 1443626029);
        setField(term339751, term339751.getClass(), "mag", term339753);
        setIntField(term339751, term339751.getClass(), "bitCountPlusOne", 0);
        setIntField(term339751, term339751.getClass(), "bitLengthPlusOne", 0);
        setIntField(term339751, term339751.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term339751, term339751.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term339750, term339750.getClass(), "intVal", term339751);
        setIntField(term339750, term339750.getClass(), "scale", 53);
        setIntField(term339750, term339750.getClass(), "precision", 0);
        setField(term339750, term339750.getClass(), "stringCache", null);
        setLongField(term339750, term339750.getClass(), "intCompact", -9223372036854775808L);
        setField(term339737, term339737.getClass(), "xrpBalance", term339750);
        setField(term339737, term339737.getClass(), "trustLines", term339767);
        setField(term339737, term339737.getClass(), "activationAddress", "LztrXeTaAH");
        setField(term339737, term339737.getClass(), "blackholed", term339788);
        term339790 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term339790;
        callMethod(klass, "setTrustLines", argTypes, term339737, args);
    }

};


