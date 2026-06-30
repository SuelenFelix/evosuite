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

public class AirdropStatus_getNftIssuingAddress_70853943698 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313447;

    public AirdropStatus_getNftIssuingAddress_70853943698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313447 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        setField(term313447, term313447.getClass(), "results", null);
        setField(term313447, term313447.getClass(), "id", null);
        setField(term313447, term313447.getClass(), "createDate", null);
        setField(term313447, term313447.getClass(), "updateDate", null);
        setField(term313447, term313447.getClass(), "startTime", null);
        setField(term313447, term313447.getClass(), "repeatUntilDate", null);
        setField(term313447, term313447.getClass(), "frequency", null);
        setField(term313447, term313447.getClass(), "status", null);
        setField(term313447, term313447.getClass(), "fromClassicAddress", null);
        setField(term313447, term313447.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term313447, term313447.getClass(), "currencyName", null);
        setField(term313447, term313447.getClass(), "currencyNameForProcess", null);
        setField(term313447, term313447.getClass(), "amount", null);
        setBooleanField(term313447, term313447.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term313447, term313447.getClass(), "useBlacklist", false);
        setField(term313447, term313447.getClass(), "maximumTrustlines", null);
        setField(term313447, term313447.getClass(), "dropType", null);
        setField(term313447, term313447.getClass(), "failReason", null);
        setField(term313447, term313447.getClass(), "minBalance", null);
        setField(term313447, term313447.getClass(), "maxBalance", null);
        setField(term313447, term313447.getClass(), "totalBlacklisted", null);
        setField(term313447, term313447.getClass(), "maxXrpFeePerTransaction", null);
        setField(term313447, term313447.getClass(), "totalRecipients", null);
        setField(term313447, term313447.getClass(), "paymentType", null);
        setField(term313447, term313447.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term313447, term313447.getClass(), "snapshotCurrencyName", null);
        setField(term313447, term313447.getClass(), "nftIssuingAddress", null);
        setField(term313447, term313447.getClass(), "nftTaxon", null);
        setField(term313447, term313447.getClass(), "scheduleStatus", null);
        setField(term313447, term313447.getClass(), "fromScheduleId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNftIssuingAddress", argTypes, term313447, args);
    }

};


