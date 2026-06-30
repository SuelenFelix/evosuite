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

public class AirdropStatus_setSnapshotCurrencyName_97070546262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295611;

    public AirdropStatus_setSnapshotCurrencyName_97070546262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term295615 = new Long(-192072503176550129L);
        Class<? extends Object> term295920 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term295919 = ((Class) term295920).getDeclaredField((String) "SENDING");
        ((Field) term295919).setAccessible(true);
        Object enum597 = ((Field) term295919).get((Object) null);
        Object term295614 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term295614, term295614.getClass(), "id", term295615);
        setField(term295614, term295614.getClass(), "responseCode", "");
        setField(term295614, term295614.getClass(), "reason", "");
        setField(term295614, term295614.getClass(), "classicAddress", "");
        setField(term295614, term295614.getClass(), "status", enum597);
        setField(term295614, term295614.getClass(), "paymentAmount", "");
        setField(term295614, term295614.getClass(), "snapshotBalance", "");
        setField(term295614, term295614.getClass(), "nftOwned", "");
        Long term295626 = new Long(-4726601557653351735L);
        Class<? extends Object> term296343 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term296342 = ((Class) term296343).getDeclaredField((String) "SENDING");
        ((Field) term296342).setAccessible(true);
        Object enum598 = ((Field) term296342).get((Object) null);
        Object term295625 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term295625, term295625.getClass(), "id", term295626);
        setField(term295625, term295625.getClass(), "responseCode", "");
        setField(term295625, term295625.getClass(), "reason", "");
        setField(term295625, term295625.getClass(), "classicAddress", "");
        setField(term295625, term295625.getClass(), "status", enum598);
        setField(term295625, term295625.getClass(), "paymentAmount", "");
        setField(term295625, term295625.getClass(), "snapshotBalance", "");
        setField(term295625, term295625.getClass(), "nftOwned", "");
        Long term295637 = new Long(-3502423991725415780L);
        Object term295636 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term295636, term295636.getClass(), "id", term295637);
        setField(term295636, term295636.getClass(), "responseCode", "");
        setField(term295636, term295636.getClass(), "reason", "");
        setField(term295636, term295636.getClass(), "classicAddress", "");
        setField(term295636, term295636.getClass(), "status", enum598);
        setField(term295636, term295636.getClass(), "paymentAmount", "");
        setField(term295636, term295636.getClass(), "snapshotBalance", "");
        setField(term295636, term295636.getClass(), "nftOwned", "");
        Long term295646 = new Long(7717843551775677202L);
        Object term295645 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term295645, term295645.getClass(), "id", term295646);
        setField(term295645, term295645.getClass(), "responseCode", "");
        setField(term295645, term295645.getClass(), "reason", "");
        setField(term295645, term295645.getClass(), "classicAddress", "");
        setField(term295645, term295645.getClass(), "status", enum598);
        setField(term295645, term295645.getClass(), "paymentAmount", "");
        setField(term295645, term295645.getClass(), "snapshotBalance", "");
        setField(term295645, term295645.getClass(), "nftOwned", "");
        Long term295655 = new Long(2823262561274956150L);
        Object term295654 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term295654, term295654.getClass(), "id", term295655);
        setField(term295654, term295654.getClass(), "responseCode", "");
        setField(term295654, term295654.getClass(), "reason", "");
        setField(term295654, term295654.getClass(), "classicAddress", "");
        setField(term295654, term295654.getClass(), "status", enum598);
        setField(term295654, term295654.getClass(), "paymentAmount", "");
        setField(term295654, term295654.getClass(), "snapshotBalance", "");
        setField(term295654, term295654.getClass(), "nftOwned", "");
        ArrayList term295612 = new ArrayList();
        ((ArrayList) term295612).add(term295614);
        ((ArrayList) term295612).add(term295625);
        ((ArrayList) term295612).add(term295636);
        ((ArrayList) term295612).add(term295645);
        ((ArrayList) term295612).add(term295654);
        Long term295665 = new Long(8039153062846287600L);
        Class<? extends Object> term296766 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term296765 = ((Class) term296766).getDeclaredField((String) "ANNUALLY");
        ((Field) term296765).setAccessible(true);
        Object enum599 = ((Field) term296765).get((Object) null);
        Class<? extends Object> term297162 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term297161 = ((Class) term297162).getDeclaredField((String) "SCHEDULED");
        ((Field) term297161).setAccessible(true);
        Object enum600 = ((Field) term297161).get((Object) null);
        Integer term295762 = new Integer(98922530);
        Class<? extends Object> term297631 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term297630 = ((Class) term297631).getDeclaredField((String) "TRUSTLINE");
        ((Field) term297630).setAccessible(true);
        Object enum601 = ((Field) term297630).get((Object) null);
        Long term295813 = new Long(-7087265016767824631L);
        Long term295827 = new Long(-8121348431673567857L);
        Class<? extends Object> term298045 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term298044 = ((Class) term298045).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term298044).setAccessible(true);
        Object enum602 = ((Field) term298044).get((Object) null);
        Class<? extends Object> term298483 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term298482 = ((Class) term298483).getDeclaredField((String) "COMPLETE");
        ((Field) term298482).setAccessible(true);
        Object enum603 = ((Field) term298482).get((Object) null);
        Long term295905 = new Long(7594342965038171122L);
        term295611 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term295667 = newInstance(Class.forName("java.util.Date"));
        Object term295669 = newInstance(Class.forName("java.util.Date"));
        Object term295671 = newInstance(Class.forName("java.util.Date"));
        Object term295673 = newInstance(Class.forName("java.util.Date"));
        setField(term295611, term295611.getClass(), "results", term295612);
        setField(term295611, term295611.getClass(), "id", term295665);
        setLongField(term295667, term295667.getClass(), "fastTime", 1881323766574L);
        setField(term295667, term295667.getClass(), "cdate", null);
        setField(term295611, term295611.getClass(), "createDate", term295667);
        setLongField(term295669, term295669.getClass(), "fastTime", 1689304894254L);
        setField(term295669, term295669.getClass(), "cdate", null);
        setField(term295611, term295611.getClass(), "updateDate", term295669);
        setLongField(term295671, term295671.getClass(), "fastTime", 1315360243001L);
        setField(term295671, term295671.getClass(), "cdate", null);
        setField(term295611, term295611.getClass(), "startTime", term295671);
        setLongField(term295673, term295673.getClass(), "fastTime", 1417332081038L);
        setField(term295673, term295673.getClass(), "cdate", null);
        setField(term295611, term295611.getClass(), "repeatUntilDate", term295673);
        setField(term295611, term295611.getClass(), "frequency", enum599);
        setField(term295611, term295611.getClass(), "status", enum600);
        setField(term295611, term295611.getClass(), "fromClassicAddress", "ZaTowywgws");
        setField(term295611, term295611.getClass(), "trustlineIssuerClassicAddress", "XPrRiBUedX");
        setField(term295611, term295611.getClass(), "currencyName", "kultXgiMsw");
        setField(term295611, term295611.getClass(), "currencyNameForProcess", "invWIgTrSn");
        setField(term295611, term295611.getClass(), "amount", "tdDWYXQBpB");
        setBooleanField(term295611, term295611.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term295611, term295611.getClass(), "useBlacklist", true);
        setField(term295611, term295611.getClass(), "maximumTrustlines", term295762);
        setField(term295611, term295611.getClass(), "dropType", enum601);
        setField(term295611, term295611.getClass(), "failReason", "yLbSZvdjZX");
        setField(term295611, term295611.getClass(), "minBalance", "FhCGxrukXm");
        setField(term295611, term295611.getClass(), "maxBalance", "KAmjFnlvKU");
        setField(term295611, term295611.getClass(), "totalBlacklisted", term295813);
        setField(term295611, term295611.getClass(), "maxXrpFeePerTransaction", "VKpNTpPbui");
        setField(term295611, term295611.getClass(), "totalRecipients", term295827);
        setField(term295611, term295611.getClass(), "paymentType", enum602);
        setField(term295611, term295611.getClass(), "snapshotTrustlineIssuerClassicAddress", "TuzuoEoycc");
        setField(term295611, term295611.getClass(), "snapshotCurrencyName", "LXWldHIZNy");
        setField(term295611, term295611.getClass(), "nftIssuingAddress", "BATrPAXgpa");
        setField(term295611, term295611.getClass(), "nftTaxon", "vgwMeHgaql");
        setField(term295611, term295611.getClass(), "scheduleStatus", enum603);
        setField(term295611, term295611.getClass(), "fromScheduleId", term295905);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "apRNMfAeJs";
        callMethod(klass, "setSnapshotCurrencyName", argTypes, term295611, args);
    }

};


