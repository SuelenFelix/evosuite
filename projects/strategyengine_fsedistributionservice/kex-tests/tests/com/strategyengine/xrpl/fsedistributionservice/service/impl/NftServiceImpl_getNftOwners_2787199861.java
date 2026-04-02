package com.strategyengine.xrpl.fsedistributionservice.service.impl;

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
import static com.strategyengine.xrpl.fsedistributionservice.service.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Long;
import java.lang.String;

public class NftServiceImpl_getNftOwners_2787199861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3635;

    public NftServiceImpl_getNftOwners_2787199861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3684 = new ArrayList();
        ((ArrayList) term3684).add("xLbjWUgOIL");
        ((ArrayList) term3684).add("jDtqGUpnZN");
        ((ArrayList) term3684).add("nGKItKLYNC");
        ((ArrayList) term3684).add("UiUYnPrcCi");
        ((ArrayList) term3684).add("UoYtihxVaS");
        ((ArrayList) term3684).add("JDswTTCZHV");
        ((ArrayList) term3684).add("onpbIeEKoi");
        ((ArrayList) term3684).add("YRHGsAkhxb");
        ((ArrayList) term3684).add("ffYhPOzlUs");
        Long term3861 = new Long(5127676408959197577L);
        Class<? extends Object> term4114 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term4113 = ((Class) term4114).getDeclaredField((String) "FLAT");
        ((Field) term4113).setAccessible(true);
        Object enum6 = ((Field) term4113).get((Object) null);
        Long term3907 = new Long(-6573104506744284592L);
        Class<? extends Object> term4560 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term4559 = ((Class) term4560).getDeclaredField((String) "DAILY");
        ((Field) term4559).setAccessible(true);
        Object enum7 = ((Field) term4559).get((Object) null);
        term3635 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term3808 = newInstance(Class.forName("java.util.Date"));
        Object term3918 = newInstance(Class.forName("java.util.Date"));
        setField(term3635, term3635.getClass(), "memo", "BndsHwAFMv");
        setField(term3635, term3635.getClass(), "fromClassicAddress", "GzFkzHGYFt");
        setField(term3635, term3635.getClass(), "fromSigningPublicKey", "tShwQLRGNe");
        setField(term3635, term3635.getClass(), "fromPrivateKey", "LvtrsXUliU");
        setField(term3635, term3635.getClass(), "toClassicAddresses", term3684);
        setField(term3635, term3635.getClass(), "amount", "MLqYREekMl");
        setLongField(term3808, term3808.getClass(), "fastTime", 1429023851389L);
        setField(term3808, term3808.getClass(), "cdate", null);
        setField(term3635, term3635.getClass(), "startTime", term3808);
        setField(term3635, term3635.getClass(), "destinationTag", "ytSBIKXogI");
        setField(term3635, term3635.getClass(), "trustlineIssuerClassicAddress", "nHXjMycHlU");
        setField(term3635, term3635.getClass(), "currencyName", "ieCtQFdkii");
        setBooleanField(term3635, term3635.getClass(), "agreeFee", false);
        setField(term3635, term3635.getClass(), "maxXrpFeePerTransaction", "dEnhdmILtU");
        setBooleanField(term3635, term3635.getClass(), "globalIdVerified", false);
        setBooleanField(term3635, term3635.getClass(), "useBlacklist", false);
        setField(term3635, term3635.getClass(), "retryOfId", term3861);
        setField(term3635, term3635.getClass(), "paymentType", enum6);
        setField(term3635, term3635.getClass(), "snapshotTrustlineIssuerClassicAddress", "hoicvmsovO");
        setField(term3635, term3635.getClass(), "snapshotCurrencyName", "eqJfYWRaEL");
        setField(term3635, term3635.getClass(), "nftIssuingAddress", "fhkbdRViHi");
        setField(term3635, term3635.getClass(), "nftTaxon", term3907);
        setField(term3635, term3635.getClass(), "frequency", enum7);
        setLongField(term3918, term3918.getClass(), "fastTime", 1495357463288L);
        setField(term3918, term3918.getClass(), "cdate", null);
        setField(term3635, term3635.getClass(), "repeatUntilDate", term3918);
        setField(term3635, term3635.getClass(), "email", "uWHnvSvaPl");
        setBooleanField(term3635, term3635.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.service.impl.NftServiceImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Object[] args = new Object[1];
        args[0] = term3635;
        callMethod(klass, "getNftOwners", argTypes, null, args);
    }

};


