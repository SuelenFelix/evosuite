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

public class XrpScanAccountResponse_getInitialbalance_115997387713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term410514;

    public XrpScanAccountResponse_getInitialbalance_115997387713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term410515 = new Long(3058795643782579829L);
        Integer term410529 = new Integer(-1885090354);
        Long term410598 = new Long(3729905560436815423L);
        Boolean term410613 = new Boolean(false);
        Boolean term410628 = new Boolean(false);
        Boolean term410630 = new Boolean(false);
        term410514 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse"));
        Object term410579 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term410580 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term410582 = (int[]) newIntArray(6);
        Object term410596 = newInstance(Class.forName("java.util.Date"));
        Object term410600 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term410615 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term410514, term410514.getClass(), "sequence", term410515);
        setField(term410514, term410514.getClass(), "xrpBalance", "aPRGIMaEPp");
        setField(term410514, term410514.getClass(), "ownerCount", term410529);
        setField(term410514, term410514.getClass(), "previousAffectingTransactionID", "dUGbHGAPib");
        setField(term410514, term410514.getClass(), "previousAffectingTransactionLedgerVersion", "lszhTAzhyn");
        setField(term410514, term410514.getClass(), "account", "ODNaUglXVz");
        setField(term410514, term410514.getClass(), "parent", "paRWrNNjau");
        setIntField(term410580, term410580.getClass(), "signum", 1);
        setIntElement(term410582, 0, 32877);
        setIntElement(term410582, 1, -1599166767);
        setIntElement(term410582, 2, -569183780);
        setIntElement(term410582, 3, -1744583810);
        setIntElement(term410582, 4, -2089041782);
        setIntElement(term410582, 5, -594998743);
        setField(term410580, term410580.getClass(), "mag", term410582);
        setIntField(term410580, term410580.getClass(), "bitCountPlusOne", 0);
        setIntField(term410580, term410580.getClass(), "bitLengthPlusOne", 0);
        setIntField(term410580, term410580.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term410580, term410580.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term410579, term410579.getClass(), "intVal", term410580);
        setIntField(term410579, term410579.getClass(), "scale", 53);
        setIntField(term410579, term410579.getClass(), "precision", 0);
        setField(term410579, term410579.getClass(), "stringCache", null);
        setLongField(term410579, term410579.getClass(), "intCompact", -9223372036854775808L);
        setField(term410514, term410514.getClass(), "initial_balance", term410579);
        setLongField(term410596, term410596.getClass(), "fastTime", 1665428751883L);
        setField(term410596, term410596.getClass(), "cdate", null);
        setField(term410514, term410514.getClass(), "inception", term410596);
        setField(term410514, term410514.getClass(), "ledger_index", term410598);
        setField(term410600, term410600.getClass(), "issuer", "xYDVnaWhJX");
        setField(term410600, term410600.getClass(), "kyc", term410613);
        setField(term410514, term410514.getClass(), "accountName", term410600);
        setField(term410615, term410615.getClass(), "issuer", "DgLnmWcSNo");
        setField(term410615, term410615.getClass(), "kyc", term410628);
        setField(term410514, term410514.getClass(), "parentName", term410615);
        setField(term410514, term410514.getClass(), "kycApproved", term410630);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInitial_balance", argTypes, term410514, args);
    }

};


