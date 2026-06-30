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

public class AirdropStatus_getStatus_181040441212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126502;

    public AirdropStatus_getStatus_181040441212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term126506 = new Long(-7296330380944173376L);
        Class<? extends Object> term126786 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term126785 = ((Class) term126786).getDeclaredField((String) "SENDING");
        ((Field) term126785).setAccessible(true);
        Object enum235 = ((Field) term126785).get((Object) null);
        Object term126505 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term126505, term126505.getClass(), "id", term126506);
        setField(term126505, term126505.getClass(), "responseCode", "");
        setField(term126505, term126505.getClass(), "reason", "");
        setField(term126505, term126505.getClass(), "classicAddress", "");
        setField(term126505, term126505.getClass(), "status", enum235);
        setField(term126505, term126505.getClass(), "paymentAmount", "");
        setField(term126505, term126505.getClass(), "snapshotBalance", "");
        setField(term126505, term126505.getClass(), "nftOwned", "");
        Long term126517 = new Long(-8890284990655172580L);
        Object term126516 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term126516, term126516.getClass(), "id", term126517);
        setField(term126516, term126516.getClass(), "responseCode", "");
        setField(term126516, term126516.getClass(), "reason", "");
        setField(term126516, term126516.getClass(), "classicAddress", "");
        setField(term126516, term126516.getClass(), "status", enum235);
        setField(term126516, term126516.getClass(), "paymentAmount", "");
        setField(term126516, term126516.getClass(), "snapshotBalance", "");
        setField(term126516, term126516.getClass(), "nftOwned", "");
        ArrayList term126503 = new ArrayList();
        ((ArrayList) term126503).add(term126505);
        ((ArrayList) term126503).add(term126516);
        Long term126527 = new Long(-5951743062322506095L);
        Class<? extends Object> term127209 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term127208 = ((Class) term127209).getDeclaredField((String) "MONTHLY");
        ((Field) term127208).setAccessible(true);
        Object enum236 = ((Field) term127208).get((Object) null);
        Class<? extends Object> term127602 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term127601 = ((Class) term127602).getDeclaredField((String) "POPULATING_ADDRESSES");
        ((Field) term127601).setAccessible(true);
        Object enum237 = ((Field) term127601).get((Object) null);
        Integer term126634 = new Integer(-1888585309);
        Class<? extends Object> term128104 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term128103 = ((Class) term128104).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term128103).setAccessible(true);
        Object enum238 = ((Field) term128103).get((Object) null);
        Long term126693 = new Long(768144790810175653L);
        Long term126707 = new Long(-1497280900081695731L);
        Class<? extends Object> term128542 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term128541 = ((Class) term128542).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term128541).setAccessible(true);
        Object enum239 = ((Field) term128541).get((Object) null);
        Class<? extends Object> term128980 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term128979 = ((Class) term128980).getDeclaredField((String) "ACTIVE");
        ((Field) term128979).setAccessible(true);
        Object enum240 = ((Field) term128979).get((Object) null);
        Long term126783 = new Long(-3602825674339018793L);
        term126502 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term126529 = newInstance(Class.forName("java.util.Date"));
        Object term126531 = newInstance(Class.forName("java.util.Date"));
        Object term126533 = newInstance(Class.forName("java.util.Date"));
        Object term126535 = newInstance(Class.forName("java.util.Date"));
        setField(term126502, term126502.getClass(), "results", term126503);
        setField(term126502, term126502.getClass(), "id", term126527);
        setLongField(term126529, term126529.getClass(), "fastTime", 1331513661676L);
        setField(term126529, term126529.getClass(), "cdate", null);
        setField(term126502, term126502.getClass(), "createDate", term126529);
        setLongField(term126531, term126531.getClass(), "fastTime", 1478384856375L);
        setField(term126531, term126531.getClass(), "cdate", null);
        setField(term126502, term126502.getClass(), "updateDate", term126531);
        setLongField(term126533, term126533.getClass(), "fastTime", 1789681710192L);
        setField(term126533, term126533.getClass(), "cdate", null);
        setField(term126502, term126502.getClass(), "startTime", term126533);
        setLongField(term126535, term126535.getClass(), "fastTime", 1786374298622L);
        setField(term126535, term126535.getClass(), "cdate", null);
        setField(term126502, term126502.getClass(), "repeatUntilDate", term126535);
        setField(term126502, term126502.getClass(), "frequency", enum236);
        setField(term126502, term126502.getClass(), "status", enum237);
        setField(term126502, term126502.getClass(), "fromClassicAddress", "jySnpYEVPv");
        setField(term126502, term126502.getClass(), "trustlineIssuerClassicAddress", "VdHqujFzSo");
        setField(term126502, term126502.getClass(), "currencyName", "cZbOKEdKPs");
        setField(term126502, term126502.getClass(), "currencyNameForProcess", "nvXqvMSAjc");
        setField(term126502, term126502.getClass(), "amount", "agbhgbQisl");
        setBooleanField(term126502, term126502.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term126502, term126502.getClass(), "useBlacklist", true);
        setField(term126502, term126502.getClass(), "maximumTrustlines", term126634);
        setField(term126502, term126502.getClass(), "dropType", enum238);
        setField(term126502, term126502.getClass(), "failReason", "EZvlAVCXCm");
        setField(term126502, term126502.getClass(), "minBalance", "axtbmWOSRY");
        setField(term126502, term126502.getClass(), "maxBalance", "TLlyjzxJUz");
        setField(term126502, term126502.getClass(), "totalBlacklisted", term126693);
        setField(term126502, term126502.getClass(), "maxXrpFeePerTransaction", "YclIWGPKZY");
        setField(term126502, term126502.getClass(), "totalRecipients", term126707);
        setField(term126502, term126502.getClass(), "paymentType", enum239);
        setField(term126502, term126502.getClass(), "snapshotTrustlineIssuerClassicAddress", "gChBjLUhbg");
        setField(term126502, term126502.getClass(), "snapshotCurrencyName", "enWkULOykY");
        setField(term126502, term126502.getClass(), "nftIssuingAddress", "BPdcafiAQX");
        setField(term126502, term126502.getClass(), "nftTaxon", "GvmOxwMrOk");
        setField(term126502, term126502.getClass(), "scheduleStatus", enum240);
        setField(term126502, term126502.getClass(), "fromScheduleId", term126783);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term126502, args);
    }

};


