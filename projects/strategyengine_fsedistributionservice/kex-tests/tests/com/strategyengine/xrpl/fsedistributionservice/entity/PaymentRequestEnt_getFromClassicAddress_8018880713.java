package com.strategyengine.xrpl.fsedistributionservice.entity;

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
import static com.strategyengine.xrpl.fsedistributionservice.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Integer;

public class PaymentRequestEnt_getFromClassicAddress_8018880713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130018;

    public PaymentRequestEnt_getFromClassicAddress_8018880713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term130019 = new Long(4811527754205378980L);
        Class<? extends Object> term130345 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term130344 = ((Class) term130345).getDeclaredField((String) "POPULATING_ADDRESSES");
        ((Field) term130344).setAccessible(true);
        Object enum232 = ((Field) term130344).get((Object) null);
        Class<? extends Object> term130887 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term130886 = ((Class) term130887).getDeclaredField((String) "FLAT");
        ((Field) term130886).setAccessible(true);
        Object enum233 = ((Field) term130886).get((Object) null);
        Boolean term130191 = new Boolean(false);
        Boolean term130193 = new Boolean(true);
        Integer term130195 = new Integer(941650513);
        Class<? extends Object> term131261 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term131260 = ((Class) term131261).getDeclaredField((String) "TRUSTLINE");
        ((Field) term131260).setAccessible(true);
        Object enum234 = ((Field) term131260).get((Object) null);
        Long term130282 = new Long(9174730812791817537L);
        Long term130296 = new Long(8024477479047145752L);
        Boolean term130310 = new Boolean(false);
        term130018 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term130045 = newInstance(Class.forName("java.util.Date"));
        Object term130047 = newInstance(Class.forName("java.util.Date"));
        Object term130049 = newInstance(Class.forName("java.util.Date"));
        setField(term130018, term130018.getClass(), "id", term130019);
        setField(term130018, term130018.getClass(), "environment", "yjqoDeLBLg");
        setField(term130018, term130018.getClass(), "populateEnvironment", "DCepDqVwas");
        setLongField(term130045, term130045.getClass(), "fastTime", 1887042175557L);
        setField(term130045, term130045.getClass(), "cdate", null);
        setField(term130018, term130018.getClass(), "createDate", term130045);
        setLongField(term130047, term130047.getClass(), "fastTime", 1278344008475L);
        setField(term130047, term130047.getClass(), "cdate", null);
        setField(term130018, term130018.getClass(), "updateDate", term130047);
        setLongField(term130049, term130049.getClass(), "fastTime", 1403931113861L);
        setField(term130049, term130049.getClass(), "cdate", null);
        setField(term130018, term130018.getClass(), "startTime", term130049);
        setField(term130018, term130018.getClass(), "status", enum232);
        setField(term130018, term130018.getClass(), "fromClassicAddress", "wKIBUlfNCx");
        setField(term130018, term130018.getClass(), "fromSigningPublicKey", "iGfMUWRvod");
        setField(term130018, term130018.getClass(), "fromPrivateKey", "zUXaSvayQe");
        setField(term130018, term130018.getClass(), "trustlineIssuerClassicAddress", "bPVcnnQPSC");
        setField(term130018, term130018.getClass(), "currencyName", "PQLyoEKWSa");
        setField(term130018, term130018.getClass(), "snapshotTrustlineIssuerClassicAddress", "HOgkhttJZS");
        setField(term130018, term130018.getClass(), "snapshotCurrencyName", "goqNSmXSSS");
        setField(term130018, term130018.getClass(), "currencyNameForProcess", "AkViBLdqXM");
        setField(term130018, term130018.getClass(), "amount", "UlxGFzEifL");
        setField(term130018, term130018.getClass(), "paymentType", enum233);
        setField(term130018, term130018.getClass(), "newTrustlinesOnly", term130191);
        setField(term130018, term130018.getClass(), "useBlacklist", term130193);
        setField(term130018, term130018.getClass(), "maximumTrustlines", term130195);
        setField(term130018, term130018.getClass(), "dropType", enum234);
        setField(term130018, term130018.getClass(), "lockUuid", "HilHTbDKDF");
        setField(term130018, term130018.getClass(), "failReason", "IaEqlVwmNS");
        setField(term130018, term130018.getClass(), "feesPaid", "ljNOgdPWrL");
        setField(term130018, term130018.getClass(), "minBalance", "oBlIZiyRMS");
        setField(term130018, term130018.getClass(), "maxBalance", "QUYAkhtCNh");
        setField(term130018, term130018.getClass(), "maxXrpFeePerTransaction", "kOaAQOLyqd");
        setField(term130018, term130018.getClass(), "retryOfId", term130282);
        setField(term130018, term130018.getClass(), "nftIssuerAddress", "ICBWiKaeHC");
        setField(term130018, term130018.getClass(), "nftTaxon", term130296);
        setField(term130018, term130018.getClass(), "contactEmail", "WAljagiCzu");
        setField(term130018, term130018.getClass(), "autoApprove", term130310);
        setField(term130018, term130018.getClass(), "memo", "XKMXfDZajw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFromClassicAddress", argTypes, term130018, args);
    }

};


