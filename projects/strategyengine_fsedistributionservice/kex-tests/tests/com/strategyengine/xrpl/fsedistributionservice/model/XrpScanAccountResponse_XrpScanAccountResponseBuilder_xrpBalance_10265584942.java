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

public class XrpScanAccountResponse_XrpScanAccountResponseBuilder_xrpBalance_10265584942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443486;

    public XrpScanAccountResponse_XrpScanAccountResponseBuilder_xrpBalance_10265584942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term443487 = new Long(8779425347424216281L);
        Integer term443501 = new Integer(-1618206977);
        Long term443570 = new Long(3878526639209086211L);
        Boolean term443585 = new Boolean(false);
        Boolean term443600 = new Boolean(true);
        Boolean term443602 = new Boolean(true);
        term443486 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder"));
        Object term443551 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term443552 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term443554 = (int[]) newIntArray(6);
        Object term443568 = newInstance(Class.forName("java.util.Date"));
        Object term443572 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term443587 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term443486, term443486.getClass(), "sequence", term443487);
        setField(term443486, term443486.getClass(), "xrpBalance", "JjTdvIrvPK");
        setField(term443486, term443486.getClass(), "ownerCount", term443501);
        setField(term443486, term443486.getClass(), "previousAffectingTransactionID", "IPYNkBSSpi");
        setField(term443486, term443486.getClass(), "previousAffectingTransactionLedgerVersion", "jrAClCtfec");
        setField(term443486, term443486.getClass(), "account", "bsICeJRjzc");
        setField(term443486, term443486.getClass(), "parent", "OGXxsmtsYU");
        setIntField(term443552, term443552.getClass(), "signum", 1);
        setIntElement(term443554, 0, 7394);
        setIntElement(term443554, 1, -666644541);
        setIntElement(term443554, 2, 1009709);
        setIntElement(term443554, 3, -217344959);
        setIntElement(term443554, 4, -10974684);
        setIntElement(term443554, 5, -1164360963);
        setField(term443552, term443552.getClass(), "mag", term443554);
        setIntField(term443552, term443552.getClass(), "bitCountPlusOne", 0);
        setIntField(term443552, term443552.getClass(), "bitLengthPlusOne", 0);
        setIntField(term443552, term443552.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term443552, term443552.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term443551, term443551.getClass(), "intVal", term443552);
        setIntField(term443551, term443551.getClass(), "scale", 53);
        setIntField(term443551, term443551.getClass(), "precision", 0);
        setField(term443551, term443551.getClass(), "stringCache", null);
        setLongField(term443551, term443551.getClass(), "intCompact", -9223372036854775808L);
        setField(term443486, term443486.getClass(), "initial_balance", term443551);
        setLongField(term443568, term443568.getClass(), "fastTime", 1372948494936L);
        setField(term443568, term443568.getClass(), "cdate", null);
        setField(term443486, term443486.getClass(), "inception", term443568);
        setField(term443486, term443486.getClass(), "ledger_index", term443570);
        setField(term443572, term443572.getClass(), "issuer", "mLKQCgJRhc");
        setField(term443572, term443572.getClass(), "kyc", term443585);
        setField(term443486, term443486.getClass(), "accountName", term443572);
        setField(term443587, term443587.getClass(), "issuer", "FBrppwmmNJ");
        setField(term443587, term443587.getClass(), "kyc", term443600);
        setField(term443486, term443486.getClass(), "parentName", term443587);
        setField(term443486, term443486.getClass(), "kycApproved", term443602);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CEhIgioAkj";
        callMethod(klass, "xrpBalance", argTypes, term443486, args);
    }

};


