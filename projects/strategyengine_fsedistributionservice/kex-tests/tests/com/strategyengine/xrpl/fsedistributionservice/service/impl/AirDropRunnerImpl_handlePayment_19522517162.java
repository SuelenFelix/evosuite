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

public class AirDropRunnerImpl_handlePayment_19522517162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26518;
     Object term26829;
     Object term26923;

    public AirDropRunnerImpl_handlePayment_19522517162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term26519 = new Long(682356318767179819L);
        Class<? extends Object> term26946 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term26945 = ((Class) term26946).getDeclaredField((String) "COMPLETE");
        ((Field) term26945).setAccessible(true);
        Object enum47 = ((Field) term26945).get((Object) null);
        Class<? extends Object> term27452 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term27451 = ((Class) term27452).getDeclaredField((String) "FLAT");
        ((Field) term27451).setAccessible(true);
        Object enum48 = ((Field) term27451).get((Object) null);
        Boolean term26679 = new Boolean(false);
        Boolean term26681 = new Boolean(true);
        Integer term26683 = new Integer(-1685132342);
        Class<? extends Object> term27826 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term27825 = ((Class) term27826).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term27825).setAccessible(true);
        Object enum49 = ((Field) term27825).get((Object) null);
        Long term26787 = new Long(-7291743527973326814L);
        Long term26801 = new Long(-5963439350418910964L);
        Boolean term26815 = new Boolean(true);
        term26518 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term26545 = newInstance(Class.forName("java.util.Date"));
        Object term26547 = newInstance(Class.forName("java.util.Date"));
        Object term26549 = newInstance(Class.forName("java.util.Date"));
        setField(term26518, term26518.getClass(), "id", term26519);
        setField(term26518, term26518.getClass(), "environment", "pumvwBWvpy");
        setField(term26518, term26518.getClass(), "populateEnvironment", "HwLHeGLyhe");
        setLongField(term26545, term26545.getClass(), "fastTime", 1395479491666L);
        setField(term26545, term26545.getClass(), "cdate", null);
        setField(term26518, term26518.getClass(), "createDate", term26545);
        setLongField(term26547, term26547.getClass(), "fastTime", 1466008719289L);
        setField(term26547, term26547.getClass(), "cdate", null);
        setField(term26518, term26518.getClass(), "updateDate", term26547);
        setLongField(term26549, term26549.getClass(), "fastTime", 1535838449065L);
        setField(term26549, term26549.getClass(), "cdate", null);
        setField(term26518, term26518.getClass(), "startTime", term26549);
        setField(term26518, term26518.getClass(), "status", enum47);
        setField(term26518, term26518.getClass(), "fromClassicAddress", "RDnkgWkcbz");
        setField(term26518, term26518.getClass(), "fromSigningPublicKey", "IBpaxltauX");
        setField(term26518, term26518.getClass(), "fromPrivateKey", "hePqROaplw");
        setField(term26518, term26518.getClass(), "trustlineIssuerClassicAddress", "PJcSNDruWd");
        setField(term26518, term26518.getClass(), "currencyName", "VVNNlAePXF");
        setField(term26518, term26518.getClass(), "snapshotTrustlineIssuerClassicAddress", "jnwVnmKAFv");
        setField(term26518, term26518.getClass(), "snapshotCurrencyName", "TXyHhqeCjR");
        setField(term26518, term26518.getClass(), "currencyNameForProcess", "lZIgPZPgTu");
        setField(term26518, term26518.getClass(), "amount", "iuCxnHGMoW");
        setField(term26518, term26518.getClass(), "paymentType", enum48);
        setField(term26518, term26518.getClass(), "newTrustlinesOnly", term26679);
        setField(term26518, term26518.getClass(), "useBlacklist", term26681);
        setField(term26518, term26518.getClass(), "maximumTrustlines", term26683);
        setField(term26518, term26518.getClass(), "dropType", enum49);
        setField(term26518, term26518.getClass(), "lockUuid", "GPSEWEDSTo");
        setField(term26518, term26518.getClass(), "failReason", "RCOqfVsRHt");
        setField(term26518, term26518.getClass(), "feesPaid", "TSyCeEZPaT");
        setField(term26518, term26518.getClass(), "minBalance", "JeZFtaqkzW");
        setField(term26518, term26518.getClass(), "maxBalance", "vOVuNSCCLe");
        setField(term26518, term26518.getClass(), "maxXrpFeePerTransaction", "fzeqPnzpnt");
        setField(term26518, term26518.getClass(), "retryOfId", term26787);
        setField(term26518, term26518.getClass(), "nftIssuerAddress", "RxbhrFBjkO");
        setField(term26518, term26518.getClass(), "nftTaxon", term26801);
        setField(term26518, term26518.getClass(), "contactEmail", "aanyiAOJCl");
        setField(term26518, term26518.getClass(), "autoApprove", term26815);
        setField(term26518, term26518.getClass(), "memo", "VDokbsCuqq");
        Long term26830 = new Long(9013624480170062917L);
        Class<? extends Object> term28351 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term28350 = ((Class) term28351).getDeclaredField((String) "SENDING");
        ((Field) term28350).setAccessible(true);
        Object enum50 = ((Field) term28350).get((Object) null);
        Integer term26883 = new Integer(-1456670397);
        Long term26885 = new Long(7862575738391801707L);
        term26829 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt"));
        Object term26844 = newInstance(Class.forName("java.util.Date"));
        Object term26846 = newInstance(Class.forName("java.util.Date"));
        setField(term26829, term26829.getClass(), "id", term26830);
        setField(term26829, term26829.getClass(), "address", "xClUIcPECX");
        setLongField(term26844, term26844.getClass(), "fastTime", 1345923503543L);
        setField(term26844, term26844.getClass(), "cdate", null);
        setField(term26829, term26829.getClass(), "createDate", term26844);
        setLongField(term26846, term26846.getClass(), "fastTime", 1838357779277L);
        setField(term26846, term26846.getClass(), "cdate", null);
        setField(term26829, term26829.getClass(), "updateDate", term26846);
        setField(term26829, term26829.getClass(), "status", enum50);
        setField(term26829, term26829.getClass(), "failReason", "avhRaGZaBF");
        setField(term26829, term26829.getClass(), "code", "JkgoRtImdE");
        setField(term26829, term26829.getClass(), "retryAttempt", term26883);
        setField(term26829, term26829.getClass(), "dropRequestId", term26885);
        setField(term26829, term26829.getClass(), "snapshotBalance", "qFGKIJjlmV");
        setField(term26829, term26829.getClass(), "payAmount", "IHqvyhMtuM");
        setField(term26829, term26829.getClass(), "ownedNftId", "dAldIGYAXV");
        term26923 = newInstance(Class.forName("java.util.concurrent.atomic.AtomicInteger"));
        setIntField(term26923, term26923.getClass(), "value", 568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.service.impl.AirDropRunnerImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        argTypes[1] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.DropRecipientEnt");
        argTypes[2] = Class.forName("java.util.concurrent.atomic.AtomicInteger");
        Object[] args = new Object[3];
        args[0] = term26518;
        args[1] = term26829;
        args[2] = term26923;
        callMethod(klass, "handlePayment", argTypes, null, args);
    }

};


