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

public class FseAccount_setBlackholed_135661023617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term339950;
     Object term340028;

    public FseAccount_setBlackholed_135661023617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term339982 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339982, term339982.getClass(), "classicAddress", "");
        setField(term339982, term339982.getClass(), "currency", "");
        setField(term339982, term339982.getClass(), "balance", "");
        setField(term339982, term339982.getClass(), "limit", "");
        Object term339987 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339987, term339987.getClass(), "classicAddress", "");
        setField(term339987, term339987.getClass(), "currency", "");
        setField(term339987, term339987.getClass(), "balance", "");
        setField(term339987, term339987.getClass(), "limit", "");
        Object term339992 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339992, term339992.getClass(), "classicAddress", "");
        setField(term339992, term339992.getClass(), "currency", "");
        setField(term339992, term339992.getClass(), "balance", "");
        setField(term339992, term339992.getClass(), "limit", "");
        Object term339997 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339997, term339997.getClass(), "classicAddress", "");
        setField(term339997, term339997.getClass(), "currency", "");
        setField(term339997, term339997.getClass(), "balance", "");
        setField(term339997, term339997.getClass(), "limit", "");
        Object term340002 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term340002, term340002.getClass(), "classicAddress", "");
        setField(term340002, term340002.getClass(), "currency", "");
        setField(term340002, term340002.getClass(), "balance", "");
        setField(term340002, term340002.getClass(), "limit", "");
        Object term340007 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term340007, term340007.getClass(), "classicAddress", "");
        setField(term340007, term340007.getClass(), "currency", "");
        setField(term340007, term340007.getClass(), "balance", "");
        setField(term340007, term340007.getClass(), "limit", "");
        ArrayList term339980 = new ArrayList();
        ((ArrayList) term339980).add(term339982);
        ((ArrayList) term339980).add(term339987);
        ((ArrayList) term339980).add(term339992);
        ((ArrayList) term339980).add(term339997);
        ((ArrayList) term339980).add(term340002);
        ((ArrayList) term339980).add(term340007);
        Boolean term340026 = new Boolean(true);
        term339950 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount"));
        Object term339963 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term339964 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term339966 = (int[]) newIntArray(6);
        setField(term339950, term339950.getClass(), "classicAddress", "jZSTuVeJwm");
        setIntField(term339964, term339964.getClass(), "signum", 1);
        setIntElement(term339966, 0, 53471);
        setIntElement(term339966, 1, 2036644225);
        setIntElement(term339966, 2, -1845173366);
        setIntElement(term339966, 3, 1860881689);
        setIntElement(term339966, 4, 1373853167);
        setIntElement(term339966, 5, 393320493);
        setField(term339964, term339964.getClass(), "mag", term339966);
        setIntField(term339964, term339964.getClass(), "bitCountPlusOne", 0);
        setIntField(term339964, term339964.getClass(), "bitLengthPlusOne", 0);
        setIntField(term339964, term339964.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term339964, term339964.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term339963, term339963.getClass(), "intVal", term339964);
        setIntField(term339963, term339963.getClass(), "scale", 53);
        setIntField(term339963, term339963.getClass(), "precision", 0);
        setField(term339963, term339963.getClass(), "stringCache", null);
        setLongField(term339963, term339963.getClass(), "intCompact", -9223372036854775808L);
        setField(term339950, term339950.getClass(), "xrpBalance", term339963);
        setField(term339950, term339950.getClass(), "trustLines", term339980);
        setField(term339950, term339950.getClass(), "activationAddress", "tEgVTQbEmh");
        setField(term339950, term339950.getClass(), "blackholed", term340026);
        term340028 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term340028;
        callMethod(klass, "setBlackholed", argTypes, term339950, args);
    }

};


