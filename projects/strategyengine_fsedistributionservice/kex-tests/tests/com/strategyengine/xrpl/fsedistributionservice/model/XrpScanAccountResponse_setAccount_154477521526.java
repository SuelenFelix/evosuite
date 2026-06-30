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

public class XrpScanAccountResponse_setAccount_154477521526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term412911;

    public XrpScanAccountResponse_setAccount_154477521526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term412912 = new Long(1145539328952774873L);
        Integer term412926 = new Integer(729658803);
        Long term412995 = new Long(-4593197356529163455L);
        Boolean term413010 = new Boolean(false);
        Boolean term413025 = new Boolean(true);
        Boolean term413027 = new Boolean(true);
        term412911 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse"));
        Object term412976 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term412977 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term412979 = (int[]) newIntArray(6);
        Object term412993 = newInstance(Class.forName("java.util.Date"));
        Object term412997 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term413012 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term412911, term412911.getClass(), "sequence", term412912);
        setField(term412911, term412911.getClass(), "xrpBalance", "WgbseiBPrC");
        setField(term412911, term412911.getClass(), "ownerCount", term412926);
        setField(term412911, term412911.getClass(), "previousAffectingTransactionID", "wkAwDQlAAy");
        setField(term412911, term412911.getClass(), "previousAffectingTransactionLedgerVersion", "IySCafOscV");
        setField(term412911, term412911.getClass(), "account", "HAoImTYIbE");
        setField(term412911, term412911.getClass(), "parent", "qXdrzsJrNt");
        setIntField(term412977, term412977.getClass(), "signum", 1);
        setIntElement(term412979, 0, 12199);
        setIntElement(term412979, 1, 1551565472);
        setIntElement(term412979, 2, -711878314);
        setIntElement(term412979, 3, -376344717);
        setIntElement(term412979, 4, 433924954);
        setIntElement(term412979, 5, -17240627);
        setField(term412977, term412977.getClass(), "mag", term412979);
        setIntField(term412977, term412977.getClass(), "bitCountPlusOne", 0);
        setIntField(term412977, term412977.getClass(), "bitLengthPlusOne", 0);
        setIntField(term412977, term412977.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term412977, term412977.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term412976, term412976.getClass(), "intVal", term412977);
        setIntField(term412976, term412976.getClass(), "scale", 53);
        setIntField(term412976, term412976.getClass(), "precision", 0);
        setField(term412976, term412976.getClass(), "stringCache", null);
        setLongField(term412976, term412976.getClass(), "intCompact", -9223372036854775808L);
        setField(term412911, term412911.getClass(), "initial_balance", term412976);
        setLongField(term412993, term412993.getClass(), "fastTime", 1650977317061L);
        setField(term412993, term412993.getClass(), "cdate", null);
        setField(term412911, term412911.getClass(), "inception", term412993);
        setField(term412911, term412911.getClass(), "ledger_index", term412995);
        setField(term412997, term412997.getClass(), "issuer", "GfNuZYjqJr");
        setField(term412997, term412997.getClass(), "kyc", term413010);
        setField(term412911, term412911.getClass(), "accountName", term412997);
        setField(term413012, term413012.getClass(), "issuer", "PnRdYQjTym");
        setField(term413012, term413012.getClass(), "kyc", term413025);
        setField(term412911, term412911.getClass(), "parentName", term413012);
        setField(term412911, term412911.getClass(), "kycApproved", term413027);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tLANbCdEgG";
        callMethod(klass, "setAccount", argTypes, term412911, args);
    }

};


