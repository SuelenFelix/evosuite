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

public class AirdropStatus_setFailReason_177494658454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265994;

    public AirdropStatus_setFailReason_177494658454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term265998 = new Long(-1283563319051310751L);
        Class<? extends Object> term266269 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term266268 = ((Class) term266269).getDeclaredField((String) "FAILED");
        ((Field) term266268).setAccessible(true);
        Object enum533 = ((Field) term266268).get((Object) null);
        Object term265997 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term265997, term265997.getClass(), "id", term265998);
        setField(term265997, term265997.getClass(), "responseCode", "");
        setField(term265997, term265997.getClass(), "reason", "");
        setField(term265997, term265997.getClass(), "classicAddress", "");
        setField(term265997, term265997.getClass(), "status", enum533);
        setField(term265997, term265997.getClass(), "paymentAmount", "");
        setField(term265997, term265997.getClass(), "snapshotBalance", "");
        setField(term265997, term265997.getClass(), "nftOwned", "");
        Long term266009 = new Long(-1413653349314156044L);
        Object term266008 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term266008, term266008.getClass(), "id", term266009);
        setField(term266008, term266008.getClass(), "responseCode", "");
        setField(term266008, term266008.getClass(), "reason", "");
        setField(term266008, term266008.getClass(), "classicAddress", "");
        setField(term266008, term266008.getClass(), "status", enum533);
        setField(term266008, term266008.getClass(), "paymentAmount", "");
        setField(term266008, term266008.getClass(), "snapshotBalance", "");
        setField(term266008, term266008.getClass(), "nftOwned", "");
        ArrayList term265995 = new ArrayList();
        ((ArrayList) term265995).add(term265997);
        ((ArrayList) term265995).add(term266008);
        Long term266019 = new Long(742593745847006219L);
        Class<? extends Object> term266689 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term266688 = ((Class) term266689).getDeclaredField((String) "DAILY");
        ((Field) term266688).setAccessible(true);
        Object enum534 = ((Field) term266688).get((Object) null);
        Class<? extends Object> term267076 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term267075 = ((Class) term267076).getDeclaredField((String) "COMPLETE");
        ((Field) term267075).setAccessible(true);
        Object enum535 = ((Field) term267075).get((Object) null);
        Integer term266112 = new Integer(344323424);
        Class<? extends Object> term267542 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term267541 = ((Class) term267542).getDeclaredField((String) "GLOBALID");
        ((Field) term267541).setAccessible(true);
        Object enum536 = ((Field) term267541).get((Object) null);
        Long term266162 = new Long(6801904611028883308L);
        Long term266176 = new Long(-7717027128782374599L);
        Class<? extends Object> term267953 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term267952 = ((Class) term267953).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term267952).setAccessible(true);
        Object enum537 = ((Field) term267952).get((Object) null);
        Class<? extends Object> term268391 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term268390 = ((Class) term268391).getDeclaredField((String) "REJECTED");
        ((Field) term268390).setAccessible(true);
        Object enum538 = ((Field) term268390).get((Object) null);
        Long term266254 = new Long(4872921045907555824L);
        term265994 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term266021 = newInstance(Class.forName("java.util.Date"));
        Object term266023 = newInstance(Class.forName("java.util.Date"));
        Object term266025 = newInstance(Class.forName("java.util.Date"));
        Object term266027 = newInstance(Class.forName("java.util.Date"));
        setField(term265994, term265994.getClass(), "results", term265995);
        setField(term265994, term265994.getClass(), "id", term266019);
        setLongField(term266021, term266021.getClass(), "fastTime", 1674510348370L);
        setField(term266021, term266021.getClass(), "cdate", null);
        setField(term265994, term265994.getClass(), "createDate", term266021);
        setLongField(term266023, term266023.getClass(), "fastTime", 1727352558737L);
        setField(term266023, term266023.getClass(), "cdate", null);
        setField(term265994, term265994.getClass(), "updateDate", term266023);
        setLongField(term266025, term266025.getClass(), "fastTime", 1691477911969L);
        setField(term266025, term266025.getClass(), "cdate", null);
        setField(term265994, term265994.getClass(), "startTime", term266025);
        setLongField(term266027, term266027.getClass(), "fastTime", 1788833806516L);
        setField(term266027, term266027.getClass(), "cdate", null);
        setField(term265994, term265994.getClass(), "repeatUntilDate", term266027);
        setField(term265994, term265994.getClass(), "frequency", enum534);
        setField(term265994, term265994.getClass(), "status", enum535);
        setField(term265994, term265994.getClass(), "fromClassicAddress", "SfjOvqPCwx");
        setField(term265994, term265994.getClass(), "trustlineIssuerClassicAddress", "rinBVtrpcr");
        setField(term265994, term265994.getClass(), "currencyName", "KjCvQWfqew");
        setField(term265994, term265994.getClass(), "currencyNameForProcess", "WewLrXvLmC");
        setField(term265994, term265994.getClass(), "amount", "vbEYtFntxd");
        setBooleanField(term265994, term265994.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term265994, term265994.getClass(), "useBlacklist", false);
        setField(term265994, term265994.getClass(), "maximumTrustlines", term266112);
        setField(term265994, term265994.getClass(), "dropType", enum536);
        setField(term265994, term265994.getClass(), "failReason", "ZiYiKyRQTQ");
        setField(term265994, term265994.getClass(), "minBalance", "aaACqoZRFl");
        setField(term265994, term265994.getClass(), "maxBalance", "CtIecpnHzx");
        setField(term265994, term265994.getClass(), "totalBlacklisted", term266162);
        setField(term265994, term265994.getClass(), "maxXrpFeePerTransaction", "lgGoogCJeG");
        setField(term265994, term265994.getClass(), "totalRecipients", term266176);
        setField(term265994, term265994.getClass(), "paymentType", enum537);
        setField(term265994, term265994.getClass(), "snapshotTrustlineIssuerClassicAddress", "EyskfGpFOR");
        setField(term265994, term265994.getClass(), "snapshotCurrencyName", "eEKpyfnNFi");
        setField(term265994, term265994.getClass(), "nftIssuingAddress", "WjMAISAxtn");
        setField(term265994, term265994.getClass(), "nftTaxon", "GiDsfCiYsm");
        setField(term265994, term265994.getClass(), "scheduleStatus", enum538);
        setField(term265994, term265994.getClass(), "fromScheduleId", term266254);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RuvnkQFdLv";
        callMethod(klass, "setFailReason", argTypes, term265994, args);
    }

};


