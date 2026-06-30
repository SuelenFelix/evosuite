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

public class PaymentRequestEnt_PaymentRequestEntBuilder_amount_69603444416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74597;

    public PaymentRequestEnt_PaymentRequestEntBuilder_amount_69603444416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term74598 = new Long(-1964501434345816975L);
        Class<? extends Object> term74936 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term74935 = ((Class) term74936).getDeclaredField((String) "POPULATING_ADDRESSES");
        ((Field) term74935).setAccessible(true);
        Object enum136 = ((Field) term74935).get((Object) null);
        Class<? extends Object> term75478 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term75477 = ((Class) term75478).getDeclaredField((String) "FLAT");
        ((Field) term75477).setAccessible(true);
        Object enum137 = ((Field) term75477).get((Object) null);
        Boolean term74770 = new Boolean(true);
        Boolean term74772 = new Boolean(true);
        Integer term74774 = new Integer(97029295);
        Class<? extends Object> term75852 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term75851 = ((Class) term75852).getDeclaredField((String) "TRUSTLINE");
        ((Field) term75851).setAccessible(true);
        Object enum138 = ((Field) term75851).get((Object) null);
        Long term74861 = new Long(4689907154423223972L);
        Long term74875 = new Long(8512025621149521819L);
        Boolean term74889 = new Boolean(true);
        term74597 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        Object term74624 = newInstance(Class.forName("java.util.Date"));
        Object term74626 = newInstance(Class.forName("java.util.Date"));
        Object term74628 = newInstance(Class.forName("java.util.Date"));
        setField(term74597, term74597.getClass(), "id", term74598);
        setField(term74597, term74597.getClass(), "environment", "ANHjlWPmZG");
        setField(term74597, term74597.getClass(), "populateEnvironment", "SibzENsyyy");
        setLongField(term74624, term74624.getClass(), "fastTime", 1619073156188L);
        setField(term74624, term74624.getClass(), "cdate", null);
        setField(term74597, term74597.getClass(), "createDate", term74624);
        setLongField(term74626, term74626.getClass(), "fastTime", 1275828301071L);
        setField(term74626, term74626.getClass(), "cdate", null);
        setField(term74597, term74597.getClass(), "updateDate", term74626);
        setLongField(term74628, term74628.getClass(), "fastTime", 1792332776506L);
        setField(term74628, term74628.getClass(), "cdate", null);
        setField(term74597, term74597.getClass(), "startTime", term74628);
        setField(term74597, term74597.getClass(), "status", enum136);
        setField(term74597, term74597.getClass(), "fromClassicAddress", "mrqGHotaef");
        setField(term74597, term74597.getClass(), "fromSigningPublicKey", "UbZGBpQZQW");
        setField(term74597, term74597.getClass(), "fromPrivateKey", "SvGTualQPa");
        setField(term74597, term74597.getClass(), "trustlineIssuerClassicAddress", "mdxcgZwsaP");
        setField(term74597, term74597.getClass(), "currencyName", "XildIRoZHG");
        setField(term74597, term74597.getClass(), "snapshotTrustlineIssuerClassicAddress", "lEcrFlxJXH");
        setField(term74597, term74597.getClass(), "snapshotCurrencyName", "VNdDwXMYxR");
        setField(term74597, term74597.getClass(), "currencyNameForProcess", "bVbexZPmwW");
        setField(term74597, term74597.getClass(), "amount", "tvxYdqiyGc");
        setField(term74597, term74597.getClass(), "paymentType", enum137);
        setField(term74597, term74597.getClass(), "newTrustlinesOnly", term74770);
        setField(term74597, term74597.getClass(), "useBlacklist", term74772);
        setField(term74597, term74597.getClass(), "maximumTrustlines", term74774);
        setField(term74597, term74597.getClass(), "dropType", enum138);
        setField(term74597, term74597.getClass(), "lockUuid", "ZEXFoMSKeG");
        setField(term74597, term74597.getClass(), "failReason", "HvxahUfZcJ");
        setField(term74597, term74597.getClass(), "feesPaid", "WkLpmqoQxy");
        setField(term74597, term74597.getClass(), "minBalance", "XiNoscmYhd");
        setField(term74597, term74597.getClass(), "maxBalance", "asMqnMNrZp");
        setField(term74597, term74597.getClass(), "maxXrpFeePerTransaction", "pqFUMTCKJd");
        setField(term74597, term74597.getClass(), "retryOfId", term74861);
        setField(term74597, term74597.getClass(), "nftIssuerAddress", "PTEndmPMzk");
        setField(term74597, term74597.getClass(), "nftTaxon", term74875);
        setField(term74597, term74597.getClass(), "contactEmail", "aJQuCOCvZs");
        setField(term74597, term74597.getClass(), "autoApprove", term74889);
        setField(term74597, term74597.getClass(), "memo", "lHYNCJRiOv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "QVLresHoaP";
        callMethod(klass, "amount", argTypes, term74597, args);
    }

};


