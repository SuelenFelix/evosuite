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

public class FsePaymentRequest_setEmail_141190816854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403588;

    public FsePaymentRequest_setEmail_141190816854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term403637 = new ArrayList();
        ((ArrayList) term403637).add("JqZttEKFir");
        ((ArrayList) term403637).add("gWWBhcbddH");
        Long term403730 = new Long(928851110761968932L);
        Class<? extends Object> term403936 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term403935 = ((Class) term403936).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term403935).setAccessible(true);
        Object enum769 = ((Field) term403935).get((Object) null);
        Long term403784 = new Long(3746407492061591608L);
        Class<? extends Object> term404364 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term404363 = ((Class) term404364).getDeclaredField((String) "ANNUALLY");
        ((Field) term404363).setAccessible(true);
        Object enum770 = ((Field) term404363).get((Object) null);
        term403588 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term403677 = newInstance(Class.forName("java.util.Date"));
        Object term403798 = newInstance(Class.forName("java.util.Date"));
        setField(term403588, term403588.getClass(), "memo", "SQCgWvooUP");
        setField(term403588, term403588.getClass(), "fromClassicAddress", "TrYZClWzDl");
        setField(term403588, term403588.getClass(), "fromSigningPublicKey", "wojFGuqsty");
        setField(term403588, term403588.getClass(), "fromPrivateKey", "URJQtMoail");
        setField(term403588, term403588.getClass(), "toClassicAddresses", term403637);
        setField(term403588, term403588.getClass(), "amount", "VYWHwcBEgR");
        setLongField(term403677, term403677.getClass(), "fastTime", 1446494290197L);
        setField(term403677, term403677.getClass(), "cdate", null);
        setField(term403588, term403588.getClass(), "startTime", term403677);
        setField(term403588, term403588.getClass(), "destinationTag", "NiLWicWdLg");
        setField(term403588, term403588.getClass(), "trustlineIssuerClassicAddress", "ArFHobFNWr");
        setField(term403588, term403588.getClass(), "currencyName", "drPIYSWWXx");
        setBooleanField(term403588, term403588.getClass(), "agreeFee", true);
        setField(term403588, term403588.getClass(), "maxXrpFeePerTransaction", "WzLxpLKFtm");
        setBooleanField(term403588, term403588.getClass(), "globalIdVerified", true);
        setBooleanField(term403588, term403588.getClass(), "useBlacklist", false);
        setField(term403588, term403588.getClass(), "retryOfId", term403730);
        setField(term403588, term403588.getClass(), "paymentType", enum769);
        setField(term403588, term403588.getClass(), "snapshotTrustlineIssuerClassicAddress", "msvJdZPPTe");
        setField(term403588, term403588.getClass(), "snapshotCurrencyName", "wbmmtLxBzZ");
        setField(term403588, term403588.getClass(), "nftIssuingAddress", "vrKiCEvbcr");
        setField(term403588, term403588.getClass(), "nftTaxon", term403784);
        setField(term403588, term403588.getClass(), "frequency", enum770);
        setLongField(term403798, term403798.getClass(), "fastTime", 1657360060171L);
        setField(term403798, term403798.getClass(), "cdate", null);
        setField(term403588, term403588.getClass(), "repeatUntilDate", term403798);
        setField(term403588, term403588.getClass(), "email", "QsCuIBxGhs");
        setBooleanField(term403588, term403588.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "bZQNbQIhIk";
        callMethod(klass, "setEmail", argTypes, term403588, args);
    }

};


