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
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class AirdropStatus_AirdropStatusBuilder_snapshotTrustlineIssuerClassicAddress_157746860725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term530695;

    public AirdropStatus_AirdropStatusBuilder_snapshotTrustlineIssuerClassicAddress_157746860725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term530696 = new ArrayList();
        Long term530700 = new Long(-4618196261828717815L);
        Class<? extends Object> term530968 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term530967 = ((Class) term530968).getDeclaredField((String) "MONTHLY");
        ((Field) term530967).setAccessible(true);
        Object enum1005 = ((Field) term530967).get((Object) null);
        Class<? extends Object> term531361 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term531360 = ((Class) term531361).getDeclaredField((String) "COMPLETE");
        ((Field) term531360).setAccessible(true);
        Object enum1006 = ((Field) term531360).get((Object) null);
        Integer term530795 = new Integer(-129547140);
        Class<? extends Object> term531827 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term531826 = ((Class) term531827).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term531826).setAccessible(true);
        Object enum1007 = ((Field) term531826).get((Object) null);
        Long term530863 = new Long(-1396670214756396961L);
        Long term530877 = new Long(1795641040165405529L);
        Class<? extends Object> term532292 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term532291 = ((Class) term532292).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term532291).setAccessible(true);
        Object enum1008 = ((Field) term532291).get((Object) null);
        Class<? extends Object> term532730 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term532729 = ((Class) term532730).getDeclaredField((String) "ACTIVE");
        ((Field) term532729).setAccessible(true);
        Object enum1009 = ((Field) term532729).get((Object) null);
        Long term530953 = new Long(6002848910891080375L);
        term530695 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder"));
        Object term530702 = newInstance(Class.forName("java.util.Date"));
        Object term530704 = newInstance(Class.forName("java.util.Date"));
        Object term530706 = newInstance(Class.forName("java.util.Date"));
        Object term530708 = newInstance(Class.forName("java.util.Date"));
        setField(term530695, term530695.getClass(), "results", term530696);
        setField(term530695, term530695.getClass(), "id", term530700);
        setLongField(term530702, term530702.getClass(), "fastTime", 1334996491565L);
        setField(term530702, term530702.getClass(), "cdate", null);
        setField(term530695, term530695.getClass(), "createDate", term530702);
        setLongField(term530704, term530704.getClass(), "fastTime", 1667089956527L);
        setField(term530704, term530704.getClass(), "cdate", null);
        setField(term530695, term530695.getClass(), "updateDate", term530704);
        setLongField(term530706, term530706.getClass(), "fastTime", 1844279698543L);
        setField(term530706, term530706.getClass(), "cdate", null);
        setField(term530695, term530695.getClass(), "startTime", term530706);
        setLongField(term530708, term530708.getClass(), "fastTime", 1554603576634L);
        setField(term530708, term530708.getClass(), "cdate", null);
        setField(term530695, term530695.getClass(), "repeatUntilDate", term530708);
        setField(term530695, term530695.getClass(), "frequency", enum1005);
        setField(term530695, term530695.getClass(), "status", enum1006);
        setField(term530695, term530695.getClass(), "fromClassicAddress", "ulQMqmFZnB");
        setField(term530695, term530695.getClass(), "trustlineIssuerClassicAddress", "bLUjUsNvNe");
        setField(term530695, term530695.getClass(), "currencyName", "bBKyatMuCx");
        setField(term530695, term530695.getClass(), "currencyNameForProcess", "FAeRotuBPc");
        setField(term530695, term530695.getClass(), "amount", "yKPLRLjEEs");
        setBooleanField(term530695, term530695.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term530695, term530695.getClass(), "useBlacklist", false);
        setField(term530695, term530695.getClass(), "maximumTrustlines", term530795);
        setField(term530695, term530695.getClass(), "dropType", enum1007);
        setField(term530695, term530695.getClass(), "failReason", "GBMsbigXmJ");
        setField(term530695, term530695.getClass(), "minBalance", "iyaEOvRXxa");
        setField(term530695, term530695.getClass(), "maxBalance", "FhUiFZanfe");
        setField(term530695, term530695.getClass(), "totalBlacklisted", term530863);
        setField(term530695, term530695.getClass(), "maxXrpFeePerTransaction", "aYivLISRyW");
        setField(term530695, term530695.getClass(), "totalRecipients", term530877);
        setField(term530695, term530695.getClass(), "paymentType", enum1008);
        setField(term530695, term530695.getClass(), "snapshotTrustlineIssuerClassicAddress", "RrSBRpwDUO");
        setField(term530695, term530695.getClass(), "snapshotCurrencyName", "wOykMlVxUu");
        setField(term530695, term530695.getClass(), "nftIssuingAddress", "bzUpBVXJnh");
        setField(term530695, term530695.getClass(), "nftTaxon", "hSMGLdcXOh");
        setField(term530695, term530695.getClass(), "scheduleStatus", enum1009);
        setField(term530695, term530695.getClass(), "fromScheduleId", term530953);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FvaUDcOcsU";
        callMethod(klass, "snapshotTrustlineIssuerClassicAddress", argTypes, term530695, args);
    }

};


