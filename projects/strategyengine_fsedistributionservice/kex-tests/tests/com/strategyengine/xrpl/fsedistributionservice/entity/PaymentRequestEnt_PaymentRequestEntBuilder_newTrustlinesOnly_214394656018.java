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

public class PaymentRequestEnt_PaymentRequestEntBuilder_newTrustlinesOnly_214394656018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78107;
     Object term78419;

    public PaymentRequestEnt_PaymentRequestEntBuilder_newTrustlinesOnly_214394656018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term78108 = new Long(-3130003589475815807L);
        Class<? extends Object> term78442 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term78441 = ((Class) term78442).getDeclaredField((String) "SCHEDULED");
        ((Field) term78441).setAccessible(true);
        Object enum142 = ((Field) term78441).get((Object) null);
        Class<? extends Object> term78951 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term78950 = ((Class) term78951).getDeclaredField((String) "FLAT");
        ((Field) term78950).setAccessible(true);
        Object enum143 = ((Field) term78950).get((Object) null);
        Boolean term78269 = new Boolean(false);
        Boolean term78271 = new Boolean(true);
        Integer term78273 = new Integer(-2095575670);
        Class<? extends Object> term79325 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term79324 = ((Class) term79325).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term79324).setAccessible(true);
        Object enum144 = ((Field) term79324).get((Object) null);
        Long term78377 = new Long(-5344598381371854750L);
        Long term78391 = new Long(-3718250311794019732L);
        Boolean term78405 = new Boolean(false);
        term78107 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder"));
        Object term78134 = newInstance(Class.forName("java.util.Date"));
        Object term78136 = newInstance(Class.forName("java.util.Date"));
        Object term78138 = newInstance(Class.forName("java.util.Date"));
        setField(term78107, term78107.getClass(), "id", term78108);
        setField(term78107, term78107.getClass(), "environment", "zSfoqzJbPT");
        setField(term78107, term78107.getClass(), "populateEnvironment", "QUymMnsCIj");
        setLongField(term78134, term78134.getClass(), "fastTime", 1667564808637L);
        setField(term78134, term78134.getClass(), "cdate", null);
        setField(term78107, term78107.getClass(), "createDate", term78134);
        setLongField(term78136, term78136.getClass(), "fastTime", 1263034920868L);
        setField(term78136, term78136.getClass(), "cdate", null);
        setField(term78107, term78107.getClass(), "updateDate", term78136);
        setLongField(term78138, term78138.getClass(), "fastTime", 1590252100843L);
        setField(term78138, term78138.getClass(), "cdate", null);
        setField(term78107, term78107.getClass(), "startTime", term78138);
        setField(term78107, term78107.getClass(), "status", enum142);
        setField(term78107, term78107.getClass(), "fromClassicAddress", "ikTtOgdVYS");
        setField(term78107, term78107.getClass(), "fromSigningPublicKey", "JptuwlirlS");
        setField(term78107, term78107.getClass(), "fromPrivateKey", "TKOMaGswbU");
        setField(term78107, term78107.getClass(), "trustlineIssuerClassicAddress", "YcTbglHiUq");
        setField(term78107, term78107.getClass(), "currencyName", "TiUqHrjoEU");
        setField(term78107, term78107.getClass(), "snapshotTrustlineIssuerClassicAddress", "eoEvZbdLjL");
        setField(term78107, term78107.getClass(), "snapshotCurrencyName", "BkIxsyPkGy");
        setField(term78107, term78107.getClass(), "currencyNameForProcess", "mrMGwoRgVY");
        setField(term78107, term78107.getClass(), "amount", "mxVLTgCwki");
        setField(term78107, term78107.getClass(), "paymentType", enum143);
        setField(term78107, term78107.getClass(), "newTrustlinesOnly", term78269);
        setField(term78107, term78107.getClass(), "useBlacklist", term78271);
        setField(term78107, term78107.getClass(), "maximumTrustlines", term78273);
        setField(term78107, term78107.getClass(), "dropType", enum144);
        setField(term78107, term78107.getClass(), "lockUuid", "wCurppnDSA");
        setField(term78107, term78107.getClass(), "failReason", "JydxSNTMYt");
        setField(term78107, term78107.getClass(), "feesPaid", "KpurAcrHYT");
        setField(term78107, term78107.getClass(), "minBalance", "QjvDwgKJGz");
        setField(term78107, term78107.getClass(), "maxBalance", "ngYxiXTZrk");
        setField(term78107, term78107.getClass(), "maxXrpFeePerTransaction", "YTxBqWRAlo");
        setField(term78107, term78107.getClass(), "retryOfId", term78377);
        setField(term78107, term78107.getClass(), "nftIssuerAddress", "ReruUQRXwl");
        setField(term78107, term78107.getClass(), "nftTaxon", term78391);
        setField(term78107, term78107.getClass(), "contactEmail", "DWEsVQwuaE");
        setField(term78107, term78107.getClass(), "autoApprove", term78405);
        setField(term78107, term78107.getClass(), "memo", "qGkNzZAeDN");
        term78419 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt$PaymentRequestEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[1];
        args[0] = term78419;
        callMethod(klass, "newTrustlinesOnly", argTypes, term78107, args);
    }

};


