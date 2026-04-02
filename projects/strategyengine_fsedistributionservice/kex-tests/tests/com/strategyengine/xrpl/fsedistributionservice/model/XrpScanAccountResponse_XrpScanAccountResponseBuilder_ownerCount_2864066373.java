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

public class XrpScanAccountResponse_XrpScanAccountResponseBuilder_ownerCount_2864066373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443702;
     Object term443820;

    public XrpScanAccountResponse_XrpScanAccountResponseBuilder_ownerCount_2864066373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term443703 = new Long(-2061888799893149465L);
        Integer term443717 = new Integer(-1747406163);
        Long term443786 = new Long(8562037929535808010L);
        Boolean term443801 = new Boolean(true);
        Boolean term443816 = new Boolean(false);
        Boolean term443818 = new Boolean(true);
        term443702 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder"));
        Object term443767 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term443768 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term443770 = (int[]) newIntArray(6);
        Object term443784 = newInstance(Class.forName("java.util.Date"));
        Object term443788 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term443803 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term443702, term443702.getClass(), "sequence", term443703);
        setField(term443702, term443702.getClass(), "xrpBalance", "neItQnzSgh");
        setField(term443702, term443702.getClass(), "ownerCount", term443717);
        setField(term443702, term443702.getClass(), "previousAffectingTransactionID", "nOSnYvTIMh");
        setField(term443702, term443702.getClass(), "previousAffectingTransactionLedgerVersion", "nlAaUzdWnd");
        setField(term443702, term443702.getClass(), "account", "flQJpSTTxh");
        setField(term443702, term443702.getClass(), "parent", "JyglsQuOkT");
        setIntField(term443768, term443768.getClass(), "signum", 1);
        setIntElement(term443770, 0, 53426);
        setIntElement(term443770, 1, 466906727);
        setIntElement(term443770, 2, -2035568579);
        setIntElement(term443770, 3, -1542279478);
        setIntElement(term443770, 4, -1567579027);
        setIntElement(term443770, 5, -2057091633);
        setField(term443768, term443768.getClass(), "mag", term443770);
        setIntField(term443768, term443768.getClass(), "bitCountPlusOne", 0);
        setIntField(term443768, term443768.getClass(), "bitLengthPlusOne", 0);
        setIntField(term443768, term443768.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term443768, term443768.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term443767, term443767.getClass(), "intVal", term443768);
        setIntField(term443767, term443767.getClass(), "scale", 53);
        setIntField(term443767, term443767.getClass(), "precision", 0);
        setField(term443767, term443767.getClass(), "stringCache", null);
        setLongField(term443767, term443767.getClass(), "intCompact", -9223372036854775808L);
        setField(term443702, term443702.getClass(), "initial_balance", term443767);
        setLongField(term443784, term443784.getClass(), "fastTime", 1882912852308L);
        setField(term443784, term443784.getClass(), "cdate", null);
        setField(term443702, term443702.getClass(), "inception", term443784);
        setField(term443702, term443702.getClass(), "ledger_index", term443786);
        setField(term443788, term443788.getClass(), "issuer", "zBTpnippXR");
        setField(term443788, term443788.getClass(), "kyc", term443801);
        setField(term443702, term443702.getClass(), "accountName", term443788);
        setField(term443803, term443803.getClass(), "issuer", "xGyaHdnzGM");
        setField(term443803, term443803.getClass(), "kyc", term443816);
        setField(term443702, term443702.getClass(), "parentName", term443803);
        setField(term443702, term443702.getClass(), "kycApproved", term443818);
        term443820 = new Integer(388157121);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term443820;
        callMethod(klass, "ownerCount", argTypes, term443702, args);
    }

};


