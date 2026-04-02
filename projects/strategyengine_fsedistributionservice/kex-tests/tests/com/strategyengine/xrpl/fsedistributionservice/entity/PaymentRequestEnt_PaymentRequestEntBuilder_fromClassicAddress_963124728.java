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

public class PaymentRequestEnt_PaymentRequestEntBuilder_fromClassicAddress_963124728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60725;

    public PaymentRequestEnt_PaymentRequestEntBuilder_fromClassicAddress_963124728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term60726 = new Long(-2951854704066477061L);
        Class<? extends Object> term61083 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term61082 = ((Class) term61083).getDeclaredField((String) "PENDING_REVIEW");
        ((Field) term61082).setAccessible(true);
        Object enum112 = ((Field) term61082).get((Object) null);
        Class<? extends Object> term61607 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term61606 = ((Class) term61607).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term61606).setAccessible(true);
        Object enum113 = ((Field) term61606).get((Object) null);
        Boolean term60900 = new Boolean(true);
        Boolean term60902 = new Boolean(true);
        Integer term60904 = new Integer(2055867847);
        Class<? extends Object> term62005 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term62004 = ((Class) term62005).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term62004).setAccessible(true);
        Object enum114 = ((Field) term62004).get((Object) null);
        Long term61008 = new Long(174253963298276221L);
        Long term61022 = new Long(3713624957161771816L);
        Boolean term61036 = new Boolean(true);
        term60725 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        Object term60752 = newInstance(Class.forName("java.util.Date"));
        Object term60754 = newInstance(Class.forName("java.util.Date"));
        Object term60756 = newInstance(Class.forName("java.util.Date"));
        setField(term60725, term60725.getClass(), "id", term60726);
        setField(term60725, term60725.getClass(), "environment", "sEphiduvkv");
        setField(term60725, term60725.getClass(), "populateEnvironment", "PbLgCSAHce");
        setLongField(term60752, term60752.getClass(), "fastTime", 1458419201638L);
        setField(term60752, term60752.getClass(), "cdate", null);
        setField(term60725, term60725.getClass(), "createDate", term60752);
        setLongField(term60754, term60754.getClass(), "fastTime", 1378006520445L);
        setField(term60754, term60754.getClass(), "cdate", null);
        setField(term60725, term60725.getClass(), "updateDate", term60754);
        setLongField(term60756, term60756.getClass(), "fastTime", 1384837537981L);
        setField(term60756, term60756.getClass(), "cdate", null);
        setField(term60725, term60725.getClass(), "startTime", term60756);
        setField(term60725, term60725.getClass(), "status", enum112);
        setField(term60725, term60725.getClass(), "fromClassicAddress", "NWldOLAbqk");
        setField(term60725, term60725.getClass(), "fromSigningPublicKey", "qnYaYSpDwO");
        setField(term60725, term60725.getClass(), "fromPrivateKey", "dgbFDCdHtj");
        setField(term60725, term60725.getClass(), "trustlineIssuerClassicAddress", "EKpdCBubDE");
        setField(term60725, term60725.getClass(), "currencyName", "zMsSLTfGhl");
        setField(term60725, term60725.getClass(), "snapshotTrustlineIssuerClassicAddress", "bEmHScVZaQ");
        setField(term60725, term60725.getClass(), "snapshotCurrencyName", "TcuXODkzBV");
        setField(term60725, term60725.getClass(), "currencyNameForProcess", "coJPjrBZNe");
        setField(term60725, term60725.getClass(), "amount", "vMsWjuPTnO");
        setField(term60725, term60725.getClass(), "paymentType", enum113);
        setField(term60725, term60725.getClass(), "newTrustlinesOnly", term60900);
        setField(term60725, term60725.getClass(), "useBlacklist", term60902);
        setField(term60725, term60725.getClass(), "maximumTrustlines", term60904);
        setField(term60725, term60725.getClass(), "dropType", enum114);
        setField(term60725, term60725.getClass(), "lockUuid", "zHvfKaOstO");
        setField(term60725, term60725.getClass(), "failReason", "tOszriqETr");
        setField(term60725, term60725.getClass(), "feesPaid", "ncSPTkhKjO");
        setField(term60725, term60725.getClass(), "minBalance", "jcWKHRWhyj");
        setField(term60725, term60725.getClass(), "maxBalance", "nrQjODRMLD");
        setField(term60725, term60725.getClass(), "maxXrpFeePerTransaction", "PNoWXrsFic");
        setField(term60725, term60725.getClass(), "retryOfId", term61008);
        setField(term60725, term60725.getClass(), "nftIssuerAddress", "QZBHZqZope");
        setField(term60725, term60725.getClass(), "nftTaxon", term61022);
        setField(term60725, term60725.getClass(), "contactEmail", "VBUahCvyxC");
        setField(term60725, term60725.getClass(), "autoApprove", term61036);
        setField(term60725, term60725.getClass(), "memo", "MlzTkzKMCX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UqKUbMyPMJ";
        callMethod(klass, "fromClassicAddress", argTypes, term60725, args);
    }

};


