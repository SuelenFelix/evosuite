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

public class PaymentRequestEnt_PaymentRequestEntBuilder_minBalance_31807047025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90265;

    public PaymentRequestEnt_PaymentRequestEntBuilder_minBalance_31807047025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term90266 = new Long(5319740127125920367L);
        Class<? extends Object> term90591 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term90590 = ((Class) term90591).getDeclaredField((String) "COMPLETE");
        ((Field) term90590).setAccessible(true);
        Object enum163 = ((Field) term90590).get((Object) null);
        Class<? extends Object> term91097 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term91096 = ((Class) term91097).getDeclaredField((String) "FLAT");
        ((Field) term91096).setAccessible(true);
        Object enum164 = ((Field) term91096).get((Object) null);
        Boolean term90426 = new Boolean(false);
        Boolean term90428 = new Boolean(false);
        Integer term90430 = new Integer(962840079);
        Class<? extends Object> term91471 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term91470 = ((Class) term91471).getDeclaredField((String) "GLOBALID");
        ((Field) term91470).setAccessible(true);
        Object enum165 = ((Field) term91470).get((Object) null);
        Long term90516 = new Long(6465987664600701876L);
        Long term90530 = new Long(-136372844051852955L);
        Boolean term90544 = new Boolean(true);
        term90265 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        Object term90292 = newInstance(Class.forName("java.util.Date"));
        Object term90294 = newInstance(Class.forName("java.util.Date"));
        Object term90296 = newInstance(Class.forName("java.util.Date"));
        setField(term90265, term90265.getClass(), "id", term90266);
        setField(term90265, term90265.getClass(), "environment", "udRdJkgXmH");
        setField(term90265, term90265.getClass(), "populateEnvironment", "FBCXbjHVXO");
        setLongField(term90292, term90292.getClass(), "fastTime", 1578543231879L);
        setField(term90292, term90292.getClass(), "cdate", null);
        setField(term90265, term90265.getClass(), "createDate", term90292);
        setLongField(term90294, term90294.getClass(), "fastTime", 1476097171939L);
        setField(term90294, term90294.getClass(), "cdate", null);
        setField(term90265, term90265.getClass(), "updateDate", term90294);
        setLongField(term90296, term90296.getClass(), "fastTime", 1890437466111L);
        setField(term90296, term90296.getClass(), "cdate", null);
        setField(term90265, term90265.getClass(), "startTime", term90296);
        setField(term90265, term90265.getClass(), "status", enum163);
        setField(term90265, term90265.getClass(), "fromClassicAddress", "dIWAnvmLiC");
        setField(term90265, term90265.getClass(), "fromSigningPublicKey", "CuWebzZQjZ");
        setField(term90265, term90265.getClass(), "fromPrivateKey", "wRVaaJxKYI");
        setField(term90265, term90265.getClass(), "trustlineIssuerClassicAddress", "yOQuJXRvOo");
        setField(term90265, term90265.getClass(), "currencyName", "XmLHcnVsch");
        setField(term90265, term90265.getClass(), "snapshotTrustlineIssuerClassicAddress", "Yrvtdcltri");
        setField(term90265, term90265.getClass(), "snapshotCurrencyName", "RxrsjXRVcT");
        setField(term90265, term90265.getClass(), "currencyNameForProcess", "cfRimmJxqA");
        setField(term90265, term90265.getClass(), "amount", "oOnRVGqFmy");
        setField(term90265, term90265.getClass(), "paymentType", enum164);
        setField(term90265, term90265.getClass(), "newTrustlinesOnly", term90426);
        setField(term90265, term90265.getClass(), "useBlacklist", term90428);
        setField(term90265, term90265.getClass(), "maximumTrustlines", term90430);
        setField(term90265, term90265.getClass(), "dropType", enum165);
        setField(term90265, term90265.getClass(), "lockUuid", "LaXzFIlWMk");
        setField(term90265, term90265.getClass(), "failReason", "GuVQjhBxma");
        setField(term90265, term90265.getClass(), "feesPaid", "WAVMPPbIfL");
        setField(term90265, term90265.getClass(), "minBalance", "GISHLsgALf");
        setField(term90265, term90265.getClass(), "maxBalance", "PVykkUSgBq");
        setField(term90265, term90265.getClass(), "maxXrpFeePerTransaction", "tnKbZaCsuj");
        setField(term90265, term90265.getClass(), "retryOfId", term90516);
        setField(term90265, term90265.getClass(), "nftIssuerAddress", "ZFpcYBgLNC");
        setField(term90265, term90265.getClass(), "nftTaxon", term90530);
        setField(term90265, term90265.getClass(), "contactEmail", "VAGkRppBem");
        setField(term90265, term90265.getClass(), "autoApprove", term90544);
        setField(term90265, term90265.getClass(), "memo", "eKcEJRxNSu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NTXQPWFYSA";
        callMethod(klass, "minBalance", argTypes, term90265, args);
    }

};


