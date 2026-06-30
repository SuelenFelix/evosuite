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

public class FsePaymentRequest_isAutoApprove_85769910529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term374289;

    public FsePaymentRequest_isAutoApprove_85769910529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term374338 = new ArrayList();
        Long term374407 = new Long(-1622196407723421321L);
        Class<? extends Object> term374571 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term374570 = ((Class) term374571).getDeclaredField((String) "FLAT");
        ((Field) term374570).setAccessible(true);
        Object enum720 = ((Field) term374570).get((Object) null);
        Long term374453 = new Long(5587445443876887300L);
        Class<? extends Object> term374975 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term374974 = ((Class) term374975).getDeclaredField((String) "WEEKLY");
        ((Field) term374974).setAccessible(true);
        Object enum721 = ((Field) term374974).get((Object) null);
        term374289 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term374354 = newInstance(Class.forName("java.util.Date"));
        Object term374465 = newInstance(Class.forName("java.util.Date"));
        setField(term374289, term374289.getClass(), "memo", "vdoyqGUjCc");
        setField(term374289, term374289.getClass(), "fromClassicAddress", "IpFtQrAOzn");
        setField(term374289, term374289.getClass(), "fromSigningPublicKey", "BjfkRThhpT");
        setField(term374289, term374289.getClass(), "fromPrivateKey", "whofJLshdK");
        setField(term374289, term374289.getClass(), "toClassicAddresses", term374338);
        setField(term374289, term374289.getClass(), "amount", "HzLLlFEgVo");
        setLongField(term374354, term374354.getClass(), "fastTime", 1285430389159L);
        setField(term374354, term374354.getClass(), "cdate", null);
        setField(term374289, term374289.getClass(), "startTime", term374354);
        setField(term374289, term374289.getClass(), "destinationTag", "dtousSFtEL");
        setField(term374289, term374289.getClass(), "trustlineIssuerClassicAddress", "AfjNWQpirg");
        setField(term374289, term374289.getClass(), "currencyName", "PcrhWPBqDM");
        setBooleanField(term374289, term374289.getClass(), "agreeFee", false);
        setField(term374289, term374289.getClass(), "maxXrpFeePerTransaction", "ieYPDqxhrJ");
        setBooleanField(term374289, term374289.getClass(), "globalIdVerified", false);
        setBooleanField(term374289, term374289.getClass(), "useBlacklist", false);
        setField(term374289, term374289.getClass(), "retryOfId", term374407);
        setField(term374289, term374289.getClass(), "paymentType", enum720);
        setField(term374289, term374289.getClass(), "snapshotTrustlineIssuerClassicAddress", "EjLCKTHFYE");
        setField(term374289, term374289.getClass(), "snapshotCurrencyName", "mjbtnEEDoD");
        setField(term374289, term374289.getClass(), "nftIssuingAddress", "HkXhPRkQYt");
        setField(term374289, term374289.getClass(), "nftTaxon", term374453);
        setField(term374289, term374289.getClass(), "frequency", enum721);
        setLongField(term374465, term374465.getClass(), "fastTime", 1671688617204L);
        setField(term374465, term374465.getClass(), "cdate", null);
        setField(term374289, term374289.getClass(), "repeatUntilDate", term374465);
        setField(term374289, term374289.getClass(), "email", "tLRwmbFiCA");
        setBooleanField(term374289, term374289.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAutoApprove", argTypes, term374289, args);
    }

};


