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

public class PaymentRequestEnt_setNftIssuerAddress_182675800269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224960;

    public PaymentRequestEnt_setNftIssuerAddress_182675800269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term224961 = new Long(9160882370265093763L);
        Class<? extends Object> term225304 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term225303 = ((Class) term225304).getDeclaredField((String) "SCHEDULED");
        ((Field) term225303).setAccessible(true);
        Object enum399 = ((Field) term225303).get((Object) null);
        Class<? extends Object> term225813 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term225812 = ((Class) term225813).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term225812).setAccessible(true);
        Object enum400 = ((Field) term225812).get((Object) null);
        Boolean term225130 = new Boolean(true);
        Boolean term225132 = new Boolean(true);
        Integer term225134 = new Integer(-1697741339);
        Class<? extends Object> term226211 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term226210 = ((Class) term226211).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term226210).setAccessible(true);
        Object enum401 = ((Field) term226210).get((Object) null);
        Long term225229 = new Long(6848008460134431064L);
        Long term225243 = new Long(-5338413783740215067L);
        Boolean term225257 = new Boolean(false);
        term224960 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term224987 = newInstance(Class.forName("java.util.Date"));
        Object term224989 = newInstance(Class.forName("java.util.Date"));
        Object term224991 = newInstance(Class.forName("java.util.Date"));
        setField(term224960, term224960.getClass(), "id", term224961);
        setField(term224960, term224960.getClass(), "environment", "cHjhnXKTVF");
        setField(term224960, term224960.getClass(), "populateEnvironment", "NVsXpTZPoM");
        setLongField(term224987, term224987.getClass(), "fastTime", 1393425811985L);
        setField(term224987, term224987.getClass(), "cdate", null);
        setField(term224960, term224960.getClass(), "createDate", term224987);
        setLongField(term224989, term224989.getClass(), "fastTime", 1697943529518L);
        setField(term224989, term224989.getClass(), "cdate", null);
        setField(term224960, term224960.getClass(), "updateDate", term224989);
        setLongField(term224991, term224991.getClass(), "fastTime", 1567446981028L);
        setField(term224991, term224991.getClass(), "cdate", null);
        setField(term224960, term224960.getClass(), "startTime", term224991);
        setField(term224960, term224960.getClass(), "status", enum399);
        setField(term224960, term224960.getClass(), "fromClassicAddress", "OlbhHDRGng");
        setField(term224960, term224960.getClass(), "fromSigningPublicKey", "kbxuaUHTXf");
        setField(term224960, term224960.getClass(), "fromPrivateKey", "CwmyQhyiUR");
        setField(term224960, term224960.getClass(), "trustlineIssuerClassicAddress", "PxwyuZAkGy");
        setField(term224960, term224960.getClass(), "currencyName", "ODhSWAnZWd");
        setField(term224960, term224960.getClass(), "snapshotTrustlineIssuerClassicAddress", "NQkFXmkuYK");
        setField(term224960, term224960.getClass(), "snapshotCurrencyName", "kHzsJWDHsz");
        setField(term224960, term224960.getClass(), "currencyNameForProcess", "jIfbtgnHqt");
        setField(term224960, term224960.getClass(), "amount", "vNvzjymLXH");
        setField(term224960, term224960.getClass(), "paymentType", enum400);
        setField(term224960, term224960.getClass(), "newTrustlinesOnly", term225130);
        setField(term224960, term224960.getClass(), "useBlacklist", term225132);
        setField(term224960, term224960.getClass(), "maximumTrustlines", term225134);
        setField(term224960, term224960.getClass(), "dropType", enum401);
        setField(term224960, term224960.getClass(), "lockUuid", "TCadyfXzAm");
        setField(term224960, term224960.getClass(), "failReason", "rSSEpZFUMc");
        setField(term224960, term224960.getClass(), "feesPaid", "DJHwHjvNlc");
        setField(term224960, term224960.getClass(), "minBalance", "ZSBzHqaLtQ");
        setField(term224960, term224960.getClass(), "maxBalance", "DCRuiaVwNa");
        setField(term224960, term224960.getClass(), "maxXrpFeePerTransaction", "VTjvZBqRUX");
        setField(term224960, term224960.getClass(), "retryOfId", term225229);
        setField(term224960, term224960.getClass(), "nftIssuerAddress", "vhjxsMJjOh");
        setField(term224960, term224960.getClass(), "nftTaxon", term225243);
        setField(term224960, term224960.getClass(), "contactEmail", "gKgsqLPDCs");
        setField(term224960, term224960.getClass(), "autoApprove", term225257);
        setField(term224960, term224960.getClass(), "memo", "crZAQIKgDI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uDAdogNiBQ";
        callMethod(klass, "setNftIssuerAddress", argTypes, term224960, args);
    }

};


