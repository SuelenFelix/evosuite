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
import java.lang.Boolean;

public class AirdropStatus_AirdropStatusBuilder_newTrustlinesOnly_162087314047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term558312;
     Object term558315;

    public AirdropStatus_AirdropStatusBuilder_newTrustlinesOnly_162087314047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term558312 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder"));
        setField(term558312, term558312.getClass(), "results", null);
        setField(term558312, term558312.getClass(), "id", null);
        setField(term558312, term558312.getClass(), "createDate", null);
        setField(term558312, term558312.getClass(), "updateDate", null);
        setField(term558312, term558312.getClass(), "startTime", null);
        setField(term558312, term558312.getClass(), "repeatUntilDate", null);
        setField(term558312, term558312.getClass(), "frequency", null);
        setField(term558312, term558312.getClass(), "status", null);
        setField(term558312, term558312.getClass(), "fromClassicAddress", null);
        setField(term558312, term558312.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term558312, term558312.getClass(), "currencyName", null);
        setField(term558312, term558312.getClass(), "currencyNameForProcess", null);
        setField(term558312, term558312.getClass(), "amount", null);
        setBooleanField(term558312, term558312.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term558312, term558312.getClass(), "useBlacklist", false);
        setField(term558312, term558312.getClass(), "maximumTrustlines", null);
        setField(term558312, term558312.getClass(), "dropType", null);
        setField(term558312, term558312.getClass(), "failReason", null);
        setField(term558312, term558312.getClass(), "minBalance", null);
        setField(term558312, term558312.getClass(), "maxBalance", null);
        setField(term558312, term558312.getClass(), "totalBlacklisted", null);
        setField(term558312, term558312.getClass(), "maxXrpFeePerTransaction", null);
        setField(term558312, term558312.getClass(), "totalRecipients", null);
        setField(term558312, term558312.getClass(), "paymentType", null);
        setField(term558312, term558312.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term558312, term558312.getClass(), "snapshotCurrencyName", null);
        setField(term558312, term558312.getClass(), "nftIssuingAddress", null);
        setField(term558312, term558312.getClass(), "nftTaxon", null);
        setField(term558312, term558312.getClass(), "scheduleStatus", null);
        setField(term558312, term558312.getClass(), "fromScheduleId", null);
        term558315 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term558315;
        callMethod(klass, "newTrustlinesOnly", argTypes, term558312, args);
    }

};


