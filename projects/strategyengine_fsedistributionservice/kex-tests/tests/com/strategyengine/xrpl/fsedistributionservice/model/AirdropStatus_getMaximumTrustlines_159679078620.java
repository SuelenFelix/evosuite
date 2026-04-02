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

public class AirdropStatus_getMaximumTrustlines_159679078620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154951;

    public AirdropStatus_getMaximumTrustlines_159679078620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term154955 = new Long(6853972830905120647L);
        Class<? extends Object> term155262 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term155261 = ((Class) term155262).getDeclaredField((String) "QUEUED");
        ((Field) term155261).setAccessible(true);
        Object enum296 = ((Field) term155261).get((Object) null);
        Object term154954 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term154954, term154954.getClass(), "id", term154955);
        setField(term154954, term154954.getClass(), "responseCode", "");
        setField(term154954, term154954.getClass(), "reason", "");
        setField(term154954, term154954.getClass(), "classicAddress", "");
        setField(term154954, term154954.getClass(), "status", enum296);
        setField(term154954, term154954.getClass(), "paymentAmount", "");
        setField(term154954, term154954.getClass(), "snapshotBalance", "");
        setField(term154954, term154954.getClass(), "nftOwned", "");
        Long term154966 = new Long(1442167273909860961L);
        Class<? extends Object> term155682 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term155681 = ((Class) term155682).getDeclaredField((String) "FAILED");
        ((Field) term155681).setAccessible(true);
        Object enum297 = ((Field) term155681).get((Object) null);
        Object term154965 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term154965, term154965.getClass(), "id", term154966);
        setField(term154965, term154965.getClass(), "responseCode", "");
        setField(term154965, term154965.getClass(), "reason", "");
        setField(term154965, term154965.getClass(), "classicAddress", "");
        setField(term154965, term154965.getClass(), "status", enum297);
        setField(term154965, term154965.getClass(), "paymentAmount", "");
        setField(term154965, term154965.getClass(), "snapshotBalance", "");
        setField(term154965, term154965.getClass(), "nftOwned", "");
        Long term154977 = new Long(6895382576300001141L);
        Class<? extends Object> term156102 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term156101 = ((Class) term156102).getDeclaredField((String) "SENDING");
        ((Field) term156101).setAccessible(true);
        Object enum298 = ((Field) term156101).get((Object) null);
        Object term154976 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term154976, term154976.getClass(), "id", term154977);
        setField(term154976, term154976.getClass(), "responseCode", "");
        setField(term154976, term154976.getClass(), "reason", "");
        setField(term154976, term154976.getClass(), "classicAddress", "");
        setField(term154976, term154976.getClass(), "status", enum298);
        setField(term154976, term154976.getClass(), "paymentAmount", "");
        setField(term154976, term154976.getClass(), "snapshotBalance", "");
        setField(term154976, term154976.getClass(), "nftOwned", "");
        Long term154988 = new Long(9062006526792682783L);
        Object term154987 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term154987, term154987.getClass(), "id", term154988);
        setField(term154987, term154987.getClass(), "responseCode", "");
        setField(term154987, term154987.getClass(), "reason", "");
        setField(term154987, term154987.getClass(), "classicAddress", "");
        setField(term154987, term154987.getClass(), "status", enum297);
        setField(term154987, term154987.getClass(), "paymentAmount", "");
        setField(term154987, term154987.getClass(), "snapshotBalance", "");
        setField(term154987, term154987.getClass(), "nftOwned", "");
        Long term154997 = new Long(-7400951017937830861L);
        Class<? extends Object> term156525 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term156524 = ((Class) term156525).getDeclaredField((String) "FAILED");
        ((Field) term156524).setAccessible(true);
        Object enum299 = ((Field) term156524).get((Object) null);
        Object term154996 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term154996, term154996.getClass(), "id", term154997);
        setField(term154996, term154996.getClass(), "responseCode", "");
        setField(term154996, term154996.getClass(), "reason", "");
        setField(term154996, term154996.getClass(), "classicAddress", "");
        setField(term154996, term154996.getClass(), "status", enum299);
        setField(term154996, term154996.getClass(), "paymentAmount", "");
        setField(term154996, term154996.getClass(), "snapshotBalance", "");
        setField(term154996, term154996.getClass(), "nftOwned", "");
        Long term155008 = new Long(-8993073054427011802L);
        Object term155007 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term155007, term155007.getClass(), "id", term155008);
        setField(term155007, term155007.getClass(), "responseCode", "");
        setField(term155007, term155007.getClass(), "reason", "");
        setField(term155007, term155007.getClass(), "classicAddress", "");
        setField(term155007, term155007.getClass(), "status", enum299);
        setField(term155007, term155007.getClass(), "paymentAmount", "");
        setField(term155007, term155007.getClass(), "snapshotBalance", "");
        setField(term155007, term155007.getClass(), "nftOwned", "");
        ArrayList term154952 = new ArrayList();
        ((ArrayList) term154952).add(term154954);
        ((ArrayList) term154952).add(term154965);
        ((ArrayList) term154952).add(term154976);
        ((ArrayList) term154952).add(term154987);
        ((ArrayList) term154952).add(term154996);
        ((ArrayList) term154952).add(term155007);
        Long term155018 = new Long(2287785643837657068L);
        Class<? extends Object> term156945 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term156944 = ((Class) term156945).getDeclaredField((String) "MONTHLY");
        ((Field) term156944).setAccessible(true);
        Object enum300 = ((Field) term156944).get((Object) null);
        Class<? extends Object> term157338 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term157337 = ((Class) term157338).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term157337).setAccessible(true);
        Object enum301 = ((Field) term157337).get((Object) null);
        Integer term155116 = new Integer(-1476117762);
        Class<? extends Object> term157813 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term157812 = ((Class) term157813).getDeclaredField((String) "TRUSTLINE");
        ((Field) term157812).setAccessible(true);
        Object enum302 = ((Field) term157812).get((Object) null);
        Long term155167 = new Long(-7283193381993602128L);
        Long term155181 = new Long(6351887424140565471L);
        Class<? extends Object> term158227 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term158226 = ((Class) term158227).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term158226).setAccessible(true);
        Object enum303 = ((Field) term158226).get((Object) null);
        Class<? extends Object> term158665 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term158664 = ((Class) term158665).getDeclaredField((String) "COMPLETE");
        ((Field) term158664).setAccessible(true);
        Object enum304 = ((Field) term158664).get((Object) null);
        Long term155259 = new Long(6273670659288205855L);
        term154951 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term155020 = newInstance(Class.forName("java.util.Date"));
        Object term155022 = newInstance(Class.forName("java.util.Date"));
        Object term155024 = newInstance(Class.forName("java.util.Date"));
        Object term155026 = newInstance(Class.forName("java.util.Date"));
        setField(term154951, term154951.getClass(), "results", term154952);
        setField(term154951, term154951.getClass(), "id", term155018);
        setLongField(term155020, term155020.getClass(), "fastTime", 1355447674618L);
        setField(term155020, term155020.getClass(), "cdate", null);
        setField(term154951, term154951.getClass(), "createDate", term155020);
        setLongField(term155022, term155022.getClass(), "fastTime", 1489372405062L);
        setField(term155022, term155022.getClass(), "cdate", null);
        setField(term154951, term154951.getClass(), "updateDate", term155022);
        setLongField(term155024, term155024.getClass(), "fastTime", 1267335801008L);
        setField(term155024, term155024.getClass(), "cdate", null);
        setField(term154951, term154951.getClass(), "startTime", term155024);
        setLongField(term155026, term155026.getClass(), "fastTime", 1849683117875L);
        setField(term155026, term155026.getClass(), "cdate", null);
        setField(term154951, term154951.getClass(), "repeatUntilDate", term155026);
        setField(term154951, term154951.getClass(), "frequency", enum300);
        setField(term154951, term154951.getClass(), "status", enum301);
        setField(term154951, term154951.getClass(), "fromClassicAddress", "NdPeQAHWKN");
        setField(term154951, term154951.getClass(), "trustlineIssuerClassicAddress", "giGQTpcQuV");
        setField(term154951, term154951.getClass(), "currencyName", "IWCccrYFQd");
        setField(term154951, term154951.getClass(), "currencyNameForProcess", "zpkdYKWkCa");
        setField(term154951, term154951.getClass(), "amount", "mvOJAtEcWR");
        setBooleanField(term154951, term154951.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term154951, term154951.getClass(), "useBlacklist", true);
        setField(term154951, term154951.getClass(), "maximumTrustlines", term155116);
        setField(term154951, term154951.getClass(), "dropType", enum302);
        setField(term154951, term154951.getClass(), "failReason", "QybezBkmJu");
        setField(term154951, term154951.getClass(), "minBalance", "uWIrREgpjs");
        setField(term154951, term154951.getClass(), "maxBalance", "TmEdDFXkTZ");
        setField(term154951, term154951.getClass(), "totalBlacklisted", term155167);
        setField(term154951, term154951.getClass(), "maxXrpFeePerTransaction", "DjjdYbIhNY");
        setField(term154951, term154951.getClass(), "totalRecipients", term155181);
        setField(term154951, term154951.getClass(), "paymentType", enum303);
        setField(term154951, term154951.getClass(), "snapshotTrustlineIssuerClassicAddress", "AGaeaoutjJ");
        setField(term154951, term154951.getClass(), "snapshotCurrencyName", "oHWSUbpGiK");
        setField(term154951, term154951.getClass(), "nftIssuingAddress", "RreVzKmtxf");
        setField(term154951, term154951.getClass(), "nftTaxon", "xHBCsghEAi");
        setField(term154951, term154951.getClass(), "scheduleStatus", enum304);
        setField(term154951, term154951.getClass(), "fromScheduleId", term155259);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaximumTrustlines", argTypes, term154951, args);
    }

};


