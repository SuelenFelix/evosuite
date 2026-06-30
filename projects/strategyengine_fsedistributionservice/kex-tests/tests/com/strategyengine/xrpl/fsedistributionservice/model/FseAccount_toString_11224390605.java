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

public class FseAccount_toString_11224390605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338737;

    public FseAccount_toString_11224390605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term338769 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term338769, term338769.getClass(), "classicAddress", "");
        setField(term338769, term338769.getClass(), "currency", "");
        setField(term338769, term338769.getClass(), "balance", "");
        setField(term338769, term338769.getClass(), "limit", "");
        Object term338774 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term338774, term338774.getClass(), "classicAddress", "");
        setField(term338774, term338774.getClass(), "currency", "");
        setField(term338774, term338774.getClass(), "balance", "");
        setField(term338774, term338774.getClass(), "limit", "");
        Object term338779 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term338779, term338779.getClass(), "classicAddress", "");
        setField(term338779, term338779.getClass(), "currency", "");
        setField(term338779, term338779.getClass(), "balance", "");
        setField(term338779, term338779.getClass(), "limit", "");
        Object term338784 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term338784, term338784.getClass(), "classicAddress", "");
        setField(term338784, term338784.getClass(), "currency", "");
        setField(term338784, term338784.getClass(), "balance", "");
        setField(term338784, term338784.getClass(), "limit", "");
        Object term338789 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term338789, term338789.getClass(), "classicAddress", "");
        setField(term338789, term338789.getClass(), "currency", "");
        setField(term338789, term338789.getClass(), "balance", "");
        setField(term338789, term338789.getClass(), "limit", "");
        Object term338794 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term338794, term338794.getClass(), "classicAddress", "");
        setField(term338794, term338794.getClass(), "currency", "");
        setField(term338794, term338794.getClass(), "balance", "");
        setField(term338794, term338794.getClass(), "limit", "");
        Object term338799 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term338799, term338799.getClass(), "classicAddress", "");
        setField(term338799, term338799.getClass(), "currency", "");
        setField(term338799, term338799.getClass(), "balance", "");
        setField(term338799, term338799.getClass(), "limit", "");
        ArrayList term338767 = new ArrayList();
        ((ArrayList) term338767).add(term338769);
        ((ArrayList) term338767).add(term338774);
        ((ArrayList) term338767).add(term338779);
        ((ArrayList) term338767).add(term338784);
        ((ArrayList) term338767).add(term338789);
        ((ArrayList) term338767).add(term338794);
        ((ArrayList) term338767).add(term338799);
        Boolean term338818 = new Boolean(false);
        term338737 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount"));
        Object term338750 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term338751 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term338753 = (int[]) newIntArray(6);
        setField(term338737, term338737.getClass(), "classicAddress", "kTamONbRjQ");
        setIntField(term338751, term338751.getClass(), "signum", 1);
        setIntElement(term338753, 0, 1669);
        setIntElement(term338753, 1, -29644889);
        setIntElement(term338753, 2, 1276870570);
        setIntElement(term338753, 3, 2035099812);
        setIntElement(term338753, 4, 2095479703);
        setIntElement(term338753, 5, -1048180257);
        setField(term338751, term338751.getClass(), "mag", term338753);
        setIntField(term338751, term338751.getClass(), "bitCountPlusOne", 0);
        setIntField(term338751, term338751.getClass(), "bitLengthPlusOne", 0);
        setIntField(term338751, term338751.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term338751, term338751.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term338750, term338750.getClass(), "intVal", term338751);
        setIntField(term338750, term338750.getClass(), "scale", 52);
        setIntField(term338750, term338750.getClass(), "precision", 0);
        setField(term338750, term338750.getClass(), "stringCache", null);
        setLongField(term338750, term338750.getClass(), "intCompact", -9223372036854775808L);
        setField(term338737, term338737.getClass(), "xrpBalance", term338750);
        setField(term338737, term338737.getClass(), "trustLines", term338767);
        setField(term338737, term338737.getClass(), "activationAddress", "AarWepexbz");
        setField(term338737, term338737.getClass(), "blackholed", term338818);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term338737, args);
    }

};


