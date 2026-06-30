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

public class XrpScanAccountResponse_setInception_197197060029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term413560;
     Object term413678;

    public XrpScanAccountResponse_setInception_197197060029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term413561 = new Long(8324238777146638579L);
        Integer term413575 = new Integer(584893196);
        Long term413644 = new Long(8580739755779561159L);
        Boolean term413659 = new Boolean(true);
        Boolean term413674 = new Boolean(true);
        Boolean term413676 = new Boolean(false);
        term413560 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse"));
        Object term413625 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term413626 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term413628 = (int[]) newIntArray(6);
        Object term413642 = newInstance(Class.forName("java.util.Date"));
        Object term413646 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term413661 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term413560, term413560.getClass(), "sequence", term413561);
        setField(term413560, term413560.getClass(), "xrpBalance", "FsYaveBhOG");
        setField(term413560, term413560.getClass(), "ownerCount", term413575);
        setField(term413560, term413560.getClass(), "previousAffectingTransactionID", "yrxLVWpMhI");
        setField(term413560, term413560.getClass(), "previousAffectingTransactionLedgerVersion", "IaEEQvEjDH");
        setField(term413560, term413560.getClass(), "account", "piFghHpxcc");
        setField(term413560, term413560.getClass(), "parent", "NAzbuyNIpr");
        setIntField(term413626, term413626.getClass(), "signum", 1);
        setIntElement(term413628, 0, 39866);
        setIntElement(term413628, 1, -1989847847);
        setIntElement(term413628, 2, 1104108541);
        setIntElement(term413628, 3, 123287253);
        setIntElement(term413628, 4, -1687970232);
        setIntElement(term413628, 5, -969823949);
        setField(term413626, term413626.getClass(), "mag", term413628);
        setIntField(term413626, term413626.getClass(), "bitCountPlusOne", 0);
        setIntField(term413626, term413626.getClass(), "bitLengthPlusOne", 0);
        setIntField(term413626, term413626.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term413626, term413626.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term413625, term413625.getClass(), "intVal", term413626);
        setIntField(term413625, term413625.getClass(), "scale", 53);
        setIntField(term413625, term413625.getClass(), "precision", 0);
        setField(term413625, term413625.getClass(), "stringCache", null);
        setLongField(term413625, term413625.getClass(), "intCompact", -9223372036854775808L);
        setField(term413560, term413560.getClass(), "initial_balance", term413625);
        setLongField(term413642, term413642.getClass(), "fastTime", 1740339952634L);
        setField(term413642, term413642.getClass(), "cdate", null);
        setField(term413560, term413560.getClass(), "inception", term413642);
        setField(term413560, term413560.getClass(), "ledger_index", term413644);
        setField(term413646, term413646.getClass(), "issuer", "GFFaEIxUDv");
        setField(term413646, term413646.getClass(), "kyc", term413659);
        setField(term413560, term413560.getClass(), "accountName", term413646);
        setField(term413661, term413661.getClass(), "issuer", "lQQhZwiByu");
        setField(term413661, term413661.getClass(), "kyc", term413674);
        setField(term413560, term413560.getClass(), "parentName", term413661);
        setField(term413560, term413560.getClass(), "kycApproved", term413676);
        term413678 = newInstance(Class.forName("java.util.Date"));
        setLongField(term413678, term413678.getClass(), "fastTime", 1393420616018L);
        setField(term413678, term413678.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term413678;
        callMethod(klass, "setInception", argTypes, term413560, args);
    }

};


