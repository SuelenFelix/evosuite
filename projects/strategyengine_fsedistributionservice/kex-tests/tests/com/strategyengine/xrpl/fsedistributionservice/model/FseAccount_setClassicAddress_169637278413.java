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

public class FseAccount_setClassicAddress_169637278413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term339509;

    public FseAccount_setClassicAddress_169637278413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term339541 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339541, term339541.getClass(), "classicAddress", "");
        setField(term339541, term339541.getClass(), "currency", "");
        setField(term339541, term339541.getClass(), "balance", "");
        setField(term339541, term339541.getClass(), "limit", "");
        Object term339546 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseTrustLine"));
        setField(term339546, term339546.getClass(), "classicAddress", "");
        setField(term339546, term339546.getClass(), "currency", "");
        setField(term339546, term339546.getClass(), "balance", "");
        setField(term339546, term339546.getClass(), "limit", "");
        ArrayList term339539 = new ArrayList();
        ((ArrayList) term339539).add(term339541);
        ((ArrayList) term339539).add(term339546);
        Boolean term339565 = new Boolean(false);
        term339509 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount"));
        Object term339522 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term339523 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term339525 = (int[]) newIntArray(6);
        setField(term339509, term339509.getClass(), "classicAddress", "tyfceKrVos");
        setIntField(term339523, term339523.getClass(), "signum", 1);
        setIntElement(term339525, 0, 1743);
        setIntElement(term339525, 1, 60842230);
        setIntElement(term339525, 2, -679232500);
        setIntElement(term339525, 3, -1607457205);
        setIntElement(term339525, 4, 1627904569);
        setIntElement(term339525, 5, 2032503891);
        setField(term339523, term339523.getClass(), "mag", term339525);
        setIntField(term339523, term339523.getClass(), "bitCountPlusOne", 0);
        setIntField(term339523, term339523.getClass(), "bitLengthPlusOne", 0);
        setIntField(term339523, term339523.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term339523, term339523.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term339522, term339522.getClass(), "intVal", term339523);
        setIntField(term339522, term339522.getClass(), "scale", 52);
        setIntField(term339522, term339522.getClass(), "precision", 0);
        setField(term339522, term339522.getClass(), "stringCache", null);
        setLongField(term339522, term339522.getClass(), "intCompact", -9223372036854775808L);
        setField(term339509, term339509.getClass(), "xrpBalance", term339522);
        setField(term339509, term339509.getClass(), "trustLines", term339539);
        setField(term339509, term339509.getClass(), "activationAddress", "TzJKUbeSkU");
        setField(term339509, term339509.getClass(), "blackholed", term339565);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FseAccount");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lcNxBgxdPz";
        callMethod(klass, "setClassicAddress", argTypes, term339509, args);
    }

};


