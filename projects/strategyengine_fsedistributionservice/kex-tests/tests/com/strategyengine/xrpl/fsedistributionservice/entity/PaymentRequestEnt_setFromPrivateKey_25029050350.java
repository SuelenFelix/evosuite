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

public class PaymentRequestEnt_setFromPrivateKey_25029050350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term191621;

    public PaymentRequestEnt_setFromPrivateKey_25029050350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term191622 = new Long(7450734758126089960L);
        Class<? extends Object> term191985 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term191984 = ((Class) term191985).getDeclaredField((String) "POPULATING_ADDRESSES");
        ((Field) term191984).setAccessible(true);
        Object enum341 = ((Field) term191984).get((Object) null);
        Class<? extends Object> term192527 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term192526 = ((Class) term192527).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term192526).setAccessible(true);
        Object enum342 = ((Field) term192526).get((Object) null);
        Boolean term191802 = new Boolean(false);
        Boolean term191804 = new Boolean(false);
        Integer term191806 = new Integer(-2015854073);
        Class<? extends Object> term192925 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term192924 = ((Class) term192925).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term192924).setAccessible(true);
        Object enum343 = ((Field) term192924).get((Object) null);
        Long term191910 = new Long(1377567570761089535L);
        Long term191924 = new Long(-8531377551015443915L);
        Boolean term191938 = new Boolean(true);
        term191621 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term191648 = newInstance(Class.forName("java.util.Date"));
        Object term191650 = newInstance(Class.forName("java.util.Date"));
        Object term191652 = newInstance(Class.forName("java.util.Date"));
        setField(term191621, term191621.getClass(), "id", term191622);
        setField(term191621, term191621.getClass(), "environment", "oTnPmmIphJ");
        setField(term191621, term191621.getClass(), "populateEnvironment", "vTgJolwQXF");
        setLongField(term191648, term191648.getClass(), "fastTime", 1765037341041L);
        setField(term191648, term191648.getClass(), "cdate", null);
        setField(term191621, term191621.getClass(), "createDate", term191648);
        setLongField(term191650, term191650.getClass(), "fastTime", 1443806678255L);
        setField(term191650, term191650.getClass(), "cdate", null);
        setField(term191621, term191621.getClass(), "updateDate", term191650);
        setLongField(term191652, term191652.getClass(), "fastTime", 1379437434695L);
        setField(term191652, term191652.getClass(), "cdate", null);
        setField(term191621, term191621.getClass(), "startTime", term191652);
        setField(term191621, term191621.getClass(), "status", enum341);
        setField(term191621, term191621.getClass(), "fromClassicAddress", "QuNSfeKtAH");
        setField(term191621, term191621.getClass(), "fromSigningPublicKey", "vFhRdscfFA");
        setField(term191621, term191621.getClass(), "fromPrivateKey", "ZmfocrvaII");
        setField(term191621, term191621.getClass(), "trustlineIssuerClassicAddress", "LTbQXrGKuA");
        setField(term191621, term191621.getClass(), "currencyName", "gzmGmDALUv");
        setField(term191621, term191621.getClass(), "snapshotTrustlineIssuerClassicAddress", "ZRoptBRTDM");
        setField(term191621, term191621.getClass(), "snapshotCurrencyName", "vVVFChfeBQ");
        setField(term191621, term191621.getClass(), "currencyNameForProcess", "aASfcqfBbh");
        setField(term191621, term191621.getClass(), "amount", "DwpOIkpRFT");
        setField(term191621, term191621.getClass(), "paymentType", enum342);
        setField(term191621, term191621.getClass(), "newTrustlinesOnly", term191802);
        setField(term191621, term191621.getClass(), "useBlacklist", term191804);
        setField(term191621, term191621.getClass(), "maximumTrustlines", term191806);
        setField(term191621, term191621.getClass(), "dropType", enum343);
        setField(term191621, term191621.getClass(), "lockUuid", "LPlTDoLrUy");
        setField(term191621, term191621.getClass(), "failReason", "XETimBHIKG");
        setField(term191621, term191621.getClass(), "feesPaid", "nOKVZSyfbZ");
        setField(term191621, term191621.getClass(), "minBalance", "adHZFgDoEH");
        setField(term191621, term191621.getClass(), "maxBalance", "vjNETNMDhQ");
        setField(term191621, term191621.getClass(), "maxXrpFeePerTransaction", "pexqQqwSNj");
        setField(term191621, term191621.getClass(), "retryOfId", term191910);
        setField(term191621, term191621.getClass(), "nftIssuerAddress", "myfXkIEBSV");
        setField(term191621, term191621.getClass(), "nftTaxon", term191924);
        setField(term191621, term191621.getClass(), "contactEmail", "LSrqDVjzEP");
        setField(term191621, term191621.getClass(), "autoApprove", term191938);
        setField(term191621, term191621.getClass(), "memo", "CPZCLJxTuA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ivAOXnVjmg";
        callMethod(klass, "setFromPrivateKey", argTypes, term191621, args);
    }

};


