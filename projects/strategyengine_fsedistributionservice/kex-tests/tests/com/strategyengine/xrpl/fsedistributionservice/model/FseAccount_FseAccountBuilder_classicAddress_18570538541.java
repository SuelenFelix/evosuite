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

public class FseAccount_FseAccountBuilder_classicAddress_18570538541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77755;

    public FseAccount_FseAccountBuilder_classicAddress_18570538541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term77787 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term77787, term77787.getClass(), "classicAddress", "");
        setField(term77787, term77787.getClass(), "currency", "");
        setField(term77787, term77787.getClass(), "balance", "");
        setField(term77787, term77787.getClass(), "limit", "");
        Object term77792 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term77792, term77792.getClass(), "classicAddress", "");
        setField(term77792, term77792.getClass(), "currency", "");
        setField(term77792, term77792.getClass(), "balance", "");
        setField(term77792, term77792.getClass(), "limit", "");
        Object term77797 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term77797, term77797.getClass(), "classicAddress", "");
        setField(term77797, term77797.getClass(), "currency", "");
        setField(term77797, term77797.getClass(), "balance", "");
        setField(term77797, term77797.getClass(), "limit", "");
        Object term77802 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term77802, term77802.getClass(), "classicAddress", "");
        setField(term77802, term77802.getClass(), "currency", "");
        setField(term77802, term77802.getClass(), "balance", "");
        setField(term77802, term77802.getClass(), "limit", "");
        Object term77807 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term77807, term77807.getClass(), "classicAddress", "");
        setField(term77807, term77807.getClass(), "currency", "");
        setField(term77807, term77807.getClass(), "balance", "");
        setField(term77807, term77807.getClass(), "limit", "");
        ArrayList term77785 = new ArrayList();
        ((ArrayList) term77785).add(term77787);
        ((ArrayList) term77785).add(term77792);
        ((ArrayList) term77785).add(term77797);
        ((ArrayList) term77785).add(term77802);
        ((ArrayList) term77785).add(term77807);
        Boolean term77826 = new Boolean(false);
        term77755 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount$FseAccountBuilder"));
        Object term77768 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term77769 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term77771 = (int[]) newIntArray(6);
        setField(term77755, term77755.getClass(), "classicAddress", "VYvbTGKslj");
        setIntField(term77769, term77769.getClass(), "signum", 1);
        setIntElement(term77771, 0, 9058);
        setIntElement(term77771, 1, 1365043541);
        setIntElement(term77771, 2, 1239861896);
        setIntElement(term77771, 3, -1338148297);
        setIntElement(term77771, 4, -418263970);
        setIntElement(term77771, 5, -265097411);
        setField(term77769, term77769.getClass(), "mag", term77771);
        setIntField(term77769, term77769.getClass(), "bitCountPlusOne", 0);
        setIntField(term77769, term77769.getClass(), "bitLengthPlusOne", 0);
        setIntField(term77769, term77769.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term77769, term77769.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term77768, term77768.getClass(), "intVal", term77769);
        setIntField(term77768, term77768.getClass(), "scale", 53);
        setIntField(term77768, term77768.getClass(), "precision", 0);
        setField(term77768, term77768.getClass(), "stringCache", null);
        setLongField(term77768, term77768.getClass(), "intCompact", -9223372036854775808L);
        setField(term77755, term77755.getClass(), "xrpBalance", term77768);
        setField(term77755, term77755.getClass(), "trustLines", term77785);
        setField(term77755, term77755.getClass(), "activationAddress", "vQJUCtuYpK");
        setField(term77755, term77755.getClass(), "blackholed", term77826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount$FseAccountBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GHtOeztAdz";
        callMethod(klass, "classicAddress", argTypes, term77755, args);
    }

};


