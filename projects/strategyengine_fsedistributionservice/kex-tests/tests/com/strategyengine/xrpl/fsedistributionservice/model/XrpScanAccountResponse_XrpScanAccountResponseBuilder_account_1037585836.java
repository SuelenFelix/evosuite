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

public class XrpScanAccountResponse_XrpScanAccountResponseBuilder_account_1037585836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term444330;

    public XrpScanAccountResponse_XrpScanAccountResponseBuilder_account_1037585836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term444331 = new Long(4157679554798000555L);
        Integer term444345 = new Integer(1270666529);
        Long term444414 = new Long(-6869725878798445523L);
        Boolean term444429 = new Boolean(true);
        Boolean term444444 = new Boolean(true);
        Boolean term444446 = new Boolean(false);
        term444330 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder"));
        Object term444395 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term444396 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term444398 = (int[]) newIntArray(6);
        Object term444412 = newInstance(Class.forName("java.util.Date"));
        Object term444416 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term444431 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term444330, term444330.getClass(), "sequence", term444331);
        setField(term444330, term444330.getClass(), "xrpBalance", "aCaErGkYhA");
        setField(term444330, term444330.getClass(), "ownerCount", term444345);
        setField(term444330, term444330.getClass(), "previousAffectingTransactionID", "twbXfBZPUC");
        setField(term444330, term444330.getClass(), "previousAffectingTransactionLedgerVersion", "mYbjAQVgdp");
        setField(term444330, term444330.getClass(), "account", "bsHKGhUuqz");
        setField(term444330, term444330.getClass(), "parent", "FxfgxciexL");
        setIntField(term444396, term444396.getClass(), "signum", 1);
        setIntElement(term444398, 0, 61);
        setIntElement(term444398, 1, -1418846154);
        setIntElement(term444398, 2, 164282015);
        setIntElement(term444398, 3, -378405959);
        setIntElement(term444398, 4, -32629069);
        setIntElement(term444398, 5, -1101440283);
        setField(term444396, term444396.getClass(), "mag", term444398);
        setIntField(term444396, term444396.getClass(), "bitCountPlusOne", 0);
        setIntField(term444396, term444396.getClass(), "bitLengthPlusOne", 0);
        setIntField(term444396, term444396.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term444396, term444396.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term444395, term444395.getClass(), "intVal", term444396);
        setIntField(term444395, term444395.getClass(), "scale", 50);
        setIntField(term444395, term444395.getClass(), "precision", 0);
        setField(term444395, term444395.getClass(), "stringCache", null);
        setLongField(term444395, term444395.getClass(), "intCompact", -9223372036854775808L);
        setField(term444330, term444330.getClass(), "initial_balance", term444395);
        setLongField(term444412, term444412.getClass(), "fastTime", 1851215416127L);
        setField(term444412, term444412.getClass(), "cdate", null);
        setField(term444330, term444330.getClass(), "inception", term444412);
        setField(term444330, term444330.getClass(), "ledger_index", term444414);
        setField(term444416, term444416.getClass(), "issuer", "dBKinpPYLb");
        setField(term444416, term444416.getClass(), "kyc", term444429);
        setField(term444330, term444330.getClass(), "accountName", term444416);
        setField(term444431, term444431.getClass(), "issuer", "BsnkZbwWZk");
        setField(term444431, term444431.getClass(), "kyc", term444444);
        setField(term444330, term444330.getClass(), "parentName", term444431);
        setField(term444330, term444330.getClass(), "kycApproved", term444446);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tQDCijzzgW";
        callMethod(klass, "account", argTypes, term444330, args);
    }

};


