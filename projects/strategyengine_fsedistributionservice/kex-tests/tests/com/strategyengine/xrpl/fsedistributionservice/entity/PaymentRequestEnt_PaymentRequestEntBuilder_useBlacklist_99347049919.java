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

public class PaymentRequestEnt_PaymentRequestEntBuilder_useBlacklist_99347049919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79839;
     Object term80135;

    public PaymentRequestEnt_PaymentRequestEntBuilder_useBlacklist_99347049919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term79840 = new Long(-5935517391653614345L);
        Class<? extends Object> term80158 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term80157 = ((Class) term80158).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term80157).setAccessible(true);
        Object enum145 = ((Field) term80157).get((Object) null);
        Class<? extends Object> term80673 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term80672 = ((Class) term80673).getDeclaredField((String) "FLAT");
        ((Field) term80672).setAccessible(true);
        Object enum146 = ((Field) term80672).get((Object) null);
        Boolean term80003 = new Boolean(false);
        Boolean term80005 = new Boolean(false);
        Integer term80007 = new Integer(1225272962);
        Class<? extends Object> term81047 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term81046 = ((Class) term81047).getDeclaredField((String) "GLOBALID");
        ((Field) term81046).setAccessible(true);
        Object enum147 = ((Field) term81046).get((Object) null);
        Long term80093 = new Long(-6521561238735301071L);
        Long term80107 = new Long(-6609679920238945303L);
        Boolean term80121 = new Boolean(true);
        term79839 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        Object term79866 = newInstance(Class.forName("java.util.Date"));
        Object term79868 = newInstance(Class.forName("java.util.Date"));
        Object term79870 = newInstance(Class.forName("java.util.Date"));
        setField(term79839, term79839.getClass(), "id", term79840);
        setField(term79839, term79839.getClass(), "environment", "wdtiuPgTVJ");
        setField(term79839, term79839.getClass(), "populateEnvironment", "HUgzMgrpsK");
        setLongField(term79866, term79866.getClass(), "fastTime", 1674664953654L);
        setField(term79866, term79866.getClass(), "cdate", null);
        setField(term79839, term79839.getClass(), "createDate", term79866);
        setLongField(term79868, term79868.getClass(), "fastTime", 1726911068143L);
        setField(term79868, term79868.getClass(), "cdate", null);
        setField(term79839, term79839.getClass(), "updateDate", term79868);
        setLongField(term79870, term79870.getClass(), "fastTime", 1298065306825L);
        setField(term79870, term79870.getClass(), "cdate", null);
        setField(term79839, term79839.getClass(), "startTime", term79870);
        setField(term79839, term79839.getClass(), "status", enum145);
        setField(term79839, term79839.getClass(), "fromClassicAddress", "ubaBUfLolu");
        setField(term79839, term79839.getClass(), "fromSigningPublicKey", "itAUCFhZhq");
        setField(term79839, term79839.getClass(), "fromPrivateKey", "bIqaKgXgPm");
        setField(term79839, term79839.getClass(), "trustlineIssuerClassicAddress", "uOJFOUcNvv");
        setField(term79839, term79839.getClass(), "currencyName", "tkmmGweDwJ");
        setField(term79839, term79839.getClass(), "snapshotTrustlineIssuerClassicAddress", "pMfTuAFXxg");
        setField(term79839, term79839.getClass(), "snapshotCurrencyName", "XCZmhkblRc");
        setField(term79839, term79839.getClass(), "currencyNameForProcess", "gFUWMydGCU");
        setField(term79839, term79839.getClass(), "amount", "LLegSTfqJt");
        setField(term79839, term79839.getClass(), "paymentType", enum146);
        setField(term79839, term79839.getClass(), "newTrustlinesOnly", term80003);
        setField(term79839, term79839.getClass(), "useBlacklist", term80005);
        setField(term79839, term79839.getClass(), "maximumTrustlines", term80007);
        setField(term79839, term79839.getClass(), "dropType", enum147);
        setField(term79839, term79839.getClass(), "lockUuid", "XQfmqLbqHS");
        setField(term79839, term79839.getClass(), "failReason", "jLVLqQSjqg");
        setField(term79839, term79839.getClass(), "feesPaid", "JKGueoHesL");
        setField(term79839, term79839.getClass(), "minBalance", "CRAUqtVBkU");
        setField(term79839, term79839.getClass(), "maxBalance", "DddqUYfomL");
        setField(term79839, term79839.getClass(), "maxXrpFeePerTransaction", "YQwoogpPyi");
        setField(term79839, term79839.getClass(), "retryOfId", term80093);
        setField(term79839, term79839.getClass(), "nftIssuerAddress", "rnPhHoorxj");
        setField(term79839, term79839.getClass(), "nftTaxon", term80107);
        setField(term79839, term79839.getClass(), "contactEmail", "GuwJLKquuI");
        setField(term79839, term79839.getClass(), "autoApprove", term80121);
        setField(term79839, term79839.getClass(), "memo", "vYMCjgnztg");
        term80135 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term80135;
        callMethod(klass, "useBlacklist", argTypes, term79839, args);
    }

};


