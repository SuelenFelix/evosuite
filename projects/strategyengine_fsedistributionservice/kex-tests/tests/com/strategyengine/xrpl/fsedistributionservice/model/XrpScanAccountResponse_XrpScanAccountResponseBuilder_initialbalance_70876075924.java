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

public class XrpScanAccountResponse_XrpScanAccountResponseBuilder_initialbalance_70876075924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term446400;

    public XrpScanAccountResponse_XrpScanAccountResponseBuilder_initialbalance_70876075924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term446400 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder"));
        setField(term446400, term446400.getClass(), "sequence", null);
        setField(term446400, term446400.getClass(), "xrpBalance", null);
        setField(term446400, term446400.getClass(), "ownerCount", null);
        setField(term446400, term446400.getClass(), "previousAffectingTransactionID", null);
        setField(term446400, term446400.getClass(), "previousAffectingTransactionLedgerVersion", null);
        setField(term446400, term446400.getClass(), "account", null);
        setField(term446400, term446400.getClass(), "parent", null);
        setField(term446400, term446400.getClass(), "initial_balance", null);
        setField(term446400, term446400.getClass(), "inception", null);
        setField(term446400, term446400.getClass(), "ledger_index", null);
        setField(term446400, term446400.getClass(), "accountName", null);
        setField(term446400, term446400.getClass(), "parentName", null);
        setField(term446400, term446400.getClass(), "kycApproved", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.math.BigDecimal");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "initial_balance", argTypes, term446400, args);
    }

};


