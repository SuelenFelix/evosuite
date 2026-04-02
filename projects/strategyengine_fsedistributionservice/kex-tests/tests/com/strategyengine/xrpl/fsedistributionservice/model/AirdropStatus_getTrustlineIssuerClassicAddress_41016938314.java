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

public class AirdropStatus_getTrustlineIssuerClassicAddress_41016938314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133068;

    public AirdropStatus_getTrustlineIssuerClassicAddress_41016938314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term133072 = new Long(6465987664600701876L);
        Class<? extends Object> term133362 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term133361 = ((Class) term133362).getDeclaredField((String) "VERIFIED");
        ((Field) term133361).setAccessible(true);
        Object enum249 = ((Field) term133361).get((Object) null);
        Object term133071 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term133071, term133071.getClass(), "id", term133072);
        setField(term133071, term133071.getClass(), "responseCode", "");
        setField(term133071, term133071.getClass(), "reason", "");
        setField(term133071, term133071.getClass(), "classicAddress", "");
        setField(term133071, term133071.getClass(), "status", enum249);
        setField(term133071, term133071.getClass(), "paymentAmount", "");
        setField(term133071, term133071.getClass(), "snapshotBalance", "");
        setField(term133071, term133071.getClass(), "nftOwned", "");
        Long term133083 = new Long(-136372844051852955L);
        Class<? extends Object> term133788 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term133787 = ((Class) term133788).getDeclaredField((String) "FAILED");
        ((Field) term133787).setAccessible(true);
        Object enum250 = ((Field) term133787).get((Object) null);
        Object term133082 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term133082, term133082.getClass(), "id", term133083);
        setField(term133082, term133082.getClass(), "responseCode", "");
        setField(term133082, term133082.getClass(), "reason", "");
        setField(term133082, term133082.getClass(), "classicAddress", "");
        setField(term133082, term133082.getClass(), "status", enum250);
        setField(term133082, term133082.getClass(), "paymentAmount", "");
        setField(term133082, term133082.getClass(), "snapshotBalance", "");
        setField(term133082, term133082.getClass(), "nftOwned", "");
        Long term133094 = new Long(-7632759764262745126L);
        Class<? extends Object> term134208 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term134207 = ((Class) term134208).getDeclaredField((String) "QUEUED");
        ((Field) term134207).setAccessible(true);
        Object enum251 = ((Field) term134207).get((Object) null);
        Object term133093 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term133093, term133093.getClass(), "id", term133094);
        setField(term133093, term133093.getClass(), "responseCode", "");
        setField(term133093, term133093.getClass(), "reason", "");
        setField(term133093, term133093.getClass(), "classicAddress", "");
        setField(term133093, term133093.getClass(), "status", enum251);
        setField(term133093, term133093.getClass(), "paymentAmount", "");
        setField(term133093, term133093.getClass(), "snapshotBalance", "");
        setField(term133093, term133093.getClass(), "nftOwned", "");
        Long term133105 = new Long(3746481521207337771L);
        Object term133104 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term133104, term133104.getClass(), "id", term133105);
        setField(term133104, term133104.getClass(), "responseCode", "");
        setField(term133104, term133104.getClass(), "reason", "");
        setField(term133104, term133104.getClass(), "classicAddress", "");
        setField(term133104, term133104.getClass(), "status", enum249);
        setField(term133104, term133104.getClass(), "paymentAmount", "");
        setField(term133104, term133104.getClass(), "snapshotBalance", "");
        setField(term133104, term133104.getClass(), "nftOwned", "");
        Long term133114 = new Long(4341016500855678917L);
        Object term133113 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term133113, term133113.getClass(), "id", term133114);
        setField(term133113, term133113.getClass(), "responseCode", "");
        setField(term133113, term133113.getClass(), "reason", "");
        setField(term133113, term133113.getClass(), "classicAddress", "");
        setField(term133113, term133113.getClass(), "status", enum250);
        setField(term133113, term133113.getClass(), "paymentAmount", "");
        setField(term133113, term133113.getClass(), "snapshotBalance", "");
        setField(term133113, term133113.getClass(), "nftOwned", "");
        ArrayList term133069 = new ArrayList();
        ((ArrayList) term133069).add(term133071);
        ((ArrayList) term133069).add(term133082);
        ((ArrayList) term133069).add(term133093);
        ((ArrayList) term133069).add(term133104);
        ((ArrayList) term133069).add(term133113);
        Long term133124 = new Long(-5871746020807491998L);
        Class<? extends Object> term134628 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term134627 = ((Class) term134628).getDeclaredField((String) "WEEKLY");
        ((Field) term134627).setAccessible(true);
        Object enum252 = ((Field) term134627).get((Object) null);
        Class<? extends Object> term135018 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term135017 = ((Class) term135018).getDeclaredField((String) "REJECTED");
        ((Field) term135017).setAccessible(true);
        Object enum253 = ((Field) term135017).get((Object) null);
        Integer term133218 = new Integer(1596213415);
        Class<? extends Object> term135484 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term135483 = ((Class) term135484).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term135483).setAccessible(true);
        Object enum254 = ((Field) term135483).get((Object) null);
        Long term133277 = new Long(4742108233936970770L);
        Long term133291 = new Long(2722004046017350471L);
        Class<? extends Object> term135922 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term135921 = ((Class) term135922).getDeclaredField((String) "FLAT");
        ((Field) term135921).setAccessible(true);
        Object enum255 = ((Field) term135921).get((Object) null);
        Class<? extends Object> term136336 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term136335 = ((Class) term136336).getDeclaredField((String) "ACTIVE");
        ((Field) term136335).setAccessible(true);
        Object enum256 = ((Field) term136335).get((Object) null);
        Long term133359 = new Long(6636235983121346803L);
        term133068 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term133126 = newInstance(Class.forName("java.util.Date"));
        Object term133128 = newInstance(Class.forName("java.util.Date"));
        Object term133130 = newInstance(Class.forName("java.util.Date"));
        Object term133132 = newInstance(Class.forName("java.util.Date"));
        setField(term133068, term133068.getClass(), "results", term133069);
        setField(term133068, term133068.getClass(), "id", term133124);
        setLongField(term133126, term133126.getClass(), "fastTime", 1667317804114L);
        setField(term133126, term133126.getClass(), "cdate", null);
        setField(term133068, term133068.getClass(), "createDate", term133126);
        setLongField(term133128, term133128.getClass(), "fastTime", 1643824174710L);
        setField(term133128, term133128.getClass(), "cdate", null);
        setField(term133068, term133068.getClass(), "updateDate", term133128);
        setLongField(term133130, term133130.getClass(), "fastTime", 1589287310419L);
        setField(term133130, term133130.getClass(), "cdate", null);
        setField(term133068, term133068.getClass(), "startTime", term133130);
        setLongField(term133132, term133132.getClass(), "fastTime", 1689828992084L);
        setField(term133132, term133132.getClass(), "cdate", null);
        setField(term133068, term133068.getClass(), "repeatUntilDate", term133132);
        setField(term133068, term133068.getClass(), "frequency", enum252);
        setField(term133068, term133068.getClass(), "status", enum253);
        setField(term133068, term133068.getClass(), "fromClassicAddress", "vNvzjymLXH");
        setField(term133068, term133068.getClass(), "trustlineIssuerClassicAddress", "TCadyfXzAm");
        setField(term133068, term133068.getClass(), "currencyName", "rSSEpZFUMc");
        setField(term133068, term133068.getClass(), "currencyNameForProcess", "DJHwHjvNlc");
        setField(term133068, term133068.getClass(), "amount", "ZSBzHqaLtQ");
        setBooleanField(term133068, term133068.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term133068, term133068.getClass(), "useBlacklist", true);
        setField(term133068, term133068.getClass(), "maximumTrustlines", term133218);
        setField(term133068, term133068.getClass(), "dropType", enum254);
        setField(term133068, term133068.getClass(), "failReason", "DCRuiaVwNa");
        setField(term133068, term133068.getClass(), "minBalance", "VTjvZBqRUX");
        setField(term133068, term133068.getClass(), "maxBalance", "vhjxsMJjOh");
        setField(term133068, term133068.getClass(), "totalBlacklisted", term133277);
        setField(term133068, term133068.getClass(), "maxXrpFeePerTransaction", "gKgsqLPDCs");
        setField(term133068, term133068.getClass(), "totalRecipients", term133291);
        setField(term133068, term133068.getClass(), "paymentType", enum255);
        setField(term133068, term133068.getClass(), "snapshotTrustlineIssuerClassicAddress", "crZAQIKgDI");
        setField(term133068, term133068.getClass(), "snapshotCurrencyName", "uDAdogNiBQ");
        setField(term133068, term133068.getClass(), "nftIssuingAddress", "GnPrxkKUmR");
        setField(term133068, term133068.getClass(), "nftTaxon", "gVgLmqgxMh");
        setField(term133068, term133068.getClass(), "scheduleStatus", enum256);
        setField(term133068, term133068.getClass(), "fromScheduleId", term133359);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTrustlineIssuerClassicAddress", argTypes, term133068, args);
    }

};


