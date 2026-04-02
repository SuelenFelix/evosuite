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

public class AirdropStatus_getUpdateDate_6964077788 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110854;

    public AirdropStatus_getUpdateDate_6964077788() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term110858 = new Long(-6969704322644192945L);
        Class<? extends Object> term111151 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term111150 = ((Class) term111151).getDeclaredField((String) "QUEUED");
        ((Field) term111150).setAccessible(true);
        Object enum201 = ((Field) term111150).get((Object) null);
        Object term110857 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term110857, term110857.getClass(), "id", term110858);
        setField(term110857, term110857.getClass(), "responseCode", "");
        setField(term110857, term110857.getClass(), "reason", "");
        setField(term110857, term110857.getClass(), "classicAddress", "");
        setField(term110857, term110857.getClass(), "status", enum201);
        setField(term110857, term110857.getClass(), "paymentAmount", "");
        setField(term110857, term110857.getClass(), "snapshotBalance", "");
        setField(term110857, term110857.getClass(), "nftOwned", "");
        Long term110869 = new Long(-6685235643232255177L);
        Class<? extends Object> term111571 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term111570 = ((Class) term111571).getDeclaredField((String) "SENDING");
        ((Field) term111570).setAccessible(true);
        Object enum202 = ((Field) term111570).get((Object) null);
        Object term110868 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term110868, term110868.getClass(), "id", term110869);
        setField(term110868, term110868.getClass(), "responseCode", "");
        setField(term110868, term110868.getClass(), "reason", "");
        setField(term110868, term110868.getClass(), "classicAddress", "");
        setField(term110868, term110868.getClass(), "status", enum202);
        setField(term110868, term110868.getClass(), "paymentAmount", "");
        setField(term110868, term110868.getClass(), "snapshotBalance", "");
        setField(term110868, term110868.getClass(), "nftOwned", "");
        Long term110880 = new Long(-5656664340499957324L);
        Object term110879 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term110879, term110879.getClass(), "id", term110880);
        setField(term110879, term110879.getClass(), "responseCode", "");
        setField(term110879, term110879.getClass(), "reason", "");
        setField(term110879, term110879.getClass(), "classicAddress", "");
        setField(term110879, term110879.getClass(), "status", enum202);
        setField(term110879, term110879.getClass(), "paymentAmount", "");
        setField(term110879, term110879.getClass(), "snapshotBalance", "");
        setField(term110879, term110879.getClass(), "nftOwned", "");
        Long term110889 = new Long(-5460517064177800852L);
        Class<? extends Object> term111994 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term111993 = ((Class) term111994).getDeclaredField((String) "QUEUED");
        ((Field) term111993).setAccessible(true);
        Object enum203 = ((Field) term111993).get((Object) null);
        Object term110888 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term110888, term110888.getClass(), "id", term110889);
        setField(term110888, term110888.getClass(), "responseCode", "");
        setField(term110888, term110888.getClass(), "reason", "");
        setField(term110888, term110888.getClass(), "classicAddress", "");
        setField(term110888, term110888.getClass(), "status", enum203);
        setField(term110888, term110888.getClass(), "paymentAmount", "");
        setField(term110888, term110888.getClass(), "snapshotBalance", "");
        setField(term110888, term110888.getClass(), "nftOwned", "");
        ArrayList term110855 = new ArrayList();
        ((ArrayList) term110855).add(term110857);
        ((ArrayList) term110855).add(term110868);
        ((ArrayList) term110855).add(term110879);
        ((ArrayList) term110855).add(term110888);
        Long term110901 = new Long(-5242567610844514867L);
        Class<? extends Object> term112414 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term112413 = ((Class) term112414).getDeclaredField((String) "WEEKLY");
        ((Field) term112413).setAccessible(true);
        Object enum204 = ((Field) term112413).get((Object) null);
        Class<? extends Object> term112804 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term112803 = ((Class) term112804).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term112803).setAccessible(true);
        Object enum205 = ((Field) term112803).get((Object) null);
        Integer term110998 = new Integer(-1263114719);
        Class<? extends Object> term113279 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term113278 = ((Class) term113279).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term113278).setAccessible(true);
        Object enum206 = ((Field) term113278).get((Object) null);
        Long term111066 = new Long(-2951854704066477061L);
        Long term111080 = new Long(174253963298276221L);
        Class<? extends Object> term113744 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term113743 = ((Class) term113744).getDeclaredField((String) "FLAT");
        ((Field) term113743).setAccessible(true);
        Object enum207 = ((Field) term113743).get((Object) null);
        Class<? extends Object> term114158 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term114157 = ((Class) term114158).getDeclaredField((String) "ACTIVE");
        ((Field) term114157).setAccessible(true);
        Object enum208 = ((Field) term114157).get((Object) null);
        Long term111148 = new Long(3713624957161771816L);
        term110854 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term110903 = newInstance(Class.forName("java.util.Date"));
        Object term110905 = newInstance(Class.forName("java.util.Date"));
        Object term110907 = newInstance(Class.forName("java.util.Date"));
        Object term110909 = newInstance(Class.forName("java.util.Date"));
        setField(term110854, term110854.getClass(), "results", term110855);
        setField(term110854, term110854.getClass(), "id", term110901);
        setLongField(term110903, term110903.getClass(), "fastTime", 1841230035815L);
        setField(term110903, term110903.getClass(), "cdate", null);
        setField(term110854, term110854.getClass(), "createDate", term110903);
        setLongField(term110905, term110905.getClass(), "fastTime", 1502420909766L);
        setField(term110905, term110905.getClass(), "cdate", null);
        setField(term110854, term110854.getClass(), "updateDate", term110905);
        setLongField(term110907, term110907.getClass(), "fastTime", 1685492640220L);
        setField(term110907, term110907.getClass(), "cdate", null);
        setField(term110854, term110854.getClass(), "startTime", term110907);
        setLongField(term110909, term110909.getClass(), "fastTime", 1654457238681L);
        setField(term110909, term110909.getClass(), "cdate", null);
        setField(term110854, term110854.getClass(), "repeatUntilDate", term110909);
        setField(term110854, term110854.getClass(), "frequency", enum204);
        setField(term110854, term110854.getClass(), "status", enum205);
        setField(term110854, term110854.getClass(), "fromClassicAddress", "NnFSMXLOUA");
        setField(term110854, term110854.getClass(), "trustlineIssuerClassicAddress", "bacruLIvDW");
        setField(term110854, term110854.getClass(), "currencyName", "ydbVEuslYx");
        setField(term110854, term110854.getClass(), "currencyNameForProcess", "DKWEhukBpG");
        setField(term110854, term110854.getClass(), "amount", "YaowqyqxBH");
        setBooleanField(term110854, term110854.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term110854, term110854.getClass(), "useBlacklist", false);
        setField(term110854, term110854.getClass(), "maximumTrustlines", term110998);
        setField(term110854, term110854.getClass(), "dropType", enum206);
        setField(term110854, term110854.getClass(), "failReason", "dbxhsKyZWZ");
        setField(term110854, term110854.getClass(), "minBalance", "oXxafKyyrx");
        setField(term110854, term110854.getClass(), "maxBalance", "TapDFGQNLY");
        setField(term110854, term110854.getClass(), "totalBlacklisted", term111066);
        setField(term110854, term110854.getClass(), "maxXrpFeePerTransaction", "vgHeAegSfV");
        setField(term110854, term110854.getClass(), "totalRecipients", term111080);
        setField(term110854, term110854.getClass(), "paymentType", enum207);
        setField(term110854, term110854.getClass(), "snapshotTrustlineIssuerClassicAddress", "qShfKMgKGs");
        setField(term110854, term110854.getClass(), "snapshotCurrencyName", "bLCaDnEUyS");
        setField(term110854, term110854.getClass(), "nftIssuingAddress", "yfHcOCDrGy");
        setField(term110854, term110854.getClass(), "nftTaxon", "juKqILstcn");
        setField(term110854, term110854.getClass(), "scheduleStatus", enum208);
        setField(term110854, term110854.getClass(), "fromScheduleId", term111148);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdateDate", argTypes, term110854, args);
    }

};


