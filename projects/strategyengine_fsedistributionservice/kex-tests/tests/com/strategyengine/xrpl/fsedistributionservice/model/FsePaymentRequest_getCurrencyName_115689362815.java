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

public class FsePaymentRequest_getCurrencyName_115689362815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term357017;

    public FsePaymentRequest_getCurrencyName_115689362815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term357066 = new ArrayList();
        ((ArrayList) term357066).add("LGwSNWIJXQ");
        ((ArrayList) term357066).add("WcGFvwYDik");
        ((ArrayList) term357066).add("CoLFqLIXQj");
        ((ArrayList) term357066).add("kMBzkwoyLv");
        ((ArrayList) term357066).add("HSeKlRlkYL");
        ((ArrayList) term357066).add("BtDbrubSGw");
        ((ArrayList) term357066).add("PRVkoUMIaY");
        Long term357219 = new Long(-1884609063652624817L);
        Class<? extends Object> term357463 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term357462 = ((Class) term357463).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term357462).setAccessible(true);
        Object enum692 = ((Field) term357462).get((Object) null);
        Long term357273 = new Long(4110677574531044171L);
        Class<? extends Object> term357891 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term357890 = ((Class) term357891).getDeclaredField((String) "ANNUALLY");
        ((Field) term357890).setAccessible(true);
        Object enum693 = ((Field) term357890).get((Object) null);
        term357017 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term357166 = newInstance(Class.forName("java.util.Date"));
        Object term357287 = newInstance(Class.forName("java.util.Date"));
        setField(term357017, term357017.getClass(), "memo", "iGIJSOVbLk");
        setField(term357017, term357017.getClass(), "fromClassicAddress", "MfGUuaFsKh");
        setField(term357017, term357017.getClass(), "fromSigningPublicKey", "kFUIISIsgC");
        setField(term357017, term357017.getClass(), "fromPrivateKey", "LOiINrsGIv");
        setField(term357017, term357017.getClass(), "toClassicAddresses", term357066);
        setField(term357017, term357017.getClass(), "amount", "xPSCSnxHTM");
        setLongField(term357166, term357166.getClass(), "fastTime", 1595892323510L);
        setField(term357166, term357166.getClass(), "cdate", null);
        setField(term357017, term357017.getClass(), "startTime", term357166);
        setField(term357017, term357017.getClass(), "destinationTag", "UOeypJogpl");
        setField(term357017, term357017.getClass(), "trustlineIssuerClassicAddress", "mjUUYdpjfv");
        setField(term357017, term357017.getClass(), "currencyName", "prtrXFIoiL");
        setBooleanField(term357017, term357017.getClass(), "agreeFee", false);
        setField(term357017, term357017.getClass(), "maxXrpFeePerTransaction", "bgbZhsprUy");
        setBooleanField(term357017, term357017.getClass(), "globalIdVerified", true);
        setBooleanField(term357017, term357017.getClass(), "useBlacklist", true);
        setField(term357017, term357017.getClass(), "retryOfId", term357219);
        setField(term357017, term357017.getClass(), "paymentType", enum692);
        setField(term357017, term357017.getClass(), "snapshotTrustlineIssuerClassicAddress", "TgNvNQktbD");
        setField(term357017, term357017.getClass(), "snapshotCurrencyName", "aowlHueamt");
        setField(term357017, term357017.getClass(), "nftIssuingAddress", "EjbERDtyDN");
        setField(term357017, term357017.getClass(), "nftTaxon", term357273);
        setField(term357017, term357017.getClass(), "frequency", enum693);
        setLongField(term357287, term357287.getClass(), "fastTime", 1483532063102L);
        setField(term357287, term357287.getClass(), "cdate", null);
        setField(term357017, term357017.getClass(), "repeatUntilDate", term357287);
        setField(term357017, term357017.getClass(), "email", "FqtPXJpAIf");
        setBooleanField(term357017, term357017.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCurrencyName", argTypes, term357017, args);
    }

};


