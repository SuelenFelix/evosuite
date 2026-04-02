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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Long;
import java.lang.String;
import java.lang.Integer;

public class AirdropStatus_setTrustlineIssuerClassicAddress_94532636146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238401;

    public AirdropStatus_setTrustlineIssuerClassicAddress_94532636146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term238405 = new Long(-7514437039500876647L);
        Class<? extends Object> term238682 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term238681 = ((Class) term238682).getDeclaredField((String) "FAILED");
        ((Field) term238681).setAccessible(true);
        Object enum474 = ((Field) term238681).get((Object) null);
        Object term238404 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term238404, term238404.getClass(), "id", term238405);
        setField(term238404, term238404.getClass(), "responseCode", "");
        setField(term238404, term238404.getClass(), "reason", "");
        setField(term238404, term238404.getClass(), "classicAddress", "");
        setField(term238404, term238404.getClass(), "status", enum474);
        setField(term238404, term238404.getClass(), "paymentAmount", "");
        setField(term238404, term238404.getClass(), "snapshotBalance", "");
        setField(term238404, term238404.getClass(), "nftOwned", "");
        ArrayList term238402 = new ArrayList();
        ((ArrayList) term238402).add(term238404);
        Long term238417 = new Long(204473662283899955L);
        Class<? extends Object> term239102 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term239101 = ((Class) term239102).getDeclaredField((String) "ANNUALLY");
        ((Field) term239101).setAccessible(true);
        Object enum475 = ((Field) term239101).get((Object) null);
        Class<? extends Object> term239498 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term239497 = ((Class) term239498).getDeclaredField((String) "POPULATING_ADDRESSES");
        ((Field) term239497).setAccessible(true);
        Object enum476 = ((Field) term239497).get((Object) null);
        Integer term238525 = new Integer(107945604);
        Class<? extends Object> term240000 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term239999 = ((Class) term240000).getDeclaredField((String) "GLOBALID");
        ((Field) term239999).setAccessible(true);
        Object enum477 = ((Field) term239999).get((Object) null);
        Long term238575 = new Long(-4029227951294167228L);
        Long term238589 = new Long(5160033404788124731L);
        Class<? extends Object> term240411 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term240410 = ((Class) term240411).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term240410).setAccessible(true);
        Object enum478 = ((Field) term240410).get((Object) null);
        Class<? extends Object> term240849 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term240848 = ((Class) term240849).getDeclaredField((String) "COMPLETE");
        ((Field) term240848).setAccessible(true);
        Object enum479 = ((Field) term240848).get((Object) null);
        Long term238667 = new Long(5071015720043054072L);
        term238401 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term238419 = newInstance(Class.forName("java.util.Date"));
        Object term238421 = newInstance(Class.forName("java.util.Date"));
        Object term238423 = newInstance(Class.forName("java.util.Date"));
        Object term238425 = newInstance(Class.forName("java.util.Date"));
        setField(term238401, term238401.getClass(), "results", term238402);
        setField(term238401, term238401.getClass(), "id", term238417);
        setLongField(term238419, term238419.getClass(), "fastTime", 1402468572849L);
        setField(term238419, term238419.getClass(), "cdate", null);
        setField(term238401, term238401.getClass(), "createDate", term238419);
        setLongField(term238421, term238421.getClass(), "fastTime", 1499782291546L);
        setField(term238421, term238421.getClass(), "cdate", null);
        setField(term238401, term238401.getClass(), "updateDate", term238421);
        setLongField(term238423, term238423.getClass(), "fastTime", 1641291124664L);
        setField(term238423, term238423.getClass(), "cdate", null);
        setField(term238401, term238401.getClass(), "startTime", term238423);
        setLongField(term238425, term238425.getClass(), "fastTime", 1856368913597L);
        setField(term238425, term238425.getClass(), "cdate", null);
        setField(term238401, term238401.getClass(), "repeatUntilDate", term238425);
        setField(term238401, term238401.getClass(), "frequency", enum475);
        setField(term238401, term238401.getClass(), "status", enum476);
        setField(term238401, term238401.getClass(), "fromClassicAddress", "LoFkuWLahf");
        setField(term238401, term238401.getClass(), "trustlineIssuerClassicAddress", "GwcCGdSyQT");
        setField(term238401, term238401.getClass(), "currencyName", "pQLjQOCQOz");
        setField(term238401, term238401.getClass(), "currencyNameForProcess", "RaVKdrEtNk");
        setField(term238401, term238401.getClass(), "amount", "pLrycUApoJ");
        setBooleanField(term238401, term238401.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term238401, term238401.getClass(), "useBlacklist", false);
        setField(term238401, term238401.getClass(), "maximumTrustlines", term238525);
        setField(term238401, term238401.getClass(), "dropType", enum477);
        setField(term238401, term238401.getClass(), "failReason", "QJTDOLXoVI");
        setField(term238401, term238401.getClass(), "minBalance", "MVXNdXioDJ");
        setField(term238401, term238401.getClass(), "maxBalance", "xXscNmBGLP");
        setField(term238401, term238401.getClass(), "totalBlacklisted", term238575);
        setField(term238401, term238401.getClass(), "maxXrpFeePerTransaction", "DOvWosNzCd");
        setField(term238401, term238401.getClass(), "totalRecipients", term238589);
        setField(term238401, term238401.getClass(), "paymentType", enum478);
        setField(term238401, term238401.getClass(), "snapshotTrustlineIssuerClassicAddress", "bIZNWEzBTe");
        setField(term238401, term238401.getClass(), "snapshotCurrencyName", "CVhsNqYDrO");
        setField(term238401, term238401.getClass(), "nftIssuingAddress", "dMpUbtHwly");
        setField(term238401, term238401.getClass(), "nftTaxon", "bxEEJVIcPG");
        setField(term238401, term238401.getClass(), "scheduleStatus", enum479);
        setField(term238401, term238401.getClass(), "fromScheduleId", term238667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UttOGDGpEr";
        callMethod(klass, "setTrustlineIssuerClassicAddress", argTypes, term238401, args);
    }

};


