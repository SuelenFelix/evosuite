package com.strategyengine.xrpl.fsedistributionservice.rest.trustlines;

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
import static com.strategyengine.xrpl.fsedistributionservice.rest.trustlines.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class AirdropMetadataController_airdropApprove_20574387933 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135;
     Object term137;

    public AirdropMetadataController_airdropApprove_20574387933() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135 = new Long(6375119433582206027L);
        ArrayList term186 = new ArrayList();
        ((ArrayList) term186).add("NRdvgJlhkX");
        ((ArrayList) term186).add("uuaPigETmJ");
        ((ArrayList) term186).add("MxlszYVzRf");
        ((ArrayList) term186).add("LQFpaHEwXR");
        ((ArrayList) term186).add("oVcInYnLWB");
        Long term315 = new Long(-8257434502486459194L);
        Class<? extends Object> term552 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term551 = ((Class) term552).getDeclaredField((String) "FLAT");
        ((Field) term551).setAccessible(true);
        Object enum0 = ((Field) term551).get((Object) null);
        Long term361 = new Long(-8400487765614892086L);
        Class<? extends Object> term998 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term997 = ((Class) term998).getDeclaredField((String) "DAILY");
        ((Field) term997).setAccessible(true);
        Object enum1 = ((Field) term997).get((Object) null);
        term137 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest"));
        Object term262 = newInstance(Class.forName("java.util.Date"));
        Object term372 = newInstance(Class.forName("java.util.Date"));
        setField(term137, term137.getClass(), "memo", "SzjVpOQTyS");
        setField(term137, term137.getClass(), "fromClassicAddress", "MjGYSRKTNF");
        setField(term137, term137.getClass(), "fromSigningPublicKey", "hRNSzYYIrc");
        setField(term137, term137.getClass(), "fromPrivateKey", "RMFIsYGgne");
        setField(term137, term137.getClass(), "toClassicAddresses", term186);
        setField(term137, term137.getClass(), "amount", "aJlieCFVtF");
        setLongField(term262, term262.getClass(), "fastTime", 1345871412244L);
        setField(term262, term262.getClass(), "cdate", null);
        setField(term137, term137.getClass(), "startTime", term262);
        setField(term137, term137.getClass(), "destinationTag", "ZiaGIbnzTs");
        setField(term137, term137.getClass(), "trustlineIssuerClassicAddress", "tbcdzjIfER");
        setField(term137, term137.getClass(), "currencyName", "HyxfbSQYBe");
        setBooleanField(term137, term137.getClass(), "agreeFee", false);
        setField(term137, term137.getClass(), "maxXrpFeePerTransaction", "pCTimMblYc");
        setBooleanField(term137, term137.getClass(), "globalIdVerified", false);
        setBooleanField(term137, term137.getClass(), "useBlacklist", false);
        setField(term137, term137.getClass(), "retryOfId", term315);
        setField(term137, term137.getClass(), "paymentType", enum0);
        setField(term137, term137.getClass(), "snapshotTrustlineIssuerClassicAddress", "hNxWaHcfhY");
        setField(term137, term137.getClass(), "snapshotCurrencyName", "RkybSrpybU");
        setField(term137, term137.getClass(), "nftIssuingAddress", "xOEqzGAmDU");
        setField(term137, term137.getClass(), "nftTaxon", term361);
        setField(term137, term137.getClass(), "frequency", enum1);
        setLongField(term372, term372.getClass(), "fastTime", 1480438351369L);
        setField(term372, term372.getClass(), "cdate", null);
        setField(term137, term137.getClass(), "repeatUntilDate", term372);
        setField(term137, term137.getClass(), "email", "eZFUvlxvGV");
        setBooleanField(term137, term137.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.rest.trustlines.AirdropMetadataController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest");
        Object[] args = new Object[2];
        args[0] = term135;
        args[1] = term137;
        callMethod(klass, "airdropApprove", argTypes, null, args);
    }

};


