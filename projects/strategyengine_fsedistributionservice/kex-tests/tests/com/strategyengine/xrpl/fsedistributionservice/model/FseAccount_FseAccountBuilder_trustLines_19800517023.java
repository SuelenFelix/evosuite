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
import java.util.LinkedList;

public class FseAccount_FseAccountBuilder_trustLines_19800517023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77983;
     Object term78046;

    public FseAccount_FseAccountBuilder_trustLines_19800517023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term78015 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term78015, term78015.getClass(), "classicAddress", "");
        setField(term78015, term78015.getClass(), "currency", "");
        setField(term78015, term78015.getClass(), "balance", "");
        setField(term78015, term78015.getClass(), "limit", "");
        Object term78020 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term78020, term78020.getClass(), "classicAddress", "");
        setField(term78020, term78020.getClass(), "currency", "");
        setField(term78020, term78020.getClass(), "balance", "");
        setField(term78020, term78020.getClass(), "limit", "");
        Object term78025 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term78025, term78025.getClass(), "classicAddress", "");
        setField(term78025, term78025.getClass(), "currency", "");
        setField(term78025, term78025.getClass(), "balance", "");
        setField(term78025, term78025.getClass(), "limit", "");
        ArrayList term78013 = new ArrayList();
        ((ArrayList) term78013).add(term78015);
        ((ArrayList) term78013).add(term78020);
        ((ArrayList) term78013).add(term78025);
        Boolean term78044 = new Boolean(false);
        term77983 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount$FseAccountBuilder"));
        Object term77996 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term77997 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term77999 = (int[]) newIntArray(6);
        setField(term77983, term77983.getClass(), "classicAddress", "bOUAgAptAI");
        setIntField(term77997, term77997.getClass(), "signum", 1);
        setIntElement(term77999, 0, 3726);
        setIntElement(term77999, 1, 1561510548);
        setIntElement(term77999, 2, 756973629);
        setIntElement(term77999, 3, -1169068666);
        setIntElement(term77999, 4, -1772498162);
        setIntElement(term77999, 5, -1207241473);
        setField(term77997, term77997.getClass(), "mag", term77999);
        setIntField(term77997, term77997.getClass(), "bitCountPlusOne", 0);
        setIntField(term77997, term77997.getClass(), "bitLengthPlusOne", 0);
        setIntField(term77997, term77997.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term77997, term77997.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term77996, term77996.getClass(), "intVal", term77997);
        setIntField(term77996, term77996.getClass(), "scale", 52);
        setIntField(term77996, term77996.getClass(), "precision", 0);
        setField(term77996, term77996.getClass(), "stringCache", null);
        setLongField(term77996, term77996.getClass(), "intCompact", -9223372036854775808L);
        setField(term77983, term77983.getClass(), "xrpBalance", term77996);
        setField(term77983, term77983.getClass(), "trustLines", term78013);
        setField(term77983, term77983.getClass(), "activationAddress", "FxSvJCIpul");
        setField(term77983, term77983.getClass(), "blackholed", term78044);
        term78046 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount$FseAccountBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term78046;
        callMethod(klass, "trustLines", argTypes, term77983, args);
    }

};


