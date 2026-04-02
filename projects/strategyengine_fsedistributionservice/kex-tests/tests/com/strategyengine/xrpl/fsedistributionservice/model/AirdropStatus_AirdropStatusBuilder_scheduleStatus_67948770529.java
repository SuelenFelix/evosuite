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

public class AirdropStatus_AirdropStatusBuilder_scheduleStatus_67948770529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term543896;
     Object enum1040;

    public AirdropStatus_AirdropStatusBuilder_scheduleStatus_67948770529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term543900 = new Long(-2298075900308676256L);
        Class<? extends Object> term544176 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term544175 = ((Class) term544176).getDeclaredField((String) "QUEUED");
        ((Field) term544175).setAccessible(true);
        Object enum1033 = ((Field) term544175).get((Object) null);
        Object term543899 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term543899, term543899.getClass(), "id", term543900);
        setField(term543899, term543899.getClass(), "responseCode", "");
        setField(term543899, term543899.getClass(), "reason", "");
        setField(term543899, term543899.getClass(), "classicAddress", "");
        setField(term543899, term543899.getClass(), "status", enum1033);
        setField(term543899, term543899.getClass(), "paymentAmount", "");
        setField(term543899, term543899.getClass(), "snapshotBalance", "");
        setField(term543899, term543899.getClass(), "nftOwned", "");
        Long term543911 = new Long(-32504336313564415L);
        Class<? extends Object> term544596 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term544595 = ((Class) term544596).getDeclaredField((String) "SENDING");
        ((Field) term544595).setAccessible(true);
        Object enum1034 = ((Field) term544595).get((Object) null);
        Object term543910 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term543910, term543910.getClass(), "id", term543911);
        setField(term543910, term543910.getClass(), "responseCode", "");
        setField(term543910, term543910.getClass(), "reason", "");
        setField(term543910, term543910.getClass(), "classicAddress", "");
        setField(term543910, term543910.getClass(), "status", enum1034);
        setField(term543910, term543910.getClass(), "paymentAmount", "");
        setField(term543910, term543910.getClass(), "snapshotBalance", "");
        setField(term543910, term543910.getClass(), "nftOwned", "");
        Long term543922 = new Long(-3072149709226785130L);
        Object term543921 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term543921, term543921.getClass(), "id", term543922);
        setField(term543921, term543921.getClass(), "responseCode", "");
        setField(term543921, term543921.getClass(), "reason", "");
        setField(term543921, term543921.getClass(), "classicAddress", "");
        setField(term543921, term543921.getClass(), "status", enum1034);
        setField(term543921, term543921.getClass(), "paymentAmount", "");
        setField(term543921, term543921.getClass(), "snapshotBalance", "");
        setField(term543921, term543921.getClass(), "nftOwned", "");
        ArrayList term543897 = new ArrayList();
        ((ArrayList) term543897).add(term543899);
        ((ArrayList) term543897).add(term543910);
        ((ArrayList) term543897).add(term543921);
        Long term543932 = new Long(-539562950566320509L);
        Class<? extends Object> term545019 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term545018 = ((Class) term545019).getDeclaredField((String) "DAILY");
        ((Field) term545018).setAccessible(true);
        Object enum1035 = ((Field) term545018).get((Object) null);
        Class<? extends Object> term545406 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term545405 = ((Class) term545406).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term545405).setAccessible(true);
        Object enum1036 = ((Field) term545405).get((Object) null);
        Integer term544028 = new Integer(306847454);
        Class<? extends Object> term545881 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term545880 = ((Class) term545881).getDeclaredField((String) "TRUSTLINE");
        ((Field) term545880).setAccessible(true);
        Object enum1037 = ((Field) term545880).get((Object) null);
        Long term544079 = new Long(-6590502822258678292L);
        Long term544093 = new Long(707619162419050395L);
        Class<? extends Object> term546295 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term546294 = ((Class) term546295).getDeclaredField((String) "FLAT");
        ((Field) term546294).setAccessible(true);
        Object enum1038 = ((Field) term546294).get((Object) null);
        Class<? extends Object> term546709 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term546708 = ((Class) term546709).getDeclaredField((String) "ACTIVE");
        ((Field) term546708).setAccessible(true);
        Object enum1039 = ((Field) term546708).get((Object) null);
        Long term544161 = new Long(-2742794200189356451L);
        term543896 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder"));
        Object term543934 = newInstance(Class.forName("java.util.Date"));
        Object term543936 = newInstance(Class.forName("java.util.Date"));
        Object term543938 = newInstance(Class.forName("java.util.Date"));
        Object term543940 = newInstance(Class.forName("java.util.Date"));
        setField(term543896, term543896.getClass(), "results", term543897);
        setField(term543896, term543896.getClass(), "id", term543932);
        setLongField(term543934, term543934.getClass(), "fastTime", 1523113897419L);
        setField(term543934, term543934.getClass(), "cdate", null);
        setField(term543896, term543896.getClass(), "createDate", term543934);
        setLongField(term543936, term543936.getClass(), "fastTime", 1867420541013L);
        setField(term543936, term543936.getClass(), "cdate", null);
        setField(term543896, term543896.getClass(), "updateDate", term543936);
        setLongField(term543938, term543938.getClass(), "fastTime", 1500992122590L);
        setField(term543938, term543938.getClass(), "cdate", null);
        setField(term543896, term543896.getClass(), "startTime", term543938);
        setLongField(term543940, term543940.getClass(), "fastTime", 1652071222567L);
        setField(term543940, term543940.getClass(), "cdate", null);
        setField(term543896, term543896.getClass(), "repeatUntilDate", term543940);
        setField(term543896, term543896.getClass(), "frequency", enum1035);
        setField(term543896, term543896.getClass(), "status", enum1036);
        setField(term543896, term543896.getClass(), "fromClassicAddress", "NYfLLlFAwk");
        setField(term543896, term543896.getClass(), "trustlineIssuerClassicAddress", "ryVxyRTkkz");
        setField(term543896, term543896.getClass(), "currencyName", "NOFdXeSrBs");
        setField(term543896, term543896.getClass(), "currencyNameForProcess", "RUlqnYyZPt");
        setField(term543896, term543896.getClass(), "amount", "COBVzmryOp");
        setBooleanField(term543896, term543896.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term543896, term543896.getClass(), "useBlacklist", true);
        setField(term543896, term543896.getClass(), "maximumTrustlines", term544028);
        setField(term543896, term543896.getClass(), "dropType", enum1037);
        setField(term543896, term543896.getClass(), "failReason", "nVkuONqxFg");
        setField(term543896, term543896.getClass(), "minBalance", "JBPNAgHgey");
        setField(term543896, term543896.getClass(), "maxBalance", "wmMerZnJUw");
        setField(term543896, term543896.getClass(), "totalBlacklisted", term544079);
        setField(term543896, term543896.getClass(), "maxXrpFeePerTransaction", "ewUZPdbQIm");
        setField(term543896, term543896.getClass(), "totalRecipients", term544093);
        setField(term543896, term543896.getClass(), "paymentType", enum1038);
        setField(term543896, term543896.getClass(), "snapshotTrustlineIssuerClassicAddress", "nsyKPkuiKM");
        setField(term543896, term543896.getClass(), "snapshotCurrencyName", "QQrzJyhVFh");
        setField(term543896, term543896.getClass(), "nftIssuingAddress", "DifGXOBiwI");
        setField(term543896, term543896.getClass(), "nftTaxon", "HLrCvrzuTI");
        setField(term543896, term543896.getClass(), "scheduleStatus", enum1039);
        setField(term543896, term543896.getClass(), "fromScheduleId", term544161);
        Class<? extends Object> term547124 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term547123 = ((Class) term547124).getDeclaredField((String) "COMPLETE");
        ((Field) term547123).setAccessible(true);
        enum1040 = ((Field) term547123).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Object[] args = new Object[1];
        args[0] = enum1040;
        callMethod(klass, "scheduleStatus", argTypes, term543896, args);
    }

};


