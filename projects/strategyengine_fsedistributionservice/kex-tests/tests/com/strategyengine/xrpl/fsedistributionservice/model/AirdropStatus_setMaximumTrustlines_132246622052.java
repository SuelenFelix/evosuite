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

public class AirdropStatus_setMaximumTrustlines_132246622052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259506;
     Object term259746;

    public AirdropStatus_setMaximumTrustlines_132246622052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term259507 = new ArrayList();
        Long term259511 = new Long(-8172564209423941839L);
        Class<? extends Object> term259749 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term259748 = ((Class) term259749).getDeclaredField((String) "ANNUALLY");
        ((Field) term259748).setAccessible(true);
        Object enum519 = ((Field) term259748).get((Object) null);
        Class<? extends Object> term260145 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term260144 = ((Class) term260145).getDeclaredField((String) "IN_PROGRESS");
        ((Field) term260144).setAccessible(true);
        Object enum520 = ((Field) term260144).get((Object) null);
        Integer term259610 = new Integer(-1222006000);
        Class<? extends Object> term260620 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term260619 = ((Class) term260620).getDeclaredField((String) "GLOBALID");
        ((Field) term260619).setAccessible(true);
        Object enum521 = ((Field) term260619).get((Object) null);
        Long term259660 = new Long(-4561371668792438386L);
        Long term259674 = new Long(7065003857377879971L);
        Class<? extends Object> term261031 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term261030 = ((Class) term261031).getDeclaredField((String) "FLAT");
        ((Field) term261030).setAccessible(true);
        Object enum522 = ((Field) term261030).get((Object) null);
        Class<? extends Object> term261445 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term261444 = ((Class) term261445).getDeclaredField((String) "COMPLETE");
        ((Field) term261444).setAccessible(true);
        Object enum523 = ((Field) term261444).get((Object) null);
        Long term259744 = new Long(2243864141567980599L);
        term259506 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term259513 = newInstance(Class.forName("java.util.Date"));
        Object term259515 = newInstance(Class.forName("java.util.Date"));
        Object term259517 = newInstance(Class.forName("java.util.Date"));
        Object term259519 = newInstance(Class.forName("java.util.Date"));
        setField(term259506, term259506.getClass(), "results", term259507);
        setField(term259506, term259506.getClass(), "id", term259511);
        setLongField(term259513, term259513.getClass(), "fastTime", 1295507290264L);
        setField(term259513, term259513.getClass(), "cdate", null);
        setField(term259506, term259506.getClass(), "createDate", term259513);
        setLongField(term259515, term259515.getClass(), "fastTime", 1264970530177L);
        setField(term259515, term259515.getClass(), "cdate", null);
        setField(term259506, term259506.getClass(), "updateDate", term259515);
        setLongField(term259517, term259517.getClass(), "fastTime", 1837109632276L);
        setField(term259517, term259517.getClass(), "cdate", null);
        setField(term259506, term259506.getClass(), "startTime", term259517);
        setLongField(term259519, term259519.getClass(), "fastTime", 1403113866541L);
        setField(term259519, term259519.getClass(), "cdate", null);
        setField(term259506, term259506.getClass(), "repeatUntilDate", term259519);
        setField(term259506, term259506.getClass(), "frequency", enum519);
        setField(term259506, term259506.getClass(), "status", enum520);
        setField(term259506, term259506.getClass(), "fromClassicAddress", "cFNqeNRwhB");
        setField(term259506, term259506.getClass(), "trustlineIssuerClassicAddress", "TQJASDuFUN");
        setField(term259506, term259506.getClass(), "currencyName", "mOILNTkENv");
        setField(term259506, term259506.getClass(), "currencyNameForProcess", "xgjvpKAqFv");
        setField(term259506, term259506.getClass(), "amount", "RspkCWCAFM");
        setBooleanField(term259506, term259506.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term259506, term259506.getClass(), "useBlacklist", false);
        setField(term259506, term259506.getClass(), "maximumTrustlines", term259610);
        setField(term259506, term259506.getClass(), "dropType", enum521);
        setField(term259506, term259506.getClass(), "failReason", "zAkmDkobmH");
        setField(term259506, term259506.getClass(), "minBalance", "FASdrZqBfN");
        setField(term259506, term259506.getClass(), "maxBalance", "YNwqJgOcWq");
        setField(term259506, term259506.getClass(), "totalBlacklisted", term259660);
        setField(term259506, term259506.getClass(), "maxXrpFeePerTransaction", "tUcoJjDoJV");
        setField(term259506, term259506.getClass(), "totalRecipients", term259674);
        setField(term259506, term259506.getClass(), "paymentType", enum522);
        setField(term259506, term259506.getClass(), "snapshotTrustlineIssuerClassicAddress", "ICNsClDoAn");
        setField(term259506, term259506.getClass(), "snapshotCurrencyName", "LACfLkaJjq");
        setField(term259506, term259506.getClass(), "nftIssuingAddress", "OhYEjeUQkK");
        setField(term259506, term259506.getClass(), "nftTaxon", "rgZeldfAMO");
        setField(term259506, term259506.getClass(), "scheduleStatus", enum523);
        setField(term259506, term259506.getClass(), "fromScheduleId", term259744);
        term259746 = new Integer(2095798786);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Integer");
        Object[] args = new Object[1];
        args[0] = term259746;
        callMethod(klass, "setMaximumTrustlines", argTypes, term259506, args);
    }

};


