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

public class PaymentRequestEnt_getFailReason_11363334728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155492;

    public PaymentRequestEnt_getFailReason_11363334728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term155493 = new Long(1193381106528373019L);
        Class<? extends Object> term155833 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term155832 = ((Class) term155833).getDeclaredField((String) "SCHEDULED");
        ((Field) term155832).setAccessible(true);
        Object enum277 = ((Field) term155832).get((Object) null);
        Class<? extends Object> term156342 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term156341 = ((Class) term156342).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term156341).setAccessible(true);
        Object enum278 = ((Field) term156341).get((Object) null);
        Boolean term155662 = new Boolean(false);
        Boolean term155664 = new Boolean(false);
        Integer term155666 = new Integer(-1476117762);
        Class<? extends Object> term156740 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term156739 = ((Class) term156740).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term156739).setAccessible(true);
        Object enum279 = ((Field) term156739).get((Object) null);
        Long term155770 = new Long(-1365372122034008688L);
        Long term155784 = new Long(-6108006981756732593L);
        Boolean term155798 = new Boolean(false);
        term155492 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term155519 = newInstance(Class.forName("java.util.Date"));
        Object term155521 = newInstance(Class.forName("java.util.Date"));
        Object term155523 = newInstance(Class.forName("java.util.Date"));
        setField(term155492, term155492.getClass(), "id", term155493);
        setField(term155492, term155492.getClass(), "environment", "eNOEXYoAtV");
        setField(term155492, term155492.getClass(), "populateEnvironment", "SNqwfZGLFh");
        setLongField(term155519, term155519.getClass(), "fastTime", 1703501903134L);
        setField(term155519, term155519.getClass(), "cdate", null);
        setField(term155492, term155492.getClass(), "createDate", term155519);
        setLongField(term155521, term155521.getClass(), "fastTime", 1702290529553L);
        setField(term155521, term155521.getClass(), "cdate", null);
        setField(term155492, term155492.getClass(), "updateDate", term155521);
        setLongField(term155523, term155523.getClass(), "fastTime", 1534340830454L);
        setField(term155523, term155523.getClass(), "cdate", null);
        setField(term155492, term155492.getClass(), "startTime", term155523);
        setField(term155492, term155492.getClass(), "status", enum277);
        setField(term155492, term155492.getClass(), "fromClassicAddress", "sMqpXbgEga");
        setField(term155492, term155492.getClass(), "fromSigningPublicKey", "nYJlDpoMcL");
        setField(term155492, term155492.getClass(), "fromPrivateKey", "SQnbnBmbcf");
        setField(term155492, term155492.getClass(), "trustlineIssuerClassicAddress", "jaNVteZrZi");
        setField(term155492, term155492.getClass(), "currencyName", "bMRkDiPUGu");
        setField(term155492, term155492.getClass(), "snapshotTrustlineIssuerClassicAddress", "xjKxECGyLT");
        setField(term155492, term155492.getClass(), "snapshotCurrencyName", "ffKeJGEXBT");
        setField(term155492, term155492.getClass(), "currencyNameForProcess", "rsnXTpfhqf");
        setField(term155492, term155492.getClass(), "amount", "gzvlGZVfnZ");
        setField(term155492, term155492.getClass(), "paymentType", enum278);
        setField(term155492, term155492.getClass(), "newTrustlinesOnly", term155662);
        setField(term155492, term155492.getClass(), "useBlacklist", term155664);
        setField(term155492, term155492.getClass(), "maximumTrustlines", term155666);
        setField(term155492, term155492.getClass(), "dropType", enum279);
        setField(term155492, term155492.getClass(), "lockUuid", "rmSqCaXWHi");
        setField(term155492, term155492.getClass(), "failReason", "ScztqspySK");
        setField(term155492, term155492.getClass(), "feesPaid", "IvYxGwWoVu");
        setField(term155492, term155492.getClass(), "minBalance", "XnZHOhTfxL");
        setField(term155492, term155492.getClass(), "maxBalance", "oFBhNamtAs");
        setField(term155492, term155492.getClass(), "maxXrpFeePerTransaction", "YURcpRjwSt");
        setField(term155492, term155492.getClass(), "retryOfId", term155770);
        setField(term155492, term155492.getClass(), "nftIssuerAddress", "SXMdNSGPog");
        setField(term155492, term155492.getClass(), "nftTaxon", term155784);
        setField(term155492, term155492.getClass(), "contactEmail", "vsqwOLpDjj");
        setField(term155492, term155492.getClass(), "autoApprove", term155798);
        setField(term155492, term155492.getClass(), "memo", "rJgXQRsPCl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFailReason", argTypes, term155492, args);
    }

};


