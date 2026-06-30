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

public class FsePaymentRequest_canEqual_11435025603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term342648;
     Object term342873;

    public FsePaymentRequest_canEqual_11435025603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term342697 = new ArrayList();
        ((ArrayList) term342697).add("QPBMeaIigj");
        ((ArrayList) term342697).add("BGSrfrYURh");
        Long term342790 = new Long(682045578778432659L);
        Class<? extends Object> term342985 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term342984 = ((Class) term342985).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term342984).setAccessible(true);
        Object enum668 = ((Field) term342984).get((Object) null);
        Long term342844 = new Long(-1059217926759861865L);
        Class<? extends Object> term343413 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term343412 = ((Class) term343413).getDeclaredField((String) "ANNUALLY");
        ((Field) term343412).setAccessible(true);
        Object enum669 = ((Field) term343412).get((Object) null);
        term342648 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term342737 = newInstance(Class.forName("java.util.Date"));
        Object term342858 = newInstance(Class.forName("java.util.Date"));
        setField(term342648, term342648.getClass(), "memo", "kaAoZDhQvv");
        setField(term342648, term342648.getClass(), "fromClassicAddress", "yKFwbIOjQp");
        setField(term342648, term342648.getClass(), "fromSigningPublicKey", "DgxpRIGTJP");
        setField(term342648, term342648.getClass(), "fromPrivateKey", "ivdqsLhJhX");
        setField(term342648, term342648.getClass(), "toClassicAddresses", term342697);
        setField(term342648, term342648.getClass(), "amount", "HzAskiKTsr");
        setLongField(term342737, term342737.getClass(), "fastTime", 1659474760176L);
        setField(term342737, term342737.getClass(), "cdate", null);
        setField(term342648, term342648.getClass(), "startTime", term342737);
        setField(term342648, term342648.getClass(), "destinationTag", "KsjHvhvzcS");
        setField(term342648, term342648.getClass(), "trustlineIssuerClassicAddress", "ksazOmFJDf");
        setField(term342648, term342648.getClass(), "currencyName", "YTQAyFGSot");
        setBooleanField(term342648, term342648.getClass(), "agreeFee", false);
        setField(term342648, term342648.getClass(), "maxXrpFeePerTransaction", "GrdIHGdREZ");
        setBooleanField(term342648, term342648.getClass(), "globalIdVerified", false);
        setBooleanField(term342648, term342648.getClass(), "useBlacklist", false);
        setField(term342648, term342648.getClass(), "retryOfId", term342790);
        setField(term342648, term342648.getClass(), "paymentType", enum668);
        setField(term342648, term342648.getClass(), "snapshotTrustlineIssuerClassicAddress", "lWuIErfrpX");
        setField(term342648, term342648.getClass(), "snapshotCurrencyName", "lNaxalwwFL");
        setField(term342648, term342648.getClass(), "nftIssuingAddress", "IgfnslgZTI");
        setField(term342648, term342648.getClass(), "nftTaxon", term342844);
        setField(term342648, term342648.getClass(), "frequency", enum669);
        setLongField(term342858, term342858.getClass(), "fastTime", 1431597537131L);
        setField(term342858, term342858.getClass(), "cdate", null);
        setField(term342648, term342648.getClass(), "repeatUntilDate", term342858);
        setField(term342648, term342648.getClass(), "email", "RMVwTznaVb");
        setBooleanField(term342648, term342648.getClass(), "autoApprove", true);
        term342873 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term342873;
        callMethod(klass, "canEqual", argTypes, term342648, args);
    }

};


