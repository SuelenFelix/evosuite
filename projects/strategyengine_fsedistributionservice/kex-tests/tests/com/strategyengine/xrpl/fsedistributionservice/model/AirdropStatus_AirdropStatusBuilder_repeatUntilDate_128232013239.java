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

public class AirdropStatus_AirdropStatusBuilder_repeatUntilDate_128232013239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term558288;

    public AirdropStatus_AirdropStatusBuilder_repeatUntilDate_128232013239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term558288 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder"));
        setField(term558288, term558288.getClass(), "results", null);
        setField(term558288, term558288.getClass(), "id", null);
        setField(term558288, term558288.getClass(), "createDate", null);
        setField(term558288, term558288.getClass(), "updateDate", null);
        setField(term558288, term558288.getClass(), "startTime", null);
        setField(term558288, term558288.getClass(), "repeatUntilDate", null);
        setField(term558288, term558288.getClass(), "frequency", null);
        setField(term558288, term558288.getClass(), "status", null);
        setField(term558288, term558288.getClass(), "fromClassicAddress", null);
        setField(term558288, term558288.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term558288, term558288.getClass(), "currencyName", null);
        setField(term558288, term558288.getClass(), "currencyNameForProcess", null);
        setField(term558288, term558288.getClass(), "amount", null);
        setBooleanField(term558288, term558288.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term558288, term558288.getClass(), "useBlacklist", false);
        setField(term558288, term558288.getClass(), "maximumTrustlines", null);
        setField(term558288, term558288.getClass(), "dropType", null);
        setField(term558288, term558288.getClass(), "failReason", null);
        setField(term558288, term558288.getClass(), "minBalance", null);
        setField(term558288, term558288.getClass(), "maxBalance", null);
        setField(term558288, term558288.getClass(), "totalBlacklisted", null);
        setField(term558288, term558288.getClass(), "maxXrpFeePerTransaction", null);
        setField(term558288, term558288.getClass(), "totalRecipients", null);
        setField(term558288, term558288.getClass(), "paymentType", null);
        setField(term558288, term558288.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term558288, term558288.getClass(), "snapshotCurrencyName", null);
        setField(term558288, term558288.getClass(), "nftIssuingAddress", null);
        setField(term558288, term558288.getClass(), "nftTaxon", null);
        setField(term558288, term558288.getClass(), "scheduleStatus", null);
        setField(term558288, term558288.getClass(), "fromScheduleId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "repeatUntilDate", argTypes, term558288, args);
    }

};


