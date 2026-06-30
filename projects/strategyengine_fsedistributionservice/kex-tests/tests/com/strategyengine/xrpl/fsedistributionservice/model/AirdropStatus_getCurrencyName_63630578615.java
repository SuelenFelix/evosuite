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

public class AirdropStatus_getCurrencyName_63630578615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136750;

    public AirdropStatus_getCurrencyName_63630578615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term136754 = new Long(146749226579788091L);
        Class<? extends Object> term137013 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term137012 = ((Class) term137013).getDeclaredField((String) "SENDING");
        ((Field) term137012).setAccessible(true);
        Object enum257 = ((Field) term137012).get((Object) null);
        Object term136753 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term136753, term136753.getClass(), "id", term136754);
        setField(term136753, term136753.getClass(), "responseCode", "");
        setField(term136753, term136753.getClass(), "reason", "");
        setField(term136753, term136753.getClass(), "classicAddress", "");
        setField(term136753, term136753.getClass(), "status", enum257);
        setField(term136753, term136753.getClass(), "paymentAmount", "");
        setField(term136753, term136753.getClass(), "snapshotBalance", "");
        setField(term136753, term136753.getClass(), "nftOwned", "");
        ArrayList term136751 = new ArrayList();
        ((ArrayList) term136751).add(term136753);
        Long term136766 = new Long(-1279670138064751276L);
        Class<? extends Object> term137436 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term137435 = ((Class) term137436).getDeclaredField((String) "ANNUALLY");
        ((Field) term137435).setAccessible(true);
        Object enum258 = ((Field) term137435).get((Object) null);
        Class<? extends Object> term137832 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term137831 = ((Class) term137832).getDeclaredField((String) "PENDING_REVIEW");
        ((Field) term137831).setAccessible(true);
        Object enum259 = ((Field) term137831).get((Object) null);
        Integer term136868 = new Integer(-268815336);
        Class<? extends Object> term138316 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term138315 = ((Class) term138316).getDeclaredField((String) "GLOBALID");
        ((Field) term138315).setAccessible(true);
        Object enum260 = ((Field) term138315).get((Object) null);
        Long term136918 = new Long(-7205236974351118210L);
        Long term136932 = new Long(-2136893352275781569L);
        Class<? extends Object> term138727 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term138726 = ((Class) term138727).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term138726).setAccessible(true);
        Object enum261 = ((Field) term138726).get((Object) null);
        Class<? extends Object> term139165 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term139164 = ((Class) term139165).getDeclaredField((String) "REJECTED");
        ((Field) term139164).setAccessible(true);
        Object enum262 = ((Field) term139164).get((Object) null);
        Long term137010 = new Long(-9147545274054597570L);
        term136750 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term136768 = newInstance(Class.forName("java.util.Date"));
        Object term136770 = newInstance(Class.forName("java.util.Date"));
        Object term136772 = newInstance(Class.forName("java.util.Date"));
        Object term136774 = newInstance(Class.forName("java.util.Date"));
        setField(term136750, term136750.getClass(), "results", term136751);
        setField(term136750, term136750.getClass(), "id", term136766);
        setLongField(term136768, term136768.getClass(), "fastTime", 1288596730763L);
        setField(term136768, term136768.getClass(), "cdate", null);
        setField(term136750, term136750.getClass(), "createDate", term136768);
        setLongField(term136770, term136770.getClass(), "fastTime", 1842237600959L);
        setField(term136770, term136770.getClass(), "cdate", null);
        setField(term136750, term136750.getClass(), "updateDate", term136770);
        setLongField(term136772, term136772.getClass(), "fastTime", 1770196770908L);
        setField(term136772, term136772.getClass(), "cdate", null);
        setField(term136750, term136750.getClass(), "startTime", term136772);
        setLongField(term136774, term136774.getClass(), "fastTime", 1367935077317L);
        setField(term136774, term136774.getClass(), "cdate", null);
        setField(term136750, term136750.getClass(), "repeatUntilDate", term136774);
        setField(term136750, term136750.getClass(), "frequency", enum258);
        setField(term136750, term136750.getClass(), "status", enum259);
        setField(term136750, term136750.getClass(), "fromClassicAddress", "CDpvEYMuDg");
        setField(term136750, term136750.getClass(), "trustlineIssuerClassicAddress", "YaZCAiIUPe");
        setField(term136750, term136750.getClass(), "currencyName", "KsCWHUcJDd");
        setField(term136750, term136750.getClass(), "currencyNameForProcess", "zkYsnzzwJu");
        setField(term136750, term136750.getClass(), "amount", "hxHKgOYyQD");
        setBooleanField(term136750, term136750.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term136750, term136750.getClass(), "useBlacklist", true);
        setField(term136750, term136750.getClass(), "maximumTrustlines", term136868);
        setField(term136750, term136750.getClass(), "dropType", enum260);
        setField(term136750, term136750.getClass(), "failReason", "opEyNuSzgs");
        setField(term136750, term136750.getClass(), "minBalance", "YTnlgdIqfA");
        setField(term136750, term136750.getClass(), "maxBalance", "gcKmFclftu");
        setField(term136750, term136750.getClass(), "totalBlacklisted", term136918);
        setField(term136750, term136750.getClass(), "maxXrpFeePerTransaction", "lfREOBPEuD");
        setField(term136750, term136750.getClass(), "totalRecipients", term136932);
        setField(term136750, term136750.getClass(), "paymentType", enum261);
        setField(term136750, term136750.getClass(), "snapshotTrustlineIssuerClassicAddress", "JAGjDlTwTa");
        setField(term136750, term136750.getClass(), "snapshotCurrencyName", "wIDeyLnekQ");
        setField(term136750, term136750.getClass(), "nftIssuingAddress", "tOGPTIqSMm");
        setField(term136750, term136750.getClass(), "nftTaxon", "cFwZnaLmLP");
        setField(term136750, term136750.getClass(), "scheduleStatus", enum262);
        setField(term136750, term136750.getClass(), "fromScheduleId", term137010);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrencyName", argTypes, term136750, args);
    }

};


