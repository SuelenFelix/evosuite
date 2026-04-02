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

public class XrpScanAccountResponse_toBuilder_145185551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term408184;

    public XrpScanAccountResponse_toBuilder_145185551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term408185 = new Long(-4078647199307459633L);
        Integer term408199 = new Integer(229204365);
        Long term408268 = new Long(-2505751043723962819L);
        Boolean term408283 = new Boolean(true);
        Boolean term408298 = new Boolean(true);
        Boolean term408300 = new Boolean(true);
        term408184 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse"));
        Object term408249 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term408250 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term408252 = (int[]) newIntArray(6);
        Object term408266 = newInstance(Class.forName("java.util.Date"));
        Object term408270 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term408285 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term408184, term408184.getClass(), "sequence", term408185);
        setField(term408184, term408184.getClass(), "xrpBalance", "CaztRRdvSW");
        setField(term408184, term408184.getClass(), "ownerCount", term408199);
        setField(term408184, term408184.getClass(), "previousAffectingTransactionID", "GFmsvWuxkH");
        setField(term408184, term408184.getClass(), "previousAffectingTransactionLedgerVersion", "MXGilcTQHk");
        setField(term408184, term408184.getClass(), "account", "rjiIdWkVuJ");
        setField(term408184, term408184.getClass(), "parent", "hovNRReWVy");
        setIntField(term408250, term408250.getClass(), "signum", 1);
        setIntElement(term408252, 0, 38711);
        setIntElement(term408252, 1, 1033767178);
        setIntElement(term408252, 2, -530813502);
        setIntElement(term408252, 3, 191686813);
        setIntElement(term408252, 4, -1668217387);
        setIntElement(term408252, 5, 461271115);
        setField(term408250, term408250.getClass(), "mag", term408252);
        setIntField(term408250, term408250.getClass(), "bitCountPlusOne", 0);
        setIntField(term408250, term408250.getClass(), "bitLengthPlusOne", 0);
        setIntField(term408250, term408250.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term408250, term408250.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term408249, term408249.getClass(), "intVal", term408250);
        setIntField(term408249, term408249.getClass(), "scale", 53);
        setIntField(term408249, term408249.getClass(), "precision", 0);
        setField(term408249, term408249.getClass(), "stringCache", null);
        setLongField(term408249, term408249.getClass(), "intCompact", -9223372036854775808L);
        setField(term408184, term408184.getClass(), "initial_balance", term408249);
        setLongField(term408266, term408266.getClass(), "fastTime", 1708225162176L);
        setField(term408266, term408266.getClass(), "cdate", null);
        setField(term408184, term408184.getClass(), "inception", term408266);
        setField(term408184, term408184.getClass(), "ledger_index", term408268);
        setField(term408270, term408270.getClass(), "issuer", "bmugCmWSnL");
        setField(term408270, term408270.getClass(), "kyc", term408283);
        setField(term408184, term408184.getClass(), "accountName", term408270);
        setField(term408285, term408285.getClass(), "issuer", "fPjxaiBsNt");
        setField(term408285, term408285.getClass(), "kyc", term408298);
        setField(term408184, term408184.getClass(), "parentName", term408285);
        setField(term408184, term408184.getClass(), "kycApproved", term408300);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBuilder", argTypes, term408184, args);
    }

};


