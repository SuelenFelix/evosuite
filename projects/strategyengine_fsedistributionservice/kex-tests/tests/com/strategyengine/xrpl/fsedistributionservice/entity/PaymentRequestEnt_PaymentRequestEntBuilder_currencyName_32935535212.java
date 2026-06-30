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

public class PaymentRequestEnt_PaymentRequestEntBuilder_currencyName_32935535212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67709;

    public PaymentRequestEnt_PaymentRequestEntBuilder_currencyName_32935535212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term67710 = new Long(7017605765544766728L);
        Class<? extends Object> term68055 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term68054 = ((Class) term68055).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term68054).setAccessible(true);
        Object enum124 = ((Field) term68054).get((Object) null);
        Class<? extends Object> term68570 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term68569 = ((Class) term68570).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term68569).setAccessible(true);
        Object enum125 = ((Field) term68569).get((Object) null);
        Boolean term67881 = new Boolean(true);
        Boolean term67883 = new Boolean(false);
        Integer term67885 = new Integer(-184153539);
        Class<? extends Object> term68968 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term68967 = ((Class) term68968).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term68967).setAccessible(true);
        Object enum126 = ((Field) term68967).get((Object) null);
        Long term67980 = new Long(-6078481855513028760L);
        Long term67994 = new Long(-6985556670871089725L);
        Boolean term68008 = new Boolean(true);
        term67709 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        Object term67736 = newInstance(Class.forName("java.util.Date"));
        Object term67738 = newInstance(Class.forName("java.util.Date"));
        Object term67740 = newInstance(Class.forName("java.util.Date"));
        setField(term67709, term67709.getClass(), "id", term67710);
        setField(term67709, term67709.getClass(), "environment", "UBPHmOICBs");
        setField(term67709, term67709.getClass(), "populateEnvironment", "IDJUVPgUJf");
        setLongField(term67736, term67736.getClass(), "fastTime", 1337283931231L);
        setField(term67736, term67736.getClass(), "cdate", null);
        setField(term67709, term67709.getClass(), "createDate", term67736);
        setLongField(term67738, term67738.getClass(), "fastTime", 1291742269425L);
        setField(term67738, term67738.getClass(), "cdate", null);
        setField(term67709, term67709.getClass(), "updateDate", term67738);
        setLongField(term67740, term67740.getClass(), "fastTime", 1372844831512L);
        setField(term67740, term67740.getClass(), "cdate", null);
        setField(term67709, term67709.getClass(), "startTime", term67740);
        setField(term67709, term67709.getClass(), "status", enum124);
        setField(term67709, term67709.getClass(), "fromClassicAddress", "JmnWRJUxGr");
        setField(term67709, term67709.getClass(), "fromSigningPublicKey", "wgRGBNrTGP");
        setField(term67709, term67709.getClass(), "fromPrivateKey", "FIdNVptZpW");
        setField(term67709, term67709.getClass(), "trustlineIssuerClassicAddress", "rQjxAhisjm");
        setField(term67709, term67709.getClass(), "currencyName", "ZDhASPHjDG");
        setField(term67709, term67709.getClass(), "snapshotTrustlineIssuerClassicAddress", "HNVOAXYNEZ");
        setField(term67709, term67709.getClass(), "snapshotCurrencyName", "gbbYBYyfvr");
        setField(term67709, term67709.getClass(), "currencyNameForProcess", "SrWMUlbtWV");
        setField(term67709, term67709.getClass(), "amount", "VePIumgrrU");
        setField(term67709, term67709.getClass(), "paymentType", enum125);
        setField(term67709, term67709.getClass(), "newTrustlinesOnly", term67881);
        setField(term67709, term67709.getClass(), "useBlacklist", term67883);
        setField(term67709, term67709.getClass(), "maximumTrustlines", term67885);
        setField(term67709, term67709.getClass(), "dropType", enum126);
        setField(term67709, term67709.getClass(), "lockUuid", "DPwIqlszZo");
        setField(term67709, term67709.getClass(), "failReason", "mNgDshwZNc");
        setField(term67709, term67709.getClass(), "feesPaid", "pDqgDbJoFw");
        setField(term67709, term67709.getClass(), "minBalance", "iVOvTzOxwt");
        setField(term67709, term67709.getClass(), "maxBalance", "BjZQdecXvB");
        setField(term67709, term67709.getClass(), "maxXrpFeePerTransaction", "iUkOOQhEkw");
        setField(term67709, term67709.getClass(), "retryOfId", term67980);
        setField(term67709, term67709.getClass(), "nftIssuerAddress", "wmVoFoUVmU");
        setField(term67709, term67709.getClass(), "nftTaxon", term67994);
        setField(term67709, term67709.getClass(), "contactEmail", "lLiSiPCciB");
        setField(term67709, term67709.getClass(), "autoApprove", term68008);
        setField(term67709, term67709.getClass(), "memo", "PsMKIIEwdR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RbQmXqfXAT";
        callMethod(klass, "currencyName", argTypes, term67709, args);
    }

};


