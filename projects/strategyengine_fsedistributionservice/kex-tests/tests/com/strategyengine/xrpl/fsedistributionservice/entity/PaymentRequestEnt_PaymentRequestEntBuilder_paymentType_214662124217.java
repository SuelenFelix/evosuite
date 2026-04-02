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

public class PaymentRequestEnt_PaymentRequestEntBuilder_paymentType_214662124217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76325;
     Object enum140;

    public PaymentRequestEnt_PaymentRequestEntBuilder_paymentType_214662124217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term76326 = new Long(2022482096970820459L);
        Class<? extends Object> term76671 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term76670 = ((Class) term76671).getDeclaredField((String) "PENDING_REVIEW");
        ((Field) term76670).setAccessible(true);
        Object enum139 = ((Field) term76670).get((Object) null);
        Class<? extends Object> term77195 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term77194 = ((Class) term77195).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term77194).setAccessible(true);
        enum140 = ((Field) term77194).get((Object) null);
        Boolean term76500 = new Boolean(false);
        Boolean term76502 = new Boolean(true);
        Integer term76504 = new Integer(-1371869594);
        Class<? extends Object> term77593 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term77592 = ((Class) term77593).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term77592).setAccessible(true);
        Object enum141 = ((Field) term77592).get((Object) null);
        Long term76608 = new Long(6315101499811179240L);
        Long term76622 = new Long(-3033337370154155851L);
        Boolean term76636 = new Boolean(false);
        term76325 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        Object term76352 = newInstance(Class.forName("java.util.Date"));
        Object term76354 = newInstance(Class.forName("java.util.Date"));
        Object term76356 = newInstance(Class.forName("java.util.Date"));
        setField(term76325, term76325.getClass(), "id", term76326);
        setField(term76325, term76325.getClass(), "environment", "IbxeAMwLVt");
        setField(term76325, term76325.getClass(), "populateEnvironment", "bShlAqoTmZ");
        setLongField(term76352, term76352.getClass(), "fastTime", 1273578766014L);
        setField(term76352, term76352.getClass(), "cdate", null);
        setField(term76325, term76325.getClass(), "createDate", term76352);
        setLongField(term76354, term76354.getClass(), "fastTime", 1539725848213L);
        setField(term76354, term76354.getClass(), "cdate", null);
        setField(term76325, term76325.getClass(), "updateDate", term76354);
        setLongField(term76356, term76356.getClass(), "fastTime", 1623031057805L);
        setField(term76356, term76356.getClass(), "cdate", null);
        setField(term76325, term76325.getClass(), "startTime", term76356);
        setField(term76325, term76325.getClass(), "status", enum139);
        setField(term76325, term76325.getClass(), "fromClassicAddress", "nOKlKlNhtU");
        setField(term76325, term76325.getClass(), "fromSigningPublicKey", "gXFNBHJSey");
        setField(term76325, term76325.getClass(), "fromPrivateKey", "wUcSfItZgv");
        setField(term76325, term76325.getClass(), "trustlineIssuerClassicAddress", "rOfPCPHmtJ");
        setField(term76325, term76325.getClass(), "currencyName", "EnmiAvfpJv");
        setField(term76325, term76325.getClass(), "snapshotTrustlineIssuerClassicAddress", "AdYzLPMcwe");
        setField(term76325, term76325.getClass(), "snapshotCurrencyName", "FrTZLybkKk");
        setField(term76325, term76325.getClass(), "currencyNameForProcess", "FlxVmiMYKP");
        setField(term76325, term76325.getClass(), "amount", "fgOpAWlGYN");
        setField(term76325, term76325.getClass(), "paymentType", enum140);
        setField(term76325, term76325.getClass(), "newTrustlinesOnly", term76500);
        setField(term76325, term76325.getClass(), "useBlacklist", term76502);
        setField(term76325, term76325.getClass(), "maximumTrustlines", term76504);
        setField(term76325, term76325.getClass(), "dropType", enum141);
        setField(term76325, term76325.getClass(), "lockUuid", "PNzNzzjSXM");
        setField(term76325, term76325.getClass(), "failReason", "ktKcSZiuGM");
        setField(term76325, term76325.getClass(), "feesPaid", "PSOttyUeqv");
        setField(term76325, term76325.getClass(), "minBalance", "HmEvTlmzXo");
        setField(term76325, term76325.getClass(), "maxBalance", "BMMonTIZgJ");
        setField(term76325, term76325.getClass(), "maxXrpFeePerTransaction", "QXyFXBjFde");
        setField(term76325, term76325.getClass(), "retryOfId", term76608);
        setField(term76325, term76325.getClass(), "nftIssuerAddress", "xVFgeyYxZS");
        setField(term76325, term76325.getClass(), "nftTaxon", term76622);
        setField(term76325, term76325.getClass(), "contactEmail", "iQiGTulJiH");
        setField(term76325, term76325.getClass(), "autoApprove", term76636);
        setField(term76325, term76325.getClass(), "memo", "utCuuVCKqE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Object[] args = new Object[1];
        args[0] = enum140;
        callMethod(klass, "paymentType", argTypes, term76325, args);
    }

};


