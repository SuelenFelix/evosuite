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

public class PaymentRequestEnt_setAmount_48847037956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202013;

    public PaymentRequestEnt_setAmount_48847037956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term202014 = new Long(8640463098965331396L);
        Class<? extends Object> term202365 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term202364 = ((Class) term202365).getDeclaredField((String) "COMPLETE");
        ((Field) term202364).setAccessible(true);
        Object enum359 = ((Field) term202364).get((Object) null);
        Class<? extends Object> term202871 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term202870 = ((Class) term202871).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term202870).setAccessible(true);
        Object enum360 = ((Field) term202870).get((Object) null);
        Boolean term202182 = new Boolean(false);
        Boolean term202184 = new Boolean(true);
        Integer term202186 = new Integer(71190297);
        Class<? extends Object> term203269 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term203268 = ((Class) term203269).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term203268).setAccessible(true);
        Object enum361 = ((Field) term203268).get((Object) null);
        Long term202290 = new Long(-4136906775323730350L);
        Long term202304 = new Long(6381166215871562039L);
        Boolean term202318 = new Boolean(true);
        term202013 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term202040 = newInstance(Class.forName("java.util.Date"));
        Object term202042 = newInstance(Class.forName("java.util.Date"));
        Object term202044 = newInstance(Class.forName("java.util.Date"));
        setField(term202013, term202013.getClass(), "id", term202014);
        setField(term202013, term202013.getClass(), "environment", "dbxhsKyZWZ");
        setField(term202013, term202013.getClass(), "populateEnvironment", "oXxafKyyrx");
        setLongField(term202040, term202040.getClass(), "fastTime", 1364626164503L);
        setField(term202040, term202040.getClass(), "cdate", null);
        setField(term202013, term202013.getClass(), "createDate", term202040);
        setLongField(term202042, term202042.getClass(), "fastTime", 1818338080731L);
        setField(term202042, term202042.getClass(), "cdate", null);
        setField(term202013, term202013.getClass(), "updateDate", term202042);
        setLongField(term202044, term202044.getClass(), "fastTime", 1472465265682L);
        setField(term202044, term202044.getClass(), "cdate", null);
        setField(term202013, term202013.getClass(), "startTime", term202044);
        setField(term202013, term202013.getClass(), "status", enum359);
        setField(term202013, term202013.getClass(), "fromClassicAddress", "TapDFGQNLY");
        setField(term202013, term202013.getClass(), "fromSigningPublicKey", "vgHeAegSfV");
        setField(term202013, term202013.getClass(), "fromPrivateKey", "qShfKMgKGs");
        setField(term202013, term202013.getClass(), "trustlineIssuerClassicAddress", "bLCaDnEUyS");
        setField(term202013, term202013.getClass(), "currencyName", "yfHcOCDrGy");
        setField(term202013, term202013.getClass(), "snapshotTrustlineIssuerClassicAddress", "juKqILstcn");
        setField(term202013, term202013.getClass(), "snapshotCurrencyName", "QSCQJRyiPa");
        setField(term202013, term202013.getClass(), "currencyNameForProcess", "jPPOVoAOLQ");
        setField(term202013, term202013.getClass(), "amount", "kZKzEkUFFI");
        setField(term202013, term202013.getClass(), "paymentType", enum360);
        setField(term202013, term202013.getClass(), "newTrustlinesOnly", term202182);
        setField(term202013, term202013.getClass(), "useBlacklist", term202184);
        setField(term202013, term202013.getClass(), "maximumTrustlines", term202186);
        setField(term202013, term202013.getClass(), "dropType", enum361);
        setField(term202013, term202013.getClass(), "lockUuid", "dnYvoLZjCf");
        setField(term202013, term202013.getClass(), "failReason", "ZsvLlzqETk");
        setField(term202013, term202013.getClass(), "feesPaid", "DqrZwuHriF");
        setField(term202013, term202013.getClass(), "minBalance", "daaMmTkwOR");
        setField(term202013, term202013.getClass(), "maxBalance", "WfJKDOFrUv");
        setField(term202013, term202013.getClass(), "maxXrpFeePerTransaction", "CbwfWaINrF");
        setField(term202013, term202013.getClass(), "retryOfId", term202290);
        setField(term202013, term202013.getClass(), "nftIssuerAddress", "AVCzSfXhGU");
        setField(term202013, term202013.getClass(), "nftTaxon", term202304);
        setField(term202013, term202013.getClass(), "contactEmail", "nTUCmQGFDE");
        setField(term202013, term202013.getClass(), "autoApprove", term202318);
        setField(term202013, term202013.getClass(), "memo", "rfFTBanxEx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MQJTCGewxT";
        callMethod(klass, "setAmount", argTypes, term202013, args);
    }

};


