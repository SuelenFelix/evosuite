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

public class PaymentRequestEnt_setSnapshotTrustlineIssuerClassicAddress_212936955053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196921;

    public PaymentRequestEnt_setSnapshotTrustlineIssuerClassicAddress_212936955053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term196922 = new Long(-9133417318192430290L);
        Class<? extends Object> term197245 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term197244 = ((Class) term197245).getDeclaredField((String) "QUEUED");
        ((Field) term197244).setAccessible(true);
        Object enum350 = ((Field) term197244).get((Object) null);
        Class<? extends Object> term197745 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term197744 = ((Class) term197745).getDeclaredField((String) "FLAT");
        ((Field) term197744).setAccessible(true);
        Object enum351 = ((Field) term197744).get((Object) null);
        Boolean term197080 = new Boolean(false);
        Boolean term197082 = new Boolean(false);
        Integer term197084 = new Integer(-343325701);
        Class<? extends Object> term198119 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term198118 = ((Class) term198119).getDeclaredField((String) "GLOBALID");
        ((Field) term198118).setAccessible(true);
        Object enum352 = ((Field) term198118).get((Object) null);
        Long term197170 = new Long(3447455321955655601L);
        Long term197184 = new Long(-6503611645609982617L);
        Boolean term197198 = new Boolean(false);
        term196921 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term196948 = newInstance(Class.forName("java.util.Date"));
        Object term196950 = newInstance(Class.forName("java.util.Date"));
        Object term196952 = newInstance(Class.forName("java.util.Date"));
        setField(term196921, term196921.getClass(), "id", term196922);
        setField(term196921, term196921.getClass(), "environment", "DInvDrzBtt");
        setField(term196921, term196921.getClass(), "populateEnvironment", "igZJubDPuK");
        setLongField(term196948, term196948.getClass(), "fastTime", 1303146117775L);
        setField(term196948, term196948.getClass(), "cdate", null);
        setField(term196921, term196921.getClass(), "createDate", term196948);
        setLongField(term196950, term196950.getClass(), "fastTime", 1846750848622L);
        setField(term196950, term196950.getClass(), "cdate", null);
        setField(term196921, term196921.getClass(), "updateDate", term196950);
        setLongField(term196952, term196952.getClass(), "fastTime", 1684482458774L);
        setField(term196952, term196952.getClass(), "cdate", null);
        setField(term196921, term196921.getClass(), "startTime", term196952);
        setField(term196921, term196921.getClass(), "status", enum350);
        setField(term196921, term196921.getClass(), "fromClassicAddress", "qxBdFhLbAN");
        setField(term196921, term196921.getClass(), "fromSigningPublicKey", "KyUmXHRrED");
        setField(term196921, term196921.getClass(), "fromPrivateKey", "eOMBFVrNcf");
        setField(term196921, term196921.getClass(), "trustlineIssuerClassicAddress", "gOwOIsocMB");
        setField(term196921, term196921.getClass(), "currencyName", "GqTBOhQBgV");
        setField(term196921, term196921.getClass(), "snapshotTrustlineIssuerClassicAddress", "DQhxOWqEyi");
        setField(term196921, term196921.getClass(), "snapshotCurrencyName", "dSszYGDwAk");
        setField(term196921, term196921.getClass(), "currencyNameForProcess", "gNeMyGSVIG");
        setField(term196921, term196921.getClass(), "amount", "qxEkaqdKPG");
        setField(term196921, term196921.getClass(), "paymentType", enum351);
        setField(term196921, term196921.getClass(), "newTrustlinesOnly", term197080);
        setField(term196921, term196921.getClass(), "useBlacklist", term197082);
        setField(term196921, term196921.getClass(), "maximumTrustlines", term197084);
        setField(term196921, term196921.getClass(), "dropType", enum352);
        setField(term196921, term196921.getClass(), "lockUuid", "VclIptmKrF");
        setField(term196921, term196921.getClass(), "failReason", "wcTeSHCZwz");
        setField(term196921, term196921.getClass(), "feesPaid", "fxxnbYOiZZ");
        setField(term196921, term196921.getClass(), "minBalance", "CTnRYaYXia");
        setField(term196921, term196921.getClass(), "maxBalance", "SUIYUFtCCe");
        setField(term196921, term196921.getClass(), "maxXrpFeePerTransaction", "eKCrPCkedw");
        setField(term196921, term196921.getClass(), "retryOfId", term197170);
        setField(term196921, term196921.getClass(), "nftIssuerAddress", "VAFSknHLsZ");
        setField(term196921, term196921.getClass(), "nftTaxon", term197184);
        setField(term196921, term196921.getClass(), "contactEmail", "MamzBtwhiz");
        setField(term196921, term196921.getClass(), "autoApprove", term197198);
        setField(term196921, term196921.getClass(), "memo", "wVOypfVLsP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pEazBcUUWX";
        callMethod(klass, "setSnapshotTrustlineIssuerClassicAddress", argTypes, term196921, args);
    }

};


