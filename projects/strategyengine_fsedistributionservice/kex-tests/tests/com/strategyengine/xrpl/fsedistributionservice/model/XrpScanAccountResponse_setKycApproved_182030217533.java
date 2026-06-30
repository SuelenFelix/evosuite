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

public class XrpScanAccountResponse_setKycApproved_182030217533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term414388;
     Object term414506;

    public XrpScanAccountResponse_setKycApproved_182030217533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term414389 = new Long(-5515080039914707735L);
        Integer term414403 = new Integer(-1410220680);
        Long term414472 = new Long(-6249289368466698064L);
        Boolean term414487 = new Boolean(true);
        Boolean term414502 = new Boolean(false);
        Boolean term414504 = new Boolean(false);
        term414388 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse"));
        Object term414453 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term414454 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term414456 = (int[]) newIntArray(6);
        Object term414470 = newInstance(Class.forName("java.util.Date"));
        Object term414474 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term414489 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term414388, term414388.getClass(), "sequence", term414389);
        setField(term414388, term414388.getClass(), "xrpBalance", "twYgiufVKW");
        setField(term414388, term414388.getClass(), "ownerCount", term414403);
        setField(term414388, term414388.getClass(), "previousAffectingTransactionID", "GUllDkCfSj");
        setField(term414388, term414388.getClass(), "previousAffectingTransactionLedgerVersion", "mqvlpDaexC");
        setField(term414388, term414388.getClass(), "account", "mhBCscYMix");
        setField(term414388, term414388.getClass(), "parent", "fRCOtyFEqt");
        setIntField(term414454, term414454.getClass(), "signum", 1);
        setIntElement(term414456, 0, 11982);
        setIntElement(term414456, 1, 2098565271);
        setIntElement(term414456, 2, 177393090);
        setIntElement(term414456, 3, -211597677);
        setIntElement(term414456, 4, -1063809192);
        setIntElement(term414456, 5, -2097471507);
        setField(term414454, term414454.getClass(), "mag", term414456);
        setIntField(term414454, term414454.getClass(), "bitCountPlusOne", 0);
        setIntField(term414454, term414454.getClass(), "bitLengthPlusOne", 0);
        setIntField(term414454, term414454.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term414454, term414454.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term414453, term414453.getClass(), "intVal", term414454);
        setIntField(term414453, term414453.getClass(), "scale", 53);
        setIntField(term414453, term414453.getClass(), "precision", 0);
        setField(term414453, term414453.getClass(), "stringCache", null);
        setLongField(term414453, term414453.getClass(), "intCompact", -9223372036854775808L);
        setField(term414388, term414388.getClass(), "initial_balance", term414453);
        setLongField(term414470, term414470.getClass(), "fastTime", 1851126157028L);
        setField(term414470, term414470.getClass(), "cdate", null);
        setField(term414388, term414388.getClass(), "inception", term414470);
        setField(term414388, term414388.getClass(), "ledger_index", term414472);
        setField(term414474, term414474.getClass(), "issuer", "bhCOQHIHSX");
        setField(term414474, term414474.getClass(), "kyc", term414487);
        setField(term414388, term414388.getClass(), "accountName", term414474);
        setField(term414489, term414489.getClass(), "issuer", "zelYaUHqcj");
        setField(term414489, term414489.getClass(), "kyc", term414502);
        setField(term414388, term414388.getClass(), "parentName", term414489);
        setField(term414388, term414388.getClass(), "kycApproved", term414504);
        term414506 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term414506;
        callMethod(klass, "setKycApproved", argTypes, term414388, args);
    }

};


