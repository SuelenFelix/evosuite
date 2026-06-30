package com.strategyengine.xrpl.fsedistributionservice.model;

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
import static com.strategyengine.xrpl.fsedistributionservice.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Double;
import java.lang.Long;
import java.lang.String;
import java.lang.Object;

public class FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_currencyName_17305293206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term420228;

    public FsePaymentTrustlinesRequest_FsePaymentTrustlinesRequestBuilder_currencyName_17305293206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term420317 = new Integer(1102721075);
        Double term420319 = new Double(0.6142723998707854);
        Double term420321 = new Double(0.4355627280318103);
        Long term420335 = new Long(-8754542710304507750L);
        Class<? extends Object> term420488 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term420487 = ((Class) term420488).getDeclaredField((String) "FLAT");
        ((Field) term420487).setAccessible(true);
        Object enum783 = ((Field) term420487).get((Object) null);
        Class<? extends Object> term420882 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term420881 = ((Class) term420882).getDeclaredField((String) "DAILY");
        ((Field) term420881).setAccessible(true);
        Object enum784 = ((Field) term420881).get((Object) null);
        term420228 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder"));
        Object term420369 = newInstance(Class.forName("java.util.Date"));
        Object term420380 = newInstance(Class.forName("java.util.Date"));
        setField(term420228, term420228.getClass(), "memo", "CYxqKIxVOo");
        setField(term420228, term420228.getClass(), "fromClassicAddress", "YlBXwuYBDH");
        setField(term420228, term420228.getClass(), "fromSigningPublicKey", "dxtSyZnIlU");
        setField(term420228, term420228.getClass(), "fromPrivateKey", "REmxEjNVMr");
        setField(term420228, term420228.getClass(), "trustlineIssuerClassicAddress", "LDuxPzKmkU");
        setField(term420228, term420228.getClass(), "currencyName", "WCRUmtCmTC");
        setField(term420228, term420228.getClass(), "amount", "AkvUMrmZBD");
        setBooleanField(term420228, term420228.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term420228, term420228.getClass(), "globalIdVerified", false);
        setBooleanField(term420228, term420228.getClass(), "useBlacklist", true);
        setBooleanField(term420228, term420228.getClass(), "agreeFee", false);
        setField(term420228, term420228.getClass(), "maximumTrustlines", term420317);
        setField(term420228, term420228.getClass(), "minBalance", term420319);
        setField(term420228, term420228.getClass(), "maxBalance", term420321);
        setField(term420228, term420228.getClass(), "maxXrpFeePerTransaction", "xjfEZHfbeM");
        setField(term420228, term420228.getClass(), "retryOfId", term420335);
        setField(term420228, term420228.getClass(), "paymentType", enum783);
        setField(term420228, term420228.getClass(), "snapshotTrustlineIssuerClassicAddress", "NGVYBvLiYI");
        setField(term420228, term420228.getClass(), "snapshotCurrencyName", "Zkmgyplfwc");
        setLongField(term420369, term420369.getClass(), "fastTime", 1620882142879L);
        setField(term420369, term420369.getClass(), "cdate", null);
        setField(term420228, term420228.getClass(), "startTime", term420369);
        setField(term420228, term420228.getClass(), "frequency", enum784);
        setLongField(term420380, term420380.getClass(), "fastTime", 1463674617580L);
        setField(term420380, term420380.getClass(), "cdate", null);
        setField(term420228, term420228.getClass(), "repeatUntilDate", term420380);
        setField(term420228, term420228.getClass(), "email", "iHfHTXLSld");
        setBooleanField(term420228, term420228.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentTrustlinesRequest$FsePaymentTrustlinesRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RUPkFdASbP";
        callMethod(klass, "currencyName", argTypes, term420228, args);
    }

};


