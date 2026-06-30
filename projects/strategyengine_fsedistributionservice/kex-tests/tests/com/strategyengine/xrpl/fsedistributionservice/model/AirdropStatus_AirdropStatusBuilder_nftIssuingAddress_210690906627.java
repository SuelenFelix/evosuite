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

public class AirdropStatus_AirdropStatusBuilder_nftIssuingAddress_210690906627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term536840;

    public AirdropStatus_AirdropStatusBuilder_nftIssuingAddress_210690906627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term536844 = new Long(1770574028303523867L);
        Class<? extends Object> term537149 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term537148 = ((Class) term537149).getDeclaredField((String) "FAILED");
        ((Field) term537148).setAccessible(true);
        Object enum1018 = ((Field) term537148).get((Object) null);
        Object term536843 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term536843, term536843.getClass(), "id", term536844);
        setField(term536843, term536843.getClass(), "responseCode", "");
        setField(term536843, term536843.getClass(), "reason", "");
        setField(term536843, term536843.getClass(), "classicAddress", "");
        setField(term536843, term536843.getClass(), "status", enum1018);
        setField(term536843, term536843.getClass(), "paymentAmount", "");
        setField(term536843, term536843.getClass(), "snapshotBalance", "");
        setField(term536843, term536843.getClass(), "nftOwned", "");
        Long term536855 = new Long(6434856191210114702L);
        Class<? extends Object> term537569 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term537568 = ((Class) term537569).getDeclaredField((String) "QUEUED");
        ((Field) term537568).setAccessible(true);
        Object enum1019 = ((Field) term537568).get((Object) null);
        Object term536854 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term536854, term536854.getClass(), "id", term536855);
        setField(term536854, term536854.getClass(), "responseCode", "");
        setField(term536854, term536854.getClass(), "reason", "");
        setField(term536854, term536854.getClass(), "classicAddress", "");
        setField(term536854, term536854.getClass(), "status", enum1019);
        setField(term536854, term536854.getClass(), "paymentAmount", "");
        setField(term536854, term536854.getClass(), "snapshotBalance", "");
        setField(term536854, term536854.getClass(), "nftOwned", "");
        Long term536866 = new Long(1306769240431962876L);
        Object term536865 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term536865, term536865.getClass(), "id", term536866);
        setField(term536865, term536865.getClass(), "responseCode", "");
        setField(term536865, term536865.getClass(), "reason", "");
        setField(term536865, term536865.getClass(), "classicAddress", "");
        setField(term536865, term536865.getClass(), "status", enum1019);
        setField(term536865, term536865.getClass(), "paymentAmount", "");
        setField(term536865, term536865.getClass(), "snapshotBalance", "");
        setField(term536865, term536865.getClass(), "nftOwned", "");
        Long term536875 = new Long(-431846534131845221L);
        Object term536874 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term536874, term536874.getClass(), "id", term536875);
        setField(term536874, term536874.getClass(), "responseCode", "");
        setField(term536874, term536874.getClass(), "reason", "");
        setField(term536874, term536874.getClass(), "classicAddress", "");
        setField(term536874, term536874.getClass(), "status", enum1018);
        setField(term536874, term536874.getClass(), "paymentAmount", "");
        setField(term536874, term536874.getClass(), "snapshotBalance", "");
        setField(term536874, term536874.getClass(), "nftOwned", "");
        ArrayList term536841 = new ArrayList();
        ((ArrayList) term536841).add(term536843);
        ((ArrayList) term536841).add(term536854);
        ((ArrayList) term536841).add(term536865);
        ((ArrayList) term536841).add(term536874);
        Long term536885 = new Long(-1676755477328808985L);
        Class<? extends Object> term537989 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term537988 = ((Class) term537989).getDeclaredField((String) "WEEKLY");
        ((Field) term537988).setAccessible(true);
        Object enum1020 = ((Field) term537988).get((Object) null);
        Class<? extends Object> term538379 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term538378 = ((Class) term538379).getDeclaredField((String) "POPULATING_ADDRESSES");
        ((Field) term538378).setAccessible(true);
        Object enum1021 = ((Field) term538378).get((Object) null);
        Integer term536991 = new Integer(-1195339592);
        Class<? extends Object> term538881 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term538880 = ((Class) term538881).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term538880).setAccessible(true);
        Object enum1022 = ((Field) term538880).get((Object) null);
        Long term537050 = new Long(6429812737969607903L);
        Long term537064 = new Long(-3581079819917173688L);
        Class<? extends Object> term539319 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term539318 = ((Class) term539319).getDeclaredField((String) "FLAT");
        ((Field) term539318).setAccessible(true);
        Object enum1023 = ((Field) term539318).get((Object) null);
        Class<? extends Object> term539733 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term539732 = ((Class) term539733).getDeclaredField((String) "REJECTED");
        ((Field) term539732).setAccessible(true);
        Object enum1024 = ((Field) term539732).get((Object) null);
        Long term537134 = new Long(1841313452085873331L);
        term536840 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder"));
        Object term536887 = newInstance(Class.forName("java.util.Date"));
        Object term536889 = newInstance(Class.forName("java.util.Date"));
        Object term536891 = newInstance(Class.forName("java.util.Date"));
        Object term536893 = newInstance(Class.forName("java.util.Date"));
        setField(term536840, term536840.getClass(), "results", term536841);
        setField(term536840, term536840.getClass(), "id", term536885);
        setLongField(term536887, term536887.getClass(), "fastTime", 1775732900116L);
        setField(term536887, term536887.getClass(), "cdate", null);
        setField(term536840, term536840.getClass(), "createDate", term536887);
        setLongField(term536889, term536889.getClass(), "fastTime", 1792942490274L);
        setField(term536889, term536889.getClass(), "cdate", null);
        setField(term536840, term536840.getClass(), "updateDate", term536889);
        setLongField(term536891, term536891.getClass(), "fastTime", 1867503944662L);
        setField(term536891, term536891.getClass(), "cdate", null);
        setField(term536840, term536840.getClass(), "startTime", term536891);
        setLongField(term536893, term536893.getClass(), "fastTime", 1829975697523L);
        setField(term536893, term536893.getClass(), "cdate", null);
        setField(term536840, term536840.getClass(), "repeatUntilDate", term536893);
        setField(term536840, term536840.getClass(), "frequency", enum1020);
        setField(term536840, term536840.getClass(), "status", enum1021);
        setField(term536840, term536840.getClass(), "fromClassicAddress", "hsfcBUrpFu");
        setField(term536840, term536840.getClass(), "trustlineIssuerClassicAddress", "BbyASkFeLz");
        setField(term536840, term536840.getClass(), "currencyName", "LAPYhXgHLQ");
        setField(term536840, term536840.getClass(), "currencyNameForProcess", "pXJBBQWVOa");
        setField(term536840, term536840.getClass(), "amount", "pshaxEXOYb");
        setBooleanField(term536840, term536840.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term536840, term536840.getClass(), "useBlacklist", true);
        setField(term536840, term536840.getClass(), "maximumTrustlines", term536991);
        setField(term536840, term536840.getClass(), "dropType", enum1022);
        setField(term536840, term536840.getClass(), "failReason", "aoQRTwrWzK");
        setField(term536840, term536840.getClass(), "minBalance", "FFsMIgKWgX");
        setField(term536840, term536840.getClass(), "maxBalance", "DFdhwyqLGG");
        setField(term536840, term536840.getClass(), "totalBlacklisted", term537050);
        setField(term536840, term536840.getClass(), "maxXrpFeePerTransaction", "oQyjYOBmuq");
        setField(term536840, term536840.getClass(), "totalRecipients", term537064);
        setField(term536840, term536840.getClass(), "paymentType", enum1023);
        setField(term536840, term536840.getClass(), "snapshotTrustlineIssuerClassicAddress", "kBXuLNlNBw");
        setField(term536840, term536840.getClass(), "snapshotCurrencyName", "LIRwUxQwJQ");
        setField(term536840, term536840.getClass(), "nftIssuingAddress", "zkYdmJnPHQ");
        setField(term536840, term536840.getClass(), "nftTaxon", "eKrvhRMeKX");
        setField(term536840, term536840.getClass(), "scheduleStatus", enum1024);
        setField(term536840, term536840.getClass(), "fromScheduleId", term537134);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MXnvohzLvr";
        callMethod(klass, "nftIssuingAddress", argTypes, term536840, args);
    }

};


