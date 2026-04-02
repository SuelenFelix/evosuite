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

public class AirdropStatus_AirdropStatusBuilder_trustlineIssuerClassicAddress_109496553910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term477733;

    public AirdropStatus_AirdropStatusBuilder_trustlineIssuerClassicAddress_109496553910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term477737 = new Long(-8676733724224510585L);
        Class<? extends Object> term478001 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term478000 = ((Class) term478001).getDeclaredField((String) "FAILED");
        ((Field) term478000).setAccessible(true);
        Object enum892 = ((Field) term478000).get((Object) null);
        Object term477736 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term477736, term477736.getClass(), "id", term477737);
        setField(term477736, term477736.getClass(), "responseCode", "");
        setField(term477736, term477736.getClass(), "reason", "");
        setField(term477736, term477736.getClass(), "classicAddress", "");
        setField(term477736, term477736.getClass(), "status", enum892);
        setField(term477736, term477736.getClass(), "paymentAmount", "");
        setField(term477736, term477736.getClass(), "snapshotBalance", "");
        setField(term477736, term477736.getClass(), "nftOwned", "");
        ArrayList term477734 = new ArrayList();
        ((ArrayList) term477734).add(term477736);
        Long term477749 = new Long(1318139313166175279L);
        Class<? extends Object> term478421 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term478420 = ((Class) term478421).getDeclaredField((String) "ANNUALLY");
        ((Field) term478420).setAccessible(true);
        Object enum893 = ((Field) term478420).get((Object) null);
        Class<? extends Object> term478817 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term478816 = ((Class) term478817).getDeclaredField((String) "SCHEDULED");
        ((Field) term478816).setAccessible(true);
        Object enum894 = ((Field) term478816).get((Object) null);
        Integer term477846 = new Integer(1507074215);
        Class<? extends Object> term479286 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term479285 = ((Class) term479286).getDeclaredField((String) "GLOBALID");
        ((Field) term479285).setAccessible(true);
        Object enum895 = ((Field) term479285).get((Object) null);
        Long term477896 = new Long(1712520441197520950L);
        Long term477910 = new Long(7043650218274841102L);
        Class<? extends Object> term479697 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term479696 = ((Class) term479697).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term479696).setAccessible(true);
        Object enum896 = ((Field) term479696).get((Object) null);
        Class<? extends Object> term480135 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term480134 = ((Class) term480135).getDeclaredField((String) "ACTIVE");
        ((Field) term480134).setAccessible(true);
        Object enum897 = ((Field) term480134).get((Object) null);
        Long term477986 = new Long(-6096774034189525139L);
        term477733 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder"));
        Object term477751 = newInstance(Class.forName("java.util.Date"));
        Object term477753 = newInstance(Class.forName("java.util.Date"));
        Object term477755 = newInstance(Class.forName("java.util.Date"));
        Object term477757 = newInstance(Class.forName("java.util.Date"));
        setField(term477733, term477733.getClass(), "results", term477734);
        setField(term477733, term477733.getClass(), "id", term477749);
        setLongField(term477751, term477751.getClass(), "fastTime", 1805471718181L);
        setField(term477751, term477751.getClass(), "cdate", null);
        setField(term477733, term477733.getClass(), "createDate", term477751);
        setLongField(term477753, term477753.getClass(), "fastTime", 1733269508960L);
        setField(term477753, term477753.getClass(), "cdate", null);
        setField(term477733, term477733.getClass(), "updateDate", term477753);
        setLongField(term477755, term477755.getClass(), "fastTime", 1536664726245L);
        setField(term477755, term477755.getClass(), "cdate", null);
        setField(term477733, term477733.getClass(), "startTime", term477755);
        setLongField(term477757, term477757.getClass(), "fastTime", 1453656797273L);
        setField(term477757, term477757.getClass(), "cdate", null);
        setField(term477733, term477733.getClass(), "repeatUntilDate", term477757);
        setField(term477733, term477733.getClass(), "frequency", enum893);
        setField(term477733, term477733.getClass(), "status", enum894);
        setField(term477733, term477733.getClass(), "fromClassicAddress", "yepnxnHDdp");
        setField(term477733, term477733.getClass(), "trustlineIssuerClassicAddress", "pxILvBKWRo");
        setField(term477733, term477733.getClass(), "currencyName", "OrMrzSscwB");
        setField(term477733, term477733.getClass(), "currencyNameForProcess", "qOiZVTUasG");
        setField(term477733, term477733.getClass(), "amount", "VrbjjUMSDU");
        setBooleanField(term477733, term477733.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term477733, term477733.getClass(), "useBlacklist", true);
        setField(term477733, term477733.getClass(), "maximumTrustlines", term477846);
        setField(term477733, term477733.getClass(), "dropType", enum895);
        setField(term477733, term477733.getClass(), "failReason", "xDGzHtrwxK");
        setField(term477733, term477733.getClass(), "minBalance", "CwwTZmvKmY");
        setField(term477733, term477733.getClass(), "maxBalance", "zAKYtlhVLD");
        setField(term477733, term477733.getClass(), "totalBlacklisted", term477896);
        setField(term477733, term477733.getClass(), "maxXrpFeePerTransaction", "WBtPWXOEmq");
        setField(term477733, term477733.getClass(), "totalRecipients", term477910);
        setField(term477733, term477733.getClass(), "paymentType", enum896);
        setField(term477733, term477733.getClass(), "snapshotTrustlineIssuerClassicAddress", "QuikledFWs");
        setField(term477733, term477733.getClass(), "snapshotCurrencyName", "KciBQcVUbd");
        setField(term477733, term477733.getClass(), "nftIssuingAddress", "rVkPxsXMLd");
        setField(term477733, term477733.getClass(), "nftTaxon", "TRbwDxScJC");
        setField(term477733, term477733.getClass(), "scheduleStatus", enum897);
        setField(term477733, term477733.getClass(), "fromScheduleId", term477986);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ANMeqCzXZC";
        callMethod(klass, "trustlineIssuerClassicAddress", argTypes, term477733, args);
    }

};


