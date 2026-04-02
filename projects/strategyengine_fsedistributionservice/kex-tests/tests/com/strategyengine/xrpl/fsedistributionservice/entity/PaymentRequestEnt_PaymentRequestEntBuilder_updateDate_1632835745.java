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

public class PaymentRequestEnt_PaymentRequestEntBuilder_updateDate_1632835745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55399;
     Object term55724;

    public PaymentRequestEnt_PaymentRequestEntBuilder_updateDate_1632835745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term55400 = new Long(-113028659747841511L);
        Class<? extends Object> term55747 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term55746 = ((Class) term55747).getDeclaredField((String) "PENDING_REVIEW");
        ((Field) term55746).setAccessible(true);
        Object enum103 = ((Field) term55746).get((Object) null);
        Class<? extends Object> term56271 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term56270 = ((Class) term56271).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term56270).setAccessible(true);
        Object enum104 = ((Field) term56270).get((Object) null);
        Boolean term55574 = new Boolean(false);
        Boolean term55576 = new Boolean(true);
        Integer term55578 = new Integer(1632125673);
        Class<? extends Object> term56669 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term56668 = ((Class) term56669).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term56668).setAccessible(true);
        Object enum105 = ((Field) term56668).get((Object) null);
        Long term55682 = new Long(7271112616766426991L);
        Long term55696 = new Long(-8514728180792822493L);
        Boolean term55710 = new Boolean(false);
        term55399 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        Object term55426 = newInstance(Class.forName("java.util.Date"));
        Object term55428 = newInstance(Class.forName("java.util.Date"));
        Object term55430 = newInstance(Class.forName("java.util.Date"));
        setField(term55399, term55399.getClass(), "id", term55400);
        setField(term55399, term55399.getClass(), "environment", "fVdTcjgHdw");
        setField(term55399, term55399.getClass(), "populateEnvironment", "wwAwLLcLPp");
        setLongField(term55426, term55426.getClass(), "fastTime", 1859223562093L);
        setField(term55426, term55426.getClass(), "cdate", null);
        setField(term55399, term55399.getClass(), "createDate", term55426);
        setLongField(term55428, term55428.getClass(), "fastTime", 1466697924839L);
        setField(term55428, term55428.getClass(), "cdate", null);
        setField(term55399, term55399.getClass(), "updateDate", term55428);
        setLongField(term55430, term55430.getClass(), "fastTime", 1441807744643L);
        setField(term55430, term55430.getClass(), "cdate", null);
        setField(term55399, term55399.getClass(), "startTime", term55430);
        setField(term55399, term55399.getClass(), "status", enum103);
        setField(term55399, term55399.getClass(), "fromClassicAddress", "nHpMKOmlpQ");
        setField(term55399, term55399.getClass(), "fromSigningPublicKey", "fKhrQsJToZ");
        setField(term55399, term55399.getClass(), "fromPrivateKey", "wsysQLGFnl");
        setField(term55399, term55399.getClass(), "trustlineIssuerClassicAddress", "ckQLZGFjMX");
        setField(term55399, term55399.getClass(), "currencyName", "qphdrqUtNx");
        setField(term55399, term55399.getClass(), "snapshotTrustlineIssuerClassicAddress", "bwlLFAfNWx");
        setField(term55399, term55399.getClass(), "snapshotCurrencyName", "JWodNQzjjV");
        setField(term55399, term55399.getClass(), "currencyNameForProcess", "CAgxWjhxNf");
        setField(term55399, term55399.getClass(), "amount", "goAoCMhKBu");
        setField(term55399, term55399.getClass(), "paymentType", enum104);
        setField(term55399, term55399.getClass(), "newTrustlinesOnly", term55574);
        setField(term55399, term55399.getClass(), "useBlacklist", term55576);
        setField(term55399, term55399.getClass(), "maximumTrustlines", term55578);
        setField(term55399, term55399.getClass(), "dropType", enum105);
        setField(term55399, term55399.getClass(), "lockUuid", "BWxJSgKHRT");
        setField(term55399, term55399.getClass(), "failReason", "AGXoIndFnm");
        setField(term55399, term55399.getClass(), "feesPaid", "mwmFMNEzkK");
        setField(term55399, term55399.getClass(), "minBalance", "kVAmKknVln");
        setField(term55399, term55399.getClass(), "maxBalance", "MRFLbEGYKG");
        setField(term55399, term55399.getClass(), "maxXrpFeePerTransaction", "BYrGukTyof");
        setField(term55399, term55399.getClass(), "retryOfId", term55682);
        setField(term55399, term55399.getClass(), "nftIssuerAddress", "jiCGTTzKGB");
        setField(term55399, term55399.getClass(), "nftTaxon", term55696);
        setField(term55399, term55399.getClass(), "contactEmail", "MqICFYzDJj");
        setField(term55399, term55399.getClass(), "autoApprove", term55710);
        setField(term55399, term55399.getClass(), "memo", "YgQvdcBQKw");
        term55724 = newInstance(Class.forName("java.util.Date"));
        setLongField(term55724, term55724.getClass(), "fastTime", 1412676996116L);
        setField(term55724, term55724.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term55724;
        callMethod(klass, "updateDate", argTypes, term55399, args);
    }

};


