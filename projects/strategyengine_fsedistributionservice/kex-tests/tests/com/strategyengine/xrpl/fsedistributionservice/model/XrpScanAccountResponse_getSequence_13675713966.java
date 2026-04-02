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

public class XrpScanAccountResponse_getSequence_13675713966 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409156;

    public XrpScanAccountResponse_getSequence_13675713966() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term409157 = new Long(-9187816361133186528L);
        Integer term409171 = new Integer(-2014576105);
        Long term409240 = new Long(7069791900685590489L);
        Boolean term409255 = new Boolean(false);
        Boolean term409270 = new Boolean(false);
        Boolean term409272 = new Boolean(true);
        term409156 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse"));
        Object term409221 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term409222 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term409224 = (int[]) newIntArray(6);
        Object term409238 = newInstance(Class.forName("java.util.Date"));
        Object term409242 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term409257 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term409156, term409156.getClass(), "sequence", term409157);
        setField(term409156, term409156.getClass(), "xrpBalance", "BziKWtuBNj");
        setField(term409156, term409156.getClass(), "ownerCount", term409171);
        setField(term409156, term409156.getClass(), "previousAffectingTransactionID", "dyXofAqUFr");
        setField(term409156, term409156.getClass(), "previousAffectingTransactionLedgerVersion", "XuAtvPKXnf");
        setField(term409156, term409156.getClass(), "account", "agKQyzBuct");
        setField(term409156, term409156.getClass(), "parent", "wHvZwYZIxZ");
        setIntField(term409222, term409222.getClass(), "signum", 1);
        setIntElement(term409224, 0, 66816);
        setIntElement(term409224, 1, -1982555641);
        setIntElement(term409224, 2, 573241231);
        setIntElement(term409224, 3, -1445329822);
        setIntElement(term409224, 4, -333268556);
        setIntElement(term409224, 5, 1642436639);
        setField(term409222, term409222.getClass(), "mag", term409224);
        setIntField(term409222, term409222.getClass(), "bitCountPlusOne", 0);
        setIntField(term409222, term409222.getClass(), "bitLengthPlusOne", 0);
        setIntField(term409222, term409222.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term409222, term409222.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term409221, term409221.getClass(), "intVal", term409222);
        setIntField(term409221, term409221.getClass(), "scale", 53);
        setIntField(term409221, term409221.getClass(), "precision", 0);
        setField(term409221, term409221.getClass(), "stringCache", null);
        setLongField(term409221, term409221.getClass(), "intCompact", -9223372036854775808L);
        setField(term409156, term409156.getClass(), "initial_balance", term409221);
        setLongField(term409238, term409238.getClass(), "fastTime", 1443855067184L);
        setField(term409238, term409238.getClass(), "cdate", null);
        setField(term409156, term409156.getClass(), "inception", term409238);
        setField(term409156, term409156.getClass(), "ledger_index", term409240);
        setField(term409242, term409242.getClass(), "issuer", "OlJfDZmXUZ");
        setField(term409242, term409242.getClass(), "kyc", term409255);
        setField(term409156, term409156.getClass(), "accountName", term409242);
        setField(term409257, term409257.getClass(), "issuer", "JIXkAuXhDx");
        setField(term409257, term409257.getClass(), "kyc", term409270);
        setField(term409156, term409156.getClass(), "parentName", term409257);
        setField(term409156, term409156.getClass(), "kycApproved", term409272);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSequence", argTypes, term409156, args);
    }

};


