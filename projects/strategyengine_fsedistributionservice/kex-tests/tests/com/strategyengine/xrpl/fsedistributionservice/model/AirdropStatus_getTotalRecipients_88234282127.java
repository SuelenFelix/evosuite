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

public class AirdropStatus_getTotalRecipients_88234282127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179195;

    public AirdropStatus_getTotalRecipients_88234282127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term179199 = new Long(-1084263688306617320L);
        Class<? extends Object> term179462 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term179461 = ((Class) term179462).getDeclaredField((String) "VERIFIED");
        ((Field) term179461).setAccessible(true);
        Object enum348 = ((Field) term179461).get((Object) null);
        Object term179198 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term179198, term179198.getClass(), "id", term179199);
        setField(term179198, term179198.getClass(), "responseCode", "");
        setField(term179198, term179198.getClass(), "reason", "");
        setField(term179198, term179198.getClass(), "classicAddress", "");
        setField(term179198, term179198.getClass(), "status", enum348);
        setField(term179198, term179198.getClass(), "paymentAmount", "");
        setField(term179198, term179198.getClass(), "snapshotBalance", "");
        setField(term179198, term179198.getClass(), "nftOwned", "");
        ArrayList term179196 = new ArrayList();
        ((ArrayList) term179196).add(term179198);
        Long term179211 = new Long(1193381106528373019L);
        Class<? extends Object> term179888 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term179887 = ((Class) term179888).getDeclaredField((String) "MONTHLY");
        ((Field) term179887).setAccessible(true);
        Object enum349 = ((Field) term179887).get((Object) null);
        Class<? extends Object> term180281 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term180280 = ((Class) term180281).getDeclaredField((String) "POPULATING_ADDRESSES");
        ((Field) term180280).setAccessible(true);
        Object enum350 = ((Field) term180280).get((Object) null);
        Integer term179318 = new Integer(-893623680);
        Class<? extends Object> term180783 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term180782 = ((Class) term180783).getDeclaredField((String) "TRUSTLINE");
        ((Field) term180782).setAccessible(true);
        Object enum351 = ((Field) term180782).get((Object) null);
        Long term179369 = new Long(-1365372122034008688L);
        Long term179383 = new Long(-6108006981756732593L);
        Class<? extends Object> term181197 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term181196 = ((Class) term181197).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term181196).setAccessible(true);
        Object enum352 = ((Field) term181196).get((Object) null);
        Class<? extends Object> term181635 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term181634 = ((Class) term181635).getDeclaredField((String) "ACTIVE");
        ((Field) term181634).setAccessible(true);
        Object enum353 = ((Field) term181634).get((Object) null);
        Long term179459 = new Long(-3565554762799701668L);
        term179195 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term179213 = newInstance(Class.forName("java.util.Date"));
        Object term179215 = newInstance(Class.forName("java.util.Date"));
        Object term179217 = newInstance(Class.forName("java.util.Date"));
        Object term179219 = newInstance(Class.forName("java.util.Date"));
        setField(term179195, term179195.getClass(), "results", term179196);
        setField(term179195, term179195.getClass(), "id", term179211);
        setLongField(term179213, term179213.getClass(), "fastTime", 1577603441473L);
        setField(term179213, term179213.getClass(), "cdate", null);
        setField(term179195, term179195.getClass(), "createDate", term179213);
        setLongField(term179215, term179215.getClass(), "fastTime", 1387636078975L);
        setField(term179215, term179215.getClass(), "cdate", null);
        setField(term179195, term179195.getClass(), "updateDate", term179215);
        setLongField(term179217, term179217.getClass(), "fastTime", 1653781715654L);
        setField(term179217, term179217.getClass(), "cdate", null);
        setField(term179195, term179195.getClass(), "startTime", term179217);
        setLongField(term179219, term179219.getClass(), "fastTime", 1883930571832L);
        setField(term179219, term179219.getClass(), "cdate", null);
        setField(term179195, term179195.getClass(), "repeatUntilDate", term179219);
        setField(term179195, term179195.getClass(), "frequency", enum349);
        setField(term179195, term179195.getClass(), "status", enum350);
        setField(term179195, term179195.getClass(), "fromClassicAddress", "BIFQrvbqSd");
        setField(term179195, term179195.getClass(), "trustlineIssuerClassicAddress", "wcVhMnVVMH");
        setField(term179195, term179195.getClass(), "currencyName", "EUWyNZxbWR");
        setField(term179195, term179195.getClass(), "currencyNameForProcess", "TaoriKlxVP");
        setField(term179195, term179195.getClass(), "amount", "CDKCMwdzTR");
        setBooleanField(term179195, term179195.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term179195, term179195.getClass(), "useBlacklist", false);
        setField(term179195, term179195.getClass(), "maximumTrustlines", term179318);
        setField(term179195, term179195.getClass(), "dropType", enum351);
        setField(term179195, term179195.getClass(), "failReason", "ehviwWrUip");
        setField(term179195, term179195.getClass(), "minBalance", "LNsNBvvYgQ");
        setField(term179195, term179195.getClass(), "maxBalance", "VGKsvldNNB");
        setField(term179195, term179195.getClass(), "totalBlacklisted", term179369);
        setField(term179195, term179195.getClass(), "maxXrpFeePerTransaction", "pfyJIgGkiH");
        setField(term179195, term179195.getClass(), "totalRecipients", term179383);
        setField(term179195, term179195.getClass(), "paymentType", enum352);
        setField(term179195, term179195.getClass(), "snapshotTrustlineIssuerClassicAddress", "lvQpEwdZeM");
        setField(term179195, term179195.getClass(), "snapshotCurrencyName", "xtNmObxmHy");
        setField(term179195, term179195.getClass(), "nftIssuingAddress", "nComTwhtzu");
        setField(term179195, term179195.getClass(), "nftTaxon", "gXyUtfRzMt");
        setField(term179195, term179195.getClass(), "scheduleStatus", enum353);
        setField(term179195, term179195.getClass(), "fromScheduleId", term179459);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalRecipients", argTypes, term179195, args);
    }

};


