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

public class XrpScanAccountResponse_XrpScanAccountResponseBuilder_previousAffectingTransactionLedgerVersion_11176727335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term444114;

    public XrpScanAccountResponse_XrpScanAccountResponseBuilder_previousAffectingTransactionLedgerVersion_11176727335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term444115 = new Long(-7774176365237911445L);
        Integer term444129 = new Integer(-1476644457);
        Long term444198 = new Long(-4171030293649718675L);
        Boolean term444213 = new Boolean(false);
        Boolean term444228 = new Boolean(false);
        Boolean term444230 = new Boolean(false);
        term444114 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder"));
        Object term444179 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term444180 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term444182 = (int[]) newIntArray(6);
        Object term444196 = newInstance(Class.forName("java.util.Date"));
        Object term444200 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term444215 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term444114, term444114.getClass(), "sequence", term444115);
        setField(term444114, term444114.getClass(), "xrpBalance", "pIVDmquiiy");
        setField(term444114, term444114.getClass(), "ownerCount", term444129);
        setField(term444114, term444114.getClass(), "previousAffectingTransactionID", "QKZBoZqVRg");
        setField(term444114, term444114.getClass(), "previousAffectingTransactionLedgerVersion", "NEEIZQiGuu");
        setField(term444114, term444114.getClass(), "account", "CEvOMXwQxg");
        setField(term444114, term444114.getClass(), "parent", "mxdsPNszOh");
        setIntField(term444180, term444180.getClass(), "signum", 1);
        setIntElement(term444182, 0, 21901);
        setIntElement(term444182, 1, -1413669227);
        setIntElement(term444182, 2, 1871817776);
        setIntElement(term444182, 3, 393745963);
        setIntElement(term444182, 4, -1636719058);
        setIntElement(term444182, 5, -1879245903);
        setField(term444180, term444180.getClass(), "mag", term444182);
        setIntField(term444180, term444180.getClass(), "bitCountPlusOne", 0);
        setIntField(term444180, term444180.getClass(), "bitLengthPlusOne", 0);
        setIntField(term444180, term444180.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term444180, term444180.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term444179, term444179.getClass(), "intVal", term444180);
        setIntField(term444179, term444179.getClass(), "scale", 53);
        setIntField(term444179, term444179.getClass(), "precision", 0);
        setField(term444179, term444179.getClass(), "stringCache", null);
        setLongField(term444179, term444179.getClass(), "intCompact", -9223372036854775808L);
        setField(term444114, term444114.getClass(), "initial_balance", term444179);
        setLongField(term444196, term444196.getClass(), "fastTime", 1582317347659L);
        setField(term444196, term444196.getClass(), "cdate", null);
        setField(term444114, term444114.getClass(), "inception", term444196);
        setField(term444114, term444114.getClass(), "ledger_index", term444198);
        setField(term444200, term444200.getClass(), "issuer", "IVVzjnfNdK");
        setField(term444200, term444200.getClass(), "kyc", term444213);
        setField(term444114, term444114.getClass(), "accountName", term444200);
        setField(term444215, term444215.getClass(), "issuer", "ATmDitYnqV");
        setField(term444215, term444215.getClass(), "kyc", term444228);
        setField(term444114, term444114.getClass(), "parentName", term444215);
        setField(term444114, term444114.getClass(), "kycApproved", term444230);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SZavUirhzV";
        callMethod(klass, "previousAffectingTransactionLedgerVersion", argTypes, term444114, args);
    }

};


