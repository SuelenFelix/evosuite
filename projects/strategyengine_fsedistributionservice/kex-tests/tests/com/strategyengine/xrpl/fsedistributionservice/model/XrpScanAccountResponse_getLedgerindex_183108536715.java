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

public class XrpScanAccountResponse_getLedgerindex_183108536715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term410902;

    public XrpScanAccountResponse_getLedgerindex_183108536715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term410903 = new Long(-8667643757273196191L);
        Integer term410917 = new Integer(-1731761810);
        Long term410986 = new Long(8259341710509598103L);
        Boolean term411001 = new Boolean(false);
        Boolean term411016 = new Boolean(false);
        Boolean term411018 = new Boolean(true);
        term410902 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse"));
        Object term410967 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term410968 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term410970 = (int[]) newIntArray(6);
        Object term410984 = newInstance(Class.forName("java.util.Date"));
        Object term410988 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term411003 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term410902, term410902.getClass(), "sequence", term410903);
        setField(term410902, term410902.getClass(), "xrpBalance", "LsOyXKZzBQ");
        setField(term410902, term410902.getClass(), "ownerCount", term410917);
        setField(term410902, term410902.getClass(), "previousAffectingTransactionID", "URFrizTrec");
        setField(term410902, term410902.getClass(), "previousAffectingTransactionLedgerVersion", "OSsMvEletA");
        setField(term410902, term410902.getClass(), "account", "DNfJBqzjmu");
        setField(term410902, term410902.getClass(), "parent", "GYBeZGePbX");
        setIntField(term410968, term410968.getClass(), "signum", 1);
        setIntElement(term410970, 0, 15578);
        setIntElement(term410970, 1, 1055910736);
        setIntElement(term410970, 2, 1083715068);
        setIntElement(term410970, 3, -1303589783);
        setIntElement(term410970, 4, -1607432552);
        setIntElement(term410970, 5, 1945887801);
        setField(term410968, term410968.getClass(), "mag", term410970);
        setIntField(term410968, term410968.getClass(), "bitCountPlusOne", 0);
        setIntField(term410968, term410968.getClass(), "bitLengthPlusOne", 0);
        setIntField(term410968, term410968.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term410968, term410968.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term410967, term410967.getClass(), "intVal", term410968);
        setIntField(term410967, term410967.getClass(), "scale", 53);
        setIntField(term410967, term410967.getClass(), "precision", 0);
        setField(term410967, term410967.getClass(), "stringCache", null);
        setLongField(term410967, term410967.getClass(), "intCompact", -9223372036854775808L);
        setField(term410902, term410902.getClass(), "initial_balance", term410967);
        setLongField(term410984, term410984.getClass(), "fastTime", 1614670484145L);
        setField(term410984, term410984.getClass(), "cdate", null);
        setField(term410902, term410902.getClass(), "inception", term410984);
        setField(term410902, term410902.getClass(), "ledger_index", term410986);
        setField(term410988, term410988.getClass(), "issuer", "jJUEqbPIrM");
        setField(term410988, term410988.getClass(), "kyc", term411001);
        setField(term410902, term410902.getClass(), "accountName", term410988);
        setField(term411003, term411003.getClass(), "issuer", "fUWVNlHjyG");
        setField(term411003, term411003.getClass(), "kyc", term411016);
        setField(term410902, term410902.getClass(), "parentName", term411003);
        setField(term410902, term410902.getClass(), "kycApproved", term411018);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLedger_index", argTypes, term410902, args);
    }

};


