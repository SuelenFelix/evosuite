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

public class XrpScanAccountResponse_getKycApproved_201558268718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term411484;

    public XrpScanAccountResponse_getKycApproved_201558268718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term411485 = new Long(-706258405349500259L);
        Integer term411499 = new Integer(1557431527);
        Long term411568 = new Long(-2336486223565755398L);
        Boolean term411583 = new Boolean(true);
        Boolean term411598 = new Boolean(false);
        Boolean term411600 = new Boolean(false);
        term411484 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse"));
        Object term411549 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term411550 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term411552 = (int[]) newIntArray(6);
        Object term411566 = newInstance(Class.forName("java.util.Date"));
        Object term411570 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term411585 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term411484, term411484.getClass(), "sequence", term411485);
        setField(term411484, term411484.getClass(), "xrpBalance", "lFrVzxKduB");
        setField(term411484, term411484.getClass(), "ownerCount", term411499);
        setField(term411484, term411484.getClass(), "previousAffectingTransactionID", "igjtFtTsrI");
        setField(term411484, term411484.getClass(), "previousAffectingTransactionLedgerVersion", "EKttUdwvzA");
        setField(term411484, term411484.getClass(), "account", "eyieSuzrqP");
        setField(term411484, term411484.getClass(), "parent", "lZSGWSjmgy");
        setIntField(term411550, term411550.getClass(), "signum", 1);
        setIntElement(term411552, 0, 61428);
        setIntElement(term411552, 1, 1420896995);
        setIntElement(term411552, 2, 1972268289);
        setIntElement(term411552, 3, 1790684229);
        setIntElement(term411552, 4, 954447365);
        setIntElement(term411552, 5, 1337470719);
        setField(term411550, term411550.getClass(), "mag", term411552);
        setIntField(term411550, term411550.getClass(), "bitCountPlusOne", 0);
        setIntField(term411550, term411550.getClass(), "bitLengthPlusOne", 0);
        setIntField(term411550, term411550.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term411550, term411550.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term411549, term411549.getClass(), "intVal", term411550);
        setIntField(term411549, term411549.getClass(), "scale", 53);
        setIntField(term411549, term411549.getClass(), "precision", 0);
        setField(term411549, term411549.getClass(), "stringCache", null);
        setLongField(term411549, term411549.getClass(), "intCompact", -9223372036854775808L);
        setField(term411484, term411484.getClass(), "initial_balance", term411549);
        setLongField(term411566, term411566.getClass(), "fastTime", 1739234305822L);
        setField(term411566, term411566.getClass(), "cdate", null);
        setField(term411484, term411484.getClass(), "inception", term411566);
        setField(term411484, term411484.getClass(), "ledger_index", term411568);
        setField(term411570, term411570.getClass(), "issuer", "yPdZsUxCbI");
        setField(term411570, term411570.getClass(), "kyc", term411583);
        setField(term411484, term411484.getClass(), "accountName", term411570);
        setField(term411585, term411585.getClass(), "issuer", "SLfoYQqUXQ");
        setField(term411585, term411585.getClass(), "kyc", term411598);
        setField(term411484, term411484.getClass(), "parentName", term411585);
        setField(term411484, term411484.getClass(), "kycApproved", term411600);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getKycApproved", argTypes, term411484, args);
    }

};


