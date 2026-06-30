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

public class XrpScanAccountResponse_getParent_6143615412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term410320;

    public XrpScanAccountResponse_getParent_6143615412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term410321 = new Long(3437866678450547130L);
        Integer term410335 = new Integer(663292551);
        Long term410404 = new Long(-2375099996964834173L);
        Boolean term410419 = new Boolean(true);
        Boolean term410434 = new Boolean(false);
        Boolean term410436 = new Boolean(false);
        term410320 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse"));
        Object term410385 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term410386 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term410388 = (int[]) newIntArray(6);
        Object term410402 = newInstance(Class.forName("java.util.Date"));
        Object term410406 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term410421 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term410320, term410320.getClass(), "sequence", term410321);
        setField(term410320, term410320.getClass(), "xrpBalance", "CMqxKqrJQY");
        setField(term410320, term410320.getClass(), "ownerCount", term410335);
        setField(term410320, term410320.getClass(), "previousAffectingTransactionID", "bYSZOavJQQ");
        setField(term410320, term410320.getClass(), "previousAffectingTransactionLedgerVersion", "ZxOXRuKpMx");
        setField(term410320, term410320.getClass(), "account", "vCcKCEDJQu");
        setField(term410320, term410320.getClass(), "parent", "RuHnBNHrCE");
        setIntField(term410386, term410386.getClass(), "signum", 1);
        setIntElement(term410388, 0, 4130);
        setIntElement(term410388, 1, -1087901368);
        setIntElement(term410388, 2, 1018070869);
        setIntElement(term410388, 3, 1629589547);
        setIntElement(term410388, 4, 1517102141);
        setIntElement(term410388, 5, 442965405);
        setField(term410386, term410386.getClass(), "mag", term410388);
        setIntField(term410386, term410386.getClass(), "bitCountPlusOne", 0);
        setIntField(term410386, term410386.getClass(), "bitLengthPlusOne", 0);
        setIntField(term410386, term410386.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term410386, term410386.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term410385, term410385.getClass(), "intVal", term410386);
        setIntField(term410385, term410385.getClass(), "scale", 52);
        setIntField(term410385, term410385.getClass(), "precision", 0);
        setField(term410385, term410385.getClass(), "stringCache", null);
        setLongField(term410385, term410385.getClass(), "intCompact", -9223372036854775808L);
        setField(term410320, term410320.getClass(), "initial_balance", term410385);
        setLongField(term410402, term410402.getClass(), "fastTime", 1637256257718L);
        setField(term410402, term410402.getClass(), "cdate", null);
        setField(term410320, term410320.getClass(), "inception", term410402);
        setField(term410320, term410320.getClass(), "ledger_index", term410404);
        setField(term410406, term410406.getClass(), "issuer", "XcAeNLtSNH");
        setField(term410406, term410406.getClass(), "kyc", term410419);
        setField(term410320, term410320.getClass(), "accountName", term410406);
        setField(term410421, term410421.getClass(), "issuer", "jItyMhtTmx");
        setField(term410421, term410421.getClass(), "kyc", term410434);
        setField(term410320, term410320.getClass(), "parentName", term410421);
        setField(term410320, term410320.getClass(), "kycApproved", term410436);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParent", argTypes, term410320, args);
    }

};


