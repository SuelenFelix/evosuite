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

public class XrpScanAccountResponse_setAccountName_117638330931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term413952;
     Object term414069;

    public XrpScanAccountResponse_setAccountName_117638330931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term413953 = new Long(-2480054455719869328L);
        Integer term413967 = new Integer(-1899301124);
        Long term414035 = new Long(8637380632328451251L);
        Boolean term414050 = new Boolean(false);
        Boolean term414065 = new Boolean(false);
        Boolean term414067 = new Boolean(false);
        term413952 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse"));
        Object term414017 = newInstance(Class.forName("java.math.BigDecimal"));
        Object term414018 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term414020 = (int[]) newIntArray(5);
        Object term414033 = newInstance(Class.forName("java.util.Date"));
        Object term414037 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        Object term414052 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term413952, term413952.getClass(), "sequence", term413953);
        setField(term413952, term413952.getClass(), "xrpBalance", "CZFEFCSdMd");
        setField(term413952, term413952.getClass(), "ownerCount", term413967);
        setField(term413952, term413952.getClass(), "previousAffectingTransactionID", "NEpKgrSAsV");
        setField(term413952, term413952.getClass(), "previousAffectingTransactionLedgerVersion", "gCyzKQjTct");
        setField(term413952, term413952.getClass(), "account", "qPcFkMcIXf");
        setField(term413952, term413952.getClass(), "parent", "imwtCakEGR");
        setIntField(term414018, term414018.getClass(), "signum", 1);
        setIntElement(term414020, 0, -804295071);
        setIntElement(term414020, 1, 513798167);
        setIntElement(term414020, 2, 1200499195);
        setIntElement(term414020, 3, 895426301);
        setIntElement(term414020, 4, 1268220697);
        setField(term414018, term414018.getClass(), "mag", term414020);
        setIntField(term414018, term414018.getClass(), "bitCountPlusOne", 0);
        setIntField(term414018, term414018.getClass(), "bitLengthPlusOne", 0);
        setIntField(term414018, term414018.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term414018, term414018.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term414017, term414017.getClass(), "intVal", term414018);
        setIntField(term414017, term414017.getClass(), "scale", 49);
        setIntField(term414017, term414017.getClass(), "precision", 0);
        setField(term414017, term414017.getClass(), "stringCache", null);
        setLongField(term414017, term414017.getClass(), "intCompact", -9223372036854775808L);
        setField(term413952, term413952.getClass(), "initial_balance", term414017);
        setLongField(term414033, term414033.getClass(), "fastTime", 1364444521279L);
        setField(term414033, term414033.getClass(), "cdate", null);
        setField(term413952, term413952.getClass(), "inception", term414033);
        setField(term413952, term413952.getClass(), "ledger_index", term414035);
        setField(term414037, term414037.getClass(), "issuer", "SpMIbdwXeR");
        setField(term414037, term414037.getClass(), "kyc", term414050);
        setField(term413952, term413952.getClass(), "accountName", term414037);
        setField(term414052, term414052.getClass(), "issuer", "VGwFbZhSGn");
        setField(term414052, term414052.getClass(), "kyc", term414065);
        setField(term413952, term413952.getClass(), "parentName", term414052);
        setField(term413952, term413952.getClass(), "kycApproved", term414067);
        Boolean term414082 = new Boolean(false);
        term414069 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName"));
        setField(term414069, term414069.getClass(), "issuer", "pqWomZXItf");
        setField(term414069, term414069.getClass(), "kyc", term414082);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName");
        Object[] args = new Object[1];
        args[0] = term414069;
        callMethod(klass, "setAccountName", argTypes, term413952, args);
    }

};


