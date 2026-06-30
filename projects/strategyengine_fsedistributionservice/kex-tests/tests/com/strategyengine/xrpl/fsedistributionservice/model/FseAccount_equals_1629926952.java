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

public class FseAccount_equals_1629926952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338478;
     Object term338561;

    public FseAccount_equals_1629926952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term338510 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term338510, term338510.getClass(), "classicAddress", "");
        setField(term338510, term338510.getClass(), "currency", "");
        setField(term338510, term338510.getClass(), "balance", "");
        setField(term338510, term338510.getClass(), "limit", "");
        Object term338515 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term338515, term338515.getClass(), "classicAddress", "");
        setField(term338515, term338515.getClass(), "currency", "");
        setField(term338515, term338515.getClass(), "balance", "");
        setField(term338515, term338515.getClass(), "limit", "");
        Object term338520 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term338520, term338520.getClass(), "classicAddress", "");
        setField(term338520, term338520.getClass(), "currency", "");
        setField(term338520, term338520.getClass(), "balance", "");
        setField(term338520, term338520.getClass(), "limit", "");
        Object term338525 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term338525, term338525.getClass(), "classicAddress", "");
        setField(term338525, term338525.getClass(), "currency", "");
        setField(term338525, term338525.getClass(), "balance", "");
        setField(term338525, term338525.getClass(), "limit", "");
        Object term338530 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term338530, term338530.getClass(), "classicAddress", "");
        setField(term338530, term338530.getClass(), "currency", "");
        setField(term338530, term338530.getClass(), "balance", "");
        setField(term338530, term338530.getClass(), "limit", "");
        Object term338535 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term338535, term338535.getClass(), "classicAddress", "");
        setField(term338535, term338535.getClass(), "currency", "");
        setField(term338535, term338535.getClass(), "balance", "");
        setField(term338535, term338535.getClass(), "limit", "");
        Object term338540 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term338540, term338540.getClass(), "classicAddress", "");
        setField(term338540, term338540.getClass(), "currency", "");
        setField(term338540, term338540.getClass(), "balance", "");
        setField(term338540, term338540.getClass(), "limit", "");
        ArrayList term338508 = new ArrayList();
        ((ArrayList) term338508).add(term338510);
        ((ArrayList) term338508).add(term338515);
        ((ArrayList) term338508).add(term338520);
        ((ArrayList) term338508).add(term338525);
        ((ArrayList) term338508).add(term338530);
        ((ArrayList) term338508).add(term338535);
        ((ArrayList) term338508).add(term338540);
        Boolean term338559 = new Boolean(true);
        term338478 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount"));
        Object term338491 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term338492 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term338494 = (int[]) newIntArray(6);
        setField(term338478, term338478.getClass(), "classicAddress", "yKNhWIXreq");
        setIntField(term338492, term338492.getClass(), "signum", 1);
        setIntElement(term338494, 0, 35438);
        setIntElement(term338494, 1, 1464672276);
        setIntElement(term338494, 2, 2105366875);
        setIntElement(term338494, 3, -1732931527);
        setIntElement(term338494, 4, 1812340004);
        setIntElement(term338494, 5, 254550143);
        setField(term338492, term338492.getClass(), "mag", term338494);
        setIntField(term338492, term338492.getClass(), "bitCountPlusOne", 0);
        setIntField(term338492, term338492.getClass(), "bitLengthPlusOne", 0);
        setIntField(term338492, term338492.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term338492, term338492.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term338491, term338491.getClass(), "intVal", term338492);
        setIntField(term338491, term338491.getClass(), "scale", 53);
        setIntField(term338491, term338491.getClass(), "precision", 0);
        setField(term338491, term338491.getClass(), "stringCache", null);
        setLongField(term338491, term338491.getClass(), "intCompact", -9223372036854775808L);
        setField(term338478, term338478.getClass(), "xrpBalance", term338491);
        setField(term338478, term338478.getClass(), "trustLines", term338508);
        setField(term338478, term338478.getClass(), "activationAddress", "ePMStkWVSW");
        setField(term338478, term338478.getClass(), "blackholed", term338559);
        term338561 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term338561;
        callMethod(klass, "equals", argTypes, term338478, args);
    }

};


