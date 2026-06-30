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

public class PaymentRequestEnt_getFromPrivateKey_64105628715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133446;

    public PaymentRequestEnt_getFromPrivateKey_64105628715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term133447 = new Long(-2828343143039517941L);
        Class<? extends Object> term133763 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term133762 = ((Class) term133763).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term133762).setAccessible(true);
        Object enum238 = ((Field) term133762).get((Object) null);
        Class<? extends Object> term134278 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term134277 = ((Class) term134278).getDeclaredField((String) "FLAT");
        ((Field) term134277).setAccessible(true);
        Object enum239 = ((Field) term134277).get((Object) null);
        Boolean term133610 = new Boolean(true);
        Boolean term133612 = new Boolean(false);
        Integer term133614 = new Integer(-1034506028);
        Class<? extends Object> term134652 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term134651 = ((Class) term134652).getDeclaredField((String) "GLOBALID");
        ((Field) term134651).setAccessible(true);
        Object enum240 = ((Field) term134651).get((Object) null);
        Long term133700 = new Long(2809748481176687920L);
        Long term133714 = new Long(4012955251407483889L);
        Boolean term133728 = new Boolean(true);
        term133446 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term133473 = newInstance(Class.forName("java.util.Date"));
        Object term133475 = newInstance(Class.forName("java.util.Date"));
        Object term133477 = newInstance(Class.forName("java.util.Date"));
        setField(term133446, term133446.getClass(), "id", term133447);
        setField(term133446, term133446.getClass(), "environment", "cAObIvLmLo");
        setField(term133446, term133446.getClass(), "populateEnvironment", "xwiCqRSWSe");
        setLongField(term133473, term133473.getClass(), "fastTime", 1888800832212L);
        setField(term133473, term133473.getClass(), "cdate", null);
        setField(term133446, term133446.getClass(), "createDate", term133473);
        setLongField(term133475, term133475.getClass(), "fastTime", 1632313305411L);
        setField(term133475, term133475.getClass(), "cdate", null);
        setField(term133446, term133446.getClass(), "updateDate", term133475);
        setLongField(term133477, term133477.getClass(), "fastTime", 1390499981839L);
        setField(term133477, term133477.getClass(), "cdate", null);
        setField(term133446, term133446.getClass(), "startTime", term133477);
        setField(term133446, term133446.getClass(), "status", enum238);
        setField(term133446, term133446.getClass(), "fromClassicAddress", "IbUFkzIgzq");
        setField(term133446, term133446.getClass(), "fromSigningPublicKey", "dTOUSTDdbw");
        setField(term133446, term133446.getClass(), "fromPrivateKey", "PECfBejlfo");
        setField(term133446, term133446.getClass(), "trustlineIssuerClassicAddress", "SDbDgydVpg");
        setField(term133446, term133446.getClass(), "currencyName", "EEMaiNkiOH");
        setField(term133446, term133446.getClass(), "snapshotTrustlineIssuerClassicAddress", "sFdmTylvqh");
        setField(term133446, term133446.getClass(), "snapshotCurrencyName", "rgniLaOaiz");
        setField(term133446, term133446.getClass(), "currencyNameForProcess", "fzQzzdIOMC");
        setField(term133446, term133446.getClass(), "amount", "hLVDOhfCKX");
        setField(term133446, term133446.getClass(), "paymentType", enum239);
        setField(term133446, term133446.getClass(), "newTrustlinesOnly", term133610);
        setField(term133446, term133446.getClass(), "useBlacklist", term133612);
        setField(term133446, term133446.getClass(), "maximumTrustlines", term133614);
        setField(term133446, term133446.getClass(), "dropType", enum240);
        setField(term133446, term133446.getClass(), "lockUuid", "yXLTfzOgfX");
        setField(term133446, term133446.getClass(), "failReason", "MANlfBKTPY");
        setField(term133446, term133446.getClass(), "feesPaid", "mRoEmuCJhW");
        setField(term133446, term133446.getClass(), "minBalance", "JJUWbMXpyM");
        setField(term133446, term133446.getClass(), "maxBalance", "KDrRQWVXok");
        setField(term133446, term133446.getClass(), "maxXrpFeePerTransaction", "oOOwvWgxtf");
        setField(term133446, term133446.getClass(), "retryOfId", term133700);
        setField(term133446, term133446.getClass(), "nftIssuerAddress", "ywoADeiUfF");
        setField(term133446, term133446.getClass(), "nftTaxon", term133714);
        setField(term133446, term133446.getClass(), "contactEmail", "loHiudJxbt");
        setField(term133446, term133446.getClass(), "autoApprove", term133728);
        setField(term133446, term133446.getClass(), "memo", "lRbxbybNew");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFromPrivateKey", argTypes, term133446, args);
    }

};


