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

public class AirdropStatus_setRepeatUntilDate_104279129042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225744;
     Object term226020;

    public AirdropStatus_setRepeatUntilDate_104279129042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term225748 = new Long(-4187265590402169996L);
        Class<? extends Object> term226023 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term226022 = ((Class) term226023).getDeclaredField((String) "SENDING");
        ((Field) term226022).setAccessible(true);
        Object enum447 = ((Field) term226022).get((Object) null);
        Object term225747 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term225747, term225747.getClass(), "id", term225748);
        setField(term225747, term225747.getClass(), "responseCode", "");
        setField(term225747, term225747.getClass(), "reason", "");
        setField(term225747, term225747.getClass(), "classicAddress", "");
        setField(term225747, term225747.getClass(), "status", enum447);
        setField(term225747, term225747.getClass(), "paymentAmount", "");
        setField(term225747, term225747.getClass(), "snapshotBalance", "");
        setField(term225747, term225747.getClass(), "nftOwned", "");
        Long term225759 = new Long(-8033044954947064558L);
        Class<? extends Object> term226446 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term226445 = ((Class) term226446).getDeclaredField((String) "QUEUED");
        ((Field) term226445).setAccessible(true);
        Object enum448 = ((Field) term226445).get((Object) null);
        Object term225758 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term225758, term225758.getClass(), "id", term225759);
        setField(term225758, term225758.getClass(), "responseCode", "");
        setField(term225758, term225758.getClass(), "reason", "");
        setField(term225758, term225758.getClass(), "classicAddress", "");
        setField(term225758, term225758.getClass(), "status", enum448);
        setField(term225758, term225758.getClass(), "paymentAmount", "");
        setField(term225758, term225758.getClass(), "snapshotBalance", "");
        setField(term225758, term225758.getClass(), "nftOwned", "");
        Long term225770 = new Long(4626639872957534248L);
        Object term225769 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term225769, term225769.getClass(), "id", term225770);
        setField(term225769, term225769.getClass(), "responseCode", "");
        setField(term225769, term225769.getClass(), "reason", "");
        setField(term225769, term225769.getClass(), "classicAddress", "");
        setField(term225769, term225769.getClass(), "status", enum447);
        setField(term225769, term225769.getClass(), "paymentAmount", "");
        setField(term225769, term225769.getClass(), "snapshotBalance", "");
        setField(term225769, term225769.getClass(), "nftOwned", "");
        ArrayList term225745 = new ArrayList();
        ((ArrayList) term225745).add(term225747);
        ((ArrayList) term225745).add(term225758);
        ((ArrayList) term225745).add(term225769);
        Long term225780 = new Long(-7062466217011408314L);
        Class<? extends Object> term226866 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term226865 = ((Class) term226866).getDeclaredField((String) "MONTHLY");
        ((Field) term226865).setAccessible(true);
        Object enum449 = ((Field) term226865).get((Object) null);
        Class<? extends Object> term227259 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term227258 = ((Class) term227259).getDeclaredField((String) "SCHEDULED");
        ((Field) term227258).setAccessible(true);
        Object enum450 = ((Field) term227258).get((Object) null);
        Integer term225876 = new Integer(-2015854073);
        Class<? extends Object> term227728 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term227727 = ((Class) term227728).getDeclaredField((String) "GLOBALID");
        ((Field) term227727).setAccessible(true);
        Object enum451 = ((Field) term227727).get((Object) null);
        Long term225926 = new Long(-5455716707538294699L);
        Long term225940 = new Long(-1889784286465977825L);
        Class<? extends Object> term228139 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term228138 = ((Class) term228139).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term228138).setAccessible(true);
        Object enum452 = ((Field) term228138).get((Object) null);
        Class<? extends Object> term228577 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term228576 = ((Class) term228577).getDeclaredField((String) "COMPLETE");
        ((Field) term228576).setAccessible(true);
        Object enum453 = ((Field) term228576).get((Object) null);
        Long term226018 = new Long(5592522907226111065L);
        term225744 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term225782 = newInstance(Class.forName("java.util.Date"));
        Object term225784 = newInstance(Class.forName("java.util.Date"));
        Object term225786 = newInstance(Class.forName("java.util.Date"));
        Object term225788 = newInstance(Class.forName("java.util.Date"));
        setField(term225744, term225744.getClass(), "results", term225745);
        setField(term225744, term225744.getClass(), "id", term225780);
        setLongField(term225782, term225782.getClass(), "fastTime", 1782903633438L);
        setField(term225782, term225782.getClass(), "cdate", null);
        setField(term225744, term225744.getClass(), "createDate", term225782);
        setLongField(term225784, term225784.getClass(), "fastTime", 1536389765110L);
        setField(term225784, term225784.getClass(), "cdate", null);
        setField(term225744, term225744.getClass(), "updateDate", term225784);
        setLongField(term225786, term225786.getClass(), "fastTime", 1462334405893L);
        setField(term225786, term225786.getClass(), "cdate", null);
        setField(term225744, term225744.getClass(), "startTime", term225786);
        setLongField(term225788, term225788.getClass(), "fastTime", 1841185970410L);
        setField(term225788, term225788.getClass(), "cdate", null);
        setField(term225744, term225744.getClass(), "repeatUntilDate", term225788);
        setField(term225744, term225744.getClass(), "frequency", enum449);
        setField(term225744, term225744.getClass(), "status", enum450);
        setField(term225744, term225744.getClass(), "fromClassicAddress", "NSPCJaizlC");
        setField(term225744, term225744.getClass(), "trustlineIssuerClassicAddress", "JoFUYaQQtF");
        setField(term225744, term225744.getClass(), "currencyName", "SAKoORlZVA");
        setField(term225744, term225744.getClass(), "currencyNameForProcess", "HhYVbmMRiN");
        setField(term225744, term225744.getClass(), "amount", "UYEVBNEKyf");
        setBooleanField(term225744, term225744.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term225744, term225744.getClass(), "useBlacklist", false);
        setField(term225744, term225744.getClass(), "maximumTrustlines", term225876);
        setField(term225744, term225744.getClass(), "dropType", enum451);
        setField(term225744, term225744.getClass(), "failReason", "EXduYtKPaE");
        setField(term225744, term225744.getClass(), "minBalance", "UVMEqArKpY");
        setField(term225744, term225744.getClass(), "maxBalance", "fLbDziHEHK");
        setField(term225744, term225744.getClass(), "totalBlacklisted", term225926);
        setField(term225744, term225744.getClass(), "maxXrpFeePerTransaction", "lzRecPiQNU");
        setField(term225744, term225744.getClass(), "totalRecipients", term225940);
        setField(term225744, term225744.getClass(), "paymentType", enum452);
        setField(term225744, term225744.getClass(), "snapshotTrustlineIssuerClassicAddress", "CVfKmjoLKq");
        setField(term225744, term225744.getClass(), "snapshotCurrencyName", "zvqciKTUAl");
        setField(term225744, term225744.getClass(), "nftIssuingAddress", "hvNiDuvOYJ");
        setField(term225744, term225744.getClass(), "nftTaxon", "unTIyPhfcW");
        setField(term225744, term225744.getClass(), "scheduleStatus", enum453);
        setField(term225744, term225744.getClass(), "fromScheduleId", term226018);
        term226020 = newInstance(Class.forName("java.util.Date"));
        setLongField(term226020, term226020.getClass(), "fastTime", 1841243746236L);
        setField(term226020, term226020.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term226020;
        callMethod(klass, "setRepeatUntilDate", argTypes, term225744, args);
    }

};


