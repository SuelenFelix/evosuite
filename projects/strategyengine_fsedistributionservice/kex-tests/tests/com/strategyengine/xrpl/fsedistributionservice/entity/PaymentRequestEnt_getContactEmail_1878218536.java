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

public class PaymentRequestEnt_getContactEmail_1878218536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169120;

    public PaymentRequestEnt_getContactEmail_1878218536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term169121 = new Long(8527367353497875781L);
        Class<? extends Object> term169435 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term169434 = ((Class) term169435).getDeclaredField((String) "COMPLETE");
        ((Field) term169434).setAccessible(true);
        Object enum301 = ((Field) term169434).get((Object) null);
        Class<? extends Object> term169941 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term169940 = ((Class) term169941).getDeclaredField((String) "FLAT");
        ((Field) term169940).setAccessible(true);
        Object enum302 = ((Field) term169940).get((Object) null);
        Boolean term169281 = new Boolean(true);
        Boolean term169283 = new Boolean(false);
        Integer term169285 = new Integer(-1963434938);
        Class<? extends Object> term170315 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term170314 = ((Class) term170315).getDeclaredField((String) "TRUSTLINE");
        ((Field) term170314).setAccessible(true);
        Object enum303 = ((Field) term170314).get((Object) null);
        Long term169372 = new Long(-6489405551733780896L);
        Long term169386 = new Long(5818741986224130131L);
        Boolean term169400 = new Boolean(false);
        term169120 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term169147 = newInstance(Class.forName("java.util.Date"));
        Object term169149 = newInstance(Class.forName("java.util.Date"));
        Object term169151 = newInstance(Class.forName("java.util.Date"));
        setField(term169120, term169120.getClass(), "id", term169121);
        setField(term169120, term169120.getClass(), "environment", "XlNXxsYNss");
        setField(term169120, term169120.getClass(), "populateEnvironment", "jheRZWjuaB");
        setLongField(term169147, term169147.getClass(), "fastTime", 1644273652840L);
        setField(term169147, term169147.getClass(), "cdate", null);
        setField(term169120, term169120.getClass(), "createDate", term169147);
        setLongField(term169149, term169149.getClass(), "fastTime", 1479643470937L);
        setField(term169149, term169149.getClass(), "cdate", null);
        setField(term169120, term169120.getClass(), "updateDate", term169149);
        setLongField(term169151, term169151.getClass(), "fastTime", 1476967300668L);
        setField(term169151, term169151.getClass(), "cdate", null);
        setField(term169120, term169120.getClass(), "startTime", term169151);
        setField(term169120, term169120.getClass(), "status", enum301);
        setField(term169120, term169120.getClass(), "fromClassicAddress", "IERziToRSQ");
        setField(term169120, term169120.getClass(), "fromSigningPublicKey", "mDTRMwjBpc");
        setField(term169120, term169120.getClass(), "fromPrivateKey", "sCLAuKoiVL");
        setField(term169120, term169120.getClass(), "trustlineIssuerClassicAddress", "pFWiDEnVnU");
        setField(term169120, term169120.getClass(), "currencyName", "NeEetzFhTt");
        setField(term169120, term169120.getClass(), "snapshotTrustlineIssuerClassicAddress", "UgvuvUxKed");
        setField(term169120, term169120.getClass(), "snapshotCurrencyName", "ljBBMsQpaM");
        setField(term169120, term169120.getClass(), "currencyNameForProcess", "hHNIOlOzJc");
        setField(term169120, term169120.getClass(), "amount", "ALRSeULyWV");
        setField(term169120, term169120.getClass(), "paymentType", enum302);
        setField(term169120, term169120.getClass(), "newTrustlinesOnly", term169281);
        setField(term169120, term169120.getClass(), "useBlacklist", term169283);
        setField(term169120, term169120.getClass(), "maximumTrustlines", term169285);
        setField(term169120, term169120.getClass(), "dropType", enum303);
        setField(term169120, term169120.getClass(), "lockUuid", "WVhzXHdyFF");
        setField(term169120, term169120.getClass(), "failReason", "GLAWYoxkyw");
        setField(term169120, term169120.getClass(), "feesPaid", "cfpPTNNVnW");
        setField(term169120, term169120.getClass(), "minBalance", "VPkEFShMUB");
        setField(term169120, term169120.getClass(), "maxBalance", "ZIgHysIFcL");
        setField(term169120, term169120.getClass(), "maxXrpFeePerTransaction", "ofSfQtWBjp");
        setField(term169120, term169120.getClass(), "retryOfId", term169372);
        setField(term169120, term169120.getClass(), "nftIssuerAddress", "vkbIpZOlcY");
        setField(term169120, term169120.getClass(), "nftTaxon", term169386);
        setField(term169120, term169120.getClass(), "contactEmail", "XbAeosZekH");
        setField(term169120, term169120.getClass(), "autoApprove", term169400);
        setField(term169120, term169120.getClass(), "memo", "EvGPvjswTz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getContactEmail", argTypes, term169120, args);
    }

};


