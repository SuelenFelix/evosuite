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

public class AirdropStatus_AirdropStatusBuilder_toString_111527797665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term558370;

    public AirdropStatus_AirdropStatusBuilder_toString_111527797665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term558370 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder"));
        setField(term558370, term558370.getClass(), "results", null);
        setField(term558370, term558370.getClass(), "id", null);
        setField(term558370, term558370.getClass(), "createDate", null);
        setField(term558370, term558370.getClass(), "updateDate", null);
        setField(term558370, term558370.getClass(), "startTime", null);
        setField(term558370, term558370.getClass(), "repeatUntilDate", null);
        setField(term558370, term558370.getClass(), "frequency", null);
        setField(term558370, term558370.getClass(), "status", null);
        setField(term558370, term558370.getClass(), "fromClassicAddress", null);
        setField(term558370, term558370.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term558370, term558370.getClass(), "currencyName", null);
        setField(term558370, term558370.getClass(), "currencyNameForProcess", null);
        setField(term558370, term558370.getClass(), "amount", null);
        setBooleanField(term558370, term558370.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term558370, term558370.getClass(), "useBlacklist", false);
        setField(term558370, term558370.getClass(), "maximumTrustlines", null);
        setField(term558370, term558370.getClass(), "dropType", null);
        setField(term558370, term558370.getClass(), "failReason", null);
        setField(term558370, term558370.getClass(), "minBalance", null);
        setField(term558370, term558370.getClass(), "maxBalance", null);
        setField(term558370, term558370.getClass(), "totalBlacklisted", null);
        setField(term558370, term558370.getClass(), "maxXrpFeePerTransaction", null);
        setField(term558370, term558370.getClass(), "totalRecipients", null);
        setField(term558370, term558370.getClass(), "paymentType", null);
        setField(term558370, term558370.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term558370, term558370.getClass(), "snapshotCurrencyName", null);
        setField(term558370, term558370.getClass(), "nftIssuingAddress", null);
        setField(term558370, term558370.getClass(), "nftTaxon", null);
        setField(term558370, term558370.getClass(), "scheduleStatus", null);
        setField(term558370, term558370.getClass(), "fromScheduleId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term558370, args);
    }

};


