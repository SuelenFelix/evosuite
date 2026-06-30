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

public class FseAccount_setXrpBalance_16052632214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term339615;
     Object term339688;

    public FseAccount_setXrpBalance_16052632214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term339647 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339647, term339647.getClass(), "classicAddress", "");
        setField(term339647, term339647.getClass(), "currency", "");
        setField(term339647, term339647.getClass(), "balance", "");
        setField(term339647, term339647.getClass(), "limit", "");
        Object term339652 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339652, term339652.getClass(), "classicAddress", "");
        setField(term339652, term339652.getClass(), "currency", "");
        setField(term339652, term339652.getClass(), "balance", "");
        setField(term339652, term339652.getClass(), "limit", "");
        Object term339657 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339657, term339657.getClass(), "classicAddress", "");
        setField(term339657, term339657.getClass(), "currency", "");
        setField(term339657, term339657.getClass(), "balance", "");
        setField(term339657, term339657.getClass(), "limit", "");
        Object term339662 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339662, term339662.getClass(), "classicAddress", "");
        setField(term339662, term339662.getClass(), "currency", "");
        setField(term339662, term339662.getClass(), "balance", "");
        setField(term339662, term339662.getClass(), "limit", "");
        Object term339667 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339667, term339667.getClass(), "classicAddress", "");
        setField(term339667, term339667.getClass(), "currency", "");
        setField(term339667, term339667.getClass(), "balance", "");
        setField(term339667, term339667.getClass(), "limit", "");
        ArrayList term339645 = new ArrayList();
        ((ArrayList) term339645).add(term339647);
        ((ArrayList) term339645).add(term339652);
        ((ArrayList) term339645).add(term339657);
        ((ArrayList) term339645).add(term339662);
        ((ArrayList) term339645).add(term339667);
        Boolean term339686 = new Boolean(true);
        term339615 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount"));
        Object term339628 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term339629 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term339631 = (int[]) newIntArray(6);
        setField(term339615, term339615.getClass(), "classicAddress", "tCJUSNFwrz");
        setIntField(term339629, term339629.getClass(), "signum", 1);
        setIntElement(term339631, 0, 68132);
        setIntElement(term339631, 1, -1862768422);
        setIntElement(term339631, 2, 15996450);
        setIntElement(term339631, 3, 1947624575);
        setIntElement(term339631, 4, -1065536589);
        setIntElement(term339631, 5, 1917689327);
        setField(term339629, term339629.getClass(), "mag", term339631);
        setIntField(term339629, term339629.getClass(), "bitCountPlusOne", 0);
        setIntField(term339629, term339629.getClass(), "bitLengthPlusOne", 0);
        setIntField(term339629, term339629.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term339629, term339629.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term339628, term339628.getClass(), "intVal", term339629);
        setIntField(term339628, term339628.getClass(), "scale", 53);
        setIntField(term339628, term339628.getClass(), "precision", 0);
        setField(term339628, term339628.getClass(), "stringCache", null);
        setLongField(term339628, term339628.getClass(), "intCompact", -9223372036854775808L);
        setField(term339615, term339615.getClass(), "xrpBalance", term339628);
        setField(term339615, term339615.getClass(), "trustLines", term339645);
        setField(term339615, term339615.getClass(), "activationAddress", "BRBhgpeeOx");
        setField(term339615, term339615.getClass(), "blackholed", term339686);
        term339688 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term339689 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term339691 = (int[]) newIntArray(6);
        setIntField(term339689, term339689.getClass(), "signum", 1);
        setIntElement(term339691, 0, 1146);
        setIntElement(term339691, 1, 2057873299);
        setIntElement(term339691, 2, -1444651278);
        setIntElement(term339691, 3, 730613957);
        setIntElement(term339691, 4, 1833198387);
        setIntElement(term339691, 5, -1532441123);
        setField(term339689, term339689.getClass(), "mag", term339691);
        setIntField(term339689, term339689.getClass(), "bitCountPlusOne", 0);
        setIntField(term339689, term339689.getClass(), "bitLengthPlusOne", 0);
        setIntField(term339689, term339689.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term339689, term339689.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term339688, term339688.getClass(), "intVal", term339689);
        setIntField(term339688, term339688.getClass(), "scale", 52);
        setIntField(term339688, term339688.getClass(), "precision", 0);
        setField(term339688, term339688.getClass(), "stringCache", null);
        setLongField(term339688, term339688.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term339688;
        callMethod(klass, "setXrpBalance", argTypes, term339615, args);
    }

};


