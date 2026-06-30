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

public class XrpScanAccountResponse_XrpScanAccountResponseBuilder_parent_13965331787 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term444546;

    public XrpScanAccountResponse_XrpScanAccountResponseBuilder_parent_13965331787() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term444547 = new Long(-1338195308090100406L);
        Integer term444561 = new Integer(-1146679443);
        Long term444630 = new Long(3619359432967414857L);
        Boolean term444645 = new Boolean(true);
        Boolean term444660 = new Boolean(true);
        Boolean term444662 = new Boolean(false);
        term444546 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder"));
        Object term444611 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term444612 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term444614 = (int[]) newIntArray(6);
        Object term444628 = newInstance(Class.forName("java.util.Date"));
        Object term444632 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term444647 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term444546, term444546.getClass(), "sequence", term444547);
        setField(term444546, term444546.getClass(), "xrpBalance", "MeqXPTruBL");
        setField(term444546, term444546.getClass(), "ownerCount", term444561);
        setField(term444546, term444546.getClass(), "previousAffectingTransactionID", "jjqkfZqAuK");
        setField(term444546, term444546.getClass(), "previousAffectingTransactionLedgerVersion", "oBCrGVIYdD");
        setField(term444546, term444546.getClass(), "account", "wuSSpQZPZU");
        setField(term444546, term444546.getClass(), "parent", "eaArOXcEdx");
        setIntField(term444612, term444612.getClass(), "signum", 1);
        setIntElement(term444614, 0, 1201);
        setIntElement(term444614, 1, 1203921287);
        setIntElement(term444614, 2, 1219554197);
        setIntElement(term444614, 3, -385627795);
        setIntElement(term444614, 4, -2000991035);
        setIntElement(term444614, 5, 1439239763);
        setField(term444612, term444612.getClass(), "mag", term444614);
        setIntField(term444612, term444612.getClass(), "bitCountPlusOne", 0);
        setIntField(term444612, term444612.getClass(), "bitLengthPlusOne", 0);
        setIntField(term444612, term444612.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term444612, term444612.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term444611, term444611.getClass(), "intVal", term444612);
        setIntField(term444611, term444611.getClass(), "scale", 52);
        setIntField(term444611, term444611.getClass(), "precision", 0);
        setField(term444611, term444611.getClass(), "stringCache", null);
        setLongField(term444611, term444611.getClass(), "intCompact", -9223372036854775808L);
        setField(term444546, term444546.getClass(), "initial_balance", term444611);
        setLongField(term444628, term444628.getClass(), "fastTime", 1353970998542L);
        setField(term444628, term444628.getClass(), "cdate", null);
        setField(term444546, term444546.getClass(), "inception", term444628);
        setField(term444546, term444546.getClass(), "ledger_index", term444630);
        setField(term444632, term444632.getClass(), "issuer", "ynSIbcCBaI");
        setField(term444632, term444632.getClass(), "kyc", term444645);
        setField(term444546, term444546.getClass(), "accountName", term444632);
        setField(term444647, term444647.getClass(), "issuer", "LaaQtlDqEd");
        setField(term444647, term444647.getClass(), "kyc", term444660);
        setField(term444546, term444546.getClass(), "parentName", term444647);
        setField(term444546, term444546.getClass(), "kycApproved", term444662);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "rVKVHcfKQD";
        callMethod(klass, "parent", argTypes, term444546, args);
    }

};


