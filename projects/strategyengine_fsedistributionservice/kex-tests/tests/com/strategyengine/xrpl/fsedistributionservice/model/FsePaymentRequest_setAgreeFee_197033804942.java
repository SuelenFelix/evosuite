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
import java.lang.Boolean;

public class FsePaymentRequest_setAgreeFee_197033804942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term389090;
     Object term389326;

    public FsePaymentRequest_setAgreeFee_197033804942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term389139 = new ArrayList();
        ((ArrayList) term389139).add("mLQxMcHGBW");
        ((ArrayList) term389139).add("bRjKFxPvcV");
        ((ArrayList) term389139).add("KVGSqTwbwl");
        Long term389244 = new Long(8650489888932702486L);
        Class<? extends Object> term389449 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term389448 = ((Class) term389449).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term389448).setAccessible(true);
        Object enum744 = ((Field) term389448).get((Object) null);
        Long term389298 = new Long(-723301799439650268L);
        Class<? extends Object> term389877 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term389876 = ((Class) term389877).getDeclaredField((String) "MONTHLY");
        ((Field) term389876).setAccessible(true);
        Object enum745 = ((Field) term389876).get((Object) null);
        term389090 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term389191 = newInstance(Class.forName("java.util.Date"));
        Object term389311 = newInstance(Class.forName("java.util.Date"));
        setField(term389090, term389090.getClass(), "memo", "FIbTelFONG");
        setField(term389090, term389090.getClass(), "fromClassicAddress", "wJHjFknbbB");
        setField(term389090, term389090.getClass(), "fromSigningPublicKey", "xFPxQbDlQc");
        setField(term389090, term389090.getClass(), "fromPrivateKey", "YPDHBTLaVR");
        setField(term389090, term389090.getClass(), "toClassicAddresses", term389139);
        setField(term389090, term389090.getClass(), "amount", "KUxkASzarE");
        setLongField(term389191, term389191.getClass(), "fastTime", 1455245805294L);
        setField(term389191, term389191.getClass(), "cdate", null);
        setField(term389090, term389090.getClass(), "startTime", term389191);
        setField(term389090, term389090.getClass(), "destinationTag", "uzLvnPKgLL");
        setField(term389090, term389090.getClass(), "trustlineIssuerClassicAddress", "aQPqpljoGP");
        setField(term389090, term389090.getClass(), "currencyName", "wEvLiMyHnX");
        setBooleanField(term389090, term389090.getClass(), "agreeFee", false);
        setField(term389090, term389090.getClass(), "maxXrpFeePerTransaction", "hcggLiqWYZ");
        setBooleanField(term389090, term389090.getClass(), "globalIdVerified", false);
        setBooleanField(term389090, term389090.getClass(), "useBlacklist", true);
        setField(term389090, term389090.getClass(), "retryOfId", term389244);
        setField(term389090, term389090.getClass(), "paymentType", enum744);
        setField(term389090, term389090.getClass(), "snapshotTrustlineIssuerClassicAddress", "cLJRzvSbSN");
        setField(term389090, term389090.getClass(), "snapshotCurrencyName", "tXtxReOADl");
        setField(term389090, term389090.getClass(), "nftIssuingAddress", "NBwtdrTbSF");
        setField(term389090, term389090.getClass(), "nftTaxon", term389298);
        setField(term389090, term389090.getClass(), "frequency", enum745);
        setLongField(term389311, term389311.getClass(), "fastTime", 1697849473045L);
        setField(term389311, term389311.getClass(), "cdate", null);
        setField(term389090, term389090.getClass(), "repeatUntilDate", term389311);
        setField(term389090, term389090.getClass(), "email", "OkpqNhKEro");
        setBooleanField(term389090, term389090.getClass(), "autoApprove", true);
        term389326 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term389326;
        callMethod(klass, "setAgreeFee", argTypes, term389090, args);
    }

};


