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

public class XrpScanAccountResponse_setLedgerindex_159921879130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term413756;
     Object term413874;

    public XrpScanAccountResponse_setLedgerindex_159921879130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term413757 = new Long(-4916056690424367636L);
        Integer term413771 = new Integer(497269071);
        Long term413840 = new Long(-971944383326299487L);
        Boolean term413855 = new Boolean(false);
        Boolean term413870 = new Boolean(false);
        Boolean term413872 = new Boolean(false);
        term413756 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse"));
        Object term413821 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term413822 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term413824 = (int[]) newIntArray(6);
        Object term413838 = newInstance(Class.forName("java.util.Date"));
        Object term413842 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term413857 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term413756, term413756.getClass(), "sequence", term413757);
        setField(term413756, term413756.getClass(), "xrpBalance", "mkyixIrBsk");
        setField(term413756, term413756.getClass(), "ownerCount", term413771);
        setField(term413756, term413756.getClass(), "previousAffectingTransactionID", "TzTUjXLdan");
        setField(term413756, term413756.getClass(), "previousAffectingTransactionLedgerVersion", "QXmHPKSKtP");
        setField(term413756, term413756.getClass(), "account", "fAUYJbGzYB");
        setField(term413756, term413756.getClass(), "parent", "pdJMKenJHR");
        setIntField(term413822, term413822.getClass(), "signum", 1);
        setIntElement(term413824, 0, 7957);
        setIntElement(term413824, 1, -824749878);
        setIntElement(term413824, 2, 235283542);
        setIntElement(term413824, 3, -1878041085);
        setIntElement(term413824, 4, -1797400109);
        setIntElement(term413824, 5, 651052795);
        setField(term413822, term413822.getClass(), "mag", term413824);
        setIntField(term413822, term413822.getClass(), "bitCountPlusOne", 0);
        setIntField(term413822, term413822.getClass(), "bitLengthPlusOne", 0);
        setIntField(term413822, term413822.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term413822, term413822.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term413821, term413821.getClass(), "intVal", term413822);
        setIntField(term413821, term413821.getClass(), "scale", 53);
        setIntField(term413821, term413821.getClass(), "precision", 0);
        setField(term413821, term413821.getClass(), "stringCache", null);
        setLongField(term413821, term413821.getClass(), "intCompact", -9223372036854775808L);
        setField(term413756, term413756.getClass(), "initial_balance", term413821);
        setLongField(term413838, term413838.getClass(), "fastTime", 1818315740747L);
        setField(term413838, term413838.getClass(), "cdate", null);
        setField(term413756, term413756.getClass(), "inception", term413838);
        setField(term413756, term413756.getClass(), "ledger_index", term413840);
        setField(term413842, term413842.getClass(), "issuer", "EzXNRELwFS");
        setField(term413842, term413842.getClass(), "kyc", term413855);
        setField(term413756, term413756.getClass(), "accountName", term413842);
        setField(term413857, term413857.getClass(), "issuer", "shKYNJlwYH");
        setField(term413857, term413857.getClass(), "kyc", term413870);
        setField(term413756, term413756.getClass(), "parentName", term413857);
        setField(term413756, term413756.getClass(), "kycApproved", term413872);
        term413874 = new Long(-5921915827741960720L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term413874;
        callMethod(klass, "setLedger_index", argTypes, term413756, args);
    }

};


