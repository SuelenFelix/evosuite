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

public class AirdropStatus_AirdropStatusBuilder_minBalance_41885439419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term508664;

    public AirdropStatus_AirdropStatusBuilder_minBalance_41885439419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term508665 = new ArrayList();
        Long term508669 = new Long(7099191052876902273L);
        Class<? extends Object> term508934 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term508933 = ((Class) term508934).getDeclaredField((String) "ANNUALLY");
        ((Field) term508933).setAccessible(true);
        Object enum958 = ((Field) term508933).get((Object) null);
        Class<? extends Object> term509330 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term509329 = ((Class) term509330).getDeclaredField((String) "POPULATING_ADDRESSES");
        ((Field) term509329).setAccessible(true);
        Object enum959 = ((Field) term509329).get((Object) null);
        Integer term508777 = new Integer(2058711405);
        Class<? extends Object> term509832 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term509831 = ((Class) term509832).getDeclaredField((String) "GLOBALID");
        ((Field) term509831).setAccessible(true);
        Object enum960 = ((Field) term509831).get((Object) null);
        Long term508827 = new Long(4098126979899957789L);
        Long term508841 = new Long(1429711781003863063L);
        Class<? extends Object> term510243 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term510242 = ((Class) term510243).getDeclaredField((String) "PROPORTIONAL");
        ((Field) term510242).setAccessible(true);
        Object enum961 = ((Field) term510242).get((Object) null);
        Class<? extends Object> term510681 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term510680 = ((Class) term510681).getDeclaredField((String) "COMPLETE");
        ((Field) term510680).setAccessible(true);
        Object enum962 = ((Field) term510680).get((Object) null);
        Long term508919 = new Long(-1033267581061931547L);
        term508664 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder"));
        Object term508671 = newInstance(Class.forName("java.util.Date"));
        Object term508673 = newInstance(Class.forName("java.util.Date"));
        Object term508675 = newInstance(Class.forName("java.util.Date"));
        Object term508677 = newInstance(Class.forName("java.util.Date"));
        setField(term508664, term508664.getClass(), "results", term508665);
        setField(term508664, term508664.getClass(), "id", term508669);
        setLongField(term508671, term508671.getClass(), "fastTime", 1416233186185L);
        setField(term508671, term508671.getClass(), "cdate", null);
        setField(term508664, term508664.getClass(), "createDate", term508671);
        setLongField(term508673, term508673.getClass(), "fastTime", 1474702651084L);
        setField(term508673, term508673.getClass(), "cdate", null);
        setField(term508664, term508664.getClass(), "updateDate", term508673);
        setLongField(term508675, term508675.getClass(), "fastTime", 1589988775235L);
        setField(term508675, term508675.getClass(), "cdate", null);
        setField(term508664, term508664.getClass(), "startTime", term508675);
        setLongField(term508677, term508677.getClass(), "fastTime", 1575315232662L);
        setField(term508677, term508677.getClass(), "cdate", null);
        setField(term508664, term508664.getClass(), "repeatUntilDate", term508677);
        setField(term508664, term508664.getClass(), "frequency", enum958);
        setField(term508664, term508664.getClass(), "status", enum959);
        setField(term508664, term508664.getClass(), "fromClassicAddress", "QwHuOwnkhN");
        setField(term508664, term508664.getClass(), "trustlineIssuerClassicAddress", "VPnzlRjkwv");
        setField(term508664, term508664.getClass(), "currencyName", "kGHPIwWRWu");
        setField(term508664, term508664.getClass(), "currencyNameForProcess", "IJsNSqAFmS");
        setField(term508664, term508664.getClass(), "amount", "RpuVDFROhs");
        setBooleanField(term508664, term508664.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term508664, term508664.getClass(), "useBlacklist", false);
        setField(term508664, term508664.getClass(), "maximumTrustlines", term508777);
        setField(term508664, term508664.getClass(), "dropType", enum960);
        setField(term508664, term508664.getClass(), "failReason", "quAdPAVxpb");
        setField(term508664, term508664.getClass(), "minBalance", "SHPiFSZxaM");
        setField(term508664, term508664.getClass(), "maxBalance", "MGNQzfluos");
        setField(term508664, term508664.getClass(), "totalBlacklisted", term508827);
        setField(term508664, term508664.getClass(), "maxXrpFeePerTransaction", "bEqBGVftHS");
        setField(term508664, term508664.getClass(), "totalRecipients", term508841);
        setField(term508664, term508664.getClass(), "paymentType", enum961);
        setField(term508664, term508664.getClass(), "snapshotTrustlineIssuerClassicAddress", "TeNUwFQFbf");
        setField(term508664, term508664.getClass(), "snapshotCurrencyName", "AxcRekxBDy");
        setField(term508664, term508664.getClass(), "nftIssuingAddress", "PJgWnydUjb");
        setField(term508664, term508664.getClass(), "nftTaxon", "JLLHHjJqxd");
        setField(term508664, term508664.getClass(), "scheduleStatus", enum962);
        setField(term508664, term508664.getClass(), "fromScheduleId", term508919);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xLCbBvSbQG";
        callMethod(klass, "minBalance", argTypes, term508664, args);
    }

};


