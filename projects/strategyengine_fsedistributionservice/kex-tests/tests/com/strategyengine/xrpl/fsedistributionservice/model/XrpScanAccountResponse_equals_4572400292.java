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

public class XrpScanAccountResponse_equals_4572400292 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term408378;
     Object term408496;

    public XrpScanAccountResponse_equals_4572400292() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term408379 = new Long(8156554915757243776L);
        Integer term408393 = new Integer(-461771056);
        Long term408462 = new Long(-351840430901591519L);
        Boolean term408477 = new Boolean(true);
        Boolean term408492 = new Boolean(false);
        Boolean term408494 = new Boolean(false);
        term408378 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse"));
        Object term408443 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term408444 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term408446 = (int[]) newIntArray(6);
        Object term408460 = newInstance(Class.forName("java.util.Date"));
        Object term408464 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term408479 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term408378, term408378.getClass(), "sequence", term408379);
        setField(term408378, term408378.getClass(), "xrpBalance", "egyDjxIvMN");
        setField(term408378, term408378.getClass(), "ownerCount", term408393);
        setField(term408378, term408378.getClass(), "previousAffectingTransactionID", "zqyYQpBynr");
        setField(term408378, term408378.getClass(), "previousAffectingTransactionLedgerVersion", "JzmhjVnRxU");
        setField(term408378, term408378.getClass(), "account", "hjCSTPfmnL");
        setField(term408378, term408378.getClass(), "parent", "bWXEGWHIvK");
        setIntField(term408444, term408444.getClass(), "signum", 1);
        setIntElement(term408446, 0, 43667);
        setIntElement(term408446, 1, -737760778);
        setIntElement(term408446, 2, 2127041210);
        setIntElement(term408446, 3, -1752956700);
        setIntElement(term408446, 4, 52008810);
        setIntElement(term408446, 5, 395796219);
        setField(term408444, term408444.getClass(), "mag", term408446);
        setIntField(term408444, term408444.getClass(), "bitCountPlusOne", 0);
        setIntField(term408444, term408444.getClass(), "bitLengthPlusOne", 0);
        setIntField(term408444, term408444.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term408444, term408444.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term408443, term408443.getClass(), "intVal", term408444);
        setIntField(term408443, term408443.getClass(), "scale", 53);
        setIntField(term408443, term408443.getClass(), "precision", 0);
        setField(term408443, term408443.getClass(), "stringCache", null);
        setLongField(term408443, term408443.getClass(), "intCompact", -9223372036854775808L);
        setField(term408378, term408378.getClass(), "initial_balance", term408443);
        setLongField(term408460, term408460.getClass(), "fastTime", 1793461955792L);
        setField(term408460, term408460.getClass(), "cdate", null);
        setField(term408378, term408378.getClass(), "inception", term408460);
        setField(term408378, term408378.getClass(), "ledger_index", term408462);
        setField(term408464, term408464.getClass(), "issuer", "znEoyMLBko");
        setField(term408464, term408464.getClass(), "kyc", term408477);
        setField(term408378, term408378.getClass(), "accountName", term408464);
        setField(term408479, term408479.getClass(), "issuer", "nRYFjxHgLD");
        setField(term408479, term408479.getClass(), "kyc", term408492);
        setField(term408378, term408378.getClass(), "parentName", term408479);
        setField(term408378, term408378.getClass(), "kycApproved", term408494);
        term408496 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term408496;
        callMethod(klass, "equals", argTypes, term408378, args);
    }

};


