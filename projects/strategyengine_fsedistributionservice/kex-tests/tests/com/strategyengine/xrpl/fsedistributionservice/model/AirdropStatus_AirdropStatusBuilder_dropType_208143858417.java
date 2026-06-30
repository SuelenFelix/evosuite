package com.strategyengine.xrpl.fsedistributionservice.model;

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
import static com.strategyengine.xrpl.fsedistributionservice.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Long;
import java.lang.String;
import java.lang.Integer;

public class AirdropStatus_AirdropStatusBuilder_dropType_208143858417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term501231;
     Object enum948;

    public AirdropStatus_AirdropStatusBuilder_dropType_208143858417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term501235 = new Long(-4179615237632495585L);
        Class<? extends Object> term501510 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term501509 = ((Class) term501510).getDeclaredField((String) "SENDING");
        ((Field) term501509).setAccessible(true);
        Object enum942 = ((Field) term501509).get((Object) null);
        Object term501234 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term501234, term501234.getClass(), "id", term501235);
        setField(term501234, term501234.getClass(), "responseCode", "");
        setField(term501234, term501234.getClass(), "reason", "");
        setField(term501234, term501234.getClass(), "classicAddress", "");
        setField(term501234, term501234.getClass(), "status", enum942);
        setField(term501234, term501234.getClass(), "paymentAmount", "");
        setField(term501234, term501234.getClass(), "snapshotBalance", "");
        setField(term501234, term501234.getClass(), "nftOwned", "");
        Long term501246 = new Long(-2071004435163577830L);
        Object term501245 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term501245, term501245.getClass(), "id", term501246);
        setField(term501245, term501245.getClass(), "responseCode", "");
        setField(term501245, term501245.getClass(), "reason", "");
        setField(term501245, term501245.getClass(), "classicAddress", "");
        setField(term501245, term501245.getClass(), "status", enum942);
        setField(term501245, term501245.getClass(), "paymentAmount", "");
        setField(term501245, term501245.getClass(), "snapshotBalance", "");
        setField(term501245, term501245.getClass(), "nftOwned", "");
        ArrayList term501232 = new ArrayList();
        ((ArrayList) term501232).add(term501234);
        ((ArrayList) term501232).add(term501245);
        Long term501256 = new Long(4083439166031950748L);
        Class<? extends Object> term501933 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term501932 = ((Class) term501933).getDeclaredField((String) "MONTHLY");
        ((Field) term501932).setAccessible(true);
        Object enum943 = ((Field) term501932).get((Object) null);
        Class<? extends Object> term502326 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term502325 = ((Class) term502326).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term502325).setAccessible(true);
        Object enum944 = ((Field) term502325).get((Object) null);
        Integer term501354 = new Integer(147209682);
        Class<? extends Object> term502801 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term502800 = ((Class) term502801).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term502800).setAccessible(true);
        Object enum945 = ((Field) term502800).get((Object) null);
        Long term501413 = new Long(4354307959269121855L);
        Long term501427 = new Long(-4627619845164555164L);
        Class<? extends Object> term503239 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term503238 = ((Class) term503239).getDeclaredField((String) "FLAT");
        ((Field) term503238).setAccessible(true);
        Object enum946 = ((Field) term503238).get((Object) null);
        Class<? extends Object> term503653 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term503652 = ((Class) term503653).getDeclaredField((String) "ACTIVE");
        ((Field) term503652).setAccessible(true);
        Object enum947 = ((Field) term503652).get((Object) null);
        Long term501495 = new Long(3702843766990151556L);
        term501231 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder"));
        Object term501258 = newInstance(Class.forName("java.util.Date"));
        Object term501260 = newInstance(Class.forName("java.util.Date"));
        Object term501262 = newInstance(Class.forName("java.util.Date"));
        Object term501264 = newInstance(Class.forName("java.util.Date"));
        setField(term501231, term501231.getClass(), "results", term501232);
        setField(term501231, term501231.getClass(), "id", term501256);
        setLongField(term501258, term501258.getClass(), "fastTime", 1339097118596L);
        setField(term501258, term501258.getClass(), "cdate", null);
        setField(term501231, term501231.getClass(), "createDate", term501258);
        setLongField(term501260, term501260.getClass(), "fastTime", 1864408521260L);
        setField(term501260, term501260.getClass(), "cdate", null);
        setField(term501231, term501231.getClass(), "updateDate", term501260);
        setLongField(term501262, term501262.getClass(), "fastTime", 1710933450428L);
        setField(term501262, term501262.getClass(), "cdate", null);
        setField(term501231, term501231.getClass(), "startTime", term501262);
        setLongField(term501264, term501264.getClass(), "fastTime", 1699079723937L);
        setField(term501264, term501264.getClass(), "cdate", null);
        setField(term501231, term501231.getClass(), "repeatUntilDate", term501264);
        setField(term501231, term501231.getClass(), "frequency", enum943);
        setField(term501231, term501231.getClass(), "status", enum944);
        setField(term501231, term501231.getClass(), "fromClassicAddress", "xMLjisTCEc");
        setField(term501231, term501231.getClass(), "trustlineIssuerClassicAddress", "nGnUuIuxio");
        setField(term501231, term501231.getClass(), "currencyName", "jBEIwVuxjq");
        setField(term501231, term501231.getClass(), "currencyNameForProcess", "KQpsxSLFZN");
        setField(term501231, term501231.getClass(), "amount", "BNJVoYwjAZ");
        setBooleanField(term501231, term501231.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term501231, term501231.getClass(), "useBlacklist", false);
        setField(term501231, term501231.getClass(), "maximumTrustlines", term501354);
        setField(term501231, term501231.getClass(), "dropType", enum945);
        setField(term501231, term501231.getClass(), "failReason", "lVfKFsFBWA");
        setField(term501231, term501231.getClass(), "minBalance", "VdFBFoszPe");
        setField(term501231, term501231.getClass(), "maxBalance", "rvwSslhUVa");
        setField(term501231, term501231.getClass(), "totalBlacklisted", term501413);
        setField(term501231, term501231.getClass(), "maxXrpFeePerTransaction", "EZOoIMIpbM");
        setField(term501231, term501231.getClass(), "totalRecipients", term501427);
        setField(term501231, term501231.getClass(), "paymentType", enum946);
        setField(term501231, term501231.getClass(), "snapshotTrustlineIssuerClassicAddress", "GhqMKYSXsr");
        setField(term501231, term501231.getClass(), "snapshotCurrencyName", "ingAwvtJee");
        setField(term501231, term501231.getClass(), "nftIssuingAddress", "vWDwaLjhUo");
        setField(term501231, term501231.getClass(), "nftTaxon", "LtqQluOtgh");
        setField(term501231, term501231.getClass(), "scheduleStatus", enum947);
        setField(term501231, term501231.getClass(), "fromScheduleId", term501495);
        Class<? extends Object> term504068 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term504067 = ((Class) term504068).getDeclaredField((String) "GLOBALID");
        ((Field) term504067).setAccessible(true);
        enum948 = ((Field) term504067).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Object[] args = new Object[1];
        args[0] = enum948;
        callMethod(klass, "dropType", argTypes, term501231, args);
    }

};


