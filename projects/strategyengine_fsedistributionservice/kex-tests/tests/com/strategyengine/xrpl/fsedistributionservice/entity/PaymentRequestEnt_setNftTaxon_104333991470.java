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

public class PaymentRequestEnt_setNftTaxon_104333991470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226708;
     Object term227027;

    public PaymentRequestEnt_setNftTaxon_104333991470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term226709 = new Long(-814922776357887557L);
        Class<? extends Object> term227050 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term227049 = ((Class) term227050).getDeclaredField((String) "COMPLETE");
        ((Field) term227049).setAccessible(true);
        Object enum402 = ((Field) term227049).get((Object) null);
        Class<? extends Object> term227556 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term227555 = ((Class) term227556).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term227555).setAccessible(true);
        Object enum403 = ((Field) term227555).get((Object) null);
        Boolean term226877 = new Boolean(true);
        Boolean term226879 = new Boolean(false);
        Integer term226881 = new Integer(98922530);
        Class<? extends Object> term227954 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term227953 = ((Class) term227954).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term227953).setAccessible(true);
        Object enum404 = ((Field) term227953).get((Object) null);
        Long term226985 = new Long(800893933628130392L);
        Long term226999 = new Long(-6983938899150831997L);
        Boolean term227013 = new Boolean(true);
        term226708 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt"));
        Object term226735 = newInstance(Class.forName("java.util.Date"));
        Object term226737 = newInstance(Class.forName("java.util.Date"));
        Object term226739 = newInstance(Class.forName("java.util.Date"));
        setField(term226708, term226708.getClass(), "id", term226709);
        setField(term226708, term226708.getClass(), "environment", "GnPrxkKUmR");
        setField(term226708, term226708.getClass(), "populateEnvironment", "gVgLmqgxMh");
        setLongField(term226735, term226735.getClass(), "fastTime", 1476809363689L);
        setField(term226735, term226735.getClass(), "cdate", null);
        setField(term226708, term226708.getClass(), "createDate", term226735);
        setLongField(term226737, term226737.getClass(), "fastTime", 1888553217262L);
        setField(term226737, term226737.getClass(), "cdate", null);
        setField(term226708, term226708.getClass(), "updateDate", term226737);
        setLongField(term226739, term226739.getClass(), "fastTime", 1331363195256L);
        setField(term226739, term226739.getClass(), "cdate", null);
        setField(term226708, term226708.getClass(), "startTime", term226739);
        setField(term226708, term226708.getClass(), "status", enum402);
        setField(term226708, term226708.getClass(), "fromClassicAddress", "QWknVCpJTU");
        setField(term226708, term226708.getClass(), "fromSigningPublicKey", "XhnCbWwpIr");
        setField(term226708, term226708.getClass(), "fromPrivateKey", "BVMUadSiyU");
        setField(term226708, term226708.getClass(), "trustlineIssuerClassicAddress", "OhWrgFwvJi");
        setField(term226708, term226708.getClass(), "currencyName", "DfKWXfTINQ");
        setField(term226708, term226708.getClass(), "snapshotTrustlineIssuerClassicAddress", "KqusFIxuyo");
        setField(term226708, term226708.getClass(), "snapshotCurrencyName", "CDpvEYMuDg");
        setField(term226708, term226708.getClass(), "currencyNameForProcess", "YaZCAiIUPe");
        setField(term226708, term226708.getClass(), "amount", "KsCWHUcJDd");
        setField(term226708, term226708.getClass(), "paymentType", enum403);
        setField(term226708, term226708.getClass(), "newTrustlinesOnly", term226877);
        setField(term226708, term226708.getClass(), "useBlacklist", term226879);
        setField(term226708, term226708.getClass(), "maximumTrustlines", term226881);
        setField(term226708, term226708.getClass(), "dropType", enum404);
        setField(term226708, term226708.getClass(), "lockUuid", "zkYsnzzwJu");
        setField(term226708, term226708.getClass(), "failReason", "hxHKgOYyQD");
        setField(term226708, term226708.getClass(), "feesPaid", "opEyNuSzgs");
        setField(term226708, term226708.getClass(), "minBalance", "YTnlgdIqfA");
        setField(term226708, term226708.getClass(), "maxBalance", "gcKmFclftu");
        setField(term226708, term226708.getClass(), "maxXrpFeePerTransaction", "lfREOBPEuD");
        setField(term226708, term226708.getClass(), "retryOfId", term226985);
        setField(term226708, term226708.getClass(), "nftIssuerAddress", "JAGjDlTwTa");
        setField(term226708, term226708.getClass(), "nftTaxon", term226999);
        setField(term226708, term226708.getClass(), "contactEmail", "wIDeyLnekQ");
        setField(term226708, term226708.getClass(), "autoApprove", term227013);
        setField(term226708, term226708.getClass(), "memo", "tOGPTIqSMm");
        term227027 = new Long(-2720964670491002091L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.PaymentRequestEnt");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term227027;
        callMethod(klass, "setNftTaxon", argTypes, term226708, args);
    }

};


