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

public class AirdropStatus_isNewTrustlinesOnly_150211746018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147076;

    public AirdropStatus_isNewTrustlinesOnly_150211746018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term147080 = new Long(-7005300544167632229L);
        Class<? extends Object> term147395 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term147394 = ((Class) term147395).getDeclaredField((String) "VERIFIED");
        ((Field) term147394).setAccessible(true);
        Object enum279 = ((Field) term147394).get((Object) null);
        Object term147079 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term147079, term147079.getClass(), "id", term147080);
        setField(term147079, term147079.getClass(), "responseCode", "");
        setField(term147079, term147079.getClass(), "reason", "");
        setField(term147079, term147079.getClass(), "classicAddress", "");
        setField(term147079, term147079.getClass(), "status", enum279);
        setField(term147079, term147079.getClass(), "paymentAmount", "");
        setField(term147079, term147079.getClass(), "snapshotBalance", "");
        setField(term147079, term147079.getClass(), "nftOwned", "");
        Long term147091 = new Long(-278716491237139968L);
        Class<? extends Object> term147821 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term147820 = ((Class) term147821).getDeclaredField((String) "FAILED");
        ((Field) term147820).setAccessible(true);
        Object enum280 = ((Field) term147820).get((Object) null);
        Object term147090 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term147090, term147090.getClass(), "id", term147091);
        setField(term147090, term147090.getClass(), "responseCode", "");
        setField(term147090, term147090.getClass(), "reason", "");
        setField(term147090, term147090.getClass(), "classicAddress", "");
        setField(term147090, term147090.getClass(), "status", enum280);
        setField(term147090, term147090.getClass(), "paymentAmount", "");
        setField(term147090, term147090.getClass(), "snapshotBalance", "");
        setField(term147090, term147090.getClass(), "nftOwned", "");
        Long term147102 = new Long(-629491722907628764L);
        Class<? extends Object> term148241 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term148240 = ((Class) term148241).getDeclaredField((String) "SENDING");
        ((Field) term148240).setAccessible(true);
        Object enum281 = ((Field) term148240).get((Object) null);
        Object term147101 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term147101, term147101.getClass(), "id", term147102);
        setField(term147101, term147101.getClass(), "responseCode", "");
        setField(term147101, term147101.getClass(), "reason", "");
        setField(term147101, term147101.getClass(), "classicAddress", "");
        setField(term147101, term147101.getClass(), "status", enum281);
        setField(term147101, term147101.getClass(), "paymentAmount", "");
        setField(term147101, term147101.getClass(), "snapshotBalance", "");
        setField(term147101, term147101.getClass(), "nftOwned", "");
        Long term147113 = new Long(-5552123402871285352L);
        Object term147112 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term147112, term147112.getClass(), "id", term147113);
        setField(term147112, term147112.getClass(), "responseCode", "");
        setField(term147112, term147112.getClass(), "reason", "");
        setField(term147112, term147112.getClass(), "classicAddress", "");
        setField(term147112, term147112.getClass(), "status", enum281);
        setField(term147112, term147112.getClass(), "paymentAmount", "");
        setField(term147112, term147112.getClass(), "snapshotBalance", "");
        setField(term147112, term147112.getClass(), "nftOwned", "");
        Long term147122 = new Long(-5587528177305224828L);
        Object term147121 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term147121, term147121.getClass(), "id", term147122);
        setField(term147121, term147121.getClass(), "responseCode", "");
        setField(term147121, term147121.getClass(), "reason", "");
        setField(term147121, term147121.getClass(), "classicAddress", "");
        setField(term147121, term147121.getClass(), "status", enum280);
        setField(term147121, term147121.getClass(), "paymentAmount", "");
        setField(term147121, term147121.getClass(), "snapshotBalance", "");
        setField(term147121, term147121.getClass(), "nftOwned", "");
        ArrayList term147077 = new ArrayList();
        ((ArrayList) term147077).add(term147079);
        ((ArrayList) term147077).add(term147090);
        ((ArrayList) term147077).add(term147101);
        ((ArrayList) term147077).add(term147112);
        ((ArrayList) term147077).add(term147121);
        Long term147132 = new Long(7950532649535587877L);
        Class<? extends Object> term148664 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term148663 = ((Class) term148664).getDeclaredField((String) "ANNUALLY");
        ((Field) term148663).setAccessible(true);
        Object enum282 = ((Field) term148663).get((Object) null);
        Class<? extends Object> term149060 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term149059 = ((Class) term149060).getDeclaredField((String) "PENDING_REVIEW");
        ((Field) term149059).setAccessible(true);
        Object enum283 = ((Field) term149059).get((Object) null);
        Integer term147234 = new Integer(339854490);
        Class<? extends Object> term149544 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term149543 = ((Class) term149544).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term149543).setAccessible(true);
        Object enum284 = ((Field) term149543).get((Object) null);
        Long term147302 = new Long(7799452759993694308L);
        Long term147316 = new Long(-1571034605670661708L);
        Class<? extends Object> term150009 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term150008 = ((Class) term150009).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term150008).setAccessible(true);
        Object enum285 = ((Field) term150008).get((Object) null);
        Class<? extends Object> term150447 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term150446 = ((Class) term150447).getDeclaredField((String) "ACTIVE");
        ((Field) term150446).setAccessible(true);
        Object enum286 = ((Field) term150446).get((Object) null);
        Long term147392 = new Long(-7983954942068142191L);
        term147076 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term147134 = newInstance(Class.forName("java.util.Date"));
        Object term147136 = newInstance(Class.forName("java.util.Date"));
        Object term147138 = newInstance(Class.forName("java.util.Date"));
        Object term147140 = newInstance(Class.forName("java.util.Date"));
        setField(term147076, term147076.getClass(), "results", term147077);
        setField(term147076, term147076.getClass(), "id", term147132);
        setLongField(term147134, term147134.getClass(), "fastTime", 1444328743068L);
        setField(term147134, term147134.getClass(), "cdate", null);
        setField(term147076, term147076.getClass(), "createDate", term147134);
        setLongField(term147136, term147136.getClass(), "fastTime", 1483547400964L);
        setField(term147136, term147136.getClass(), "cdate", null);
        setField(term147076, term147076.getClass(), "updateDate", term147136);
        setLongField(term147138, term147138.getClass(), "fastTime", 1888800832212L);
        setField(term147138, term147138.getClass(), "cdate", null);
        setField(term147076, term147076.getClass(), "startTime", term147138);
        setLongField(term147140, term147140.getClass(), "fastTime", 1632313305411L);
        setField(term147140, term147140.getClass(), "cdate", null);
        setField(term147076, term147076.getClass(), "repeatUntilDate", term147140);
        setField(term147076, term147076.getClass(), "frequency", enum282);
        setField(term147076, term147076.getClass(), "status", enum283);
        setField(term147076, term147076.getClass(), "fromClassicAddress", "DCSMbuGiaM");
        setField(term147076, term147076.getClass(), "trustlineIssuerClassicAddress", "wtOVzMPrFU");
        setField(term147076, term147076.getClass(), "currencyName", "CBnamgJrJS");
        setField(term147076, term147076.getClass(), "currencyNameForProcess", "uJhRRqAnDP");
        setField(term147076, term147076.getClass(), "amount", "hJCqADrhuV");
        setBooleanField(term147076, term147076.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term147076, term147076.getClass(), "useBlacklist", false);
        setField(term147076, term147076.getClass(), "maximumTrustlines", term147234);
        setField(term147076, term147076.getClass(), "dropType", enum284);
        setField(term147076, term147076.getClass(), "failReason", "RyPUBlRpNZ");
        setField(term147076, term147076.getClass(), "minBalance", "ardfVpCueq");
        setField(term147076, term147076.getClass(), "maxBalance", "wEYAmGJIEF");
        setField(term147076, term147076.getClass(), "totalBlacklisted", term147302);
        setField(term147076, term147076.getClass(), "maxXrpFeePerTransaction", "iXEhfXJomO");
        setField(term147076, term147076.getClass(), "totalRecipients", term147316);
        setField(term147076, term147076.getClass(), "paymentType", enum285);
        setField(term147076, term147076.getClass(), "snapshotTrustlineIssuerClassicAddress", "KEoUMzNdMA");
        setField(term147076, term147076.getClass(), "snapshotCurrencyName", "SOsGYAgpgW");
        setField(term147076, term147076.getClass(), "nftIssuingAddress", "ZBafuLDRDM");
        setField(term147076, term147076.getClass(), "nftTaxon", "VDnsNuhEvG");
        setField(term147076, term147076.getClass(), "scheduleStatus", enum286);
        setField(term147076, term147076.getClass(), "fromScheduleId", term147392);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isNewTrustlinesOnly", argTypes, term147076, args);
    }

};


