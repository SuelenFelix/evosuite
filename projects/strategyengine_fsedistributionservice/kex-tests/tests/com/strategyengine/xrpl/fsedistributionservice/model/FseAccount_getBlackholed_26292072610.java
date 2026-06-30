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

public class FseAccount_getBlackholed_26292072610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term339227;

    public FseAccount_getBlackholed_26292072610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term339259 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339259, term339259.getClass(), "classicAddress", "");
        setField(term339259, term339259.getClass(), "currency", "");
        setField(term339259, term339259.getClass(), "balance", "");
        setField(term339259, term339259.getClass(), "limit", "");
        Object term339264 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339264, term339264.getClass(), "classicAddress", "");
        setField(term339264, term339264.getClass(), "currency", "");
        setField(term339264, term339264.getClass(), "balance", "");
        setField(term339264, term339264.getClass(), "limit", "");
        Object term339269 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339269, term339269.getClass(), "classicAddress", "");
        setField(term339269, term339269.getClass(), "currency", "");
        setField(term339269, term339269.getClass(), "balance", "");
        setField(term339269, term339269.getClass(), "limit", "");
        Object term339274 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339274, term339274.getClass(), "classicAddress", "");
        setField(term339274, term339274.getClass(), "currency", "");
        setField(term339274, term339274.getClass(), "balance", "");
        setField(term339274, term339274.getClass(), "limit", "");
        Object term339279 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339279, term339279.getClass(), "classicAddress", "");
        setField(term339279, term339279.getClass(), "currency", "");
        setField(term339279, term339279.getClass(), "balance", "");
        setField(term339279, term339279.getClass(), "limit", "");
        Object term339284 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339284, term339284.getClass(), "classicAddress", "");
        setField(term339284, term339284.getClass(), "currency", "");
        setField(term339284, term339284.getClass(), "balance", "");
        setField(term339284, term339284.getClass(), "limit", "");
        Object term339289 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339289, term339289.getClass(), "classicAddress", "");
        setField(term339289, term339289.getClass(), "currency", "");
        setField(term339289, term339289.getClass(), "balance", "");
        setField(term339289, term339289.getClass(), "limit", "");
        Object term339294 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339294, term339294.getClass(), "classicAddress", "");
        setField(term339294, term339294.getClass(), "currency", "");
        setField(term339294, term339294.getClass(), "balance", "");
        setField(term339294, term339294.getClass(), "limit", "");
        ArrayList term339257 = new ArrayList();
        ((ArrayList) term339257).add(term339259);
        ((ArrayList) term339257).add(term339264);
        ((ArrayList) term339257).add(term339269);
        ((ArrayList) term339257).add(term339274);
        ((ArrayList) term339257).add(term339279);
        ((ArrayList) term339257).add(term339284);
        ((ArrayList) term339257).add(term339289);
        ((ArrayList) term339257).add(term339294);
        Boolean term339313 = new Boolean(true);
        term339227 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount"));
        Object term339240 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term339241 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term339243 = (int[]) newIntArray(6);
        setField(term339227, term339227.getClass(), "classicAddress", "aLyUXyVGbN");
        setIntField(term339241, term339241.getClass(), "signum", 1);
        setIntElement(term339243, 0, 4579);
        setIntElement(term339243, 1, -1472146082);
        setIntElement(term339243, 2, -137323465);
        setIntElement(term339243, 3, 268301640);
        setIntElement(term339243, 4, -1691053033);
        setIntElement(term339243, 5, 379993133);
        setField(term339241, term339241.getClass(), "mag", term339243);
        setIntField(term339241, term339241.getClass(), "bitCountPlusOne", 0);
        setIntField(term339241, term339241.getClass(), "bitLengthPlusOne", 0);
        setIntField(term339241, term339241.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term339241, term339241.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term339240, term339240.getClass(), "intVal", term339241);
        setIntField(term339240, term339240.getClass(), "scale", 52);
        setIntField(term339240, term339240.getClass(), "precision", 0);
        setField(term339240, term339240.getClass(), "stringCache", null);
        setLongField(term339240, term339240.getClass(), "intCompact", -9223372036854775808L);
        setField(term339227, term339227.getClass(), "xrpBalance", term339240);
        setField(term339227, term339227.getClass(), "trustLines", term339257);
        setField(term339227, term339227.getClass(), "activationAddress", "bJOmNlfxjj");
        setField(term339227, term339227.getClass(), "blackholed", term339313);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBlackholed", argTypes, term339227, args);
    }

};


