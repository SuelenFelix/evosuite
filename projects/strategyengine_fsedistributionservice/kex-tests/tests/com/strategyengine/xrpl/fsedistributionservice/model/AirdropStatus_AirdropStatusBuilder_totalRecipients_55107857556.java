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

public class AirdropStatus_AirdropStatusBuilder_totalRecipients_55107857556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term558343;

    public AirdropStatus_AirdropStatusBuilder_totalRecipients_55107857556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term558343 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder"));
        setField(term558343, term558343.getClass(), "results", null);
        setField(term558343, term558343.getClass(), "id", null);
        setField(term558343, term558343.getClass(), "createDate", null);
        setField(term558343, term558343.getClass(), "updateDate", null);
        setField(term558343, term558343.getClass(), "startTime", null);
        setField(term558343, term558343.getClass(), "repeatUntilDate", null);
        setField(term558343, term558343.getClass(), "frequency", null);
        setField(term558343, term558343.getClass(), "status", null);
        setField(term558343, term558343.getClass(), "fromClassicAddress", null);
        setField(term558343, term558343.getClass(), "trustlineIssuerClassicAddress", null);
        setField(term558343, term558343.getClass(), "currencyName", null);
        setField(term558343, term558343.getClass(), "currencyNameForProcess", null);
        setField(term558343, term558343.getClass(), "amount", null);
        setBooleanField(term558343, term558343.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term558343, term558343.getClass(), "useBlacklist", false);
        setField(term558343, term558343.getClass(), "maximumTrustlines", null);
        setField(term558343, term558343.getClass(), "dropType", null);
        setField(term558343, term558343.getClass(), "failReason", null);
        setField(term558343, term558343.getClass(), "minBalance", null);
        setField(term558343, term558343.getClass(), "maxBalance", null);
        setField(term558343, term558343.getClass(), "totalBlacklisted", null);
        setField(term558343, term558343.getClass(), "maxXrpFeePerTransaction", null);
        setField(term558343, term558343.getClass(), "totalRecipients", null);
        setField(term558343, term558343.getClass(), "paymentType", null);
        setField(term558343, term558343.getClass(), "snapshotTrustlineIssuerClassicAddress", null);
        setField(term558343, term558343.getClass(), "snapshotCurrencyName", null);
        setField(term558343, term558343.getClass(), "nftIssuingAddress", null);
        setField(term558343, term558343.getClass(), "nftTaxon", null);
        setField(term558343, term558343.getClass(), "scheduleStatus", null);
        setField(term558343, term558343.getClass(), "fromScheduleId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "totalRecipients", argTypes, term558343, args);
    }

};


