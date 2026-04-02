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

public class PaymentRequestEnt_PaymentRequestEntBuilder_nftTaxon_71490713730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98869;
     Object term99185;

    public PaymentRequestEnt_PaymentRequestEntBuilder_nftTaxon_71490713730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term98870 = new Long(-2195061939206930224L);
        Class<? extends Object> term99208 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term99207 = ((Class) term99208).getDeclaredField((String) "PENDING_REVIEW");
        ((Field) term99207).setAccessible(true);
        Object enum178 = ((Field) term99207).get((Object) null);
        Class<? extends Object> term99732 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term99731 = ((Class) term99732).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term99731).setAccessible(true);
        Object enum179 = ((Field) term99731).get((Object) null);
        Boolean term99044 = new Boolean(true);
        Boolean term99046 = new Boolean(true);
        Integer term99048 = new Integer(-2027534003);
        Class<? extends Object> term100130 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term100129 = ((Class) term100130).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term100129).setAccessible(true);
        Object enum180 = ((Field) term100129).get((Object) null);
        Long term99143 = new Long(4525924047960478347L);
        Long term99157 = new Long(-3225860270104198596L);
        Boolean term99171 = new Boolean(true);
        term98869 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        Object term98896 = newInstance(Class.forName("java.util.Date"));
        Object term98898 = newInstance(Class.forName("java.util.Date"));
        Object term98900 = newInstance(Class.forName("java.util.Date"));
        setField(term98869, term98869.getClass(), "id", term98870);
        setField(term98869, term98869.getClass(), "environment", "KSZfGbvzPE");
        setField(term98869, term98869.getClass(), "populateEnvironment", "YfgYGgzYER");
        setLongField(term98896, term98896.getClass(), "fastTime", 1602136919002L);
        setField(term98896, term98896.getClass(), "cdate", null);
        setField(term98869, term98869.getClass(), "createDate", term98896);
        setLongField(term98898, term98898.getClass(), "fastTime", 1444174640781L);
        setField(term98898, term98898.getClass(), "cdate", null);
        setField(term98869, term98869.getClass(), "updateDate", term98898);
        setLongField(term98900, term98900.getClass(), "fastTime", 1654999632684L);
        setField(term98900, term98900.getClass(), "cdate", null);
        setField(term98869, term98869.getClass(), "startTime", term98900);
        setField(term98869, term98869.getClass(), "status", enum178);
        setField(term98869, term98869.getClass(), "fromClassicAddress", "IDClvDZuqE");
        setField(term98869, term98869.getClass(), "fromSigningPublicKey", "cMvKxpZOvg");
        setField(term98869, term98869.getClass(), "fromPrivateKey", "WWBYemIuiK");
        setField(term98869, term98869.getClass(), "trustlineIssuerClassicAddress", "nHYQYkycCR");
        setField(term98869, term98869.getClass(), "currencyName", "yBiVacDcZX");
        setField(term98869, term98869.getClass(), "snapshotTrustlineIssuerClassicAddress", "QrKfEgQeoy");
        setField(term98869, term98869.getClass(), "snapshotCurrencyName", "oApgdbwnti");
        setField(term98869, term98869.getClass(), "currencyNameForProcess", "YcgHACNgyo");
        setField(term98869, term98869.getClass(), "amount", "MrUPJzBTEn");
        setField(term98869, term98869.getClass(), "paymentType", enum179);
        setField(term98869, term98869.getClass(), "newTrustlinesOnly", term99044);
        setField(term98869, term98869.getClass(), "useBlacklist", term99046);
        setField(term98869, term98869.getClass(), "maximumTrustlines", term99048);
        setField(term98869, term98869.getClass(), "dropType", enum180);
        setField(term98869, term98869.getClass(), "lockUuid", "IaSymdfFGa");
        setField(term98869, term98869.getClass(), "failReason", "FxSvJCIpul");
        setField(term98869, term98869.getClass(), "feesPaid", "HCjKwpexJj");
        setField(term98869, term98869.getClass(), "minBalance", "sCpIHVPdfl");
        setField(term98869, term98869.getClass(), "maxBalance", "lMUBBGRjfY");
        setField(term98869, term98869.getClass(), "maxXrpFeePerTransaction", "olYpqbolWL");
        setField(term98869, term98869.getClass(), "retryOfId", term99143);
        setField(term98869, term98869.getClass(), "nftIssuerAddress", "MCMCjxXzjw");
        setField(term98869, term98869.getClass(), "nftTaxon", term99157);
        setField(term98869, term98869.getClass(), "contactEmail", "pZbbwCURge");
        setField(term98869, term98869.getClass(), "autoApprove", term99171);
        setField(term98869, term98869.getClass(), "memo", "RsOfgdMCMv");
        term99185 = new Long(-1164342036939643746L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term99185;
        callMethod(klass, "nftTaxon", argTypes, term98869, args);
    }

};


