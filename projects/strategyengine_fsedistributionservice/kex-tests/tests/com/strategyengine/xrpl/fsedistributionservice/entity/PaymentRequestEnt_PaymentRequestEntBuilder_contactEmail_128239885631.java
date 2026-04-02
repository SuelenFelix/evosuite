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

public class PaymentRequestEnt_PaymentRequestEntBuilder_contactEmail_128239885631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100617;

    public PaymentRequestEnt_PaymentRequestEntBuilder_contactEmail_128239885631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term100618 = new Long(-7013378340043571457L);
        Class<? extends Object> term100981 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term100980 = ((Class) term100981).getDeclaredField((String) "POPULATING_ADDRESSES");
        ((Field) term100980).setAccessible(true);
        Object enum181 = ((Field) term100980).get((Object) null);
        Class<? extends Object> term101523 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term101522 = ((Class) term101523).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term101522).setAccessible(true);
        Object enum182 = ((Field) term101522).get((Object) null);
        Boolean term100798 = new Boolean(true);
        Boolean term100800 = new Boolean(true);
        Integer term100802 = new Integer(1063420942);
        Class<? extends Object> term101921 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term101920 = ((Class) term101921).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term101920).setAccessible(true);
        Object enum183 = ((Field) term101920).get((Object) null);
        Long term100906 = new Long(-3279534582096707294L);
        Long term100920 = new Long(-6490254947459640565L);
        Boolean term100934 = new Boolean(false);
        term100617 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        Object term100644 = newInstance(Class.forName("java.util.Date"));
        Object term100646 = newInstance(Class.forName("java.util.Date"));
        Object term100648 = newInstance(Class.forName("java.util.Date"));
        setField(term100617, term100617.getClass(), "id", term100618);
        setField(term100617, term100617.getClass(), "environment", "nsofCJqJOR");
        setField(term100617, term100617.getClass(), "populateEnvironment", "CitJiZwsjF");
        setLongField(term100644, term100644.getClass(), "fastTime", 1664732674090L);
        setField(term100644, term100644.getClass(), "cdate", null);
        setField(term100617, term100617.getClass(), "createDate", term100644);
        setLongField(term100646, term100646.getClass(), "fastTime", 1699925062576L);
        setField(term100646, term100646.getClass(), "cdate", null);
        setField(term100617, term100617.getClass(), "updateDate", term100646);
        setLongField(term100648, term100648.getClass(), "fastTime", 1706636196274L);
        setField(term100648, term100648.getClass(), "cdate", null);
        setField(term100617, term100617.getClass(), "startTime", term100648);
        setField(term100617, term100617.getClass(), "status", enum181);
        setField(term100617, term100617.getClass(), "fromClassicAddress", "ZiyMvLArWJ");
        setField(term100617, term100617.getClass(), "fromSigningPublicKey", "MaeokjEfWD");
        setField(term100617, term100617.getClass(), "fromPrivateKey", "ocZcumnXEz");
        setField(term100617, term100617.getClass(), "trustlineIssuerClassicAddress", "rNNwyactDR");
        setField(term100617, term100617.getClass(), "currencyName", "QJrTMTdxyh");
        setField(term100617, term100617.getClass(), "snapshotTrustlineIssuerClassicAddress", "rgZSPplPSs");
        setField(term100617, term100617.getClass(), "snapshotCurrencyName", "NPUSTXlEKx");
        setField(term100617, term100617.getClass(), "currencyNameForProcess", "KKFprGoNpl");
        setField(term100617, term100617.getClass(), "amount", "tWVISJlxKZ");
        setField(term100617, term100617.getClass(), "paymentType", enum182);
        setField(term100617, term100617.getClass(), "newTrustlinesOnly", term100798);
        setField(term100617, term100617.getClass(), "useBlacklist", term100800);
        setField(term100617, term100617.getClass(), "maximumTrustlines", term100802);
        setField(term100617, term100617.getClass(), "dropType", enum183);
        setField(term100617, term100617.getClass(), "lockUuid", "rOZkUKEoaf");
        setField(term100617, term100617.getClass(), "failReason", "yLnzGqyHGL");
        setField(term100617, term100617.getClass(), "feesPaid", "IjprPXBDuY");
        setField(term100617, term100617.getClass(), "minBalance", "wkqPmmFDAa");
        setField(term100617, term100617.getClass(), "maxBalance", "rLTDtNqLyW");
        setField(term100617, term100617.getClass(), "maxXrpFeePerTransaction", "CLsbWobdgS");
        setField(term100617, term100617.getClass(), "retryOfId", term100906);
        setField(term100617, term100617.getClass(), "nftIssuerAddress", "TbYrjEyFPc");
        setField(term100617, term100617.getClass(), "nftTaxon", term100920);
        setField(term100617, term100617.getClass(), "contactEmail", "muefchpJiZ");
        setField(term100617, term100617.getClass(), "autoApprove", term100934);
        setField(term100617, term100617.getClass(), "memo", "tuYaAqvYrh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CIbhheukbR";
        callMethod(klass, "contactEmail", argTypes, term100617, args);
    }

};


