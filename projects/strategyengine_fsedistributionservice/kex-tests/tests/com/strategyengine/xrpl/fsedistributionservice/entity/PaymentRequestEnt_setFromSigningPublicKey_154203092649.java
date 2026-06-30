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

public class PaymentRequestEnt_setFromSigningPublicKey_154203092649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189945;

    public PaymentRequestEnt_setFromSigningPublicKey_154203092649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term189946 = new Long(-5967061076297699457L);
        Class<? extends Object> term190271 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term190270 = ((Class) term190271).getDeclaredField((String) "COMPLETE");
        ((Field) term190270).setAccessible(true);
        Object enum338 = ((Field) term190270).get((Object) null);
        Class<? extends Object> term190777 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term190776 = ((Class) term190777).getDeclaredField((String) "FLAT");
        ((Field) term190776).setAccessible(true);
        Object enum339 = ((Field) term190776).get((Object) null);
        Boolean term190106 = new Boolean(false);
        Boolean term190108 = new Boolean(false);
        Integer term190110 = new Integer(-341152642);
        Class<? extends Object> term191151 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term191150 = ((Class) term191151).getDeclaredField((String) "GLOBALID");
        ((Field) term191150).setAccessible(true);
        Object enum340 = ((Field) term191150).get((Object) null);
        Long term190196 = new Long(1550364590565203407L);
        Long term190210 = new Long(4530705892517898929L);
        Boolean term190224 = new Boolean(false);
        term189945 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term189972 = newInstance(Class.forName("java.util.Date"));
        Object term189974 = newInstance(Class.forName("java.util.Date"));
        Object term189976 = newInstance(Class.forName("java.util.Date"));
        setField(term189945, term189945.getClass(), "id", term189946);
        setField(term189945, term189945.getClass(), "environment", "dAEiXUxDrI");
        setField(term189945, term189945.getClass(), "populateEnvironment", "AgQWngzXPH");
        setLongField(term189972, term189972.getClass(), "fastTime", 1380474204882L);
        setField(term189972, term189972.getClass(), "cdate", null);
        setField(term189945, term189945.getClass(), "createDate", term189972);
        setLongField(term189974, term189974.getClass(), "fastTime", 1396829453851L);
        setField(term189974, term189974.getClass(), "cdate", null);
        setField(term189945, term189945.getClass(), "updateDate", term189974);
        setLongField(term189976, term189976.getClass(), "fastTime", 1284961766979L);
        setField(term189976, term189976.getClass(), "cdate", null);
        setField(term189945, term189945.getClass(), "startTime", term189976);
        setField(term189945, term189945.getClass(), "status", enum338);
        setField(term189945, term189945.getClass(), "fromClassicAddress", "EZJmAIzdHM");
        setField(term189945, term189945.getClass(), "fromSigningPublicKey", "LAOkeXXkDr");
        setField(term189945, term189945.getClass(), "fromPrivateKey", "YkZqFgrgVM");
        setField(term189945, term189945.getClass(), "trustlineIssuerClassicAddress", "QEJBgSNviH");
        setField(term189945, term189945.getClass(), "currencyName", "bjigisSVNp");
        setField(term189945, term189945.getClass(), "snapshotTrustlineIssuerClassicAddress", "yJCCaWqQuK");
        setField(term189945, term189945.getClass(), "snapshotCurrencyName", "tgBNqkdndl");
        setField(term189945, term189945.getClass(), "currencyNameForProcess", "GXKhRJLVFZ");
        setField(term189945, term189945.getClass(), "amount", "qDflhZTJjR");
        setField(term189945, term189945.getClass(), "paymentType", enum339);
        setField(term189945, term189945.getClass(), "newTrustlinesOnly", term190106);
        setField(term189945, term189945.getClass(), "useBlacklist", term190108);
        setField(term189945, term189945.getClass(), "maximumTrustlines", term190110);
        setField(term189945, term189945.getClass(), "dropType", enum340);
        setField(term189945, term189945.getClass(), "lockUuid", "bzQSjpIauE");
        setField(term189945, term189945.getClass(), "failReason", "ESQqarFUtp");
        setField(term189945, term189945.getClass(), "feesPaid", "TiCRQbKtcf");
        setField(term189945, term189945.getClass(), "minBalance", "shGEZulpDG");
        setField(term189945, term189945.getClass(), "maxBalance", "twDnEqZglX");
        setField(term189945, term189945.getClass(), "maxXrpFeePerTransaction", "TWzZFATLAj");
        setField(term189945, term189945.getClass(), "retryOfId", term190196);
        setField(term189945, term189945.getClass(), "nftIssuerAddress", "QjsqHrtVMY");
        setField(term189945, term189945.getClass(), "nftTaxon", term190210);
        setField(term189945, term189945.getClass(), "contactEmail", "PlQZGGhnZK");
        setField(term189945, term189945.getClass(), "autoApprove", term190224);
        setField(term189945, term189945.getClass(), "memo", "sTtLCWDEPO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UGMtNRjhnC";
        callMethod(klass, "setFromSigningPublicKey", argTypes, term189945, args);
    }

};


