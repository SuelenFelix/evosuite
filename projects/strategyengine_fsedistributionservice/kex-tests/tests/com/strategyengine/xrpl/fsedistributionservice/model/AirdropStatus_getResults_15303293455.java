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

public class AirdropStatus_getResults_15303293455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102288;

    public AirdropStatus_getResults_15303293455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term102289 = new ArrayList();
        Long term102293 = new Long(6248239231585852341L);
        Class<? extends Object> term102545 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term102544 = ((Class) term102545).getDeclaredField((String) "DAILY");
        ((Field) term102544).setAccessible(true);
        Object enum183 = ((Field) term102544).get((Object) null);
        Class<? extends Object> term102932 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term102931 = ((Class) term102932).getDeclaredField((String) "PENDING_REVIEW");
        ((Field) term102931).setAccessible(true);
        Object enum184 = ((Field) term102931).get((Object) null);
        Integer term102392 = new Integer(941650513);
        Class<? extends Object> term103416 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term103415 = ((Class) term103416).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term103415).setAccessible(true);
        Object enum185 = ((Field) term103415).get((Object) null);
        Long term102460 = new Long(-88538481937688851L);
        Long term102474 = new Long(4069264186851023313L);
        Class<? extends Object> term103881 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term103880 = ((Class) term103881).getDeclaredField((String) "FLAT");
        ((Field) term103880).setAccessible(true);
        Object enum186 = ((Field) term103880).get((Object) null);
        Class<? extends Object> term104295 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term104294 = ((Class) term104295).getDeclaredField((String) "ACTIVE");
        ((Field) term104294).setAccessible(true);
        Object enum187 = ((Field) term104294).get((Object) null);
        Long term102542 = new Long(5184635470881147510L);
        term102288 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term102295 = newInstance(Class.forName("java.util.Date"));
        Object term102297 = newInstance(Class.forName("java.util.Date"));
        Object term102299 = newInstance(Class.forName("java.util.Date"));
        Object term102301 = newInstance(Class.forName("java.util.Date"));
        setField(term102288, term102288.getClass(), "results", term102289);
        setField(term102288, term102288.getClass(), "id", term102293);
        setLongField(term102295, term102295.getClass(), "fastTime", 1714093306769L);
        setField(term102295, term102295.getClass(), "cdate", null);
        setField(term102288, term102288.getClass(), "createDate", term102295);
        setLongField(term102297, term102297.getClass(), "fastTime", 1792469628390L);
        setField(term102297, term102297.getClass(), "cdate", null);
        setField(term102288, term102288.getClass(), "updateDate", term102297);
        setLongField(term102299, term102299.getClass(), "fastTime", 1268276869683L);
        setField(term102299, term102299.getClass(), "cdate", null);
        setField(term102288, term102288.getClass(), "startTime", term102299);
        setLongField(term102301, term102301.getClass(), "fastTime", 1389375796032L);
        setField(term102301, term102301.getClass(), "cdate", null);
        setField(term102288, term102288.getClass(), "repeatUntilDate", term102301);
        setField(term102288, term102288.getClass(), "frequency", enum183);
        setField(term102288, term102288.getClass(), "status", enum184);
        setField(term102288, term102288.getClass(), "fromClassicAddress", "fAsiOEKVaH");
        setField(term102288, term102288.getClass(), "trustlineIssuerClassicAddress", "EltrILhEwT");
        setField(term102288, term102288.getClass(), "currencyName", "wCcSeUJzhg");
        setField(term102288, term102288.getClass(), "currencyNameForProcess", "HlVHAsOBmJ");
        setField(term102288, term102288.getClass(), "amount", "nyThJEXHhd");
        setBooleanField(term102288, term102288.getClass(), "newTrustlinesOnly", true);
        setBooleanField(term102288, term102288.getClass(), "useBlacklist", true);
        setField(term102288, term102288.getClass(), "maximumTrustlines", term102392);
        setField(term102288, term102288.getClass(), "dropType", enum185);
        setField(term102288, term102288.getClass(), "failReason", "TRfRRMMCZw");
        setField(term102288, term102288.getClass(), "minBalance", "rwbfUcOMVc");
        setField(term102288, term102288.getClass(), "maxBalance", "ljTkNgJRUl");
        setField(term102288, term102288.getClass(), "totalBlacklisted", term102460);
        setField(term102288, term102288.getClass(), "maxXrpFeePerTransaction", "siRXAywvyp");
        setField(term102288, term102288.getClass(), "totalRecipients", term102474);
        setField(term102288, term102288.getClass(), "paymentType", enum186);
        setField(term102288, term102288.getClass(), "snapshotTrustlineIssuerClassicAddress", "ZRLaReQeFg");
        setField(term102288, term102288.getClass(), "snapshotCurrencyName", "cOcXspUxKR");
        setField(term102288, term102288.getClass(), "nftIssuingAddress", "JNzgWUmqtl");
        setField(term102288, term102288.getClass(), "nftTaxon", "UxVfWaXiSr");
        setField(term102288, term102288.getClass(), "scheduleStatus", enum187);
        setField(term102288, term102288.getClass(), "fromScheduleId", term102542);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResults", argTypes, term102288, args);
    }

};


