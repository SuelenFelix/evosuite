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

public class PaymentRequestEnt_setMaximumTrustlines_36579998360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209023;
     Object term209320;

    public PaymentRequestEnt_setMaximumTrustlines_36579998360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term209024 = new Long(1964822153944985001L);
        Class<? extends Object> term209343 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term209342 = ((Class) term209343).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term209342).setAccessible(true);
        Object enum371 = ((Field) term209342).get((Object) null);
        Class<? extends Object> term209858 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term209857 = ((Class) term209858).getDeclaredField((String) "FLAT");
        ((Field) term209857).setAccessible(true);
        Object enum372 = ((Field) term209857).get((Object) null);
        Boolean term209187 = new Boolean(true);
        Boolean term209189 = new Boolean(true);
        Integer term209191 = new Integer(-1222006000);
        Class<? extends Object> term210232 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term210231 = ((Class) term210232).getDeclaredField((String) "TRUSTLINE");
        ((Field) term210231).setAccessible(true);
        Object enum373 = ((Field) term210231).get((Object) null);
        Long term209278 = new Long(-955253666696787757L);
        Long term209292 = new Long(-99017747847004910L);
        Boolean term209306 = new Boolean(true);
        term209023 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term209050 = newInstance(Class.forName("java.util.Date"));
        Object term209052 = newInstance(Class.forName("java.util.Date"));
        Object term209054 = newInstance(Class.forName("java.util.Date"));
        setField(term209023, term209023.getClass(), "id", term209024);
        setField(term209023, term209023.getClass(), "environment", "JhszTkUWCg");
        setField(term209023, term209023.getClass(), "populateEnvironment", "gfNPCeiULY");
        setLongField(term209050, term209050.getClass(), "fastTime", 1264970530177L);
        setField(term209050, term209050.getClass(), "cdate", null);
        setField(term209023, term209023.getClass(), "createDate", term209050);
        setLongField(term209052, term209052.getClass(), "fastTime", 1837109632276L);
        setField(term209052, term209052.getClass(), "cdate", null);
        setField(term209023, term209023.getClass(), "updateDate", term209052);
        setLongField(term209054, term209054.getClass(), "fastTime", 1403113866541L);
        setField(term209054, term209054.getClass(), "cdate", null);
        setField(term209023, term209023.getClass(), "startTime", term209054);
        setField(term209023, term209023.getClass(), "status", enum371);
        setField(term209023, term209023.getClass(), "fromClassicAddress", "aUJLXfcWME");
        setField(term209023, term209023.getClass(), "fromSigningPublicKey", "ixeIpUaVug");
        setField(term209023, term209023.getClass(), "fromPrivateKey", "TELyWFMBJv");
        setField(term209023, term209023.getClass(), "trustlineIssuerClassicAddress", "bIqbgRdzpB");
        setField(term209023, term209023.getClass(), "currencyName", "FIUbHJmAEj");
        setField(term209023, term209023.getClass(), "snapshotTrustlineIssuerClassicAddress", "mJrFDaDdyY");
        setField(term209023, term209023.getClass(), "snapshotCurrencyName", "HqyBQNuLnz");
        setField(term209023, term209023.getClass(), "currencyNameForProcess", "xWkZKbrvmX");
        setField(term209023, term209023.getClass(), "amount", "PTEWoxLNqQ");
        setField(term209023, term209023.getClass(), "paymentType", enum372);
        setField(term209023, term209023.getClass(), "newTrustlinesOnly", term209187);
        setField(term209023, term209023.getClass(), "useBlacklist", term209189);
        setField(term209023, term209023.getClass(), "maximumTrustlines", term209191);
        setField(term209023, term209023.getClass(), "dropType", enum373);
        setField(term209023, term209023.getClass(), "lockUuid", "XiAUBffMZP");
        setField(term209023, term209023.getClass(), "failReason", "pkfsHvqODq");
        setField(term209023, term209023.getClass(), "feesPaid", "OoRBUdwown");
        setField(term209023, term209023.getClass(), "minBalance", "lSidZunNtu");
        setField(term209023, term209023.getClass(), "maxBalance", "TLUhUnoanK");
        setField(term209023, term209023.getClass(), "maxXrpFeePerTransaction", "JXyQTIyIrU");
        setField(term209023, term209023.getClass(), "retryOfId", term209278);
        setField(term209023, term209023.getClass(), "nftIssuerAddress", "uplmRQRGWr");
        setField(term209023, term209023.getClass(), "nftTaxon", term209292);
        setField(term209023, term209023.getClass(), "contactEmail", "ZEmNnaQFYB");
        setField(term209023, term209023.getClass(), "autoApprove", term209306);
        setField(term209023, term209023.getClass(), "memo", "FNxFpCZxLW");
        term209320 = new Integer(2095798786);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term209320;
        callMethod(klass, "setMaximumTrustlines", argTypes, term209023, args);
    }

};


