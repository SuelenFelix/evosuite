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

public class AirdropStatus_setCurrencyName_163064661047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241279;

    public AirdropStatus_setCurrencyName_163064661047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term241283 = new Long(-7006877527579112761L);
        Class<? extends Object> term241555 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term241554 = ((Class) term241555).getDeclaredField((String) "VERIFIED");
        ((Field) term241554).setAccessible(true);
        Object enum480 = ((Field) term241554).get((Object) null);
        Object term241282 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term241282, term241282.getClass(), "id", term241283);
        setField(term241282, term241282.getClass(), "responseCode", "");
        setField(term241282, term241282.getClass(), "reason", "");
        setField(term241282, term241282.getClass(), "classicAddress", "");
        setField(term241282, term241282.getClass(), "status", enum480);
        setField(term241282, term241282.getClass(), "paymentAmount", "");
        setField(term241282, term241282.getClass(), "snapshotBalance", "");
        setField(term241282, term241282.getClass(), "nftOwned", "");
        ArrayList term241280 = new ArrayList();
        ((ArrayList) term241280).add(term241282);
        Long term241295 = new Long(-8699693633047465617L);
        Class<? extends Object> term241981 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term241980 = ((Class) term241981).getDeclaredField((String) "WEEKLY");
        ((Field) term241980).setAccessible(true);
        Object enum481 = ((Field) term241980).get((Object) null);
        Class<? extends Object> term242371 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term242370 = ((Class) term242371).getDeclaredField((String) "COMPLETE");
        ((Field) term242370).setAccessible(true);
        Object enum482 = ((Field) term242370).get((Object) null);
        Integer term241389 = new Integer(-1963464809);
        Class<? extends Object> term242837 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term242836 = ((Class) term242837).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term242836).setAccessible(true);
        Object enum483 = ((Field) term242836).get((Object) null);
        Long term241448 = new Long(-590890905395927244L);
        Long term241462 = new Long(6978548804004471804L);
        Class<? extends Object> term243275 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term243274 = ((Class) term243275).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term243274).setAccessible(true);
        Object enum484 = ((Field) term243274).get((Object) null);
        Class<? extends Object> term243713 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term243712 = ((Class) term243713).getDeclaredField((String) "REJECTED");
        ((Field) term243712).setAccessible(true);
        Object enum485 = ((Field) term243712).get((Object) null);
        Long term241540 = new Long(-8957441653116712448L);
        term241279 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term241297 = newInstance(Class.forName("java.util.Date"));
        Object term241299 = newInstance(Class.forName("java.util.Date"));
        Object term241301 = newInstance(Class.forName("java.util.Date"));
        Object term241303 = newInstance(Class.forName("java.util.Date"));
        setField(term241279, term241279.getClass(), "results", term241280);
        setField(term241279, term241279.getClass(), "id", term241295);
        setLongField(term241297, term241297.getClass(), "fastTime", 1303146117775L);
        setField(term241297, term241297.getClass(), "cdate", null);
        setField(term241279, term241279.getClass(), "createDate", term241297);
        setLongField(term241299, term241299.getClass(), "fastTime", 1846750848622L);
        setField(term241299, term241299.getClass(), "cdate", null);
        setField(term241279, term241279.getClass(), "updateDate", term241299);
        setLongField(term241301, term241301.getClass(), "fastTime", 1684482458774L);
        setField(term241301, term241301.getClass(), "cdate", null);
        setField(term241279, term241279.getClass(), "startTime", term241301);
        setLongField(term241303, term241303.getClass(), "fastTime", 1771471993431L);
        setField(term241303, term241303.getClass(), "cdate", null);
        setField(term241279, term241279.getClass(), "repeatUntilDate", term241303);
        setField(term241279, term241279.getClass(), "frequency", enum481);
        setField(term241279, term241279.getClass(), "status", enum482);
        setField(term241279, term241279.getClass(), "fromClassicAddress", "LpBQSpICQX");
        setField(term241279, term241279.getClass(), "trustlineIssuerClassicAddress", "uPhRdRCFnR");
        setField(term241279, term241279.getClass(), "currencyName", "HdiCCAVvaY");
        setField(term241279, term241279.getClass(), "currencyNameForProcess", "UrAeseWSFd");
        setField(term241279, term241279.getClass(), "amount", "udLLyuUbuM");
        setBooleanField(term241279, term241279.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term241279, term241279.getClass(), "useBlacklist", false);
        setField(term241279, term241279.getClass(), "maximumTrustlines", term241389);
        setField(term241279, term241279.getClass(), "dropType", enum483);
        setField(term241279, term241279.getClass(), "failReason", "sNNylQpAva");
        setField(term241279, term241279.getClass(), "minBalance", "fiwockBanw");
        setField(term241279, term241279.getClass(), "maxBalance", "VbcximgVTz");
        setField(term241279, term241279.getClass(), "totalBlacklisted", term241448);
        setField(term241279, term241279.getClass(), "maxXrpFeePerTransaction", "TGJZvuTmTU");
        setField(term241279, term241279.getClass(), "totalRecipients", term241462);
        setField(term241279, term241279.getClass(), "paymentType", enum484);
        setField(term241279, term241279.getClass(), "snapshotTrustlineIssuerClassicAddress", "BSkkjeLezA");
        setField(term241279, term241279.getClass(), "snapshotCurrencyName", "uAlTVusgen");
        setField(term241279, term241279.getClass(), "nftIssuingAddress", "PAUaymMOSJ");
        setField(term241279, term241279.getClass(), "nftTaxon", "OcTjqWhWJS");
        setField(term241279, term241279.getClass(), "scheduleStatus", enum485);
        setField(term241279, term241279.getClass(), "fromScheduleId", term241540);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XkidVezikV";
        callMethod(klass, "setCurrencyName", argTypes, term241279, args);
    }

};


