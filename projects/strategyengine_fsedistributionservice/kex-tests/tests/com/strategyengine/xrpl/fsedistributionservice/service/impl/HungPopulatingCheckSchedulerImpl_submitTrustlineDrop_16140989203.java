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
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Integer;

public class HungPopulatingCheckSchedulerImpl_submitTrustlineDrop_16140989203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12544;

    public HungPopulatingCheckSchedulerImpl_submitTrustlineDrop_16140989203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12545 = new Long(4044358158040652353L);
        Class<? extends Object> term12873 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term12872 = ((Class) term12873).getDeclaredField((String) "PENDING_REVIEW");
        ((Field) term12872).setAccessible(true);
        Object enum21 = ((Field) term12872).get((Object) null);
        Class<? extends Object> term13397 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term13396 = ((Class) term13397).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term13396).setAccessible(true);
        Object enum22 = ((Field) term13396).get((Object) null);
        Boolean term12719 = new Boolean(true);
        Boolean term12721 = new Boolean(false);
        Integer term12723 = new Integer(1725571209);
        Class<? extends Object> term13795 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term13794 = ((Class) term13795).getDeclaredField((String) "TRUSTLINE");
        ((Field) term13794).setAccessible(true);
        Object enum23 = ((Field) term13794).get((Object) null);
        Long term12810 = new Long(-4443169559037975007L);
        Long term12824 = new Long(-3842548265506930260L);
        Boolean term12838 = new Boolean(true);
        term12544 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term12571 = newInstance(Class.forName("java.util.Date"));
        Object term12573 = newInstance(Class.forName("java.util.Date"));
        Object term12575 = newInstance(Class.forName("java.util.Date"));
        setField(term12544, term12544.getClass(), "id", term12545);
        setField(term12544, term12544.getClass(), "environment", "wzsPSPcRdj");
        setField(term12544, term12544.getClass(), "populateEnvironment", "kGMQdqJYyB");
        setLongField(term12571, term12571.getClass(), "fastTime", 1334853104718L);
        setField(term12571, term12571.getClass(), "cdate", null);
        setField(term12544, term12544.getClass(), "createDate", term12571);
        setLongField(term12573, term12573.getClass(), "fastTime", 1496859828764L);
        setField(term12573, term12573.getClass(), "cdate", null);
        setField(term12544, term12544.getClass(), "updateDate", term12573);
        setLongField(term12575, term12575.getClass(), "fastTime", 1691868468367L);
        setField(term12575, term12575.getClass(), "cdate", null);
        setField(term12544, term12544.getClass(), "startTime", term12575);
        setField(term12544, term12544.getClass(), "status", enum21);
        setField(term12544, term12544.getClass(), "fromClassicAddress", "XJJNClzHRf");
        setField(term12544, term12544.getClass(), "fromSigningPublicKey", "HDaezxQfQR");
        setField(term12544, term12544.getClass(), "fromPrivateKey", "iikZEapDlu");
        setField(term12544, term12544.getClass(), "trustlineIssuerClassicAddress", "nhoHrZfnIN");
        setField(term12544, term12544.getClass(), "currencyName", "ZkMALXpEAZ");
        setField(term12544, term12544.getClass(), "snapshotTrustlineIssuerClassicAddress", "tXfQjSqDzN");
        setField(term12544, term12544.getClass(), "snapshotCurrencyName", "BjugTaMcxJ");
        setField(term12544, term12544.getClass(), "currencyNameForProcess", "vGiuZVPJNH");
        setField(term12544, term12544.getClass(), "amount", "tlzpzIjMib");
        setField(term12544, term12544.getClass(), "paymentType", enum22);
        setField(term12544, term12544.getClass(), "newTrustlinesOnly", term12719);
        setField(term12544, term12544.getClass(), "useBlacklist", term12721);
        setField(term12544, term12544.getClass(), "maximumTrustlines", term12723);
        setField(term12544, term12544.getClass(), "dropType", enum23);
        setField(term12544, term12544.getClass(), "lockUuid", "AZdLeSugwv");
        setField(term12544, term12544.getClass(), "failReason", "RMsXuyzKJV");
        setField(term12544, term12544.getClass(), "feesPaid", "FwPbDZcHmB");
        setField(term12544, term12544.getClass(), "minBalance", "hOncybyCAH");
        setField(term12544, term12544.getClass(), "maxBalance", "QduALnDSVo");
        setField(term12544, term12544.getClass(), "maxXrpFeePerTransaction", "izPpKDErnQ");
        setField(term12544, term12544.getClass(), "retryOfId", term12810);
        setField(term12544, term12544.getClass(), "nftIssuerAddress", "NnpwZBUTvx");
        setField(term12544, term12544.getClass(), "nftTaxon", term12824);
        setField(term12544, term12544.getClass(), "contactEmail", "tlQSNgTkQX");
        setField(term12544, term12544.getClass(), "autoApprove", term12838);
        setField(term12544, term12544.getClass(), "memo", "PCipZnmBOF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.service.impl.HungPopulatingCheckSchedulerImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Object[] args = new Object[1];
        args[0] = term12544;
        callMethod(klass, "submitTrustlineDrop", argTypes, null, args);
    }

};


