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

public class XrpScanAccountResponse_getOwnerCount_6014974238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409544;

    public XrpScanAccountResponse_getOwnerCount_6014974238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term409545 = new Long(6637550433135455885L);
        Integer term409559 = new Integer(628918458);
        Long term409628 = new Long(-5562622835440119601L);
        Boolean term409643 = new Boolean(false);
        Boolean term409658 = new Boolean(true);
        Boolean term409660 = new Boolean(false);
        term409544 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse"));
        Object term409609 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term409610 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term409612 = (int[]) newIntArray(6);
        Object term409626 = newInstance(Class.forName("java.util.Date"));
        Object term409630 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term409645 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term409544, term409544.getClass(), "sequence", term409545);
        setField(term409544, term409544.getClass(), "xrpBalance", "MNfbjaLbKe");
        setField(term409544, term409544.getClass(), "ownerCount", term409559);
        setField(term409544, term409544.getClass(), "previousAffectingTransactionID", "aiBUdqSjno");
        setField(term409544, term409544.getClass(), "previousAffectingTransactionLedgerVersion", "OCoOUoeCiu");
        setField(term409544, term409544.getClass(), "account", "bVsQcebTuv");
        setField(term409544, term409544.getClass(), "parent", "bmJCAJxtqz");
        setIntField(term409610, term409610.getClass(), "signum", 1);
        setIntElement(term409612, 0, 64710);
        setIntElement(term409612, 1, 2102369391);
        setIntElement(term409612, 2, 1730923760);
        setIntElement(term409612, 3, -939246302);
        setIntElement(term409612, 4, 1124184775);
        setIntElement(term409612, 5, -1258856241);
        setField(term409610, term409610.getClass(), "mag", term409612);
        setIntField(term409610, term409610.getClass(), "bitCountPlusOne", 0);
        setIntField(term409610, term409610.getClass(), "bitLengthPlusOne", 0);
        setIntField(term409610, term409610.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term409610, term409610.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term409609, term409609.getClass(), "intVal", term409610);
        setIntField(term409609, term409609.getClass(), "scale", 53);
        setIntField(term409609, term409609.getClass(), "precision", 0);
        setField(term409609, term409609.getClass(), "stringCache", null);
        setLongField(term409609, term409609.getClass(), "intCompact", -9223372036854775808L);
        setField(term409544, term409544.getClass(), "initial_balance", term409609);
        setLongField(term409626, term409626.getClass(), "fastTime", 1362346778646L);
        setField(term409626, term409626.getClass(), "cdate", null);
        setField(term409544, term409544.getClass(), "inception", term409626);
        setField(term409544, term409544.getClass(), "ledger_index", term409628);
        setField(term409630, term409630.getClass(), "issuer", "cgUciMZVPe");
        setField(term409630, term409630.getClass(), "kyc", term409643);
        setField(term409544, term409544.getClass(), "accountName", term409630);
        setField(term409645, term409645.getClass(), "issuer", "iENHbBSfhn");
        setField(term409645, term409645.getClass(), "kyc", term409658);
        setField(term409544, term409544.getClass(), "parentName", term409645);
        setField(term409544, term409544.getClass(), "kycApproved", term409660);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOwnerCount", argTypes, term409544, args);
    }

};


