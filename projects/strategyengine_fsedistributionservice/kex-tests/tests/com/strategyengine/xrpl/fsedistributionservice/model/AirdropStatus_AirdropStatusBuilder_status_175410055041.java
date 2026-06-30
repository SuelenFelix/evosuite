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

public class AirdropStatus_AirdropStatusBuilder_status_175410055041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term558294;

    public AirdropStatus_AirdropStatusBuilder_status_175410055041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term558294 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder"));
        setField(term558294, term558294.getClass(), "results", null);
        setField(term558294, term558294.getClass(), "id", null);
        setField(term558294, term558294.getClass(), "createDate", null);
        setField(term558294, term558294.getClass(), "updateDate", null);
        setField(term558294, term558294.getClass(), "startTime", null);
        setField(term558294, term558294.getClass(), "repeatUntilDate", null);
        setField(term558294, term558294.getClass(), "frequency", null);
        setField(term558294, term558294.getClass(), "status", null);
        setField(term558294, term558294.getClass(), "fromClassicAddress", null);
        setField(term558294, term558294.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term558294, term558294.getClass(), "currencyName", null);
        setField(term558294, term558294.getClass(), "currencyNameForProcess", null);
        setField(term558294, term558294.getClass(), "amount", null);
        setBooleanField(term558294, term558294.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term558294, term558294.getClass(), "useBlacklist", false);
        setField(term558294, term558294.getClass(), "maximumTrustlines", null);
        setField(term558294, term558294.getClass(), "dropType", null);
        setField(term558294, term558294.getClass(), "failReason", null);
        setField(term558294, term558294.getClass(), "minBalance", null);
        setField(term558294, term558294.getClass(), "maxBalance", null);
        setField(term558294, term558294.getClass(), "totalBlacklisted", null);
        setField(term558294, term558294.getClass(), "maxXrpFeePerTransaction", null);
        setField(term558294, term558294.getClass(), "totalRecipients", null);
        setField(term558294, term558294.getClass(), "paymentType", null);
        setField(term558294, term558294.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term558294, term558294.getClass(), "snapshotCurrencyName", null);
        setField(term558294, term558294.getClass(), "nftIssuingAddress", null);
        setField(term558294, term558294.getClass(), "nftTaxon", null);
        setField(term558294, term558294.getClass(), "scheduleStatus", null);
        setField(term558294, term558294.getClass(), "fromScheduleId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "status", argTypes, term558294, args);
    }

};


