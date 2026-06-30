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

public class XrpScanAccountResponse_XrpScanAccountResponseBuilder_previousAffectingTransactionID_19002393594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443898;

    public XrpScanAccountResponse_XrpScanAccountResponseBuilder_previousAffectingTransactionID_19002393594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term443899 = new Long(3881743260573639770L);
        Integer term443913 = new Integer(1684998508);
        Long term443982 = new Long(4805317099230920805L);
        Boolean term443997 = new Boolean(false);
        Boolean term444012 = new Boolean(false);
        Boolean term444014 = new Boolean(true);
        term443898 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder"));
        Object term443963 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term443964 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term443966 = (int[]) newIntArray(6);
        Object term443980 = newInstance(Class.forName("java.util.Date"));
        Object term443984 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term443999 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term443898, term443898.getClass(), "sequence", term443899);
        setField(term443898, term443898.getClass(), "xrpBalance", "wbRekMnfmr");
        setField(term443898, term443898.getClass(), "ownerCount", term443913);
        setField(term443898, term443898.getClass(), "previousAffectingTransactionID", "hgaQCYedRy");
        setField(term443898, term443898.getClass(), "previousAffectingTransactionLedgerVersion", "OrqIIvDFfM");
        setField(term443898, term443898.getClass(), "account", "dmTuManhEg");
        setField(term443898, term443898.getClass(), "parent", "fkGbNMnCKx");
        setIntField(term443964, term443964.getClass(), "signum", 1);
        setIntElement(term443966, 0, 66865);
        setIntElement(term443966, 1, -1500235259);
        setIntElement(term443966, 2, -471039814);
        setIntElement(term443966, 3, 808322599);
        setIntElement(term443966, 4, 1947760727);
        setIntElement(term443966, 5, 1851540135);
        setField(term443964, term443964.getClass(), "mag", term443966);
        setIntField(term443964, term443964.getClass(), "bitCountPlusOne", 0);
        setIntField(term443964, term443964.getClass(), "bitLengthPlusOne", 0);
        setIntField(term443964, term443964.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term443964, term443964.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term443963, term443963.getClass(), "intVal", term443964);
        setIntField(term443963, term443963.getClass(), "scale", 53);
        setIntField(term443963, term443963.getClass(), "precision", 0);
        setField(term443963, term443963.getClass(), "stringCache", null);
        setLongField(term443963, term443963.getClass(), "intCompact", -9223372036854775808L);
        setField(term443898, term443898.getClass(), "initial_balance", term443963);
        setLongField(term443980, term443980.getClass(), "fastTime", 1677051163661L);
        setField(term443980, term443980.getClass(), "cdate", null);
        setField(term443898, term443898.getClass(), "inception", term443980);
        setField(term443898, term443898.getClass(), "ledger_index", term443982);
        setField(term443984, term443984.getClass(), "issuer", "nrJryVhnJx");
        setField(term443984, term443984.getClass(), "kyc", term443997);
        setField(term443898, term443898.getClass(), "accountName", term443984);
        setField(term443999, term443999.getClass(), "issuer", "BRFRCWtQIG");
        setField(term443999, term443999.getClass(), "kyc", term444012);
        setField(term443898, term443898.getClass(), "parentName", term443999);
        setField(term443898, term443898.getClass(), "kycApproved", term444014);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VvFHiCPutw";
        callMethod(klass, "previousAffectingTransactionID", argTypes, term443898, args);
    }

};


