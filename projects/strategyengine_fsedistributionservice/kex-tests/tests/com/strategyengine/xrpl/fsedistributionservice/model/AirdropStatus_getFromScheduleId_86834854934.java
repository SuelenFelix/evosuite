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
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class AirdropStatus_getFromScheduleId_86834854934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202710;

    public AirdropStatus_getFromScheduleId_86834854934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term202711 = new ArrayList();
        Long term202715 = new Long(6269054578518955349L);
        Class<? extends Object> term202971 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term202970 = ((Class) term202971).getDeclaredField((String) "ANNUALLY");
        ((Field) term202970).setAccessible(true);
        Object enum398 = ((Field) term202970).get((Object) null);
        Class<? extends Object> term203367 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term203366 = ((Class) term203367).getDeclaredField((String) "PENDING_REVIEW");
        ((Field) term203366).setAccessible(true);
        Object enum399 = ((Field) term203366).get((Object) null);
        Integer term202817 = new Integer(1474524152);
        Class<? extends Object> term203851 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term203850 = ((Class) term203851).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term203850).setAccessible(true);
        Object enum400 = ((Field) term203850).get((Object) null);
        Long term202876 = new Long(-143609946830350439L);
        Long term202890 = new Long(2018084438165711668L);
        Class<? extends Object> term204289 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term204288 = ((Class) term204289).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term204288).setAccessible(true);
        Object enum401 = ((Field) term204288).get((Object) null);
        Class<? extends Object> term204727 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term204726 = ((Class) term204727).getDeclaredField((String) "COMPLETE");
        ((Field) term204726).setAccessible(true);
        Object enum402 = ((Field) term204726).get((Object) null);
        Long term202968 = new Long(-8705953038984862378L);
        term202710 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term202717 = newInstance(Class.forName("java.util.Date"));
        Object term202719 = newInstance(Class.forName("java.util.Date"));
        Object term202721 = newInstance(Class.forName("java.util.Date"));
        Object term202723 = newInstance(Class.forName("java.util.Date"));
        setField(term202710, term202710.getClass(), "results", term202711);
        setField(term202710, term202710.getClass(), "id", term202715);
        setLongField(term202717, term202717.getClass(), "fastTime", 1340590973430L);
        setField(term202717, term202717.getClass(), "cdate", null);
        setField(term202710, term202710.getClass(), "createDate", term202717);
        setLongField(term202719, term202719.getClass(), "fastTime", 1644273652840L);
        setField(term202719, term202719.getClass(), "cdate", null);
        setField(term202710, term202710.getClass(), "updateDate", term202719);
        setLongField(term202721, term202721.getClass(), "fastTime", 1479643470937L);
        setField(term202721, term202721.getClass(), "cdate", null);
        setField(term202710, term202710.getClass(), "startTime", term202721);
        setLongField(term202723, term202723.getClass(), "fastTime", 1476967300668L);
        setField(term202723, term202723.getClass(), "cdate", null);
        setField(term202710, term202710.getClass(), "repeatUntilDate", term202723);
        setField(term202710, term202710.getClass(), "frequency", enum398);
        setField(term202710, term202710.getClass(), "status", enum399);
        setField(term202710, term202710.getClass(), "fromClassicAddress", "SRphuuiFTJ");
        setField(term202710, term202710.getClass(), "trustlineIssuerClassicAddress", "SLJslBhpEj");
        setField(term202710, term202710.getClass(), "currencyName", "BkSzKYsyMt");
        setField(term202710, term202710.getClass(), "currencyNameForProcess", "BehEjNaXVK");
        setField(term202710, term202710.getClass(), "amount", "TrunCyrewP");
        setBooleanField(term202710, term202710.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term202710, term202710.getClass(), "useBlacklist", false);
        setField(term202710, term202710.getClass(), "maximumTrustlines", term202817);
        setField(term202710, term202710.getClass(), "dropType", enum400);
        setField(term202710, term202710.getClass(), "failReason", "NGQmiHNyCj");
        setField(term202710, term202710.getClass(), "minBalance", "fJerFGYlGC");
        setField(term202710, term202710.getClass(), "maxBalance", "CvltyVwJfx");
        setField(term202710, term202710.getClass(), "totalBlacklisted", term202876);
        setField(term202710, term202710.getClass(), "maxXrpFeePerTransaction", "aKQcZIBmMO");
        setField(term202710, term202710.getClass(), "totalRecipients", term202890);
        setField(term202710, term202710.getClass(), "paymentType", enum401);
        setField(term202710, term202710.getClass(), "snapshotTrustlineIssuerClassicAddress", "izEIjACTdh");
        setField(term202710, term202710.getClass(), "snapshotCurrencyName", "FBpdKznMSt");
        setField(term202710, term202710.getClass(), "nftIssuingAddress", "LCjhPHXcwj");
        setField(term202710, term202710.getClass(), "nftTaxon", "inoNzxBFDa");
        setField(term202710, term202710.getClass(), "scheduleStatus", enum402);
        setField(term202710, term202710.getClass(), "fromScheduleId", term202968);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFromScheduleId", argTypes, term202710, args);
    }

};


