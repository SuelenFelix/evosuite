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

public class PaymentRequestEnt_getFromSigningPublicKey_123575437814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131724;

    public PaymentRequestEnt_getFromSigningPublicKey_123575437814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term131725 = new Long(7006402814669334483L);
        Class<? extends Object> term132055 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term132054 = ((Class) term132055).getDeclaredField((String) "REJECTED");
        ((Field) term132054).setAccessible(true);
        Object enum235 = ((Field) term132054).get((Object) null);
        Class<? extends Object> term132561 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term132560 = ((Class) term132561).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term132560).setAccessible(true);
        Object enum236 = ((Field) term132560).get((Object) null);
        Boolean term131893 = new Boolean(false);
        Boolean term131895 = new Boolean(false);
        Integer term131897 = new Integer(444029505);
        Class<? extends Object> term132959 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term132958 = ((Class) term132959).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term132958).setAccessible(true);
        Object enum237 = ((Field) term132958).get((Object) null);
        Long term131992 = new Long(-4003544865306793676L);
        Long term132006 = new Long(-769824408235898287L);
        Boolean term132020 = new Boolean(true);
        term131724 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term131751 = newInstance(Class.forName("java.util.Date"));
        Object term131753 = newInstance(Class.forName("java.util.Date"));
        Object term131755 = newInstance(Class.forName("java.util.Date"));
        setField(term131724, term131724.getClass(), "id", term131725);
        setField(term131724, term131724.getClass(), "environment", "avZoBQSrBy");
        setField(term131724, term131724.getClass(), "populateEnvironment", "KIXGeHXdwi");
        setLongField(term131751, term131751.getClass(), "fastTime", 1460672232175L);
        setField(term131751, term131751.getClass(), "cdate", null);
        setField(term131724, term131724.getClass(), "createDate", term131751);
        setLongField(term131753, term131753.getClass(), "fastTime", 1444328743068L);
        setField(term131753, term131753.getClass(), "cdate", null);
        setField(term131724, term131724.getClass(), "updateDate", term131753);
        setLongField(term131755, term131755.getClass(), "fastTime", 1483547400964L);
        setField(term131755, term131755.getClass(), "cdate", null);
        setField(term131724, term131724.getClass(), "startTime", term131755);
        setField(term131724, term131724.getClass(), "status", enum235);
        setField(term131724, term131724.getClass(), "fromClassicAddress", "tTfdvLMwEE");
        setField(term131724, term131724.getClass(), "fromSigningPublicKey", "DiSkERzqOE");
        setField(term131724, term131724.getClass(), "fromPrivateKey", "hPSZZeYqHQ");
        setField(term131724, term131724.getClass(), "trustlineIssuerClassicAddress", "scReMUKyGq");
        setField(term131724, term131724.getClass(), "currencyName", "FmIpnxjRxA");
        setField(term131724, term131724.getClass(), "snapshotTrustlineIssuerClassicAddress", "FTjxxGvyun");
        setField(term131724, term131724.getClass(), "snapshotCurrencyName", "qsjXSwKloH");
        setField(term131724, term131724.getClass(), "currencyNameForProcess", "DDZHUPglvb");
        setField(term131724, term131724.getClass(), "amount", "rWoaXvNyVg");
        setField(term131724, term131724.getClass(), "paymentType", enum236);
        setField(term131724, term131724.getClass(), "newTrustlinesOnly", term131893);
        setField(term131724, term131724.getClass(), "useBlacklist", term131895);
        setField(term131724, term131724.getClass(), "maximumTrustlines", term131897);
        setField(term131724, term131724.getClass(), "dropType", enum237);
        setField(term131724, term131724.getClass(), "lockUuid", "FLzaBCFjGv");
        setField(term131724, term131724.getClass(), "failReason", "OLYhTSqTqJ");
        setField(term131724, term131724.getClass(), "feesPaid", "AIHoadcpQz");
        setField(term131724, term131724.getClass(), "minBalance", "fWMsLtuOEV");
        setField(term131724, term131724.getClass(), "maxBalance", "fvgZQBalnd");
        setField(term131724, term131724.getClass(), "maxXrpFeePerTransaction", "tViQSKUCLE");
        setField(term131724, term131724.getClass(), "retryOfId", term131992);
        setField(term131724, term131724.getClass(), "nftIssuerAddress", "QbaeHheqiP");
        setField(term131724, term131724.getClass(), "nftTaxon", term132006);
        setField(term131724, term131724.getClass(), "contactEmail", "gASHxChKwn");
        setField(term131724, term131724.getClass(), "autoApprove", term132020);
        setField(term131724, term131724.getClass(), "memo", "iasolXlEEn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFromSigningPublicKey", argTypes, term131724, args);
    }

};


