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

public class XrpScanAccountResponse_getParentName_79124677217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term411290;

    public XrpScanAccountResponse_getParentName_79124677217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term411291 = new Long(1980274010918360742L);
        Integer term411305 = new Integer(-1239406390);
        Long term411374 = new Long(3205645145047776900L);
        Boolean term411389 = new Boolean(false);
        Boolean term411404 = new Boolean(true);
        Boolean term411406 = new Boolean(false);
        term411290 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse"));
        Object term411355 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term411356 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term411358 = (int[]) newIntArray(6);
        Object term411372 = newInstance(Class.forName("java.util.Date"));
        Object term411376 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term411391 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term411290, term411290.getClass(), "sequence", term411291);
        setField(term411290, term411290.getClass(), "xrpBalance", "RDrlijEuJf");
        setField(term411290, term411290.getClass(), "ownerCount", term411305);
        setField(term411290, term411290.getClass(), "previousAffectingTransactionID", "iMzCqvAffI");
        setField(term411290, term411290.getClass(), "previousAffectingTransactionLedgerVersion", "qJHeGEeBIn");
        setField(term411290, term411290.getClass(), "account", "tyzvCLuaer");
        setField(term411290, term411290.getClass(), "parent", "lCThPYNAQY");
        setIntField(term411356, term411356.getClass(), "signum", 1);
        setIntElement(term411358, 0, 59750);
        setIntElement(term411358, 1, 1156470437);
        setIntElement(term411358, 2, -1323656510);
        setIntElement(term411358, 3, 464053709);
        setIntElement(term411358, 4, 1462325552);
        setIntElement(term411358, 5, 1766364371);
        setField(term411356, term411356.getClass(), "mag", term411358);
        setIntField(term411356, term411356.getClass(), "bitCountPlusOne", 0);
        setIntField(term411356, term411356.getClass(), "bitLengthPlusOne", 0);
        setIntField(term411356, term411356.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term411356, term411356.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term411355, term411355.getClass(), "intVal", term411356);
        setIntField(term411355, term411355.getClass(), "scale", 53);
        setIntField(term411355, term411355.getClass(), "precision", 0);
        setField(term411355, term411355.getClass(), "stringCache", null);
        setLongField(term411355, term411355.getClass(), "intCompact", -9223372036854775808L);
        setField(term411290, term411290.getClass(), "initial_balance", term411355);
        setLongField(term411372, term411372.getClass(), "fastTime", 1325103501591L);
        setField(term411372, term411372.getClass(), "cdate", null);
        setField(term411290, term411290.getClass(), "inception", term411372);
        setField(term411290, term411290.getClass(), "ledger_index", term411374);
        setField(term411376, term411376.getClass(), "issuer", "NmDLyTLdov");
        setField(term411376, term411376.getClass(), "kyc", term411389);
        setField(term411290, term411290.getClass(), "accountName", term411376);
        setField(term411391, term411391.getClass(), "issuer", "smqFlnzjoa");
        setField(term411391, term411391.getClass(), "kyc", term411404);
        setField(term411290, term411290.getClass(), "parentName", term411391);
        setField(term411290, term411290.getClass(), "kycApproved", term411406);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParentName", argTypes, term411290, args);
    }

};


