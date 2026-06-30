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

public class AirdropStatus_getScheduleStatus_203565774733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199399;

    public AirdropStatus_getScheduleStatus_203565774733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term199403 = new Long(4354242424632479389L);
        Class<? extends Object> term199697 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term199696 = ((Class) term199697).getDeclaredField((String) "FAILED");
        ((Field) term199696).setAccessible(true);
        Object enum391 = ((Field) term199696).get((Object) null);
        Object term199402 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term199402, term199402.getClass(), "id", term199403);
        setField(term199402, term199402.getClass(), "responseCode", "");
        setField(term199402, term199402.getClass(), "reason", "");
        setField(term199402, term199402.getClass(), "classicAddress", "");
        setField(term199402, term199402.getClass(), "status", enum391);
        setField(term199402, term199402.getClass(), "paymentAmount", "");
        setField(term199402, term199402.getClass(), "snapshotBalance", "");
        setField(term199402, term199402.getClass(), "nftOwned", "");
        Long term199414 = new Long(-4146453776626172590L);
        Object term199413 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term199413, term199413.getClass(), "id", term199414);
        setField(term199413, term199413.getClass(), "responseCode", "");
        setField(term199413, term199413.getClass(), "reason", "");
        setField(term199413, term199413.getClass(), "classicAddress", "");
        setField(term199413, term199413.getClass(), "status", enum391);
        setField(term199413, term199413.getClass(), "paymentAmount", "");
        setField(term199413, term199413.getClass(), "snapshotBalance", "");
        setField(term199413, term199413.getClass(), "nftOwned", "");
        Long term199423 = new Long(-5876259280451647338L);
        Class<? extends Object> term200117 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term200116 = ((Class) term200117).getDeclaredField((String) "VERIFIED");
        ((Field) term200116).setAccessible(true);
        Object enum392 = ((Field) term200116).get((Object) null);
        Object term199422 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term199422, term199422.getClass(), "id", term199423);
        setField(term199422, term199422.getClass(), "responseCode", "");
        setField(term199422, term199422.getClass(), "reason", "");
        setField(term199422, term199422.getClass(), "classicAddress", "");
        setField(term199422, term199422.getClass(), "status", enum392);
        setField(term199422, term199422.getClass(), "paymentAmount", "");
        setField(term199422, term199422.getClass(), "snapshotBalance", "");
        setField(term199422, term199422.getClass(), "nftOwned", "");
        Long term199434 = new Long(-4562564710769146498L);
        Object term199433 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term199433, term199433.getClass(), "id", term199434);
        setField(term199433, term199433.getClass(), "responseCode", "");
        setField(term199433, term199433.getClass(), "reason", "");
        setField(term199433, term199433.getClass(), "classicAddress", "");
        setField(term199433, term199433.getClass(), "status", enum391);
        setField(term199433, term199433.getClass(), "paymentAmount", "");
        setField(term199433, term199433.getClass(), "snapshotBalance", "");
        setField(term199433, term199433.getClass(), "nftOwned", "");
        ArrayList term199400 = new ArrayList();
        ((ArrayList) term199400).add(term199402);
        ((ArrayList) term199400).add(term199413);
        ((ArrayList) term199400).add(term199422);
        ((ArrayList) term199400).add(term199433);
        Long term199444 = new Long(-6254265799185295775L);
        Class<? extends Object> term200543 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term200542 = ((Class) term200543).getDeclaredField((String) "MONTHLY");
        ((Field) term200542).setAccessible(true);
        Object enum393 = ((Field) term200542).get((Object) null);
        Class<? extends Object> term200936 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term200935 = ((Class) term200936).getDeclaredField((String) "PENDING_REVIEW");
        ((Field) term200935).setAccessible(true);
        Object enum394 = ((Field) term200935).get((Object) null);
        Integer term199545 = new Integer(1861318859);
        Class<? extends Object> term201420 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term201419 = ((Class) term201420).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term201419).setAccessible(true);
        Object enum395 = ((Field) term201419).get((Object) null);
        Long term199604 = new Long(3831994970480278159L);
        Long term199618 = new Long(-5714578622746827780L);
        Class<? extends Object> term201858 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term201857 = ((Class) term201858).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term201857).setAccessible(true);
        Object enum396 = ((Field) term201857).get((Object) null);
        Class<? extends Object> term202296 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term202295 = ((Class) term202296).getDeclaredField((String) "ACTIVE");
        ((Field) term202295).setAccessible(true);
        Object enum397 = ((Field) term202295).get((Object) null);
        Long term199694 = new Long(8918129626022907229L);
        term199399 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term199446 = newInstance(Class.forName("java.util.Date"));
        Object term199448 = newInstance(Class.forName("java.util.Date"));
        Object term199450 = newInstance(Class.forName("java.util.Date"));
        Object term199452 = newInstance(Class.forName("java.util.Date"));
        setField(term199399, term199399.getClass(), "results", term199400);
        setField(term199399, term199399.getClass(), "id", term199444);
        setLongField(term199446, term199446.getClass(), "fastTime", 1498239061308L);
        setField(term199446, term199446.getClass(), "cdate", null);
        setField(term199399, term199399.getClass(), "createDate", term199446);
        setLongField(term199448, term199448.getClass(), "fastTime", 1572369705867L);
        setField(term199448, term199448.getClass(), "cdate", null);
        setField(term199399, term199399.getClass(), "updateDate", term199448);
        setLongField(term199450, term199450.getClass(), "fastTime", 1640244611861L);
        setField(term199450, term199450.getClass(), "cdate", null);
        setField(term199399, term199399.getClass(), "startTime", term199450);
        setLongField(term199452, term199452.getClass(), "fastTime", 1585770433121L);
        setField(term199452, term199452.getClass(), "cdate", null);
        setField(term199399, term199399.getClass(), "repeatUntilDate", term199452);
        setField(term199399, term199399.getClass(), "frequency", enum393);
        setField(term199399, term199399.getClass(), "status", enum394);
        setField(term199399, term199399.getClass(), "fromClassicAddress", "PvrMbFoCJF");
        setField(term199399, term199399.getClass(), "trustlineIssuerClassicAddress", "UJOrVYoraU");
        setField(term199399, term199399.getClass(), "currencyName", "iVSQwPmTaa");
        setField(term199399, term199399.getClass(), "currencyNameForProcess", "ZGRjCkxZnF");
        setField(term199399, term199399.getClass(), "amount", "qntIiXdFTu");
        setBooleanField(term199399, term199399.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term199399, term199399.getClass(), "useBlacklist", false);
        setField(term199399, term199399.getClass(), "maximumTrustlines", term199545);
        setField(term199399, term199399.getClass(), "dropType", enum395);
        setField(term199399, term199399.getClass(), "failReason", "qneYYcRNxx");
        setField(term199399, term199399.getClass(), "minBalance", "UampjCLvRN");
        setField(term199399, term199399.getClass(), "maxBalance", "EsQWMjShML");
        setField(term199399, term199399.getClass(), "totalBlacklisted", term199604);
        setField(term199399, term199399.getClass(), "maxXrpFeePerTransaction", "JPgLQWnVaG");
        setField(term199399, term199399.getClass(), "totalRecipients", term199618);
        setField(term199399, term199399.getClass(), "paymentType", enum396);
        setField(term199399, term199399.getClass(), "snapshotTrustlineIssuerClassicAddress", "IOLqavRFIA");
        setField(term199399, term199399.getClass(), "snapshotCurrencyName", "FpmxstceWP");
        setField(term199399, term199399.getClass(), "nftIssuingAddress", "JhehNkztDU");
        setField(term199399, term199399.getClass(), "nftTaxon", "axzwQpwfps");
        setField(term199399, term199399.getClass(), "scheduleStatus", enum397);
        setField(term199399, term199399.getClass(), "fromScheduleId", term199694);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScheduleStatus", argTypes, term199399, args);
    }

};


