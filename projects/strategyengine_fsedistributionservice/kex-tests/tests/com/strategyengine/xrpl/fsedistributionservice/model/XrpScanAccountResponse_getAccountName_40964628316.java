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

public class XrpScanAccountResponse_getAccountName_40964628316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term411096;

    public XrpScanAccountResponse_getAccountName_40964628316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term411097 = new Long(-3542890656778018623L);
        Integer term411111 = new Integer(197109649);
        Long term411180 = new Long(-2892042709653134442L);
        Boolean term411195 = new Boolean(false);
        Boolean term411210 = new Boolean(false);
        Boolean term411212 = new Boolean(true);
        term411096 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse"));
        Object term411161 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term411162 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term411164 = (int[]) newIntArray(6);
        Object term411178 = newInstance(Class.forName("java.util.Date"));
        Object term411182 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term411197 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term411096, term411096.getClass(), "sequence", term411097);
        setField(term411096, term411096.getClass(), "xrpBalance", "iOqolNKBBZ");
        setField(term411096, term411096.getClass(), "ownerCount", term411111);
        setField(term411096, term411096.getClass(), "previousAffectingTransactionID", "qHaXwWoRPp");
        setField(term411096, term411096.getClass(), "previousAffectingTransactionLedgerVersion", "rQwzadXXMc");
        setField(term411096, term411096.getClass(), "account", "gZzjwImIrc");
        setField(term411096, term411096.getClass(), "parent", "iQJtugmGBh");
        setIntField(term411162, term411162.getClass(), "signum", 1);
        setIntElement(term411164, 0, 31680);
        setIntElement(term411164, 1, 1333852263);
        setIntElement(term411164, 2, 1118133288);
        setIntElement(term411164, 3, -1665031106);
        setIntElement(term411164, 4, 493921560);
        setIntElement(term411164, 5, 1430028949);
        setField(term411162, term411162.getClass(), "mag", term411164);
        setIntField(term411162, term411162.getClass(), "bitCountPlusOne", 0);
        setIntField(term411162, term411162.getClass(), "bitLengthPlusOne", 0);
        setIntField(term411162, term411162.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term411162, term411162.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term411161, term411161.getClass(), "intVal", term411162);
        setIntField(term411161, term411161.getClass(), "scale", 53);
        setIntField(term411161, term411161.getClass(), "precision", 0);
        setField(term411161, term411161.getClass(), "stringCache", null);
        setLongField(term411161, term411161.getClass(), "intCompact", -9223372036854775808L);
        setField(term411096, term411096.getClass(), "initial_balance", term411161);
        setLongField(term411178, term411178.getClass(), "fastTime", 1863064143524L);
        setField(term411178, term411178.getClass(), "cdate", null);
        setField(term411096, term411096.getClass(), "inception", term411178);
        setField(term411096, term411096.getClass(), "ledger_index", term411180);
        setField(term411182, term411182.getClass(), "issuer", "fcqYTYiluc");
        setField(term411182, term411182.getClass(), "kyc", term411195);
        setField(term411096, term411096.getClass(), "accountName", term411182);
        setField(term411197, term411197.getClass(), "issuer", "whRzmsbgft");
        setField(term411197, term411197.getClass(), "kyc", term411210);
        setField(term411096, term411096.getClass(), "parentName", term411197);
        setField(term411096, term411096.getClass(), "kycApproved", term411212);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccountName", argTypes, term411096, args);
    }

};


