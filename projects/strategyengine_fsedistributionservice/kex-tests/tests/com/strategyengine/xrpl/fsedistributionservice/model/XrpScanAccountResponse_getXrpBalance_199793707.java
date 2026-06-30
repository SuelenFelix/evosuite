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

public class XrpScanAccountResponse_getXrpBalance_199793707 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409350;

    public XrpScanAccountResponse_getXrpBalance_199793707() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term409351 = new Long(-5849408670992771988L);
        Integer term409365 = new Integer(1296895584);
        Long term409434 = new Long(3210450133277104L);
        Boolean term409449 = new Boolean(false);
        Boolean term409464 = new Boolean(true);
        Boolean term409466 = new Boolean(false);
        term409350 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse"));
        Object term409415 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term409416 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term409418 = (int[]) newIntArray(6);
        Object term409432 = newInstance(Class.forName("java.util.Date"));
        Object term409436 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term409451 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term409350, term409350.getClass(), "sequence", term409351);
        setField(term409350, term409350.getClass(), "xrpBalance", "NeokzisPfy");
        setField(term409350, term409350.getClass(), "ownerCount", term409365);
        setField(term409350, term409350.getClass(), "previousAffectingTransactionID", "OFPijZbUEP");
        setField(term409350, term409350.getClass(), "previousAffectingTransactionLedgerVersion", "aGlubgKNsG");
        setField(term409350, term409350.getClass(), "account", "UaJYBEwJNx");
        setField(term409350, term409350.getClass(), "parent", "tNmMWpvuIO");
        setIntField(term409416, term409416.getClass(), "signum", 1);
        setIntElement(term409418, 0, 62839);
        setIntElement(term409418, 1, -1234594967);
        setIntElement(term409418, 2, 846981599);
        setIntElement(term409418, 3, -1615819725);
        setIntElement(term409418, 4, -1667109125);
        setIntElement(term409418, 5, 460821871);
        setField(term409416, term409416.getClass(), "mag", term409418);
        setIntField(term409416, term409416.getClass(), "bitCountPlusOne", 0);
        setIntField(term409416, term409416.getClass(), "bitLengthPlusOne", 0);
        setIntField(term409416, term409416.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term409416, term409416.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term409415, term409415.getClass(), "intVal", term409416);
        setIntField(term409415, term409415.getClass(), "scale", 53);
        setIntField(term409415, term409415.getClass(), "precision", 0);
        setField(term409415, term409415.getClass(), "stringCache", null);
        setLongField(term409415, term409415.getClass(), "intCompact", -9223372036854775808L);
        setField(term409350, term409350.getClass(), "initial_balance", term409415);
        setLongField(term409432, term409432.getClass(), "fastTime", 1472776904340L);
        setField(term409432, term409432.getClass(), "cdate", null);
        setField(term409350, term409350.getClass(), "inception", term409432);
        setField(term409350, term409350.getClass(), "ledger_index", term409434);
        setField(term409436, term409436.getClass(), "issuer", "hkYquFUwUR");
        setField(term409436, term409436.getClass(), "kyc", term409449);
        setField(term409350, term409350.getClass(), "accountName", term409436);
        setField(term409451, term409451.getClass(), "issuer", "qwXUESXGXo");
        setField(term409451, term409451.getClass(), "kyc", term409464);
        setField(term409350, term409350.getClass(), "parentName", term409451);
        setField(term409350, term409350.getClass(), "kycApproved", term409466);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getXrpBalance", argTypes, term409350, args);
    }

};


