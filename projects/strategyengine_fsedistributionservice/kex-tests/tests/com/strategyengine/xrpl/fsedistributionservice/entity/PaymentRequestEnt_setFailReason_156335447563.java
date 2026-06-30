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

public class PaymentRequestEnt_setFailReason_156335447563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214584;

    public PaymentRequestEnt_setFailReason_156335447563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term214585 = new Long(6437032166810658671L);
        Class<? extends Object> term214927 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term214926 = ((Class) term214927).getDeclaredField((String) "COMPLETE");
        ((Field) term214926).setAccessible(true);
        Object enum381 = ((Field) term214926).get((Object) null);
        Class<? extends Object> term215433 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term215432 = ((Class) term215433).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term215432).setAccessible(true);
        Object enum382 = ((Field) term215432).get((Object) null);
        Boolean term214753 = new Boolean(false);
        Boolean term214755 = new Boolean(true);
        Integer term214757 = new Integer(9726679);
        Class<? extends Object> term215831 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term215830 = ((Class) term215831).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term215830).setAccessible(true);
        Object enum383 = ((Field) term215830).get((Object) null);
        Long term214852 = new Long(6044346825617132280L);
        Long term214866 = new Long(-4994148485124075625L);
        Boolean term214880 = new Boolean(true);
        term214584 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term214611 = newInstance(Class.forName("java.util.Date"));
        Object term214613 = newInstance(Class.forName("java.util.Date"));
        Object term214615 = newInstance(Class.forName("java.util.Date"));
        setField(term214584, term214584.getClass(), "id", term214585);
        setField(term214584, term214584.getClass(), "environment", "WqaQxuPbzr");
        setField(term214584, term214584.getClass(), "populateEnvironment", "bjLZqJqmnv");
        setLongField(term214611, term214611.getClass(), "fastTime", 1691477911969L);
        setField(term214611, term214611.getClass(), "cdate", null);
        setField(term214584, term214584.getClass(), "createDate", term214611);
        setLongField(term214613, term214613.getClass(), "fastTime", 1788833806516L);
        setField(term214613, term214613.getClass(), "cdate", null);
        setField(term214584, term214584.getClass(), "updateDate", term214613);
        setLongField(term214615, term214615.getClass(), "fastTime", 1329066460297L);
        setField(term214615, term214615.getClass(), "cdate", null);
        setField(term214584, term214584.getClass(), "startTime", term214615);
        setField(term214584, term214584.getClass(), "status", enum381);
        setField(term214584, term214584.getClass(), "fromClassicAddress", "TPbMBzbcHs");
        setField(term214584, term214584.getClass(), "fromSigningPublicKey", "spkDvqsOhJ");
        setField(term214584, term214584.getClass(), "fromPrivateKey", "faFVBESzWc");
        setField(term214584, term214584.getClass(), "trustlineIssuerClassicAddress", "baFwYJAfPz");
        setField(term214584, term214584.getClass(), "currencyName", "PxBSOwkatN");
        setField(term214584, term214584.getClass(), "snapshotTrustlineIssuerClassicAddress", "uKjlgaHcoc");
        setField(term214584, term214584.getClass(), "snapshotCurrencyName", "ITJMSWaPGZ");
        setField(term214584, term214584.getClass(), "currencyNameForProcess", "ivvEvcUacU");
        setField(term214584, term214584.getClass(), "amount", "gbSukHPGfP");
        setField(term214584, term214584.getClass(), "paymentType", enum382);
        setField(term214584, term214584.getClass(), "newTrustlinesOnly", term214753);
        setField(term214584, term214584.getClass(), "useBlacklist", term214755);
        setField(term214584, term214584.getClass(), "maximumTrustlines", term214757);
        setField(term214584, term214584.getClass(), "dropType", enum383);
        setField(term214584, term214584.getClass(), "lockUuid", "jEDnJjwhoo");
        setField(term214584, term214584.getClass(), "failReason", "TkTHRRicKc");
        setField(term214584, term214584.getClass(), "feesPaid", "xwBoTnuoQg");
        setField(term214584, term214584.getClass(), "minBalance", "HHAcgDPghN");
        setField(term214584, term214584.getClass(), "maxBalance", "GzmFcFoYft");
        setField(term214584, term214584.getClass(), "maxXrpFeePerTransaction", "LYRdIFgbgt");
        setField(term214584, term214584.getClass(), "retryOfId", term214852);
        setField(term214584, term214584.getClass(), "nftIssuerAddress", "NiKeRXajei");
        setField(term214584, term214584.getClass(), "nftTaxon", term214866);
        setField(term214584, term214584.getClass(), "contactEmail", "fDNtdfDzQh");
        setField(term214584, term214584.getClass(), "autoApprove", term214880);
        setField(term214584, term214584.getClass(), "memo", "VbIydgisyZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vigaMWRpCA";
        callMethod(klass, "setFailReason", argTypes, term214584, args);
    }

};


