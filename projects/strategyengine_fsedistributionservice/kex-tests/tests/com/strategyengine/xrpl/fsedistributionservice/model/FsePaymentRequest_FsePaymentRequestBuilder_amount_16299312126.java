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

public class FsePaymentRequest_FsePaymentRequestBuilder_amount_16299312126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term573706;

    public FsePaymentRequest_FsePaymentRequestBuilder_amount_16299312126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term573755 = new ArrayList();
        ((ArrayList) term573755).add("pJBxuaCMAx");
        ((ArrayList) term573755).add("oucuJZavwE");
        ((ArrayList) term573755).add("wZoQWYVMQg");
        ((ArrayList) term573755).add("WFCgxTJVwD");
        ((ArrayList) term573755).add("KUUxlthDsn");
        ((ArrayList) term573755).add("almiLtzMxP");
        ((ArrayList) term573755).add("qJJVKWtQic");
        ((ArrayList) term573755).add("kugTVFFpsO");
        ((ArrayList) term573755).add("DWtHUNpDzA");
        Long term573932 = new Long(-8838530728518114289L);
        Class<? extends Object> term574208 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term574207 = ((Class) term574208).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term574207).setAccessible(true);
        Object enum1082 = ((Field) term574207).get((Object) null);
        Long term573986 = new Long(8907204162812035128L);
        Class<? extends Object> term574636 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term574635 = ((Class) term574636).getDeclaredField((String) "ANNUALLY");
        ((Field) term574635).setAccessible(true);
        Object enum1083 = ((Field) term574635).get((Object) null);
        term573706 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder"));
        Object term573879 = newInstance(Class.forName("java.util.Date"));
        Object term574000 = newInstance(Class.forName("java.util.Date"));
        setField(term573706, term573706.getClass(), "memo", "RMIhjBTBMG");
        setField(term573706, term573706.getClass(), "fromClassicAddress", "YHgYdYacoD");
        setField(term573706, term573706.getClass(), "fromSigningPublicKey", "eNokNpUJyH");
        setField(term573706, term573706.getClass(), "fromPrivateKey", "VVCfLfrbwI");
        setField(term573706, term573706.getClass(), "toClassicAddresses", term573755);
        setField(term573706, term573706.getClass(), "amount", "rcBporRNoY");
        setLongField(term573879, term573879.getClass(), "fastTime", 1542192762844L);
        setField(term573879, term573879.getClass(), "cdate", null);
        setField(term573706, term573706.getClass(), "startTime", term573879);
        setField(term573706, term573706.getClass(), "destinationTag", "dsKVyjqQzX");
        setField(term573706, term573706.getClass(), "trustlineIssuerClassicAddress", "NSLutnlusQ");
        setField(term573706, term573706.getClass(), "currencyName", "ACojQtFFkc");
        setBooleanField(term573706, term573706.getClass(), "agreeFee", true);
        setField(term573706, term573706.getClass(), "maxXrpFeePerTransaction", "fsNoWwYRcl");
        setBooleanField(term573706, term573706.getClass(), "globalIdVerified", true);
        setBooleanField(term573706, term573706.getClass(), "useBlacklist", true);
        setField(term573706, term573706.getClass(), "retryOfId", term573932);
        setField(term573706, term573706.getClass(), "paymentType", enum1082);
        setField(term573706, term573706.getClass(), "snapshotTrustlineIssuerClassicAddress", "kmSalAbExi");
        setField(term573706, term573706.getClass(), "snapshotCurrencyName", "WaoIDVIlvl");
        setField(term573706, term573706.getClass(), "nftIssuingAddress", "ZjRzXtkOnD");
        setField(term573706, term573706.getClass(), "nftTaxon", term573986);
        setField(term573706, term573706.getClass(), "frequency", enum1083);
        setLongField(term574000, term574000.getClass(), "fastTime", 1287371376525L);
        setField(term574000, term574000.getClass(), "cdate", null);
        setField(term573706, term573706.getClass(), "repeatUntilDate", term574000);
        setField(term573706, term573706.getClass(), "email", "aBYmFDsROK");
        setBooleanField(term573706, term573706.getClass(), "autoApprove", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentRequest$FsePaymentRequestBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GtdCGkdhcP";
        callMethod(klass, "amount", argTypes, term573706, args);
    }

};


