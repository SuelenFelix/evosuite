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

public class XrpScanAccountResponse_XrpScanAccountResponseBuilder_previousAffectingTransactionID_190023935920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term446396;

    public XrpScanAccountResponse_XrpScanAccountResponseBuilder_previousAffectingTransactionID_190023935920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term446396 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder"));
        setField(term446396, term446396.getClass(), "sequence", null);
        setField(term446396, term446396.getClass(), "xrpBalance", null);
        setField(term446396, term446396.getClass(), "ownerCount", null);
        setField(term446396, term446396.getClass(), "previousAffectingTransactionID", null);
        setField(term446396, term446396.getClass(), "previousAffectingTransactionLedgerVersion", null);
        setField(term446396, term446396.getClass(), "account", null);
        setField(term446396, term446396.getClass(), "parent", null);
        setField(term446396, term446396.getClass(), "initial_balance", null);
        setField(term446396, term446396.getClass(), "inception", null);
        setField(term446396, term446396.getClass(), "ledger_index", null);
        setField(term446396, term446396.getClass(), "accountName", null);
        setField(term446396, term446396.getClass(), "parentName", null);
        setField(term446396, term446396.getClass(), "kycApproved", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "previousAffectingTransactionID", argTypes, term446396, args);
    }

};


