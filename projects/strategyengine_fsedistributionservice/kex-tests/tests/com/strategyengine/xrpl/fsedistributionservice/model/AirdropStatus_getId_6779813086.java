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

public class AirdropStatus_getId_6779813086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104709;

    public AirdropStatus_getId_6779813086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term104713 = new Long(918397384129253729L);
        Class<? extends Object> term104987 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term104986 = ((Class) term104987).getDeclaredField((String) "FAILED");
        ((Field) term104986).setAccessible(true);
        Object enum188 = ((Field) term104986).get((Object) null);
        Object term104712 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term104712, term104712.getClass(), "id", term104713);
        setField(term104712, term104712.getClass(), "responseCode", "");
        setField(term104712, term104712.getClass(), "reason", "");
        setField(term104712, term104712.getClass(), "classicAddress", "");
        setField(term104712, term104712.getClass(), "status", enum188);
        setField(term104712, term104712.getClass(), "paymentAmount", "");
        setField(term104712, term104712.getClass(), "snapshotBalance", "");
        setField(term104712, term104712.getClass(), "nftOwned", "");
        Long term104724 = new Long(-2187638136407967948L);
        Class<? extends Object> term105407 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term105406 = ((Class) term105407).getDeclaredField((String) "SENDING");
        ((Field) term105406).setAccessible(true);
        Object enum189 = ((Field) term105406).get((Object) null);
        Object term104723 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term104723, term104723.getClass(), "id", term104724);
        setField(term104723, term104723.getClass(), "responseCode", "");
        setField(term104723, term104723.getClass(), "reason", "");
        setField(term104723, term104723.getClass(), "classicAddress", "");
        setField(term104723, term104723.getClass(), "status", enum189);
        setField(term104723, term104723.getClass(), "paymentAmount", "");
        setField(term104723, term104723.getClass(), "snapshotBalance", "");
        setField(term104723, term104723.getClass(), "nftOwned", "");
        ArrayList term104710 = new ArrayList();
        ((ArrayList) term104710).add(term104712);
        ((ArrayList) term104710).add(term104723);
        Long term104736 = new Long(8708846223293804408L);
        Class<? extends Object> term105830 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term105829 = ((Class) term105830).getDeclaredField((String) "DAILY");
        ((Field) term105829).setAccessible(true);
        Object enum190 = ((Field) term105829).get((Object) null);
        Class<? extends Object> term106217 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term106216 = ((Class) term106217).getDeclaredField((String) "POPULATING_ADDRESSES");
        ((Field) term106216).setAccessible(true);
        Object enum191 = ((Field) term106216).get((Object) null);
        Integer term104841 = new Integer(444029505);
        Class<? extends Object> term106719 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term106718 = ((Class) term106719).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term106718).setAccessible(true);
        Object enum192 = ((Field) term106718).get((Object) null);
        Long term104900 = new Long(-2986201902216133814L);
        Long term104914 = new Long(4255811647459029682L);
        Class<? extends Object> term107157 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term107156 = ((Class) term107157).getDeclaredField((String) "FLAT");
        ((Field) term107156).setAccessible(true);
        Object enum193 = ((Field) term107156).get((Object) null);
        Class<? extends Object> term107571 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term107570 = ((Class) term107571).getDeclaredField((String) "COMPLETE");
        ((Field) term107570).setAccessible(true);
        Object enum194 = ((Field) term107570).get((Object) null);
        Long term104984 = new Long(8000844860910174690L);
        term104709 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term104738 = newInstance(Class.forName("java.util.Date"));
        Object term104740 = newInstance(Class.forName("java.util.Date"));
        Object term104742 = newInstance(Class.forName("java.util.Date"));
        Object term104744 = newInstance(Class.forName("java.util.Date"));
        setField(term104709, term104709.getClass(), "results", term104710);
        setField(term104709, term104709.getClass(), "id", term104736);
        setLongField(term104738, term104738.getClass(), "fastTime", 1472059591281L);
        setField(term104738, term104738.getClass(), "cdate", null);
        setField(term104709, term104709.getClass(), "createDate", term104738);
        setLongField(term104740, term104740.getClass(), "fastTime", 1379465144272L);
        setField(term104740, term104740.getClass(), "cdate", null);
        setField(term104709, term104709.getClass(), "updateDate", term104740);
        setLongField(term104742, term104742.getClass(), "fastTime", 1873152234138L);
        setField(term104742, term104742.getClass(), "cdate", null);
        setField(term104709, term104709.getClass(), "startTime", term104742);
        setLongField(term104744, term104744.getClass(), "fastTime", 1469019341287L);
        setField(term104744, term104744.getClass(), "cdate", null);
        setField(term104709, term104709.getClass(), "repeatUntilDate", term104744);
        setField(term104709, term104709.getClass(), "frequency", enum190);
        setField(term104709, term104709.getClass(), "status", enum191);
        setField(term104709, term104709.getClass(), "fromClassicAddress", "TnUXNtKOns");
        setField(term104709, term104709.getClass(), "trustlineIssuerClassicAddress", "umsYdaPflb");
        setField(term104709, term104709.getClass(), "currencyName", "CnNmpSyiBE");
        setField(term104709, term104709.getClass(), "currencyNameForProcess", "JvKKIGdUWh");
        setField(term104709, term104709.getClass(), "amount", "DInvDrzBtt");
        setBooleanField(term104709, term104709.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term104709, term104709.getClass(), "useBlacklist", true);
        setField(term104709, term104709.getClass(), "maximumTrustlines", term104841);
        setField(term104709, term104709.getClass(), "dropType", enum192);
        setField(term104709, term104709.getClass(), "failReason", "igZJubDPuK");
        setField(term104709, term104709.getClass(), "minBalance", "qxBdFhLbAN");
        setField(term104709, term104709.getClass(), "maxBalance", "KyUmXHRrED");
        setField(term104709, term104709.getClass(), "totalBlacklisted", term104900);
        setField(term104709, term104709.getClass(), "maxXrpFeePerTransaction", "eOMBFVrNcf");
        setField(term104709, term104709.getClass(), "totalRecipients", term104914);
        setField(term104709, term104709.getClass(), "paymentType", enum193);
        setField(term104709, term104709.getClass(), "snapshotTrustlineIssuerClassicAddress", "gOwOIsocMB");
        setField(term104709, term104709.getClass(), "snapshotCurrencyName", "GqTBOhQBgV");
        setField(term104709, term104709.getClass(), "nftIssuingAddress", "DQhxOWqEyi");
        setField(term104709, term104709.getClass(), "nftTaxon", "dSszYGDwAk");
        setField(term104709, term104709.getClass(), "scheduleStatus", enum194);
        setField(term104709, term104709.getClass(), "fromScheduleId", term104984);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term104709, args);
    }

};


