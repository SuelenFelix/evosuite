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

public class XrpScanAccountResponse_setParent_190734997027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term413127;

    public XrpScanAccountResponse_setParent_190734997027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term413128 = new Long(-8449554760304422682L);
        Integer term413142 = new Integer(114754804);
        Long term413211 = new Long(-8538697616110187183L);
        Boolean term413226 = new Boolean(true);
        Boolean term413241 = new Boolean(false);
        Boolean term413243 = new Boolean(true);
        term413127 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse"));
        Object term413192 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term413193 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term413195 = (int[]) newIntArray(6);
        Object term413209 = newInstance(Class.forName("java.util.Date"));
        Object term413213 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term413228 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term413127, term413127.getClass(), "sequence", term413128);
        setField(term413127, term413127.getClass(), "xrpBalance", "CMQEFWPbMc");
        setField(term413127, term413127.getClass(), "ownerCount", term413142);
        setField(term413127, term413127.getClass(), "previousAffectingTransactionID", "JTofLzeGzC");
        setField(term413127, term413127.getClass(), "previousAffectingTransactionLedgerVersion", "BvkOSPnZkI");
        setField(term413127, term413127.getClass(), "account", "alCPzWIVkG");
        setField(term413127, term413127.getClass(), "parent", "DrvoGNtgiv");
        setIntField(term413193, term413193.getClass(), "signum", 1);
        setIntElement(term413195, 0, 37495);
        setIntElement(term413195, 1, 1708820633);
        setIntElement(term413195, 2, 716545647);
        setIntElement(term413195, 3, -387377737);
        setIntElement(term413195, 4, 213926646);
        setIntElement(term413195, 5, 1291693655);
        setField(term413193, term413193.getClass(), "mag", term413195);
        setIntField(term413193, term413193.getClass(), "bitCountPlusOne", 0);
        setIntField(term413193, term413193.getClass(), "bitLengthPlusOne", 0);
        setIntField(term413193, term413193.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term413193, term413193.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term413192, term413192.getClass(), "intVal", term413193);
        setIntField(term413192, term413192.getClass(), "scale", 53);
        setIntField(term413192, term413192.getClass(), "precision", 0);
        setField(term413192, term413192.getClass(), "stringCache", null);
        setLongField(term413192, term413192.getClass(), "intCompact", -9223372036854775808L);
        setField(term413127, term413127.getClass(), "initial_balance", term413192);
        setLongField(term413209, term413209.getClass(), "fastTime", 1615596335687L);
        setField(term413209, term413209.getClass(), "cdate", null);
        setField(term413127, term413127.getClass(), "inception", term413209);
        setField(term413127, term413127.getClass(), "ledger_index", term413211);
        setField(term413213, term413213.getClass(), "issuer", "WbdownfsPi");
        setField(term413213, term413213.getClass(), "kyc", term413226);
        setField(term413127, term413127.getClass(), "accountName", term413213);
        setField(term413228, term413228.getClass(), "issuer", "lWVEPzuExV");
        setField(term413228, term413228.getClass(), "kyc", term413241);
        setField(term413127, term413127.getClass(), "parentName", term413228);
        setField(term413127, term413127.getClass(), "kycApproved", term413243);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "cajUyLjOLa";
        callMethod(klass, "setParent", argTypes, term413127, args);
    }

};


