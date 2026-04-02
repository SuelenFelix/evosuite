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

public class FseAccount_FseAccountBuilder_xrpBalance_21278873242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77876;
     Object term77934;

    public FseAccount_FseAccountBuilder_xrpBalance_21278873242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term77908 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term77908, term77908.getClass(), "classicAddress", "");
        setField(term77908, term77908.getClass(), "currency", "");
        setField(term77908, term77908.getClass(), "balance", "");
        setField(term77908, term77908.getClass(), "limit", "");
        Object term77913 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term77913, term77913.getClass(), "classicAddress", "");
        setField(term77913, term77913.getClass(), "currency", "");
        setField(term77913, term77913.getClass(), "balance", "");
        setField(term77913, term77913.getClass(), "limit", "");
        ArrayList term77906 = new ArrayList();
        ((ArrayList) term77906).add(term77908);
        ((ArrayList) term77906).add(term77913);
        Boolean term77932 = new Boolean(false);
        term77876 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount$FseAccountBuilder"));
        Object term77889 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term77890 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term77892 = (int[]) newIntArray(6);
        setField(term77876, term77876.getClass(), "classicAddress", "gSAtqakaLY");
        setIntField(term77890, term77890.getClass(), "signum", 1);
        setIntElement(term77892, 0, 2364);
        setIntElement(term77892, 1, -1446584625);
        setIntElement(term77892, 2, 1957600567);
        setIntElement(term77892, 3, -336418707);
        setIntElement(term77892, 4, -1905211145);
        setIntElement(term77892, 5, 86968353);
        setField(term77890, term77890.getClass(), "mag", term77892);
        setIntField(term77890, term77890.getClass(), "bitCountPlusOne", 0);
        setIntField(term77890, term77890.getClass(), "bitLengthPlusOne", 0);
        setIntField(term77890, term77890.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term77890, term77890.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term77889, term77889.getClass(), "intVal", term77890);
        setIntField(term77889, term77889.getClass(), "scale", 52);
        setIntField(term77889, term77889.getClass(), "precision", 0);
        setField(term77889, term77889.getClass(), "stringCache", null);
        setLongField(term77889, term77889.getClass(), "intCompact", -9223372036854775808L);
        setField(term77876, term77876.getClass(), "xrpBalance", term77889);
        setField(term77876, term77876.getClass(), "trustLines", term77906);
        setField(term77876, term77876.getClass(), "activationAddress", "SPQVzOlOzZ");
        setField(term77876, term77876.getClass(), "blackholed", term77932);
        term77934 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term77935 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term77937 = (int[]) newIntArray(6);
        setIntField(term77935, term77935.getClass(), "signum", 1);
        setIntElement(term77937, 0, 3779);
        setIntElement(term77937, 1, 1825499203);
        setIntElement(term77937, 2, 189827582);
        setIntElement(term77937, 3, 731025545);
        setIntElement(term77937, 4, -475097163);
        setIntElement(term77937, 5, 890127363);
        setField(term77935, term77935.getClass(), "mag", term77937);
        setIntField(term77935, term77935.getClass(), "bitCountPlusOne", 0);
        setIntField(term77935, term77935.getClass(), "bitLengthPlusOne", 0);
        setIntField(term77935, term77935.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term77935, term77935.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term77934, term77934.getClass(), "intVal", term77935);
        setIntField(term77934, term77934.getClass(), "scale", 52);
        setIntField(term77934, term77934.getClass(), "precision", 0);
        setField(term77934, term77934.getClass(), "stringCache", null);
        setLongField(term77934, term77934.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount$FseAccountBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term77934;
        callMethod(klass, "xrpBalance", argTypes, term77876, args);
    }

};


