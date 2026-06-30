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

public class XrpScanAccountResponse_XrpScanAccountResponseBuilder_toString_157827451815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term446199;

    public XrpScanAccountResponse_XrpScanAccountResponseBuilder_toString_157827451815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term446200 = new Long(5953375436340093396L);
        Integer term446214 = new Integer(-1692331299);
        Long term446283 = new Long(-7089384741512135431L);
        Boolean term446298 = new Boolean(true);
        Boolean term446313 = new Boolean(false);
        Boolean term446315 = new Boolean(true);
        term446199 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder"));
        Object term446264 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term446265 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term446267 = (int[]) newIntArray(6);
        Object term446281 = newInstance(Class.forName("java.util.Date"));
        Object term446285 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term446300 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term446199, term446199.getClass(), "sequence", term446200);
        setField(term446199, term446199.getClass(), "xrpBalance", "BEvLYxGdKf");
        setField(term446199, term446199.getClass(), "ownerCount", term446214);
        setField(term446199, term446199.getClass(), "previousAffectingTransactionID", "ANkSSVQejl");
        setField(term446199, term446199.getClass(), "previousAffectingTransactionLedgerVersion", "UiDKxqVkSN");
        setField(term446199, term446199.getClass(), "account", "vxFZtlwdRB");
        setField(term446199, term446199.getClass(), "parent", "gwRYIIqrRr");
        setIntField(term446265, term446265.getClass(), "signum", 1);
        setIntElement(term446267, 0, 439);
        setIntElement(term446267, 1, 1412574599);
        setIntElement(term446267, 2, -2074556885);
        setIntElement(term446267, 3, 120311142);
        setIntElement(term446267, 4, -891389176);
        setIntElement(term446267, 5, -1928141367);
        setField(term446265, term446265.getClass(), "mag", term446267);
        setIntField(term446265, term446265.getClass(), "bitCountPlusOne", 0);
        setIntField(term446265, term446265.getClass(), "bitLengthPlusOne", 0);
        setIntField(term446265, term446265.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term446265, term446265.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term446264, term446264.getClass(), "intVal", term446265);
        setIntField(term446264, term446264.getClass(), "scale", 51);
        setIntField(term446264, term446264.getClass(), "precision", 0);
        setField(term446264, term446264.getClass(), "stringCache", null);
        setLongField(term446264, term446264.getClass(), "intCompact", -9223372036854775808L);
        setField(term446199, term446199.getClass(), "initial_balance", term446264);
        setLongField(term446281, term446281.getClass(), "fastTime", 1528407937869L);
        setField(term446281, term446281.getClass(), "cdate", null);
        setField(term446199, term446199.getClass(), "inception", term446281);
        setField(term446199, term446199.getClass(), "ledger_index", term446283);
        setField(term446285, term446285.getClass(), "issuer", "aBvLuPbJPh");
        setField(term446285, term446285.getClass(), "kyc", term446298);
        setField(term446199, term446199.getClass(), "accountName", term446285);
        setField(term446300, term446300.getClass(), "issuer", "TvrcwGmIbL");
        setField(term446300, term446300.getClass(), "kyc", term446313);
        setField(term446199, term446199.getClass(), "parentName", term446300);
        setField(term446199, term446199.getClass(), "kycApproved", term446315);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term446199, args);
    }

};


