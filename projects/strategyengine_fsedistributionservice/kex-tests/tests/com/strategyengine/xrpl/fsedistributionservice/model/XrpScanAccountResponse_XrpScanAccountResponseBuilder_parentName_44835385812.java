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

public class XrpScanAccountResponse_XrpScanAccountResponseBuilder_parentName_44835385812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term445590;
     Object term445708;

    public XrpScanAccountResponse_XrpScanAccountResponseBuilder_parentName_44835385812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term445591 = new Long(7007517375697316368L);
        Integer term445605 = new Integer(-542712742);
        Long term445674 = new Long(8485924987529500210L);
        Boolean term445689 = new Boolean(true);
        Boolean term445704 = new Boolean(false);
        Boolean term445706 = new Boolean(false);
        term445590 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder"));
        Object term445655 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term445656 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term445658 = (int[]) newIntArray(6);
        Object term445672 = newInstance(Class.forName("java.util.Date"));
        Object term445676 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term445691 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term445590, term445590.getClass(), "sequence", term445591);
        setField(term445590, term445590.getClass(), "xrpBalance", "cErqWEXoNv");
        setField(term445590, term445590.getClass(), "ownerCount", term445605);
        setField(term445590, term445590.getClass(), "previousAffectingTransactionID", "lxTtgYEUNY");
        setField(term445590, term445590.getClass(), "previousAffectingTransactionLedgerVersion", "UgDLKYCyKA");
        setField(term445590, term445590.getClass(), "account", "DepyVBcXry");
        setField(term445590, term445590.getClass(), "parent", "niKvJJXdeU");
        setIntField(term445656, term445656.getClass(), "signum", 1);
        setIntElement(term445658, 0, 1221);
        setIntElement(term445658, 1, 511991754);
        setIntElement(term445658, 2, -1171234799);
        setIntElement(term445658, 3, 326150800);
        setIntElement(term445658, 4, 1591167290);
        setIntElement(term445658, 5, -564918823);
        setField(term445656, term445656.getClass(), "mag", term445658);
        setIntField(term445656, term445656.getClass(), "bitCountPlusOne", 0);
        setIntField(term445656, term445656.getClass(), "bitLengthPlusOne", 0);
        setIntField(term445656, term445656.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term445656, term445656.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term445655, term445655.getClass(), "intVal", term445656);
        setIntField(term445655, term445655.getClass(), "scale", 53);
        setIntField(term445655, term445655.getClass(), "precision", 0);
        setField(term445655, term445655.getClass(), "stringCache", null);
        setLongField(term445655, term445655.getClass(), "intCompact", -9223372036854775808L);
        setField(term445590, term445590.getClass(), "initial_balance", term445655);
        setLongField(term445672, term445672.getClass(), "fastTime", 1790054482905L);
        setField(term445672, term445672.getClass(), "cdate", null);
        setField(term445590, term445590.getClass(), "inception", term445672);
        setField(term445590, term445590.getClass(), "ledger_index", term445674);
        setField(term445676, term445676.getClass(), "issuer", "mJgellfeNf");
        setField(term445676, term445676.getClass(), "kyc", term445689);
        setField(term445590, term445590.getClass(), "accountName", term445676);
        setField(term445691, term445691.getClass(), "issuer", "gPuHFpKpgV");
        setField(term445691, term445691.getClass(), "kyc", term445704);
        setField(term445590, term445590.getClass(), "parentName", term445691);
        setField(term445590, term445590.getClass(), "kycApproved", term445706);
        Boolean term445721 = new Boolean(true);
        term445708 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term445708, term445708.getClass(), "issuer", "QZttLDZgnr");
        setField(term445708, term445708.getClass(), "kyc", term445721);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName");
        Object[] args = new Object[1];
        args[0] = term445708;
        callMethod(klass, "parentName", argTypes, term445590, args);
    }

};


