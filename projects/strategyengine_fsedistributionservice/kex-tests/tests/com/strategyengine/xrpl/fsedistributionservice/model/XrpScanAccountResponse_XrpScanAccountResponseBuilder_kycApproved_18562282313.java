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

public class XrpScanAccountResponse_XrpScanAccountResponseBuilder_kycApproved_18562282313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term445809;
     Object term445927;

    public XrpScanAccountResponse_XrpScanAccountResponseBuilder_kycApproved_18562282313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term445810 = new Long(1397546230296552361L);
        Integer term445824 = new Integer(-1254072822);
        Long term445893 = new Long(4531694455151993856L);
        Boolean term445908 = new Boolean(false);
        Boolean term445923 = new Boolean(true);
        Boolean term445925 = new Boolean(false);
        term445809 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder"));
        Object term445874 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term445875 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term445877 = (int[]) newIntArray(6);
        Object term445891 = newInstance(Class.forName("java.util.Date"));
        Object term445895 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term445910 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term445809, term445809.getClass(), "sequence", term445810);
        setField(term445809, term445809.getClass(), "xrpBalance", "RTIZssHrmC");
        setField(term445809, term445809.getClass(), "ownerCount", term445824);
        setField(term445809, term445809.getClass(), "previousAffectingTransactionID", "JjSHZkcGOm");
        setField(term445809, term445809.getClass(), "previousAffectingTransactionLedgerVersion", "AYriOKQIPd");
        setField(term445809, term445809.getClass(), "account", "KAEOLEfusb");
        setField(term445809, term445809.getClass(), "parent", "LFDnNsBZdo");
        setIntField(term445875, term445875.getClass(), "signum", 1);
        setIntElement(term445877, 0, 3007);
        setIntElement(term445877, 1, 1696840022);
        setIntElement(term445877, 2, -971232484);
        setIntElement(term445877, 3, 1997796172);
        setIntElement(term445877, 4, 602996527);
        setIntElement(term445877, 5, -389214311);
        setField(term445875, term445875.getClass(), "mag", term445877);
        setIntField(term445875, term445875.getClass(), "bitCountPlusOne", 0);
        setIntField(term445875, term445875.getClass(), "bitLengthPlusOne", 0);
        setIntField(term445875, term445875.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term445875, term445875.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term445874, term445874.getClass(), "intVal", term445875);
        setIntField(term445874, term445874.getClass(), "scale", 52);
        setIntField(term445874, term445874.getClass(), "precision", 0);
        setField(term445874, term445874.getClass(), "stringCache", null);
        setLongField(term445874, term445874.getClass(), "intCompact", -9223372036854775808L);
        setField(term445809, term445809.getClass(), "initial_balance", term445874);
        setLongField(term445891, term445891.getClass(), "fastTime", 1594574431386L);
        setField(term445891, term445891.getClass(), "cdate", null);
        setField(term445809, term445809.getClass(), "inception", term445891);
        setField(term445809, term445809.getClass(), "ledger_index", term445893);
        setField(term445895, term445895.getClass(), "issuer", "prSWHcndlk");
        setField(term445895, term445895.getClass(), "kyc", term445908);
        setField(term445809, term445809.getClass(), "accountName", term445895);
        setField(term445910, term445910.getClass(), "issuer", "jikicdaZoQ");
        setField(term445910, term445910.getClass(), "kyc", term445923);
        setField(term445809, term445809.getClass(), "parentName", term445910);
        setField(term445809, term445809.getClass(), "kycApproved", term445925);
        term445927 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term445927;
        callMethod(klass, "kycApproved", argTypes, term445809, args);
    }

};


