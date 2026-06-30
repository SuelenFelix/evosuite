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

public class AirdropStatus_getNftIssuingAddress_70853943631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191432;

    public AirdropStatus_getNftIssuingAddress_70853943631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term191436 = new Long(4115148503664117517L);
        Class<? extends Object> term191724 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term191723 = ((Class) term191724).getDeclaredField((String) "VERIFIED");
        ((Field) term191723).setAccessible(true);
        Object enum374 = ((Field) term191723).get((Object) null);
        Object term191435 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term191435, term191435.getClass(), "id", term191436);
        setField(term191435, term191435.getClass(), "responseCode", "");
        setField(term191435, term191435.getClass(), "reason", "");
        setField(term191435, term191435.getClass(), "classicAddress", "");
        setField(term191435, term191435.getClass(), "status", enum374);
        setField(term191435, term191435.getClass(), "paymentAmount", "");
        setField(term191435, term191435.getClass(), "snapshotBalance", "");
        setField(term191435, term191435.getClass(), "nftOwned", "");
        Long term191447 = new Long(8527367353497875781L);
        Object term191446 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term191446, term191446.getClass(), "id", term191447);
        setField(term191446, term191446.getClass(), "responseCode", "");
        setField(term191446, term191446.getClass(), "reason", "");
        setField(term191446, term191446.getClass(), "classicAddress", "");
        setField(term191446, term191446.getClass(), "status", enum374);
        setField(term191446, term191446.getClass(), "paymentAmount", "");
        setField(term191446, term191446.getClass(), "snapshotBalance", "");
        setField(term191446, term191446.getClass(), "nftOwned", "");
        Long term191456 = new Long(-6489405551733780896L);
        Class<? extends Object> term192150 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term192149 = ((Class) term192150).getDeclaredField((String) "FAILED");
        ((Field) term192149).setAccessible(true);
        Object enum375 = ((Field) term192149).get((Object) null);
        Object term191455 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term191455, term191455.getClass(), "id", term191456);
        setField(term191455, term191455.getClass(), "responseCode", "");
        setField(term191455, term191455.getClass(), "reason", "");
        setField(term191455, term191455.getClass(), "classicAddress", "");
        setField(term191455, term191455.getClass(), "status", enum375);
        setField(term191455, term191455.getClass(), "paymentAmount", "");
        setField(term191455, term191455.getClass(), "snapshotBalance", "");
        setField(term191455, term191455.getClass(), "nftOwned", "");
        Long term191467 = new Long(5818741986224130131L);
        Class<? extends Object> term192570 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term192569 = ((Class) term192570).getDeclaredField((String) "FAILED");
        ((Field) term192569).setAccessible(true);
        Object enum376 = ((Field) term192569).get((Object) null);
        Object term191466 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term191466, term191466.getClass(), "id", term191467);
        setField(term191466, term191466.getClass(), "responseCode", "");
        setField(term191466, term191466.getClass(), "reason", "");
        setField(term191466, term191466.getClass(), "classicAddress", "");
        setField(term191466, term191466.getClass(), "status", enum376);
        setField(term191466, term191466.getClass(), "paymentAmount", "");
        setField(term191466, term191466.getClass(), "snapshotBalance", "");
        setField(term191466, term191466.getClass(), "nftOwned", "");
        ArrayList term191433 = new ArrayList();
        ((ArrayList) term191433).add(term191435);
        ((ArrayList) term191433).add(term191446);
        ((ArrayList) term191433).add(term191455);
        ((ArrayList) term191433).add(term191466);
        Long term191479 = new Long(370847120687610747L);
        Class<? extends Object> term192990 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term192989 = ((Class) term192990).getDeclaredField((String) "DAILY");
        ((Field) term192989).setAccessible(true);
        Object enum377 = ((Field) term192989).get((Object) null);
        Class<? extends Object> term193377 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term193376 = ((Class) term193377).getDeclaredField((String) "PENDING_REVIEW");
        ((Field) term193376).setAccessible(true);
        Object enum378 = ((Field) term193376).get((Object) null);
        Integer term191578 = new Integer(1386130016);
        Class<? extends Object> term193861 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term193860 = ((Class) term193861).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term193860).setAccessible(true);
        Object enum379 = ((Field) term193860).get((Object) null);
        Long term191637 = new Long(-6399462725251497844L);
        Long term191651 = new Long(-4855037955202452256L);
        Class<? extends Object> term194299 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term194298 = ((Class) term194299).getDeclaredField((String) "FLAT");
        ((Field) term194298).setAccessible(true);
        Object enum380 = ((Field) term194298).get((Object) null);
        Class<? extends Object> term194713 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term194712 = ((Class) term194713).getDeclaredField((String) "REJECTED");
        ((Field) term194712).setAccessible(true);
        Object enum381 = ((Field) term194712).get((Object) null);
        Long term191721 = new Long(-5903549884298836343L);
        term191432 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term191481 = newInstance(Class.forName("java.util.Date"));
        Object term191483 = newInstance(Class.forName("java.util.Date"));
        Object term191485 = newInstance(Class.forName("java.util.Date"));
        Object term191487 = newInstance(Class.forName("java.util.Date"));
        setField(term191432, term191432.getClass(), "results", term191433);
        setField(term191432, term191432.getClass(), "id", term191479);
        setLongField(term191481, term191481.getClass(), "fastTime", 1822179371499L);
        setField(term191481, term191481.getClass(), "cdate", null);
        setField(term191432, term191432.getClass(), "createDate", term191481);
        setLongField(term191483, term191483.getClass(), "fastTime", 1801360627918L);
        setField(term191483, term191483.getClass(), "cdate", null);
        setField(term191432, term191432.getClass(), "updateDate", term191483);
        setLongField(term191485, term191485.getClass(), "fastTime", 1763238284550L);
        setField(term191485, term191485.getClass(), "cdate", null);
        setField(term191432, term191432.getClass(), "startTime", term191485);
        setLongField(term191487, term191487.getClass(), "fastTime", 1704114395126L);
        setField(term191487, term191487.getClass(), "cdate", null);
        setField(term191432, term191432.getClass(), "repeatUntilDate", term191487);
        setField(term191432, term191432.getClass(), "frequency", enum377);
        setField(term191432, term191432.getClass(), "status", enum378);
        setField(term191432, term191432.getClass(), "fromClassicAddress", "pWmmwQMysX");
        setField(term191432, term191432.getClass(), "trustlineIssuerClassicAddress", "BuJzsOARZG");
        setField(term191432, term191432.getClass(), "currencyName", "lIqJQDMmVL");
        setField(term191432, term191432.getClass(), "currencyNameForProcess", "cXTrsrxYFN");
        setField(term191432, term191432.getClass(), "amount", "pEUndHGBiE");
        setBooleanField(term191432, term191432.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term191432, term191432.getClass(), "useBlacklist", true);
        setField(term191432, term191432.getClass(), "maximumTrustlines", term191578);
        setField(term191432, term191432.getClass(), "dropType", enum379);
        setField(term191432, term191432.getClass(), "failReason", "PCzKLiLqoO");
        setField(term191432, term191432.getClass(), "minBalance", "JuYhKUgElF");
        setField(term191432, term191432.getClass(), "maxBalance", "NInWPlYtwe");
        setField(term191432, term191432.getClass(), "totalBlacklisted", term191637);
        setField(term191432, term191432.getClass(), "maxXrpFeePerTransaction", "qVYRtrgZJt");
        setField(term191432, term191432.getClass(), "totalRecipients", term191651);
        setField(term191432, term191432.getClass(), "paymentType", enum380);
        setField(term191432, term191432.getClass(), "snapshotTrustlineIssuerClassicAddress", "PCttFvFDzJ");
        setField(term191432, term191432.getClass(), "snapshotCurrencyName", "fwAMmjMsDq");
        setField(term191432, term191432.getClass(), "nftIssuingAddress", "aqdKzesECj");
        setField(term191432, term191432.getClass(), "nftTaxon", "voSygcVEYO");
        setField(term191432, term191432.getClass(), "scheduleStatus", enum381);
        setField(term191432, term191432.getClass(), "fromScheduleId", term191721);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNftIssuingAddress", argTypes, term191432, args);
    }

};


