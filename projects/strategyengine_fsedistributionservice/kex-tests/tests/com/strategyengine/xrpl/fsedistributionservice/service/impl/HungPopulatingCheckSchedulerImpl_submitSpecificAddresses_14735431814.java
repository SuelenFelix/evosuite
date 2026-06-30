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

public class HungPopulatingCheckSchedulerImpl_submitSpecificAddresses_14735431814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14258;

    public HungPopulatingCheckSchedulerImpl_submitSpecificAddresses_14735431814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14259 = new Long(-5788180182343976541L);
        Class<? extends Object> term14604 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term14603 = ((Class) term14604).getDeclaredField((String) "PENDING_REVIEW");
        ((Field) term14603).setAccessible(true);
        Object enum24 = ((Field) term14603).get((Object) null);
        Class<? extends Object> term15128 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term15127 = ((Class) term15128).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term15127).setAccessible(true);
        Object enum25 = ((Field) term15127).get((Object) null);
        Boolean term14433 = new Boolean(false);
        Boolean term14435 = new Boolean(true);
        Integer term14437 = new Integer(-522618178);
        Class<? extends Object> term15526 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term15525 = ((Class) term15526).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term15525).setAccessible(true);
        Object enum26 = ((Field) term15525).get((Object) null);
        Long term14541 = new Long(2936323121573284007L);
        Long term14555 = new Long(-1154553077993834885L);
        Boolean term14569 = new Boolean(false);
        term14258 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term14285 = newInstance(Class.forName("java.util.Date"));
        Object term14287 = newInstance(Class.forName("java.util.Date"));
        Object term14289 = newInstance(Class.forName("java.util.Date"));
        setField(term14258, term14258.getClass(), "id", term14259);
        setField(term14258, term14258.getClass(), "environment", "zcorEihhLK");
        setField(term14258, term14258.getClass(), "populateEnvironment", "GrqozDKFOk");
        setLongField(term14285, term14285.getClass(), "fastTime", 1442370534632L);
        setField(term14285, term14285.getClass(), "cdate", null);
        setField(term14258, term14258.getClass(), "createDate", term14285);
        setLongField(term14287, term14287.getClass(), "fastTime", 1659994192918L);
        setField(term14287, term14287.getClass(), "cdate", null);
        setField(term14258, term14258.getClass(), "updateDate", term14287);
        setLongField(term14289, term14289.getClass(), "fastTime", 1876872800559L);
        setField(term14289, term14289.getClass(), "cdate", null);
        setField(term14258, term14258.getClass(), "startTime", term14289);
        setField(term14258, term14258.getClass(), "status", enum24);
        setField(term14258, term14258.getClass(), "fromClassicAddress", "CFyoseFGLF");
        setField(term14258, term14258.getClass(), "fromSigningPublicKey", "SFqCrhEWLm");
        setField(term14258, term14258.getClass(), "fromPrivateKey", "GZdcJyZntS");
        setField(term14258, term14258.getClass(), "trustlineIssuerClassicAddress", "OIHoJeysUi");
        setField(term14258, term14258.getClass(), "currencyName", "WXMWFDGcLB");
        setField(term14258, term14258.getClass(), "snapshotTrustlineIssuerClassicAddress", "wKWbJssZuG");
        setField(term14258, term14258.getClass(), "snapshotCurrencyName", "NzBMMhkhpT");
        setField(term14258, term14258.getClass(), "currencyNameForProcess", "qCpEbQDHdF");
        setField(term14258, term14258.getClass(), "amount", "AHbZyFOmlo");
        setField(term14258, term14258.getClass(), "paymentType", enum25);
        setField(term14258, term14258.getClass(), "newTrustlinesOnly", term14433);
        setField(term14258, term14258.getClass(), "useBlacklist", term14435);
        setField(term14258, term14258.getClass(), "maximumTrustlines", term14437);
        setField(term14258, term14258.getClass(), "dropType", enum26);
        setField(term14258, term14258.getClass(), "lockUuid", "TwfWVQGiIj");
        setField(term14258, term14258.getClass(), "failReason", "gUvcueTURF");
        setField(term14258, term14258.getClass(), "feesPaid", "EwQBhZjCIT");
        setField(term14258, term14258.getClass(), "minBalance", "aSkmSwTnEw");
        setField(term14258, term14258.getClass(), "maxBalance", "xvkbvaEGYd");
        setField(term14258, term14258.getClass(), "maxXrpFeePerTransaction", "HBGNxdNURv");
        setField(term14258, term14258.getClass(), "retryOfId", term14541);
        setField(term14258, term14258.getClass(), "nftIssuerAddress", "mfCpTPPQQm");
        setField(term14258, term14258.getClass(), "nftTaxon", term14555);
        setField(term14258, term14258.getClass(), "contactEmail", "OcJCIDNIXA");
        setField(term14258, term14258.getClass(), "autoApprove", term14569);
        setField(term14258, term14258.getClass(), "memo", "XfRABIFVEp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.service.impl.HungPopulatingCheckSchedulerImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Object[] args = new Object[1];
        args[0] = term14258;
        callMethod(klass, "submitSpecificAddresses", argTypes, null, args);
    }

};


