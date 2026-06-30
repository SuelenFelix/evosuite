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

public class AirdropStatus_getFromClassicAddress_87647743013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129394;

    public AirdropStatus_getFromClassicAddress_87647743013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term129398 = new Long(3086974592680165932L);
        Class<? extends Object> term129692 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term129691 = ((Class) term129692).getDeclaredField((String) "QUEUED");
        ((Field) term129691).setAccessible(true);
        Object enum241 = ((Field) term129691).get((Object) null);
        Object term129397 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term129397, term129397.getClass(), "id", term129398);
        setField(term129397, term129397.getClass(), "responseCode", "");
        setField(term129397, term129397.getClass(), "reason", "");
        setField(term129397, term129397.getClass(), "classicAddress", "");
        setField(term129397, term129397.getClass(), "status", enum241);
        setField(term129397, term129397.getClass(), "paymentAmount", "");
        setField(term129397, term129397.getClass(), "snapshotBalance", "");
        setField(term129397, term129397.getClass(), "nftOwned", "");
        Long term129409 = new Long(-532956263280568707L);
        Class<? extends Object> term130112 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term130111 = ((Class) term130112).getDeclaredField((String) "VERIFIED");
        ((Field) term130111).setAccessible(true);
        Object enum242 = ((Field) term130111).get((Object) null);
        Object term129408 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term129408, term129408.getClass(), "id", term129409);
        setField(term129408, term129408.getClass(), "responseCode", "");
        setField(term129408, term129408.getClass(), "reason", "");
        setField(term129408, term129408.getClass(), "classicAddress", "");
        setField(term129408, term129408.getClass(), "status", enum242);
        setField(term129408, term129408.getClass(), "paymentAmount", "");
        setField(term129408, term129408.getClass(), "snapshotBalance", "");
        setField(term129408, term129408.getClass(), "nftOwned", "");
        Long term129420 = new Long(6073193746616629086L);
        Object term129419 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term129419, term129419.getClass(), "id", term129420);
        setField(term129419, term129419.getClass(), "responseCode", "");
        setField(term129419, term129419.getClass(), "reason", "");
        setField(term129419, term129419.getClass(), "classicAddress", "");
        setField(term129419, term129419.getClass(), "status", enum242);
        setField(term129419, term129419.getClass(), "paymentAmount", "");
        setField(term129419, term129419.getClass(), "snapshotBalance", "");
        setField(term129419, term129419.getClass(), "nftOwned", "");
        Long term129429 = new Long(-2463629530824341661L);
        Object term129428 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term129428, term129428.getClass(), "id", term129429);
        setField(term129428, term129428.getClass(), "responseCode", "");
        setField(term129428, term129428.getClass(), "reason", "");
        setField(term129428, term129428.getClass(), "classicAddress", "");
        setField(term129428, term129428.getClass(), "status", enum241);
        setField(term129428, term129428.getClass(), "paymentAmount", "");
        setField(term129428, term129428.getClass(), "snapshotBalance", "");
        setField(term129428, term129428.getClass(), "nftOwned", "");
        Long term129438 = new Long(7800835025296877231L);
        Object term129437 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term129437, term129437.getClass(), "id", term129438);
        setField(term129437, term129437.getClass(), "responseCode", "");
        setField(term129437, term129437.getClass(), "reason", "");
        setField(term129437, term129437.getClass(), "classicAddress", "");
        setField(term129437, term129437.getClass(), "status", enum242);
        setField(term129437, term129437.getClass(), "paymentAmount", "");
        setField(term129437, term129437.getClass(), "snapshotBalance", "");
        setField(term129437, term129437.getClass(), "nftOwned", "");
        Long term129447 = new Long(-187772971269812453L);
        Class<? extends Object> term130538 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term130537 = ((Class) term130538).getDeclaredField((String) "SENDING");
        ((Field) term130537).setAccessible(true);
        Object enum243 = ((Field) term130537).get((Object) null);
        Object term129446 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term129446, term129446.getClass(), "id", term129447);
        setField(term129446, term129446.getClass(), "responseCode", "");
        setField(term129446, term129446.getClass(), "reason", "");
        setField(term129446, term129446.getClass(), "classicAddress", "");
        setField(term129446, term129446.getClass(), "status", enum243);
        setField(term129446, term129446.getClass(), "paymentAmount", "");
        setField(term129446, term129446.getClass(), "snapshotBalance", "");
        setField(term129446, term129446.getClass(), "nftOwned", "");
        ArrayList term129395 = new ArrayList();
        ((ArrayList) term129395).add(term129397);
        ((ArrayList) term129395).add(term129408);
        ((ArrayList) term129395).add(term129419);
        ((ArrayList) term129395).add(term129428);
        ((ArrayList) term129395).add(term129437);
        ((ArrayList) term129395).add(term129446);
        Long term129459 = new Long(468487103823886117L);
        Class<? extends Object> term130961 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term130960 = ((Class) term130961).getDeclaredField((String) "DAILY");
        ((Field) term130960).setAccessible(true);
        Object enum244 = ((Field) term130960).get((Object) null);
        Class<? extends Object> term131348 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term131347 = ((Class) term131348).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term131347).setAccessible(true);
        Object enum245 = ((Field) term131347).get((Object) null);
        Integer term129555 = new Integer(683666002);
        Class<? extends Object> term131823 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term131822 = ((Class) term131823).getDeclaredField((String) "GLOBALID");
        ((Field) term131822).setAccessible(true);
        Object enum246 = ((Field) term131822).get((Object) null);
        Long term129605 = new Long(4139034517298316285L);
        Long term129619 = new Long(5797412846146719084L);
        Class<? extends Object> term132234 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term132233 = ((Class) term132234).getDeclaredField((String) "FLAT");
        ((Field) term132233).setAccessible(true);
        Object enum247 = ((Field) term132233).get((Object) null);
        Class<? extends Object> term132648 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term132647 = ((Class) term132648).getDeclaredField((String) "COMPLETE");
        ((Field) term132647).setAccessible(true);
        Object enum248 = ((Field) term132647).get((Object) null);
        Long term129689 = new Long(5319740127125920367L);
        term129394 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term129461 = newInstance(Class.forName("java.util.Date"));
        Object term129463 = newInstance(Class.forName("java.util.Date"));
        Object term129465 = newInstance(Class.forName("java.util.Date"));
        Object term129467 = newInstance(Class.forName("java.util.Date"));
        setField(term129394, term129394.getClass(), "results", term129395);
        setField(term129394, term129394.getClass(), "id", term129459);
        setLongField(term129461, term129461.getClass(), "fastTime", 1710602340656L);
        setField(term129461, term129461.getClass(), "cdate", null);
        setField(term129394, term129394.getClass(), "createDate", term129461);
        setLongField(term129463, term129463.getClass(), "fastTime", 1766247544969L);
        setField(term129463, term129463.getClass(), "cdate", null);
        setField(term129394, term129394.getClass(), "updateDate", term129463);
        setLongField(term129465, term129465.getClass(), "fastTime", 1690384147635L);
        setField(term129465, term129465.getClass(), "cdate", null);
        setField(term129394, term129394.getClass(), "startTime", term129465);
        setLongField(term129467, term129467.getClass(), "fastTime", 1670332763507L);
        setField(term129467, term129467.getClass(), "cdate", null);
        setField(term129394, term129394.getClass(), "repeatUntilDate", term129467);
        setField(term129394, term129394.getClass(), "frequency", enum244);
        setField(term129394, term129394.getClass(), "status", enum245);
        setField(term129394, term129394.getClass(), "fromClassicAddress", "dHrIcaTbcS");
        setField(term129394, term129394.getClass(), "trustlineIssuerClassicAddress", "tAqyToqusS");
        setField(term129394, term129394.getClass(), "currencyName", "MwiFLgdSDA");
        setField(term129394, term129394.getClass(), "currencyNameForProcess", "VhnistEcCA");
        setField(term129394, term129394.getClass(), "amount", "hlPKLObFBU");
        setBooleanField(term129394, term129394.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term129394, term129394.getClass(), "useBlacklist", false);
        setField(term129394, term129394.getClass(), "maximumTrustlines", term129555);
        setField(term129394, term129394.getClass(), "dropType", enum246);
        setField(term129394, term129394.getClass(), "failReason", "oNGVAyjCob");
        setField(term129394, term129394.getClass(), "minBalance", "lzqPLDonds");
        setField(term129394, term129394.getClass(), "maxBalance", "gCFzBxPZKw");
        setField(term129394, term129394.getClass(), "totalBlacklisted", term129605);
        setField(term129394, term129394.getClass(), "maxXrpFeePerTransaction", "YNVbzJpOdk");
        setField(term129394, term129394.getClass(), "totalRecipients", term129619);
        setField(term129394, term129394.getClass(), "paymentType", enum247);
        setField(term129394, term129394.getClass(), "snapshotTrustlineIssuerClassicAddress", "CjPfMVeNPm");
        setField(term129394, term129394.getClass(), "snapshotCurrencyName", "TeqSJDWXQD");
        setField(term129394, term129394.getClass(), "nftIssuingAddress", "XNgNLbjmim");
        setField(term129394, term129394.getClass(), "nftTaxon", "InNyZMCrst");
        setField(term129394, term129394.getClass(), "scheduleStatus", enum248);
        setField(term129394, term129394.getClass(), "fromScheduleId", term129689);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFromClassicAddress", argTypes, term129394, args);
    }

};


