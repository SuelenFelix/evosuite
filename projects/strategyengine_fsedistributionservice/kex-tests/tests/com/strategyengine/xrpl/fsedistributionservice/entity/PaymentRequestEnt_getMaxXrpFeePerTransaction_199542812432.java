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

public class PaymentRequestEnt_getMaxXrpFeePerTransaction_199542812432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162336;

    public PaymentRequestEnt_getMaxXrpFeePerTransaction_199542812432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term162337 = new Long(-7506365302323354325L);
        Class<? extends Object> term162667 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term162666 = ((Class) term162667).getDeclaredField((String) "REJECTED");
        ((Field) term162666).setAccessible(true);
        Object enum289 = ((Field) term162666).get((Object) null);
        Class<? extends Object> term163173 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term163172 = ((Class) term163173).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term163172).setAccessible(true);
        Object enum290 = ((Field) term163172).get((Object) null);
        Boolean term162505 = new Boolean(false);
        Boolean term162507 = new Boolean(true);
        Integer term162509 = new Integer(1141317871);
        Class<? extends Object> term163571 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term163570 = ((Class) term163571).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term163570).setAccessible(true);
        Object enum291 = ((Field) term163570).get((Object) null);
        Long term162604 = new Long(-4693900822622913579L);
        Long term162618 = new Long(-997945615782059734L);
        Boolean term162632 = new Boolean(true);
        term162336 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term162363 = newInstance(Class.forName("java.util.Date"));
        Object term162365 = newInstance(Class.forName("java.util.Date"));
        Object term162367 = newInstance(Class.forName("java.util.Date"));
        setField(term162336, term162336.getClass(), "id", term162337);
        setField(term162336, term162336.getClass(), "environment", "uCdLbhvYeG");
        setField(term162336, term162336.getClass(), "populateEnvironment", "ipoyEHBfoG");
        setLongField(term162363, term162363.getClass(), "fastTime", 1801360627918L);
        setField(term162363, term162363.getClass(), "cdate", null);
        setField(term162336, term162336.getClass(), "createDate", term162363);
        setLongField(term162365, term162365.getClass(), "fastTime", 1763238284550L);
        setField(term162365, term162365.getClass(), "cdate", null);
        setField(term162336, term162336.getClass(), "updateDate", term162365);
        setLongField(term162367, term162367.getClass(), "fastTime", 1704114395126L);
        setField(term162367, term162367.getClass(), "cdate", null);
        setField(term162336, term162336.getClass(), "startTime", term162367);
        setField(term162336, term162336.getClass(), "status", enum289);
        setField(term162336, term162336.getClass(), "fromClassicAddress", "iSBTpbiteU");
        setField(term162336, term162336.getClass(), "fromSigningPublicKey", "MTwFbEoMZj");
        setField(term162336, term162336.getClass(), "fromPrivateKey", "uEQbnHbyAn");
        setField(term162336, term162336.getClass(), "trustlineIssuerClassicAddress", "JpFIuyNEKW");
        setField(term162336, term162336.getClass(), "currencyName", "NksHsgcqDx");
        setField(term162336, term162336.getClass(), "snapshotTrustlineIssuerClassicAddress", "RjSNvOEvcT");
        setField(term162336, term162336.getClass(), "snapshotCurrencyName", "HLzuMxigqS");
        setField(term162336, term162336.getClass(), "currencyNameForProcess", "wiBOoDCyzd");
        setField(term162336, term162336.getClass(), "amount", "TIaFKUJELS");
        setField(term162336, term162336.getClass(), "paymentType", enum290);
        setField(term162336, term162336.getClass(), "newTrustlinesOnly", term162505);
        setField(term162336, term162336.getClass(), "useBlacklist", term162507);
        setField(term162336, term162336.getClass(), "maximumTrustlines", term162509);
        setField(term162336, term162336.getClass(), "dropType", enum291);
        setField(term162336, term162336.getClass(), "lockUuid", "IPmndzGjtG");
        setField(term162336, term162336.getClass(), "failReason", "pkQiBgYrkQ");
        setField(term162336, term162336.getClass(), "feesPaid", "SJLRFsNagf");
        setField(term162336, term162336.getClass(), "minBalance", "UsCZaSgXzI");
        setField(term162336, term162336.getClass(), "maxBalance", "IXZCeVwvBM");
        setField(term162336, term162336.getClass(), "maxXrpFeePerTransaction", "ElTdyUVQYi");
        setField(term162336, term162336.getClass(), "retryOfId", term162604);
        setField(term162336, term162336.getClass(), "nftIssuerAddress", "KkgJnxXxVl");
        setField(term162336, term162336.getClass(), "nftTaxon", term162618);
        setField(term162336, term162336.getClass(), "contactEmail", "TGnzPlGFMb");
        setField(term162336, term162336.getClass(), "autoApprove", term162632);
        setField(term162336, term162336.getClass(), "memo", "yEvLMSpdHy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxXrpFeePerTransaction", argTypes, term162336, args);
    }

};


