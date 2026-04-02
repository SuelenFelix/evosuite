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

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_fromSigningPublicKey_19634988393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term417044;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_fromSigningPublicKey_19634988393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term417133 = new Integer(1152356969);
        Double term417135 = new Double(0.7818620200430967);
        Double term417137 = new Double(0.04640022995603543);
        Long term417151 = new Long(6167026289140715860L);
        Class<? extends Object> term417304 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term417303 = ((Class) term417304).getDeclaredField((String) "FLAT");
        ((Field) term417303).setAccessible(true);
        Object enum777 = ((Field) term417303).get((Object) null);
        Class<? extends Object> term417698 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term417697 = ((Class) term417698).getDeclaredField((String) "DAILY");
        ((Field) term417697).setAccessible(true);
        Object enum778 = ((Field) term417697).get((Object) null);
        term417044 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        Object term417185 = newInstance(Class.forName("java.util.Date"));
        Object term417196 = newInstance(Class.forName("java.util.Date"));
        setField(term417044, term417044.getClass(), "memo", "nhLTWbgTqe");
        setField(term417044, term417044.getClass(), "fromClassicAddress", "XVSaLwDWRY");
        setField(term417044, term417044.getClass(), "fromSigningPublicKey", "lpVRiaBSuj");
        setField(term417044, term417044.getClass(), "fromPrivateKey", "KXTswwnaBw");
        setField(term417044, term417044.getClass(), "trustlineIssuerClassicAddress", "ISWqUwSggV");
        setField(term417044, term417044.getClass(), "currencyName", "AUPNEcHypG");
        setField(term417044, term417044.getClass(), "amount", "UmeqMAzUwa");
        setBooleanField(term417044, term417044.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term417044, term417044.getClass(), "globalIdVerified", false);
        setBooleanField(term417044, term417044.getClass(), "useBlacklist", true);
        setBooleanField(term417044, term417044.getClass(), "agreeFee", false);
        setField(term417044, term417044.getClass(), "maximumTrustlines", term417133);
        setField(term417044, term417044.getClass(), "minBalance", term417135);
        setField(term417044, term417044.getClass(), "maxBalance", term417137);
        setField(term417044, term417044.getClass(), "maxXrpFeePerTransaction", "PNFDIHfYEp");
        setField(term417044, term417044.getClass(), "retryOfId", term417151);
        setField(term417044, term417044.getClass(), "paymentType", enum777);
        setField(term417044, term417044.getClass(), "snapshotTrustlineIssuerClassicAddress", "nGniXvSdtW");
        setField(term417044, term417044.getClass(), "snapshotCurrencyName", "quVglHvsIx");
        setLongField(term417185, term417185.getClass(), "fastTime", 1524215744045L);
        setField(term417185, term417185.getClass(), "cdate", null);
        setField(term417044, term417044.getClass(), "startTime", term417185);
        setField(term417044, term417044.getClass(), "frequency", enum778);
        setLongField(term417196, term417196.getClass(), "fastTime", 1385857679967L);
        setField(term417196, term417196.getClass(), "cdate", null);
        setField(term417044, term417044.getClass(), "repeatUntilDate", term417196);
        setField(term417044, term417044.getClass(), "email", "JXODZCOpvf");
        setBooleanField(term417044, term417044.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ycTiGquQOQ";
        callMethod(klass, "fromSigningPublicKey", argTypes, term417044, args);
    }

};


