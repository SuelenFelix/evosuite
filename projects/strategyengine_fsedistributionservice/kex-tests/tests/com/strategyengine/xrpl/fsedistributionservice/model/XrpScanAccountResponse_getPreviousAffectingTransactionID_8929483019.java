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

public class XrpScanAccountResponse_getPreviousAffectingTransactionID_8929483019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409738;

    public XrpScanAccountResponse_getPreviousAffectingTransactionID_8929483019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term409739 = new Long(493485007607912369L);
        Integer term409753 = new Integer(-1274456137);
        Long term409822 = new Long(-8980424779299328600L);
        Boolean term409837 = new Boolean(false);
        Boolean term409852 = new Boolean(false);
        Boolean term409854 = new Boolean(false);
        term409738 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse"));
        Object term409803 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term409804 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term409806 = (int[]) newIntArray(6);
        Object term409820 = newInstance(Class.forName("java.util.Date"));
        Object term409824 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term409839 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term409738, term409738.getClass(), "sequence", term409739);
        setField(term409738, term409738.getClass(), "xrpBalance", "EJsOMQLFBT");
        setField(term409738, term409738.getClass(), "ownerCount", term409753);
        setField(term409738, term409738.getClass(), "previousAffectingTransactionID", "pPLPfTNTko");
        setField(term409738, term409738.getClass(), "previousAffectingTransactionLedgerVersion", "DDIcAmyVHW");
        setField(term409738, term409738.getClass(), "account", "NGZdGZFMkB");
        setField(term409738, term409738.getClass(), "parent", "YVpPEyJHMG");
        setIntField(term409804, term409804.getClass(), "signum", 1);
        setIntElement(term409806, 0, 2215);
        setIntElement(term409806, 1, -1270781433);
        setIntElement(term409806, 2, 524945021);
        setIntElement(term409806, 3, 1102440339);
        setIntElement(term409806, 4, 1502907533);
        setIntElement(term409806, 5, 743577859);
        setField(term409804, term409804.getClass(), "mag", term409806);
        setIntField(term409804, term409804.getClass(), "bitCountPlusOne", 0);
        setIntField(term409804, term409804.getClass(), "bitLengthPlusOne", 0);
        setIntField(term409804, term409804.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term409804, term409804.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term409803, term409803.getClass(), "intVal", term409804);
        setIntField(term409803, term409803.getClass(), "scale", 52);
        setIntField(term409803, term409803.getClass(), "precision", 0);
        setField(term409803, term409803.getClass(), "stringCache", null);
        setLongField(term409803, term409803.getClass(), "intCompact", -9223372036854775808L);
        setField(term409738, term409738.getClass(), "initial_balance", term409803);
        setLongField(term409820, term409820.getClass(), "fastTime", 1873761701654L);
        setField(term409820, term409820.getClass(), "cdate", null);
        setField(term409738, term409738.getClass(), "inception", term409820);
        setField(term409738, term409738.getClass(), "ledger_index", term409822);
        setField(term409824, term409824.getClass(), "issuer", "msJZLOQXdn");
        setField(term409824, term409824.getClass(), "kyc", term409837);
        setField(term409738, term409738.getClass(), "accountName", term409824);
        setField(term409839, term409839.getClass(), "issuer", "xSzkQnpniw");
        setField(term409839, term409839.getClass(), "kyc", term409852);
        setField(term409738, term409738.getClass(), "parentName", term409839);
        setField(term409738, term409738.getClass(), "kycApproved", term409854);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPreviousAffectingTransactionID", argTypes, term409738, args);
    }

};


