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

public class FsePaymentRequest_setMaxXrpFeePerTransaction_157267137543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term390279;

    public FsePaymentRequest_setMaxXrpFeePerTransaction_157267137543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term390328 = new ArrayList();
        ((ArrayList) term390328).add("XaSQbgxPqk");
        Long term390409 = new Long(7218261959613569082L);
        Class<? extends Object> term390594 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term390593 = ((Class) term390594).getDeclaredField((String) "FLAT");
        ((Field) term390593).setAccessible(true);
        Object enum746 = ((Field) term390593).get((Object) null);
        Long term390455 = new Long(8997626143537750821L);
        Class<? extends Object> term390998 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term390997 = ((Class) term390998).getDeclaredField((String) "DAILY");
        ((Field) term390997).setAccessible(true);
        Object enum747 = ((Field) term390997).get((Object) null);
        term390279 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term390356 = newInstance(Class.forName("java.util.Date"));
        Object term390466 = newInstance(Class.forName("java.util.Date"));
        setField(term390279, term390279.getClass(), "memo", "PufiDnTOVH");
        setField(term390279, term390279.getClass(), "fromClassicAddress", "LQfKYwOczS");
        setField(term390279, term390279.getClass(), "fromSigningPublicKey", "pbZJqYGAhZ");
        setField(term390279, term390279.getClass(), "fromPrivateKey", "YEdoqWcZFW");
        setField(term390279, term390279.getClass(), "toClassicAddresses", term390328);
        setField(term390279, term390279.getClass(), "amount", "XXOrMpBKkm");
        setLongField(term390356, term390356.getClass(), "fastTime", 1552994469957L);
        setField(term390356, term390356.getClass(), "cdate", null);
        setField(term390279, term390279.getClass(), "startTime", term390356);
        setField(term390279, term390279.getClass(), "destinationTag", "eyQAgPDleR");
        setField(term390279, term390279.getClass(), "trustlineIssuerClassicAddress", "MebQINvRJc");
        setField(term390279, term390279.getClass(), "currencyName", "eySJlHMbkA");
        setBooleanField(term390279, term390279.getClass(), "agreeFee", true);
        setField(term390279, term390279.getClass(), "maxXrpFeePerTransaction", "jCjDnHGqSE");
        setBooleanField(term390279, term390279.getClass(), "globalIdVerified", true);
        setBooleanField(term390279, term390279.getClass(), "useBlacklist", false);
        setField(term390279, term390279.getClass(), "retryOfId", term390409);
        setField(term390279, term390279.getClass(), "paymentType", enum746);
        setField(term390279, term390279.getClass(), "snapshotTrustlineIssuerClassicAddress", "fSfrGnoCtQ");
        setField(term390279, term390279.getClass(), "snapshotCurrencyName", "xiunSRKqzf");
        setField(term390279, term390279.getClass(), "nftIssuingAddress", "glitnwSilu");
        setField(term390279, term390279.getClass(), "nftTaxon", term390455);
        setField(term390279, term390279.getClass(), "frequency", enum747);
        setLongField(term390466, term390466.getClass(), "fastTime", 1745707198292L);
        setField(term390466, term390466.getClass(), "cdate", null);
        setField(term390279, term390279.getClass(), "repeatUntilDate", term390466);
        setField(term390279, term390279.getClass(), "email", "rGlzfsjrgQ");
        setBooleanField(term390279, term390279.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "cQnKBGhPuM";
        callMethod(klass, "setMaxXrpFeePerTransaction", argTypes, term390279, args);
    }

};


