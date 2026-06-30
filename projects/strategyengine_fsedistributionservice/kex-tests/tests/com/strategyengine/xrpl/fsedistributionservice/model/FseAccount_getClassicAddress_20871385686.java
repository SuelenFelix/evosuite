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

public class FseAccount_getClassicAddress_20871385686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338846;

    public FseAccount_getClassicAddress_20871385686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term338878 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term338878, term338878.getClass(), "classicAddress", "");
        setField(term338878, term338878.getClass(), "currency", "");
        setField(term338878, term338878.getClass(), "balance", "");
        setField(term338878, term338878.getClass(), "limit", "");
        Object term338883 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term338883, term338883.getClass(), "classicAddress", "");
        setField(term338883, term338883.getClass(), "currency", "");
        setField(term338883, term338883.getClass(), "balance", "");
        setField(term338883, term338883.getClass(), "limit", "");
        Object term338888 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term338888, term338888.getClass(), "classicAddress", "");
        setField(term338888, term338888.getClass(), "currency", "");
        setField(term338888, term338888.getClass(), "balance", "");
        setField(term338888, term338888.getClass(), "limit", "");
        ArrayList term338876 = new ArrayList();
        ((ArrayList) term338876).add(term338878);
        ((ArrayList) term338876).add(term338883);
        ((ArrayList) term338876).add(term338888);
        Boolean term338907 = new Boolean(true);
        term338846 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount"));
        Object term338859 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term338860 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term338862 = (int[]) newIntArray(6);
        setField(term338846, term338846.getClass(), "classicAddress", "XaYdQMGKRk");
        setIntField(term338860, term338860.getClass(), "signum", 1);
        setIntElement(term338862, 0, 545);
        setIntElement(term338862, 1, -688770266);
        setIntElement(term338862, 2, 1799312273);
        setIntElement(term338862, 3, -430724263);
        setIntElement(term338862, 4, 1287317652);
        setIntElement(term338862, 5, -1765317069);
        setField(term338860, term338860.getClass(), "mag", term338862);
        setIntField(term338860, term338860.getClass(), "bitCountPlusOne", 0);
        setIntField(term338860, term338860.getClass(), "bitLengthPlusOne", 0);
        setIntField(term338860, term338860.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term338860, term338860.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term338859, term338859.getClass(), "intVal", term338860);
        setIntField(term338859, term338859.getClass(), "scale", 51);
        setIntField(term338859, term338859.getClass(), "precision", 0);
        setField(term338859, term338859.getClass(), "stringCache", null);
        setLongField(term338859, term338859.getClass(), "intCompact", -9223372036854775808L);
        setField(term338846, term338846.getClass(), "xrpBalance", term338859);
        setField(term338846, term338846.getClass(), "trustLines", term338876);
        setField(term338846, term338846.getClass(), "activationAddress", "JgUbvEJCOI");
        setField(term338846, term338846.getClass(), "blackholed", term338907);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClassicAddress", argTypes, term338846, args);
    }

};


