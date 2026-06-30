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

public class FseAccount_canEqual_6411699343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338588;
     Object term338636;

    public FseAccount_canEqual_6411699343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term338618 = new ArrayList();
        Boolean term338634 = new Boolean(false);
        term338588 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount"));
        Object term338601 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term338602 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term338604 = (int[]) newIntArray(6);
        setField(term338588, term338588.getClass(), "classicAddress", "lYCXiqdVVs");
        setIntField(term338602, term338602.getClass(), "signum", 1);
        setIntElement(term338604, 0, 171);
        setIntElement(term338604, 1, 1002005769);
        setIntElement(term338604, 2, 1419995358);
        setIntElement(term338604, 3, 283149832);
        setIntElement(term338604, 4, 1208892480);
        setIntElement(term338604, 5, -1348324361);
        setField(term338602, term338602.getClass(), "mag", term338604);
        setIntField(term338602, term338602.getClass(), "bitCountPlusOne", 0);
        setIntField(term338602, term338602.getClass(), "bitLengthPlusOne", 0);
        setIntField(term338602, term338602.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term338602, term338602.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term338601, term338601.getClass(), "intVal", term338602);
        setIntField(term338601, term338601.getClass(), "scale", 51);
        setIntField(term338601, term338601.getClass(), "precision", 0);
        setField(term338601, term338601.getClass(), "stringCache", null);
        setLongField(term338601, term338601.getClass(), "intCompact", -9223372036854775808L);
        setField(term338588, term338588.getClass(), "xrpBalance", term338601);
        setField(term338588, term338588.getClass(), "trustLines", term338618);
        setField(term338588, term338588.getClass(), "activationAddress", "AwEMMAveFP");
        setField(term338588, term338588.getClass(), "blackholed", term338634);
        term338636 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term338636;
        callMethod(klass, "canEqual", argTypes, term338588, args);
    }

};


