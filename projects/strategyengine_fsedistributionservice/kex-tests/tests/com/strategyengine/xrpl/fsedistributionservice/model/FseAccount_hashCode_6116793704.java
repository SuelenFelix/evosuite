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

public class FseAccount_hashCode_6116793704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338663;

    public FseAccount_hashCode_6116793704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term338693 = new ArrayList();
        Boolean term338709 = new Boolean(true);
        term338663 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount"));
        Object term338676 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term338677 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term338679 = (int[]) newIntArray(6);
        setField(term338663, term338663.getClass(), "classicAddress", "uILgJuNCYC");
        setIntField(term338677, term338677.getClass(), "signum", 1);
        setIntElement(term338679, 0, 1271);
        setIntElement(term338679, 1, 1531968024);
        setIntElement(term338679, 2, 2100139126);
        setIntElement(term338679, 3, -592724366);
        setIntElement(term338679, 4, -79056116);
        setIntElement(term338679, 5, -791097607);
        setField(term338677, term338677.getClass(), "mag", term338679);
        setIntField(term338677, term338677.getClass(), "bitCountPlusOne", 0);
        setIntField(term338677, term338677.getClass(), "bitLengthPlusOne", 0);
        setIntField(term338677, term338677.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term338677, term338677.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term338676, term338676.getClass(), "intVal", term338677);
        setIntField(term338676, term338676.getClass(), "scale", 52);
        setIntField(term338676, term338676.getClass(), "precision", 0);
        setField(term338676, term338676.getClass(), "stringCache", null);
        setLongField(term338676, term338676.getClass(), "intCompact", -9223372036854775808L);
        setField(term338663, term338663.getClass(), "xrpBalance", term338676);
        setField(term338663, term338663.getClass(), "trustLines", term338693);
        setField(term338663, term338663.getClass(), "activationAddress", "gUkbWFfDwB");
        setField(term338663, term338663.getClass(), "blackholed", term338709);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term338663, args);
    }

};


