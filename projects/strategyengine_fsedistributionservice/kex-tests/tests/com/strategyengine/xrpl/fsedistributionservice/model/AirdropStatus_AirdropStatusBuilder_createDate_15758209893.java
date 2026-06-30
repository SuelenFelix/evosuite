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

public class AirdropStatus_AirdropStatusBuilder_createDate_15758209893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term454545;
     Object term454786;

    public AirdropStatus_AirdropStatusBuilder_createDate_15758209893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term454546 = new ArrayList();
        Long term454550 = new Long(2505442540861032970L);
        Class<? extends Object> term454789 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term454788 = ((Class) term454789).getDeclaredField((String) "DAILY");
        ((Field) term454788).setAccessible(true);
        Object enum842 = ((Field) term454788).get((Object) null);
        Class<? extends Object> term455176 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term455175 = ((Class) term455176).getDeclaredField((String) "REJECTED");
        ((Field) term455175).setAccessible(true);
        Object enum843 = ((Field) term455175).get((Object) null);
        Integer term454643 = new Integer(252575029);
        Class<? extends Object> term455642 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term455641 = ((Class) term455642).getDeclaredField((String) "SPECIFICADDRESSES");
        ((Field) term455641).setAccessible(true);
        Object enum844 = ((Field) term455641).get((Object) null);
        Long term454702 = new Long(-4215965963361389968L);
        Long term454716 = new Long(2070286321904569703L);
        Class<? extends Object> term456080 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term456079 = ((Class) term456080).getDeclaredField((String) "FLAT");
        ((Field) term456079).setAccessible(true);
        Object enum845 = ((Field) term456079).get((Object) null);
        Class<? extends Object> term456494 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term456493 = ((Class) term456494).getDeclaredField((String) "ACTIVE");
        ((Field) term456493).setAccessible(true);
        Object enum846 = ((Field) term456493).get((Object) null);
        Long term454784 = new Long(-3945232339387324807L);
        term454545 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder"));
        Object term454552 = newInstance(Class.forName("java.util.Date"));
        Object term454554 = newInstance(Class.forName("java.util.Date"));
        Object term454556 = newInstance(Class.forName("java.util.Date"));
        Object term454558 = newInstance(Class.forName("java.util.Date"));
        setField(term454545, term454545.getClass(), "results", term454546);
        setField(term454545, term454545.getClass(), "id", term454550);
        setLongField(term454552, term454552.getClass(), "fastTime", 1542958882348L);
        setField(term454552, term454552.getClass(), "cdate", null);
        setField(term454545, term454545.getClass(), "createDate", term454552);
        setLongField(term454554, term454554.getClass(), "fastTime", 1423652011739L);
        setField(term454554, term454554.getClass(), "cdate", null);
        setField(term454545, term454545.getClass(), "updateDate", term454554);
        setLongField(term454556, term454556.getClass(), "fastTime", 1478571606433L);
        setField(term454556, term454556.getClass(), "cdate", null);
        setField(term454545, term454545.getClass(), "startTime", term454556);
        setLongField(term454558, term454558.getClass(), "fastTime", 1435708413009L);
        setField(term454558, term454558.getClass(), "cdate", null);
        setField(term454545, term454545.getClass(), "repeatUntilDate", term454558);
        setField(term454545, term454545.getClass(), "frequency", enum842);
        setField(term454545, term454545.getClass(), "status", enum843);
        setField(term454545, term454545.getClass(), "fromClassicAddress", "LIOTUNOVds");
        setField(term454545, term454545.getClass(), "trustlineIssuerClassicAddress", "YfPFrlDgAP");
        setField(term454545, term454545.getClass(), "currencyName", "NTlzrMTFhB");
        setField(term454545, term454545.getClass(), "currencyNameForProcess", "yTZpTnBddt");
        setField(term454545, term454545.getClass(), "amount", "MZpJiKRbDf");
        setBooleanField(term454545, term454545.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term454545, term454545.getClass(), "useBlacklist", false);
        setField(term454545, term454545.getClass(), "maximumTrustlines", term454643);
        setField(term454545, term454545.getClass(), "dropType", enum844);
        setField(term454545, term454545.getClass(), "failReason", "pzowNkfzax");
        setField(term454545, term454545.getClass(), "minBalance", "pHIiFQwtzh");
        setField(term454545, term454545.getClass(), "maxBalance", "IpeAMdfzEl");
        setField(term454545, term454545.getClass(), "totalBlacklisted", term454702);
        setField(term454545, term454545.getClass(), "maxXrpFeePerTransaction", "czwByajnQU");
        setField(term454545, term454545.getClass(), "totalRecipients", term454716);
        setField(term454545, term454545.getClass(), "paymentType", enum845);
        setField(term454545, term454545.getClass(), "snapshotTrustlineIssuerClassicAddress", "dktEAADiuk");
        setField(term454545, term454545.getClass(), "snapshotCurrencyName", "KzSkjXMULH");
        setField(term454545, term454545.getClass(), "nftIssuingAddress", "zAtXWhPRak");
        setField(term454545, term454545.getClass(), "nftTaxon", "KioasZeahx");
        setField(term454545, term454545.getClass(), "scheduleStatus", enum846);
        setField(term454545, term454545.getClass(), "fromScheduleId", term454784);
        term454786 = newInstance(Class.forName("java.util.Date"));
        setLongField(term454786, term454786.getClass(), "fastTime", 1839653439625L);
        setField(term454786, term454786.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus$AirdropStatusBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term454786;
        callMethod(klass, "createDate", argTypes, term454545, args);
    }

};


