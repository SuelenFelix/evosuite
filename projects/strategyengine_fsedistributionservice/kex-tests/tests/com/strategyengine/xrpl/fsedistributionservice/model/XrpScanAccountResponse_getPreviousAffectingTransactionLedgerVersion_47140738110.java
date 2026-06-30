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

public class XrpScanAccountResponse_getPreviousAffectingTransactionLedgerVersion_47140738110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409932;

    public XrpScanAccountResponse_getPreviousAffectingTransactionLedgerVersion_47140738110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term409933 = new Long(-7229609748965405580L);
        Integer term409947 = new Integer(1041916673);
        Long term410016 = new Long(7507072654888524944L);
        Boolean term410031 = new Boolean(true);
        Boolean term410046 = new Boolean(true);
        Boolean term410048 = new Boolean(false);
        term409932 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse"));
        Object term409997 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term409998 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term410000 = (int[]) newIntArray(6);
        Object term410014 = newInstance(Class.forName("java.util.Date"));
        Object term410018 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term410033 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term409932, term409932.getClass(), "sequence", term409933);
        setField(term409932, term409932.getClass(), "xrpBalance", "ZavNLUnxAM");
        setField(term409932, term409932.getClass(), "ownerCount", term409947);
        setField(term409932, term409932.getClass(), "previousAffectingTransactionID", "PRWGbTHeCZ");
        setField(term409932, term409932.getClass(), "previousAffectingTransactionLedgerVersion", "rQyRjKpYAl");
        setField(term409932, term409932.getClass(), "account", "BzpLtOjekg");
        setField(term409932, term409932.getClass(), "parent", "nintxVDHsE");
        setIntField(term409998, term409998.getClass(), "signum", 1);
        setIntElement(term410000, 0, 19458);
        setIntElement(term410000, 1, -1232510219);
        setIntElement(term410000, 2, -1084191877);
        setIntElement(term410000, 3, 1473605384);
        setIntElement(term410000, 4, -1473129878);
        setIntElement(term410000, 5, -1426150847);
        setField(term409998, term409998.getClass(), "mag", term410000);
        setIntField(term409998, term409998.getClass(), "bitCountPlusOne", 0);
        setIntField(term409998, term409998.getClass(), "bitLengthPlusOne", 0);
        setIntField(term409998, term409998.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term409998, term409998.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term409997, term409997.getClass(), "intVal", term409998);
        setIntField(term409997, term409997.getClass(), "scale", 53);
        setIntField(term409997, term409997.getClass(), "precision", 0);
        setField(term409997, term409997.getClass(), "stringCache", null);
        setLongField(term409997, term409997.getClass(), "intCompact", -9223372036854775808L);
        setField(term409932, term409932.getClass(), "initial_balance", term409997);
        setLongField(term410014, term410014.getClass(), "fastTime", 1567259752761L);
        setField(term410014, term410014.getClass(), "cdate", null);
        setField(term409932, term409932.getClass(), "inception", term410014);
        setField(term409932, term409932.getClass(), "ledger_index", term410016);
        setField(term410018, term410018.getClass(), "issuer", "xshvvpVuIr");
        setField(term410018, term410018.getClass(), "kyc", term410031);
        setField(term409932, term409932.getClass(), "accountName", term410018);
        setField(term410033, term410033.getClass(), "issuer", "YbAQojaNEs");
        setField(term410033, term410033.getClass(), "kyc", term410046);
        setField(term409932, term409932.getClass(), "parentName", term410033);
        setField(term409932, term409932.getClass(), "kycApproved", term410048);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPreviousAffectingTransactionLedgerVersion", argTypes, term409932, args);
    }

};


