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
import java.lang.Integer;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_fromClassicAddress_21387701522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term415944;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_fromClassicAddress_21387701522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term416033 = new Integer(-1945706126);
        Double term416035 = new Double(0.40598298281353484);
        Double term416037 = new Double(0.3710067290060264);
        Long term416051 = new Long(-590628922285125667L);
        Class<? extends Object> term416214 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term416213 = ((Class) term416214).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term416213).setAccessible(true);
        Object enum775 = ((Field) term416213).get((Object) null);
        Class<? extends Object> term416632 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term416631 = ((Class) term416632).getDeclaredField((String) "MONTHLY");
        ((Field) term416631).setAccessible(true);
        Object enum776 = ((Field) term416631).get((Object) null);
        term415944 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        Object term416093 = newInstance(Class.forName("java.util.Date"));
        Object term416106 = newInstance(Class.forName("java.util.Date"));
        setField(term415944, term415944.getClass(), "memo", "TmSTKXeNPY");
        setField(term415944, term415944.getClass(), "fromClassicAddress", "yApToAwVAg");
        setField(term415944, term415944.getClass(), "fromSigningPublicKey", "hGgExrMnNT");
        setField(term415944, term415944.getClass(), "fromPrivateKey", "SZnouRvcAU");
        setField(term415944, term415944.getClass(), "trustlineIssuerClassicAddress", "lpSxrqZGOz");
        setField(term415944, term415944.getClass(), "currencyName", "JBbUvxQxnk");
        setField(term415944, term415944.getClass(), "amount", "pwqZhDkDOg");
        setBooleanField(term415944, term415944.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term415944, term415944.getClass(), "globalIdVerified", true);
        setBooleanField(term415944, term415944.getClass(), "useBlacklist", false);
        setBooleanField(term415944, term415944.getClass(), "agreeFee", false);
        setField(term415944, term415944.getClass(), "maximumTrustlines", term416033);
        setField(term415944, term415944.getClass(), "minBalance", term416035);
        setField(term415944, term415944.getClass(), "maxBalance", term416037);
        setField(term415944, term415944.getClass(), "maxXrpFeePerTransaction", "nIusisDwZi");
        setField(term415944, term415944.getClass(), "retryOfId", term416051);
        setField(term415944, term415944.getClass(), "paymentType", enum775);
        setField(term415944, term415944.getClass(), "snapshotTrustlineIssuerClassicAddress", "WFndbCMNJf");
        setField(term415944, term415944.getClass(), "snapshotCurrencyName", "EWuRDOuoGG");
        setLongField(term416093, term416093.getClass(), "fastTime", 1732536958590L);
        setField(term416093, term416093.getClass(), "cdate", null);
        setField(term415944, term415944.getClass(), "startTime", term416093);
        setField(term415944, term415944.getClass(), "frequency", enum776);
        setLongField(term416106, term416106.getClass(), "fastTime", 1615529529973L);
        setField(term416106, term416106.getClass(), "cdate", null);
        setField(term415944, term415944.getClass(), "repeatUntilDate", term416106);
        setField(term415944, term415944.getClass(), "email", "BmwRvtFFJx");
        setBooleanField(term415944, term415944.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "cEZqVAfleB";
        callMethod(klass, "fromClassicAddress", argTypes, term415944, args);
    }

};


