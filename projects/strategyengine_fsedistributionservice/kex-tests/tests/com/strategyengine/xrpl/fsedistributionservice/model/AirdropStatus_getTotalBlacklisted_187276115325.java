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

public class AirdropStatus_getTotalBlacklisted_187276115325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173551;

    public AirdropStatus_getTotalBlacklisted_187276115325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term173555 = new Long(3931473624300151730L);
        Class<? extends Object> term173829 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term173828 = ((Class) term173829).getDeclaredField((String) "FAILED");
        ((Field) term173828).setAccessible(true);
        Object enum336 = ((Field) term173828).get((Object) null);
        Object term173554 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term173554, term173554.getClass(), "id", term173555);
        setField(term173554, term173554.getClass(), "responseCode", "");
        setField(term173554, term173554.getClass(), "reason", "");
        setField(term173554, term173554.getClass(), "classicAddress", "");
        setField(term173554, term173554.getClass(), "status", enum336);
        setField(term173554, term173554.getClass(), "paymentAmount", "");
        setField(term173554, term173554.getClass(), "snapshotBalance", "");
        setField(term173554, term173554.getClass(), "nftOwned", "");
        Long term173566 = new Long(661905373566913125L);
        Class<? extends Object> term174249 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term174248 = ((Class) term174249).getDeclaredField((String) "FAILED");
        ((Field) term174248).setAccessible(true);
        Object enum337 = ((Field) term174248).get((Object) null);
        Object term173565 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term173565, term173565.getClass(), "id", term173566);
        setField(term173565, term173565.getClass(), "responseCode", "");
        setField(term173565, term173565.getClass(), "reason", "");
        setField(term173565, term173565.getClass(), "classicAddress", "");
        setField(term173565, term173565.getClass(), "status", enum337);
        setField(term173565, term173565.getClass(), "paymentAmount", "");
        setField(term173565, term173565.getClass(), "snapshotBalance", "");
        setField(term173565, term173565.getClass(), "nftOwned", "");
        ArrayList term173552 = new ArrayList();
        ((ArrayList) term173552).add(term173554);
        ((ArrayList) term173552).add(term173565);
        Long term173578 = new Long(-3753621038448351550L);
        Class<? extends Object> term174669 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term174668 = ((Class) term174669).getDeclaredField((String) "ANNUALLY");
        ((Field) term174668).setAccessible(true);
        Object enum338 = ((Field) term174668).get((Object) null);
        Class<? extends Object> term175065 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term175064 = ((Class) term175065).getDeclaredField((String) "SCHEDULED");
        ((Field) term175064).setAccessible(true);
        Object enum339 = ((Field) term175064).get((Object) null);
        Integer term173675 = new Integer(890669485);
        Class<? extends Object> term175534 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term175533 = ((Class) term175534).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term175533).setAccessible(true);
        Object enum340 = ((Field) term175533).get((Object) null);
        Long term173734 = new Long(5304481534735378567L);
        Long term173748 = new Long(3423155413133381764L);
        Class<? extends Object> term175972 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term175971 = ((Class) term175972).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term175971).setAccessible(true);
        Object enum341 = ((Field) term175971).get((Object) null);
        Class<? extends Object> term176410 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term176409 = ((Class) term176410).getDeclaredField((String) "COMPLETE");
        ((Field) term176409).setAccessible(true);
        Object enum342 = ((Field) term176409).get((Object) null);
        Long term173826 = new Long(7711054832353934171L);
        term173551 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term173580 = newInstance(Class.forName("java.util.Date"));
        Object term173582 = newInstance(Class.forName("java.util.Date"));
        Object term173584 = newInstance(Class.forName("java.util.Date"));
        Object term173586 = newInstance(Class.forName("java.util.Date"));
        setField(term173551, term173551.getClass(), "results", term173552);
        setField(term173551, term173551.getClass(), "id", term173578);
        setLongField(term173580, term173580.getClass(), "fastTime", 1761728693407L);
        setField(term173580, term173580.getClass(), "cdate", null);
        setField(term173551, term173551.getClass(), "createDate", term173580);
        setLongField(term173582, term173582.getClass(), "fastTime", 1715302849242L);
        setField(term173582, term173582.getClass(), "cdate", null);
        setField(term173551, term173551.getClass(), "updateDate", term173582);
        setLongField(term173584, term173584.getClass(), "fastTime", 1562237802749L);
        setField(term173584, term173584.getClass(), "cdate", null);
        setField(term173551, term173551.getClass(), "startTime", term173584);
        setLongField(term173586, term173586.getClass(), "fastTime", 1418073237580L);
        setField(term173586, term173586.getClass(), "cdate", null);
        setField(term173551, term173551.getClass(), "repeatUntilDate", term173586);
        setField(term173551, term173551.getClass(), "frequency", enum338);
        setField(term173551, term173551.getClass(), "status", enum339);
        setField(term173551, term173551.getClass(), "fromClassicAddress", "dlLhtWVZjw");
        setField(term173551, term173551.getClass(), "trustlineIssuerClassicAddress", "bGfglrDSXT");
        setField(term173551, term173551.getClass(), "currencyName", "sIrqbajnbs");
        setField(term173551, term173551.getClass(), "currencyNameForProcess", "AaxFofoThl");
        setField(term173551, term173551.getClass(), "amount", "ukaqYcLsKW");
        setBooleanField(term173551, term173551.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term173551, term173551.getClass(), "useBlacklist", false);
        setField(term173551, term173551.getClass(), "maximumTrustlines", term173675);
        setField(term173551, term173551.getClass(), "dropType", enum340);
        setField(term173551, term173551.getClass(), "failReason", "EZLBboYbhD");
        setField(term173551, term173551.getClass(), "minBalance", "bZISImXSTe");
        setField(term173551, term173551.getClass(), "maxBalance", "yrKoMMHHHY");
        setField(term173551, term173551.getClass(), "totalBlacklisted", term173734);
        setField(term173551, term173551.getClass(), "maxXrpFeePerTransaction", "JqDCwLjqnp");
        setField(term173551, term173551.getClass(), "totalRecipients", term173748);
        setField(term173551, term173551.getClass(), "paymentType", enum341);
        setField(term173551, term173551.getClass(), "snapshotTrustlineIssuerClassicAddress", "FHqHhmdJat");
        setField(term173551, term173551.getClass(), "snapshotCurrencyName", "QvpedpvzkV");
        setField(term173551, term173551.getClass(), "nftIssuingAddress", "hSWpWtRQyH");
        setField(term173551, term173551.getClass(), "nftTaxon", "DgHnOCKjBN");
        setField(term173551, term173551.getClass(), "scheduleStatus", enum342);
        setField(term173551, term173551.getClass(), "fromScheduleId", term173826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalBlacklisted", argTypes, term173551, args);
    }

};


