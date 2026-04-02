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

public class XrpScanAccountResponse_XrpScanAccountResponseBuilder_inception_8745286249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term444979;
     Object term445097;

    public XrpScanAccountResponse_XrpScanAccountResponseBuilder_inception_8745286249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term444980 = new Long(475071242551560384L);
        Integer term444994 = new Integer(-1022990421);
        Long term445063 = new Long(279205148356106270L);
        Boolean term445078 = new Boolean(false);
        Boolean term445093 = new Boolean(false);
        Boolean term445095 = new Boolean(false);
        term444979 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder"));
        Object term445044 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term445045 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term445047 = (int[]) newIntArray(6);
        Object term445061 = newInstance(Class.forName("java.util.Date"));
        Object term445065 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term445080 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term444979, term444979.getClass(), "sequence", term444980);
        setField(term444979, term444979.getClass(), "xrpBalance", "nUwJJPksYx");
        setField(term444979, term444979.getClass(), "ownerCount", term444994);
        setField(term444979, term444979.getClass(), "previousAffectingTransactionID", "bkYmvWePQT");
        setField(term444979, term444979.getClass(), "previousAffectingTransactionLedgerVersion", "jxDxrLRRcq");
        setField(term444979, term444979.getClass(), "account", "rTpdeGCRay");
        setField(term444979, term444979.getClass(), "parent", "zXdwBSOjJU");
        setIntField(term445045, term445045.getClass(), "signum", 1);
        setIntElement(term445047, 0, 38675);
        setIntElement(term445047, 1, -254873426);
        setIntElement(term445047, 2, 1459218494);
        setIntElement(term445047, 3, -277466605);
        setIntElement(term445047, 4, -884610878);
        setIntElement(term445047, 5, -1957853309);
        setField(term445045, term445045.getClass(), "mag", term445047);
        setIntField(term445045, term445045.getClass(), "bitCountPlusOne", 0);
        setIntField(term445045, term445045.getClass(), "bitLengthPlusOne", 0);
        setIntField(term445045, term445045.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term445045, term445045.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term445044, term445044.getClass(), "intVal", term445045);
        setIntField(term445044, term445044.getClass(), "scale", 53);
        setIntField(term445044, term445044.getClass(), "precision", 0);
        setField(term445044, term445044.getClass(), "stringCache", null);
        setLongField(term445044, term445044.getClass(), "intCompact", -9223372036854775808L);
        setField(term444979, term444979.getClass(), "initial_balance", term445044);
        setLongField(term445061, term445061.getClass(), "fastTime", 1266846447329L);
        setField(term445061, term445061.getClass(), "cdate", null);
        setField(term444979, term444979.getClass(), "inception", term445061);
        setField(term444979, term444979.getClass(), "ledger_index", term445063);
        setField(term445065, term445065.getClass(), "issuer", "fCgIgrkuJo");
        setField(term445065, term445065.getClass(), "kyc", term445078);
        setField(term444979, term444979.getClass(), "accountName", term445065);
        setField(term445080, term445080.getClass(), "issuer", "ymsVUhZoWG");
        setField(term445080, term445080.getClass(), "kyc", term445093);
        setField(term444979, term444979.getClass(), "parentName", term445080);
        setField(term444979, term444979.getClass(), "kycApproved", term445095);
        term445097 = newInstance(Class.forName("java.util.Date"));
        setLongField(term445097, term445097.getClass(), "fastTime", 1411816550578L);
        setField(term445097, term445097.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term445097;
        callMethod(klass, "inception", argTypes, term444979, args);
    }

};


