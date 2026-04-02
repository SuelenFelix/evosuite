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

public class PaymentRequestEnt_PaymentRequestEntBuilder_autoApprove_203374321132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102445;
     Object term102761;

    public PaymentRequestEnt_PaymentRequestEntBuilder_autoApprove_203374321132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term102446 = new Long(-7001094993638840490L);
        Class<? extends Object> term102784 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term102783 = ((Class) term102784).getDeclaredField((String) "PENDING_REVIEW");
        ((Field) term102783).setAccessible(true);
        Object enum184 = ((Field) term102783).get((Object) null);
        Class<? extends Object> term103308 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term103307 = ((Class) term103308).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term103307).setAccessible(true);
        Object enum185 = ((Field) term103307).get((Object) null);
        Boolean term102620 = new Boolean(false);
        Boolean term102622 = new Boolean(true);
        Integer term102624 = new Integer(1375330971);
        Class<? extends Object> term103706 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term103705 = ((Class) term103706).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term103705).setAccessible(true);
        Object enum186 = ((Field) term103705).get((Object) null);
        Long term102719 = new Long(3077284143733577490L);
        Long term102733 = new Long(4458302820344896046L);
        Boolean term102747 = new Boolean(true);
        term102445 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        Object term102472 = newInstance(Class.forName("java.util.Date"));
        Object term102474 = newInstance(Class.forName("java.util.Date"));
        Object term102476 = newInstance(Class.forName("java.util.Date"));
        setField(term102445, term102445.getClass(), "id", term102446);
        setField(term102445, term102445.getClass(), "environment", "VOHPpErtan");
        setField(term102445, term102445.getClass(), "populateEnvironment", "GDMUlolTNs");
        setLongField(term102472, term102472.getClass(), "fastTime", 1714093306769L);
        setField(term102472, term102472.getClass(), "cdate", null);
        setField(term102445, term102445.getClass(), "createDate", term102472);
        setLongField(term102474, term102474.getClass(), "fastTime", 1792469628390L);
        setField(term102474, term102474.getClass(), "cdate", null);
        setField(term102445, term102445.getClass(), "updateDate", term102474);
        setLongField(term102476, term102476.getClass(), "fastTime", 1268276869683L);
        setField(term102476, term102476.getClass(), "cdate", null);
        setField(term102445, term102445.getClass(), "startTime", term102476);
        setField(term102445, term102445.getClass(), "status", enum184);
        setField(term102445, term102445.getClass(), "fromClassicAddress", "xpLvWisjzN");
        setField(term102445, term102445.getClass(), "fromSigningPublicKey", "IKfozyyKEj");
        setField(term102445, term102445.getClass(), "fromPrivateKey", "thCjwQjRBL");
        setField(term102445, term102445.getClass(), "trustlineIssuerClassicAddress", "ojLrjltndD");
        setField(term102445, term102445.getClass(), "currencyName", "VJtFSexKat");
        setField(term102445, term102445.getClass(), "snapshotTrustlineIssuerClassicAddress", "xPVddlPSQR");
        setField(term102445, term102445.getClass(), "snapshotCurrencyName", "MxrhCLTMTH");
        setField(term102445, term102445.getClass(), "currencyNameForProcess", "kEehLMZcOU");
        setField(term102445, term102445.getClass(), "amount", "RhLliqMiOF");
        setField(term102445, term102445.getClass(), "paymentType", enum185);
        setField(term102445, term102445.getClass(), "newTrustlinesOnly", term102620);
        setField(term102445, term102445.getClass(), "useBlacklist", term102622);
        setField(term102445, term102445.getClass(), "maximumTrustlines", term102624);
        setField(term102445, term102445.getClass(), "dropType", enum186);
        setField(term102445, term102445.getClass(), "lockUuid", "jlhonEGrJH");
        setField(term102445, term102445.getClass(), "failReason", "RKcKwlEYZb");
        setField(term102445, term102445.getClass(), "feesPaid", "acPRDlpsid");
        setField(term102445, term102445.getClass(), "minBalance", "YyojIzvxLZ");
        setField(term102445, term102445.getClass(), "maxBalance", "fxapaYlZea");
        setField(term102445, term102445.getClass(), "maxXrpFeePerTransaction", "VJgREHwfRM");
        setField(term102445, term102445.getClass(), "retryOfId", term102719);
        setField(term102445, term102445.getClass(), "nftIssuerAddress", "kXnpLIZTAr");
        setField(term102445, term102445.getClass(), "nftTaxon", term102733);
        setField(term102445, term102445.getClass(), "contactEmail", "ZiMAmqpbzk");
        setField(term102445, term102445.getClass(), "autoApprove", term102747);
        setField(term102445, term102445.getClass(), "memo", "UwJtBPAtSU");
        term102761 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term102761;
        callMethod(klass, "autoApprove", argTypes, term102445, args);
    }

};


