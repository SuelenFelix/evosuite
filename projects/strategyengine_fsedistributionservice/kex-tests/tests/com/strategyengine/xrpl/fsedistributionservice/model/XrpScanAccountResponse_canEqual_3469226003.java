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

public class XrpScanAccountResponse_canEqual_3469226003 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term408573;
     Object term408691;

    public XrpScanAccountResponse_canEqual_3469226003() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term408574 = new Long(3900637824492447206L);
        Integer term408588 = new Integer(-243422082);
        Long term408657 = new Long(5914809586547397675L);
        Boolean term408672 = new Boolean(false);
        Boolean term408687 = new Boolean(true);
        Boolean term408689 = new Boolean(true);
        term408573 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse"));
        Object term408638 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term408639 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term408641 = (int[]) newIntArray(6);
        Object term408655 = newInstance(Class.forName("java.util.Date"));
        Object term408659 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term408674 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term408573, term408573.getClass(), "sequence", term408574);
        setField(term408573, term408573.getClass(), "xrpBalance", "idVHWgvAfC");
        setField(term408573, term408573.getClass(), "ownerCount", term408588);
        setField(term408573, term408573.getClass(), "previousAffectingTransactionID", "NiyDlJYCDP");
        setField(term408573, term408573.getClass(), "previousAffectingTransactionLedgerVersion", "NrXMyLKbPX");
        setField(term408573, term408573.getClass(), "account", "KyYQpzPLpR");
        setField(term408573, term408573.getClass(), "parent", "guFaBtQGdw");
        setIntField(term408639, term408639.getClass(), "signum", 1);
        setIntElement(term408641, 0, 12658);
        setIntElement(term408641, 1, 878538917);
        setIntElement(term408641, 2, -466545988);
        setIntElement(term408641, 3, 1185733849);
        setIntElement(term408641, 4, -1724512112);
        setIntElement(term408641, 5, 567745329);
        setField(term408639, term408639.getClass(), "mag", term408641);
        setIntField(term408639, term408639.getClass(), "bitCountPlusOne", 0);
        setIntField(term408639, term408639.getClass(), "bitLengthPlusOne", 0);
        setIntField(term408639, term408639.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term408639, term408639.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term408638, term408638.getClass(), "intVal", term408639);
        setIntField(term408638, term408638.getClass(), "scale", 53);
        setIntField(term408638, term408638.getClass(), "precision", 0);
        setField(term408638, term408638.getClass(), "stringCache", null);
        setLongField(term408638, term408638.getClass(), "intCompact", -9223372036854775808L);
        setField(term408573, term408573.getClass(), "initial_balance", term408638);
        setLongField(term408655, term408655.getClass(), "fastTime", 1434177459152L);
        setField(term408655, term408655.getClass(), "cdate", null);
        setField(term408573, term408573.getClass(), "inception", term408655);
        setField(term408573, term408573.getClass(), "ledger_index", term408657);
        setField(term408659, term408659.getClass(), "issuer", "wKzSqUTDVD");
        setField(term408659, term408659.getClass(), "kyc", term408672);
        setField(term408573, term408573.getClass(), "accountName", term408659);
        setField(term408674, term408674.getClass(), "issuer", "hTFXzWftzI");
        setField(term408674, term408674.getClass(), "kyc", term408687);
        setField(term408573, term408573.getClass(), "parentName", term408674);
        setField(term408573, term408573.getClass(), "kycApproved", term408689);
        term408691 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term408691;
        callMethod(klass, "canEqual", argTypes, term408573, args);
    }

};


