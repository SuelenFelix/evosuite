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
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.LinkedList;

public class AirDropSchedulerImpl_markScheduleComplete_20028277169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23844;
     Object term23887;
     Object term24195;

    public AirDropSchedulerImpl_markScheduleComplete_20028277169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23845 = new Long(305759998609888272L);
        Class<? extends Object> term24199 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term24198 = ((Class) term24199).getDeclaredField((String) "WEEKLY");
        ((Field) term24198).setAccessible(true);
        Object enum42 = ((Field) term24198).get((Object) null);
        Class<? extends Object> term24599 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term24598 = ((Class) term24599).getDeclaredField((String) "REJECTED");
        ((Field) term24598).setAccessible(true);
        Object enum43 = ((Field) term24598).get((Object) null);
        Long term23885 = new Long(-8654565919063661957L);
        term23844 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt"));
        Object term23857 = newInstance(Class.forName("java.util.Date"));
        Object term23859 = newInstance(Class.forName("java.util.Date"));
        setField(term23844, term23844.getClass(), "id", term23845);
        setField(term23844, term23844.getClass(), "frequency", enum42);
        setLongField(term23857, term23857.getClass(), "fastTime", 1802995433545L);
        setField(term23857, term23857.getClass(), "cdate", null);
        setField(term23844, term23844.getClass(), "repeatUntilDate", term23857);
        setLongField(term23859, term23859.getClass(), "fastTime", 1843214817357L);
        setField(term23859, term23859.getClass(), "cdate", null);
        setField(term23844, term23844.getClass(), "createDate", term23859);
        setField(term23844, term23844.getClass(), "lockUuid", "PXdVZyoJyC");
        setField(term23844, term23844.getClass(), "dropScheduleStatus", enum43);
        setField(term23844, term23844.getClass(), "dropRequestId", term23885);
        Long term23889 = new Long(-5248475803419977214L);
        Class<? extends Object> term25040 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term25039 = ((Class) term25040).getDeclaredField((String) "PENDING_REVIEW");
        ((Field) term25039).setAccessible(true);
        Object enum44 = ((Field) term25039).get((Object) null);
        Class<? extends Object> term25564 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term25563 = ((Class) term25564).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term25563).setAccessible(true);
        Object enum45 = ((Field) term25563).get((Object) null);
        Boolean term24063 = new Boolean(true);
        Boolean term24065 = new Boolean(false);
        Integer term24067 = new Integer(597278769);
        Class<? extends Object> term25962 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term25961 = ((Class) term25962).getDeclaredField((String) "GLOBALID");
        ((Field) term25961).setAccessible(true);
        Object enum46 = ((Field) term25961).get((Object) null);
        Long term24153 = new Long(-6723783499250797216L);
        Long term24167 = new Long(41775768178052008L);
        Boolean term24181 = new Boolean(false);
        term23887 = newInstance(Class.forName("java.util.Optional"));
        Object term23888 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term23915 = newInstance(Class.forName("java.util.Date"));
        Object term23917 = newInstance(Class.forName("java.util.Date"));
        Object term23919 = newInstance(Class.forName("java.util.Date"));
        setField(term23888, term23888.getClass(), "id", term23889);
        setField(term23888, term23888.getClass(), "environment", "vLerpqavFM");
        setField(term23888, term23888.getClass(), "populateEnvironment", "qnvxzwuGKX");
        setLongField(term23915, term23915.getClass(), "fastTime", 1628695316832L);
        setField(term23915, term23915.getClass(), "cdate", null);
        setField(term23888, term23888.getClass(), "createDate", term23915);
        setLongField(term23917, term23917.getClass(), "fastTime", 1393200035243L);
        setField(term23917, term23917.getClass(), "cdate", null);
        setField(term23888, term23888.getClass(), "updateDate", term23917);
        setLongField(term23919, term23919.getClass(), "fastTime", 1762147441299L);
        setField(term23919, term23919.getClass(), "cdate", null);
        setField(term23888, term23888.getClass(), "startTime", term23919);
        setField(term23888, term23888.getClass(), "status", enum44);
        setField(term23888, term23888.getClass(), "fromClassicAddress", "EdPAvpluZg");
        setField(term23888, term23888.getClass(), "fromSigningPublicKey", "DzHVBMqWtE");
        setField(term23888, term23888.getClass(), "fromPrivateKey", "THZSpzBRYP");
        setField(term23888, term23888.getClass(), "trustlineIssuerClassicAddress", "ZfBIVGBQOE");
        setField(term23888, term23888.getClass(), "currencyName", "QSrDQfEsTR");
        setField(term23888, term23888.getClass(), "snapshotTrustlineIssuerClassicAddress", "PsqusYmejD");
        setField(term23888, term23888.getClass(), "snapshotCurrencyName", "NTWMiBEaDF");
        setField(term23888, term23888.getClass(), "currencyNameForProcess", "SPBstwKFVr");
        setField(term23888, term23888.getClass(), "amount", "WxYUTuqmIq");
        setField(term23888, term23888.getClass(), "paymentType", enum45);
        setField(term23888, term23888.getClass(), "newTrustlinesOnly", term24063);
        setField(term23888, term23888.getClass(), "useBlacklist", term24065);
        setField(term23888, term23888.getClass(), "maximumTrustlines", term24067);
        setField(term23888, term23888.getClass(), "dropType", enum46);
        setField(term23888, term23888.getClass(), "lockUuid", "OeQLvhVERT");
        setField(term23888, term23888.getClass(), "failReason", "IlvgFINwIa");
        setField(term23888, term23888.getClass(), "feesPaid", "GEJABPlHSI");
        setField(term23888, term23888.getClass(), "minBalance", "aQFUvuaYxd");
        setField(term23888, term23888.getClass(), "maxBalance", "zNFLXMifnS");
        setField(term23888, term23888.getClass(), "maxXrpFeePerTransaction", "HHQcYMSBVc");
        setField(term23888, term23888.getClass(), "retryOfId", term24153);
        setField(term23888, term23888.getClass(), "nftIssuerAddress", "wdoqITnaAP");
        setField(term23888, term23888.getClass(), "nftTaxon", term24167);
        setField(term23888, term23888.getClass(), "contactEmail", "rIPMBcrNqB");
        setField(term23888, term23888.getClass(), "autoApprove", term24181);
        setField(term23888, term23888.getClass(), "memo", "UDaboHZHhz");
        setField(term23887, term23887.getClass(), "value", term23888);
        term24195 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.service.impl.AirDropSchedulerImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropScheduleEnt");
        argTypes[1] = Class.forName("java.util.Optional");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = term23844;
        args[1] = term23887;
        args[2] = term24195;
        callMethod(klass, "markScheduleComplete", argTypes, null, args);
    }

};


