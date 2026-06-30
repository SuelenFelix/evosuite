package com.strategyengine.xrpl.fsedistributionservice.model;

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
import static com.strategyengine.xrpl.fsedistributionservice.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Long;
import java.lang.String;

public class FsePaymentRequest_getNftTaxon_207718543925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369275;

    public FsePaymentRequest_getNftTaxon_207718543925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term369324 = new ArrayList();
        ((ArrayList) term369324).add("HWLSSvSHoZ");
        ((ArrayList) term369324).add("ewVmyurtun");
        ((ArrayList) term369324).add("RJISIoHieW");
        ((ArrayList) term369324).add("GuAJIPitoi");
        ((ArrayList) term369324).add("jdbenJidCP");
        ((ArrayList) term369324).add("bndQoQMcMY");
        ((ArrayList) term369324).add("nSplWTTcpK");
        Long term369477 = new Long(2674610463314008194L);
        Class<? extends Object> term369711 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term369710 = ((Class) term369711).getDeclaredField((String) "FLAT");
        ((Field) term369710).setAccessible(true);
        Object enum712 = ((Field) term369710).get((Object) null);
        Long term369523 = new Long(4782766292773586077L);
        Class<? extends Object> term370115 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term370114 = ((Class) term370115).getDeclaredField((String) "WEEKLY");
        ((Field) term370114).setAccessible(true);
        Object enum713 = ((Field) term370114).get((Object) null);
        term369275 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term369424 = newInstance(Class.forName("java.util.Date"));
        Object term369535 = newInstance(Class.forName("java.util.Date"));
        setField(term369275, term369275.getClass(), "memo", "eQOioilfFk");
        setField(term369275, term369275.getClass(), "fromClassicAddress", "dftnVDBTUa");
        setField(term369275, term369275.getClass(), "fromSigningPublicKey", "THBraLlQtu");
        setField(term369275, term369275.getClass(), "fromPrivateKey", "fJcSsPSIBR");
        setField(term369275, term369275.getClass(), "toClassicAddresses", term369324);
        setField(term369275, term369275.getClass(), "amount", "DkUVQMwabd");
        setLongField(term369424, term369424.getClass(), "fastTime", 1849549908456L);
        setField(term369424, term369424.getClass(), "cdate", null);
        setField(term369275, term369275.getClass(), "startTime", term369424);
        setField(term369275, term369275.getClass(), "destinationTag", "TppVynnXqE");
        setField(term369275, term369275.getClass(), "trustlineIssuerClassicAddress", "hXhrtjjyMT");
        setField(term369275, term369275.getClass(), "currencyName", "dFjGRrTSwA");
        setBooleanField(term369275, term369275.getClass(), "agreeFee", false);
        setField(term369275, term369275.getClass(), "maxXrpFeePerTransaction", "JeyCaLwPkU");
        setBooleanField(term369275, term369275.getClass(), "globalIdVerified", false);
        setBooleanField(term369275, term369275.getClass(), "useBlacklist", true);
        setField(term369275, term369275.getClass(), "retryOfId", term369477);
        setField(term369275, term369275.getClass(), "paymentType", enum712);
        setField(term369275, term369275.getClass(), "snapshotTrustlineIssuerClassicAddress", "zJsYcxwHIa");
        setField(term369275, term369275.getClass(), "snapshotCurrencyName", "XyEGzjfDis");
        setField(term369275, term369275.getClass(), "nftIssuingAddress", "UomrevUDWL");
        setField(term369275, term369275.getClass(), "nftTaxon", term369523);
        setField(term369275, term369275.getClass(), "frequency", enum713);
        setLongField(term369535, term369535.getClass(), "fastTime", 1845098913855L);
        setField(term369535, term369535.getClass(), "cdate", null);
        setField(term369275, term369275.getClass(), "repeatUntilDate", term369535);
        setField(term369275, term369275.getClass(), "email", "YjsbwAVpyC");
        setBooleanField(term369275, term369275.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNftTaxon", argTypes, term369275, args);
    }

};


