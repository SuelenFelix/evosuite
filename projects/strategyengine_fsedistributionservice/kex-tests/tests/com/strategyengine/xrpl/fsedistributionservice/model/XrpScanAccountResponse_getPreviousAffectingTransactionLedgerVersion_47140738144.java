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

public class XrpScanAccountResponse_getPreviousAffectingTransactionLedgerVersion_47140738144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term414594;

    public XrpScanAccountResponse_getPreviousAffectingTransactionLedgerVersion_47140738144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term414594 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse"));
        setField(term414594, term414594.getClass(), "sequence", null);
        setField(term414594, term414594.getClass(), "xrpBalance", null);
        setField(term414594, term414594.getClass(), "ownerCount", null);
        setField(term414594, term414594.getClass(), "previousAffectingTransactionID", null);
        setField(term414594, term414594.getClass(), "previousAffectingTransactionLedgerVersion", null);
        setField(term414594, term414594.getClass(), "account", null);
        setField(term414594, term414594.getClass(), "parent", null);
        setField(term414594, term414594.getClass(), "initial_balance", null);
        setField(term414594, term414594.getClass(), "inception", null);
        setField(term414594, term414594.getClass(), "ledger_index", null);
        setField(term414594, term414594.getClass(), "accountName", null);
        setField(term414594, term414594.getClass(), "parentName", null);
        setField(term414594, term414594.getClass(), "kycApproved", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPreviousAffectingTransactionLedgerVersion", argTypes, term414594, args);
    }

};


