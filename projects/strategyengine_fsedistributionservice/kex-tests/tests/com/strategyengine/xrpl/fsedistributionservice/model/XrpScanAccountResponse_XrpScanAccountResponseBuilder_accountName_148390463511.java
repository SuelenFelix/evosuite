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

public class XrpScanAccountResponse_XrpScanAccountResponseBuilder_accountName_148390463511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term445371;
     Object term445489;

    public XrpScanAccountResponse_XrpScanAccountResponseBuilder_accountName_148390463511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term445372 = new Long(8129782425142702673L);
        Integer term445386 = new Integer(-1122880881);
        Long term445455 = new Long(-1348078265481224468L);
        Boolean term445470 = new Boolean(true);
        Boolean term445485 = new Boolean(true);
        Boolean term445487 = new Boolean(false);
        term445371 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder"));
        Object term445436 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term445437 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term445439 = (int[]) newIntArray(6);
        Object term445453 = newInstance(Class.forName("java.util.Date"));
        Object term445457 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term445472 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term445371, term445371.getClass(), "sequence", term445372);
        setField(term445371, term445371.getClass(), "xrpBalance", "ixzZuaWsYL");
        setField(term445371, term445371.getClass(), "ownerCount", term445386);
        setField(term445371, term445371.getClass(), "previousAffectingTransactionID", "CUkbIipVrl");
        setField(term445371, term445371.getClass(), "previousAffectingTransactionLedgerVersion", "xbQLgvzCPz");
        setField(term445371, term445371.getClass(), "account", "XHGONyJIOI");
        setField(term445371, term445371.getClass(), "parent", "EgnNSamGhM");
        setIntField(term445437, term445437.getClass(), "signum", 1);
        setIntElement(term445439, 0, 57458);
        setIntElement(term445439, 1, -416320929);
        setIntElement(term445439, 2, 1400568624);
        setIntElement(term445439, 3, 1870125296);
        setIntElement(term445439, 4, -2129155927);
        setIntElement(term445439, 5, 257052291);
        setField(term445437, term445437.getClass(), "mag", term445439);
        setIntField(term445437, term445437.getClass(), "bitCountPlusOne", 0);
        setIntField(term445437, term445437.getClass(), "bitLengthPlusOne", 0);
        setIntField(term445437, term445437.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term445437, term445437.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term445436, term445436.getClass(), "intVal", term445437);
        setIntField(term445436, term445436.getClass(), "scale", 53);
        setIntField(term445436, term445436.getClass(), "precision", 0);
        setField(term445436, term445436.getClass(), "stringCache", null);
        setLongField(term445436, term445436.getClass(), "intCompact", -9223372036854775808L);
        setField(term445371, term445371.getClass(), "initial_balance", term445436);
        setLongField(term445453, term445453.getClass(), "fastTime", 1821711116476L);
        setField(term445453, term445453.getClass(), "cdate", null);
        setField(term445371, term445371.getClass(), "inception", term445453);
        setField(term445371, term445371.getClass(), "ledger_index", term445455);
        setField(term445457, term445457.getClass(), "issuer", "IjhiBHnJgI");
        setField(term445457, term445457.getClass(), "kyc", term445470);
        setField(term445371, term445371.getClass(), "accountName", term445457);
        setField(term445472, term445472.getClass(), "issuer", "QxAHzfZVve");
        setField(term445472, term445472.getClass(), "kyc", term445485);
        setField(term445371, term445371.getClass(), "parentName", term445472);
        setField(term445371, term445371.getClass(), "kycApproved", term445487);
        Boolean term445502 = new Boolean(true);
        term445489 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term445489, term445489.getClass(), "issuer", "xoqSauYvkW");
        setField(term445489, term445489.getClass(), "kyc", term445502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName");
        Object[] args = new Object[1];
        args[0] = term445489;
        callMethod(klass, "accountName", argTypes, term445371, args);
    }

};


