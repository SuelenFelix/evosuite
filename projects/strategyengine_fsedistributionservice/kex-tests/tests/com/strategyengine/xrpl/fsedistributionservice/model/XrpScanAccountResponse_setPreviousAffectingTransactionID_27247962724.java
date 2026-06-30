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

public class XrpScanAccountResponse_setPreviousAffectingTransactionID_27247962724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term412479;

    public XrpScanAccountResponse_setPreviousAffectingTransactionID_27247962724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term412480 = new Long(3365899934091025813L);
        Integer term412494 = new Integer(-1970452551);
        Long term412563 = new Long(8532808243879007296L);
        Boolean term412578 = new Boolean(true);
        Boolean term412593 = new Boolean(false);
        Boolean term412595 = new Boolean(false);
        term412479 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse"));
        Object term412544 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term412545 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term412547 = (int[]) newIntArray(6);
        Object term412561 = newInstance(Class.forName("java.util.Date"));
        Object term412565 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term412580 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term412479, term412479.getClass(), "sequence", term412480);
        setField(term412479, term412479.getClass(), "xrpBalance", "rpkeVpZPhu");
        setField(term412479, term412479.getClass(), "ownerCount", term412494);
        setField(term412479, term412479.getClass(), "previousAffectingTransactionID", "uHBSUMfWOZ");
        setField(term412479, term412479.getClass(), "previousAffectingTransactionLedgerVersion", "xoeEmeAhlA");
        setField(term412479, term412479.getClass(), "account", "UISejJfFNT");
        setField(term412479, term412479.getClass(), "parent", "RgLyZXkceG");
        setIntField(term412545, term412545.getClass(), "signum", 1);
        setIntElement(term412547, 0, 5375);
        setIntElement(term412547, 1, 1557637088);
        setIntElement(term412547, 2, 652348010);
        setIntElement(term412547, 3, -1054845565);
        setIntElement(term412547, 4, -1660484703);
        setIntElement(term412547, 5, 291399813);
        setField(term412545, term412545.getClass(), "mag", term412547);
        setIntField(term412545, term412545.getClass(), "bitCountPlusOne", 0);
        setIntField(term412545, term412545.getClass(), "bitLengthPlusOne", 0);
        setIntField(term412545, term412545.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term412545, term412545.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term412544, term412544.getClass(), "intVal", term412545);
        setIntField(term412544, term412544.getClass(), "scale", 52);
        setIntField(term412544, term412544.getClass(), "precision", 0);
        setField(term412544, term412544.getClass(), "stringCache", null);
        setLongField(term412544, term412544.getClass(), "intCompact", -9223372036854775808L);
        setField(term412479, term412479.getClass(), "initial_balance", term412544);
        setLongField(term412561, term412561.getClass(), "fastTime", 1358912215869L);
        setField(term412561, term412561.getClass(), "cdate", null);
        setField(term412479, term412479.getClass(), "inception", term412561);
        setField(term412479, term412479.getClass(), "ledger_index", term412563);
        setField(term412565, term412565.getClass(), "issuer", "mUhwqqpbkS");
        setField(term412565, term412565.getClass(), "kyc", term412578);
        setField(term412479, term412479.getClass(), "accountName", term412565);
        setField(term412580, term412580.getClass(), "issuer", "AJCHLiIHmt");
        setField(term412580, term412580.getClass(), "kyc", term412593);
        setField(term412479, term412479.getClass(), "parentName", term412580);
        setField(term412479, term412479.getClass(), "kycApproved", term412595);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LokBLFSQmd";
        callMethod(klass, "setPreviousAffectingTransactionID", argTypes, term412479, args);
    }

};


