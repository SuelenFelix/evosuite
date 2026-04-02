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

public class XrpScanAccountResponse_hashCode_9059267044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term408768;

    public XrpScanAccountResponse_hashCode_9059267044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term408769 = new Long(-8946539398468447729L);
        Integer term408783 = new Integer(1384592638);
        Long term408852 = new Long(-5919044245258983254L);
        Boolean term408867 = new Boolean(false);
        Boolean term408882 = new Boolean(true);
        Boolean term408884 = new Boolean(true);
        term408768 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse"));
        Object term408833 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term408834 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term408836 = (int[]) newIntArray(6);
        Object term408850 = newInstance(Class.forName("java.util.Date"));
        Object term408854 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term408869 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term408768, term408768.getClass(), "sequence", term408769);
        setField(term408768, term408768.getClass(), "xrpBalance", "HmNmlOrLYU");
        setField(term408768, term408768.getClass(), "ownerCount", term408783);
        setField(term408768, term408768.getClass(), "previousAffectingTransactionID", "vGBeVRICqD");
        setField(term408768, term408768.getClass(), "previousAffectingTransactionLedgerVersion", "qcloozSJvL");
        setField(term408768, term408768.getClass(), "account", "RvJyAUwaJt");
        setField(term408768, term408768.getClass(), "parent", "WPbAmqsBdB");
        setIntField(term408834, term408834.getClass(), "signum", 1);
        setIntElement(term408836, 0, 24845);
        setIntElement(term408836, 1, -204179620);
        setIntElement(term408836, 2, -106771691);
        setIntElement(term408836, 3, 1748129383);
        setIntElement(term408836, 4, -1098928965);
        setIntElement(term408836, 5, -1951010831);
        setField(term408834, term408834.getClass(), "mag", term408836);
        setIntField(term408834, term408834.getClass(), "bitCountPlusOne", 0);
        setIntField(term408834, term408834.getClass(), "bitLengthPlusOne", 0);
        setIntField(term408834, term408834.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term408834, term408834.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term408833, term408833.getClass(), "intVal", term408834);
        setIntField(term408833, term408833.getClass(), "scale", 53);
        setIntField(term408833, term408833.getClass(), "precision", 0);
        setField(term408833, term408833.getClass(), "stringCache", null);
        setLongField(term408833, term408833.getClass(), "intCompact", -9223372036854775808L);
        setField(term408768, term408768.getClass(), "initial_balance", term408833);
        setLongField(term408850, term408850.getClass(), "fastTime", 1511036687509L);
        setField(term408850, term408850.getClass(), "cdate", null);
        setField(term408768, term408768.getClass(), "inception", term408850);
        setField(term408768, term408768.getClass(), "ledger_index", term408852);
        setField(term408854, term408854.getClass(), "issuer", "pYkUSbeFIy");
        setField(term408854, term408854.getClass(), "kyc", term408867);
        setField(term408768, term408768.getClass(), "accountName", term408854);
        setField(term408869, term408869.getClass(), "issuer", "aslRdJAxqq");
        setField(term408869, term408869.getClass(), "kyc", term408882);
        setField(term408768, term408768.getClass(), "parentName", term408869);
        setField(term408768, term408768.getClass(), "kycApproved", term408884);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term408768, args);
    }

};


