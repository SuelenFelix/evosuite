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

public class XrpScanAccountResponse_XrpScanAccountResponseBuilder_sequence_5795697741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443290;
     Object term443408;

    public XrpScanAccountResponse_XrpScanAccountResponseBuilder_sequence_5795697741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term443291 = new Long(-6776970214701629330L);
        Integer term443305 = new Integer(-75206835);
        Long term443374 = new Long(6187687406539061577L);
        Boolean term443389 = new Boolean(false);
        Boolean term443404 = new Boolean(true);
        Boolean term443406 = new Boolean(false);
        term443290 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder"));
        Object term443355 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term443356 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term443358 = (int[]) newIntArray(6);
        Object term443372 = newInstance(Class.forName("java.util.Date"));
        Object term443376 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term443391 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term443290, term443290.getClass(), "sequence", term443291);
        setField(term443290, term443290.getClass(), "xrpBalance", "FrWWpuUBJY");
        setField(term443290, term443290.getClass(), "ownerCount", term443305);
        setField(term443290, term443290.getClass(), "previousAffectingTransactionID", "CHVvZioDMH");
        setField(term443290, term443290.getClass(), "previousAffectingTransactionLedgerVersion", "qsUACKTmDD");
        setField(term443290, term443290.getClass(), "account", "EmkqGYkPzv");
        setField(term443290, term443290.getClass(), "parent", "owHMQAOCOb");
        setIntField(term443356, term443356.getClass(), "signum", 1);
        setIntElement(term443358, 0, 6417);
        setIntElement(term443358, 1, -2065043746);
        setIntElement(term443358, 2, -1698425676);
        setIntElement(term443358, 3, -983199196);
        setIntElement(term443358, 4, -234632593);
        setIntElement(term443358, 5, -1567024471);
        setField(term443356, term443356.getClass(), "mag", term443358);
        setIntField(term443356, term443356.getClass(), "bitCountPlusOne", 0);
        setIntField(term443356, term443356.getClass(), "bitLengthPlusOne", 0);
        setIntField(term443356, term443356.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term443356, term443356.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term443355, term443355.getClass(), "intVal", term443356);
        setIntField(term443355, term443355.getClass(), "scale", 52);
        setIntField(term443355, term443355.getClass(), "precision", 0);
        setField(term443355, term443355.getClass(), "stringCache", null);
        setLongField(term443355, term443355.getClass(), "intCompact", -9223372036854775808L);
        setField(term443290, term443290.getClass(), "initial_balance", term443355);
        setLongField(term443372, term443372.getClass(), "fastTime", 1754236004898L);
        setField(term443372, term443372.getClass(), "cdate", null);
        setField(term443290, term443290.getClass(), "inception", term443372);
        setField(term443290, term443290.getClass(), "ledger_index", term443374);
        setField(term443376, term443376.getClass(), "issuer", "mwPpmhmgxe");
        setField(term443376, term443376.getClass(), "kyc", term443389);
        setField(term443290, term443290.getClass(), "accountName", term443376);
        setField(term443391, term443391.getClass(), "issuer", "AkTBlKrxZl");
        setField(term443391, term443391.getClass(), "kyc", term443404);
        setField(term443290, term443290.getClass(), "parentName", term443391);
        setField(term443290, term443290.getClass(), "kycApproved", term443406);
        term443408 = new Long(-4281700567835283963L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term443408;
        callMethod(klass, "sequence", argTypes, term443290, args);
    }

};


