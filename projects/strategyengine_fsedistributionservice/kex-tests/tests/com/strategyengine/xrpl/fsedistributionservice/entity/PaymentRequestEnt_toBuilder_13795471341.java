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

public class PaymentRequestEnt_toBuilder_13795471341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109392;

    public PaymentRequestEnt_toBuilder_13795471341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term109393 = new Long(3731931947533293029L);
        Class<? extends Object> term109730 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term109729 = ((Class) term109730).getDeclaredField((String) "QUEUED");
        ((Field) term109729).setAccessible(true);
        Object enum196 = ((Field) term109729).get((Object) null);
        Class<? extends Object> term110230 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term110229 = ((Class) term110230).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term110229).setAccessible(true);
        Object enum197 = ((Field) term110229).get((Object) null);
        Boolean term109559 = new Boolean(true);
        Boolean term109561 = new Boolean(true);
        Integer term109563 = new Integer(-481533957);
        Class<? extends Object> term110628 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term110627 = ((Class) term110628).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term110627).setAccessible(true);
        Object enum198 = ((Field) term110627).get((Object) null);
        Long term109667 = new Long(9214973322210954344L);
        Long term109681 = new Long(3662777917800385964L);
        Boolean term109695 = new Boolean(true);
        term109392 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term109419 = newInstance(Class.forName("java.util.Date"));
        Object term109421 = newInstance(Class.forName("java.util.Date"));
        Object term109423 = newInstance(Class.forName("java.util.Date"));
        setField(term109392, term109392.getClass(), "id", term109393);
        setField(term109392, term109392.getClass(), "environment", "zjfMxUERFZ");
        setField(term109392, term109392.getClass(), "populateEnvironment", "ooVlhmiOff");
        setLongField(term109419, term109419.getClass(), "fastTime", 1841230035815L);
        setField(term109419, term109419.getClass(), "cdate", null);
        setField(term109392, term109392.getClass(), "createDate", term109419);
        setLongField(term109421, term109421.getClass(), "fastTime", 1502420909766L);
        setField(term109421, term109421.getClass(), "cdate", null);
        setField(term109392, term109392.getClass(), "updateDate", term109421);
        setLongField(term109423, term109423.getClass(), "fastTime", 1685492640220L);
        setField(term109423, term109423.getClass(), "cdate", null);
        setField(term109392, term109392.getClass(), "startTime", term109423);
        setField(term109392, term109392.getClass(), "status", enum196);
        setField(term109392, term109392.getClass(), "fromClassicAddress", "dUNzDLXJcj");
        setField(term109392, term109392.getClass(), "fromSigningPublicKey", "OrVSjRJVwa");
        setField(term109392, term109392.getClass(), "fromPrivateKey", "cdZEcINJAM");
        setField(term109392, term109392.getClass(), "trustlineIssuerClassicAddress", "qumYSwcWHz");
        setField(term109392, term109392.getClass(), "currencyName", "raNzcEorkV");
        setField(term109392, term109392.getClass(), "snapshotTrustlineIssuerClassicAddress", "nEgozCeoUr");
        setField(term109392, term109392.getClass(), "snapshotCurrencyName", "EWGMzlcOnW");
        setField(term109392, term109392.getClass(), "currencyNameForProcess", "XeSDJYKMBf");
        setField(term109392, term109392.getClass(), "amount", "tIsFcOGTUX");
        setField(term109392, term109392.getClass(), "paymentType", enum197);
        setField(term109392, term109392.getClass(), "newTrustlinesOnly", term109559);
        setField(term109392, term109392.getClass(), "useBlacklist", term109561);
        setField(term109392, term109392.getClass(), "maximumTrustlines", term109563);
        setField(term109392, term109392.getClass(), "dropType", enum198);
        setField(term109392, term109392.getClass(), "lockUuid", "XUVRcnELFP");
        setField(term109392, term109392.getClass(), "failReason", "xIeSbezmkD");
        setField(term109392, term109392.getClass(), "feesPaid", "txUWLZRkSv");
        setField(term109392, term109392.getClass(), "minBalance", "gHRMJRsBGm");
        setField(term109392, term109392.getClass(), "maxBalance", "rZyrfnMvHa");
        setField(term109392, term109392.getClass(), "maxXrpFeePerTransaction", "GMyMhTZeDC");
        setField(term109392, term109392.getClass(), "retryOfId", term109667);
        setField(term109392, term109392.getClass(), "nftIssuerAddress", "KqQOTshBOL");
        setField(term109392, term109392.getClass(), "nftTaxon", term109681);
        setField(term109392, term109392.getClass(), "contactEmail", "cuWgFcYkPC");
        setField(term109392, term109392.getClass(), "autoApprove", term109695);
        setField(term109392, term109392.getClass(), "memo", "HfbcOKkXBm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBuilder", argTypes, term109392, args);
    }

};


