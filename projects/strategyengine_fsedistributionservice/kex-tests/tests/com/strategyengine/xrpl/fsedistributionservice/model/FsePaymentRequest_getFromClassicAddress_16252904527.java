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

public class FsePaymentRequest_getFromClassicAddress_16252904527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term347211;

    public FsePaymentRequest_getFromClassicAddress_16252904527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term347260 = new ArrayList();
        ((ArrayList) term347260).add("XfpPgyrSZi");
        ((ArrayList) term347260).add("dhflWZXuXy");
        ((ArrayList) term347260).add("jFxoDTlToD");
        ((ArrayList) term347260).add("vAZKFtWauH");
        ((ArrayList) term347260).add("azvWIHsvKC");
        ((ArrayList) term347260).add("QPLSIucZPA");
        Long term347401 = new Long(1696831840206676000L);
        Class<? extends Object> term347625 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term347624 = ((Class) term347625).getDeclaredField((String) "FLAT");
        ((Field) term347624).setAccessible(true);
        Object enum676 = ((Field) term347624).get((Object) null);
        Long term347447 = new Long(6079978726138581731L);
        Class<? extends Object> term348029 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term348028 = ((Class) term348029).getDeclaredField((String) "WEEKLY");
        ((Field) term348028).setAccessible(true);
        Object enum677 = ((Field) term348028).get((Object) null);
        term347211 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term347348 = newInstance(Class.forName("java.util.Date"));
        Object term347459 = newInstance(Class.forName("java.util.Date"));
        setField(term347211, term347211.getClass(), "memo", "lglDabDaoB");
        setField(term347211, term347211.getClass(), "fromClassicAddress", "stxLyVcHjz");
        setField(term347211, term347211.getClass(), "fromSigningPublicKey", "tNjZpgLeDy");
        setField(term347211, term347211.getClass(), "fromPrivateKey", "SchAyMDvff");
        setField(term347211, term347211.getClass(), "toClassicAddresses", term347260);
        setField(term347211, term347211.getClass(), "amount", "mvVbmMYfFm");
        setLongField(term347348, term347348.getClass(), "fastTime", 1766045265437L);
        setField(term347348, term347348.getClass(), "cdate", null);
        setField(term347211, term347211.getClass(), "startTime", term347348);
        setField(term347211, term347211.getClass(), "destinationTag", "vLfwVoIFml");
        setField(term347211, term347211.getClass(), "trustlineIssuerClassicAddress", "LAPNjSXaif");
        setField(term347211, term347211.getClass(), "currencyName", "nDIarxqfLP");
        setBooleanField(term347211, term347211.getClass(), "agreeFee", true);
        setField(term347211, term347211.getClass(), "maxXrpFeePerTransaction", "efNwYWUuSu");
        setBooleanField(term347211, term347211.getClass(), "globalIdVerified", false);
        setBooleanField(term347211, term347211.getClass(), "useBlacklist", false);
        setField(term347211, term347211.getClass(), "retryOfId", term347401);
        setField(term347211, term347211.getClass(), "paymentType", enum676);
        setField(term347211, term347211.getClass(), "snapshotTrustlineIssuerClassicAddress", "OooIjFKcWU");
        setField(term347211, term347211.getClass(), "snapshotCurrencyName", "vDSJcNmSup");
        setField(term347211, term347211.getClass(), "nftIssuingAddress", "dLMoewuhPE");
        setField(term347211, term347211.getClass(), "nftTaxon", term347447);
        setField(term347211, term347211.getClass(), "frequency", enum677);
        setLongField(term347459, term347459.getClass(), "fastTime", 1532394992436L);
        setField(term347459, term347459.getClass(), "cdate", null);
        setField(term347211, term347211.getClass(), "repeatUntilDate", term347459);
        setField(term347211, term347211.getClass(), "email", "bABDSWUSVt");
        setBooleanField(term347211, term347211.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFromClassicAddress", argTypes, term347211, args);
    }

};


