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

public class AirdropStatus_setDropType_166535456253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261865;
     Object enum532;

    public AirdropStatus_setDropType_166535456253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term261869 = new Long(353705949229610067L);
        Class<? extends Object> term262175 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term262174 = ((Class) term262175).getDeclaredField((String) "FAILED");
        ((Field) term262174).setAccessible(true);
        Object enum524 = ((Field) term262174).get((Object) null);
        Object term261868 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term261868, term261868.getClass(), "id", term261869);
        setField(term261868, term261868.getClass(), "responseCode", "");
        setField(term261868, term261868.getClass(), "reason", "");
        setField(term261868, term261868.getClass(), "classicAddress", "");
        setField(term261868, term261868.getClass(), "status", enum524);
        setField(term261868, term261868.getClass(), "paymentAmount", "");
        setField(term261868, term261868.getClass(), "snapshotBalance", "");
        setField(term261868, term261868.getClass(), "nftOwned", "");
        Long term261880 = new Long(3288572082902580031L);
        Class<? extends Object> term262595 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term262594 = ((Class) term262595).getDeclaredField((String) "FAILED");
        ((Field) term262594).setAccessible(true);
        Object enum525 = ((Field) term262594).get((Object) null);
        Object term261879 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term261879, term261879.getClass(), "id", term261880);
        setField(term261879, term261879.getClass(), "responseCode", "");
        setField(term261879, term261879.getClass(), "reason", "");
        setField(term261879, term261879.getClass(), "classicAddress", "");
        setField(term261879, term261879.getClass(), "status", enum525);
        setField(term261879, term261879.getClass(), "paymentAmount", "");
        setField(term261879, term261879.getClass(), "snapshotBalance", "");
        setField(term261879, term261879.getClass(), "nftOwned", "");
        Long term261891 = new Long(-8698230272673009418L);
        Class<? extends Object> term263015 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term263014 = ((Class) term263015).getDeclaredField((String) "FAILED");
        ((Field) term263014).setAccessible(true);
        Object enum526 = ((Field) term263014).get((Object) null);
        Object term261890 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term261890, term261890.getClass(), "id", term261891);
        setField(term261890, term261890.getClass(), "responseCode", "");
        setField(term261890, term261890.getClass(), "reason", "");
        setField(term261890, term261890.getClass(), "classicAddress", "");
        setField(term261890, term261890.getClass(), "status", enum526);
        setField(term261890, term261890.getClass(), "paymentAmount", "");
        setField(term261890, term261890.getClass(), "snapshotBalance", "");
        setField(term261890, term261890.getClass(), "nftOwned", "");
        ArrayList term261866 = new ArrayList();
        ((ArrayList) term261866).add(term261868);
        ((ArrayList) term261866).add(term261879);
        ((ArrayList) term261866).add(term261890);
        Long term261903 = new Long(-8792567429538693571L);
        Class<? extends Object> term263435 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term263434 = ((Class) term263435).getDeclaredField((String) "MONTHLY");
        ((Field) term263434).setAccessible(true);
        Object enum527 = ((Field) term263434).get((Object) null);
        Class<? extends Object> term263828 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term263827 = ((Class) term263828).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term263827).setAccessible(true);
        Object enum528 = ((Field) term263827).get((Object) null);
        Integer term262001 = new Integer(-1565502840);
        Class<? extends Object> term264303 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term264302 = ((Class) term264303).getDeclaredField((String) "TRUSTLINE");
        ((Field) term264302).setAccessible(true);
        Object enum529 = ((Field) term264302).get((Object) null);
        Long term262052 = new Long(3810487266967550400L);
        Long term262066 = new Long(8965244485590834147L);
        Class<? extends Object> term264717 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term264716 = ((Class) term264717).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term264716).setAccessible(true);
        Object enum530 = ((Field) term264716).get((Object) null);
        Class<? extends Object> term265155 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term265154 = ((Class) term265155).getDeclaredField((String) "ACTIVE");
        ((Field) term265154).setAccessible(true);
        Object enum531 = ((Field) term265154).get((Object) null);
        Long term262142 = new Long(-4825509285016265943L);
        term261865 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term261905 = newInstance(Class.forName("java.util.Date"));
        Object term261907 = newInstance(Class.forName("java.util.Date"));
        Object term261909 = newInstance(Class.forName("java.util.Date"));
        Object term261911 = newInstance(Class.forName("java.util.Date"));
        setField(term261865, term261865.getClass(), "results", term261866);
        setField(term261865, term261865.getClass(), "id", term261903);
        setLongField(term261905, term261905.getClass(), "fastTime", 1554077124928L);
        setField(term261905, term261905.getClass(), "cdate", null);
        setField(term261865, term261865.getClass(), "createDate", term261905);
        setLongField(term261907, term261907.getClass(), "fastTime", 1671432970086L);
        setField(term261907, term261907.getClass(), "cdate", null);
        setField(term261865, term261865.getClass(), "updateDate", term261907);
        setLongField(term261909, term261909.getClass(), "fastTime", 1461402009094L);
        setField(term261909, term261909.getClass(), "cdate", null);
        setField(term261865, term261865.getClass(), "startTime", term261909);
        setLongField(term261911, term261911.getClass(), "fastTime", 1275003265423L);
        setField(term261911, term261911.getClass(), "cdate", null);
        setField(term261865, term261865.getClass(), "repeatUntilDate", term261911);
        setField(term261865, term261865.getClass(), "frequency", enum527);
        setField(term261865, term261865.getClass(), "status", enum528);
        setField(term261865, term261865.getClass(), "fromClassicAddress", "YAFTYAtere");
        setField(term261865, term261865.getClass(), "trustlineIssuerClassicAddress", "EYQnrjiZfX");
        setField(term261865, term261865.getClass(), "currencyName", "xydFPTvtMs");
        setField(term261865, term261865.getClass(), "currencyNameForProcess", "lopARHjeMT");
        setField(term261865, term261865.getClass(), "amount", "wizysRLgRr");
        setBooleanField(term261865, term261865.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term261865, term261865.getClass(), "useBlacklist", true);
        setField(term261865, term261865.getClass(), "maximumTrustlines", term262001);
        setField(term261865, term261865.getClass(), "dropType", enum529);
        setField(term261865, term261865.getClass(), "failReason", "VbDDltcmiT");
        setField(term261865, term261865.getClass(), "minBalance", "VWIEojCQCj");
        setField(term261865, term261865.getClass(), "maxBalance", "jbeRMWjQTQ");
        setField(term261865, term261865.getClass(), "totalBlacklisted", term262052);
        setField(term261865, term261865.getClass(), "maxXrpFeePerTransaction", "YOjmohMpFb");
        setField(term261865, term261865.getClass(), "totalRecipients", term262066);
        setField(term261865, term261865.getClass(), "paymentType", enum530);
        setField(term261865, term261865.getClass(), "snapshotTrustlineIssuerClassicAddress", "WCRWOgfbRC");
        setField(term261865, term261865.getClass(), "snapshotCurrencyName", "MeiYkUfwEV");
        setField(term261865, term261865.getClass(), "nftIssuingAddress", "YOelMtNboh");
        setField(term261865, term261865.getClass(), "nftTaxon", "ngShbLrxUt");
        setField(term261865, term261865.getClass(), "scheduleStatus", enum531);
        setField(term261865, term261865.getClass(), "fromScheduleId", term262142);
        Class<? extends Object> term265570 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term265569 = ((Class) term265570).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term265569).setAccessible(true);
        enum532 = ((Field) term265569).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Object[] args = new Object[1];
        args[0] = enum532;
        callMethod(klass, "setDropType", argTypes, term261865, args);
    }

};


