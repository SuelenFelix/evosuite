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

public class FseAccount_getActivationAddress_4859034329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term339143;

    public FseAccount_getActivationAddress_4859034329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term339175 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339175, term339175.getClass(), "classicAddress", "");
        setField(term339175, term339175.getClass(), "currency", "");
        setField(term339175, term339175.getClass(), "balance", "");
        setField(term339175, term339175.getClass(), "limit", "");
        Object term339180 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339180, term339180.getClass(), "classicAddress", "");
        setField(term339180, term339180.getClass(), "currency", "");
        setField(term339180, term339180.getClass(), "balance", "");
        setField(term339180, term339180.getClass(), "limit", "");
        ArrayList term339173 = new ArrayList();
        ((ArrayList) term339173).add(term339175);
        ((ArrayList) term339173).add(term339180);
        Boolean term339199 = new Boolean(true);
        term339143 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount"));
        Object term339156 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term339157 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term339159 = (int[]) newIntArray(6);
        setField(term339143, term339143.getClass(), "classicAddress", "oBFbmCpapG");
        setIntField(term339157, term339157.getClass(), "signum", 1);
        setIntElement(term339159, 0, 4719);
        setIntElement(term339159, 1, 370506004);
        setIntElement(term339159, 2, -1182097379);
        setIntElement(term339159, 3, -681126105);
        setIntElement(term339159, 4, -368480849);
        setIntElement(term339159, 5, 1925879727);
        setField(term339157, term339157.getClass(), "mag", term339159);
        setIntField(term339157, term339157.getClass(), "bitCountPlusOne", 0);
        setIntField(term339157, term339157.getClass(), "bitLengthPlusOne", 0);
        setIntField(term339157, term339157.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term339157, term339157.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term339156, term339156.getClass(), "intVal", term339157);
        setIntField(term339156, term339156.getClass(), "scale", 52);
        setIntField(term339156, term339156.getClass(), "precision", 0);
        setField(term339156, term339156.getClass(), "stringCache", null);
        setLongField(term339156, term339156.getClass(), "intCompact", -9223372036854775808L);
        setField(term339143, term339143.getClass(), "xrpBalance", term339156);
        setField(term339143, term339143.getClass(), "trustLines", term339173);
        setField(term339143, term339143.getClass(), "activationAddress", "MvvzPTyVSb");
        setField(term339143, term339143.getClass(), "blackholed", term339199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getActivationAddress", argTypes, term339143, args);
    }

};


