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

public class AirdropStatus_AirdropStatusBuilder_snapshotCurrencyName_62316787626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term533154;

    public AirdropStatus_AirdropStatusBuilder_snapshotCurrencyName_62316787626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term533158 = new Long(1959851788493022882L);
        Class<? extends Object> term533442 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term533441 = ((Class) term533442).getDeclaredField((String) "QUEUED");
        ((Field) term533441).setAccessible(true);
        Object enum1010 = ((Field) term533441).get((Object) null);
        Object term533157 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term533157, term533157.getClass(), "id", term533158);
        setField(term533157, term533157.getClass(), "responseCode", "");
        setField(term533157, term533157.getClass(), "reason", "");
        setField(term533157, term533157.getClass(), "classicAddress", "");
        setField(term533157, term533157.getClass(), "status", enum1010);
        setField(term533157, term533157.getClass(), "paymentAmount", "");
        setField(term533157, term533157.getClass(), "snapshotBalance", "");
        setField(term533157, term533157.getClass(), "nftOwned", "");
        Long term533169 = new Long(-8272873308287230741L);
        Class<? extends Object> term533862 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term533861 = ((Class) term533862).getDeclaredField((String) "FAILED");
        ((Field) term533861).setAccessible(true);
        Object enum1011 = ((Field) term533861).get((Object) null);
        Object term533168 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term533168, term533168.getClass(), "id", term533169);
        setField(term533168, term533168.getClass(), "responseCode", "");
        setField(term533168, term533168.getClass(), "reason", "");
        setField(term533168, term533168.getClass(), "classicAddress", "");
        setField(term533168, term533168.getClass(), "status", enum1011);
        setField(term533168, term533168.getClass(), "paymentAmount", "");
        setField(term533168, term533168.getClass(), "snapshotBalance", "");
        setField(term533168, term533168.getClass(), "nftOwned", "");
        Long term533180 = new Long(-1471967517386315328L);
        Class<? extends Object> term534282 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term534281 = ((Class) term534282).getDeclaredField((String) "VERIFIED");
        ((Field) term534281).setAccessible(true);
        Object enum1012 = ((Field) term534281).get((Object) null);
        Object term533179 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term533179, term533179.getClass(), "id", term533180);
        setField(term533179, term533179.getClass(), "responseCode", "");
        setField(term533179, term533179.getClass(), "reason", "");
        setField(term533179, term533179.getClass(), "classicAddress", "");
        setField(term533179, term533179.getClass(), "status", enum1012);
        setField(term533179, term533179.getClass(), "paymentAmount", "");
        setField(term533179, term533179.getClass(), "snapshotBalance", "");
        setField(term533179, term533179.getClass(), "nftOwned", "");
        ArrayList term533155 = new ArrayList();
        ((ArrayList) term533155).add(term533157);
        ((ArrayList) term533155).add(term533168);
        ((ArrayList) term533155).add(term533179);
        Long term533192 = new Long(3445409355788900348L);
        Class<? extends Object> term534708 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term534707 = ((Class) term534708).getDeclaredField((String) "DAILY");
        ((Field) term534707).setAccessible(true);
        Object enum1013 = ((Field) term534707).get((Object) null);
        Class<? extends Object> term535095 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term535094 = ((Class) term535095).getDeclaredField((String) "SCHEDULED");
        ((Field) term535094).setAccessible(true);
        Object enum1014 = ((Field) term535094).get((Object) null);
        Integer term533286 = new Integer(199287428);
        Class<? extends Object> term535564 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term535563 = ((Class) term535564).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term535563).setAccessible(true);
        Object enum1015 = ((Field) term535563).get((Object) null);
        Long term533345 = new Long(-8079148366910851953L);
        Long term533359 = new Long(7775195107098215044L);
        Class<? extends Object> term536002 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term536001 = ((Class) term536002).getDeclaredField((String) "FLAT");
        ((Field) term536001).setAccessible(true);
        Object enum1016 = ((Field) term536001).get((Object) null);
        Class<? extends Object> term536416 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term536415 = ((Class) term536416).getDeclaredField((String) "ACTIVE");
        ((Field) term536415).setAccessible(true);
        Object enum1017 = ((Field) term536415).get((Object) null);
        Long term533427 = new Long(-1826927759081147983L);
        term533154 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder"));
        Object term533194 = newInstance(Class.forName("java.util.Date"));
        Object term533196 = newInstance(Class.forName("java.util.Date"));
        Object term533198 = newInstance(Class.forName("java.util.Date"));
        Object term533200 = newInstance(Class.forName("java.util.Date"));
        setField(term533154, term533154.getClass(), "results", term533155);
        setField(term533154, term533154.getClass(), "id", term533192);
        setLongField(term533194, term533194.getClass(), "fastTime", 1620368297139L);
        setField(term533194, term533194.getClass(), "cdate", null);
        setField(term533154, term533154.getClass(), "createDate", term533194);
        setLongField(term533196, term533196.getClass(), "fastTime", 1415808471874L);
        setField(term533196, term533196.getClass(), "cdate", null);
        setField(term533154, term533154.getClass(), "updateDate", term533196);
        setLongField(term533198, term533198.getClass(), "fastTime", 1692745015568L);
        setField(term533198, term533198.getClass(), "cdate", null);
        setField(term533154, term533154.getClass(), "startTime", term533198);
        setLongField(term533200, term533200.getClass(), "fastTime", 1745085025862L);
        setField(term533200, term533200.getClass(), "cdate", null);
        setField(term533154, term533154.getClass(), "repeatUntilDate", term533200);
        setField(term533154, term533154.getClass(), "frequency", enum1013);
        setField(term533154, term533154.getClass(), "status", enum1014);
        setField(term533154, term533154.getClass(), "fromClassicAddress", "XosGyziZMs");
        setField(term533154, term533154.getClass(), "trustlineIssuerClassicAddress", "UjoiRiwpuv");
        setField(term533154, term533154.getClass(), "currencyName", "XbTprIRnaq");
        setField(term533154, term533154.getClass(), "currencyNameForProcess", "vpaIuPijLa");
        setField(term533154, term533154.getClass(), "amount", "yvLFPtZSre");
        setBooleanField(term533154, term533154.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term533154, term533154.getClass(), "useBlacklist", true);
        setField(term533154, term533154.getClass(), "maximumTrustlines", term533286);
        setField(term533154, term533154.getClass(), "dropType", enum1015);
        setField(term533154, term533154.getClass(), "failReason", "wjgIjeboAE");
        setField(term533154, term533154.getClass(), "minBalance", "NSFdaqmySa");
        setField(term533154, term533154.getClass(), "maxBalance", "PdJGtmrIOj");
        setField(term533154, term533154.getClass(), "totalBlacklisted", term533345);
        setField(term533154, term533154.getClass(), "maxXrpFeePerTransaction", "dmmaTphXXx");
        setField(term533154, term533154.getClass(), "totalRecipients", term533359);
        setField(term533154, term533154.getClass(), "paymentType", enum1016);
        setField(term533154, term533154.getClass(), "snapshotTrustlineIssuerClassicAddress", "fNCBeKfOvy");
        setField(term533154, term533154.getClass(), "snapshotCurrencyName", "WTcmHjCdvW");
        setField(term533154, term533154.getClass(), "nftIssuingAddress", "jQezHAkbKo");
        setField(term533154, term533154.getClass(), "nftTaxon", "PoOHLUlrlB");
        setField(term533154, term533154.getClass(), "scheduleStatus", enum1017);
        setField(term533154, term533154.getClass(), "fromScheduleId", term533427);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JIJKYkewpT";
        callMethod(klass, "snapshotCurrencyName", argTypes, term533154, args);
    }

};


