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

public class XrpScanAccountResponse_setInitialbalance_148661568128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term413343;
     Object term413461;

    public XrpScanAccountResponse_setInitialbalance_148661568128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term413344 = new Long(-1177978844927364440L);
        Integer term413358 = new Integer(1687361082);
        Long term413427 = new Long(-2253606887164749750L);
        Boolean term413442 = new Boolean(false);
        Boolean term413457 = new Boolean(false);
        Boolean term413459 = new Boolean(false);
        term413343 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse"));
        Object term413408 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term413409 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term413411 = (int[]) newIntArray(6);
        Object term413425 = newInstance(Class.forName("java.util.Date"));
        Object term413429 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term413444 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term413343, term413343.getClass(), "sequence", term413344);
        setField(term413343, term413343.getClass(), "xrpBalance", "gQmndIJPOK");
        setField(term413343, term413343.getClass(), "ownerCount", term413358);
        setField(term413343, term413343.getClass(), "previousAffectingTransactionID", "nbznuCsBRK");
        setField(term413343, term413343.getClass(), "previousAffectingTransactionLedgerVersion", "pirTsTzzIi");
        setField(term413343, term413343.getClass(), "account", "NqQTZhuwCm");
        setField(term413343, term413343.getClass(), "parent", "VMFTHaFgBn");
        setIntField(term413409, term413409.getClass(), "signum", 1);
        setIntElement(term413411, 0, 23838);
        setIntElement(term413411, 1, 320647294);
        setIntElement(term413411, 2, 464543781);
        setIntElement(term413411, 3, 1719655069);
        setIntElement(term413411, 4, -1701702937);
        setIntElement(term413411, 5, -2028031307);
        setField(term413409, term413409.getClass(), "mag", term413411);
        setIntField(term413409, term413409.getClass(), "bitCountPlusOne", 0);
        setIntField(term413409, term413409.getClass(), "bitLengthPlusOne", 0);
        setIntField(term413409, term413409.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term413409, term413409.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term413408, term413408.getClass(), "intVal", term413409);
        setIntField(term413408, term413408.getClass(), "scale", 53);
        setIntField(term413408, term413408.getClass(), "precision", 0);
        setField(term413408, term413408.getClass(), "stringCache", null);
        setLongField(term413408, term413408.getClass(), "intCompact", -9223372036854775808L);
        setField(term413343, term413343.getClass(), "initial_balance", term413408);
        setLongField(term413425, term413425.getClass(), "fastTime", 1522153865235L);
        setField(term413425, term413425.getClass(), "cdate", null);
        setField(term413343, term413343.getClass(), "inception", term413425);
        setField(term413343, term413343.getClass(), "ledger_index", term413427);
        setField(term413429, term413429.getClass(), "issuer", "VIMBdFewRg");
        setField(term413429, term413429.getClass(), "kyc", term413442);
        setField(term413343, term413343.getClass(), "accountName", term413429);
        setField(term413444, term413444.getClass(), "issuer", "EIeXfBvljb");
        setField(term413444, term413444.getClass(), "kyc", term413457);
        setField(term413343, term413343.getClass(), "parentName", term413444);
        setField(term413343, term413343.getClass(), "kycApproved", term413459);
        term413461 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term413462 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term413464 = (int[]) newIntArray(6);
        setIntField(term413462, term413462.getClass(), "signum", 1);
        setIntElement(term413464, 0, 68);
        setIntElement(term413464, 1, -367242385);
        setIntElement(term413464, 2, -1642067286);
        setIntElement(term413464, 3, 1852776952);
        setIntElement(term413464, 4, 2112059810);
        setIntElement(term413464, 5, 2126656289);
        setField(term413462, term413462.getClass(), "mag", term413464);
        setIntField(term413462, term413462.getClass(), "bitCountPlusOne", 0);
        setIntField(term413462, term413462.getClass(), "bitLengthPlusOne", 0);
        setIntField(term413462, term413462.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term413462, term413462.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term413461, term413461.getClass(), "intVal", term413462);
        setIntField(term413461, term413461.getClass(), "scale", 52);
        setIntField(term413461, term413461.getClass(), "precision", 0);
        setField(term413461, term413461.getClass(), "stringCache", null);
        setLongField(term413461, term413461.getClass(), "intCompact", -9223372036854775808L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = term413461;
        callMethod(klass, "setInitial_balance", argTypes, term413343, args);
    }

};


