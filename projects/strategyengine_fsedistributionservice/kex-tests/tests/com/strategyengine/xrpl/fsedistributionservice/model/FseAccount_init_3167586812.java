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
import java.util.LinkedList;
import java.lang.Boolean;

public class FseAccount_init_3167586812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term339353;
     Object term339370;
     Object term339441;

    public FseAccount_init_3167586812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term339353 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term339354 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term339356 = (int[]) newIntArray(6);
        setIntField(term339354, term339354.getClass(), "signum", 1);
        setIntElement(term339356, 0, 20272);
        setIntElement(term339356, 1, -999573806);
        setIntElement(term339356, 2, -732937699);
        setIntElement(term339356, 3, 531416799);
        setIntElement(term339356, 4, -1302077626);
        setIntElement(term339356, 5, 316098117);
        setField(term339354, term339354.getClass(), "mag", term339356);
        setIntField(term339354, term339354.getClass(), "bitCountPlusOne", 0);
        setIntField(term339354, term339354.getClass(), "bitLengthPlusOne", 0);
        setIntField(term339354, term339354.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term339354, term339354.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term339353, term339353.getClass(), "intVal", term339354);
        setIntField(term339353, term339353.getClass(), "scale", 53);
        setIntField(term339353, term339353.getClass(), "precision", 0);
        setField(term339353, term339353.getClass(), "stringCache", null);
        setLongField(term339353, term339353.getClass(), "intCompact", -9223372036854775808L);
        Object term339373 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339373, term339373.getClass(), "classicAddress", "jznZimNLoY");
        setField(term339373, term339373.getClass(), "currency", "DbfCXKwAyh");
        setField(term339373, term339373.getClass(), "balance", "QihtmYbuXW");
        setField(term339373, term339373.getClass(), "limit", "qNPBjOrBfH");
        Object term339423 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339423, term339423.getClass(), "classicAddress", "");
        setField(term339423, term339423.getClass(), "currency", "");
        setField(term339423, term339423.getClass(), "balance", "");
        setField(term339423, term339423.getClass(), "limit", "");
        term339370 = new LinkedList();
        ((LinkedList) term339370).add(term339373);
        ((LinkedList) term339370).add(term339423);
        term339441 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.math.BigDecimal");
        argTypes[2] = Class.forName("java.util.List");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[5];
        args[0] = "JSmvZTKhYV";
        args[1] = term339353;
        args[2] = term339370;
        args[3] = "ubvofxfseb";
        args[4] = term339441;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


