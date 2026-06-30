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

public class PaymentRequestEnt_setSnapshotCurrencyName_192737169954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198589;

    public PaymentRequestEnt_setSnapshotCurrencyName_192737169954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term198590 = new Long(-7574091101944828886L);
        Class<? extends Object> term198918 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term198917 = ((Class) term198918).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term198917).setAccessible(true);
        Object enum353 = ((Field) term198917).get((Object) null);
        Class<? extends Object> term199433 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term199432 = ((Class) term199433).getDeclaredField((String) "FLAT");
        ((Field) term199432).setAccessible(true);
        Object enum354 = ((Field) term199432).get((Object) null);
        Boolean term198753 = new Boolean(false);
        Boolean term198755 = new Boolean(true);
        Integer term198757 = new Integer(107945604);
        Class<? extends Object> term199807 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term199806 = ((Class) term199807).getDeclaredField((String) "GLOBALID");
        ((Field) term199806).setAccessible(true);
        Object enum355 = ((Field) term199806).get((Object) null);
        Long term198843 = new Long(-6792339614909987294L);
        Long term198857 = new Long(-1978508496784157882L);
        Boolean term198871 = new Boolean(false);
        term198589 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term198616 = newInstance(Class.forName("java.util.Date"));
        Object term198618 = newInstance(Class.forName("java.util.Date"));
        Object term198620 = newInstance(Class.forName("java.util.Date"));
        setField(term198589, term198589.getClass(), "id", term198590);
        setField(term198589, term198589.getClass(), "environment", "nlvRWrTxvz");
        setField(term198589, term198589.getClass(), "populateEnvironment", "isMKwgUmka");
        setLongField(term198616, term198616.getClass(), "fastTime", 1771471993431L);
        setField(term198616, term198616.getClass(), "cdate", null);
        setField(term198589, term198589.getClass(), "createDate", term198616);
        setLongField(term198618, term198618.getClass(), "fastTime", 1659506241395L);
        setField(term198618, term198618.getClass(), "cdate", null);
        setField(term198589, term198589.getClass(), "updateDate", term198618);
        setLongField(term198620, term198620.getClass(), "fastTime", 1748670382997L);
        setField(term198620, term198620.getClass(), "cdate", null);
        setField(term198589, term198589.getClass(), "startTime", term198620);
        setField(term198589, term198589.getClass(), "status", enum353);
        setField(term198589, term198589.getClass(), "fromClassicAddress", "pDIyzhDtTy");
        setField(term198589, term198589.getClass(), "fromSigningPublicKey", "wXiUlhXQoC");
        setField(term198589, term198589.getClass(), "fromPrivateKey", "gKhmgJzimH");
        setField(term198589, term198589.getClass(), "trustlineIssuerClassicAddress", "OzRiWLVXNx");
        setField(term198589, term198589.getClass(), "currencyName", "pktmgYsknu");
        setField(term198589, term198589.getClass(), "snapshotTrustlineIssuerClassicAddress", "SsMHzYNeji");
        setField(term198589, term198589.getClass(), "snapshotCurrencyName", "wzAFLFdaEQ");
        setField(term198589, term198589.getClass(), "currencyNameForProcess", "IcbBNUXJqX");
        setField(term198589, term198589.getClass(), "amount", "LONFjqAsUp");
        setField(term198589, term198589.getClass(), "paymentType", enum354);
        setField(term198589, term198589.getClass(), "newTrustlinesOnly", term198753);
        setField(term198589, term198589.getClass(), "useBlacklist", term198755);
        setField(term198589, term198589.getClass(), "maximumTrustlines", term198757);
        setField(term198589, term198589.getClass(), "dropType", enum355);
        setField(term198589, term198589.getClass(), "lockUuid", "tAhydlbSMf");
        setField(term198589, term198589.getClass(), "failReason", "wNYtcPFyIe");
        setField(term198589, term198589.getClass(), "feesPaid", "tlIqgTUSQw");
        setField(term198589, term198589.getClass(), "minBalance", "UvweyXjDhG");
        setField(term198589, term198589.getClass(), "maxBalance", "wnoVhNwdJy");
        setField(term198589, term198589.getClass(), "maxXrpFeePerTransaction", "uQGMBLrmAj");
        setField(term198589, term198589.getClass(), "retryOfId", term198843);
        setField(term198589, term198589.getClass(), "nftIssuerAddress", "vNFaheDeBv");
        setField(term198589, term198589.getClass(), "nftTaxon", term198857);
        setField(term198589, term198589.getClass(), "contactEmail", "CiPMRxGoHO");
        setField(term198589, term198589.getClass(), "autoApprove", term198871);
        setField(term198589, term198589.getClass(), "memo", "LauKpKmenw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TydzbTXvbY";
        callMethod(klass, "setSnapshotCurrencyName", argTypes, term198589, args);
    }

};


