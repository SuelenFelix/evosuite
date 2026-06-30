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

public class PaymentRequestEnt_PaymentRequestEntBuilder_id_13279689161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48571;
     Object term48865;

    public PaymentRequestEnt_PaymentRequestEntBuilder_id_13279689161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term48572 = new Long(-9204303423581447271L);
        Class<? extends Object> term48992 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term48991 = ((Class) term48992).getDeclaredField((String) "COMPLETE");
        ((Field) term48991).setAccessible(true);
        Object enum91 = ((Field) term48991).get((Object) null);
        Class<? extends Object> term49522 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term49521 = ((Class) term49522).getDeclaredField((String) "FLAT");
        ((Field) term49521).setAccessible(true);
        Object enum92 = ((Field) term49521).get((Object) null);
        Boolean term48732 = new Boolean(false);
        Boolean term48734 = new Boolean(false);
        Integer term48736 = new Integer(-1016503459);
        Class<? extends Object> term49896 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term49895 = ((Class) term49896).getDeclaredField((String) "TRUSTLINE");
        ((Field) term49895).setAccessible(true);
        Object enum93 = ((Field) term49895).get((Object) null);
        Long term48823 = new Long(6248239231585852341L);
        Long term48837 = new Long(-88538481937688851L);
        Boolean term48851 = new Boolean(false);
        term48571 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        Object term48598 = newInstance(Class.forName("java.util.Date"));
        Object term48600 = newInstance(Class.forName("java.util.Date"));
        Object term48602 = newInstance(Class.forName("java.util.Date"));
        setField(term48571, term48571.getClass(), "id", term48572);
        setField(term48571, term48571.getClass(), "environment", "WXcZEtUKlI");
        setField(term48571, term48571.getClass(), "populateEnvironment", "IkpjUOuWQU");
        setLongField(term48598, term48598.getClass(), "fastTime", 1423095600176L);
        setField(term48598, term48598.getClass(), "cdate", null);
        setField(term48571, term48571.getClass(), "createDate", term48598);
        setLongField(term48600, term48600.getClass(), "fastTime", 1890789814165L);
        setField(term48600, term48600.getClass(), "cdate", null);
        setField(term48571, term48571.getClass(), "updateDate", term48600);
        setLongField(term48602, term48602.getClass(), "fastTime", 1368069438412L);
        setField(term48602, term48602.getClass(), "cdate", null);
        setField(term48571, term48571.getClass(), "startTime", term48602);
        setField(term48571, term48571.getClass(), "status", enum91);
        setField(term48571, term48571.getClass(), "fromClassicAddress", "boSSpezHeU");
        setField(term48571, term48571.getClass(), "fromSigningPublicKey", "OUeBWNTQDh");
        setField(term48571, term48571.getClass(), "fromPrivateKey", "gltJarNuUk");
        setField(term48571, term48571.getClass(), "trustlineIssuerClassicAddress", "ZwZIDwYcSW");
        setField(term48571, term48571.getClass(), "currencyName", "sOdkipUKRu");
        setField(term48571, term48571.getClass(), "snapshotTrustlineIssuerClassicAddress", "oKwCDqywym");
        setField(term48571, term48571.getClass(), "snapshotCurrencyName", "zjZYTddemL");
        setField(term48571, term48571.getClass(), "currencyNameForProcess", "QtrylgCLiF");
        setField(term48571, term48571.getClass(), "amount", "orEuhCStGM");
        setField(term48571, term48571.getClass(), "paymentType", enum92);
        setField(term48571, term48571.getClass(), "newTrustlinesOnly", term48732);
        setField(term48571, term48571.getClass(), "useBlacklist", term48734);
        setField(term48571, term48571.getClass(), "maximumTrustlines", term48736);
        setField(term48571, term48571.getClass(), "dropType", enum93);
        setField(term48571, term48571.getClass(), "lockUuid", "HhEaSXWvrY");
        setField(term48571, term48571.getClass(), "failReason", "CVRGEomOth");
        setField(term48571, term48571.getClass(), "feesPaid", "vSeruUyNWX");
        setField(term48571, term48571.getClass(), "minBalance", "UkKvaeJfEC");
        setField(term48571, term48571.getClass(), "maxBalance", "WPxXsahPRq");
        setField(term48571, term48571.getClass(), "maxXrpFeePerTransaction", "IENRuqmwUU");
        setField(term48571, term48571.getClass(), "retryOfId", term48823);
        setField(term48571, term48571.getClass(), "nftIssuerAddress", "GsWxOwXvSu");
        setField(term48571, term48571.getClass(), "nftTaxon", term48837);
        setField(term48571, term48571.getClass(), "contactEmail", "bKBSncrMEZ");
        setField(term48571, term48571.getClass(), "autoApprove", term48851);
        setField(term48571, term48571.getClass(), "memo", "yeSXGqQExb");
        term48865 = new Long(4069264186851023313L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term48865;
        callMethod(klass, "id", argTypes, term48571, args);
    }

};


