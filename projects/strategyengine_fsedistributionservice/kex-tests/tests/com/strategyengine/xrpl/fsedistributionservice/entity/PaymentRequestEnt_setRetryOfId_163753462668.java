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

public class PaymentRequestEnt_setRetryOfId_163753462668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223300;
     Object term223594;

    public PaymentRequestEnt_setRetryOfId_163753462668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term223301 = new Long(5592522907226111065L);
        Class<? extends Object> term223617 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term223616 = ((Class) term223617).getDeclaredField((String) "SCHEDULED");
        ((Field) term223616).setAccessible(true);
        Object enum396 = ((Field) term223616).get((Object) null);
        Class<? extends Object> term224126 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term224125 = ((Class) term224126).getDeclaredField((String) "FLAT");
        ((Field) term224125).setAccessible(true);
        Object enum397 = ((Field) term224125).get((Object) null);
        Boolean term223462 = new Boolean(true);
        Boolean term223464 = new Boolean(true);
        Integer term223466 = new Integer(-430151637);
        Class<? extends Object> term224500 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term224499 = ((Class) term224500).getDeclaredField((String) "GLOBALID");
        ((Field) term224499).setAccessible(true);
        Object enum398 = ((Field) term224499).get((Object) null);
        Long term223552 = new Long(-2577420466618938650L);
        Long term223566 = new Long(5614572229094721840L);
        Boolean term223580 = new Boolean(true);
        term223300 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term223327 = newInstance(Class.forName("java.util.Date"));
        Object term223329 = newInstance(Class.forName("java.util.Date"));
        Object term223331 = newInstance(Class.forName("java.util.Date"));
        setField(term223300, term223300.getClass(), "id", term223301);
        setField(term223300, term223300.getClass(), "environment", "llSJDzNeEq");
        setField(term223300, term223300.getClass(), "populateEnvironment", "YIDNFdhfGO");
        setLongField(term223327, term223327.getClass(), "fastTime", 1692411657105L);
        setField(term223327, term223327.getClass(), "cdate", null);
        setField(term223300, term223300.getClass(), "createDate", term223327);
        setLongField(term223329, term223329.getClass(), "fastTime", 1737359480414L);
        setField(term223329, term223329.getClass(), "cdate", null);
        setField(term223300, term223300.getClass(), "updateDate", term223329);
        setLongField(term223331, term223331.getClass(), "fastTime", 1679478229315L);
        setField(term223331, term223331.getClass(), "cdate", null);
        setField(term223300, term223300.getClass(), "startTime", term223331);
        setField(term223300, term223300.getClass(), "status", enum396);
        setField(term223300, term223300.getClass(), "fromClassicAddress", "adNbqunmox");
        setField(term223300, term223300.getClass(), "fromSigningPublicKey", "ImSBmTIdsP");
        setField(term223300, term223300.getClass(), "fromPrivateKey", "KDKQhbiclt");
        setField(term223300, term223300.getClass(), "trustlineIssuerClassicAddress", "diWnDDpNWl");
        setField(term223300, term223300.getClass(), "currencyName", "jcrJhyEbDI");
        setField(term223300, term223300.getClass(), "snapshotTrustlineIssuerClassicAddress", "DHbGOjJfEz");
        setField(term223300, term223300.getClass(), "snapshotCurrencyName", "OuyHNwADel");
        setField(term223300, term223300.getClass(), "currencyNameForProcess", "shazlRAQrB");
        setField(term223300, term223300.getClass(), "amount", "PNJdNWkxgW");
        setField(term223300, term223300.getClass(), "paymentType", enum397);
        setField(term223300, term223300.getClass(), "newTrustlinesOnly", term223462);
        setField(term223300, term223300.getClass(), "useBlacklist", term223464);
        setField(term223300, term223300.getClass(), "maximumTrustlines", term223466);
        setField(term223300, term223300.getClass(), "dropType", enum398);
        setField(term223300, term223300.getClass(), "lockUuid", "aCTJvzQZSQ");
        setField(term223300, term223300.getClass(), "failReason", "hcvedmWnmW");
        setField(term223300, term223300.getClass(), "feesPaid", "rBZaHWidIS");
        setField(term223300, term223300.getClass(), "minBalance", "xneQCADwGB");
        setField(term223300, term223300.getClass(), "maxBalance", "luSCmxphxi");
        setField(term223300, term223300.getClass(), "maxXrpFeePerTransaction", "OGEDwuJhjV");
        setField(term223300, term223300.getClass(), "retryOfId", term223552);
        setField(term223300, term223300.getClass(), "nftIssuerAddress", "vepOtOxlWM");
        setField(term223300, term223300.getClass(), "nftTaxon", term223566);
        setField(term223300, term223300.getClass(), "contactEmail", "XZmoxlxcKh");
        setField(term223300, term223300.getClass(), "autoApprove", term223580);
        setField(term223300, term223300.getClass(), "memo", "aHNGawFCfD");
        term223594 = new Long(-159468133651974975L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term223594;
        callMethod(klass, "setRetryOfId", argTypes, term223300, args);
    }

};


