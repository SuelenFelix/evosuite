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

public class PaymentRequestEnt_setMaxBalance_157609137166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219836;

    public PaymentRequestEnt_setMaxBalance_157609137166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term219837 = new Long(-4187265590402169996L);
        Class<? extends Object> term220188 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term220187 = ((Class) term220188).getDeclaredField((String) "REJECTED");
        ((Field) term220187).setAccessible(true);
        Object enum390 = ((Field) term220187).get((Object) null);
        Class<? extends Object> term220694 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term220693 = ((Class) term220694).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term220693).setAccessible(true);
        Object enum391 = ((Field) term220693).get((Object) null);
        Boolean term220005 = new Boolean(true);
        Boolean term220007 = new Boolean(true);
        Integer term220009 = new Integer(202001407);
        Class<? extends Object> term221092 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term221091 = ((Class) term221092).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term221091).setAccessible(true);
        Object enum392 = ((Field) term221091).get((Object) null);
        Long term220113 = new Long(-8033044954947064558L);
        Long term220127 = new Long(4626639872957534248L);
        Boolean term220141 = new Boolean(false);
        term219836 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term219863 = newInstance(Class.forName("java.util.Date"));
        Object term219865 = newInstance(Class.forName("java.util.Date"));
        Object term219867 = newInstance(Class.forName("java.util.Date"));
        setField(term219836, term219836.getClass(), "id", term219837);
        setField(term219836, term219836.getClass(), "environment", "tycssGWZvU");
        setField(term219836, term219836.getClass(), "populateEnvironment", "jcvrILwbgt");
        setLongField(term219863, term219863.getClass(), "fastTime", 1486160364565L);
        setField(term219863, term219863.getClass(), "cdate", null);
        setField(term219836, term219836.getClass(), "createDate", term219863);
        setLongField(term219865, term219865.getClass(), "fastTime", 1269375390033L);
        setField(term219865, term219865.getClass(), "cdate", null);
        setField(term219836, term219836.getClass(), "updateDate", term219865);
        setLongField(term219867, term219867.getClass(), "fastTime", 1559323908807L);
        setField(term219867, term219867.getClass(), "cdate", null);
        setField(term219836, term219836.getClass(), "startTime", term219867);
        setField(term219836, term219836.getClass(), "status", enum390);
        setField(term219836, term219836.getClass(), "fromClassicAddress", "AphrAHzPMC");
        setField(term219836, term219836.getClass(), "fromSigningPublicKey", "iwismCnYjB");
        setField(term219836, term219836.getClass(), "fromPrivateKey", "GerBZdiruT");
        setField(term219836, term219836.getClass(), "trustlineIssuerClassicAddress", "VzkPDPPGQl");
        setField(term219836, term219836.getClass(), "currencyName", "iojOXjfZFr");
        setField(term219836, term219836.getClass(), "snapshotTrustlineIssuerClassicAddress", "yyrkuIYJKj");
        setField(term219836, term219836.getClass(), "snapshotCurrencyName", "reGIMbnrGF");
        setField(term219836, term219836.getClass(), "currencyNameForProcess", "yquSngBHqd");
        setField(term219836, term219836.getClass(), "amount", "ZSdaJkZZPm");
        setField(term219836, term219836.getClass(), "paymentType", enum391);
        setField(term219836, term219836.getClass(), "newTrustlinesOnly", term220005);
        setField(term219836, term219836.getClass(), "useBlacklist", term220007);
        setField(term219836, term219836.getClass(), "maximumTrustlines", term220009);
        setField(term219836, term219836.getClass(), "dropType", enum392);
        setField(term219836, term219836.getClass(), "lockUuid", "ICnzwgujDT");
        setField(term219836, term219836.getClass(), "failReason", "RfDgUkIYjW");
        setField(term219836, term219836.getClass(), "feesPaid", "QnZKCwkmMh");
        setField(term219836, term219836.getClass(), "minBalance", "RVQbteztJx");
        setField(term219836, term219836.getClass(), "maxBalance", "yjmUdvwSdd");
        setField(term219836, term219836.getClass(), "maxXrpFeePerTransaction", "COsGswsrtI");
        setField(term219836, term219836.getClass(), "retryOfId", term220113);
        setField(term219836, term219836.getClass(), "nftIssuerAddress", "ebUWnoVDmk");
        setField(term219836, term219836.getClass(), "nftTaxon", term220127);
        setField(term219836, term219836.getClass(), "contactEmail", "wCcojFgWKb");
        setField(term219836, term219836.getClass(), "autoApprove", term220141);
        setField(term219836, term219836.getClass(), "memo", "iHtqLPNWTt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TQgECVDMEf";
        callMethod(klass, "setMaxBalance", argTypes, term219836, args);
    }

};


