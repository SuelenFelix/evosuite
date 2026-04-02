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

public class PaymentRequestEnt_PaymentRequestEntBuilder_maxXrpFeePerTransaction_152365361727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93669;

    public PaymentRequestEnt_PaymentRequestEntBuilder_maxXrpFeePerTransaction_152365361727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term93670 = new Long(-5871746020807491998L);
        Class<? extends Object> term93999 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term93998 = ((Class) term93999).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term93998).setAccessible(true);
        Object enum169 = ((Field) term93998).get((Object) null);
        Class<? extends Object> term94514 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term94513 = ((Class) term94514).getDeclaredField((String) "FLAT");
        ((Field) term94513).setAccessible(true);
        Object enum170 = ((Field) term94513).get((Object) null);
        Boolean term93833 = new Boolean(false);
        Boolean term93835 = new Boolean(false);
        Integer term93837 = new Integer(1265463001);
        Class<? extends Object> term94888 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term94887 = ((Class) term94888).getDeclaredField((String) "TRUSTLINE");
        ((Field) term94887).setAccessible(true);
        Object enum171 = ((Field) term94887).get((Object) null);
        Long term93924 = new Long(4742108233936970770L);
        Long term93938 = new Long(2722004046017350471L);
        Boolean term93952 = new Boolean(true);
        term93669 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        Object term93696 = newInstance(Class.forName("java.util.Date"));
        Object term93698 = newInstance(Class.forName("java.util.Date"));
        Object term93700 = newInstance(Class.forName("java.util.Date"));
        setField(term93669, term93669.getClass(), "id", term93670);
        setField(term93669, term93669.getClass(), "environment", "WQnMpDlSfA");
        setField(term93669, term93669.getClass(), "populateEnvironment", "aOIvTQtXiv");
        setLongField(term93696, term93696.getClass(), "fastTime", 1818617156349L);
        setField(term93696, term93696.getClass(), "cdate", null);
        setField(term93669, term93669.getClass(), "createDate", term93696);
        setLongField(term93698, term93698.getClass(), "fastTime", 1560286398870L);
        setField(term93698, term93698.getClass(), "cdate", null);
        setField(term93669, term93669.getClass(), "updateDate", term93698);
        setLongField(term93700, term93700.getClass(), "fastTime", 1791294437021L);
        setField(term93700, term93700.getClass(), "cdate", null);
        setField(term93669, term93669.getClass(), "startTime", term93700);
        setField(term93669, term93669.getClass(), "status", enum169);
        setField(term93669, term93669.getClass(), "fromClassicAddress", "IyjDiknqhA");
        setField(term93669, term93669.getClass(), "fromSigningPublicKey", "IHsXSAFYKi");
        setField(term93669, term93669.getClass(), "fromPrivateKey", "KyGbLglqbW");
        setField(term93669, term93669.getClass(), "trustlineIssuerClassicAddress", "ZKVeStsSNT");
        setField(term93669, term93669.getClass(), "currencyName", "cqCXYaAnFB");
        setField(term93669, term93669.getClass(), "snapshotTrustlineIssuerClassicAddress", "UPLNFZHXjw");
        setField(term93669, term93669.getClass(), "snapshotCurrencyName", "CwrrJlrGmg");
        setField(term93669, term93669.getClass(), "currencyNameForProcess", "HejzvyejjG");
        setField(term93669, term93669.getClass(), "amount", "pbqJjeooBM");
        setField(term93669, term93669.getClass(), "paymentType", enum170);
        setField(term93669, term93669.getClass(), "newTrustlinesOnly", term93833);
        setField(term93669, term93669.getClass(), "useBlacklist", term93835);
        setField(term93669, term93669.getClass(), "maximumTrustlines", term93837);
        setField(term93669, term93669.getClass(), "dropType", enum171);
        setField(term93669, term93669.getClass(), "lockUuid", "ccnotFfPXt");
        setField(term93669, term93669.getClass(), "failReason", "plWlgdgIhn");
        setField(term93669, term93669.getClass(), "feesPaid", "RZaKVKWtND");
        setField(term93669, term93669.getClass(), "minBalance", "vXiaNiquft");
        setField(term93669, term93669.getClass(), "maxBalance", "lucCeiVnYe");
        setField(term93669, term93669.getClass(), "maxXrpFeePerTransaction", "iYwkCLMsbJ");
        setField(term93669, term93669.getClass(), "retryOfId", term93924);
        setField(term93669, term93669.getClass(), "nftIssuerAddress", "MXLsVQWrwc");
        setField(term93669, term93669.getClass(), "nftTaxon", term93938);
        setField(term93669, term93669.getClass(), "contactEmail", "lRaSlqzqNY");
        setField(term93669, term93669.getClass(), "autoApprove", term93952);
        setField(term93669, term93669.getClass(), "memo", "TiEyxWXsra");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TuLgwTZsPP";
        callMethod(klass, "maxXrpFeePerTransaction", argTypes, term93669, args);
    }

};


