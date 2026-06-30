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

public class FseAccount_getTrustLines_12897829868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term339039;

    public FseAccount_getTrustLines_12897829868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term339071 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339071, term339071.getClass(), "classicAddress", "");
        setField(term339071, term339071.getClass(), "currency", "");
        setField(term339071, term339071.getClass(), "balance", "");
        setField(term339071, term339071.getClass(), "limit", "");
        Object term339076 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339076, term339076.getClass(), "classicAddress", "");
        setField(term339076, term339076.getClass(), "currency", "");
        setField(term339076, term339076.getClass(), "balance", "");
        setField(term339076, term339076.getClass(), "limit", "");
        Object term339081 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339081, term339081.getClass(), "classicAddress", "");
        setField(term339081, term339081.getClass(), "currency", "");
        setField(term339081, term339081.getClass(), "balance", "");
        setField(term339081, term339081.getClass(), "limit", "");
        Object term339086 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339086, term339086.getClass(), "classicAddress", "");
        setField(term339086, term339086.getClass(), "currency", "");
        setField(term339086, term339086.getClass(), "balance", "");
        setField(term339086, term339086.getClass(), "limit", "");
        Object term339091 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339091, term339091.getClass(), "classicAddress", "");
        setField(term339091, term339091.getClass(), "currency", "");
        setField(term339091, term339091.getClass(), "balance", "");
        setField(term339091, term339091.getClass(), "limit", "");
        Object term339096 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339096, term339096.getClass(), "classicAddress", "");
        setField(term339096, term339096.getClass(), "currency", "");
        setField(term339096, term339096.getClass(), "balance", "");
        setField(term339096, term339096.getClass(), "limit", "");
        ArrayList term339069 = new ArrayList();
        ((ArrayList) term339069).add(term339071);
        ((ArrayList) term339069).add(term339076);
        ((ArrayList) term339069).add(term339081);
        ((ArrayList) term339069).add(term339086);
        ((ArrayList) term339069).add(term339091);
        ((ArrayList) term339069).add(term339096);
        Boolean term339115 = new Boolean(false);
        term339039 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount"));
        Object term339052 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term339053 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term339055 = (int[]) newIntArray(6);
        setField(term339039, term339039.getClass(), "classicAddress", "ZOCWqGoFBI");
        setIntField(term339053, term339053.getClass(), "signum", 1);
        setIntElement(term339055, 0, 48217);
        setIntElement(term339055, 1, 1542340153);
        setIntElement(term339055, 2, -337283179);
        setIntElement(term339055, 3, 126048541);
        setIntElement(term339055, 4, 1007604812);
        setIntElement(term339055, 5, -1994095901);
        setField(term339053, term339053.getClass(), "mag", term339055);
        setIntField(term339053, term339053.getClass(), "bitCountPlusOne", 0);
        setIntField(term339053, term339053.getClass(), "bitLengthPlusOne", 0);
        setIntField(term339053, term339053.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term339053, term339053.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term339052, term339052.getClass(), "intVal", term339053);
        setIntField(term339052, term339052.getClass(), "scale", 53);
        setIntField(term339052, term339052.getClass(), "precision", 0);
        setField(term339052, term339052.getClass(), "stringCache", null);
        setLongField(term339052, term339052.getClass(), "intCompact", -9223372036854775808L);
        setField(term339039, term339039.getClass(), "xrpBalance", term339052);
        setField(term339039, term339039.getClass(), "trustLines", term339069);
        setField(term339039, term339039.getClass(), "activationAddress", "ITgJRrDzJt");
        setField(term339039, term339039.getClass(), "blackholed", term339115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrustLines", argTypes, term339039, args);
    }

};


