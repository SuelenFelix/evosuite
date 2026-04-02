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

public class XrpScanAccountResponse_getInception_59838680614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term410708;

    public XrpScanAccountResponse_getInception_59838680614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term410709 = new Long(27732590148100485L);
        Integer term410723 = new Integer(-2066804303);
        Long term410792 = new Long(-963498294796483851L);
        Boolean term410807 = new Boolean(false);
        Boolean term410822 = new Boolean(false);
        Boolean term410824 = new Boolean(true);
        term410708 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse"));
        Object term410773 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term410774 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term410776 = (int[]) newIntArray(6);
        Object term410790 = newInstance(Class.forName("java.util.Date"));
        Object term410794 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term410809 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term410708, term410708.getClass(), "sequence", term410709);
        setField(term410708, term410708.getClass(), "xrpBalance", "HYVRFlRSiU");
        setField(term410708, term410708.getClass(), "ownerCount", term410723);
        setField(term410708, term410708.getClass(), "previousAffectingTransactionID", "nEmiPinRJb");
        setField(term410708, term410708.getClass(), "previousAffectingTransactionLedgerVersion", "lLDlCidILl");
        setField(term410708, term410708.getClass(), "account", "GmDgAbnzLh");
        setField(term410708, term410708.getClass(), "parent", "HlzihENfEE");
        setIntField(term410774, term410774.getClass(), "signum", 1);
        setIntElement(term410776, 0, 3414);
        setIntElement(term410776, 1, 1913952634);
        setIntElement(term410776, 2, -2146032071);
        setIntElement(term410776, 3, 1452615800);
        setIntElement(term410776, 4, -138847786);
        setIntElement(term410776, 5, -1441353949);
        setField(term410774, term410774.getClass(), "mag", term410776);
        setIntField(term410774, term410774.getClass(), "bitCountPlusOne", 0);
        setIntField(term410774, term410774.getClass(), "bitLengthPlusOne", 0);
        setIntField(term410774, term410774.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term410774, term410774.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term410773, term410773.getClass(), "intVal", term410774);
        setIntField(term410773, term410773.getClass(), "scale", 52);
        setIntField(term410773, term410773.getClass(), "precision", 0);
        setField(term410773, term410773.getClass(), "stringCache", null);
        setLongField(term410773, term410773.getClass(), "intCompact", -9223372036854775808L);
        setField(term410708, term410708.getClass(), "initial_balance", term410773);
        setLongField(term410790, term410790.getClass(), "fastTime", 1443908101557L);
        setField(term410790, term410790.getClass(), "cdate", null);
        setField(term410708, term410708.getClass(), "inception", term410790);
        setField(term410708, term410708.getClass(), "ledger_index", term410792);
        setField(term410794, term410794.getClass(), "issuer", "BVksxjZKJm");
        setField(term410794, term410794.getClass(), "kyc", term410807);
        setField(term410708, term410708.getClass(), "accountName", term410794);
        setField(term410809, term410809.getClass(), "issuer", "qDOWRMZGoQ");
        setField(term410809, term410809.getClass(), "kyc", term410822);
        setField(term410708, term410708.getClass(), "parentName", term410809);
        setField(term410708, term410708.getClass(), "kycApproved", term410824);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInception", argTypes, term410708, args);
    }

};


