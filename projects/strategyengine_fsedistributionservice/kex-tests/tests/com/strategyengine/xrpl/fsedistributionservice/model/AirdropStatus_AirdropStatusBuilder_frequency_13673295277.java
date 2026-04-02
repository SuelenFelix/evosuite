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

public class AirdropStatus_AirdropStatusBuilder_frequency_13673295277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term468017;
     Object enum873;

    public AirdropStatus_AirdropStatusBuilder_frequency_13673295277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term468021 = new Long(4600612212546071466L);
        Class<? extends Object> term468281 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term468280 = ((Class) term468281).getDeclaredField((String) "VERIFIED");
        ((Field) term468280).setAccessible(true);
        Object enum871 = ((Field) term468280).get((Object) null);
        Object term468020 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term468020, term468020.getClass(), "id", term468021);
        setField(term468020, term468020.getClass(), "responseCode", "");
        setField(term468020, term468020.getClass(), "reason", "");
        setField(term468020, term468020.getClass(), "classicAddress", "");
        setField(term468020, term468020.getClass(), "status", enum871);
        setField(term468020, term468020.getClass(), "paymentAmount", "");
        setField(term468020, term468020.getClass(), "snapshotBalance", "");
        setField(term468020, term468020.getClass(), "nftOwned", "");
        Long term468032 = new Long(736282298030442495L);
        Class<? extends Object> term468707 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term468706 = ((Class) term468707).getDeclaredField((String) "FAILED");
        ((Field) term468706).setAccessible(true);
        Object enum872 = ((Field) term468706).get((Object) null);
        Object term468031 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term468031, term468031.getClass(), "id", term468032);
        setField(term468031, term468031.getClass(), "responseCode", "");
        setField(term468031, term468031.getClass(), "reason", "");
        setField(term468031, term468031.getClass(), "classicAddress", "");
        setField(term468031, term468031.getClass(), "status", enum872);
        setField(term468031, term468031.getClass(), "paymentAmount", "");
        setField(term468031, term468031.getClass(), "snapshotBalance", "");
        setField(term468031, term468031.getClass(), "nftOwned", "");
        Long term468043 = new Long(-8385042448755891761L);
        Object term468042 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term468042, term468042.getClass(), "id", term468043);
        setField(term468042, term468042.getClass(), "responseCode", "");
        setField(term468042, term468042.getClass(), "reason", "");
        setField(term468042, term468042.getClass(), "classicAddress", "");
        setField(term468042, term468042.getClass(), "status", enum871);
        setField(term468042, term468042.getClass(), "paymentAmount", "");
        setField(term468042, term468042.getClass(), "snapshotBalance", "");
        setField(term468042, term468042.getClass(), "nftOwned", "");
        ArrayList term468018 = new ArrayList();
        ((ArrayList) term468018).add(term468020);
        ((ArrayList) term468018).add(term468031);
        ((ArrayList) term468018).add(term468042);
        Long term468053 = new Long(3776640840397782177L);
        Class<? extends Object> term469127 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term469126 = ((Class) term469127).getDeclaredField((String) "DAILY");
        ((Field) term469126).setAccessible(true);
        enum873 = ((Field) term469126).get((Object) null);
        Class<? extends Object> term469514 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term469513 = ((Class) term469514).getDeclaredField((String) "COMPLETE");
        ((Field) term469513).setAccessible(true);
        Object enum874 = ((Field) term469513).get((Object) null);
        Integer term468146 = new Integer(842904495);
        Class<? extends Object> term469980 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term469979 = ((Class) term469980).getDeclaredField((String) "GLOBALID");
        ((Field) term469979).setAccessible(true);
        Object enum875 = ((Field) term469979).get((Object) null);
        Long term468196 = new Long(-4458985981191164653L);
        Long term468210 = new Long(3774876119567638995L);
        Class<? extends Object> term470391 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term470390 = ((Class) term470391).getDeclaredField((String) "FLAT");
        ((Field) term470390).setAccessible(true);
        Object enum876 = ((Field) term470390).get((Object) null);
        Class<? extends Object> term470805 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term470804 = ((Class) term470805).getDeclaredField((String) "ACTIVE");
        ((Field) term470804).setAccessible(true);
        Object enum877 = ((Field) term470804).get((Object) null);
        Long term468278 = new Long(-5849140391879955934L);
        term468017 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder"));
        Object term468055 = newInstance(Class.forName("java.util.Date"));
        Object term468057 = newInstance(Class.forName("java.util.Date"));
        Object term468059 = newInstance(Class.forName("java.util.Date"));
        Object term468061 = newInstance(Class.forName("java.util.Date"));
        setField(term468017, term468017.getClass(), "results", term468018);
        setField(term468017, term468017.getClass(), "id", term468053);
        setLongField(term468055, term468055.getClass(), "fastTime", 1544326432153L);
        setField(term468055, term468055.getClass(), "cdate", null);
        setField(term468017, term468017.getClass(), "createDate", term468055);
        setLongField(term468057, term468057.getClass(), "fastTime", 1787656201822L);
        setField(term468057, term468057.getClass(), "cdate", null);
        setField(term468017, term468017.getClass(), "updateDate", term468057);
        setLongField(term468059, term468059.getClass(), "fastTime", 1666085387834L);
        setField(term468059, term468059.getClass(), "cdate", null);
        setField(term468017, term468017.getClass(), "startTime", term468059);
        setLongField(term468061, term468061.getClass(), "fastTime", 1834580246038L);
        setField(term468061, term468061.getClass(), "cdate", null);
        setField(term468017, term468017.getClass(), "repeatUntilDate", term468061);
        setField(term468017, term468017.getClass(), "frequency", enum873);
        setField(term468017, term468017.getClass(), "status", enum874);
        setField(term468017, term468017.getClass(), "fromClassicAddress", "iSagnJzhui");
        setField(term468017, term468017.getClass(), "trustlineIssuerClassicAddress", "OaAAAMaerG");
        setField(term468017, term468017.getClass(), "currencyName", "LjWsBZjyXH");
        setField(term468017, term468017.getClass(), "currencyNameForProcess", "IzVaWJAeHd");
        setField(term468017, term468017.getClass(), "amount", "tjPkQolRer");
        setBooleanField(term468017, term468017.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term468017, term468017.getClass(), "useBlacklist", false);
        setField(term468017, term468017.getClass(), "maximumTrustlines", term468146);
        setField(term468017, term468017.getClass(), "dropType", enum875);
        setField(term468017, term468017.getClass(), "failReason", "ngoLwQfpWZ");
        setField(term468017, term468017.getClass(), "minBalance", "uTWBfvAsyO");
        setField(term468017, term468017.getClass(), "maxBalance", "PjflZBjLQm");
        setField(term468017, term468017.getClass(), "totalBlacklisted", term468196);
        setField(term468017, term468017.getClass(), "maxXrpFeePerTransaction", "vKTFdmINnO");
        setField(term468017, term468017.getClass(), "totalRecipients", term468210);
        setField(term468017, term468017.getClass(), "paymentType", enum876);
        setField(term468017, term468017.getClass(), "snapshotTrustlineIssuerClassicAddress", "yluqSskhal");
        setField(term468017, term468017.getClass(), "snapshotCurrencyName", "eqfsGIytdB");
        setField(term468017, term468017.getClass(), "nftIssuingAddress", "LKQjNTptZn");
        setField(term468017, term468017.getClass(), "nftTaxon", "tKBauOxKfc");
        setField(term468017, term468017.getClass(), "scheduleStatus", enum877);
        setField(term468017, term468017.getClass(), "fromScheduleId", term468278);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Object[] args = new Object[1];
        args[0] = enum873;
        callMethod(klass, "frequency", argTypes, term468017, args);
    }

};


