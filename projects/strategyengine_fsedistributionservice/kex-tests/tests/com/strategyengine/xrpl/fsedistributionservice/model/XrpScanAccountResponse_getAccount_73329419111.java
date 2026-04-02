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

public class XrpScanAccountResponse_getAccount_73329419111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term410126;

    public XrpScanAccountResponse_getAccount_73329419111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term410127 = new Long(8778744391146217826L);
        Integer term410141 = new Integer(-601863069);
        Long term410210 = new Long(7377514870475587049L);
        Boolean term410225 = new Boolean(false);
        Boolean term410240 = new Boolean(true);
        Boolean term410242 = new Boolean(true);
        term410126 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse"));
        Object term410191 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term410192 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term410194 = (int[]) newIntArray(6);
        Object term410208 = newInstance(Class.forName("java.util.Date"));
        Object term410212 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term410227 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term410126, term410126.getClass(), "sequence", term410127);
        setField(term410126, term410126.getClass(), "xrpBalance", "LbypvZviib");
        setField(term410126, term410126.getClass(), "ownerCount", term410141);
        setField(term410126, term410126.getClass(), "previousAffectingTransactionID", "mQaMWxZbut");
        setField(term410126, term410126.getClass(), "previousAffectingTransactionLedgerVersion", "bdcsoUTcvf");
        setField(term410126, term410126.getClass(), "account", "DDDxtakFvE");
        setField(term410126, term410126.getClass(), "parent", "xMpekGjaKa");
        setIntField(term410192, term410192.getClass(), "signum", 1);
        setIntElement(term410194, 0, 1630);
        setIntElement(term410194, 1, 286727680);
        setIntElement(term410194, 2, -1201506640);
        setIntElement(term410194, 3, 2020132078);
        setIntElement(term410194, 4, -461854070);
        setIntElement(term410194, 5, 454662305);
        setField(term410192, term410192.getClass(), "mag", term410194);
        setIntField(term410192, term410192.getClass(), "bitCountPlusOne", 0);
        setIntField(term410192, term410192.getClass(), "bitLengthPlusOne", 0);
        setIntField(term410192, term410192.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term410192, term410192.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term410191, term410191.getClass(), "intVal", term410192);
        setIntField(term410191, term410191.getClass(), "scale", 52);
        setIntField(term410191, term410191.getClass(), "precision", 0);
        setField(term410191, term410191.getClass(), "stringCache", null);
        setLongField(term410191, term410191.getClass(), "intCompact", -9223372036854775808L);
        setField(term410126, term410126.getClass(), "initial_balance", term410191);
        setLongField(term410208, term410208.getClass(), "fastTime", 1516895216142L);
        setField(term410208, term410208.getClass(), "cdate", null);
        setField(term410126, term410126.getClass(), "inception", term410208);
        setField(term410126, term410126.getClass(), "ledger_index", term410210);
        setField(term410212, term410212.getClass(), "issuer", "lnroitmiAA");
        setField(term410212, term410212.getClass(), "kyc", term410225);
        setField(term410126, term410126.getClass(), "accountName", term410212);
        setField(term410227, term410227.getClass(), "issuer", "bFTGCDAnNF");
        setField(term410227, term410227.getClass(), "kyc", term410240);
        setField(term410126, term410126.getClass(), "parentName", term410227);
        setField(term410126, term410126.getClass(), "kycApproved", term410242);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccount", argTypes, term410126, args);
    }

};


