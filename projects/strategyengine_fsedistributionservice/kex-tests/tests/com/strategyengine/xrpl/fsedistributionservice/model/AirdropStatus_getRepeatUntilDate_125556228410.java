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

public class AirdropStatus_getRepeatUntilDate_125556228410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118685;

    public AirdropStatus_getRepeatUntilDate_125556228410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term118689 = new Long(-6985556670871089725L);
        Class<? extends Object> term118996 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term118995 = ((Class) term118996).getDeclaredField((String) "FAILED");
        ((Field) term118995).setAccessible(true);
        Object enum218 = ((Field) term118995).get((Object) null);
        Object term118688 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term118688, term118688.getClass(), "id", term118689);
        setField(term118688, term118688.getClass(), "responseCode", "");
        setField(term118688, term118688.getClass(), "reason", "");
        setField(term118688, term118688.getClass(), "classicAddress", "");
        setField(term118688, term118688.getClass(), "status", enum218);
        setField(term118688, term118688.getClass(), "paymentAmount", "");
        setField(term118688, term118688.getClass(), "snapshotBalance", "");
        setField(term118688, term118688.getClass(), "nftOwned", "");
        Long term118700 = new Long(-8469818909085103606L);
        Object term118699 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term118699, term118699.getClass(), "id", term118700);
        setField(term118699, term118699.getClass(), "responseCode", "");
        setField(term118699, term118699.getClass(), "reason", "");
        setField(term118699, term118699.getClass(), "classicAddress", "");
        setField(term118699, term118699.getClass(), "status", enum218);
        setField(term118699, term118699.getClass(), "paymentAmount", "");
        setField(term118699, term118699.getClass(), "snapshotBalance", "");
        setField(term118699, term118699.getClass(), "nftOwned", "");
        Long term118709 = new Long(11315815278355083L);
        Class<? extends Object> term119416 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term119415 = ((Class) term119416).getDeclaredField((String) "QUEUED");
        ((Field) term119415).setAccessible(true);
        Object enum219 = ((Field) term119415).get((Object) null);
        Object term118708 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term118708, term118708.getClass(), "id", term118709);
        setField(term118708, term118708.getClass(), "responseCode", "");
        setField(term118708, term118708.getClass(), "reason", "");
        setField(term118708, term118708.getClass(), "classicAddress", "");
        setField(term118708, term118708.getClass(), "status", enum219);
        setField(term118708, term118708.getClass(), "paymentAmount", "");
        setField(term118708, term118708.getClass(), "snapshotBalance", "");
        setField(term118708, term118708.getClass(), "nftOwned", "");
        Long term118720 = new Long(7735460540091431012L);
        Object term118719 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term118719, term118719.getClass(), "id", term118720);
        setField(term118719, term118719.getClass(), "responseCode", "");
        setField(term118719, term118719.getClass(), "reason", "");
        setField(term118719, term118719.getClass(), "classicAddress", "");
        setField(term118719, term118719.getClass(), "status", enum218);
        setField(term118719, term118719.getClass(), "paymentAmount", "");
        setField(term118719, term118719.getClass(), "snapshotBalance", "");
        setField(term118719, term118719.getClass(), "nftOwned", "");
        Long term118729 = new Long(1346299551708610248L);
        Class<? extends Object> term119836 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRecipientStatus");
        Field term119835 = ((Class) term119836).getDeclaredField((String) "QUEUED");
        ((Field) term119835).setAccessible(true);
        Object enum220 = ((Field) term119835).get((Object) null);
        Object term118728 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term118728, term118728.getClass(), "id", term118729);
        setField(term118728, term118728.getClass(), "responseCode", "");
        setField(term118728, term118728.getClass(), "reason", "");
        setField(term118728, term118728.getClass(), "classicAddress", "");
        setField(term118728, term118728.getClass(), "status", enum220);
        setField(term118728, term118728.getClass(), "paymentAmount", "");
        setField(term118728, term118728.getClass(), "snapshotBalance", "");
        setField(term118728, term118728.getClass(), "nftOwned", "");
        Long term118740 = new Long(-7191625829563442696L);
        Object term118739 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.FsePaymentResult"));
        setField(term118739, term118739.getClass(), "id", term118740);
        setField(term118739, term118739.getClass(), "responseCode", "");
        setField(term118739, term118739.getClass(), "reason", "");
        setField(term118739, term118739.getClass(), "classicAddress", "");
        setField(term118739, term118739.getClass(), "status", enum220);
        setField(term118739, term118739.getClass(), "paymentAmount", "");
        setField(term118739, term118739.getClass(), "snapshotBalance", "");
        setField(term118739, term118739.getClass(), "nftOwned", "");
        ArrayList term118686 = new ArrayList();
        ((ArrayList) term118686).add(term118688);
        ((ArrayList) term118686).add(term118699);
        ((ArrayList) term118686).add(term118708);
        ((ArrayList) term118686).add(term118719);
        ((ArrayList) term118686).add(term118728);
        ((ArrayList) term118686).add(term118739);
        Long term118750 = new Long(1463379874413441830L);
        Class<? extends Object> term120256 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropFrequency");
        Field term120255 = ((Class) term120256).getDeclaredField((String) "DAILY");
        ((Field) term120255).setAccessible(true);
        Object enum221 = ((Field) term120255).get((Object) null);
        Class<? extends Object> term120643 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropRequestStatus");
        Field term120642 = ((Class) term120643).getDeclaredField((String) "COMPLETE");
        ((Field) term120642).setAccessible(true);
        Object enum222 = ((Field) term120642).get((Object) null);
        Integer term118843 = new Integer(304775596);
        Class<? extends Object> term121109 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropType");
        Field term121108 = ((Class) term121109).getDeclaredField((String) "GLOBALID_SPECIFICADDRESSES");
        ((Field) term121108).setAccessible(true);
        Object enum223 = ((Field) term121108).get((Object) null);
        Long term118911 = new Long(7998051124369147543L);
        Long term118925 = new Long(-1481367303699139651L);
        Class<? extends Object> term121574 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.PaymentType");
        Field term121573 = ((Class) term121574).getDeclaredField((String) "FLAT");
        ((Field) term121573).setAccessible(true);
        Object enum224 = ((Field) term121573).get((Object) null);
        Class<? extends Object> term121988 = Class.forName((String) "com.strategyengine.xrpl.fsedistributionservice.entity.types.DropScheduleStatus");
        Field term121987 = ((Class) term121988).getDeclaredField((String) "ACTIVE");
        ((Field) term121987).setAccessible(true);
        Object enum225 = ((Field) term121987).get((Object) null);
        Long term118993 = new Long(-7709317346333670618L);
        term118685 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus"));
        Object term118752 = newInstance(Class.forName("java.util.Date"));
        Object term118754 = newInstance(Class.forName("java.util.Date"));
        Object term118756 = newInstance(Class.forName("java.util.Date"));
        Object term118758 = newInstance(Class.forName("java.util.Date"));
        setField(term118685, term118685.getClass(), "results", term118686);
        setField(term118685, term118685.getClass(), "id", term118750);
        setLongField(term118752, term118752.getClass(), "fastTime", 1647406623363L);
        setField(term118752, term118752.getClass(), "cdate", null);
        setField(term118685, term118685.getClass(), "createDate", term118752);
        setLongField(term118754, term118754.getClass(), "fastTime", 1312384068303L);
        setField(term118754, term118754.getClass(), "cdate", null);
        setField(term118685, term118685.getClass(), "updateDate", term118754);
        setLongField(term118756, term118756.getClass(), "fastTime", 1535966665284L);
        setField(term118756, term118756.getClass(), "cdate", null);
        setField(term118685, term118685.getClass(), "startTime", term118756);
        setLongField(term118758, term118758.getClass(), "fastTime", 1842782087058L);
        setField(term118758, term118758.getClass(), "cdate", null);
        setField(term118685, term118685.getClass(), "repeatUntilDate", term118758);
        setField(term118685, term118685.getClass(), "frequency", enum221);
        setField(term118685, term118685.getClass(), "status", enum222);
        setField(term118685, term118685.getClass(), "fromClassicAddress", "ZEmNnaQFYB");
        setField(term118685, term118685.getClass(), "trustlineIssuerClassicAddress", "FNxFpCZxLW");
        setField(term118685, term118685.getClass(), "currencyName", "sXMXSCUbRu");
        setField(term118685, term118685.getClass(), "currencyNameForProcess", "iualVLfDmL");
        setField(term118685, term118685.getClass(), "amount", "bhEFtkUvDw");
        setBooleanField(term118685, term118685.getClass(), "newTrustlinesOnly", false);
        setBooleanField(term118685, term118685.getClass(), "useBlacklist", true);
        setField(term118685, term118685.getClass(), "maximumTrustlines", term118843);
        setField(term118685, term118685.getClass(), "dropType", enum223);
        setField(term118685, term118685.getClass(), "failReason", "ZmbknwMIBa");
        setField(term118685, term118685.getClass(), "minBalance", "UiRmBTpDTp");
        setField(term118685, term118685.getClass(), "maxBalance", "zQtuUgUIjK");
        setField(term118685, term118685.getClass(), "totalBlacklisted", term118911);
        setField(term118685, term118685.getClass(), "maxXrpFeePerTransaction", "VBeGRjPsPN");
        setField(term118685, term118685.getClass(), "totalRecipients", term118925);
        setField(term118685, term118685.getClass(), "paymentType", enum224);
        setField(term118685, term118685.getClass(), "snapshotTrustlineIssuerClassicAddress", "pZrAdSHQIs");
        setField(term118685, term118685.getClass(), "snapshotCurrencyName", "XTOiucaEva");
        setField(term118685, term118685.getClass(), "nftIssuingAddress", "JMekRNxFMU");
        setField(term118685, term118685.getClass(), "nftTaxon", "LBNEEquiet");
        setField(term118685, term118685.getClass(), "scheduleStatus", enum225);
        setField(term118685, term118685.getClass(), "fromScheduleId", term118993);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.AirdropStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRepeatUntilDate", argTypes, term118685, args);
    }

};


