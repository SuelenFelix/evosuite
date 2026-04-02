package com.strategyengine.xrpl.fsedistributionservice.entity;

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
import static com.strategyengine.xrpl.fsedistributionservice.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Integer;

public class PaymentRequestEnt_PaymentRequestEntBuilder_snapshotTrustlineIssuerClassicAddress_198057382513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69465;

    public PaymentRequestEnt_PaymentRequestEntBuilder_snapshotTrustlineIssuerClassicAddress_198057382513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term69466 = new Long(-8469818909085103606L);
        Class<? extends Object> term69791 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term69790 = ((Class) term69791).getDeclaredField((String) "REJECTED");
        ((Field) term69790).setAccessible(true);
        Object enum127 = ((Field) term69790).get((Object) null);
        Class<? extends Object> term70297 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term70296 = ((Class) term70297).getDeclaredField((String) "FLAT");
        ((Field) term70296).setAccessible(true);
        Object enum128 = ((Field) term70296).get((Object) null);
        Boolean term69626 = new Boolean(true);
        Boolean term69628 = new Boolean(true);
        Integer term69630 = new Integer(493620644);
        Class<? extends Object> term70671 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term70670 = ((Class) term70671).getDeclaredField((String) "GLOBALID");
        ((Field) term70670).setAccessible(true);
        Object enum129 = ((Field) term70670).get((Object) null);
        Long term69716 = new Long(11315815278355083L);
        Long term69730 = new Long(7735460540091431012L);
        Boolean term69744 = new Boolean(true);
        term69465 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        Object term69492 = newInstance(Class.forName("java.util.Date"));
        Object term69494 = newInstance(Class.forName("java.util.Date"));
        Object term69496 = newInstance(Class.forName("java.util.Date"));
        setField(term69465, term69465.getClass(), "id", term69466);
        setField(term69465, term69465.getClass(), "environment", "fcCAsvfBbe");
        setField(term69465, term69465.getClass(), "populateEnvironment", "mUNcKUxghj");
        setLongField(term69492, term69492.getClass(), "fastTime", 1854285818602L);
        setField(term69492, term69492.getClass(), "cdate", null);
        setField(term69465, term69465.getClass(), "createDate", term69492);
        setLongField(term69494, term69494.getClass(), "fastTime", 1330527043188L);
        setField(term69494, term69494.getClass(), "cdate", null);
        setField(term69465, term69465.getClass(), "updateDate", term69494);
        setLongField(term69496, term69496.getClass(), "fastTime", 1755133084362L);
        setField(term69496, term69496.getClass(), "cdate", null);
        setField(term69465, term69465.getClass(), "startTime", term69496);
        setField(term69465, term69465.getClass(), "status", enum127);
        setField(term69465, term69465.getClass(), "fromClassicAddress", "lnvLKbtveE");
        setField(term69465, term69465.getClass(), "fromSigningPublicKey", "FfrrEhTHzQ");
        setField(term69465, term69465.getClass(), "fromPrivateKey", "LXnDNrMsqT");
        setField(term69465, term69465.getClass(), "trustlineIssuerClassicAddress", "ZLQamJFBmu");
        setField(term69465, term69465.getClass(), "currencyName", "ZWcOCwKNvd");
        setField(term69465, term69465.getClass(), "snapshotTrustlineIssuerClassicAddress", "GTmoNrziyc");
        setField(term69465, term69465.getClass(), "snapshotCurrencyName", "LvztehSlhM");
        setField(term69465, term69465.getClass(), "currencyNameForProcess", "njvnWFTMxN");
        setField(term69465, term69465.getClass(), "amount", "fLRqcTSfzF");
        setField(term69465, term69465.getClass(), "paymentType", enum128);
        setField(term69465, term69465.getClass(), "newTrustlinesOnly", term69626);
        setField(term69465, term69465.getClass(), "useBlacklist", term69628);
        setField(term69465, term69465.getClass(), "maximumTrustlines", term69630);
        setField(term69465, term69465.getClass(), "dropType", enum129);
        setField(term69465, term69465.getClass(), "lockUuid", "EBYHwsuWAU");
        setField(term69465, term69465.getClass(), "failReason", "PtIjKpiSix");
        setField(term69465, term69465.getClass(), "feesPaid", "NZdTuwSCIM");
        setField(term69465, term69465.getClass(), "minBalance", "dDHcmzPAmP");
        setField(term69465, term69465.getClass(), "maxBalance", "HEaTkWYBgv");
        setField(term69465, term69465.getClass(), "maxXrpFeePerTransaction", "MpJsPKLTIU");
        setField(term69465, term69465.getClass(), "retryOfId", term69716);
        setField(term69465, term69465.getClass(), "nftIssuerAddress", "IiNCZfdouL");
        setField(term69465, term69465.getClass(), "nftTaxon", term69730);
        setField(term69465, term69465.getClass(), "contactEmail", "AhOHzCsHKW");
        setField(term69465, term69465.getClass(), "autoApprove", term69744);
        setField(term69465, term69465.getClass(), "memo", "UqgLPaaAHi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xypryEkUPF";
        callMethod(klass, "snapshotTrustlineIssuerClassicAddress", argTypes, term69465, args);
    }

};


