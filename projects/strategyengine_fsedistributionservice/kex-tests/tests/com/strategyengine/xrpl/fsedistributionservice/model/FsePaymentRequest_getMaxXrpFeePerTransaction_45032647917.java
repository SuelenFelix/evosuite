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

public class FsePaymentRequest_getMaxXrpFeePerTransaction_45032647917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term359535;

    public FsePaymentRequest_getMaxXrpFeePerTransaction_45032647917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term359584 = new ArrayList();
        ((ArrayList) term359584).add("WmfidvgdtK");
        ((ArrayList) term359584).add("yAHnlRtcKn");
        ((ArrayList) term359584).add("XuTvLpSGoD");
        ((ArrayList) term359584).add("XfbirBMzyy");
        ((ArrayList) term359584).add("LQQzlHcJFt");
        ((ArrayList) term359584).add("FBJxHcmMCN");
        ((ArrayList) term359584).add("LDyHrRkwpP");
        ((ArrayList) term359584).add("kUeOAtybVm");
        ((ArrayList) term359584).add("nLYfHaxYQe");
        Long term359761 = new Long(-3259323558419605103L);
        Class<? extends Object> term360014 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term360013 = ((Class) term360014).getDeclaredField((String) "FLAT");
        ((Field) term360013).setAccessible(true);
        Object enum696 = ((Field) term360013).get((Object) null);
        Long term359807 = new Long(7299361469288644847L);
        Class<? extends Object> term360418 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term360417 = ((Class) term360418).getDeclaredField((String) "DAILY");
        ((Field) term360417).setAccessible(true);
        Object enum697 = ((Field) term360417).get((Object) null);
        term359535 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term359708 = newInstance(Class.forName("java.util.Date"));
        Object term359818 = newInstance(Class.forName("java.util.Date"));
        setField(term359535, term359535.getClass(), "memo", "HQKkaNKyIG");
        setField(term359535, term359535.getClass(), "fromClassicAddress", "OgjHGtEkHS");
        setField(term359535, term359535.getClass(), "fromSigningPublicKey", "kBvfWdWmdw");
        setField(term359535, term359535.getClass(), "fromPrivateKey", "aBlTeZjrLS");
        setField(term359535, term359535.getClass(), "toClassicAddresses", term359584);
        setField(term359535, term359535.getClass(), "amount", "kVDxJDfbmc");
        setLongField(term359708, term359708.getClass(), "fastTime", 1553138390451L);
        setField(term359708, term359708.getClass(), "cdate", null);
        setField(term359535, term359535.getClass(), "startTime", term359708);
        setField(term359535, term359535.getClass(), "destinationTag", "AqjHcNbvNU");
        setField(term359535, term359535.getClass(), "trustlineIssuerClassicAddress", "SqNOfacBZj");
        setField(term359535, term359535.getClass(), "currencyName", "dbxoYBTgGN");
        setBooleanField(term359535, term359535.getClass(), "agreeFee", true);
        setField(term359535, term359535.getClass(), "maxXrpFeePerTransaction", "adxRdfXsVs");
        setBooleanField(term359535, term359535.getClass(), "globalIdVerified", false);
        setBooleanField(term359535, term359535.getClass(), "useBlacklist", true);
        setField(term359535, term359535.getClass(), "retryOfId", term359761);
        setField(term359535, term359535.getClass(), "paymentType", enum696);
        setField(term359535, term359535.getClass(), "snapshotTrustlineIssuerClassicAddress", "oqJIiLGVuh");
        setField(term359535, term359535.getClass(), "snapshotCurrencyName", "DxDRAaptzI");
        setField(term359535, term359535.getClass(), "nftIssuingAddress", "kZUSkAgsvX");
        setField(term359535, term359535.getClass(), "nftTaxon", term359807);
        setField(term359535, term359535.getClass(), "frequency", enum697);
        setLongField(term359818, term359818.getClass(), "fastTime", 1476253051731L);
        setField(term359818, term359818.getClass(), "cdate", null);
        setField(term359535, term359535.getClass(), "repeatUntilDate", term359818);
        setField(term359535, term359535.getClass(), "email", "JpNgFUEtkd");
        setBooleanField(term359535, term359535.getClass(), "autoApprove", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxXrpFeePerTransaction", argTypes, term359535, args);
    }

};


