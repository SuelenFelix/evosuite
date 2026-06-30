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

public class PaymentRequestEnt_setPaymentType_160743643557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203793;
     Object enum363;

    public PaymentRequestEnt_setPaymentType_160743643557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term203794 = new Long(7656211287234019484L);
        Class<? extends Object> term204134 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term204133 = ((Class) term204134).getDeclaredField((String) "SCHEDULED");
        ((Field) term204133).setAccessible(true);
        Object enum362 = ((Field) term204133).get((Object) null);
        Class<? extends Object> term204643 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term204642 = ((Class) term204643).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term204642).setAccessible(true);
        enum363 = ((Field) term204642).get((Object) null);
        Boolean term203963 = new Boolean(false);
        Boolean term203965 = new Boolean(false);
        Integer term203967 = new Integer(1202361360);
        Class<? extends Object> term205041 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term205040 = ((Class) term205041).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term205040).setAccessible(true);
        Object enum364 = ((Field) term205040).get((Object) null);
        Long term204071 = new Long(-872579514000598474L);
        Long term204085 = new Long(5097769785635819744L);
        Boolean term204099 = new Boolean(false);
        term203793 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term203820 = newInstance(Class.forName("java.util.Date"));
        Object term203822 = newInstance(Class.forName("java.util.Date"));
        Object term203824 = newInstance(Class.forName("java.util.Date"));
        setField(term203793, term203793.getClass(), "id", term203794);
        setField(term203793, term203793.getClass(), "environment", "DRdgywxCcP");
        setField(term203793, term203793.getClass(), "populateEnvironment", "uelmUHzwnS");
        setLongField(term203820, term203820.getClass(), "fastTime", 1636637874191L);
        setField(term203820, term203820.getClass(), "cdate", null);
        setField(term203793, term203793.getClass(), "createDate", term203820);
        setLongField(term203822, term203822.getClass(), "fastTime", 1732865834801L);
        setField(term203822, term203822.getClass(), "cdate", null);
        setField(term203793, term203793.getClass(), "updateDate", term203822);
        setLongField(term203824, term203824.getClass(), "fastTime", 1859322280808L);
        setField(term203824, term203824.getClass(), "cdate", null);
        setField(term203793, term203793.getClass(), "startTime", term203824);
        setField(term203793, term203793.getClass(), "status", enum362);
        setField(term203793, term203793.getClass(), "fromClassicAddress", "iKuSKqVzvy");
        setField(term203793, term203793.getClass(), "fromSigningPublicKey", "SgyGAlytLF");
        setField(term203793, term203793.getClass(), "fromPrivateKey", "OoXopVvpwr");
        setField(term203793, term203793.getClass(), "trustlineIssuerClassicAddress", "lwwreKJCFL");
        setField(term203793, term203793.getClass(), "currencyName", "PWBggYjpOQ");
        setField(term203793, term203793.getClass(), "snapshotTrustlineIssuerClassicAddress", "FDzNpfjYDI");
        setField(term203793, term203793.getClass(), "snapshotCurrencyName", "vSbbcByIuA");
        setField(term203793, term203793.getClass(), "currencyNameForProcess", "QSvdWzkkPx");
        setField(term203793, term203793.getClass(), "amount", "vStdEtWvae");
        setField(term203793, term203793.getClass(), "paymentType", enum363);
        setField(term203793, term203793.getClass(), "newTrustlinesOnly", term203963);
        setField(term203793, term203793.getClass(), "useBlacklist", term203965);
        setField(term203793, term203793.getClass(), "maximumTrustlines", term203967);
        setField(term203793, term203793.getClass(), "dropType", enum364);
        setField(term203793, term203793.getClass(), "lockUuid", "iApJWgnQkP");
        setField(term203793, term203793.getClass(), "failReason", "kHKzzYJxiP");
        setField(term203793, term203793.getClass(), "feesPaid", "INFnBrMIka");
        setField(term203793, term203793.getClass(), "minBalance", "EwmpEgdvZs");
        setField(term203793, term203793.getClass(), "maxBalance", "vRjHouXWLC");
        setField(term203793, term203793.getClass(), "maxXrpFeePerTransaction", "XghDInkWEe");
        setField(term203793, term203793.getClass(), "retryOfId", term204071);
        setField(term203793, term203793.getClass(), "nftIssuerAddress", "zPDuGbsYGT");
        setField(term203793, term203793.getClass(), "nftTaxon", term204085);
        setField(term203793, term203793.getClass(), "contactEmail", "apnNoBOovC");
        setField(term203793, term203793.getClass(), "autoApprove", term204099);
        setField(term203793, term203793.getClass(), "memo", "SyGIHWAumE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Object[] args = new Object[1];
        args[0] = enum363;
        callMethod(klass, "setPaymentType", argTypes, term203793, args);
    }

};


