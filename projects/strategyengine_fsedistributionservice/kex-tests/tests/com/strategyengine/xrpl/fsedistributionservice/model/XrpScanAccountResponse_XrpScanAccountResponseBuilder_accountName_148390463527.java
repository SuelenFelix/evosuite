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

public class XrpScanAccountResponse_XrpScanAccountResponseBuilder_accountName_148390463527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term446403;

    public XrpScanAccountResponse_XrpScanAccountResponseBuilder_accountName_148390463527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term446403 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder"));
        setField(term446403, term446403.getClass(), "sequence", null);
        setField(term446403, term446403.getClass(), "xrpBalance", null);
        setField(term446403, term446403.getClass(), "ownerCount", null);
        setField(term446403, term446403.getClass(), "previousAffectingTransactionID", null);
        setField(term446403, term446403.getClass(), "previousAffectingTransactionLedgerVersion", null);
        setField(term446403, term446403.getClass(), "account", null);
        setField(term446403, term446403.getClass(), "parent", null);
        setField(term446403, term446403.getClass(), "initial_balance", null);
        setField(term446403, term446403.getClass(), "inception", null);
        setField(term446403, term446403.getClass(), "ledger_index", null);
        setField(term446403, term446403.getClass(), "accountName", null);
        setField(term446403, term446403.getClass(), "parentName", null);
        setField(term446403, term446403.getClass(), "kycApproved", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountResponse$XrpScanAccountResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.XrpScanAccountName");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "accountName", argTypes, term446403, args);
    }

};


