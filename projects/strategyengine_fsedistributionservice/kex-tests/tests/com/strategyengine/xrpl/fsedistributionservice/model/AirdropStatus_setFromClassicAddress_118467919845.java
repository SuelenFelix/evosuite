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

public class AirdropStatus_setFromClassicAddress_118467919845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235512;

    public AirdropStatus_setFromClassicAddress_118467919845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term235516 = new Long(-1009485425289165749L);
        Class<? extends Object> term235795 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term235794 = ((Class) term235795).getDeclaredField((String) "SENDING");
        ((Field) term235794).setAccessible(true);
        Object enum468 = ((Field) term235794).get((Object) null);
        Object term235515 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term235515, term235515.getClass(), "id", term235516);
        setField(term235515, term235515.getClass(), "responseCode", "");
        setField(term235515, term235515.getClass(), "reason", "");
        setField(term235515, term235515.getClass(), "classicAddress", "");
        setField(term235515, term235515.getClass(), "status", enum468);
        setField(term235515, term235515.getClass(), "paymentAmount", "");
        setField(term235515, term235515.getClass(), "snapshotBalance", "");
        setField(term235515, term235515.getClass(), "nftOwned", "");
        ArrayList term235513 = new ArrayList();
        ((ArrayList) term235513).add(term235515);
        Long term235528 = new Long(-5044181804110715069L);
        Class<? extends Object> term236218 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term236217 = ((Class) term236218).getDeclaredField((String) "MONTHLY");
        ((Field) term236217).setAccessible(true);
        Object enum469 = ((Field) term236217).get((Object) null);
        Class<? extends Object> term236611 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term236610 = ((Class) term236611).getDeclaredField((String) "PENDING_REVIEW");
        ((Field) term236610).setAccessible(true);
        Object enum470 = ((Field) term236610).get((Object) null);
        Integer term235629 = new Integer(-343325701);
        Class<? extends Object> term237095 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term237094 = ((Class) term237095).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term237094).setAccessible(true);
        Object enum471 = ((Field) term237094).get((Object) null);
        Long term235688 = new Long(-2413135395771470086L);
        Long term235702 = new Long(-823085399570394644L);
        Class<? extends Object> term237533 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term237532 = ((Class) term237533).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term237532).setAccessible(true);
        Object enum472 = ((Field) term237532).get((Object) null);
        Class<? extends Object> term237971 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term237970 = ((Class) term237971).getDeclaredField((String) "COMPLETE");
        ((Field) term237970).setAccessible(true);
        Object enum473 = ((Field) term237970).get((Object) null);
        Long term235780 = new Long(-894705411488729365L);
        term235512 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term235530 = newInstance(Class.forName("java.util.Date"));
        Object term235532 = newInstance(Class.forName("java.util.Date"));
        Object term235534 = newInstance(Class.forName("java.util.Date"));
        Object term235536 = newInstance(Class.forName("java.util.Date"));
        setField(term235512, term235512.getClass(), "results", term235513);
        setField(term235512, term235512.getClass(), "id", term235528);
        setLongField(term235530, term235530.getClass(), "fastTime", 1443806678255L);
        setField(term235530, term235530.getClass(), "cdate", null);
        setField(term235512, term235512.getClass(), "createDate", term235530);
        setLongField(term235532, term235532.getClass(), "fastTime", 1379437434695L);
        setField(term235532, term235532.getClass(), "cdate", null);
        setField(term235512, term235512.getClass(), "updateDate", term235532);
        setLongField(term235534, term235534.getClass(), "fastTime", 1526147148954L);
        setField(term235534, term235534.getClass(), "cdate", null);
        setField(term235512, term235512.getClass(), "startTime", term235534);
        setLongField(term235536, term235536.getClass(), "fastTime", 1268663155151L);
        setField(term235536, term235536.getClass(), "cdate", null);
        setField(term235512, term235512.getClass(), "repeatUntilDate", term235536);
        setField(term235512, term235512.getClass(), "frequency", enum469);
        setField(term235512, term235512.getClass(), "status", enum470);
        setField(term235512, term235512.getClass(), "fromClassicAddress", "DYaMGxxqDk");
        setField(term235512, term235512.getClass(), "trustlineIssuerClassicAddress", "kTRmkTQpRx");
        setField(term235512, term235512.getClass(), "currencyName", "NmXGFQkgMo");
        setField(term235512, term235512.getClass(), "currencyNameForProcess", "lBruaTAkIt");
        setField(term235512, term235512.getClass(), "amount", "pIQQBEGLOF");
        setBooleanField(term235512, term235512.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term235512, term235512.getClass(), "useBlacklist", false);
        setField(term235512, term235512.getClass(), "maximumTrustlines", term235629);
        setField(term235512, term235512.getClass(), "dropType", enum471);
        setField(term235512, term235512.getClass(), "failReason", "DLYPXnIorY");
        setField(term235512, term235512.getClass(), "minBalance", "MaEbckWDBJ");
        setField(term235512, term235512.getClass(), "maxBalance", "kxuScrxaGm");
        setField(term235512, term235512.getClass(), "totalBlacklisted", term235688);
        setField(term235512, term235512.getClass(), "maxXrpFeePerTransaction", "ItamIWoOLr");
        setField(term235512, term235512.getClass(), "totalRecipients", term235702);
        setField(term235512, term235512.getClass(), "paymentType", enum472);
        setField(term235512, term235512.getClass(), "snapshotTrustlineIssuerClassicAddress", "YeemjiDgab");
        setField(term235512, term235512.getClass(), "snapshotCurrencyName", "tihFwBkjdt");
        setField(term235512, term235512.getClass(), "nftIssuingAddress", "llYGfgCigY");
        setField(term235512, term235512.getClass(), "nftTaxon", "WToYKUjMGj");
        setField(term235512, term235512.getClass(), "scheduleStatus", enum473);
        setField(term235512, term235512.getClass(), "fromScheduleId", term235780);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wbtDRRVkMv";
        callMethod(klass, "setFromClassicAddress", argTypes, term235512, args);
    }

};


