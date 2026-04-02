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

public class XrpScanAccountResponse_toString_14166863945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term408962;

    public XrpScanAccountResponse_toString_14166863945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term408963 = new Long(8229243567352210338L);
        Integer term408977 = new Integer(-1002370457);
        Long term409046 = new Long(1651638210050263261L);
        Boolean term409061 = new Boolean(true);
        Boolean term409076 = new Boolean(false);
        Boolean term409078 = new Boolean(true);
        term408962 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse"));
        Object term409027 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term409028 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term409030 = (int[]) newIntArray(6);
        Object term409044 = newInstance(Class.forName("java.util.Date"));
        Object term409048 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term409063 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term408962, term408962.getClass(), "sequence", term408963);
        setField(term408962, term408962.getClass(), "xrpBalance", "qSGaBJnYnR");
        setField(term408962, term408962.getClass(), "ownerCount", term408977);
        setField(term408962, term408962.getClass(), "previousAffectingTransactionID", "MGKWTJIasi");
        setField(term408962, term408962.getClass(), "previousAffectingTransactionLedgerVersion", "upaMEMxlUB");
        setField(term408962, term408962.getClass(), "account", "TmmVfmoOsH");
        setField(term408962, term408962.getClass(), "parent", "qOmhPxsZYb");
        setIntField(term409028, term409028.getClass(), "signum", 1);
        setIntElement(term409030, 0, 37534);
        setIntElement(term409030, 1, -1656423572);
        setIntElement(term409030, 2, 140069446);
        setIntElement(term409030, 3, -1426047069);
        setIntElement(term409030, 4, -1661585320);
        setIntElement(term409030, 5, -1986105083);
        setField(term409028, term409028.getClass(), "mag", term409030);
        setIntField(term409028, term409028.getClass(), "bitCountPlusOne", 0);
        setIntField(term409028, term409028.getClass(), "bitLengthPlusOne", 0);
        setIntField(term409028, term409028.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term409028, term409028.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term409027, term409027.getClass(), "intVal", term409028);
        setIntField(term409027, term409027.getClass(), "scale", 53);
        setIntField(term409027, term409027.getClass(), "precision", 0);
        setField(term409027, term409027.getClass(), "stringCache", null);
        setLongField(term409027, term409027.getClass(), "intCompact", -9223372036854775808L);
        setField(term408962, term408962.getClass(), "initial_balance", term409027);
        setLongField(term409044, term409044.getClass(), "fastTime", 1657276425811L);
        setField(term409044, term409044.getClass(), "cdate", null);
        setField(term408962, term408962.getClass(), "inception", term409044);
        setField(term408962, term408962.getClass(), "ledger_index", term409046);
        setField(term409048, term409048.getClass(), "issuer", "WWpJZrtqJz");
        setField(term409048, term409048.getClass(), "kyc", term409061);
        setField(term408962, term408962.getClass(), "accountName", term409048);
        setField(term409063, term409063.getClass(), "issuer", "hEgzudKuuP");
        setField(term409063, term409063.getClass(), "kyc", term409076);
        setField(term408962, term408962.getClass(), "parentName", term409063);
        setField(term408962, term408962.getClass(), "kycApproved", term409078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term408962, args);
    }

};


