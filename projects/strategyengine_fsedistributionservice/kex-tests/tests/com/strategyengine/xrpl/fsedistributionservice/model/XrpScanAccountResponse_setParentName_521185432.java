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

public class XrpScanAccountResponse_setParentName_521185432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term414169;
     Object term414287;

    public XrpScanAccountResponse_setParentName_521185432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term414170 = new Long(-9204025169674713263L);
        Integer term414184 = new Integer(-1882480155);
        Long term414253 = new Long(8289082707825797292L);
        Boolean term414268 = new Boolean(true);
        Boolean term414283 = new Boolean(false);
        Boolean term414285 = new Boolean(false);
        term414169 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse"));
        Object term414234 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term414235 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term414237 = (int[]) newIntArray(6);
        Object term414251 = newInstance(Class.forName("java.util.Date"));
        Object term414255 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term414270 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term414169, term414169.getClass(), "sequence", term414170);
        setField(term414169, term414169.getClass(), "xrpBalance", "kOsVpdMzeB");
        setField(term414169, term414169.getClass(), "ownerCount", term414184);
        setField(term414169, term414169.getClass(), "previousAffectingTransactionID", "srfSuLOGZR");
        setField(term414169, term414169.getClass(), "previousAffectingTransactionLedgerVersion", "bfRIfrPHso");
        setField(term414169, term414169.getClass(), "account", "JSZguhHdfJ");
        setField(term414169, term414169.getClass(), "parent", "IrnebOMTZj");
        setIntField(term414235, term414235.getClass(), "signum", 1);
        setIntElement(term414237, 0, 319);
        setIntElement(term414237, 1, 91380977);
        setIntElement(term414237, 2, 2014007418);
        setIntElement(term414237, 3, -673908853);
        setIntElement(term414237, 4, 450287536);
        setIntElement(term414237, 5, -1862611269);
        setField(term414235, term414235.getClass(), "mag", term414237);
        setIntField(term414235, term414235.getClass(), "bitCountPlusOne", 0);
        setIntField(term414235, term414235.getClass(), "bitLengthPlusOne", 0);
        setIntField(term414235, term414235.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term414235, term414235.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term414234, term414234.getClass(), "intVal", term414235);
        setIntField(term414234, term414234.getClass(), "scale", 52);
        setIntField(term414234, term414234.getClass(), "precision", 0);
        setField(term414234, term414234.getClass(), "stringCache", null);
        setLongField(term414234, term414234.getClass(), "intCompact", -9223372036854775808L);
        setField(term414169, term414169.getClass(), "initial_balance", term414234);
        setLongField(term414251, term414251.getClass(), "fastTime", 1518774459652L);
        setField(term414251, term414251.getClass(), "cdate", null);
        setField(term414169, term414169.getClass(), "inception", term414251);
        setField(term414169, term414169.getClass(), "ledger_index", term414253);
        setField(term414255, term414255.getClass(), "issuer", "fOfUFbGEpo");
        setField(term414255, term414255.getClass(), "kyc", term414268);
        setField(term414169, term414169.getClass(), "accountName", term414255);
        setField(term414270, term414270.getClass(), "issuer", "EKjLEMismY");
        setField(term414270, term414270.getClass(), "kyc", term414283);
        setField(term414169, term414169.getClass(), "parentName", term414270);
        setField(term414169, term414169.getClass(), "kycApproved", term414285);
        Boolean term414300 = new Boolean(true);
        term414287 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term414287, term414287.getClass(), "issuer", "izJjfCpyvk");
        setField(term414287, term414287.getClass(), "kyc", term414300);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName");
        Object[] args = new Object[1];
        args[0] = term414287;
        callMethod(klass, "setParentName", argTypes, term414169, args);
    }

};


