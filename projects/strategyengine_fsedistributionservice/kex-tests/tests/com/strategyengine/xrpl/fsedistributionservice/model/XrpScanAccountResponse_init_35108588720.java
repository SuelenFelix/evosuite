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
import java.lang.Long;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Boolean;

public class XrpScanAccountResponse_init_35108588720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term411678;
     Object term411692;
     Object term411742;
     Object term411759;
     Object term411761;
     Object term411763;
     Object term411778;
     Object term411793;

    public XrpScanAccountResponse_init_35108588720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term411678 = new Long(-5604785092434648765L);
        term411692 = new Integer(-1504890659);
        term411742 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term411743 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term411745 = (int[]) newIntArray(6);
        setIntField(term411743, term411743.getClass(), "signum", 1);
        setIntElement(term411745, 0, 21259);
        setIntElement(term411745, 1, -1931661962);
        setIntElement(term411745, 2, 1719194770);
        setIntElement(term411745, 3, -1496630850);
        setIntElement(term411745, 4, 814458559);
        setIntElement(term411745, 5, 2104237867);
        setField(term411743, term411743.getClass(), "mag", term411745);
        setIntField(term411743, term411743.getClass(), "bitCountPlusOne", 0);
        setIntField(term411743, term411743.getClass(), "bitLengthPlusOne", 0);
        setIntField(term411743, term411743.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term411743, term411743.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term411742, term411742.getClass(), "intVal", term411743);
        setIntField(term411742, term411742.getClass(), "scale", 53);
        setIntField(term411742, term411742.getClass(), "precision", 0);
        setField(term411742, term411742.getClass(), "stringCache", null);
        setLongField(term411742, term411742.getClass(), "intCompact", -9223372036854775808L);
        term411759 = newInstance(Class.forName("java.util.Date"));
        setLongField(term411759, term411759.getClass(), "fastTime", 1886895075609L);
        setField(term411759, term411759.getClass(), "cdate", null);
        term411761 = new Long(753843644992595899L);
        Boolean term411776 = new Boolean(true);
        term411763 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term411763, term411763.getClass(), "issuer", "FOXCMddxzQ");
        setField(term411763, term411763.getClass(), "kyc", term411776);
        Boolean term411791 = new Boolean(true);
        term411778 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term411778, term411778.getClass(), "issuer", "DtROYlXqCJ");
        setField(term411778, term411778.getClass(), "kyc", term411791);
        term411793 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse");
        Class<?>[] argTypes = new Class<?>[13];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.Integer");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = Class.forName("java.lang.String");
        argTypes[6] = Class.forName("java.lang.String");
        argTypes[7] = Class.forName("java.math.BigDecimal");
        argTypes[8] = Class.forName("java.util.Date");
        argTypes[9] = Class.forName("java.lang.Long");
        argTypes[10] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName");
        argTypes[11] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName");
        argTypes[12] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[13];
        args[0] = term411678;
        args[1] = "WAaABaGbvV";
        args[2] = term411692;
        args[3] = "UbtugtxjDH";
        args[4] = "jlcrHmfxgw";
        args[5] = "qshqyFDkaY";
        args[6] = "UTzAnQlNUZ";
        args[7] = term411742;
        args[8] = term411759;
        args[9] = term411761;
        args[10] = term411763;
        args[11] = term411778;
        args[12] = term411793;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


