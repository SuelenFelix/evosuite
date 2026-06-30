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

public class XrpScanAccountResponse_setOwnerCount_72954864123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term412283;
     Object term412401;

    public XrpScanAccountResponse_setOwnerCount_72954864123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term412284 = new Long(273141122717896399L);
        Integer term412298 = new Integer(-506958186);
        Long term412367 = new Long(4057255693458933280L);
        Boolean term412382 = new Boolean(true);
        Boolean term412397 = new Boolean(false);
        Boolean term412399 = new Boolean(true);
        term412283 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse"));
        Object term412348 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term412349 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term412351 = (int[]) newIntArray(6);
        Object term412365 = newInstance(Class.forName("java.util.Date"));
        Object term412369 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term412384 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term412283, term412283.getClass(), "sequence", term412284);
        setField(term412283, term412283.getClass(), "xrpBalance", "hUXNsbksVz");
        setField(term412283, term412283.getClass(), "ownerCount", term412298);
        setField(term412283, term412283.getClass(), "previousAffectingTransactionID", "yaqKkLfKHZ");
        setField(term412283, term412283.getClass(), "previousAffectingTransactionLedgerVersion", "BPwZgWBNtv");
        setField(term412283, term412283.getClass(), "account", "oygVMTTxqX");
        setField(term412283, term412283.getClass(), "parent", "jmTIRLNtFD");
        setIntField(term412349, term412349.getClass(), "signum", 1);
        setIntElement(term412351, 0, 19772);
        setIntElement(term412351, 1, -449158655);
        setIntElement(term412351, 2, 141626585);
        setIntElement(term412351, 3, 124766628);
        setIntElement(term412351, 4, -842092141);
        setIntElement(term412351, 5, 596412319);
        setField(term412349, term412349.getClass(), "mag", term412351);
        setIntField(term412349, term412349.getClass(), "bitCountPlusOne", 0);
        setIntField(term412349, term412349.getClass(), "bitLengthPlusOne", 0);
        setIntField(term412349, term412349.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term412349, term412349.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term412348, term412348.getClass(), "intVal", term412349);
        setIntField(term412348, term412348.getClass(), "scale", 53);
        setIntField(term412348, term412348.getClass(), "precision", 0);
        setField(term412348, term412348.getClass(), "stringCache", null);
        setLongField(term412348, term412348.getClass(), "intCompact", -9223372036854775808L);
        setField(term412283, term412283.getClass(), "initial_balance", term412348);
        setLongField(term412365, term412365.getClass(), "fastTime", 1526379420890L);
        setField(term412365, term412365.getClass(), "cdate", null);
        setField(term412283, term412283.getClass(), "inception", term412365);
        setField(term412283, term412283.getClass(), "ledger_index", term412367);
        setField(term412369, term412369.getClass(), "issuer", "HJOXXPPBEy");
        setField(term412369, term412369.getClass(), "kyc", term412382);
        setField(term412283, term412283.getClass(), "accountName", term412369);
        setField(term412384, term412384.getClass(), "issuer", "cnxLmiIatu");
        setField(term412384, term412384.getClass(), "kyc", term412397);
        setField(term412283, term412283.getClass(), "parentName", term412384);
        setField(term412283, term412283.getClass(), "kycApproved", term412399);
        term412401 = new Integer(-507387516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term412401;
        callMethod(klass, "setOwnerCount", argTypes, term412283, args);
    }

};


