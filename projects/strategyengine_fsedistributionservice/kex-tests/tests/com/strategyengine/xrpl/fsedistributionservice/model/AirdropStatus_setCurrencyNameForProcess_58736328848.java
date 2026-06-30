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

public class AirdropStatus_setCurrencyNameForProcess_58736328848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244143;

    public AirdropStatus_setCurrencyNameForProcess_58736328848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term244147 = new Long(-5761087225966065493L);
        Class<? extends Object> term244424 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term244423 = ((Class) term244424).getDeclaredField((String) "VERIFIED");
        ((Field) term244423).setAccessible(true);
        Object enum486 = ((Field) term244423).get((Object) null);
        Object term244146 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term244146, term244146.getClass(), "id", term244147);
        setField(term244146, term244146.getClass(), "responseCode", "");
        setField(term244146, term244146.getClass(), "reason", "");
        setField(term244146, term244146.getClass(), "classicAddress", "");
        setField(term244146, term244146.getClass(), "status", enum486);
        setField(term244146, term244146.getClass(), "paymentAmount", "");
        setField(term244146, term244146.getClass(), "snapshotBalance", "");
        setField(term244146, term244146.getClass(), "nftOwned", "");
        Long term244158 = new Long(493557348274366095L);
        Class<? extends Object> term244850 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term244849 = ((Class) term244850).getDeclaredField((String) "VERIFIED");
        ((Field) term244849).setAccessible(true);
        Object enum487 = ((Field) term244849).get((Object) null);
        Object term244157 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term244157, term244157.getClass(), "id", term244158);
        setField(term244157, term244157.getClass(), "responseCode", "");
        setField(term244157, term244157.getClass(), "reason", "");
        setField(term244157, term244157.getClass(), "classicAddress", "");
        setField(term244157, term244157.getClass(), "status", enum487);
        setField(term244157, term244157.getClass(), "paymentAmount", "");
        setField(term244157, term244157.getClass(), "snapshotBalance", "");
        setField(term244157, term244157.getClass(), "nftOwned", "");
        ArrayList term244144 = new ArrayList();
        ((ArrayList) term244144).add(term244146);
        ((ArrayList) term244144).add(term244157);
        Long term244170 = new Long(8699742215739444902L);
        Class<? extends Object> term245276 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term245275 = ((Class) term245276).getDeclaredField((String) "MONTHLY");
        ((Field) term245275).setAccessible(true);
        Object enum488 = ((Field) term245275).get((Object) null);
        Class<? extends Object> term245669 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term245668 = ((Class) term245669).getDeclaredField((String) "SCHEDULED");
        ((Field) term245668).setAccessible(true);
        Object enum489 = ((Field) term245668).get((Object) null);
        Integer term244266 = new Integer(71190297);
        Class<? extends Object> term246138 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term246137 = ((Class) term246138).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term246137).setAccessible(true);
        Object enum490 = ((Field) term246137).get((Object) null);
        Long term244325 = new Long(8261619652909874476L);
        Long term244339 = new Long(-3692936312179064102L);
        Class<? extends Object> term246576 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term246575 = ((Class) term246576).getDeclaredField((String) "FLAT");
        ((Field) term246575).setAccessible(true);
        Object enum491 = ((Field) term246575).get((Object) null);
        Class<? extends Object> term246990 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term246989 = ((Class) term246990).getDeclaredField((String) "COMPLETE");
        ((Field) term246989).setAccessible(true);
        Object enum492 = ((Field) term246989).get((Object) null);
        Long term244409 = new Long(5498944509671266637L);
        term244143 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term244172 = newInstance(Class.forName("java.util.Date"));
        Object term244174 = newInstance(Class.forName("java.util.Date"));
        Object term244176 = newInstance(Class.forName("java.util.Date"));
        Object term244178 = newInstance(Class.forName("java.util.Date"));
        setField(term244143, term244143.getClass(), "results", term244144);
        setField(term244143, term244143.getClass(), "id", term244170);
        setLongField(term244172, term244172.getClass(), "fastTime", 1659506241395L);
        setField(term244172, term244172.getClass(), "cdate", null);
        setField(term244143, term244143.getClass(), "createDate", term244172);
        setLongField(term244174, term244174.getClass(), "fastTime", 1748670382997L);
        setField(term244174, term244174.getClass(), "cdate", null);
        setField(term244143, term244143.getClass(), "updateDate", term244174);
        setLongField(term244176, term244176.getClass(), "fastTime", 1318227522669L);
        setField(term244176, term244176.getClass(), "cdate", null);
        setField(term244143, term244143.getClass(), "startTime", term244176);
        setLongField(term244178, term244178.getClass(), "fastTime", 1803998261031L);
        setField(term244178, term244178.getClass(), "cdate", null);
        setField(term244143, term244143.getClass(), "repeatUntilDate", term244178);
        setField(term244143, term244143.getClass(), "frequency", enum488);
        setField(term244143, term244143.getClass(), "status", enum489);
        setField(term244143, term244143.getClass(), "fromClassicAddress", "ttkSFEAzwY");
        setField(term244143, term244143.getClass(), "trustlineIssuerClassicAddress", "ZTUqSMjJHU");
        setField(term244143, term244143.getClass(), "currencyName", "TAvUGVCPaa");
        setField(term244143, term244143.getClass(), "currencyNameForProcess", "oacMptGUKE");
        setField(term244143, term244143.getClass(), "amount", "vjVwvYdNhl");
        setBooleanField(term244143, term244143.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term244143, term244143.getClass(), "useBlacklist", false);
        setField(term244143, term244143.getClass(), "maximumTrustlines", term244266);
        setField(term244143, term244143.getClass(), "dropType", enum490);
        setField(term244143, term244143.getClass(), "failReason", "sqJqznmMco");
        setField(term244143, term244143.getClass(), "minBalance", "ZufWIAjLXm");
        setField(term244143, term244143.getClass(), "maxBalance", "rXhBlGnTbp");
        setField(term244143, term244143.getClass(), "totalBlacklisted", term244325);
        setField(term244143, term244143.getClass(), "maxXrpFeePerTransaction", "RXrliVaPrQ");
        setField(term244143, term244143.getClass(), "totalRecipients", term244339);
        setField(term244143, term244143.getClass(), "paymentType", enum491);
        setField(term244143, term244143.getClass(), "snapshotTrustlineIssuerClassicAddress", "QWnrSwmKgP");
        setField(term244143, term244143.getClass(), "snapshotCurrencyName", "wOeJuAGSwi");
        setField(term244143, term244143.getClass(), "nftIssuingAddress", "lCalUsJPRJ");
        setField(term244143, term244143.getClass(), "nftTaxon", "gFHKkRGUax");
        setField(term244143, term244143.getClass(), "scheduleStatus", enum492);
        setField(term244143, term244143.getClass(), "fromScheduleId", term244409);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "paZAviFqsm";
        callMethod(klass, "setCurrencyNameForProcess", argTypes, term244143, args);
    }

};


