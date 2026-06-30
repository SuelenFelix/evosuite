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

public class XrpScanAccountResponse_setSequence_121137577421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term411871;
     Object term411989;

    public XrpScanAccountResponse_setSequence_121137577421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term411872 = new Long(-2035876674935124725L);
        Integer term411886 = new Integer(1358829571);
        Long term411955 = new Long(4961271045442602009L);
        Boolean term411970 = new Boolean(true);
        Boolean term411985 = new Boolean(true);
        Boolean term411987 = new Boolean(false);
        term411871 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse"));
        Object term411936 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term411937 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term411939 = (int[]) newIntArray(6);
        Object term411953 = newInstance(Class.forName("java.util.Date"));
        Object term411957 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term411972 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term411871, term411871.getClass(), "sequence", term411872);
        setField(term411871, term411871.getClass(), "xrpBalance", "fcNMdNQQvW");
        setField(term411871, term411871.getClass(), "ownerCount", term411886);
        setField(term411871, term411871.getClass(), "previousAffectingTransactionID", "NDvqjvXlOJ");
        setField(term411871, term411871.getClass(), "previousAffectingTransactionLedgerVersion", "IEYToiMHbq");
        setField(term411871, term411871.getClass(), "account", "oUdobPPOtl");
        setField(term411871, term411871.getClass(), "parent", "DnPZWDcJoa");
        setIntField(term411937, term411937.getClass(), "signum", 1);
        setIntElement(term411939, 0, 12542);
        setIntElement(term411939, 1, 274621254);
        setIntElement(term411939, 2, -81883518);
        setIntElement(term411939, 3, 808886919);
        setIntElement(term411939, 4, 2087064564);
        setIntElement(term411939, 5, 1923634103);
        setField(term411937, term411937.getClass(), "mag", term411939);
        setIntField(term411937, term411937.getClass(), "bitCountPlusOne", 0);
        setIntField(term411937, term411937.getClass(), "bitLengthPlusOne", 0);
        setIntField(term411937, term411937.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term411937, term411937.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term411936, term411936.getClass(), "intVal", term411937);
        setIntField(term411936, term411936.getClass(), "scale", 53);
        setIntField(term411936, term411936.getClass(), "precision", 0);
        setField(term411936, term411936.getClass(), "stringCache", null);
        setLongField(term411936, term411936.getClass(), "intCompact", -9223372036854775808L);
        setField(term411871, term411871.getClass(), "initial_balance", term411936);
        setLongField(term411953, term411953.getClass(), "fastTime", 1731746979407L);
        setField(term411953, term411953.getClass(), "cdate", null);
        setField(term411871, term411871.getClass(), "inception", term411953);
        setField(term411871, term411871.getClass(), "ledger_index", term411955);
        setField(term411957, term411957.getClass(), "issuer", "rJbnGmOZjC");
        setField(term411957, term411957.getClass(), "kyc", term411970);
        setField(term411871, term411871.getClass(), "accountName", term411957);
        setField(term411972, term411972.getClass(), "issuer", "JVRRLnzenT");
        setField(term411972, term411972.getClass(), "kyc", term411985);
        setField(term411871, term411871.getClass(), "parentName", term411972);
        setField(term411871, term411871.getClass(), "kycApproved", term411987);
        term411989 = new Long(8143748492411850558L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term411989;
        callMethod(klass, "setSequence", argTypes, term411871, args);
    }

};


