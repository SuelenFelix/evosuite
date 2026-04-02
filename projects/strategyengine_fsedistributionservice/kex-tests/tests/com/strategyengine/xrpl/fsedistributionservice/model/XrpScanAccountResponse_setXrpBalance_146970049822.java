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

public class XrpScanAccountResponse_setXrpBalance_146970049822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term412067;

    public XrpScanAccountResponse_setXrpBalance_146970049822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term412068 = new Long(3834297266838969495L);
        Integer term412082 = new Integer(991356662);
        Long term412151 = new Long(-3257831489581525693L);
        Boolean term412166 = new Boolean(false);
        Boolean term412181 = new Boolean(true);
        Boolean term412183 = new Boolean(true);
        term412067 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse"));
        Object term412132 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term412133 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term412135 = (int[]) newIntArray(6);
        Object term412149 = newInstance(Class.forName("java.util.Date"));
        Object term412153 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term412168 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term412067, term412067.getClass(), "sequence", term412068);
        setField(term412067, term412067.getClass(), "xrpBalance", "dYYtYLYBZf");
        setField(term412067, term412067.getClass(), "ownerCount", term412082);
        setField(term412067, term412067.getClass(), "previousAffectingTransactionID", "MECOvMKXsH");
        setField(term412067, term412067.getClass(), "previousAffectingTransactionLedgerVersion", "mvJDolKmzb");
        setField(term412067, term412067.getClass(), "account", "ndJXYHbYDA");
        setField(term412067, term412067.getClass(), "parent", "TlztQQjnqF");
        setIntField(term412133, term412133.getClass(), "signum", 1);
        setIntElement(term412135, 0, 1328);
        setIntElement(term412135, 1, 1121027273);
        setIntElement(term412135, 2, -590055713);
        setIntElement(term412135, 3, 819451733);
        setIntElement(term412135, 4, -1193875222);
        setIntElement(term412135, 5, -2054073857);
        setField(term412133, term412133.getClass(), "mag", term412135);
        setIntField(term412133, term412133.getClass(), "bitCountPlusOne", 0);
        setIntField(term412133, term412133.getClass(), "bitLengthPlusOne", 0);
        setIntField(term412133, term412133.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term412133, term412133.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term412132, term412132.getClass(), "intVal", term412133);
        setIntField(term412132, term412132.getClass(), "scale", 52);
        setIntField(term412132, term412132.getClass(), "precision", 0);
        setField(term412132, term412132.getClass(), "stringCache", null);
        setLongField(term412132, term412132.getClass(), "intCompact", -9223372036854775808L);
        setField(term412067, term412067.getClass(), "initial_balance", term412132);
        setLongField(term412149, term412149.getClass(), "fastTime", 1773631998071L);
        setField(term412149, term412149.getClass(), "cdate", null);
        setField(term412067, term412067.getClass(), "inception", term412149);
        setField(term412067, term412067.getClass(), "ledger_index", term412151);
        setField(term412153, term412153.getClass(), "issuer", "OrFmbgNXCQ");
        setField(term412153, term412153.getClass(), "kyc", term412166);
        setField(term412067, term412067.getClass(), "accountName", term412153);
        setField(term412168, term412168.getClass(), "issuer", "MLmGotxWzi");
        setField(term412168, term412168.getClass(), "kyc", term412181);
        setField(term412067, term412067.getClass(), "parentName", term412168);
        setField(term412067, term412067.getClass(), "kycApproved", term412183);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "BwZPpCJvdQ";
        callMethod(klass, "setXrpBalance", argTypes, term412067, args);
    }

};


