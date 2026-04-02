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

public class FseAccount_FseAccountBuilder_build_6250177176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78287;

    public FseAccount_FseAccountBuilder_build_6250177176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term78319 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term78319, term78319.getClass(), "classicAddress", "");
        setField(term78319, term78319.getClass(), "currency", "");
        setField(term78319, term78319.getClass(), "balance", "");
        setField(term78319, term78319.getClass(), "limit", "");
        Object term78324 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term78324, term78324.getClass(), "classicAddress", "");
        setField(term78324, term78324.getClass(), "currency", "");
        setField(term78324, term78324.getClass(), "balance", "");
        setField(term78324, term78324.getClass(), "limit", "");
        Object term78329 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term78329, term78329.getClass(), "classicAddress", "");
        setField(term78329, term78329.getClass(), "currency", "");
        setField(term78329, term78329.getClass(), "balance", "");
        setField(term78329, term78329.getClass(), "limit", "");
        Object term78334 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term78334, term78334.getClass(), "classicAddress", "");
        setField(term78334, term78334.getClass(), "currency", "");
        setField(term78334, term78334.getClass(), "balance", "");
        setField(term78334, term78334.getClass(), "limit", "");
        Object term78339 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term78339, term78339.getClass(), "classicAddress", "");
        setField(term78339, term78339.getClass(), "currency", "");
        setField(term78339, term78339.getClass(), "balance", "");
        setField(term78339, term78339.getClass(), "limit", "");
        ArrayList term78317 = new ArrayList();
        ((ArrayList) term78317).add(term78319);
        ((ArrayList) term78317).add(term78324);
        ((ArrayList) term78317).add(term78329);
        ((ArrayList) term78317).add(term78334);
        ((ArrayList) term78317).add(term78339);
        Boolean term78358 = new Boolean(true);
        term78287 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount$FseAccountBuilder"));
        Object term78300 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term78301 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term78303 = (int[]) newIntArray(6);
        setField(term78287, term78287.getClass(), "classicAddress", "kEehLMZcOU");
        setIntField(term78301, term78301.getClass(), "signum", 1);
        setIntElement(term78303, 0, 1807);
        setIntElement(term78303, 1, 1210968587);
        setIntElement(term78303, 2, -857410878);
        setIntElement(term78303, 3, 520383771);
        setIntElement(term78303, 4, 2106706510);
        setIntElement(term78303, 5, 1731185477);
        setField(term78301, term78301.getClass(), "mag", term78303);
        setIntField(term78301, term78301.getClass(), "bitCountPlusOne", 0);
        setIntField(term78301, term78301.getClass(), "bitLengthPlusOne", 0);
        setIntField(term78301, term78301.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term78301, term78301.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term78300, term78300.getClass(), "intVal", term78301);
        setIntField(term78300, term78300.getClass(), "scale", 52);
        setIntField(term78300, term78300.getClass(), "precision", 0);
        setField(term78300, term78300.getClass(), "stringCache", null);
        setLongField(term78300, term78300.getClass(), "intCompact", -9223372036854775808L);
        setField(term78287, term78287.getClass(), "xrpBalance", term78300);
        setField(term78287, term78287.getClass(), "trustLines", term78317);
        setField(term78287, term78287.getClass(), "activationAddress", "dTGwgkfDVj");
        setField(term78287, term78287.getClass(), "blackholed", term78358);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount$FseAccountBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term78287, args);
    }

};


