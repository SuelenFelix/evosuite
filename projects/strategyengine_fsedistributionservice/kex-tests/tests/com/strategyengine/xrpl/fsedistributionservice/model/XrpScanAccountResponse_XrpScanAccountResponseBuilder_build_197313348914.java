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

public class XrpScanAccountResponse_XrpScanAccountResponseBuilder_build_197313348914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term446005;

    public XrpScanAccountResponse_XrpScanAccountResponseBuilder_build_197313348914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term446006 = new Long(4543928187003669961L);
        Integer term446020 = new Integer(-1111249833);
        Long term446089 = new Long(-1536013261126093321L);
        Boolean term446104 = new Boolean(true);
        Boolean term446119 = new Boolean(true);
        Boolean term446121 = new Boolean(false);
        term446005 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder"));
        Object term446070 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term446071 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term446073 = (int[]) newIntArray(6);
        Object term446087 = newInstance(Class.forName("java.util.Date"));
        Object term446091 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term446106 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term446005, term446005.getClass(), "sequence", term446006);
        setField(term446005, term446005.getClass(), "xrpBalance", "UjlZvHchZX");
        setField(term446005, term446005.getClass(), "ownerCount", term446020);
        setField(term446005, term446005.getClass(), "previousAffectingTransactionID", "ZoGOphtbMj");
        setField(term446005, term446005.getClass(), "previousAffectingTransactionLedgerVersion", "FxtuMMZTnJ");
        setField(term446005, term446005.getClass(), "account", "xqcrleZqqU");
        setField(term446005, term446005.getClass(), "parent", "GZfyTlJvPo");
        setIntField(term446071, term446071.getClass(), "signum", 1);
        setIntElement(term446073, 0, 39105);
        setIntElement(term446073, 1, 60945427);
        setIntElement(term446073, 2, -1808451247);
        setIntElement(term446073, 3, 726737989);
        setIntElement(term446073, 4, -1008851055);
        setIntElement(term446073, 5, -788301887);
        setField(term446071, term446071.getClass(), "mag", term446073);
        setIntField(term446071, term446071.getClass(), "bitCountPlusOne", 0);
        setIntField(term446071, term446071.getClass(), "bitLengthPlusOne", 0);
        setIntField(term446071, term446071.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term446071, term446071.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term446070, term446070.getClass(), "intVal", term446071);
        setIntField(term446070, term446070.getClass(), "scale", 53);
        setIntField(term446070, term446070.getClass(), "precision", 0);
        setField(term446070, term446070.getClass(), "stringCache", null);
        setLongField(term446070, term446070.getClass(), "intCompact", -9223372036854775808L);
        setField(term446005, term446005.getClass(), "initial_balance", term446070);
        setLongField(term446087, term446087.getClass(), "fastTime", 1502388264503L);
        setField(term446087, term446087.getClass(), "cdate", null);
        setField(term446005, term446005.getClass(), "inception", term446087);
        setField(term446005, term446005.getClass(), "ledger_index", term446089);
        setField(term446091, term446091.getClass(), "issuer", "ErykqtSHSR");
        setField(term446091, term446091.getClass(), "kyc", term446104);
        setField(term446005, term446005.getClass(), "accountName", term446091);
        setField(term446106, term446106.getClass(), "issuer", "cYBIjKvbtm");
        setField(term446106, term446106.getClass(), "kyc", term446119);
        setField(term446005, term446005.getClass(), "parentName", term446106);
        setField(term446005, term446005.getClass(), "kycApproved", term446121);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term446005, args);
    }

};


