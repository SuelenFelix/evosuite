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

public class PaymentRequestEnt_PaymentRequestEntBuilder_environment_1430828972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50359;

    public PaymentRequestEnt_PaymentRequestEntBuilder_environment_1430828972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term50360 = new Long(5184635470881147510L);
        Class<? extends Object> term50685 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term50684 = ((Class) term50685).getDeclaredField((String) "REJECTED");
        ((Field) term50684).setAccessible(true);
        Object enum94 = ((Field) term50684).get((Object) null);
        Class<? extends Object> term51191 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term51190 = ((Class) term51191).getDeclaredField((String) "FLAT");
        ((Field) term51190).setAccessible(true);
        Object enum95 = ((Field) term51190).get((Object) null);
        Boolean term50520 = new Boolean(false);
        Boolean term50522 = new Boolean(true);
        Integer term50524 = new Integer(-1968847291);
        Class<? extends Object> term51565 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term51564 = ((Class) term51565).getDeclaredField((String) "GLOBALID");
        ((Field) term51564).setAccessible(true);
        Object enum96 = ((Field) term51564).get((Object) null);
        Long term50610 = new Long(918397384129253729L);
        Long term50624 = new Long(-2187638136407967948L);
        Boolean term50638 = new Boolean(true);
        term50359 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        Object term50386 = newInstance(Class.forName("java.util.Date"));
        Object term50388 = newInstance(Class.forName("java.util.Date"));
        Object term50390 = newInstance(Class.forName("java.util.Date"));
        setField(term50359, term50359.getClass(), "id", term50360);
        setField(term50359, term50359.getClass(), "environment", "uXYcXVYJZM");
        setField(term50359, term50359.getClass(), "populateEnvironment", "BJhjdJUhkz");
        setLongField(term50386, term50386.getClass(), "fastTime", 1836082079512L);
        setField(term50386, term50386.getClass(), "cdate", null);
        setField(term50359, term50359.getClass(), "createDate", term50386);
        setLongField(term50388, term50388.getClass(), "fastTime", 1426397467745L);
        setField(term50388, term50388.getClass(), "cdate", null);
        setField(term50359, term50359.getClass(), "updateDate", term50388);
        setLongField(term50390, term50390.getClass(), "fastTime", 1755551549042L);
        setField(term50390, term50390.getClass(), "cdate", null);
        setField(term50359, term50359.getClass(), "startTime", term50390);
        setField(term50359, term50359.getClass(), "status", enum94);
        setField(term50359, term50359.getClass(), "fromClassicAddress", "cdHYQDgUZR");
        setField(term50359, term50359.getClass(), "fromSigningPublicKey", "KAORSSPSeV");
        setField(term50359, term50359.getClass(), "fromPrivateKey", "UimMMORkzd");
        setField(term50359, term50359.getClass(), "trustlineIssuerClassicAddress", "huVIXUWLtI");
        setField(term50359, term50359.getClass(), "currencyName", "vhKzFyKPOT");
        setField(term50359, term50359.getClass(), "snapshotTrustlineIssuerClassicAddress", "nQhIgWXdRc");
        setField(term50359, term50359.getClass(), "snapshotCurrencyName", "EusenEbIoF");
        setField(term50359, term50359.getClass(), "currencyNameForProcess", "SScVQYSvWH");
        setField(term50359, term50359.getClass(), "amount", "MnovcqFhCl");
        setField(term50359, term50359.getClass(), "paymentType", enum95);
        setField(term50359, term50359.getClass(), "newTrustlinesOnly", term50520);
        setField(term50359, term50359.getClass(), "useBlacklist", term50522);
        setField(term50359, term50359.getClass(), "maximumTrustlines", term50524);
        setField(term50359, term50359.getClass(), "dropType", enum96);
        setField(term50359, term50359.getClass(), "lockUuid", "qYtAeLzOhW");
        setField(term50359, term50359.getClass(), "failReason", "tJzmOfcUnY");
        setField(term50359, term50359.getClass(), "feesPaid", "TKlccZUpjz");
        setField(term50359, term50359.getClass(), "minBalance", "GGzwMoHZXC");
        setField(term50359, term50359.getClass(), "maxBalance", "IpmgwHTgnG");
        setField(term50359, term50359.getClass(), "maxXrpFeePerTransaction", "tIpkeYIezR");
        setField(term50359, term50359.getClass(), "retryOfId", term50610);
        setField(term50359, term50359.getClass(), "nftIssuerAddress", "YkZtEtthvz");
        setField(term50359, term50359.getClass(), "nftTaxon", term50624);
        setField(term50359, term50359.getClass(), "contactEmail", "dwlZSxlXOo");
        setField(term50359, term50359.getClass(), "autoApprove", term50638);
        setField(term50359, term50359.getClass(), "memo", "lKrEAkypza");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KtuuNAqGCQ";
        callMethod(klass, "environment", argTypes, term50359, args);
    }

};


