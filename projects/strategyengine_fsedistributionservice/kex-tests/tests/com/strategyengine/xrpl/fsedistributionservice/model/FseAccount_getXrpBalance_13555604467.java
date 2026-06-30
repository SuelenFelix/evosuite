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

public class FseAccount_getXrpBalance_13555604467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338935;

    public FseAccount_getXrpBalance_13555604467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term338967 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term338967, term338967.getClass(), "classicAddress", "");
        setField(term338967, term338967.getClass(), "currency", "");
        setField(term338967, term338967.getClass(), "balance", "");
        setField(term338967, term338967.getClass(), "limit", "");
        Object term338972 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term338972, term338972.getClass(), "classicAddress", "");
        setField(term338972, term338972.getClass(), "currency", "");
        setField(term338972, term338972.getClass(), "balance", "");
        setField(term338972, term338972.getClass(), "limit", "");
        Object term338977 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term338977, term338977.getClass(), "classicAddress", "");
        setField(term338977, term338977.getClass(), "currency", "");
        setField(term338977, term338977.getClass(), "balance", "");
        setField(term338977, term338977.getClass(), "limit", "");
        Object term338982 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term338982, term338982.getClass(), "classicAddress", "");
        setField(term338982, term338982.getClass(), "currency", "");
        setField(term338982, term338982.getClass(), "balance", "");
        setField(term338982, term338982.getClass(), "limit", "");
        Object term338987 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term338987, term338987.getClass(), "classicAddress", "");
        setField(term338987, term338987.getClass(), "currency", "");
        setField(term338987, term338987.getClass(), "balance", "");
        setField(term338987, term338987.getClass(), "limit", "");
        Object term338992 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term338992, term338992.getClass(), "classicAddress", "");
        setField(term338992, term338992.getClass(), "currency", "");
        setField(term338992, term338992.getClass(), "balance", "");
        setField(term338992, term338992.getClass(), "limit", "");
        ArrayList term338965 = new ArrayList();
        ((ArrayList) term338965).add(term338967);
        ((ArrayList) term338965).add(term338972);
        ((ArrayList) term338965).add(term338977);
        ((ArrayList) term338965).add(term338982);
        ((ArrayList) term338965).add(term338987);
        ((ArrayList) term338965).add(term338992);
        Boolean term339011 = new Boolean(false);
        term338935 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount"));
        Object term338948 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term338949 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term338951 = (int[]) newIntArray(6);
        setField(term338935, term338935.getClass(), "classicAddress", "ILpMVHBxyt");
        setIntField(term338949, term338949.getClass(), "signum", 1);
        setIntElement(term338951, 0, 3646);
        setIntElement(term338951, 1, -520226555);
        setIntElement(term338951, 2, -500867287);
        setIntElement(term338951, 3, 2058130326);
        setIntElement(term338951, 4, 630142228);
        setIntElement(term338951, 5, -1611343891);
        setField(term338949, term338949.getClass(), "mag", term338951);
        setIntField(term338949, term338949.getClass(), "bitCountPlusOne", 0);
        setIntField(term338949, term338949.getClass(), "bitLengthPlusOne", 0);
        setIntField(term338949, term338949.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term338949, term338949.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term338948, term338948.getClass(), "intVal", term338949);
        setIntField(term338948, term338948.getClass(), "scale", 52);
        setIntField(term338948, term338948.getClass(), "precision", 0);
        setField(term338948, term338948.getClass(), "stringCache", null);
        setLongField(term338948, term338948.getClass(), "intCompact", -9223372036854775808L);
        setField(term338935, term338935.getClass(), "xrpBalance", term338948);
        setField(term338935, term338935.getClass(), "trustLines", term338965);
        setField(term338935, term338935.getClass(), "activationAddress", "JXZfilbpmu");
        setField(term338935, term338935.getClass(), "blackholed", term339011);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getXrpBalance", argTypes, term338935, args);
    }

};


